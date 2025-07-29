import com.mojang.serialization.MapCodec;

public class eah extends dpz {
   public static final MapCodec<eah> a = b(eah::new);

   @Override
   public MapCodec<eah> a() {
      return a;
   }

   protected eah(eea.d $$0) {
      super($$0);
   }

   @Override
   protected void a(eeb $$0, dmu $$1, jb $$2, eeb $$3, boolean $$4) {
      if ($$1.G_().i()) {
         $$1.a($$2, dqb.aV.m(), 3);
         $$1.c(2009, $$2, 0);
         $$1.a(null, $$2, ayz.DO, aza.e, 1.0F, (1.0F + $$1.H_().i() * 0.2F) * 0.7F);
      }
   }

   @Override
   public void a(eeb $$0, dmu $$1, jb $$2, bck $$3) {
      jh $$4 = jh.b($$3);
      if ($$4 != jh.b) {
         jb $$5 = $$2.a($$4);
         eeb $$6 = $$1.a_($$5);
         if (!$$0.t() || !$$6.c($$1, $$5, $$4.g())) {
            double $$7 = $$2.u();
            double $$8 = $$2.v();
            double $$9 = $$2.w();
            if ($$4 == jh.a) {
               $$8 -= 0.05;
               $$7 += $$3.j();
               $$9 += $$3.j();
            } else {
               $$8 += $$3.j() * 0.8;
               if ($$4.o() == jh.a.a) {
                  $$9 += $$3.j();
                  if ($$4 == jh.f) {
                     $$7++;
                  } else {
                     $$7 += 0.05;
                  }
               } else {
                  $$7 += $$3.j();
                  if ($$4 == jh.d) {
                     $$9++;
                  } else {
                     $$9 += 0.05;
                  }
               }
            }

            $$1.a(me.l, $$7, $$8, $$9, 0.0, 0.0, 0.0);
         }
      }
   }
}
