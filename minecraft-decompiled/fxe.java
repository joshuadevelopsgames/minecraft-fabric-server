public abstract class fxe extends fxm {
   protected static final int e = 2;
   private static final fzd a = new fzd(ame.b("widget/button"), ame.b("widget/button_disabled"), ame.b("widget/button_highlighted"));

   public fxe(int $$0, int $$1, int $$2, int $$3, xo $$4) {
      super($$0, $$1, $$2, $$3, $$4);
   }

   public abstract void b();

   @Override
   protected void b(fxb $$0, int $$1, int $$2, float $$3) {
      fue $$4 = fue.R();
      $$0.a(gxx.ar, a.a(this.j, this.C()), this.E(), this.F(), this.z(), this.y(), baj.a(this.l));
      int $$5 = baj.a(this.l, this.j ? -1 : -6250336);
      this.a($$0, $$4.h, $$5);
   }

   public void a(fxb $$0, fwz $$1, int $$2) {
      this.a($$0, $$1, 2, $$2);
   }

   @Override
   public void a(double $$0, double $$1) {
      this.b();
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      if (!this.j || !this.k) {
         return false;
      } else if (gby.a($$0)) {
         this.a(fue.R().al());
         this.b();
         return true;
      } else {
         return false;
      }
   }
}
