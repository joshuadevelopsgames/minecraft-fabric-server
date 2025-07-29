public class gun extends gut {
   private static final int a = 3;
   private final bzm b;
   private final bzm D;
   private int E;
   private final hec F;
   private double G;
   private double H;
   private double I;
   private double J;
   private double K;
   private double L;

   public gun(hec $$0, grk $$1, bzm $$2, bzm $$3) {
      this($$0, $$1, $$2, $$3, $$2.dA());
   }

   private gun(hec $$0, grk $$1, bzm $$2, bzm $$3, fis $$4) {
      super($$1, $$2.dC(), $$2.dE(), $$2.dI(), $$4.d, $$4.e, $$4.f);
      this.b = this.a($$2);
      this.D = $$3;
      this.F = $$0;
      this.c();
      this.d();
   }

   private bzm a(bzm $$0) {
      return (bzm)(!($$0 instanceof cqz) ? $$0 : ((cqz)$$0).u());
   }

   @Override
   public gux b() {
      return gux.d;
   }

   @Override
   public void a(fod $$0, gxn $$1, ftm $$2, float $$3) {
      float $$4 = (this.E + $$3) / 3.0F;
      $$4 *= $$4;
      double $$5 = bcb.d((double)$$3, this.J, this.G);
      double $$6 = bcb.d((double)$$3, this.K, this.H);
      double $$7 = bcb.d((double)$$3, this.L, this.I);
      double $$8 = bcb.d((double)$$4, this.b.dC(), $$5);
      double $$9 = bcb.d((double)$$4, this.b.dE(), $$6);
      double $$10 = bcb.d((double)$$4, this.b.dI(), $$7);
      fis $$11 = $$2.d();
      this.F.a(this.b, $$8 - $$11.a(), $$9 - $$11.b(), $$10 - $$11.c(), $$3, new fod(), $$1, this.F.a(this.b, $$3));
   }

   @Override
   public void a(fog $$0, ftm $$1, float $$2) {
   }

   @Override
   public void a() {
      this.E++;
      if (this.E == 3) {
         this.k();
      }

      this.d();
      this.c();
   }

   private void c() {
      this.G = this.D.dC();
      this.H = (this.D.dE() + this.D.dG()) / 2.0;
      this.I = this.D.dI();
   }

   private void d() {
      this.J = this.G;
      this.K = this.H;
      this.L = this.I;
   }
}
