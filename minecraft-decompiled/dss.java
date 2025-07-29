import com.mojang.serialization.MapCodec;

public class dss extends dwq {
   public static final MapCodec<dss> b = b(dss::new);

   @Override
   public MapCodec<dss> a() {
      return b;
   }

   protected dss(eea.d $$0) {
      super($$0);
      this.l(this.C.b().b(a, jh.b));
   }

   @Override
   public eeb a(dgo $$0) {
      jh $$1 = $$0.k();
      eeb $$2 = $$0.q().a_($$0.a().a($$1.g()));
      return $$2.a(this) && $$2.c(a) == $$1 ? this.m().b(a, $$1.g()) : this.m().b(a, $$1);
   }

   @Override
   public void a(eeb $$0, dmu $$1, jb $$2, bck $$3) {
      jh $$4 = $$0.c(a);
      double $$5 = $$2.u() + 0.55 - $$3.i() * 0.1F;
      double $$6 = $$2.v() + 0.55 - $$3.i() * 0.1F;
      double $$7 = $$2.w() + 0.55 - $$3.i() * 0.1F;
      double $$8 = 0.4F - ($$3.i() + $$3.i()) * 0.4F;
      if ($$3.a(5) == 0) {
         $$1.a(me.t, $$5 + $$4.j() * $$8, $$6 + $$4.k() * $$8, $$7 + $$4.l() * $$8, $$3.k() * 0.005, $$3.k() * 0.005, $$3.k() * 0.005);
      }
   }

   @Override
   protected void a(eec.a<dpz, eeb> $$0) {
      $$0.a(a);
   }
}
