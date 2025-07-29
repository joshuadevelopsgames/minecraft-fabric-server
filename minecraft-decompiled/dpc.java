import com.mojang.serialization.MapCodec;

public class dpc extends dpz implements dqc {
   public static final MapCodec<dpc> a = b(dpc::new);
   private static final fjm b = dpz.b(8.0, 0.0, 12.0);

   @Override
   public MapCodec<dpc> a() {
      return a;
   }

   public dpc(eea.d $$0) {
      super($$0);
   }

   @Override
   protected fjm a(eeb $$0, dly $$1, jb $$2, fix $$3) {
      return b.a($$0.a($$2));
   }

   @Override
   protected void b(eeb $$0, aub $$1, jb $$2, bck $$3) {
      if ($$3.a(3) == 0 && $$1.w($$2.d()) && $$1.b($$2.d(), 0) >= 9) {
         this.a($$1, $$2);
      }
   }

   @Override
   protected boolean a(eeb $$0, dmx $$1, jb $$2) {
      return $$1.a_($$2.e()).a(azo.aC);
   }

   @Override
   protected eeb a(eeb $$0, dmx $$1, dnj $$2, jb $$3, jh $$4, jb $$5, eeb $$6, bck $$7) {
      if (!$$0.a($$1, $$3)) {
         return dqb.a.m();
      } else {
         return $$4 == jh.b && $$6.a(dqb.nG) ? dqb.nG.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      }
   }

   @Override
   protected dcv a(dmx $$0, jb $$1, eeb $$2, boolean $$3) {
      return new dcv(dcz.ej);
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
      this.a($$0, $$2);
   }

   protected void a(dmu $$0, jb $$1) {
      $$0.a($$1.d(), dqb.nG.m().b(dpd.c, een.b), 3);
   }
}
