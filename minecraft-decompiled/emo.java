import com.mojang.serialization.Codec;

public class emo extends enh<epd> {
   public emo(Codec<epd> $$0) {
      super($$0);
   }

   @Override
   public boolean a(enj<epd> $$0) {
      jb $$1 = $$0.e();
      dnt $$2 = $$0.b();
      bck $$3 = $$0.d();
      epd $$4 = $$0.f();
      if ($$1.v() < $$2.L_() + 5) {
         return false;
      } else {
         int $$5 = 2 + $$3.a(2);
         int $$6 = 2 + $$3.a(2);

         for (jb $$7 : jb.c($$1.b(-$$5, 0, -$$6), $$1.b($$5, 1, $$6))) {
            int $$8 = $$1.u() - $$7.u();
            int $$9 = $$1.w() - $$7.w();
            if ($$8 * $$8 + $$9 * $$9 <= $$3.i() * 10.0F - $$3.i() * 6.0F) {
               this.a($$2, $$7, $$3, $$4);
            } else if ($$3.i() < 0.031) {
               this.a($$2, $$7, $$3, $$4);
            }
         }

         return true;
      }
   }

   private boolean a(dmv $$0, jb $$1, bck $$2) {
      jb $$3 = $$1.e();
      eeb $$4 = $$0.a_($$3);
      return $$4.a(dqb.lk) ? $$2.h() : $$4.c($$0, $$3, jh.b);
   }

   private void a(dmv $$0, jb $$1, bck $$2, epd $$3) {
      if ($$0.w($$1) && this.a($$0, $$1, $$2)) {
         $$0.a($$1, $$3.b.a($$2, $$1), 260);
      }
   }
}
