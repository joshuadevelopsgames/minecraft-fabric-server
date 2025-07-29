import javax.annotation.Nullable;

public class gfq extends get {
   private static final xo a = xo.c("gui.waitingForResponse.title");
   private static final xo[] b = new xo[]{
      xo.i(),
      xo.a("gui.waitingForResponse.button.inactive", 4),
      xo.a("gui.waitingForResponse.button.inactive", 3),
      xo.a("gui.waitingForResponse.button.inactive", 2),
      xo.a("gui.waitingForResponse.button.inactive", 1),
      xn.k
   };
   private static final int c = 1;
   private static final int d = 5;
   @Nullable
   private final get e;
   private final gbk f;
   private final fxo u;
   private int v;

   public gfq(@Nullable get $$0) {
      super(a);
      this.e = $$0;
      this.f = new gbk(this, 33, 0);
      this.u = fxo.a(xn.k, $$0x -> this.aP_()).a(200).a();
   }

   @Override
   protected void aV_() {
      super.aV_();
      this.f.a(a, this.q);
      this.f.c(this.u);
      this.u.k = false;
      this.u.j = false;
      this.f.a($$1 -> {
         fxm var10000 = this.c($$1);
      });
      this.c();
   }

   @Override
   protected void c() {
      this.f.a();
      gbi.a(this.f, this.I());
   }

   @Override
   public void e() {
      super.e();
      if (!this.u.j) {
         int $$0 = this.v++ / 20;
         this.u.k = $$0 >= 1;
         this.u.b(b[$$0]);
         if ($$0 == 5) {
            this.u.j = true;
            this.d(true);
         }
      }
   }

   @Override
   public boolean aQ_() {
      return false;
   }

   @Override
   public boolean aG_() {
      return this.u.j;
   }

   @Override
   public void aP_() {
      this.n.a(this.e);
   }

   @Nullable
   public get l() {
      return this.e;
   }
}
