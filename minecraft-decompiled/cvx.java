import java.util.Optional;

public class cvx extends cvv {
   private static final bzp a = bzp.c(0.0F, 0.0F);

   public cvx(bzv<? extends cvx> $$0, dmu $$1) {
      super($$0, $$1);
   }

   public cvx(dmu $$0, cam $$1, dcv $$2) {
      super(bzv.M, $$1, $$0, $$2);
   }

   public cvx(dmu $$0, double $$1, double $$2, double $$3, dcv $$4) {
      super(bzv.M, $$1, $$2, $$3, $$0, $$4);
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 3) {
         double $$1 = 0.08;

         for (int $$2 = 0; $$2 < 8; $$2++) {
            this.ai()
               .a(new ma(me.U, this.e()), this.dC(), this.dE(), this.dI(), (this.ar.i() - 0.5) * 0.08, (this.ar.i() - 0.5) * 0.08, (this.ar.i() - 0.5) * 0.08);
         }
      }
   }

   @Override
   protected void a(fip $$0) {
      super.a($$0);
      $$0.a().a(this.ea().b(this, this.ah_()), 0.0F);
   }

   @Override
   protected void a(fiq $$0) {
      super.a($$0);
      if (!this.ai().C) {
         if (this.ar.a(8) == 0) {
            int $$1 = 1;
            if (this.ar.a(32) == 0) {
               $$1 = 4;
            }

            for (int $$2 = 0; $$2 < $$1; $$2++) {
               cmj $$3 = bzv.A.a(this.ai(), bzu.k);
               if ($$3 != null) {
                  $$3.c_(-24000);
                  $$3.b(this.dC(), this.dE(), this.dI(), this.dP(), 0.0F);
                  Optional.ofNullable(this.e().a(kq.aJ)).flatMap($$0x -> $$0x.a(this.eb())).ifPresent($$3::b);
                  if (!$$3.a(a)) {
                     break;
                  }

                  this.ai().b($$3);
               }
            }
         }

         this.ai().a(this, (byte)3);
         this.at();
      }
   }

   @Override
   protected dcr f() {
      return dcz.rY;
   }
}
