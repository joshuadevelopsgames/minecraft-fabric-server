import com.mojang.serialization.MapCodec;

public class dxi extends dsn implements dqc {
   public static final MapCodec<dxi> b = b(dxi::new);
   private static final fjm c = dpz.b(12.0, 0.0, 10.0);

   @Override
   public MapCodec<dxi> a() {
      return b;
   }

   protected dxi(eea.d $$0) {
      super($$0);
   }

   @Override
   protected fjm a(eeb $$0, dly $$1, jb $$2, fix $$3) {
      return c;
   }

   @Override
   public void a(eeb $$0, dmu $$1, jb $$2, bck $$3) {
      edz.b($$1, $$2, $$3);
   }

   @Override
   public boolean a(dmx $$0, jb $$1, eeb $$2) {
      return true;
   }

   @Override
   public boolean a(dmu $$0, bck $$1, jb $$2, eeb $$3) {
      return true;
   }

   @Override
   public void a(aub $$0, bck $$1, jb $$2, eeb $$3) {
      $$0.c($$2, dqb.bF.m());
   }
}
