import com.google.common.collect.ImmutableList.Builder;
import org.joml.Quaternionf;
import org.joml.Vector3f;

public class hdz extends hed<cps, hkl> {
   public static final ame a = ame.b("textures/entity/end_crystal/end_crystal_beam.png");
   private static final ame h = ame.b("textures/entity/enderdragon/dragon_exploding.png");
   private static final ame i = ame.b("textures/entity/enderdragon/dragon.png");
   private static final ame j = ame.b("textures/entity/enderdragon/dragon_eyes.png");
   private static final gxz k = gxz.g(i);
   private static final gxz l = gxz.m(i);
   private static final gxz m = gxz.q(j);
   private static final gxz n = gxz.l(a);
   private static final float o = (float)(Math.sqrt(3.0) / 2.0);
   private final gqh p;

   public hdz(hee.a $$0) {
      super($$0);
      this.f = 0.5F;
      this.p = new gqh($$0.a(gqm.aT));
   }

   public void a(hkl $$0, fod $$1, gxn $$2, int $$3) {
      $$1.a();
      float $$4 = $$0.a(7).b();
      float $$5 = (float)($$0.a(5).a() - $$0.a(10).a());
      $$1.a(a.d.rotationDegrees(-$$4));
      $$1.a(a.b.rotationDegrees($$5 * 10.0F));
      $$1.a(0.0F, 0.0F, 1.0F);
      $$1.b(-1.0F, -1.0F, 1.0F);
      $$1.a(0.0F, -1.501F, 0.0F);
      this.p.a($$0);
      if ($$0.b > 0.0F) {
         float $$6 = $$0.b / 200.0F;
         int $$7 = baj.c(bcb.d($$6 * 255.0F), -1);
         fog $$8 = $$2.getBuffer(gxz.p(h));
         this.p.a($$1, $$8, $$3, hri.d, $$7);
         fog $$9 = $$2.getBuffer(l);
         this.p.a($$1, $$9, $$3, hri.a(0.0F, $$0.c));
      } else {
         fog $$10 = $$2.getBuffer(k);
         this.p.a($$1, $$10, $$3, hri.a(0.0F, $$0.c));
      }

      fog $$11 = $$2.getBuffer(m);
      this.p.a($$1, $$11, $$3, hri.d);
      if ($$0.b > 0.0F) {
         float $$12 = $$0.b / 200.0F;
         $$1.a();
         $$1.a(0.0F, -1.0F, -2.0F);
         a($$1, $$12, $$2.getBuffer(gxz.q()));
         a($$1, $$12, $$2.getBuffer(gxz.r()));
         $$1.b();
      }

      $$1.b();
      if ($$0.d != null) {
         a((float)$$0.d.d, (float)$$0.d.e, (float)$$0.d.f, $$0.v, $$1, $$2, $$3);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   private static void a(fod $$0, float $$1, fog $$2) {
      $$0.a();
      float $$3 = Math.min($$1 > 0.8F ? ($$1 - 0.8F) / 0.2F : 0.0F, 1.0F);
      int $$4 = baj.a(1.0F - $$3, 1.0F, 1.0F, 1.0F);
      int $$5 = 16711935;
      bck $$6 = bck.a(432L);
      Vector3f $$7 = new Vector3f();
      Vector3f $$8 = new Vector3f();
      Vector3f $$9 = new Vector3f();
      Vector3f $$10 = new Vector3f();
      Quaternionf $$11 = new Quaternionf();
      int $$12 = bcb.d(($$1 + $$1 * $$1) / 2.0F * 60.0F);

      for (int $$13 = 0; $$13 < $$12; $$13++) {
         $$11.rotationXYZ($$6.i() * (float) (Math.PI * 2), $$6.i() * (float) (Math.PI * 2), $$6.i() * (float) (Math.PI * 2))
            .rotateXYZ($$6.i() * (float) (Math.PI * 2), $$6.i() * (float) (Math.PI * 2), $$6.i() * (float) (Math.PI * 2) + $$1 * (float) (Math.PI / 2));
         $$0.a($$11);
         float $$14 = $$6.i() * 20.0F + 5.0F + $$3 * 10.0F;
         float $$15 = $$6.i() * 2.0F + 1.0F + $$3 * 2.0F;
         $$8.set(-o * $$15, $$14, -0.5F * $$15);
         $$9.set(o * $$15, $$14, -0.5F * $$15);
         $$10.set(0.0F, $$14, $$15);
         fod.a $$16 = $$0.c();
         $$2.a($$16, $$7).a($$4);
         $$2.a($$16, $$8).a(16711935);
         $$2.a($$16, $$9).a(16711935);
         $$2.a($$16, $$7).a($$4);
         $$2.a($$16, $$9).a(16711935);
         $$2.a($$16, $$10).a(16711935);
         $$2.a($$16, $$7).a($$4);
         $$2.a($$16, $$10).a(16711935);
         $$2.a($$16, $$8).a(16711935);
      }

      $$0.b();
   }

   public static void a(float $$0, float $$1, float $$2, float $$3, fod $$4, gxn $$5, int $$6) {
      float $$7 = bcb.c($$0 * $$0 + $$2 * $$2);
      float $$8 = bcb.c($$0 * $$0 + $$1 * $$1 + $$2 * $$2);
      $$4.a();
      $$4.a(0.0F, 2.0F, 0.0F);
      $$4.a(a.d.rotation((float)(-Math.atan2($$2, $$0)) - (float) (Math.PI / 2)));
      $$4.a(a.b.rotation((float)(-Math.atan2($$7, $$1)) - (float) (Math.PI / 2)));
      fog $$9 = $$5.getBuffer(n);
      float $$10 = 0.0F - $$3 * 0.01F;
      float $$11 = $$8 / 32.0F - $$3 * 0.01F;
      int $$12 = 8;
      float $$13 = 0.0F;
      float $$14 = 0.75F;
      float $$15 = 0.0F;
      fod.a $$16 = $$4.c();

      for (int $$17 = 1; $$17 <= 8; $$17++) {
         float $$18 = bcb.a($$17 * (float) (Math.PI * 2) / 8.0F) * 0.75F;
         float $$19 = bcb.b($$17 * (float) (Math.PI * 2) / 8.0F) * 0.75F;
         float $$20 = $$17 / 8.0F;
         $$9.a($$16, $$13 * 0.2F, $$14 * 0.2F, 0.0F).a(-16777216).a($$15, $$10).b(hri.d).c($$6).b($$16, 0.0F, -1.0F, 0.0F);
         $$9.a($$16, $$13, $$14, $$8).a(-1).a($$15, $$11).b(hri.d).c($$6).b($$16, 0.0F, -1.0F, 0.0F);
         $$9.a($$16, $$18, $$19, $$8).a(-1).a($$20, $$11).b(hri.d).c($$6).b($$16, 0.0F, -1.0F, 0.0F);
         $$9.a($$16, $$18 * 0.2F, $$19 * 0.2F, 0.0F).a(-16777216).a($$20, $$10).b(hri.d).c($$6).b($$16, 0.0F, -1.0F, 0.0F);
         $$13 = $$18;
         $$14 = $$19;
         $$15 = $$20;
      }

      $$4.b();
   }

   public hkl a() {
      return new hkl();
   }

   public void a(cps $$0, hkl $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = bcb.h($$2, $$0.d, $$0.e);
      $$1.b = $$0.cj > 0 ? $$0.cj + $$2 : 0.0F;
      $$1.c = $$0.bj > 0;
      cpr $$3 = $$0.cl;
      if ($$3 != null) {
         fis $$4 = $$3.p($$2).b(0.0, hdy.a($$3.a + $$2), 0.0);
         $$1.d = $$4.d($$0.p($$2));
      } else {
         $$1.d = null;
      }

      cqc $$5 = $$0.gD().a();
      $$1.e = $$5 == cqi.d || $$5 == cqi.e;
      $$1.f = $$5.a();
      jb $$6 = $$0.ai().a(eka.a.f, enf.a($$0.l()));
      $$1.g = $$6.b($$0.dv());
      $$1.h = $$0.eM() ? 0.0F : $$2;
      $$1.i.a($$0.b);
   }

   protected void a(cps $$0, Builder<hlc> $$1, float $$2) {
      super.a($$0, $$1, $$2);
      double $$3 = -bcb.d((double)$$2, $$0.an, $$0.dC());
      double $$4 = -bcb.d((double)$$2, $$0.ao, $$0.dE());
      double $$5 = -bcb.d((double)$$2, $$0.ap, $$0.dI());

      for (cpp $$6 : $$0.t()) {
         fin $$7 = $$6.cV();
         hlc $$8 = new hlc(
            $$7.a - $$6.dC(),
            $$7.b - $$6.dE(),
            $$7.c - $$6.dI(),
            $$7.d - $$6.dC(),
            $$7.e - $$6.dE(),
            $$7.f - $$6.dI(),
            (float)($$3 + bcb.d((double)$$2, $$6.an, $$6.dC())),
            (float)($$4 + bcb.d((double)$$2, $$6.ao, $$6.dE())),
            (float)($$5 + bcb.d((double)$$2, $$6.ap, $$6.dI())),
            0.25F,
            1.0F,
            0.0F
         );
         $$1.add($$8);
      }
   }

   protected boolean a(cps $$0) {
      return false;
   }
}
