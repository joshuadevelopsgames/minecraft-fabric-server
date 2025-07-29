import com.mojang.serialization.MapCodec;

public class dvr extends dpz implements dqc {
   public static final MapCodec<dvr> a = b(dvr::new);

   @Override
   public MapCodec<dvr> a() {
      return a;
   }

   protected dvr(eea.d $$0) {
      super($$0);
   }

   private static boolean b(eeb $$0, dmx $$1, jb $$2) {
      jb $$3 = $$2.d();
      eeb $$4 = $$1.a_($$3);
      int $$5 = fac.a($$0, $$4, jh.b, $$4.g());
      return $$5 < 15;
   }

   @Override
   protected void b(eeb $$0, aub $$1, jb $$2, bck $$3) {
      if (!b($$0, $$1, $$2)) {
         $$1.c($$2, dqb.em.m());
      }
   }

   @Override
   public boolean a(dmx $$0, jb $$1, eeb $$2) {
      return $$0.a_($$1.d()).l();
   }

   @Override
   public boolean a(dmu $$0, bck $$1, jb $$2, eeb $$3) {
      return true;
   }

   @Override
   public void a(aub $$0, bck $$1, jb $$2, eeb $$3) {
      eeb $$4 = $$0.a_($$2);
      jb $$5 = $$2.d();
      efz $$6 = $$0.n().g();
      jy<ems<?, ?>> $$7 = $$0.K_().f(mn.aP);
      if ($$4.a(dqb.pd)) {
         this.a($$7, rt.h, $$0, $$6, $$1, $$5);
      } else if ($$4.a(dqb.oU)) {
         this.a($$7, rt.j, $$0, $$6, $$1, $$5);
         this.a($$7, rt.l, $$0, $$6, $$1, $$5);
         if ($$1.a(8) == 0) {
            this.a($$7, rt.n, $$0, $$6, $$1, $$5);
         }
      }
   }

   private void a(jy<ems<?, ?>> $$0, amd<ems<?, ?>> $$1, aub $$2, efz $$3, bck $$4, jb $$5) {
      $$0.a($$1).ifPresent($$4x -> ((ems)$$4x.a()).a($$2, $$3, $$4, $$5));
   }

   @Override
   public dqc.a aq_() {
      return dqc.a.a;
   }
}
