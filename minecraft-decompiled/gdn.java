public class gdn extends get {
   private static final xo e = xo.c("selectWorld.backupJoinSkipButton");
   public static final xo a = xo.c("selectWorld.backupJoinConfirmButton");
   private final Runnable f;
   protected final gdn.a b;
   private final xo u;
   private final boolean v;
   private fyi w = fyi.a;
   final xo c;
   protected int d;
   private fxq x;

   public gdn(Runnable $$0, gdn.a $$1, xo $$2, xo $$3, boolean $$4) {
      this($$0, $$1, $$2, $$3, a, $$4);
   }

   public gdn(Runnable $$0, gdn.a $$1, xo $$2, xo $$3, xo $$4, boolean $$5) {
      super($$2);
      this.f = $$0;
      this.b = $$1;
      this.u = $$3;
      this.v = $$5;
      this.c = $$4;
   }

   @Override
   protected void aV_() {
      super.aV_();
      this.w = fyi.a(this.q, this.u, this.o - 50);
      int $$0 = (this.w.a() + 1) * 9;
      this.x = fxq.a(xo.c("selectWorld.backupEraseCache"), this.q).a(this.o / 2 - 155 + 80, 76 + $$0).a();
      if (this.v) {
         this.c(this.x);
      }

      this.c(fxo.a(this.c, $$0x -> this.b.proceed(true, this.x.a())).a(this.o / 2 - 155, 100 + $$0, 150, 20).a());
      this.c(fxo.a(e, $$0x -> this.b.proceed(false, this.x.a())).a(this.o / 2 - 155 + 160, 100 + $$0, 150, 20).a());
      this.c(fxo.a(xn.e, $$0x -> this.f.run()).a(this.o / 2 - 155 + 80, 124 + $$0, 150, 20).a());
   }

   @Override
   public void a(fxb $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.q, this.m, this.o / 2, 50, -1);
      this.w.a($$0, this.o / 2, 70);
   }

   @Override
   public boolean aG_() {
      return false;
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      if ($$0 == 256) {
         this.f.run();
         return true;
      } else {
         return super.a($$0, $$1, $$2);
      }
   }

   public interface a {
      void proceed(boolean var1, boolean var2);
   }
}
