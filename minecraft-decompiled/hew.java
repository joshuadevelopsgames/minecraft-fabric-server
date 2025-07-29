public abstract class hew<T extends cao, S extends hlh, M extends gnx<S>> extends hcy<T, S, M> {
   public hew(hee.a $$0, M $$1, float $$2) {
      this($$0, $$1, $$1, $$2);
   }

   public hew(hee.a $$0, M $$1, M $$2, float $$3) {
      this($$0, $$1, $$2, $$3, hhy.a.a);
   }

   public hew(hee.a $$0, M $$1, M $$2, float $$3, hhy.a $$4) {
      super($$0, $$1, $$2, $$3);
      this.a(new hhy<>(this, $$0.f(), $$4));
      this.a(new hjg<>(this, $$0.f(), $$0.h()));
      this.a(new hil<>(this));
   }

   protected gnx.a a(T $$0, cad $$1) {
      return gnx.a.a;
   }

   public void a(T $$0, S $$1, float $$2) {
      super.a($$0, $$1, $$2);
      a($$0, $$1, $$2, this.i);
      $$1.h = this.a($$0, cad.a);
      $$1.f = this.a($$0, cad.b);
   }

   public static void a(cam $$0, hlh $$1, float $$2, hof $$3) {
      hjr.a($$0, $$1, $$3);
      $$1.Q = $$0.cl();
      $$1.R = $$0.fQ();
      $$1.S = $$0.co();
      $$1.T = $$0.cc();
      $$1.L = 1.0F;
      if ($$1.R) {
         $$1.L = (float)$$0.dA().h();
         $$1.L /= 0.2F;
         $$1.L = $$1.L * ($$1.L * $$1.L);
      }

      if ($$1.L < 1.0F) {
         $$1.L = 1.0F;
      }

      $$1.K = $$0.D($$2);
      $$1.J = $$0.b($$2);
      $$1.O = c($$0);
      $$1.P = $$0.fH();
      $$1.M = dbo.b($$0.fI(), $$0);
      $$1.N = $$0.fK();
      $$1.U = $$0.fG();
      $$1.V = $$0.bv.a($$2);
      $$1.W = $$0.bv.b($$2);
      $$1.X = $$0.bv.c($$2);
      $$1.Y = a($$0, bzw.f);
      $$1.Z = a($$0, bzw.e);
      $$1.aa = a($$0, bzw.d);
      $$1.ab = a($$0, bzw.c);
   }

   private static dcv a(cam $$0, bzw $$1) {
      dcv $$2 = $$0.a($$1);
      return hii.a($$2, $$1) ? $$2.v() : dcv.l;
   }

   private static cad c(cam $$0) {
      cad $$1 = $$0.fF();
      return $$0.bf == bxi.a ? $$1 : $$1.e();
   }
}
