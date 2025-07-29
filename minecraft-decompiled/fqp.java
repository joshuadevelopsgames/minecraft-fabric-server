import com.google.common.annotations.VisibleForTesting;
import com.google.gson.JsonObject;
import com.mojang.logging.LogUtils;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fqp extends fqq {
   private static final Logger a = LogUtils.getLogger();
   private static final String b = "http://";
   private static final int c = 8080;
   private static final Pattern d = Pattern.compile("^[a-zA-Z][-a-zA-Z0-9+.]+:");
   private final boolean e;
   @Nullable
   private final String f;
   private final URI g;

   private fqp(boolean $$0, @Nullable String $$1, URI $$2) {
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
   }

   @Nullable
   public static fqp a(String $$0) {
      try {
         JsonObject $$1 = bbw.a($$0).getAsJsonObject();
         String $$2 = fsq.b("uploadEndpoint", $$1, null);
         if ($$2 != null) {
            int $$3 = fsq.a("port", $$1, -1);
            URI $$4 = a($$2, $$3);
            if ($$4 != null) {
               boolean $$5 = fsq.a("worldClosed", $$1, false);
               String $$6 = fsq.b("token", $$1, null);
               return new fqp($$5, $$6, $$4);
            }
         }
      } catch (Exception var7) {
         a.error("Could not parse UploadInfo: {}", var7.getMessage());
      }

      return null;
   }

   @Nullable
   @VisibleForTesting
   public static URI a(String $$0, int $$1) {
      Matcher $$2 = d.matcher($$0);
      String $$3 = a($$0, $$2);

      try {
         URI $$4 = new URI($$3);
         int $$5 = a($$1, $$4.getPort());
         return $$5 != $$4.getPort() ? new URI($$4.getScheme(), $$4.getUserInfo(), $$4.getHost(), $$5, $$4.getPath(), $$4.getQuery(), $$4.getFragment()) : $$4;
      } catch (URISyntaxException var6) {
         a.warn("Failed to parse URI {}", $$3, var6);
         return null;
      }
   }

   private static int a(int $$0, int $$1) {
      if ($$0 != -1) {
         return $$0;
      } else {
         return $$1 != -1 ? $$1 : 8080;
      }
   }

   private static String a(String $$0, Matcher $$1) {
      return $$1.find() ? $$0 : "http://" + $$0;
   }

   public static String b(@Nullable String $$0) {
      JsonObject $$1 = new JsonObject();
      if ($$0 != null) {
         $$1.addProperty("token", $$0);
      }

      return $$1.toString();
   }

   @Nullable
   public String a() {
      return this.f;
   }

   public URI b() {
      return this.g;
   }

   public boolean c() {
      return this.e;
   }
}
