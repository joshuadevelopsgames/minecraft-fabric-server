import com.mojang.serialization.Codec;

public class end extends enh<ept> {
   public end(Codec<ept> $$0) {
      super($$0);
   }

   @Override
   public boolean a(enj<ept> $$0) {
      dnt $$1 = $$0.b();
      bck $$2 = $$0.d();
      jb $$3 = $$0.e();
      float $$4 = $$2.a(3) + 4.0F;

      for (int $$5 = 0; $$4 > 0.5F; $$5--) {
         for (int $$6 = bcb.d(-$$4); $$6 <= bcb.f($$4); $$6++) {
            for (int $$7 = bcb.d(-$$4); $$7 <= bcb.f($$4); $$7++) {
               if ($$6 * $$6 + $$7 * $$7 <= ($$4 + 1.0F) * ($$4 + 1.0F)) {
                  this.a($$1, $$3.b($$6, $$5, $$7), dqb.fY.m());
               }
            }
         }

         $$4 -= $$2.a(2) + 0.5F;
      }

      return true;
   }
}
