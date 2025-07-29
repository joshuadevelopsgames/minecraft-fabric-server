import java.util.Calendar;

public class haj<T extends eaz & ecg> implements hac<T> {
   private final gmr a;
   private final gmr b;
   private final gmr c;
   private final boolean d = c();

   public haj(had.a $$0) {
      this.a = new gmr($$0.a(gqm.X));
      this.b = new gmr($$0.a(gqm.aD));
      this.c = new gmr($$0.a(gqm.aE));
   }

   public static boolean c() {
      Calendar $$0 = Calendar.getInstance();
      return $$0.get(2) + 1 == 12 && $$0.get(5) >= 24 && $$0.get(5) <= 26;
   }

   @Override
   public void a(T $$0, float $$1, fod $$2, gxn $$3, int $$4, int $$5, fis $$6) {
      dmu $$7 = $$0.i();
      boolean $$8 = $$7 != null;
      eeb $$9 = $$8 ? $$0.m() : dqb.cG.m().b(drd.c, jh.d);
      eet $$10 = $$9.b(drd.d) ? $$9.c(drd.d) : eet.a;
      if ($$9.b() instanceof dot<?> $$12) {
         boolean $$13 = $$10 != eet.a;
         $$2.a();
         float $$14 = $$9.c(drd.c).p();
         $$2.a(0.5F, 0.5F, 0.5F);
         $$2.a(a.d.rotationDegrees(-$$14));
         $$2.a(-0.5F, -0.5F, -0.5F);
         dsh.c<? extends ebh> $$15;
         if ($$8) {
            $$15 = $$12.a($$9, $$7, $$0.aA_(), true);
         } else {
            $$15 = dsh.b::b;
         }

         float $$17 = $$15.apply(drd.a($$0)).get($$1);
         $$17 = 1.0F - $$17;
         $$17 = 1.0F - $$17 * $$17 * $$17;
         int $$18 = $$15.apply(new hag<>()).applyAsInt($$4);
         hua $$19 = gyi.a($$0, $$10, this.d);
         fog $$20 = $$19.a($$3, gxz::f);
         if ($$13) {
            if ($$10 == eet.b) {
               this.a($$2, $$20, this.b, $$17, $$18, $$5);
            } else {
               this.a($$2, $$20, this.c, $$17, $$18, $$5);
            }
         } else {
            this.a($$2, $$20, this.a, $$17, $$18, $$5);
         }

         $$2.b();
      }
   }

   private void a(fod $$0, fog $$1, gmr $$2, float $$3, int $$4, int $$5) {
      $$2.a($$3);
      $$2.a($$0, $$1, $$4, $$5);
   }
}
