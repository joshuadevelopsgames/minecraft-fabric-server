import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;

public class bih extends bkk {
   public bih(Schema $$0) {
      super($$0, false, "Remove filtered text from signs", blp.t, "minecraft:sign");
   }

   @Override
   protected <T> Dynamic<T> a(Dynamic<T> $$0) {
      return $$0.remove("FilteredText1").remove("FilteredText2").remove("FilteredText3").remove("FilteredText4");
   }
}
