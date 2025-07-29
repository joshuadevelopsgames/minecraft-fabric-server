import com.mojang.serialization.MapCodec;

public class dse extends dpz {
   public static final MapCodec<dse> a = b(dse::new);
   private static final fjm b = dpz.b(16.0, 0.0, 15.0);

   @Override
   public MapCodec<dse> a() {
      return a;
   }

   protected dse(eea.d $$0) {
      super($$0);
   }

   @Override
   protected boolean g_(eeb $$0) {
      return true;
   }

   @Override
   public eeb a(dgo $$0) {
      return !this.m().a((dmx)$$0.q(), $$0.a()) ? dpz.a(this.m(), dqb.j.m(), $$0.q(), $$0.a()) : super.a($$0);
   }

   @Override
   protected eeb a(eeb $$0, dmx $$1, dnj $$2, jb $$3, jh $$4, jb $$5, eeb $$6, bck $$7) {
      if ($$4 == jh.b && !$$0.a($$1, $$3)) {
         $$2.a($$3, this, 1);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected void a(eeb $$0, aub $$1, jb $$2, bck $$3) {
      dsz.a(null, $$0, $$1, $$2);
   }

   @Override
   protected boolean a(eeb $$0, dmx $$1, jb $$2) {
      eeb $$3 = $$1.a_($$2.d());
      return !$$3.e() || $$3.b() instanceof dtb;
   }

   @Override
   protected fjm a(eeb $$0, dly $$1, jb $$2, fix $$3) {
      return b;
   }

   @Override
   protected boolean a(eeb $$0, fba $$1) {
      return false;
   }
}
