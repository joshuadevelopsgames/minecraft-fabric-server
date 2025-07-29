public class hhj extends hed<cwd, hnf> {
   private static final ame a = ame.b("textures/entity/wither/wither_invulnerable.png");
   private static final ame h = ame.b("textures/entity/wither/wither.png");
   private final gpg i;

   public hhj(hee.a $$0) {
      super($$0);
      this.i = new gpg($$0.a(gqm.eg));
   }

   public static gqt a() {
      gqv $$0 = new gqv();
      gqx $$1 = $$0.a();
      $$1.a("head", gqs.c().a(0, 35).a(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F), gqp.a);
      return gqt.a($$0, 64, 64);
   }

   protected int a(cwd $$0, jb $$1) {
      return 15;
   }

   public void a(hnf $$0, fod $$1, gxn $$2, int $$3) {
      $$1.a();
      $$1.b(-1.0F, -1.0F, 1.0F);
      fog $$4 = $$2.getBuffer(this.i.a(this.a($$0)));
      this.i.a(0.0F, $$0.c, $$0.b);
      this.i.a($$1, $$4, $$3, hri.d);
      $$1.b();
      super.a($$0, $$1, $$2, $$3);
   }

   private ame a(hnf $$0) {
      return $$0.a ? a : h;
   }

   public hnf b() {
      return new hnf();
   }

   public void a(cwd $$0, hnf $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.n();
      $$1.c = $$0.l($$2);
      $$1.b = $$0.k($$2);
   }
}
