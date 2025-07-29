import com.mojang.serialization.MapCodec;

public abstract class dyb extends dxu {
   protected dyb(eea.d $$0) {
      super($$0);
   }

   private static boolean b(eeb $$0, dmx $$1, jb $$2) {
      jb $$3 = $$2.d();
      eeb $$4 = $$1.a_($$3);
      if ($$4.a(dqb.ed) && $$4.c(dxt.c) == 1) {
         return true;
      } else if ($$4.y().e() == 8) {
         return false;
      } else {
         int $$5 = fac.a($$0, $$4, jh.b, $$4.g());
         return $$5 < 15;
      }
   }

   @Override
   protected abstract MapCodec<? extends dyb> a();

   private static boolean c(eeb $$0, dmx $$1, jb $$2) {
      jb $$3 = $$2.d();
      return b($$0, $$1, $$2) && !$$1.b_($$3).a(azu.a);
   }

   @Override
   protected void b(eeb $$0, aub $$1, jb $$2, bck $$3) {
      if (!b($$0, $$1, $$2)) {
         $$1.c($$2, dqb.j.m());
      } else {
         if ($$1.C($$2.d()) >= 9) {
            eeb $$4 = this.m();

            for (int $$5 = 0; $$5 < 4; $$5++) {
               jb $$6 = $$2.b($$3.a(3) - 1, $$3.a(5) - 3, $$3.a(3) - 1);
               if ($$1.a_($$6).a(dqb.j) && c($$4, $$1, $$6)) {
                  $$1.c($$6, $$4.b(c, o($$1.a_($$6.d()))));
               }
            }
         }
      }
   }
}
