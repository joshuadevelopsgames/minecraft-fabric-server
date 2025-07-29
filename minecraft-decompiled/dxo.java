import com.mojang.serialization.MapCodec;

public class dxo extends dtu {
   public static final MapCodec<dxo> a = b(dxo::new);

   @Override
   public MapCodec<dxo> a() {
      return a;
   }

   public dxo(eea.d $$0) {
      super($$0);
   }

   @Override
   public void a(dmu $$0, eeb $$1, jb $$2, bzm $$3, double $$4) {
      if (!$$3.ci()) {
         $$3.a($$4, 0.0F, $$0.al().l());
      }
   }

   @Override
   public void a(dly $$0, bzm $$1) {
      if ($$1.ci()) {
         super.a($$0, $$1);
      } else {
         this.a($$1);
      }
   }

   private void a(bzm $$0) {
      fis $$1 = $$0.dA();
      if ($$1.e < 0.0) {
         double $$2 = $$0 instanceof cam ? 1.0 : 0.8;
         $$0.n($$1.d, -$$1.e * $$2, $$1.f);
      }
   }

   @Override
   public void a(dmu $$0, jb $$1, eeb $$2, bzm $$3) {
      double $$4 = Math.abs($$3.dA().e);
      if ($$4 < 0.1 && !$$3.ch()) {
         double $$5 = 0.4 + $$4 * 0.2;
         $$3.i($$3.dA().d($$5, 1.0, $$5));
      }

      super.a($$0, $$1, $$2, $$3);
   }
}
