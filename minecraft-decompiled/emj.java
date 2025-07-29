import com.mojang.serialization.Codec;

public class emj extends enh<epw> {
   private static final eeb a = dqb.nG.m().b(dpd.b, 1).b(dpd.c, een.a).b(dpd.d, 0);
   private static final eeb b = a.b(dpd.c, een.c).b(dpd.d, 1);
   private static final eeb c = a.b(dpd.c, een.c);
   private static final eeb d = a.b(dpd.c, een.b);

   public emj(Codec<epw> $$0) {
      super($$0);
   }

   @Override
   public boolean a(enj<epw> $$0) {
      int $$1 = 0;
      jb $$2 = $$0.e();
      dnt $$3 = $$0.b();
      bck $$4 = $$0.d();
      epw $$5 = $$0.f();
      jb.a $$6 = $$2.k();
      jb.a $$7 = $$2.k();
      if ($$3.w($$6)) {
         if (dqb.nG.m().a($$3, $$6)) {
            int $$8 = $$4.a(12) + 5;
            if ($$4.i() < $$5.l) {
               int $$9 = $$4.a(4) + 1;

               for (int $$10 = $$2.u() - $$9; $$10 <= $$2.u() + $$9; $$10++) {
                  for (int $$11 = $$2.w() - $$9; $$11 <= $$2.w() + $$9; $$11++) {
                     int $$12 = $$10 - $$2.u();
                     int $$13 = $$11 - $$2.w();
                     if ($$12 * $$12 + $$13 * $$13 <= $$9 * $$9) {
                        $$7.d($$10, $$3.a(eka.a.b, $$10, $$11) - 1, $$11);
                        if (b($$3.a_($$7))) {
                           $$3.a($$7, dqb.l.m(), 2);
                        }
                     }
                  }
               }
            }

            for (int $$14 = 0; $$14 < $$8 && $$3.w($$6); $$14++) {
               $$3.a($$6, a, 2);
               $$6.c(jh.b, 1);
            }

            if ($$6.v() - $$2.v() >= 3) {
               $$3.a($$6, b, 2);
               $$3.a($$6.c(jh.a, 1), c, 2);
               $$3.a($$6.c(jh.a, 1), d, 2);
            }
         }

         $$1++;
      }

      return $$1 > 0;
   }
}
