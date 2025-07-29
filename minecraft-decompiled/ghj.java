public class ghj extends fxo {
   private static final ame a = ame.b("widget/page_forward_highlighted");
   private static final ame b = ame.b("widget/page_forward");
   private static final ame c = ame.b("widget/page_backward_highlighted");
   private static final ame d = ame.b("widget/page_backward");
   private static final xo u = xo.c("book.page_button.next");
   private static final xo v = xo.c("book.page_button.previous");
   private final boolean w;
   private final boolean x;

   public ghj(int $$0, int $$1, boolean $$2, fxo.c $$3, boolean $$4) {
      super($$0, $$1, 23, 13, $$2 ? u : v, $$3, q);
      this.w = $$2;
      this.x = $$4;
   }

   @Override
   public void b(fxb $$0, int $$1, int $$2, float $$3) {
      ame $$4;
      if (this.w) {
         $$4 = this.C() ? a : b;
      } else {
         $$4 = this.C() ? c : d;
      }

      $$0.a(gxx.ar, $$4, this.E(), this.F(), 23, 13);
   }

   @Override
   public void a(hwx $$0) {
      if (this.x) {
         $$0.a(hvm.a(ayz.cy, 1.0F));
      }
   }
}
