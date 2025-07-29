import com.mojang.serialization.MapCodec;

public class dwo extends dsc {
   public static final MapCodec<dwo> a = b(dwo::new);
   public static final ees b = eer.v;
   public static final efb d = eer.aD;

   @Override
   public MapCodec<dwo> a() {
      return a;
   }

   protected dwo(eea.d $$0) {
      super($$0);
      this.l(this.C.b().b(f, jh.c).b(d, 1).b(b, false).b(c, false));
   }

   @Override
   protected bxj a(eeb $$0, dmu $$1, jb $$2, cut $$3, fio $$4) {
      if (!$$3.gt().e) {
         return bxj.e;
      } else {
         $$1.a($$2, $$0.a(d), 3);
         return bxj.a;
      }
   }

   @Override
   protected int h(eeb $$0) {
      return $$0.c(d) * 2;
   }

   @Override
   public eeb a(dgo $$0) {
      eeb $$1 = super.a($$0);
      return $$1.b(b, this.b($$0.q(), $$0.a(), $$1));
   }

   @Override
   protected eeb a(eeb $$0, dmx $$1, dnj $$2, jb $$3, jh $$4, jb $$5, eeb $$6, bck $$7) {
      if ($$4 == jh.a && !this.a($$1, $$5, $$6)) {
         return dqb.a.m();
      } else {
         return !$$1.B_() && $$4.o() != $$0.c(f).o() ? $$0.b(b, this.b($$1, $$3, $$0)) : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      }
   }

   @Override
   public boolean b(dmx $$0, jb $$1, eeb $$2) {
      return this.a((dnm)$$0, $$1, $$2) > 0;
   }

   @Override
   protected boolean b() {
      return true;
   }

   @Override
   public void a(eeb $$0, dmu $$1, jb $$2, bck $$3) {
      if ($$0.c(c)) {
         jh $$4 = $$0.c(f);
         double $$5 = $$2.u() + 0.5 + ($$3.j() - 0.5) * 0.2;
         double $$6 = $$2.v() + 0.4 + ($$3.j() - 0.5) * 0.2;
         double $$7 = $$2.w() + 0.5 + ($$3.j() - 0.5) * 0.2;
         float $$8 = -5.0F;
         if ($$3.h()) {
            $$8 = $$0.c(d) * 2 - 1;
         }

         $$8 /= 16.0F;
         double $$9 = $$8 * $$4.j();
         double $$10 = $$8 * $$4.l();
         $$1.a(lz.b, $$5 + $$9, $$6, $$7 + $$10, 0.0, 0.0, 0.0);
      }
   }

   @Override
   protected void a(eec.a<dpz, eeb> $$0) {
      $$0.a(f, d, b, c);
   }
}
