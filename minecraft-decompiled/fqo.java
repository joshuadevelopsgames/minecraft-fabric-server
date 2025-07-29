import com.google.gson.JsonObject;
import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class fqo extends fqq {
   private static final Logger d = LogUtils.getLogger();
   public long a;
   public int b;
   public fqo.a c = fqo.a.a;

   public static fqo a(String $$0) {
      fqo $$1 = new fqo();

      try {
         JsonObject $$2 = bbw.a($$0).getAsJsonObject();
         $$1.a = fsq.a("startDate", $$2, 0L);
         $$1.b = fsq.a("daysLeft", $$2, 0);
         $$1.c = b(fsq.b("subscriptionType", $$2, fqo.a.a.name()));
      } catch (Exception var3) {
         d.error("Could not parse Subscription: {}", var3.getMessage());
      }

      return $$1;
   }

   private static fqo.a b(String $$0) {
      try {
         return fqo.a.valueOf($$0);
      } catch (Exception var2) {
         return fqo.a.a;
      }
   }

   public static enum a {
      a,
      b;
   }
}
