import com.google.common.base.Strings;
import com.google.gson.JsonObject;
import com.mojang.logging.LogUtils;
import java.util.Locale;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public interface fot {
   xo a = xo.c("mco.errorMessage.noDetails");
   Logger b = LogUtils.getLogger();

   int a();

   xo b();

   String c();

   static fot a(int $$0, String $$1) {
      if ($$0 == 429) {
         return fot.b.c;
      } else if (Strings.isNullOrEmpty($$1)) {
         return fot.b.b($$0);
      } else {
         try {
            JsonObject $$2 = bbw.a($$1).getAsJsonObject();
            String $$3 = bbq.a($$2, "reason", null);
            String $$4 = bbq.a($$2, "errorMsg", null);
            int $$5 = bbq.a($$2, "errorCode", -1);
            if ($$4 != null || $$3 != null || $$5 != -1) {
               return new fot.c($$0, $$5 != -1 ? $$5 : $$0, $$3, $$4);
            }
         } catch (Exception var6) {
            b.error("Could not parse RealmsError", var6);
         }

         return new fot.d($$0, $$1);
      }
   }

   public record a(String d) implements fot {
      public static final int c = 401;

      @Override
      public int a() {
         return 401;
      }

      @Override
      public xo b() {
         return xo.b(this.d);
      }

      @Override
      public String c() {
         return String.format(Locale.ROOT, "Realms authentication error with message '%s'", this.d);
      }
   }

   public record b(int g, @Nullable xo h) implements fot {
      public static final fot.b c = new fot.b(429, xo.c("mco.errorMessage.serviceBusy"));
      public static final xo d = xo.c("mco.errorMessage.retry");
      public static final String e = "<body>";
      public static final String f = "</body>";

      public static fot.b a(String $$0) {
         return new fot.b(500, xo.a("mco.errorMessage.realmsService.unknownCompatibility", $$0));
      }

      public static fot.b d() {
         return new fot.b(500, xo.c("mco.errorMessage.realmsService.configurationError"));
      }

      public static fot.b a(fqw $$0) {
         return new fot.b(500, xo.a("mco.errorMessage.realmsService.connectivity", $$0.getMessage()));
      }

      public static fot.b a(int $$0) {
         return new fot.b($$0, d);
      }

      public static fot.b b(int $$0) {
         return new fot.b($$0, null);
      }

      public static fot.b b(int $$0, String $$1) {
         int $$2 = $$1.indexOf("<body>");
         int $$3 = $$1.indexOf("</body>");
         if ($$2 >= 0 && $$3 > $$2) {
            return new fot.b($$0, xo.b($$1.substring($$2 + "<body>".length(), $$3).trim()));
         } else {
            b.error("Got an error with an unreadable html body {}", $$1);
            return new fot.b($$0, null);
         }
      }

      @Override
      public int a() {
         return this.g;
      }

      @Override
      public xo b() {
         return this.h != null ? this.h : a;
      }

      @Override
      public String c() {
         return this.h != null
            ? String.format(Locale.ROOT, "Realms service error (%d) with message '%s'", this.g, this.h.getString())
            : String.format(Locale.ROOT, "Realms service error (%d) with no payload", this.g);
      }

      public int e() {
         return this.g;
      }

      @Nullable
      public xo f() {
         return this.h;
      }
   }

   public record c(int c, int d, @Nullable String e, @Nullable String f) implements fot {
      @Override
      public int a() {
         return this.d;
      }

      @Override
      public xo b() {
         String $$0 = "mco.errorMessage." + this.d;
         if (htb.a($$0)) {
            return xo.c($$0);
         } else {
            if (this.e != null) {
               String $$1 = "mco.errorReason." + this.e;
               if (htb.a($$1)) {
                  return xo.c($$1);
               }
            }

            return (xo)(this.f != null ? xo.b(this.f) : a);
         }
      }

      @Override
      public String c() {
         return String.format(Locale.ROOT, "Realms service error (%d/%d/%s) with message '%s'", this.c, this.d, this.e, this.f);
      }

      public int d() {
         return this.c;
      }

      public int e() {
         return this.d;
      }

      @Nullable
      public String f() {
         return this.e;
      }

      @Nullable
      public String g() {
         return this.f;
      }
   }

   public record d(int c, String d) implements fot {
      @Override
      public int a() {
         return this.c;
      }

      @Override
      public xo b() {
         return xo.b(this.d);
      }

      @Override
      public String c() {
         return String.format(Locale.ROOT, "Realms service error (%d) with raw payload '%s'", this.c, this.d);
      }

      public int d() {
         return this.c;
      }

      public String e() {
         return this.d;
      }
   }
}
