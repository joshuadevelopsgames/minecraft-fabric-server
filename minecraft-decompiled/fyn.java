public class fyn extends fxo {
   private final fwz a;
   private final xo b;
   private final xo c;

   public fyn(int $$0, int $$1, int $$2, int $$3, xo $$4, fxo.c $$5, fwz $$6) {
      super($$0, $$1, $$2, $$3, $$4, $$5, q);
      this.a = $$6;
      this.b = $$4;
      this.c = xr.a($$4.f(), yl.a.c(true));
   }

   @Override
   public void b(fxb $$0, int $$1, int $$2, float $$3) {
      xo $$4 = this.C() ? this.c : this.b;
      $$0.b(this.a, $$4, this.E(), this.F(), 16777215 | bcb.f(this.l * 255.0F) << 24);
   }
}
