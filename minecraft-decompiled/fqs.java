import com.google.gson.JsonObject;
import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fqs extends fqq {
   private static final Logger j = LogUtils.getLogger();
   public String a = "";
   public String b = "";
   public String c = "";
   public String d = "";
   public String e = "";
   @Nullable
   public String f;
   public String g = "";
   public String h = "";
   public fqs.a i = fqs.a.a;

   public static fqs a(JsonObject $$0) {
      fqs $$1 = new fqs();

      try {
         $$1.a = fsq.b("id", $$0, "");
         $$1.b = fsq.b("name", $$0, "");
         $$1.c = fsq.b("version", $$0, "");
         $$1.d = fsq.b("author", $$0, "");
         $$1.e = fsq.b("link", $$0, "");
         $$1.f = fsq.b("image", $$0, null);
         $$1.g = fsq.b("trailer", $$0, "");
         $$1.h = fsq.b("recommendedPlayers", $$0, "");
         $$1.i = fqs.a.valueOf(fsq.b("type", $$0, fqs.a.a.name()));
      } catch (Exception var3) {
         j.error("Could not parse WorldTemplate: {}", var3.getMessage());
      }

      return $$1;
   }

   public static enum a {
      a,
      b,
      c,
      d,
      e;
   }
}
