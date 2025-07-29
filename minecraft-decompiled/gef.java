import javax.annotation.Nullable;

public class gef extends get {
   private static final int a = 80;
   private static final int b = 120;
   private static final int c = 360;
   @Nullable
   private final xo d;
   private final xo e;
   private final Runnable f;
   @Nullable
   private fyi u;
   private fxo v;
   private int w;

   public static gef a(xo $$0, xo $$1, Runnable $$2) {
      return new gef($$0, null, $$1, $$2, 0);
   }

   public static gef a(xo $$0, xo $$1, xo $$2, Runnable $$3) {
      return new gef($$0, $$1, $$2, $$3, 20);
   }

   protected gef(xo $$0, @Nullable xo $$1, xo $$2, Runnable $$3, int $$4) {
      super($$0);
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
      this.w = $$4;
   }

   @Override
   protected void aV_() {
      super.aV_();
      if (this.d != null) {
         this.u = fyi.a(this.q, this.d, 360);
      }

      int $$0 = 150;
      int $$1 = 20;
      int $$2 = this.u != null ? this.u.a() : 1;
      int $$3 = Math.max($$2, 5) * 9;
      int $$4 = Math.min(120 + $$3, this.p - 40);
      this.v = this.c(fxo.a(this.e, $$0x -> this.aP_()).a((this.o - 150) / 2, $$4, 150, 20).a());
   }

   @Override
   public void e() {
      if (this.w > 0) {
         this.w--;
      }

      this.v.j = this.w == 0;
   }

   @Override
   public void a(fxb $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.q, this.m, this.o / 2, 80, -1);
      if (this.u == null) {
         String $$4 = gei.a(ag.c());
         $$0.a(this.q, $$4, this.o / 2, 120, -6250336);
      } else {
         this.u.a($$0, this.o / 2, 120);
      }
   }

   @Override
   public boolean aG_() {
      return this.u != null && this.v.j;
   }

   @Override
   public void aP_() {
      this.f.run();
   }

   @Override
   public xo i() {
      return xn.a(this.m, this.d != null ? this.d : xn.a);
   }
}
