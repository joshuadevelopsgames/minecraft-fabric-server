import java.util.Optional;

public class bcw {
   public static <T extends cao> Optional<T> a(bzv<T> $$0, bzu $$1, aub $$2, jb $$3, int $$4, int $$5, int $$6, bcw.a $$7, boolean $$8) {
      jb.a $$9 = $$3.k();

      for (int $$10 = 0; $$10 < $$4; $$10++) {
         int $$11 = bcb.b($$2.A, -$$5, $$5);
         int $$12 = bcb.b($$2.A, -$$5, $$5);
         $$9.a($$3, $$11, $$6, $$12);
         if ($$2.F_().a($$9) && a($$2, $$6, $$9, $$7) && (!$$8 || $$2.b($$0.a($$9.u() + 0.5, $$9.v(), $$9.w() + 0.5)))) {
            T $$13 = (T)$$0.b($$2, null, $$9, $$1, false, false);
            if ($$13 != null) {
               if ($$13.a($$2, $$1) && $$13.a((dmx)$$2)) {
                  $$2.a_($$13);
                  $$13.X();
                  return Optional.of($$13);
               }

               $$13.at();
            }
         }
      }

      return Optional.empty();
   }

   private static boolean a(aub $$0, int $$1, jb.a $$2, bcw.a $$3) {
      jb.a $$4 = new jb.a().g($$2);
      eeb $$5 = $$0.a_($$4);

      for (int $$6 = $$1; $$6 >= -$$1; $$6--) {
         $$2.c(jh.a);
         $$4.a($$2, jh.b);
         eeb $$7 = $$0.a_($$2);
         if ($$3.canSpawnOn($$0, $$2, $$7, $$4, $$5)) {
            $$2.c(jh.b);
            return true;
         }

         $$5 = $$7;
      }

      return false;
   }

   public interface a {
      @Deprecated
      bcw.a a = ($$0, $$1, $$2, $$3, $$4) -> !$$2.a(dqb.bz)
            && !$$2.a(dqb.eg)
            && !$$2.a(dqb.fq)
            && !($$2.b() instanceof dyd)
            && !($$2.b() instanceof dyc)
            && !($$2.b() instanceof duq)
            && !$$2.a(dqb.nE)
            && !$$2.a(dqb.ee)
            && !$$2.a(dqb.cu)
            && !$$2.a(dqb.et)
            && !$$2.a(dqb.gn)
            && !$$2.a(dqb.iK)
            && !$$2.a(dqb.lo)
            && !$$2.a(dqb.rx)
            && !$$2.a(dqb.aX)
         ? ($$4.l() || $$4.n()) && ($$2.e() || $$2.a(dqb.ry))
         : false;
      bcw.a b = ($$0, $$1, $$2, $$3, $$4) -> $$4.g($$0, $$3).c() && dpz.a($$2.g($$0, $$1), jh.b);
      bcw.a c = ($$0, $$1, $$2, $$3, $$4) -> $$4.g($$0, $$3).c() && !$$2.a(azo.L) && dpz.a($$2.g($$0, $$1), jh.b);

      boolean canSpawnOn(aub var1, jb var2, eeb var3, jb var4, eeb var5);
   }
}
