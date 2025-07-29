import java.util.List;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class ddh extends dcr {
   private static final int c = 5;
   private static final float d = -3.4F;
   public static final float a = 1.5F;
   private static final float o = 5.0F;
   public static final float b = 3.5F;
   private static final float p = 0.7F;

   public ddh(dcr.a $$0) {
      super($$0);
   }

   public static dfm a() {
      return dfm.a().a(cbs.c, new cbq(h, 5.0, cbq.a.a), bzx.b).a(cbs.e, new cbq(i, -3.4F, cbq.a.a), bzx.b).a();
   }

   public static dfy b() {
      return new dfy(List.of(), 1.0F, 2, false);
   }

   @Override
   public void a(dcv $$0, cam $$1, cam $$2) {
      if (b($$2)) {
         aub $$3 = (aub)$$2.ai();
         $$2.i($$2.dA().a(jh.a.b, 0.01F));
         if ($$2 instanceof auc $$4) {
            $$4.cI = this.a($$4);
            $$4.x(true);
            $$4.g.b(new agb($$4));
         }

         if ($$1.aK()) {
            if ($$2 instanceof auc $$5) {
               $$5.b(true);
            }

            ayy $$6 = $$2.am > 5.0 ? ayz.pA : ayz.pz;
            $$3.a(null, $$2.dC(), $$2.dE(), $$2.dI(), $$6, $$2.do(), 1.0F, 1.0F);
         } else {
            $$3.a(null, $$2.dC(), $$2.dE(), $$2.dI(), ayz.py, $$2.do(), 1.0F, 1.0F);
         }

         a($$3, $$2, $$1);
      }
   }

   private fis a(auc $$0) {
      return $$0.gX() && $$0.cI != null && $$0.cI.e <= $$0.dv().e ? $$0.cI : $$0.dv();
   }

   @Override
   public void b(dcv $$0, cam $$1, cam $$2) {
      if (b($$2)) {
         $$2.j();
      }
   }

   @Override
   public float a(bzm $$0, float $$1, byb $$2) {
      if ($$2.c() instanceof cam $$3) {
         if (!b($$3)) {
            return 0.0F;
         } else {
            double $$5 = 3.0;
            double $$6 = 8.0;
            double $$7 = $$3.am;
            double $$8;
            if ($$7 <= 3.0) {
               $$8 = 4.0 * $$7;
            } else if ($$7 <= 8.0) {
               $$8 = 12.0 + 2.0 * ($$7 - 3.0);
            } else {
               $$8 = 22.0 + $$7 - 8.0;
            }

            return $$3.ai() instanceof aub $$11 ? (float)($$8 + djk.b($$11, $$3.ed(), $$0, $$2, 0.0F) * $$7) : (float)$$8;
         }
      } else {
         return 0.0F;
      }
   }

   private static void a(dmu $$0, bzm $$1, bzm $$2) {
      $$0.c(2013, $$2.aU(), 750);
      $$0.a(cam.class, $$2.cV().g(3.5), a($$1, $$2)).forEach($$2x -> {
         fis $$3 = $$2x.dv().d($$2.dv());
         double $$4 = a($$1, $$2x, $$3);
         fis $$5 = $$3.d().c($$4);
         if ($$4 > 0.0) {
            $$2x.i($$5.d, 0.7F, $$5.f);
            if ($$2x instanceof auc $$6) {
               $$6.g.b(new agb($$6));
            }
         }
      });
   }

   private static Predicate<cam> a(bzm $$0, bzm $$1) {
      return $$2 -> {
         boolean $$3 = !$$2.am();
         boolean $$4 = $$2 != $$0 && $$2 != $$1;
         boolean $$5 = !$$0.t($$2);
         boolean $$8 = !($$2 instanceof cbi $$6 && $$1 instanceof cam $$7 && $$6.m() && $$6.j($$7));
         boolean $$11 = !($$2 instanceof cqo $$9 && $$9.t());
         boolean $$12 = $$1.g($$2) <= Math.pow(3.5, 2.0);
         return $$3 && $$4 && $$5 && $$8 && $$11 && $$12;
      };
   }

   private static double a(bzm $$0, cam $$1, fis $$2) {
      return (3.5 - $$2.g()) * 0.7F * ($$0.am > 5.0 ? 2 : 1) * (1.0 - $$1.i(cbs.q));
   }

   public static boolean b(cam $$0) {
      return $$0.am > 1.5 && !$$0.fQ();
   }

   @Nullable
   @Override
   public byb a(cam $$0) {
      return b($$0) ? $$0.ea().f($$0) : super.a($$0);
   }
}
