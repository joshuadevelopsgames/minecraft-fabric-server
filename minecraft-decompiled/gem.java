public class gem extends get {
   private static final xo a = xo.c("outOfMemory.title");
   private static final xo b = xo.c("outOfMemory.message");
   private static final int c = 300;
   private final gbk d = new gbk(this);

   public gem() {
      super(a);
   }

   @Override
   protected void aV_() {
      this.d.a(a, this.q);
      this.d.c(new fxz(300, b, this.q));
      gbo $$0 = this.d.b(gbo.e().a(8));
      $$0.a(fxo.a(xn.l, $$0x -> this.n.a(new gev())).a());
      $$0.a(fxo.a(xo.c("menu.quit"), $$0x -> this.n.q()).a());
      this.d.a(this::c);
      this.c();
   }

   @Override
   protected void c() {
      this.d.a();
   }

   @Override
   public boolean aG_() {
      return false;
   }
}
