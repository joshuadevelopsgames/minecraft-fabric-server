import com.google.gson.JsonObject;
import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class fqr extends fqq {
   private static final Logger d = LogUtils.getLogger();
   public String a;
   public String b;
   public String c;

   public static fqr a(String $$0) {
      JsonObject $$1 = bbw.a($$0).getAsJsonObject();
      fqr $$2 = new fqr();

      try {
         $$2.a = fsq.b("downloadLink", $$1, "");
         $$2.b = fsq.b("resourcePackUrl", $$1, "");
         $$2.c = fsq.b("resourcePackHash", $$1, "");
      } catch (Exception var4) {
         d.error("Could not parse WorldDownload: {}", var4.getMessage());
      }

      return $$2;
   }
}
