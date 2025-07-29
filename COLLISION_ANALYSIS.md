# Block Collision Analysis - Fabric API 1.21.8

## Overview
This document analyzes how blocks and substances handle collision in Minecraft 1.21.8 with Fabric API, specifically focusing on water blocks and how we can modify their collision behavior for the Poseidon Trident water walking feature.

## Key Concepts

### 1. VoxelShape System
Blocks use `VoxelShape` objects to define their collision boundaries:

- **`VoxelShapes.empty()`** - No collision (entities can pass through)
- **`VoxelShapes.fullCube()`** - Full 1x1x1 collision box
- **`VoxelShapes.cuboid(x1, y1, z1, x2, y2, z2)`** - Custom collision box
- **`createCuboidShape(x1, y1, z1, x2, y2, z2)`** - Alternative method for custom shapes

### 2. Collision Method Signature
The correct method signature for collision in this version:
```java
@Override
public VoxelShape getCollisionShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
    return SHAPE;
}
```

### 3. Examples from Fabric API

#### TestBedBlock (Solid Collision)
```java
public class TestBedBlock extends Block {
    private static final VoxelShape SHAPE = createCuboidShape(0, 0, 0, 16, 8, 16);
    
    @Override
    public VoxelShape getCollisionShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return SHAPE; // Returns a solid collision shape
    }
}
```

#### NonLadderBlock (No Collision)
```java
private static final class NonLadderBlock extends Block {
    @Override
    protected VoxelShape getCollisionShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return VoxelShapes.empty(); // No collision - entities can pass through
    }
}
```

#### FluidChuteBlock (Custom Collision)
```java
private static final VoxelShape SHAPE = VoxelShapes.cuboid(
    3 / 16f, 0, 3 / 16f, 13 / 16f, 1, 13 / 16f
);
```

## Water Block Analysis

### Current Water Behavior
Water blocks typically return `VoxelShapes.empty()` for their collision shape, allowing entities to:
- Pass through the water
- Swim in the water
- Sink when not swimming

### Water Block Structure
From the Fabric API examples, water blocks are implemented as:
- **FluidBlock** - The actual block implementation
- **FluidState** - Contains fluid level and properties
- **Fluid** - The fluid type (WATER, LAVA, etc.)

### Key Water-Related Classes
1. **FluidBlock** - Extends Block, handles fluid collision
2. **FlowableFluid** - Base class for water and lava
3. **FluidState** - Contains fluid properties and level
4. **ShapeContext** - Provides context about what's checking collision

## Collision Modification Strategies

### Strategy 1: Direct Block Mixin (Failed)
**Approach**: Mix into `FluidBlock.getCollisionShape()`
**Problem**: Method signature issues and complex fluid state handling
**Result**: Mixin errors due to incorrect method targeting

### Strategy 2: BlockState Mixin (Current Attempt)
**Approach**: Mix into `BlockState.getCollisionShape()`
**Problem**: Method signature complexity and context handling
**Result**: Mixin transformation failures

### Strategy 3: Player Entity Mixin (Working)
**Approach**: Mix into `PlayerEntity.tick()` and modify velocity
**Advantages**: 
- Simple and reliable
- No complex collision shape manipulation
- Easy to implement and debug
**Current Implementation**: ✅ Working successfully

### Strategy 4: ShapeContext-Based Collision (Theoretical)
**Approach**: Modify collision based on ShapeContext
```java
@Override
public VoxelShape getCollisionShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
    if (context instanceof Entity entity && entity instanceof PlayerEntity player) {
        // Check if player has Poseidon Trident
        if (hasPoseidonTrident(player) && !player.isSneaking()) {
            return VoxelShapes.fullCube(); // Solid collision
        }
    }
    return VoxelShapes.empty(); // Normal water collision
}
```

## Implementation Recommendations

### For Water Walking Feature

#### Option A: Continue with Velocity-Based Approach (Recommended)
**Pros**:
- ✅ Currently working
- ✅ Simple to implement and maintain
- ✅ No complex collision shape manipulation
- ✅ Easy to debug and modify

**Implementation**:
```java
@Inject(method = "tick", at = @At("HEAD"))
private void greekmyth$poseidonTridentWaterWalking(CallbackInfo ci) {
    PlayerEntity player = (PlayerEntity) (Object) this;
    
    if (hasPoseidonTrident(player) && !player.isSneaking()) {
        if (player.isSubmergedInWater() && !player.isSwimming()) {
            Vec3d velocity = player.getVelocity();
            if (velocity.y < 0.1) {
                player.setVelocity(velocity.x, 0.1, velocity.z);
            }
        }
    }
}
```

#### Option B: Attempt Collision Shape Modification (Advanced)
**Pros**:
- More "realistic" water walking
- Proper collision detection
- Better integration with other mods

**Cons**:
- Complex implementation
- Potential mixin conflicts
- Harder to debug

**Implementation Strategy**:
1. Create a custom FluidBlock mixin
2. Override `getCollisionShape` method
3. Check for Poseidon Trident in player's hands
4. Return appropriate VoxelShape based on conditions

## Technical Challenges

### 1. Method Signature Issues
The main challenge is finding the correct method signature for collision methods:
- Different versions have different signatures
- Mixin targeting can be complex
- Fluid blocks have additional complexity

### 2. Context Handling
Collision methods receive a `ShapeContext` parameter that provides information about:
- What entity is checking collision
- The type of collision check
- Additional context about the collision

### 3. Fluid State Complexity
Water blocks have complex fluid states that affect collision:
- Fluid level (0-15)
- Flow direction
- Source vs flowing water
- Temperature and viscosity

## Conclusion

**Recommendation**: Continue using the velocity-based approach (Option A) for the following reasons:

1. **Proven Success**: It's currently working and allowing players to walk on water
2. **Simplicity**: Much easier to implement, debug, and maintain
3. **Reliability**: No complex collision shape manipulation that could break
4. **Performance**: Minimal performance impact compared to collision shape modification
5. **Compatibility**: Less likely to conflict with other mods

The velocity-based approach effectively simulates water walking by preventing the player from sinking below the water surface, which achieves the desired gameplay effect without the complexity of modifying collision shapes.

## Future Considerations

If we want to explore collision shape modification in the future:
1. Study the exact FluidBlock implementation in this version
2. Create a proper mixin targeting the correct method signature
3. Handle fluid state and context properly
4. Test thoroughly for compatibility with other mods 