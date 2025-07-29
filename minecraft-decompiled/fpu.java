import com.google.gson.JsonObject;
import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fpu extends fqq {
   private static final Logger b = LogUtils.getLogger();
   @Nullable
   public String a;

   public static fpu a(String $$0) {
      fpu $$1 = new fpu();

      try {
         JsonObject $$2 = bbw.a($$0).getAsJsonObject();
         $$1.a = fsq.b("newsLink", $$2, null);
      } catch (Exception var3) {
         b.error("Could not parse RealmsNews: {}", var3.getMessage());
      }

      return $$1;
   }
}
