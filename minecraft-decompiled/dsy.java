import com.mojang.serialization.MapCodec;

public abstract class dsy extends dpz implements dsx {
   public dsy(eea.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends dsy> a();

   @Override
   protected void a(eeb $$0, dmu $$1, jb $$2, eeb $$3, boolean $$4) {
      $$1.a($$2, this, this.b());
   }

   @Override
   protected eeb a(eeb $$0, dmx $$1, dnj $$2, jb $$3, jh $$4, jb $$5, eeb $$6, bck $$7) {
      $$2.a($$3, this, this.b());
      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected void a(eeb $$0, aub $$1, jb $$2, bck $$3) {
      if (n($$1.a_($$2.e())) && $$2.v() >= $$1.L_()) {
         cqy $$4 = cqy.a($$1, $$2, $$0);
         this.a($$4);
      }
   }

   protected void a(cqy $$0) {
   }

   protected int b() {
      return 2;
   }

   public static boolean n(eeb $$0) {
      return $$0.l() || $$0.a(azo.aQ) || $$0.n() || $$0.v();
   }

   @Override
   public void a(eeb $$0, dmu $$1, jb $$2, bck $$3) {
      if ($$3.a(16) == 0) {
         jb $$4 = $$2.e();
         if (n($$1.a_($$4))) {
            bcf.a($$1, $$2, $$3, new lw(me.C, $$0));
         }
      }
   }

   public abstract int b(eeb var1, dly var2, jb var3);
}
