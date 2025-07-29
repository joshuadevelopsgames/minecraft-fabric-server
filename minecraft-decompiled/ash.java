import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.List;
import java.util.Map;

public class ash {
   public static final Codec<ash> a = Codec.STRING.comapFlatMap(ash::a, $$0 -> $$0.c);
   public static final Codec<String> b = Codec.STRING
      .validate($$0 -> ih.b($$0) ? DataResult.success($$0) : DataResult.error(() -> $$0 + " is not a valid input name"));
   private final String c;
   private final ih d;

   private ash(String $$0, ih $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   private static DataResult<ash> a(String $$0) {
      ih $$1;
      try {
         $$1 = ih.a($$0);
      } catch (Exception var3) {
         return DataResult.error(() -> "Failed to parse template " + $$0 + ": " + var3.getMessage());
      }

      return DataResult.success(new ash($$0, $$1));
   }

   public String a(Map<String, String> $$0) {
      List<String> $$1 = this.d.b().stream().map($$1x -> $$0.getOrDefault($$1x, "")).toList();
      return this.d.a($$1);
   }
}
