import com.mojang.serialization.MapCodec;

public class dxv extends dpm {
   public static final MapCodec<dxv> b = b(dxv::new);

   @Override
   public MapCodec<dxv> a() {
      return b;
   }

   public dxv(eea.d $$0) {
      super($$0, 2.0F);
   }

   @Override
   protected eeb a(eeb $$0, dmx $$1, dnj $$2, jb $$3, jh $$4, jb $$5, eeb $$6, bck $$7) {
      return this.a($$0, $$1, $$3) ? this.m() : dqb.a.m();
   }

   @Override
   protected boolean a(eeb $$0, dmx $$1, jb $$2) {
      return o($$1.a_($$2.e()));
   }

   public static boolean o(eeb $$0) {
      return $$0.a(azo.S);
   }

   @Override
   protected boolean g(eeb $$0) {
      return true;
   }
}
