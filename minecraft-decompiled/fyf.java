public class fyf extends fxo {
   private boolean a;

   public fyf(int $$0, int $$1, fxo.c $$2) {
      super($$0, $$1, 20, 20, xo.c("narrator.button.difficulty_lock"), $$2, q);
   }

   @Override
   protected yc d() {
      return xn.a(super.d(), this.a() ? xo.c("narrator.button.difficulty_lock.locked") : xo.c("narrator.button.difficulty_lock.unlocked"));
   }

   public boolean a() {
      return this.a;
   }

   public void b(boolean $$0) {
      this.a = $$0;
   }

   @Override
   public void b(fxb $$0, int $$1, int $$2, float $$3) {
      fyf.a $$4;
      if (!this.j) {
         $$4 = this.a ? fyf.a.c : fyf.a.f;
      } else if (this.C()) {
         $$4 = this.a ? fyf.a.b : fyf.a.e;
      } else {
         $$4 = this.a ? fyf.a.a : fyf.a.d;
      }

      $$0.a(gxx.ar, $$4.g, this.E(), this.F(), this.g, this.h);
   }

   static enum a {
      a(ame.b("widget/locked_button")),
      b(ame.b("widget/locked_button_highlighted")),
      c(ame.b("widget/locked_button_disabled")),
      d(ame.b("widget/unlocked_button")),
      e(ame.b("widget/unlocked_button_highlighted")),
      f(ame.b("widget/unlocked_button_disabled"));

      final ame g;

      private a(final ame $$0) {
         this.g = $$0;
      }
   }
}
