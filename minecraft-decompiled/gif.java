public class gif extends get {
   private static final int a = 600;
   private final wd b;
   private fxo c;
   private int d;
   private final gbo e = gbo.d();

   public gif(xo $$0, wd $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public boolean aG_() {
      return false;
   }

   @Override
   protected void aV_() {
      this.e.c().b().a(10);
      this.e.a(new fyx(this.m, this.q));
      this.c = this.e.a(fxo.a(xn.p, $$0 -> this.b.a(gds.a)).a());
      this.c.j = false;
      this.e.a();
      this.e.a($$1 -> {
         fxm var10000 = this.c($$1);
      });
      this.c();
   }

   @Override
   protected void c() {
      gbi.a(this.e, this.I());
   }

   @Override
   public void e() {
      super.e();
      this.d++;
      if (this.d == 600) {
         this.c.j = true;
      }

      if (this.b.i()) {
         this.b.b();
      } else {
         this.b.n();
      }
   }
}
