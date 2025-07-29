import com.google.gson.annotations.SerializedName;
import com.mojang.logging.LogUtils;
import java.util.ArrayList;
import java.util.List;
import org.slf4j.Logger;

public class fpy extends fqq implements fqg {
   private static final Logger b = LogUtils.getLogger();
   @SerializedName("servers")
   public List<fpx> a = new ArrayList<>();

   public static fpy a(fpk $$0, String $$1) {
      try {
         fpy $$2 = $$0.a($$1, fpy.class);
         if ($$2 == null) {
            b.error("Could not parse McoServerList: {}", $$1);
            return new fpy();
         } else {
            $$2.a.forEach(fpx::a);
            return $$2;
         }
      } catch (Exception var3) {
         b.error("Could not parse McoServerList: {}", var3.getMessage());
         return new fpy();
      }
   }
}
