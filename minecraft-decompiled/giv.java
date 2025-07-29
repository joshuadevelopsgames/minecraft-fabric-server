public class giv extends giq {
   private static final xo a = xo.c("controls.title");

   private static fuh<?>[] a(fui $$0) {
      return new fuh[]{$$0.ag(), $$0.ah(), $$0.K(), $$0.M()};
   }

   public giv(get $$0, fui $$1) {
      super($$0, $$1, a);
   }

   @Override
   protected void l() {
      this.d
         .a(
            fxo.a(xo.c("options.mouse_settings"), $$0 -> this.n.a(new gin(this, this.c))).a(),
            fxo.a(xo.c("controls.keybinds"), $$0 -> this.n.a(new gix(this, this.c))).a()
         );
      this.d.a(a(this.c));
   }
}
