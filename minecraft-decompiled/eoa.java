import com.mojang.serialization.Codec;

public class eoa extends enh<eps> {
   public eoa(Codec<eps> $$0) {
      super($$0);
   }

   @Override
   public boolean a(enj<eps> $$0) {
      dnt $$1 = $$0.b();
      jb $$2 = $$0.e();
      eeb $$3 = $$1.a_($$2.e());
      eps $$4 = $$0.f();
      bck $$5 = $$0.d();
      if (!$$3.a(azo.aR)) {
         return false;
      } else {
         int $$6 = $$2.v();
         if ($$6 >= $$1.L_() + 1 && $$6 + 1 <= $$1.ao()) {
            int $$7 = 0;

            for (int $$8 = 0; $$8 < $$4.d * $$4.d; $$8++) {
               jb $$9 = $$2.b($$5.a($$4.d) - $$5.a($$4.d), $$5.a($$4.e) - $$5.a($$4.e), $$5.a($$4.d) - $$5.a($$4.d));
               eeb $$10 = $$4.b.a($$5, $$9);
               if ($$1.w($$9) && $$9.v() > $$1.L_() && $$10.a($$1, $$9)) {
                  $$1.a($$9, $$10, 2);
                  $$7++;
               }
            }

            return $$7 > 0;
         } else {
            return false;
         }
      }
   }
}
