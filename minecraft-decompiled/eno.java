import com.mojang.serialization.Codec;

public class eno extends enh<ept> {
   public eno(Codec<ept> $$0) {
      super($$0);
   }

   @Override
   public boolean a(enj<ept> $$0) {
      dnt $$1 = $$0.b();
      jb $$2 = $$0.e();
      bck $$3 = $$0.d();
      if (!$$1.w($$2)) {
         return false;
      } else {
         eeb $$4 = $$1.a_($$2.d());
         if (!$$4.a(dqb.em) && !$$4.a(dqb.ep) && !$$4.a(dqb.qa)) {
            return false;
         } else {
            $$1.a($$2, dqb.et.m(), 2);

            for (int $$5 = 0; $$5 < 1500; $$5++) {
               jb $$6 = $$2.b($$3.a(8) - $$3.a(8), -$$3.a(12), $$3.a(8) - $$3.a(8));
               if ($$1.a_($$6).l()) {
                  int $$7 = 0;

                  for (jh $$8 : jh.values()) {
                     if ($$1.a_($$6.a($$8)).a(dqb.et)) {
                        $$7++;
                     }

                     if ($$7 > 1) {
                        break;
                     }
                  }

                  if ($$7 == 1) {
                     $$1.a($$6, dqb.et.m(), 2);
                  }
               }
            }

            return true;
         }
      }
   }
}
