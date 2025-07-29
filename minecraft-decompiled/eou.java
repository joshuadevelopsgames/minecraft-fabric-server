import com.mojang.serialization.Codec;

public class eou extends enh<eqj> {
   public eou(Codec<eqj> $$0) {
      super($$0);
   }

   @Override
   public boolean a(enj<eqj> $$0) {
      dnt $$1 = $$0.b();
      jb $$2 = $$0.e();
      if (a($$1, $$2)) {
         return false;
      } else {
         bck $$3 = $$0.d();
         eqj $$4 = $$0.f();
         int $$5 = $$4.a();
         int $$6 = $$4.b();
         int $$7 = $$4.c();
         jb.a $$8 = new jb.a();

         for (int $$9 = 0; $$9 < $$5 * $$5; $$9++) {
            $$8.g($$2).e(bcb.a($$3, -$$5, $$5), bcb.a($$3, -$$6, $$6), bcb.a($$3, -$$5, $$5));
            if (a($$1, $$8) && !a($$1, (jb)$$8)) {
               int $$10 = bcb.a($$3, 1, $$7);
               if ($$3.a(6) == 0) {
                  $$10 *= 2;
               }

               if ($$3.a(5) == 0) {
                  $$10 = 1;
               }

               int $$11 = 17;
               int $$12 = 25;
               a($$1, $$3, $$8, $$10, 17, 25);
            }
         }

         return true;
      }
   }

   private static boolean a(dmv $$0, jb.a $$1) {
      do {
         $$1.e(0, -1, 0);
         if ($$0.u($$1)) {
            return false;
         }
      } while ($$0.a_($$1).l());

      $$1.e(0, 1, 0);
      return true;
   }

   public static void a(dmv $$0, bck $$1, jb.a $$2, int $$3, int $$4, int $$5) {
      for (int $$6 = 1; $$6 <= $$3; $$6++) {
         if ($$0.w($$2)) {
            if ($$6 == $$3 || !$$0.w($$2.d())) {
               $$0.a($$2, dqb.pi.m().b(dtt.e, bcb.a($$1, $$4, $$5)), 2);
               break;
            }

            $$0.a($$2, dqb.pj.m(), 2);
         }

         $$2.c(jh.b);
      }
   }

   private static boolean a(dmv $$0, jb $$1) {
      if (!$$0.w($$1)) {
         return true;
      } else {
         eeb $$2 = $$0.a_($$1.e());
         return !$$2.a(dqb.em) && !$$2.a(dqb.oU) && !$$2.a(dqb.oW);
      }
   }
}
