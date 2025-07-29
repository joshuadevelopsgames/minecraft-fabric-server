import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.mojang.logging.LogUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.function.Consumer;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fpv {
   static final Logger a = LogUtils.getLogger();
   private static final String b = "notificationUuid";
   private static final String c = "dismissable";
   private static final String d = "seen";
   private static final String e = "type";
   private static final String f = "visitUrl";
   private static final String g = "infoPopup";
   static final xo h = xo.c("mco.notification.visitUrl.buttonText.default");
   final UUID i;
   final boolean j;
   final boolean k;
   final String l;

   fpv(UUID $$0, boolean $$1, boolean $$2, String $$3) {
      this.i = $$0;
      this.j = $$1;
      this.k = $$2;
      this.l = $$3;
   }

   public boolean a() {
      return this.k;
   }

   public boolean b() {
      return this.j;
   }

   public UUID c() {
      return this.i;
   }

   public static List<fpv> a(String $$0) {
      List<fpv> $$1 = new ArrayList<>();

      try {
         for (JsonElement $$3 : bbw.a($$0).getAsJsonObject().get("notifications").getAsJsonArray()) {
            $$1.add(a($$3.getAsJsonObject()));
         }
      } catch (Exception var5) {
         a.error("Could not parse list of RealmsNotifications", var5);
      }

      return $$1;
   }

   private static fpv a(JsonObject $$0) {
      UUID $$1 = fsq.a("notificationUuid", $$0, null);
      if ($$1 == null) {
         throw new IllegalStateException("Missing required property notificationUuid");
      } else {
         boolean $$2 = fsq.a("dismissable", $$0, true);
         boolean $$3 = fsq.a("seen", $$0, false);
         String $$4 = fsq.a("type", $$0);
         fpv $$5 = new fpv($$1, $$2, $$3, $$4);

         return (fpv)(switch ($$4) {
            case "visitUrl" -> fpv.c.a($$5, $$0);
            case "infoPopup" -> fpv.a.a($$5, $$0);
            default -> $$5;
         });
      }
   }

   public static class a extends fpv {
      private static final String a = "title";
      private static final String b = "message";
      private static final String c = "image";
      private static final String d = "urlButton";
      private final fqd e;
      private final fqd f;
      private final ame g;
      @Nullable
      private final fpv.b h;

      private a(fpv $$0, fqd $$1, fqd $$2, ame $$3, @Nullable fpv.b $$4) {
         super($$0.i, $$0.j, $$0.k, $$0.l);
         this.e = $$1;
         this.f = $$2;
         this.g = $$3;
         this.h = $$4;
      }

      public static fpv.a a(fpv $$0, JsonObject $$1) {
         fqd $$2 = fsq.a("title", $$1, fqd::a);
         fqd $$3 = fsq.a("message", $$1, fqd::a);
         ame $$4 = ame.a(fsq.a("image", $$1));
         fpv.b $$5 = fsq.b("urlButton", $$1, fpv.b::a);
         return new fpv.a($$0, $$2, $$3, $$4, $$5);
      }

      @Nullable
      public fyr a(get $$0, Consumer<UUID> $$1) {
         xo $$2 = this.e.a();
         if ($$2 == null) {
            fpv.a.warn("Realms info popup had title with no available translation: {}", this.e);
            return null;
         } else {
            fyr.a $$3 = new fyr.a($$0, $$2).a(this.g).a(this.f.a(xn.a));
            if (this.h != null) {
               $$3.a(this.h.b.a(fpv.h), $$2x -> {
                  fue $$3x = fue.R();
                  $$3x.a(new gdq($$3xx -> {
                     if ($$3xx) {
                        ag.n().a(this.h.a);
                        $$3x.a($$0);
                     } else {
                        $$3x.a($$2x);
                     }
                  }, this.h.a, true));
                  $$1.accept(this.c());
               });
            }

            $$3.a(xn.h, $$1x -> {
               $$1x.aP_();
               $$1.accept(this.c());
            });
            $$3.a(() -> $$1.accept(this.c()));
            return $$3.a();
         }
      }
   }

   record b(String a, fqd b) {
      private static final String c = "url";
      private static final String d = "urlText";

      public static fpv.b a(JsonObject $$0) {
         String $$1 = fsq.a("url", $$0);
         fqd $$2 = fsq.a("urlText", $$0, fqd::a);
         return new fpv.b($$1, $$2);
      }
   }

   public static class c extends fpv {
      private static final String a = "url";
      private static final String b = "buttonText";
      private static final String c = "message";
      private final String d;
      private final fqd e;
      private final fqd f;

      private c(fpv $$0, String $$1, fqd $$2, fqd $$3) {
         super($$0.i, $$0.j, $$0.k, $$0.l);
         this.d = $$1;
         this.e = $$2;
         this.f = $$3;
      }

      public static fpv.c a(fpv $$0, JsonObject $$1) {
         String $$2 = fsq.a("url", $$1);
         fqd $$3 = fsq.a("buttonText", $$1, fqd::a);
         fqd $$4 = fsq.a("message", $$1, fqd::a);
         return new fpv.c($$0, $$2, $$3, $$4);
      }

      public xo d() {
         return this.f.a(xo.c("mco.notification.visitUrl.message.default"));
      }

      public fxo a(get $$0) {
         xo $$1 = this.e.a(fpv.h);
         return fxo.a($$1, gdq.b($$0, this.d)).a();
      }
   }
}
