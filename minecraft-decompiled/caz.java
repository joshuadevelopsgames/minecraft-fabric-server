import java.util.Set;

public record caz(fis b, fis c, float d, float e) {
   public static final zm<wg, caz> a = zm.a(fis.b, caz::a, fis.b, caz::b, zk.l, caz::c, zk.l, caz::d, caz::new);

   public static caz a(bzm $$0) {
      return $$0.bU() ? new caz($$0.l_().a(), $$0.ae(), $$0.l_().b(), $$0.l_().c()) : new caz($$0.dv(), $$0.ae(), $$0.dP(), $$0.dR());
   }

   public static caz a(fbl $$0) {
      return new caz($$0.c(), $$0.d(), $$0.e(), $$0.f());
   }

   public static caz a(caz $$0, caz $$1, Set<cba> $$2) {
      double $$3 = $$2.contains(cba.a) ? $$0.b.d : 0.0;
      double $$4 = $$2.contains(cba.b) ? $$0.b.e : 0.0;
      double $$5 = $$2.contains(cba.c) ? $$0.b.f : 0.0;
      float $$6 = $$2.contains(cba.d) ? $$0.d : 0.0F;
      float $$7 = $$2.contains(cba.e) ? $$0.e : 0.0F;
      fis $$8 = new fis($$3 + $$1.b.d, $$4 + $$1.b.e, $$5 + $$1.b.f);
      float $$9 = $$6 + $$1.d;
      float $$10 = bcb.a($$7 + $$1.e, -90.0F, 90.0F);
      fis $$11 = $$0.c;
      if ($$2.contains(cba.i)) {
         float $$12 = $$0.d - $$9;
         float $$13 = $$0.e - $$10;
         $$11 = $$11.a((float)Math.toRadians($$13));
         $$11 = $$11.b((float)Math.toRadians($$12));
      }

      fis $$14 = new fis(a($$11.d, $$1.c.d, $$2, cba.f), a($$11.e, $$1.c.e, $$2, cba.g), a($$11.f, $$1.c.f, $$2, cba.h));
      return new caz($$8, $$14, $$9, $$10);
   }

   private static double a(double $$0, double $$1, Set<cba> $$2, cba $$3) {
      return $$2.contains($$3) ? $$0 + $$1 : $$1;
   }

   public fis a() {
      return this.b;
   }

   public fis b() {
      return this.c;
   }

   public float c() {
      return this.d;
   }

   public float d() {
      return this.e;
   }
}
