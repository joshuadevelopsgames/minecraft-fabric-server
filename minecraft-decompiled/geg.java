public class geg extends gdp {
   private fxo c;

   public geg() {
      super("");
   }

   @Override
   protected void aV_() {
      super.aV_();
      this.c = fxo.a(xo.c("multiplayer.stopSleeping"), $$0 -> this.m()).a(this.o / 2 - 100, this.p - 40, 200, 20).a();
      this.c(this.c);
   }

   @Override
   public void a(fxb $$0, int $$1, int $$2, float $$3) {
      if (!this.n.K().a(this.n.U())) {
         this.c.a($$0, $$1, $$2, $$3);
      } else {
         super.a($$0, $$1, $$2, $$3);
      }
   }

   @Override
   public void aP_() {
      this.m();
   }

   @Override
   public boolean a(char $$0, int $$1) {
      return !this.n.K().a(this.n.U()) ? true : super.a($$0, $$1);
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      if ($$0 == 256) {
         this.m();
      }

      if (!this.n.K().a(this.n.U())) {
         return true;
      } else if ($$0 != 257 && $$0 != 335) {
         return super.a($$0, $$1, $$2);
      } else {
         this.b(this.b.a(), true);
         this.b.a("");
         this.n.m.e().d();
         return true;
      }
   }

   private void m() {
      grl $$0 = this.n.t.j;
      $$0.b(new aiu(this.n.t, aiu.a.a));
   }

   public void l() {
      if (this.b.a().isEmpty()) {
         this.n.a(null);
      } else {
         this.n.a(new gdp(this.b.a()));
      }
   }
}
