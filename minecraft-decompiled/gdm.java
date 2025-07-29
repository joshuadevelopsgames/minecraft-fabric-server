public class gdm extends get {
   private static final int a = 90;
   private final xo b;
   private fyi c = fyi.a;
   private final Runnable d;
   private final xo e;
   private final boolean f;

   public gdm(Runnable $$0, xo $$1, xo $$2) {
      this($$0, $$1, $$2, xn.k, true);
   }

   public gdm(Runnable $$0, xo $$1, xo $$2, xo $$3, boolean $$4) {
      super($$1);
      this.d = $$0;
      this.b = $$2;
      this.e = $$3;
      this.f = $$4;
   }

   @Override
   public xo i() {
      return xn.a(super.i(), this.b);
   }

   @Override
   protected void aV_() {
      super.aV_();
      this.c = fyi.a(this.q, this.b, this.o - 50);
      int $$0 = this.c.a() * 9;
      int $$1 = bcb.a(90 + $$0 + 12, this.p / 6 + 96, this.p - 24);
      int $$2 = 150;
      this.c(fxo.a(this.e, $$0x -> this.d.run()).a((this.o - 150) / 2, $$1, 150, 20).a());
   }

   @Override
   public void a(fxb $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.q, this.m, this.o / 2, 70, -1);
      this.c.a($$0, this.o / 2, 90);
   }

   @Override
   public boolean aG_() {
      return this.f;
   }
}
