import com.mojang.serialization.MapCodec;

public abstract class dzl extends dpz {
   protected dzl(eea.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends dzl> a();

   protected boolean b(eeb $$0, dly $$1, jb $$2) {
      return $$0.a(azo.ad) || $$0.a(dqb.cN);
   }

   @Override
   protected eeb a(eeb $$0, dmx $$1, dnj $$2, jb $$3, jh $$4, jb $$5, eeb $$6, bck $$7) {
      return !$$0.a($$1, $$3) ? dqb.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected boolean a(eeb $$0, dmx $$1, jb $$2) {
      jb $$3 = $$2.e();
      return this.b($$1.a_($$3), $$1, $$3);
   }

   @Override
   protected boolean e_(eeb $$0) {
      return $$0.y().c();
   }

   @Override
   protected boolean a(eeb $$0, fba $$1) {
      return $$1 == fba.c && !this.F ? true : super.a($$0, $$1);
   }
}
