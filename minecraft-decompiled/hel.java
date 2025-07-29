public class hel extends hed<cvk, hkv> {
   private static final ame a = ame.b("textures/entity/fishing_hook.png");
   private static final gxz h = gxz.f(a);
   private static final double i = 960.0;

   public hel(hee.a $$0) {
      super($$0);
   }

   public boolean a(cvk $$0, hbq $$1, double $$2, double $$3, double $$4) {
      return super.a($$0, $$1, $$2, $$3, $$4) && $$0.f() != null;
   }

   public void a(hkv $$0, fod $$1, gxn $$2, int $$3) {
      $$1.a();
      $$1.a();
      $$1.b(0.5F, 0.5F, 0.5F);
      $$1.a(this.e.b());
      fod.a $$4 = $$1.c();
      fog $$5 = $$2.getBuffer(h);
      a($$5, $$4, $$3, 0.0F, 0, 0, 1);
      a($$5, $$4, $$3, 1.0F, 0, 1, 1);
      a($$5, $$4, $$3, 1.0F, 1, 1, 0);
      a($$5, $$4, $$3, 0.0F, 1, 0, 0);
      $$1.b();
      float $$6 = (float)$$0.a.d;
      float $$7 = (float)$$0.a.e;
      float $$8 = (float)$$0.a.f;
      fog $$9 = $$2.getBuffer(gxz.x());
      fod.a $$10 = $$1.c();
      int $$11 = 16;

      for (int $$12 = 0; $$12 <= 16; $$12++) {
         a($$6, $$7, $$8, $$9, $$10, a($$12, 16), a($$12 + 1, 16));
      }

      $$1.b();
      super.a($$0, $$1, $$2, $$3);
   }

   public static cad a(cut $$0) {
      return $$0.fh().h() instanceof dce ? $$0.fF() : $$0.fF().e();
   }

   private fis a(cut $$0, float $$1, float $$2) {
      int $$3 = a($$0) == cad.b ? 1 : -1;
      if (this.e.d.aH().a() && $$0 == fue.R().t) {
         double $$11 = 960.0 / this.e.d.al().c().intValue();
         fis $$12 = this.e.b.l().a($$3 * 0.525F, -0.1F).c($$11).b($$1 * 0.5F).a(-$$1 * 0.7F);
         return $$0.n($$2).e($$12);
      } else {
         float $$4 = bcb.h($$2, $$0.bs, $$0.br) * (float) (Math.PI / 180.0);
         double $$5 = bcb.a($$4);
         double $$6 = bcb.b($$4);
         float $$7 = $$0.eq();
         double $$8 = $$3 * 0.35 * $$7;
         double $$9 = 0.8 * $$7;
         float $$10 = $$0.cl() ? -0.1875F : 0.0F;
         return $$0.n($$2).b(-$$6 * $$8 - $$5 * $$9, $$10 - 0.45 * $$7, -$$5 * $$8 + $$6 * $$9);
      }
   }

   private static float a(int $$0, int $$1) {
      return (float)$$0 / $$1;
   }

   private static void a(fog $$0, fod.a $$1, int $$2, float $$3, int $$4, int $$5, int $$6) {
      $$0.a($$1, $$3 - 0.5F, $$4 - 0.5F, 0.0F).a(-1).a((float)$$5, (float)$$6).b(hri.d).c($$2).b($$1, 0.0F, 1.0F, 0.0F);
   }

   private static void a(float $$0, float $$1, float $$2, fog $$3, fod.a $$4, float $$5, float $$6) {
      float $$7 = $$0 * $$5;
      float $$8 = $$1 * ($$5 * $$5 + $$5) * 0.5F + 0.25F;
      float $$9 = $$2 * $$5;
      float $$10 = $$0 * $$6 - $$7;
      float $$11 = $$1 * ($$6 * $$6 + $$6) * 0.5F + 0.25F - $$8;
      float $$12 = $$2 * $$6 - $$9;
      float $$13 = bcb.c($$10 * $$10 + $$11 * $$11 + $$12 * $$12);
      $$10 /= $$13;
      $$11 /= $$13;
      $$12 /= $$13;
      $$3.a($$4, $$7, $$8, $$9).a(-16777216).b($$4, $$10, $$11, $$12);
   }

   public hkv a() {
      return new hkv();
   }

   public void a(cvk $$0, hkv $$1, float $$2) {
      super.a($$0, $$1, $$2);
      cut $$3 = $$0.f();
      if ($$3 == null) {
         $$1.a = fis.c;
      } else {
         float $$4 = $$3.D($$2);
         float $$5 = bcb.a(bcb.c($$4) * (float) Math.PI);
         fis $$6 = this.a($$3, $$5, $$2);
         fis $$7 = $$0.p($$2).b(0.0, 0.25, 0.0);
         $$1.a = $$6.d($$7);
      }
   }

   protected boolean a(cvk $$0) {
      return false;
   }
}
