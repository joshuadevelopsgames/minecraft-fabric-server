import java.util.function.ToIntFunction;
import org.joml.Vector3f;

class bym extends byo {
   private final float c;
   private final ToIntFunction<bck> d;

   protected bym(byp $$0, int $$1, float $$2, ToIntFunction<bck> $$3) {
      super($$0, $$1, me.G);
      this.c = $$2;
      this.d = $$3;
   }

   @Override
   public void a(aub $$0, cam $$1, int $$2, byb $$3, float $$4) {
      if ($$1.ec().i() <= this.c) {
         int $$5 = this.d.applyAsInt($$1.ec());

         for (int $$6 = 0; $$6 < $$5; $$6++) {
            this.a($$0, $$1, $$1.dC(), $$1.dE() + $$1.dt() / 2.0, $$1.dI());
         }
      }
   }

   private void a(aub $$0, cam $$1, double $$2, double $$3, double $$4) {
      csc $$5 = bzv.bg.a($$0, bzu.k);
      if ($$5 != null) {
         bck $$6 = $$1.ec();
         float $$7 = (float) (Math.PI / 2);
         float $$8 = bcb.b($$6, (float) (-Math.PI / 2), (float) (Math.PI / 2));
         Vector3f $$9 = $$1.bW().l().mul(0.3F).mul(1.0F, 1.5F, 1.0F).rotateY($$8);
         $$5.b($$2, $$3, $$4, $$0.H_().i() * 360.0F, 0.0F);
         $$5.i(new fis($$9));
         $$0.b($$5);
         $$5.a(ayz.yo);
      }
   }
}
