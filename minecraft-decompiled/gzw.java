import java.util.List;

public abstract class gzw implements hac<ecn> {
   private static final int a = -988212;
   private static final int b = bcb.i(16);
   private final fwz c;

   public gzw(had.a $$0) {
      this.c = $$0.g();
   }

   protected abstract gof a(eeb var1, efp var2);

   protected abstract hua a(efp var1);

   protected abstract float a();

   protected abstract float b();

   protected abstract fis c();

   protected abstract void a(fod var1, float var2, eeb var3);

   public void a(ecn $$0, float $$1, fod $$2, gxn $$3, int $$4, int $$5, fis $$6) {
      eeb $$7 = $$0.m();
      dxk $$8 = (dxk)$$7.b();
      gof $$9 = this.a($$7, $$8.d());
      this.a($$0, $$2, $$3, $$4, $$5, $$7, $$8, $$8.d(), $$9);
   }

   private void a(ecn $$0, fod $$1, gxn $$2, int $$3, int $$4, eeb $$5, dxk $$6, efp $$7, gof $$8) {
      $$1.a();
      this.a($$1, -$$6.h($$5), $$5);
      this.a($$1, $$2, $$3, $$4, $$7, $$8);
      this.a($$0.aA_(), $$0.j(), $$1, $$2, $$3, $$0.a(), $$0.c(), true);
      this.a($$0.aA_(), $$0.k(), $$1, $$2, $$3, $$0.a(), $$0.c(), false);
      $$1.b();
   }

   protected void a(fod $$0, gxn $$1, int $$2, int $$3, efp $$4, gof $$5) {
      $$0.a();
      float $$6 = this.a();
      $$0.b($$6, -$$6, -$$6);
      hua $$7 = this.a($$4);
      fog $$8 = $$7.a($$1, $$5::a);
      $$5.a($$0, $$8, $$2, $$3);
      $$0.b();
   }

   private void a(jb $$0, eco $$1, fod $$2, gxn $$3, int $$4, int $$5, int $$6, boolean $$7) {
      $$2.a();
      this.a($$2, $$7, this.c());
      int $$8 = a($$1);
      int $$9 = 4 * $$5 / 2;
      bbm[] $$10 = $$1.a(fue.R().aU(), $$1x -> {
         List<bbm> $$2x = this.c.c($$1x, $$6);
         return $$2x.isEmpty() ? bbm.a : $$2x.get(0);
      });
      int $$11;
      boolean $$12;
      int $$13;
      if ($$1.a()) {
         $$11 = $$1.b().g();
         $$12 = a($$0, $$11);
         $$13 = 15728880;
      } else {
         $$11 = $$8;
         $$12 = false;
         $$13 = $$4;
      }

      for (int $$17 = 0; $$17 < 4; $$17++) {
         bbm $$18 = $$10[$$17];
         float $$19 = -this.c.a($$18) / 2;
         if ($$12) {
            this.c.a($$18, $$19, $$17 * $$5 - $$9, $$11, $$8, $$2.c().a(), $$3, $$13);
         } else {
            this.c.a($$18, $$19, (float)($$17 * $$5 - $$9), $$11, false, $$2.c().a(), $$3, fwz.a.c, 0, $$13);
         }
      }

      $$2.b();
   }

   private void a(fod $$0, boolean $$1, fis $$2) {
      if (!$$1) {
         $$0.a(a.d.rotationDegrees(180.0F));
      }

      float $$3 = 0.015625F * this.b();
      $$0.a($$2);
      $$0.b($$3, -$$3, $$3);
   }

   private static boolean a(jb $$0, int $$1) {
      if ($$1 == dbt.p.g()) {
         return true;
      } else {
         fue $$2 = fue.R();
         gwi $$3 = $$2.t;
         if ($$3 != null && $$2.n.aH().a() && $$3.gR()) {
            return true;
         } else {
            bzm $$4 = $$2.ap();
            return $$4 != null && $$4.g(fis.b($$0)) < b;
         }
      }
   }

   public static int a(eco $$0) {
      int $$1 = $$0.b().g();
      return $$1 == dbt.p.g() && $$0.a() ? -988212 : baj.a($$1, 0.4F);
   }
}
