import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.mojang.logging.LogUtils;
import com.mojang.util.UndashedUuid;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import java.util.Locale;
import java.util.Optional;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class foq {
   public static final foq.b a = Optional.ofNullable(System.getenv("realms.environment"))
      .or(() -> Optional.ofNullable(System.getProperty("realms.environment")))
      .flatMap(foq.b::a)
      .orElse(foq.b.a);
   private static final Logger b = LogUtils.getLogger();
   @Nullable
   private static volatile foq c = null;
   private final CompletableFuture<Set<String>> d;
   private final String e;
   private final String f;
   private final fue g;
   private static final String h = "worlds";
   private static final String i = "invites";
   private static final String j = "mco";
   private static final String k = "subscriptions";
   private static final String l = "activities";
   private static final String m = "ops";
   private static final String n = "regions/ping/stat";
   private static final String o = "regions/preferredRegions";
   private static final String p = "trial";
   private static final String q = "notifications";
   private static final String r = "feature/v1";
   private static final String s = "/listUserWorldsOfType/any";
   private static final String t = "/$PARENT_WORLD_ID/createPrereleaseRealm";
   private static final String u = "/listPrereleaseEligibleWorlds";
   private static final String v = "/$WORLD_ID/initialize";
   private static final String w = "/$WORLD_ID";
   private static final String x = "/liveplayerlist";
   private static final String y = "/$WORLD_ID";
   private static final String z = "/$WORLD_ID/$PROFILE_UUID";
   private static final String A = "/minigames/$MINIGAME_ID/$WORLD_ID";
   private static final String B = "/available";
   private static final String C = "/templates/$WORLD_TYPE";
   private static final String D = "/v1/$ID/join/pc";
   private static final String E = "/$ID";
   private static final String F = "/$WORLD_ID";
   private static final String G = "/$WORLD_ID/invite/$UUID";
   private static final String H = "/count/pending";
   private static final String I = "/pending";
   private static final String J = "/accept/$INVITATION_ID";
   private static final String K = "/reject/$INVITATION_ID";
   private static final String L = "/$WORLD_ID";
   private static final String M = "/$WORLD_ID/configuration";
   private static final String N = "/$WORLD_ID/slot/$SLOT_ID";
   private static final String O = "/$WORLD_ID/open";
   private static final String P = "/$WORLD_ID/close";
   private static final String Q = "/$WORLD_ID/reset";
   private static final String R = "/$WORLD_ID";
   private static final String S = "/$WORLD_ID/backups";
   private static final String T = "/$WORLD_ID/slot/$SLOT_ID/download";
   private static final String U = "/$WORLD_ID/backups/upload";
   private static final String V = "/client/compatible";
   private static final String W = "/tos/agreed";
   private static final String X = "/v1/news";
   private static final String Y = "/seen";
   private static final String Z = "/dismiss";
   private static final fpk aa = new fpk();

   public static foq a() {
      fue $$0 = fue.R();
      return a($$0);
   }

   public static foq a(fue $$0) {
      String $$1 = $$0.Y().c();
      String $$2 = $$0.Y().a();
      foq $$3 = c;
      if ($$3 != null) {
         return $$3;
      } else {
         synchronized (foq.class) {
            foq $$4 = c;
            if ($$4 != null) {
               return $$4;
            } else {
               $$4 = new foq($$2, $$1, $$0);
               c = $$4;
               return $$4;
            }
         }
      }
   }

   private foq(String $$0, String $$1, fue $$2) {
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
      fos.a($$2.aa());
      this.d = CompletableFuture.supplyAsync(this::o, ag.j());
   }

   public Set<String> b() {
      return this.d.join();
   }

   private Set<String> o() {
      fuq $$0 = fue.R().Y();
      if ($$0.g() != fuq.a.c) {
         return Set.of();
      } else {
         String $$1 = a("feature/v1", null, false);

         try {
            String $$2 = this.a(fou.a($$1, 5000, 10000));
            JsonArray $$3 = bbw.a($$2).getAsJsonArray();
            Set<String> $$4 = $$3.asList().stream().<String>map(JsonElement::getAsString).collect(Collectors.toSet());
            b.debug("Fetched Realms feature flags: {}", $$4);
            return $$4;
         } catch (fqx var6) {
            b.error("Failed to fetch Realms feature flags", var6);
         } catch (Exception var7) {
            b.error("Could not parse Realms feature flags", var7);
         }

         return Set.of();
      }
   }

   public fpy c() throws fqx {
      String $$0 = this.c("worlds");
      if (fol.b()) {
         $$0 = $$0 + "/listUserWorldsOfType/any";
      }

      String $$1 = this.a(fou.a($$0));
      return fpy.a(aa, $$1);
   }

   public List<fpx> d() throws fqx {
      String $$0 = this.c("worlds/listPrereleaseEligibleWorlds");
      String $$1 = this.a(fou.a($$0));
      return fpy.a(aa, $$1).a;
   }

   public fpx a(Long $$0) throws fqx {
      String $$1 = String.valueOf($$0);
      String $$2 = this.c("worlds" + "/$PARENT_WORLD_ID/createPrereleaseRealm".replace("$PARENT_WORLD_ID", $$1));
      return fpx.a(aa, this.a(fou.b($$2, $$1)));
   }

   public List<fpv> e() throws fqx {
      String $$0 = this.c("notifications");
      String $$1 = this.a(fou.a($$0));
      return fpv.a($$1);
   }

   private static JsonArray c(List<UUID> $$0) {
      JsonArray $$1 = new JsonArray();

      for (UUID $$2 : $$0) {
         if ($$2 != null) {
            $$1.add($$2.toString());
         }
      }

      return $$1;
   }

   public void a(List<UUID> $$0) throws fqx {
      String $$1 = this.c("notifications/seen");
      this.a(fou.b($$1, aa.a(c($$0))));
   }

   public void b(List<UUID> $$0) throws fqx {
      String $$1 = this.c("notifications/dismiss");
      this.a(fou.b($$1, aa.a(c($$0))));
   }

   public fpx a(long $$0) throws fqx {
      String $$1 = this.c("worlds" + "/$ID".replace("$ID", String.valueOf($$0)));
      String $$2 = this.a(fou.a($$1));
      return fpx.a(aa, $$2);
   }

   public fpq f() throws fqx {
      String $$0 = this.c("regions/preferredRegions");
      String $$1 = this.a(fou.a($$0));

      try {
         fpq $$2 = aa.a($$1, fpq.class);
         if ($$2 == null) {
            return fpq.a();
         } else {
            Set<fpw> $$3 = $$2.b().stream().map(fqh::a).collect(Collectors.toSet());

            for (fpw $$4 : fpw.values()) {
               if ($$4 != fpw.x && !$$3.contains($$4)) {
                  b.debug("No realms region matching {} in server response", $$4);
               }
            }

            return $$2;
         }
      } catch (Exception var9) {
         b.error("Could not parse PreferredRegionSelections: {}", var9.getMessage());
         return fpq.a();
      }
   }

   public fqm b(long $$0) throws fqx {
      String $$1 = this.c("activities" + "/$WORLD_ID".replace("$WORLD_ID", String.valueOf($$0)));
      String $$2 = this.a(fou.a($$1));
      return fqm.a($$2);
   }

   public fpz g() throws fqx {
      String $$0 = this.c("activities/liveplayerlist");
      String $$1 = this.a(fou.a($$0));
      return fpz.a($$1);
   }

   public fpt c(long $$0) throws fqx {
      String $$1 = this.c("worlds" + "/v1/$ID/join/pc".replace("$ID", $$0 + ""));
      String $$2 = this.a(fou.a($$1, 5000, 30000));
      return fpt.a(aa, $$2);
   }

   public void a(long $$0, String $$1, String $$2) throws fqx {
      fps $$3 = new fps($$1, $$2);
      String $$4 = this.c("worlds" + "/$WORLD_ID/initialize".replace("$WORLD_ID", String.valueOf($$0)));
      String $$5 = aa.a($$3);
      this.a(fou.a($$4, $$5, 5000, 10000));
   }

   public boolean h() throws fqx {
      String $$0 = this.c("mco/available");
      String $$1 = this.a(fou.a($$0));
      return Boolean.parseBoolean($$1);
   }

   public foq.a i() throws fqx {
      String $$0 = this.c("mco/client/compatible");
      String $$1 = this.a(fou.a($$0));

      try {
         return foq.a.valueOf($$1);
      } catch (IllegalArgumentException var5) {
         throw new fqx(fot.b.a($$1));
      }
   }

   public void a(long $$0, UUID $$1) throws fqx {
      String $$2 = this.c("invites" + "/$WORLD_ID/invite/$UUID".replace("$WORLD_ID", String.valueOf($$0)).replace("$UUID", UndashedUuid.toString($$1)));
      this.a(fou.b($$2));
   }

   public void d(long $$0) throws fqx {
      String $$1 = this.c("invites" + "/$WORLD_ID".replace("$WORLD_ID", String.valueOf($$0)));
      this.a(fou.b($$1));
   }

   public List<fpp> a(long $$0, String $$1) throws fqx {
      fpp $$2 = new fpp();
      $$2.a($$1);
      String $$3 = this.c("invites" + "/$WORLD_ID".replace("$WORLD_ID", String.valueOf($$0)));
      String $$4 = this.a(fou.b($$3, aa.a($$2)));
      return fpx.a(aa, $$4).i;
   }

   public fpi e(long $$0) throws fqx {
      String $$1 = this.c("worlds" + "/$WORLD_ID/backups".replace("$WORLD_ID", String.valueOf($$0)));
      String $$2 = this.a(fou.a($$1));
      return fpi.a($$2);
   }

   public void a(long $$0, String $$1, String $$2, @Nullable fqk $$3, int $$4, fqe $$5, List<fqa> $$6) throws fqx {
      fqk $$7 = $$3 != null ? $$3 : new fqk(fqj.d, null);
      fps $$8 = new fps($$1, $$2);
      fqc $$9 = new fqc($$4, $$5, fqa.a($$6));
      fpr $$10 = new fpr($$9, $$6, $$7, $$8);
      String $$11 = this.c("worlds" + "/$WORLD_ID/configuration".replace("$WORLD_ID", String.valueOf($$0)));
      this.a(fou.b($$11, aa.a($$10)));
   }

   public void a(long $$0, int $$1, fqe $$2, List<fqa> $$3) throws fqx {
      String $$4 = this.c("worlds" + "/$WORLD_ID/slot/$SLOT_ID".replace("$WORLD_ID", String.valueOf($$0)).replace("$SLOT_ID", String.valueOf($$1)));
      String $$5 = aa.a(new fqc($$1, $$2, fqa.a($$3)));
      this.a(fou.b($$4, $$5));
   }

   public boolean a(long $$0, int $$1) throws fqx {
      String $$2 = this.c("worlds" + "/$WORLD_ID/slot/$SLOT_ID".replace("$WORLD_ID", String.valueOf($$0)).replace("$SLOT_ID", String.valueOf($$1)));
      String $$3 = this.a(fou.c($$2, ""));
      return Boolean.valueOf($$3);
   }

   public void b(long $$0, String $$1) throws fqx {
      String $$2 = this.a("worlds" + "/$WORLD_ID/backups".replace("$WORLD_ID", String.valueOf($$0)), "backupId=" + $$1);
      this.a(fou.b($$2, "", 40000, 600000));
   }

   public fqt a(int $$0, int $$1, fpx.d $$2) throws fqx {
      String $$3 = this.a(
         "worlds" + "/templates/$WORLD_TYPE".replace("$WORLD_TYPE", $$2.toString()), String.format(Locale.ROOT, "page=%d&pageSize=%d", $$0, $$1)
      );
      String $$4 = this.a(fou.a($$3));
      return fqt.a($$4);
   }

   public Boolean c(long $$0, String $$1) throws fqx {
      String $$2 = "/minigames/$MINIGAME_ID/$WORLD_ID".replace("$MINIGAME_ID", $$1).replace("$WORLD_ID", String.valueOf($$0));
      String $$3 = this.c("worlds" + $$2);
      return Boolean.valueOf(this.a(fou.c($$3, "")));
   }

   public fpl b(long $$0, UUID $$1) throws fqx {
      String $$2 = "/$WORLD_ID/$PROFILE_UUID".replace("$WORLD_ID", String.valueOf($$0)).replace("$PROFILE_UUID", UndashedUuid.toString($$1));
      String $$3 = this.c("ops" + $$2);
      return fpl.a(this.a(fou.b($$3, "")));
   }

   public fpl c(long $$0, UUID $$1) throws fqx {
      String $$2 = "/$WORLD_ID/$PROFILE_UUID".replace("$WORLD_ID", String.valueOf($$0)).replace("$PROFILE_UUID", UndashedUuid.toString($$1));
      String $$3 = this.c("ops" + $$2);
      return fpl.a(this.a(fou.b($$3)));
   }

   public Boolean f(long $$0) throws fqx {
      String $$1 = this.c("worlds" + "/$WORLD_ID/open".replace("$WORLD_ID", String.valueOf($$0)));
      String $$2 = this.a(fou.c($$1, ""));
      return Boolean.valueOf($$2);
   }

   public Boolean g(long $$0) throws fqx {
      String $$1 = this.c("worlds" + "/$WORLD_ID/close".replace("$WORLD_ID", String.valueOf($$0)));
      String $$2 = this.a(fou.c($$1, ""));
      return Boolean.valueOf($$2);
   }

   public Boolean d(long $$0, String $$1) throws fqx {
      fqf $$2 = new fqf(null, Long.valueOf($$1), -1, false, Set.of());
      String $$3 = this.c("worlds" + "/$WORLD_ID/reset".replace("$WORLD_ID", String.valueOf($$0)));
      String $$4 = this.a(fou.a($$3, aa.a($$2), 30000, 80000));
      return Boolean.valueOf($$4);
   }

   public fqo h(long $$0) throws fqx {
      String $$1 = this.c("subscriptions" + "/$WORLD_ID".replace("$WORLD_ID", String.valueOf($$0)));
      String $$2 = this.a(fou.a($$1));
      return fqo.a($$2);
   }

   public int j() throws fqx {
      return this.k().a.size();
   }

   public fpn k() throws fqx {
      String $$0 = this.c("invites/pending");
      String $$1 = this.a(fou.a($$0));
      fpn $$2 = fpn.a($$1);
      $$2.a.removeIf(this::a);
      return $$2;
   }

   private boolean a(fpm $$0) {
      return this.g.aO().e($$0.d);
   }

   public void a(String $$0) throws fqx {
      String $$1 = this.c("invites" + "/accept/$INVITATION_ID".replace("$INVITATION_ID", $$0));
      this.a(fou.c($$1, ""));
   }

   public fqr b(long $$0, int $$1) throws fqx {
      String $$2 = this.c("worlds" + "/$WORLD_ID/slot/$SLOT_ID/download".replace("$WORLD_ID", String.valueOf($$0)).replace("$SLOT_ID", String.valueOf($$1)));
      String $$3 = this.a(fou.a($$2));
      return fqr.a($$3);
   }

   @Nullable
   public fqp i(long $$0) throws fqx {
      String $$1 = this.c("worlds" + "/$WORLD_ID/backups/upload".replace("$WORLD_ID", String.valueOf($$0)));
      String $$2 = fsw.a($$0);
      fqp $$3 = fqp.a(this.a(fou.c($$1, fqp.b($$2))));
      if ($$3 != null) {
         fsw.a($$0, $$3.a());
      }

      return $$3;
   }

   public void b(String $$0) throws fqx {
      String $$1 = this.c("invites" + "/reject/$INVITATION_ID".replace("$INVITATION_ID", $$0));
      this.a(fou.c($$1, ""));
   }

   public void l() throws fqx {
      String $$0 = this.c("mco/tos/agreed");
      this.a(fou.b($$0, ""));
   }

   public fpu m() throws fqx {
      String $$0 = this.c("mco/v1/news");
      String $$1 = this.a(fou.a($$0, 5000, 10000));
      return fpu.a($$1);
   }

   public void a(fpo $$0) throws fqx {
      String $$1 = this.c("regions/ping/stat");
      this.a(fou.b($$1, aa.a($$0)));
   }

   public Boolean n() throws fqx {
      String $$0 = this.c("trial");
      String $$1 = this.a(fou.a($$0));
      return Boolean.valueOf($$1);
   }

   public void j(long $$0) throws fqx {
      String $$1 = this.c("worlds" + "/$WORLD_ID".replace("$WORLD_ID", String.valueOf($$0)));
      this.a(fou.b($$1));
   }

   private String c(String $$0) throws fqx {
      return this.a($$0, null);
   }

   private String a(String $$0, @Nullable String $$1) throws fqx {
      return a($$0, $$1, this.b().contains("realms_in_aks"));
   }

   private static String a(String $$0, @Nullable String $$1, boolean $$2) {
      try {
         return new URI(a.f, $$2 ? a.e : a.d, "/" + $$0, $$1, null).toASCIIString();
      } catch (URISyntaxException var4) {
         throw new IllegalArgumentException($$0, var4);
      }
   }

   private String a(fou<?> $$0) throws fqx {
      $$0.a("sid", this.e);
      $$0.a("user", this.f);
      $$0.a("version", ac.b().c());
      $$0.a(fol.b());

      try {
         int $$1 = $$0.b();
         if ($$1 != 503 && $$1 != 277) {
            String $$3 = $$0.c();
            if ($$1 >= 200 && $$1 < 300) {
               return $$3;
            } else if ($$1 == 401) {
               String $$4 = $$0.c("WWW-Authenticate");
               b.info("Could not authorize you against Realms server: {}", $$4);
               throw new fqx(new fot.a($$4));
            } else {
               String $$5 = $$0.a.getContentType();
               if ($$5 != null && $$5.startsWith("text/html")) {
                  throw new fqx(fot.b.b($$1, $$3));
               } else {
                  fot $$6 = fot.a($$1, $$3);
                  throw new fqx($$6);
               }
            }
         } else {
            int $$2 = $$0.a();
            throw new fqy($$2, $$1);
         }
      } catch (fqw var6) {
         throw new fqx(fot.b.a(var6));
      }
   }

   public static enum a {
      a,
      b,
      c;
   }

   public static enum b {
      a("pc.realms.minecraft.net", "java.frontendlegacy.realms.minecraft-services.net", "https"),
      b("pc-stage.realms.minecraft.net", "java.frontendlegacy.stage-c2a40e62.realms.minecraft-services.net", "https"),
      c("localhost:8080", "localhost:8080", "http");

      public final String d;
      public final String e;
      public final String f;

      private b(final String $$0, final String $$1, final String $$2) {
         this.d = $$0;
         this.e = $$1;
         this.f = $$2;
      }

      public static Optional<foq.b> a(String $$0) {
         String var1 = $$0.toLowerCase(Locale.ROOT);

         return switch (var1) {
            case "production" -> Optional.of(a);
            case "local" -> Optional.of(c);
            case "stage", "staging" -> Optional.of(b);
            default -> Optional.empty();
         };
      }
   }
}
