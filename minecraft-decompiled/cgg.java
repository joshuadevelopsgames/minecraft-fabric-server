public class cgg implements cgh {
   private final cao a;
   private static final int b = 15;
   private static final int c = 10;
   private static final int d = 10;
   private int e;
   private float f;

   public cgg(cao $$0) {
      this.a = $$0;
   }

   public void a() {
      if (this.f()) {
         this.a.br = this.a.dP();
         this.c();
         this.f = this.a.bt;
         this.e = 0;
      } else {
         if (this.e()) {
            if (Math.abs(this.a.bt - this.f) > 15.0F) {
               this.e = 0;
               this.f = this.a.bt;
               this.b();
            } else {
               this.e++;
               if (this.e > 10) {
                  this.d();
               }
            }
         }
      }
   }

   private void b() {
      this.a.br = bcb.c(this.a.br, this.a.bt, (float)this.a.gh());
   }

   private void c() {
      this.a.bt = bcb.c(this.a.bt, this.a.br, (float)this.a.gh());
   }

   private void d() {
      int $$0 = this.e - 10;
      float $$1 = bcb.a($$0 / 10.0F, 0.0F, 1.0F);
      float $$2 = this.a.gh() * (1.0F - $$1);
      this.a.br = bcb.c(this.a.br, this.a.bt, $$2);
   }

   private boolean e() {
      return !(this.a.db() instanceof cao);
   }

   private boolean f() {
      double $$0 = this.a.dC() - this.a.X;
      double $$1 = this.a.dI() - this.a.Z;
      return $$0 * $$0 + $$1 * $$1 > 2.5000003E-7F;
   }
}
