import java.util.List;

public class cvf extends cvc {
   public static final float d = 4.0F;

   public cvf(bzv<? extends cvf> $$0, dmu $$1) {
      super($$0, $$1);
   }

   public cvf(dmu $$0, cam $$1, fis $$2) {
      super(bzv.K, $$1, $$2, $$0);
   }

   @Override
   protected void a(fiq $$0) {
      super.a($$0);
      if ($$0.d() != fiq.a.c || !this.e(((fip)$$0).a())) {
         if (!this.ai().C) {
            List<cam> $$1 = this.ai().a(cam.class, this.cV().c(4.0, 2.0, 4.0));
            bze $$2 = new bze(this.ai(), this.dC(), this.dE(), this.dI());
            bzm $$3 = this.ah_();
            if ($$3 instanceof cam) {
               $$2.a((cam)$$3);
            }

            $$2.a(me.h);
            $$2.a(3.0F);
            $$2.a(600);
            $$2.d((7.0F - $$2.c()) / $$2.h());
            $$2.b(0.25F);
            $$2.a(new byq(bys.g, 1, 1));
            if (!$$1.isEmpty()) {
               for (cam $$4 : $$1) {
                  double $$5 = this.g($$4);
                  if ($$5 < 16.0) {
                     $$2.a_($$4.dC(), $$4.dE(), $$4.dI());
                     break;
                  }
               }
            }

            this.ai().c(2006, this.dx(), this.be() ? -1 : 1);
            this.ai().b($$2);
            this.at();
         }
      }
   }

   @Override
   protected mc i() {
      return me.h;
   }

   @Override
   protected boolean f() {
      return false;
   }
}
