public class hgf extends hed<cvr, hmk> {
   private static final ame a = ame.b("textures/entity/shulker/spark.png");
   private static final gxz h = gxz.j(a);
   private final gpc i;

   public hgf(hee.a $$0) {
      super($$0);
      this.i = new gpc($$0.a(gqm.dc));
   }

   protected int a(cvr $$0, jb $$1) {
      return 15;
   }

   public void a(hmk $$0, fod $$1, gxn $$2, int $$3) {
      $$1.a();
      float $$4 = $$0.v;
      $$1.a(0.0F, 0.15F, 0.0F);
      $$1.a(a.d.rotationDegrees(bcb.a($$4 * 0.1F) * 180.0F));
      $$1.a(a.b.rotationDegrees(bcb.b($$4 * 0.1F) * 180.0F));
      $$1.a(a.f.rotationDegrees(bcb.a($$4 * 0.15F) * 360.0F));
      $$1.b(-0.5F, -0.5F, 0.5F);
      this.i.a($$0);
      fog $$5 = $$2.getBuffer(this.i.a(a));
      this.i.a($$1, $$5, $$3, hri.d);
      $$1.b(1.5F, 1.5F, 1.5F);
      fog $$6 = $$2.getBuffer(h);
      this.i.a($$1, $$6, $$3, hri.d, 654311423);
      $$1.b();
      super.a($$0, $$1, $$2, $$3);
   }

   public hmk a() {
      return new hmk();
   }

   public void a(cvr $$0, hmk $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.b = $$0.l($$2);
      $$1.a = $$0.k($$2);
   }
}
