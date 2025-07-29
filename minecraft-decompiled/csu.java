import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public class csu extends ccd<csr> {
   private static final int c = 4;
   private static final int d = 10;
   private static final int e = 2;
   private static final int f = Math.round(10.0F);
   private static final float g = 24.0F;
   private static final float h = 1.4F;
   private static final float i = 0.058333334F;
   private static final ObjectArrayList<Integer> j = new ObjectArrayList(Lists.newArrayList(new Integer[]{40, 55, 60, 75, 80}));

   @VisibleForTesting
   public csu() {
      super(Map.of(cjo.p, cjp.a, cjo.aV, cjp.b, cjo.ba, cjp.c, cjo.bb, cjp.c, cjo.aW, cjp.b, cjo.n, cjp.b, cjo.bc, cjp.c), 200);
   }

   public static boolean a(aub $$0, csr $$1) {
      if (!$$1.aK() && !$$1.bm()) {
         return false;
      } else if (cex.a($$1)) {
         return false;
      } else if ($$1.eh().a(cjo.bb, cjp.a)) {
         return true;
      } else {
         cam $$2 = $$1.eh().c(cjo.p).orElse(null);
         if ($$2 == null) {
            return false;
         } else if (a($$1, $$2)) {
            $$1.eh().b(cjo.p);
            return false;
         } else if (b($$1, $$2)) {
            return false;
         } else if (!c($$0, $$1)) {
            return false;
         } else {
            jb $$3 = a($$1, cst.a($$2, $$1.ec()));
            if ($$3 == null) {
               return false;
            } else {
               eeb $$4 = $$0.a_($$3.e());
               if ($$1.ap().a($$4)) {
                  return false;
               } else if (!cst.a($$1, $$3.b()) && !cst.a($$1, $$3.b(4).b())) {
                  return false;
               } else {
                  $$1.eh().a(cjo.bb, $$3);
                  return true;
               }
            }
         }
      }
   }

   protected boolean b(aub $$0, csr $$1) {
      return a($$0, $$1);
   }

   protected boolean a(aub $$0, csr $$1, long $$2) {
      return $$1.aw() != cay.a && !$$1.eh().a(cjo.aV);
   }

   protected void b(aub $$0, csr $$1, long $$2) {
      if ($$1.eh().a(cjo.ba, cjp.b)) {
         $$1.eh().a(cjo.ba, bdk.a, f);
      }

      $$1.b(cay.r);
      $$0.a(null, $$1, ayz.cE, aza.f, 1.0F, 1.0F);
      $$1.eh().c(cjo.bb).ifPresent($$1x -> $$1.a(ex.a.b, $$1x.b()));
   }

   protected void c(aub $$0, csr $$1, long $$2) {
      boolean $$3 = $$1.bm();
      if (!$$3 && $$1.eh().a(cjo.bc, cjp.a)) {
         $$1.eh().b(cjo.bc);
      }

      if (a($$1)) {
         fis $$4 = $$1.eh().c(cjo.bb).flatMap($$1x -> a($$1, $$1.ec(), fis.c($$1x))).orElse(null);
         if ($$4 == null) {
            $$1.b(cay.a);
            return;
         }

         if ($$3) {
            $$1.eh().a(cjo.bc, bdk.a);
         }

         $$1.a(ayz.cK, 1.0F, 1.0F);
         $$1.b(cay.g);
         $$1.v($$1.br);
         $$1.r(true);
         $$1.i($$4);
      } else if (b($$1)) {
         $$1.a(ayz.cL, 1.0F, 1.0F);
         $$1.b(cay.a);
         $$1.r(false);
         boolean $$5 = $$1.eh().a(cjo.y);
         $$1.eh().a(cjo.aV, bdk.a, $$5 ? 2L : 10L);
         $$1.eh().a(cjo.aW, bdk.a, 100L);
      }
   }

   protected void d(aub $$0, csr $$1, long $$2) {
      if ($$1.aw() == cay.g || $$1.aw() == cay.r) {
         $$1.b(cay.a);
      }

      $$1.eh().b(cjo.bb);
      $$1.eh().b(cjo.ba);
      $$1.eh().b(cjo.bc);
   }

   private static boolean a(csr $$0) {
      return $$0.eh().c(cjo.ba).isEmpty() && $$0.aw() == cay.r;
   }

   private static boolean b(csr $$0) {
      boolean $$1 = $$0.aw() == cay.g;
      boolean $$2 = $$0.aK();
      boolean $$3 = $$0.bm() && $$0.eh().a(cjo.bc, cjp.b);
      return $$1 && ($$2 || $$3);
   }

   @Nullable
   private static jb a(cam $$0, fis $$1) {
      dmb $$2 = new dmb($$1, $$1.a(jh.a, 10.0), dmb.a.a, dmb.b.a, $$0);
      fiq $$3 = $$0.ai().a($$2);
      if ($$3.d() == fiq.a.b) {
         return jb.a((jv)$$3.g()).d();
      } else {
         dmb $$4 = new dmb($$1, $$1.a(jh.b, 10.0), dmb.a.a, dmb.b.a, $$0);
         fiq $$5 = $$0.ai().a($$4);
         return $$5.d() == fiq.a.b ? jb.a((jv)$$5.g()).d() : null;
      }
   }

   private static boolean a(csr $$0, cam $$1) {
      return !$$1.a($$0, $$0.i(cbs.n));
   }

   private static boolean b(csr $$0, cam $$1) {
      return $$1.f($$0) - 4.0F <= 0.0F;
   }

   private static boolean c(aub $$0, csr $$1) {
      jb $$2 = $$1.dx();
      if ($$0.a_($$2).a(dqb.pP)) {
         return false;
      } else {
         for (int $$3 = 1; $$3 <= 4; $$3++) {
            jb $$4 = $$2.a(jh.b, $$3);
            if (!$$0.a_($$4).l() && !$$0.b_($$4).a(azu.a)) {
               return false;
            }
         }

         return true;
      }
   }

   private static Optional<fis> a(csr $$0, bck $$1, fis $$2) {
      for (int $$4 : ag.a(j, $$1)) {
         float $$5 = 0.058333334F * (float)$$0.i(cbs.n);
         Optional<fis> $$6 = cdh.a($$0, $$2, $$5, $$4, false);
         if ($$6.isPresent()) {
            if ($$0.d(bys.h)) {
               double $$7 = $$6.get().d().e * $$0.fo();
               return $$6.map($$1x -> $$1x.b(0.0, $$7, 0.0));
            }

            return $$6;
         }
      }

      return Optional.empty();
   }
}
