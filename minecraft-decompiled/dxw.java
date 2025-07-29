import com.mojang.serialization.MapCodec;

public class dxw extends dpz {
   public static final MapCodec<dxw> a = b(dxw::new);
   private static final fjm b = dpz.b(16.0, 0.0, 14.0);
   private static final int c = 20;

   @Override
   public MapCodec<dxw> a() {
      return a;
   }

   public dxw(eea.d $$0) {
      super($$0);
   }

   @Override
   protected fjm b(eeb $$0, dly $$1, jb $$2, fix $$3) {
      return b;
   }

   @Override
   protected fjm b_(eeb $$0, dly $$1, jb $$2) {
      return fjj.b();
   }

   @Override
   protected fjm c(eeb $$0, dly $$1, jb $$2, fix $$3) {
      return fjj.b();
   }

   @Override
   protected void a(eeb $$0, aub $$1, jb $$2, bck $$3) {
      dqg.b($$1, $$2.d(), $$0);
   }

   @Override
   protected eeb a(eeb $$0, dmx $$1, dnj $$2, jb $$3, jh $$4, jb $$5, eeb $$6, bck $$7) {
      if ($$4 == jh.b && $$6.a(dqb.J)) {
         $$2.a($$3, this, 20);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected void a(eeb $$0, dmu $$1, jb $$2, eeb $$3, boolean $$4) {
      $$1.a($$2, this, 20);
   }

   @Override
   protected boolean a(eeb $$0, fba $$1) {
      return false;
   }

   @Override
   protected float c(eeb $$0, dly $$1, jb $$2) {
      return 0.2F;
   }
}
