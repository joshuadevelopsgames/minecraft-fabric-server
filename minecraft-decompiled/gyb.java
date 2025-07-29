import javax.annotation.Nullable;
import org.joml.Matrix4f;

public class gyb {
   private static final ame b = ame.b("textures/misc/underwater.png");
   private final fue c;
   private final gxn d;
   public static final int a = 40;
   @Nullable
   private dcv e;
   private int f;
   private float g;
   private float h;

   public gyb(fue $$0, gxn $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   public void a() {
      if (this.f > 0) {
         this.f--;
         if (this.f == 0) {
            this.e = null;
         }
      }
   }

   public void a(boolean $$0, float $$1) {
      fod $$2 = new fod();
      cut $$3 = this.c.t;
      if (this.c.n.aH().a() && !$$0) {
         if (!$$3.aq) {
            eeb $$4 = a($$3);
            if ($$4 != null) {
               a(this.c.aq().a().a($$4), $$2, this.d);
            }
         }

         if (!this.c.t.am()) {
            if (this.c.t.a(azu.a)) {
               a(this.c, $$2, this.d);
            }

            if (this.c.t.cb()) {
               a($$2, this.d);
            }
         }
      }

      if (!this.c.n.Y) {
         this.a($$2, $$1);
      }
   }

   private void a(fod $$0, float $$1) {
      if (this.e != null && this.f > 0) {
         int $$2 = 40 - this.f;
         float $$3 = ($$2 + $$1) / 40.0F;
         float $$4 = $$3 * $$3;
         float $$5 = $$3 * $$4;
         float $$6 = 10.25F * $$5 * $$4 - 24.95F * $$4 * $$4 + 25.5F * $$5 - 13.8F * $$4 + 4.0F * $$3;
         float $$7 = $$6 * (float) Math.PI;
         float $$8 = (float)this.c.aP().k() / this.c.aP().l();
         float $$9 = this.g * 0.3F * $$8;
         float $$10 = this.h * 0.3F;
         $$0.a();
         $$0.a($$9 * bcb.e(bcb.a($$7 * 2.0F)), $$10 * bcb.e(bcb.a($$7 * 2.0F)), -10.0F + 9.0F * bcb.a($$7));
         float $$11 = 0.8F;
         $$0.b(0.8F, 0.8F, 0.8F);
         $$0.a(a.d.rotationDegrees(900.0F * bcb.e(bcb.a($$7))));
         $$0.a(a.b.rotationDegrees(6.0F * bcb.b($$3 * 8.0F)));
         $$0.a(a.f.rotationDegrees(6.0F * bcb.b($$3 * 8.0F)));
         this.c.j.p().a(fnb.a.c);
         this.c.at().a(this.e, dct.i, 15728880, hri.d, $$0, this.d, this.c.s, 0);
         $$0.b();
      }
   }

   public void b() {
      this.e = null;
   }

   public void a(dcv $$0, bck $$1) {
      this.e = $$0;
      this.f = 40;
      this.g = $$1.i() * 2.0F - 1.0F;
      this.h = $$1.i() * 2.0F - 1.0F;
   }

   @Nullable
   private static eeb a(cut $$0) {
      jb.a $$1 = new jb.a();

      for (int $$2 = 0; $$2 < 8; $$2++) {
         double $$3 = $$0.dC() + (($$2 >> 0) % 2 - 0.5F) * $$0.ds() * 0.8F;
         double $$4 = $$0.dG() + (($$2 >> 1) % 2 - 0.5F) * 0.1F * $$0.eq();
         double $$5 = $$0.dI() + (($$2 >> 2) % 2 - 0.5F) * $$0.ds() * 0.8F;
         $$1.b($$3, $$4, $$5);
         eeb $$6 = $$0.ai().a_($$1);
         if ($$6.o() != dwn.a && $$6.k($$0.ai(), $$1)) {
            return $$6;
         }
      }

      return null;
   }

   private static void a(hrs $$0, fod $$1, gxn $$2) {
      float $$3 = 0.1F;
      int $$4 = baj.a(1.0F, 0.1F, 0.1F, 0.1F);
      float $$5 = -1.0F;
      float $$6 = 1.0F;
      float $$7 = -1.0F;
      float $$8 = 1.0F;
      float $$9 = -0.5F;
      float $$10 = $$0.c();
      float $$11 = $$0.d();
      float $$12 = $$0.h();
      float $$13 = $$0.i();
      Matrix4f $$14 = $$1.c().a();
      fog $$15 = $$2.getBuffer(gxz.D($$0.j()));
      $$15.a($$14, -1.0F, -1.0F, -0.5F).a($$11, $$13).a($$4);
      $$15.a($$14, 1.0F, -1.0F, -0.5F).a($$10, $$13).a($$4);
      $$15.a($$14, 1.0F, 1.0F, -0.5F).a($$10, $$12).a($$4);
      $$15.a($$14, -1.0F, 1.0F, -0.5F).a($$11, $$12).a($$4);
   }

   private static void a(fue $$0, fod $$1, gxn $$2) {
      jb $$3 = jb.a($$0.t.dC(), $$0.t.dG(), $$0.t.dI());
      float $$4 = gxj.a($$0.t.ai().G_(), $$0.t.ai().C($$3));
      int $$5 = baj.a(0.1F, $$4, $$4, $$4);
      float $$6 = 4.0F;
      float $$7 = -1.0F;
      float $$8 = 1.0F;
      float $$9 = -1.0F;
      float $$10 = 1.0F;
      float $$11 = -0.5F;
      float $$12 = -$$0.t.dP() / 64.0F;
      float $$13 = $$0.t.dR() / 64.0F;
      Matrix4f $$14 = $$1.c().a();
      fog $$15 = $$2.getBuffer(gxz.D(b));
      $$15.a($$14, -1.0F, -1.0F, -0.5F).a(4.0F + $$12, 4.0F + $$13).a($$5);
      $$15.a($$14, 1.0F, -1.0F, -0.5F).a(0.0F + $$12, 4.0F + $$13).a($$5);
      $$15.a($$14, 1.0F, 1.0F, -0.5F).a(0.0F + $$12, 0.0F + $$13).a($$5);
      $$15.a($$14, -1.0F, 1.0F, -0.5F).a(4.0F + $$12, 0.0F + $$13).a($$5);
   }

   private static void a(fod $$0, gxn $$1) {
      hrs $$2 = hud.b.c();
      fog $$3 = $$1.getBuffer(gxz.E($$2.j()));
      float $$4 = $$2.c();
      float $$5 = $$2.d();
      float $$6 = ($$4 + $$5) / 2.0F;
      float $$7 = $$2.h();
      float $$8 = $$2.i();
      float $$9 = ($$7 + $$8) / 2.0F;
      float $$10 = $$2.k();
      float $$11 = bcb.h($$10, $$4, $$6);
      float $$12 = bcb.h($$10, $$5, $$6);
      float $$13 = bcb.h($$10, $$7, $$9);
      float $$14 = bcb.h($$10, $$8, $$9);
      float $$15 = 1.0F;

      for (int $$16 = 0; $$16 < 2; $$16++) {
         $$0.a();
         float $$17 = -0.5F;
         float $$18 = 0.5F;
         float $$19 = -0.5F;
         float $$20 = 0.5F;
         float $$21 = -0.5F;
         $$0.a(-($$16 * 2 - 1) * 0.24F, -0.3F, 0.0F);
         $$0.a(a.d.rotationDegrees(($$16 * 2 - 1) * 10.0F));
         Matrix4f $$22 = $$0.c().a();
         $$3.a($$22, -0.5F, -0.5F, -0.5F).a($$12, $$14).a(1.0F, 1.0F, 1.0F, 0.9F);
         $$3.a($$22, 0.5F, -0.5F, -0.5F).a($$11, $$14).a(1.0F, 1.0F, 1.0F, 0.9F);
         $$3.a($$22, 0.5F, 0.5F, -0.5F).a($$11, $$13).a(1.0F, 1.0F, 1.0F, 0.9F);
         $$3.a($$22, -0.5F, 0.5F, -0.5F).a($$12, $$13).a(1.0F, 1.0F, 1.0F, 0.9F);
         $$0.b();
      }
   }
}
