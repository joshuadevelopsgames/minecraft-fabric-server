public class gdy extends get {
   private static final ame a = ame.b("textures/gui/demo_background.png");
   private static final int b = 256;
   private static final int c = 256;
   private fyi d = fyi.a;
   private fyi e = fyi.a;

   public gdy() {
      super(xo.c("demo.help.title"));
   }

   @Override
   protected void aV_() {
      int $$0 = -16;
      this.c(fxo.a(xo.c("demo.help.buy"), $$0x -> {
         $$0x.j = false;
         ag.n().a(bav.f);
      }).a(this.o / 2 - 116, this.p / 2 + 62 + -16, 114, 20).a());
      this.c(fxo.a(xo.c("demo.help.later"), $$0x -> {
         this.n.a(null);
         this.n.o.i();
      }).a(this.o / 2 + 2, this.p / 2 + 62 + -16, 114, 20).a());
      fui $$1 = this.n.n;
      this.d = fyi.a(
         this.q,
         xo.a("demo.help.movementShort", $$1.v.k(), $$1.w.k(), $$1.x.k(), $$1.y.k()),
         xo.c("demo.help.movementMouse"),
         xo.a("demo.help.jump", $$1.z.k()),
         xo.a("demo.help.inventory", $$1.C.k())
      );
      this.e = fyi.a(this.q, xo.c("demo.help.fullWrapped"), 218);
   }

   @Override
   public void b(fxb $$0, int $$1, int $$2, float $$3) {
      super.b($$0, $$1, $$2, $$3);
      int $$4 = (this.o - 248) / 2;
      int $$5 = (this.p - 166) / 2;
      $$0.a(gxx.ar, a, $$4, $$5, 0.0F, 0.0F, 248, 166, 256, 256);
   }

   @Override
   public void a(fxb $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      int $$4 = (this.o - 248) / 2 + 10;
      int $$5 = (this.p - 166) / 2 + 8;
      $$0.a(this.q, this.m, $$4, $$5, -14737633, false);
      $$5 = this.d.c($$0, $$4, $$5 + 12, 12, -11579569);
      this.e.c($$0, $$4, $$5 + 20, 9, -14737633);
   }
}
