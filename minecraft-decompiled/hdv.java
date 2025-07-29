public class hdv extends hed<cvf, hkn> {
   private static final ame a = ame.b("textures/entity/enderdragon/dragon_fireball.png");
   private static final gxz h = gxz.g(a);

   public hdv(hee.a $$0) {
      super($$0);
   }

   protected int a(cvf $$0, jb $$1) {
      return 15;
   }

   @Override
   public void a(hkn $$0, fod $$1, gxn $$2, int $$3) {
      $$1.a();
      $$1.b(2.0F, 2.0F, 2.0F);
      $$1.a(this.e.b());
      fod.a $$4 = $$1.c();
      fog $$5 = $$2.getBuffer(h);
      a($$5, $$4, $$3, 0.0F, 0, 0, 1);
      a($$5, $$4, $$3, 1.0F, 0, 1, 1);
      a($$5, $$4, $$3, 1.0F, 1, 1, 0);
      a($$5, $$4, $$3, 0.0F, 1, 0, 0);
      $$1.b();
      super.a($$0, $$1, $$2, $$3);
   }

   private static void a(fog $$0, fod.a $$1, int $$2, float $$3, int $$4, int $$5, int $$6) {
      $$0.a($$1, $$3 - 0.5F, $$4 - 0.25F, 0.0F).a(-1).a((float)$$5, (float)$$6).b(hri.d).c($$2).b($$1, 0.0F, 1.0F, 0.0F);
   }

   @Override
   public hkn d() {
      return new hkn();
   }
}
