import com.google.gson.annotations.SerializedName;
import java.util.List;

public record fqa(@SerializedName("name") String a, @SerializedName("value") String b) implements fqg {
   public static fqa a(boolean $$0) {
      return new fqa("hardcore", Boolean.toString($$0));
   }

   public static boolean a(List<fqa> $$0) {
      for (fqa $$1 : $$0) {
         if ($$1.a().equals("hardcore")) {
            return Boolean.parseBoolean($$1.b());
         }
      }

      return false;
   }
}
