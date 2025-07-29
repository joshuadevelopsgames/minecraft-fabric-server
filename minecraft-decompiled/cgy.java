public class cgy extends chm {
   private static final int[] a = new int[]{0, 1, 4, 5, 6, 7};
   private final cmq b;
   private final int c;
   private boolean d;

   public cgy(cmq $$0, int $$1) {
      this.b = $$0;
      this.c = b($$1);
   }

   @Override
   public boolean b() {
      if (this.b.ec().a(this.c) != 0) {
         return false;
      } else {
         jh $$0 = this.b.cT();
         int $$1 = $$0.j();
         int $$2 = $$0.l();
         jb $$3 = this.b.dx();

         for (int $$4 : a) {
            if (!this.a($$3, $$1, $$2, $$4) || !this.b($$3, $$1, $$2, $$4)) {
               return false;
            }
         }

         return true;
      }
   }

   private boolean a(jb $$0, int $$1, int $$2, int $$3) {
      jb $$4 = $$0.b($$1 * $$3, 0, $$2 * $$3);
      return this.b.ai().b_($$4).a(azu.a) && !this.b.ai().a_($$4).d();
   }

   private boolean b(jb $$0, int $$1, int $$2, int $$3) {
      return this.b.ai().a_($$0.b($$1 * $$3, 1, $$2 * $$3)).l() && this.b.ai().a_($$0.b($$1 * $$3, 2, $$2 * $$3)).l();
   }

   @Override
   public boolean c() {
      double $$0 = this.b.dA().e;
      return (!($$0 * $$0 < 0.03F) || this.b.dR() == 0.0F || !(Math.abs(this.b.dR()) < 10.0F) || !this.b.bm()) && !this.b.aK();
   }

   @Override
   public boolean W_() {
      return false;
   }

   @Override
   public void d() {
      jh $$0 = this.b.cT();
      this.b.i(this.b.dA().b($$0.j() * 0.6, 0.7, $$0.l() * 0.6));
      this.b.S().n();
   }

   @Override
   public void e() {
      this.b.w(0.0F);
   }

   @Override
   public void a() {
      boolean $$0 = this.d;
      if (!$$0) {
         fal $$1 = this.b.ai().b_(this.b.dx());
         this.d = $$1.a(azu.a);
      }

      if (this.d && !$$0) {
         this.b.a(ayz.hz, 1.0F, 1.0F);
      }

      fis $$2 = this.b.dA();
      if ($$2.e * $$2.e < 0.03F && this.b.dR() != 0.0F) {
         this.b.w(bcb.i(0.2F, this.b.dR(), 0.0F));
      } else if ($$2.g() > 1.0E-5F) {
         double $$3 = $$2.i();
         double $$4 = Math.atan2(-$$2.e, $$3) * 180.0F / (float)Math.PI;
         this.b.w((float)$$4);
      }
   }
}
