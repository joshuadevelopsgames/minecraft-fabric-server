import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import java.util.Map;

public class bkd extends DataFix {
   public bkd(Schema $$0) {
      super($$0, false);
   }

   protected TypeRewriteRule makeRule() {
      return this.fixTypeEverywhereTyped(
         "Map id fix",
         this.getInputSchema().getType(blp.l),
         $$0 -> $$0.update(DSL.remainderFinder(), $$0x -> $$0x.createMap(Map.of($$0x.createString("data"), $$0x)))
      );
   }
}
