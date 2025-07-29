import com.mojang.serialization.Codec;

public class eoq extends enh<ept> {
   public eoq(Codec<ept> $$0) {
      super($$0);
   }

   @Override
   public boolean a(enj<ept> $$0) {
      dnt $$1 = $$0.b();
      jb $$2 = $$0.e();
      jb.a $$3 = new jb.a();
      jb.a $$4 = new jb.a();

      for (int $$5 = 0; $$5 < 16; $$5++) {
         for (int $$6 = 0; $$6 < 16; $$6++) {
            int $$7 = $$2.u() + $$5;
            int $$8 = $$2.w() + $$6;
            int $$9 = $$1.a(eka.a.e, $$7, $$8);
            $$3.d($$7, $$9, $$8);
            $$4.g($$3).c(jh.a, 1);
            dnx $$10 = $$1.v($$3).a();
            if ($$10.a($$1, $$4, false)) {
               $$1.a($$4, dqb.ee.m(), 2);
            }

            if ($$10.b($$1, $$3)) {
               $$1.a($$3, dqb.ed.m(), 2);
               eeb $$11 = $$1.a_($$4);
               if ($$11.b(dxu.c)) {
                  $$1.a($$4, $$11.b(dxu.c, true), 2);
               }
            }
         }
      }

      return true;
   }
}
