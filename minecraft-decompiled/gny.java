public class gny<S extends hli> extends gnh<S> implements glx, gnt {
   private final gqn a;
   private final gqn b;
   private final gqn c;
   private final gqn d;
   private final gqn e;
   private final gqn f;
   private final gqn g;

   public gny(gqn $$0) {
      super($$0);
      this.a = $$0.b("head");
      this.b = this.a.b("hat");
      this.b.k = false;
      this.c = $$0.b("arms");
      this.d = $$0.b("left_leg");
      this.e = $$0.b("right_leg");
      this.g = $$0.b("left_arm");
      this.f = $$0.b("right_arm");
   }

   public static gqt a() {
      gqv $$0 = new gqv();
      gqx $$1 = $$0.a();
      gqx $$2 = $$1.a("head", gqs.c().a(0, 0).a(-4.0F, -10.0F, -4.0F, 8.0F, 10.0F, 8.0F), gqp.a(0.0F, 0.0F, 0.0F));
      $$2.a("hat", gqs.c().a(32, 0).a(-4.0F, -10.0F, -4.0F, 8.0F, 12.0F, 8.0F, new gqr(0.45F)), gqp.a);
      $$2.a("nose", gqs.c().a(24, 0).a(-1.0F, -1.0F, -6.0F, 2.0F, 4.0F, 2.0F), gqp.a(0.0F, -2.0F, 0.0F));
      $$1.a(
         "body",
         gqs.c().a(16, 20).a(-4.0F, 0.0F, -3.0F, 8.0F, 12.0F, 6.0F).a(0, 38).a(-4.0F, 0.0F, -3.0F, 8.0F, 20.0F, 6.0F, new gqr(0.5F)),
         gqp.a(0.0F, 0.0F, 0.0F)
      );
      gqx $$3 = $$1.a(
         "arms",
         gqs.c().a(44, 22).a(-8.0F, -2.0F, -2.0F, 4.0F, 8.0F, 4.0F).a(40, 38).a(-4.0F, 2.0F, -2.0F, 8.0F, 4.0F, 4.0F),
         gqp.a(0.0F, 3.0F, -1.0F, -0.75F, 0.0F, 0.0F)
      );
      $$3.a("left_shoulder", gqs.c().a(44, 22).a().a(4.0F, -2.0F, -2.0F, 4.0F, 8.0F, 4.0F), gqp.a);
      $$1.a("right_leg", gqs.c().a(0, 22).a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F), gqp.a(-2.0F, 12.0F, 0.0F));
      $$1.a("left_leg", gqs.c().a(0, 22).a().a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F), gqp.a(2.0F, 12.0F, 0.0F));
      $$1.a("right_arm", gqs.c().a(40, 46).a(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F), gqp.a(-5.0F, 2.0F, 0.0F));
      $$1.a("left_arm", gqs.c().a(40, 46).a().a(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F), gqp.a(5.0F, 2.0F, 0.0F));
      return gqt.a($$0, 64, 64);
   }

   public void a(S $$0) {
      super.a($$0);
      this.a.f = $$0.ad * (float) (Math.PI / 180.0);
      this.a.e = $$0.ae * (float) (Math.PI / 180.0);
      if ($$0.b) {
         this.f.e = (float) (-Math.PI / 5);
         this.f.f = 0.0F;
         this.f.g = 0.0F;
         this.g.e = (float) (-Math.PI / 5);
         this.g.f = 0.0F;
         this.g.g = 0.0F;
         this.e.e = -1.4137167F;
         this.e.f = (float) (Math.PI / 10);
         this.e.g = 0.07853982F;
         this.d.e = -1.4137167F;
         this.d.f = (float) (-Math.PI / 10);
         this.d.g = -0.07853982F;
      } else {
         float $$1 = $$0.ah;
         float $$2 = $$0.ag;
         this.f.e = bcb.b($$2 * 0.6662F + (float) Math.PI) * 2.0F * $$1 * 0.5F;
         this.f.f = 0.0F;
         this.f.g = 0.0F;
         this.g.e = bcb.b($$2 * 0.6662F) * 2.0F * $$1 * 0.5F;
         this.g.f = 0.0F;
         this.g.g = 0.0F;
         this.e.e = bcb.b($$2 * 0.6662F) * 1.4F * $$1 * 0.5F;
         this.e.f = 0.0F;
         this.e.g = 0.0F;
         this.d.e = bcb.b($$2 * 0.6662F + (float) Math.PI) * 1.4F * $$1 * 0.5F;
         this.d.f = 0.0F;
         this.d.g = 0.0F;
      }

      crc.a $$3 = $$0.j;
      if ($$3 == crc.a.b) {
         if ($$0.bb_().e()) {
            glv.a(this.g, this.f, true, $$0.m, $$0.v);
         } else {
            glv.a(this.f, this.g, $$0.d, $$0.m, $$0.v);
         }
      } else if ($$3 == crc.a.c) {
         this.f.d = 0.0F;
         this.f.b = -5.0F;
         this.g.d = 0.0F;
         this.g.b = 5.0F;
         this.f.e = bcb.b($$0.v * 0.6662F) * 0.25F;
         this.g.e = bcb.b($$0.v * 0.6662F) * 0.25F;
         this.f.g = (float) (Math.PI * 3.0 / 4.0);
         this.g.g = (float) (-Math.PI * 3.0 / 4.0);
         this.f.f = 0.0F;
         this.g.f = 0.0F;
      } else if ($$3 == crc.a.d) {
         this.f.f = -0.1F + this.a.f;
         this.f.e = (float) (-Math.PI / 2) + this.a.e;
         this.g.e = -0.9424779F + this.a.e;
         this.g.f = this.a.f - 0.4F;
         this.g.g = (float) (Math.PI / 2);
      } else if ($$3 == crc.a.e) {
         glv.a(this.f, this.g, this.a, true);
      } else if ($$3 == crc.a.f) {
         glv.a(this.f, this.g, $$0.k, $$0.l, true);
      } else if ($$3 == crc.a.g) {
         this.f.d = 0.0F;
         this.f.b = -5.0F;
         this.f.e = bcb.b($$0.v * 0.6662F) * 0.05F;
         this.f.g = 2.670354F;
         this.f.f = 0.0F;
         this.g.d = 0.0F;
         this.g.b = 5.0F;
         this.g.e = bcb.b($$0.v * 0.6662F) * 0.05F;
         this.g.g = (float) (-Math.PI * 3.0 / 4.0);
         this.g.f = 0.0F;
      }

      boolean $$4 = $$3 == crc.a.a;
      this.c.k = $$4;
      this.g.k = !$$4;
      this.f.k = !$$4;
   }

   private gqn a(cad $$0) {
      return $$0 == cad.a ? this.g : this.f;
   }

   public gqn c() {
      return this.b;
   }

   @Override
   public gqn b() {
      return this.a;
   }

   @Override
   public void a(cad $$0, fod $$1) {
      this.v.a($$1);
      this.a($$0).a($$1);
   }
}
