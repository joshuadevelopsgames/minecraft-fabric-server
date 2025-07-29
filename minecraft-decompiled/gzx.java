import java.util.Set;
import org.joml.Vector3f;

public class gzx implements hac<ean> {
   private static final int a = 16;
   private static final float b = 0.6666667F;
   private final gme c;
   private final gme d;
   private final gmd e;
   private final gmd f;

   public gzx(had.a $$0) {
      this($$0.f());
   }

   public gzx(gqj $$0) {
      this.c = new gme($$0.a(gqm.q));
      this.d = new gme($$0.a(gqm.s));
      this.e = new gmd($$0.a(gqm.r));
      this.f = new gmd($$0.a(gqm.t));
   }

   public void a(ean $$0, float $$1, fod $$2, gxn $$3, int $$4, int $$5, fis $$6) {
      eeb $$7 = $$0.m();
      gme $$9;
      gmd $$10;
      float $$8;
      if ($$7.b() instanceof dpe) {
         $$8 = -efh.b($$7.c(dpe.b));
         $$9 = this.c;
         $$10 = this.e;
      } else {
         $$8 = -$$7.c(dzn.b).p();
         $$9 = this.d;
         $$10 = this.f;
      }

      long $$14 = $$0.i().ae();
      jb $$15 = $$0.aA_();
      float $$16 = ((float)Math.floorMod($$15.u() * 7 + $$15.v() * 9 + $$15.w() * 13 + $$14, 100L) + $$1) / 100.0F;
      a($$2, $$3, $$4, $$5, $$8, $$9, $$10, $$16, $$0.f(), $$0.b());
   }

   public void a(fod $$0, gxn $$1, int $$2, int $$3, dbt $$4, eap $$5) {
      a($$0, $$1, $$2, $$3, 0.0F, this.c, this.e, 0.0F, $$4, $$5);
   }

   private static void a(fod $$0, gxn $$1, int $$2, int $$3, float $$4, gme $$5, gmd $$6, float $$7, dbt $$8, eap $$9) {
      $$0.a();
      $$0.a(0.5F, 0.0F, 0.5F);
      $$0.a(a.d.rotationDegrees($$4));
      $$0.b(0.6666667F, -0.6666667F, -0.6666667F);
      $$5.a($$0, hud.f.a($$1, gxz::d), $$2, $$3);
      $$6.a($$7);
      a($$0, $$1, $$2, $$3, $$6.e(), hud.f, true, $$8, $$9);
      $$0.b();
   }

   public static void a(fod $$0, gxn $$1, int $$2, int $$3, gqn $$4, hua $$5, boolean $$6, dbt $$7, eap $$8) {
      a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, false, true);
   }

   public static void a(fod $$0, gxn $$1, int $$2, int $$3, gqn $$4, hua $$5, boolean $$6, dbt $$7, eap $$8, boolean $$9, boolean $$10) {
      $$4.a($$0, $$5.a($$1, gxz::d, $$10, $$9), $$2, $$3);
      a($$0, $$1, $$2, $$3, $$4, $$6 ? gyi.w : gyi.x, $$7);

      for (int $$11 = 0; $$11 < 16 && $$11 < $$8.b().size(); $$11++) {
         eap.b $$12 = $$8.b().get($$11);
         hua $$13 = $$6 ? gyi.a($$12.b()) : gyi.b($$12.b());
         a($$0, $$1, $$2, $$3, $$4, $$13, $$12.c());
      }
   }

   private static void a(fod $$0, gxn $$1, int $$2, int $$3, gqn $$4, hua $$5, dbt $$6) {
      int $$7 = $$6.d();
      $$4.a($$0, $$5.a($$1, gxz::n), $$2, $$3, $$7);
   }

   public void a(Set<Vector3f> $$0) {
      fod $$1 = new fod();
      $$1.a(0.5F, 0.0F, 0.5F);
      $$1.b(0.6666667F, -0.6666667F, -0.6666667F);
      this.c.e().a($$1, $$0);
      this.e.a(0.0F);
      this.e.e().a($$1, $$0);
   }
}
