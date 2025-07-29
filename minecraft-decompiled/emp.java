import com.mojang.serialization.Codec;

public class emp extends enh<ept> {
   public emp(Codec<ept> $$0) {
      super($$0);
   }

   @Override
   public boolean a(enj<ept> $$0) {
      jb $$1 = $$0.e();
      dnt $$2 = $$0.b();
      bck $$3 = $$0.d();
      if ($$1.v() > $$2.Q() - 1) {
         return false;
      } else if (!$$2.a_($$1).a(dqb.J) && !$$2.a_($$1.e()).a(dqb.J)) {
         return false;
      } else {
         boolean $$4 = false;

         for (jh $$5 : jh.values()) {
            if ($$5 != jh.a && $$2.a_($$1.a($$5)).a(dqb.je)) {
               $$4 = true;
               break;
            }
         }

         if (!$$4) {
            return false;
         } else {
            $$2.a($$1, dqb.nD.m(), 2);

            for (int $$6 = 0; $$6 < 200; $$6++) {
               int $$7 = $$3.a(5) - $$3.a(6);
               int $$8 = 3;
               if ($$7 < 2) {
                  $$8 += $$7 / 2;
               }

               if ($$8 >= 1) {
                  jb $$9 = $$1.b($$3.a($$8) - $$3.a($$8), $$7, $$3.a($$8) - $$3.a($$8));
                  eeb $$10 = $$2.a_($$9);
                  if ($$10.l() || $$10.a(dqb.J) || $$10.a(dqb.je) || $$10.a(dqb.ee)) {
                     for (jh $$11 : jh.values()) {
                        eeb $$12 = $$2.a_($$9.a($$11));
                        if ($$12.a(dqb.nD)) {
                           $$2.a($$9, dqb.nD.m(), 2);
                           break;
                        }
                     }
                  }
               }
            }

            return true;
         }
      }
   }
}
