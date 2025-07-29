import com.mojang.serialization.Codec;

public class env extends enh<ept> {
   public env(Codec<ept> $$0) {
      super($$0);
   }

   @Override
   public boolean a(enj<ept> $$0) {
      int $$1 = 0;
      dnt $$2 = $$0.b();
      jb $$3 = $$0.e();
      bck $$4 = $$0.d();
      int $$5 = $$2.a(eka.a.d, $$3.u(), $$3.w());
      jb $$6 = new jb($$3.u(), $$5, $$3.w());
      if ($$2.a_($$6).a(dqb.J)) {
         eeb $$7 = dqb.mI.m();
         eeb $$8 = dqb.mJ.m();
         int $$9 = 1 + $$4.a(10);

         for (int $$10 = 0; $$10 <= $$9; $$10++) {
            if ($$2.a_($$6).a(dqb.J) && $$2.a_($$6.d()).a(dqb.J) && $$8.a($$2, $$6)) {
               if ($$10 == $$9) {
                  $$2.a($$6, $$7.b(duj.e, $$4.a(4) + 20), 2);
                  $$1++;
               } else {
                  $$2.a($$6, $$8, 2);
               }
            } else if ($$10 > 0) {
               jb $$11 = $$6.e();
               if ($$7.a($$2, $$11) && !$$2.a_($$11.e()).a(dqb.mI)) {
                  $$2.a($$11, $$7.b(duj.e, $$4.a(4) + 20), 2);
                  $$1++;
               }
               break;
            }

            $$6 = $$6.d();
         }
      }

      return $$1 > 0;
   }
}
