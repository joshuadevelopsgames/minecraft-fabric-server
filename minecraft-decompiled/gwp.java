import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.concurrent.ExecutionException;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class gwp {
   private static final Logger b = LogUtils.getLogger();
   public static final xo a = xo.c("quickplay.error.title");
   private static final xo c = xo.c("quickplay.error.invalid_identifier");
   private static final xo d = xo.c("quickplay.error.realm_connect");
   private static final xo e = xo.c("quickplay.error.realm_permission");
   private static final xo f = xo.c("gui.toTitle");
   private static final xo g = xo.c("gui.toWorld");
   private static final xo h = xo.c("gui.toRealms");

   public static void a(fue $$0, glm.h $$1, foq $$2) {
      if (!$$1.a()) {
         b.error("Quick play disabled");
         $$0.a(new gev());
      } else {
         switch ($$1) {
            case glm.e $$3:
               b($$0, $$3.b());
               break;
            case glm.f $$4:
               a($$0, $$2, $$4.b());
               break;
            case glm.g $$5:
               String $$6 = $$5.b();
               if (bdb.h($$6)) {
                  $$6 = a($$0.m());
               }

               a($$0, $$6);
               break;
            case glm.d $$7:
               b.error("Quick play disabled");
               $$0.a(new gev());
               break;
            default:
               throw new MatchException(null, null);
         }
      }
   }

   @Nullable
   private static String a(fcs $$0) {
      try {
         List<fct> $$1 = $$0.a($$0.b()).get();
         if ($$1.isEmpty()) {
            b.warn("no latest singleplayer world found");
            return null;
         } else {
            return $$1.getFirst().a();
         }
      } catch (ExecutionException | InterruptedException var2) {
         b.error("failed to load singleplayer world summaries", var2);
         return null;
      }
   }

   private static void a(fue $$0, @Nullable String $$1) {
      if (!bdb.h($$1) && $$0.m().b($$1)) {
         $$0.x().a($$1, () -> $$0.a(new gev()));
      } else {
         get $$2 = new gkt(new gev());
         $$0.a(new gea($$2, a, c, g));
      }
   }

   private static void b(fue $$0, String $$1) {
      gsa $$2 = new gsa($$0);
      $$2.a();
      grz $$3 = $$2.a($$1);
      if ($$3 == null) {
         $$3 = new grz(htb.a("selectServer.defaultName"), $$1, grz.c.c);
         $$2.a($$3, true);
         $$2.b();
      }

      gtc $$4 = gtc.a($$1);
      gds.a(new gid(new gev()), $$0, $$4, $$3, true, null);
   }

   private static void a(fue $$0, foq $$1, String $$2) {
      long $$3;
      fpy $$4;
      try {
         $$3 = Long.parseLong($$2);
         $$4 = $$1.c();
      } catch (NumberFormatException var8) {
         get $$6 = new fol(new gev());
         $$0.a(new gea($$6, a, c, h));
         return;
      } catch (fqx var9) {
         get $$8 = new gev();
         $$0.a(new gea($$8, a, d, f));
         return;
      }

      fpx $$11 = $$4.a.stream().filter($$1x -> $$1x.b == $$3).findFirst().orElse(null);
      if ($$11 == null) {
         get $$12 = new fol(new gev());
         $$0.a(new gea($$12, a, e, h));
      } else {
         gev $$13 = new gev();
         $$0.a(new fro($$13, new ftb($$13, $$11)));
      }
   }
}
