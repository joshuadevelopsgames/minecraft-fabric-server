import com.mojang.serialization.MapCodec;

public class dqj extends dzl implements dqc {
   public static final MapCodec<dqj> a = b(dqj::new);
   private static final fjm b = dpz.b(16.0, 0.0, 13.0);

   @Override
   public MapCodec<dqj> a() {
      return a;
   }

   protected dqj(eea.d $$0) {
      super($$0);
   }

   @Override
   protected fjm a(eeb $$0, dly $$1, jb $$2, fix $$3) {
      return b;
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
