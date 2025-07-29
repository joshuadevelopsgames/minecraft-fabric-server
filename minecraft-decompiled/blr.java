import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.OpticFinder;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.datafixers.types.templates.List.ListType;
import java.util.Optional;
import java.util.Set;

public class blr extends DataFix {
   private final Set<String> a;

   public blr(Schema $$0, Set<String> $$1) {
      super($$0, true);
      this.a = $$1;
   }

   public TypeRewriteRule makeRule() {
      Type<?> $$0 = this.getInputSchema().getType(blp.u);
      OpticFinder<?> $$1 = $$0.findField("tag");
      OpticFinder<?> $$2 = $$1.type().findField("BlockEntityTag");
      Type<?> $$3 = this.getInputSchema().getType(blp.E);
      OpticFinder<?> $$4 = DSL.namedChoice("minecraft:falling_block", this.getInputSchema().getChoiceType(blp.E, "minecraft:falling_block"));
      OpticFinder<?> $$5 = $$4.type().findField("TileEntityData");
      Type<?> $$6 = this.getInputSchema().getType(blp.g);
      OpticFinder<?> $$7 = $$6.findField("blocks");
      OpticFinder<?> $$8 = DSL.typeFinder(((ListType)$$7.type()).getElement());
      OpticFinder<?> $$9 = $$8.type().findField("nbt");
      OpticFinder<String> $$10 = DSL.fieldFinder("id", bnm.a());
      return TypeRewriteRule.seq(
         this.fixTypeEverywhereTyped("ItemRemoveBlockEntityTagFix", $$0, $$3x -> $$3x.updateTyped($$1, $$2xx -> this.a($$2xx, $$2, $$10, "BlockEntityTag"))),
         new TypeRewriteRule[]{
            this.fixTypeEverywhereTyped(
               "FallingBlockEntityRemoveBlockEntityTagFix", $$3, $$3x -> $$3x.updateTyped($$4, $$2xx -> this.a($$2xx, $$5, $$10, "TileEntityData"))
            ),
            this.fixTypeEverywhereTyped(
               "StructureRemoveBlockEntityTagFix",
               $$6,
               $$4x -> $$4x.updateTyped($$7, $$3xx -> $$3xx.updateTyped($$8, $$2xxx -> this.a($$2xxx, $$9, $$10, "nbt")))
            ),
            this.convertUnchecked(
               "ItemRemoveBlockEntityTagFix - update block entity type", this.getInputSchema().getType(blp.t), this.getOutputSchema().getType(blp.t)
            )
         }
      );
   }

   private Typed<?> a(Typed<?> $$0, OpticFinder<?> $$1, OpticFinder<String> $$2, String $$3) {
      Optional<? extends Typed<?>> $$4 = $$0.getOptionalTyped($$1);
      if ($$4.isEmpty()) {
         return $$0;
      } else {
         String $$5 = $$4.get().getOptional($$2).orElse("");
         return !this.a.contains($$5) ? $$0 : ag.a($$0, $$0.getType(), $$1x -> $$1x.remove($$3));
      }
   }
}
