import com.google.common.collect.ImmutableMap;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.templates.TypeTemplate;
import java.util.Map;
import java.util.function.Supplier;

public class bpl extends bnm {
   public bpl(int $$0, Schema $$1) {
      super($$0, $$1);
   }

   public void registerTypes(Schema $$0, Map<String, Supplier<TypeTemplate>> $$1, Map<String, Supplier<TypeTemplate>> $$2) {
      super.registerTypes($$0, $$1, $$2);
      $$0.registerType(
         false,
         blp.d,
         () -> DSL.fields(
            "Level",
            DSL.optionalFields(
               "Entities",
               DSL.list(blp.D.in($$0)),
               "TileEntities",
               DSL.list(DSL.or(blp.t.in($$0), DSL.remainder())),
               "TileTicks",
               DSL.list(DSL.fields("i", blp.F.in($$0))),
               "Sections",
               DSL.list(
                  DSL.optionalFields(
                     "biomes", DSL.optionalFields("palette", DSL.list(blp.N.in($$0))), "block_states", DSL.optionalFields("palette", DSL.list(blp.v.in($$0)))
                  )
               ),
               "Structures",
               DSL.optionalFields("Starts", DSL.compoundList(blp.J.in($$0)))
            )
         )
      );
      $$0.registerType(false, blp.O, () -> DSL.constType(a()));
      $$0.registerType(
         false,
         blp.P,
         () -> DSL.fields(
            "dimensions",
            DSL.compoundList(
               DSL.constType(a()),
               DSL.fields(
                  "generator",
                  DSL.taggedChoiceLazy(
                     "type",
                     DSL.string(),
                     ImmutableMap.of(
                        "minecraft:debug",
                        DSL::remainder,
                        "minecraft:flat",
                        (Supplier<TypeTemplate>)() -> DSL.optionalFields(
                           "settings", DSL.optionalFields("biome", blp.N.in($$0), "layers", DSL.list(DSL.optionalFields("block", blp.F.in($$0))))
                        ),
                        "minecraft:noise",
                        (Supplier<TypeTemplate>)() -> DSL.optionalFields(
                           "biome_source",
                           DSL.taggedChoiceLazy(
                              "type",
                              DSL.string(),
                              ImmutableMap.of(
                                 "minecraft:fixed",
                                 (Supplier<TypeTemplate>)() -> DSL.fields("biome", blp.N.in($$0)),
                                 "minecraft:multi_noise",
                                 (Supplier<TypeTemplate>)() -> DSL.or(DSL.fields("preset", blp.O.in($$0)), DSL.list(DSL.fields("biome", blp.N.in($$0)))),
                                 "minecraft:checkerboard",
                                 (Supplier<TypeTemplate>)() -> DSL.fields("biomes", DSL.list(blp.N.in($$0))),
                                 "minecraft:the_end",
                                 DSL::remainder
                              )
                           ),
                           "settings",
                           DSL.or(DSL.constType(DSL.string()), DSL.optionalFields("default_block", blp.F.in($$0), "default_fluid", blp.F.in($$0)))
                        )
                     )
                  )
               )
            )
         )
      );
   }
}
