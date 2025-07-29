import com.mojang.serialization.MapCodec;

public class dpb extends dzl implements dqc {
   public static final MapCodec<dpb> a = b(dpb::new);
   private static final fjm b = fjj.a(dpz.b(16.0, 8.0, 16.0), dpz.b(4.0, 0.0, 8.0));

   @Override
   public MapCodec<dpb> a() {
      return a;
   }

   protected dpb(eea.d $$0) {
      super($$0);
   }

   @Override
   protected fjm a(eeb $$0, dly $$1, jb $$2, fix $$3) {
      return b;
   }

   @Override
   protected boolean b(eeb $$0, dly $$1, jb $$2) {
      return $$0.a(dqb.ei) || super.b($$0, $$1, $$2);
   }

   @Override
   public boolean a(dmx $$0, jb $$1, eeb $$2) {
      return $$0.b_($$1.d()).c();
   }

   @Override
   public boolean a(dmu $$0, bck $$1, jb $$2, eeb $$3) {
      return $$0.A.i() < 0.45;
   }

   @Override
   public void a(aub $$0, bck $$1, jb $$2, eeb $$3) {
      edp.e.a($$0, $$0.n().g(), $$2, $$3, $$1);
   }

   @Override
   protected boolean a(eeb $$0, fba $$1) {
      return false;
   }
}
