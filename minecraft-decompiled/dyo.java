import com.mojang.serialization.MapCodec;

public class dyo extends dsn implements dqc {
   public static final MapCodec<dyo> b = b(dyo::new);
   private static final fjm c = dpz.b(14.0, 0.0, 16.0);

   @Override
   public MapCodec<dyo> a() {
      return b;
   }

   protected dyo(eea.d $$0) {
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
      return dqc.a_($$0, $$1, dqb.bE.m());
   }

   @Override
   public boolean a(dmu $$0, bck $$1, jb $$2, eeb $$3) {
      return true;
   }

   @Override
   public void a(aub $$0, bck $$1, jb $$2, eeb $$3) {
      dqc.a((dmu)$$0, $$2, dqb.bE.m()).ifPresent($$1x -> $$0.c($$1x, dqb.bE.m()));
   }
}
