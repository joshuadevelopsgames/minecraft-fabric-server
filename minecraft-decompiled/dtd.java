import com.mojang.serialization.MapCodec;

public class dtd extends dzl implements dqc {
   private static final double b = 0.7;
   private static final double c = 10.0;
   private static final double d = 5.0;
   private static final int e = 13;
   private static final int f = 30;
   public static final MapCodec<dtd> a = b(dtd::new);

   public dtd(eea.d $$0) {
      super($$0);
   }

   @Override
   protected MapCodec<? extends dtd> a() {
      return a;
   }

   @Override
   public void a(eeb $$0, dmu $$1, jb $$2, bck $$3) {
      if ($$3.a(30) == 0 && $$1.Y() && $$1.b(eka.a.f, $$2) <= $$2.v()) {
         $$1.a($$2, ayz.jx, aza.i, 1.0F, 1.0F, false);
      }

      if ($$1.C($$2) <= 13 && $$3.j() <= 0.7) {
         double $$4 = $$2.u() + $$3.j() * 10.0 - 5.0;
         double $$5 = $$2.v() + $$3.j() * 5.0;
         double $$6 = $$2.w() + $$3.j() * 10.0 - 5.0;
         $$1.a(me.bj, $$4, $$5, $$6, 0.0, 0.0, 0.0);
      }
   }

   @Override
   public boolean a(dmx $$0, jb $$1, eeb $$2) {
      return dqc.a_($$0, $$1, $$2);
   }

   @Override
   public boolean a(dmu $$0, bck $$1, jb $$2, eeb $$3) {
      return true;
   }

   @Override
   public void a(aub $$0, bck $$1, jb $$2, eeb $$3) {
      dqc.a((dmu)$$0, $$2, $$3).ifPresent($$1x -> $$0.c($$1x, this.m()));
   }
}
