import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.ints.IntSet;
import it.unimi.dsi.fastutil.ints.IntSets;
import java.util.Map;
import javax.annotation.Nullable;

public class fls implements flq {
   private final Int2ObjectMap<flp.a> b;

   public fls(Map<Integer, Float> $$0) {
      this.b = new Int2ObjectOpenHashMap($$0.size());
      $$0.forEach(($$0x, $$1) -> this.b.put($$0x, (flp.a)() -> $$1));
   }

   @Nullable
   @Override
   public flp a(int $$0) {
      return (flp)this.b.get($$0);
   }

   @Override
   public IntSet a() {
      return IntSets.unmodifiable(this.b.keySet());
   }

   public record a(Map<Integer, Float> c) implements gaz {
      public static final MapCodec<fls.a> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(Codec.unboundedMap(bbi.E, Codec.FLOAT).fieldOf("advances").forGetter(fls.a::c)).apply($$0, fls.a::new)
      );

      @Override
      public gba a() {
         return gba.c;
      }

      @Override
      public Either<gaz.b, gaz.c> b() {
         gaz.b $$0 = $$0x -> new fls(this.c);
         return Either.left($$0);
      }
   }
}
