public class fyz extends fxm {
   private static final fzd a = new fzd(
      ame.b("widget/tab_selected"), ame.b("widget/tab"), ame.b("widget/tab_selected_highlighted"), ame.b("widget/tab_highlighted")
   );
   private static final int b = 3;
   private static final int c = 1;
   private static final int d = 1;
   private static final int e = 4;
   private static final int f = 2;
   private final fzv m;
   private final fzu n;

   public fyz(fzv $$0, fzu $$1, int $$2, int $$3) {
      super(0, 0, $$2, $$3, $$1.b());
      this.m = $$0;
      this.n = $$1;
   }

   @Override
   public void b(fxb $$0, int $$1, int $$2, float $$3) {
      $$0.a(gxx.ar, a.a(this.c(), this.C()), this.E(), this.F(), this.g, this.h);
      fwz $$4 = fue.R().h;
      int $$5 = this.j ? -1 : -6250336;
      if (this.c()) {
         this.a($$0, this.E() + 2, this.F() + 2, this.G() - 2, this.H());
         this.b($$0, $$4, $$5);
      }

      this.a($$0, $$4, $$5);
   }

   protected void a(fxb $$0, int $$1, int $$2, int $$3, int $$4) {
      get.a($$0, get.g, $$1, $$2, 0.0F, 0.0F, $$3 - $$1, $$4 - $$2);
   }

   public void a(fxb $$0, fwz $$1, int $$2) {
      int $$3 = this.E() + 1;
      int $$4 = this.F() + (this.c() ? 0 : 3);
      int $$5 = this.E() + this.z() - 1;
      int $$6 = this.F() + this.y();
      a($$0, $$1, this.A(), $$3, $$4, $$5, $$6, $$2);
   }

   private void b(fxb $$0, fwz $$1, int $$2) {
      int $$3 = Math.min($$1.a(this.A()), this.z() - 4);
      int $$4 = this.E() + (this.z() - $$3) / 2;
      int $$5 = this.F() + this.y() - 2;
      $$0.a($$4, $$5, $$4 + $$3, $$5 + 1, $$2);
   }

   @Override
   protected void a(gbt $$0) {
      $$0.a(gbs.a, xo.a("gui.narrate.tab", this.n.b()));
      $$0.a(gbs.c, this.n.aS_());
   }

   @Override
   public void a(hwx $$0) {
   }

   public fzu a() {
      return this.n;
   }

   public boolean c() {
      return this.m.a() == this.n;
   }
}
