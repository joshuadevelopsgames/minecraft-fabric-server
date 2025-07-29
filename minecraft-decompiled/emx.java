import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;

public class emx extends enh<eph> {
   private static final ImmutableList<dpz> a = ImmutableList.of(dqb.I, dqb.fM, dqb.fN, dqb.fO, dqb.fP, dqb.cG, dqb.cD);
   private static final jh[] b = jh.values();
   private static final double c = 0.9;

   public emx(Codec<eph> $$0) {
      super($$0);
   }

   @Override
   public boolean a(enj<eph> $$0) {
      boolean $$1 = false;
      bck $$2 = $$0.d();
      dnt $$3 = $$0.b();
      eph $$4 = $$0.f();
      jb $$5 = $$0.e();
      boolean $$6 = $$2.j() < 0.9;
      int $$7 = $$6 ? $$4.d().a($$2) : 0;
      int $$8 = $$6 ? $$4.d().a($$2) : 0;
      boolean $$9 = $$6 && $$7 != 0 && $$8 != 0;
      int $$10 = $$4.c().a($$2);
      int $$11 = $$4.c().a($$2);
      int $$12 = Math.max($$10, $$11);

      for (jb $$13 : jb.a($$5, $$10, 0, $$11)) {
         if ($$13.k($$5) > $$12) {
            break;
         }

         if (a($$3, $$13, $$4)) {
            if ($$9) {
               $$1 = true;
               this.a($$3, $$13, $$4.b());
            }

            jb $$14 = $$13.b($$7, 0, $$8);
            if (a($$3, $$14, $$4)) {
               $$1 = true;
               this.a($$3, $$14, $$4.a());
            }
         }
      }

      return $$1;
   }

   private static boolean a(dmv $$0, jb $$1, eph $$2) {
      eeb $$3 = $$0.a_($$1);
      if ($$3.a($$2.a().b())) {
         return false;
      } else if (a.contains($$3.b())) {
         return false;
      } else {
         for (jh $$4 : b) {
            boolean $$5 = $$0.a_($$1.a($$4)).l();
            if ($$5 && $$4 != jh.b || !$$5 && $$4 == jh.b) {
               return false;
            }
         }

         return true;
      }
   }
}
