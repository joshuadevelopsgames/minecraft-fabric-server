public class bxf {
   public static void a(dmu $$0, jb $$1, bxc $$2) {
      a($$0, (double)$$1.u(), (double)$$1.v(), (double)$$1.w(), $$2);
   }

   public static void a(dmu $$0, bzm $$1, bxc $$2) {
      a($$0, $$1.dC(), $$1.dE(), $$1.dI(), $$2);
   }

   private static void a(dmu $$0, double $$1, double $$2, double $$3, bxc $$4) {
      for (int $$5 = 0; $$5 < $$4.b(); $$5++) {
         a($$0, $$1, $$2, $$3, $$4.a($$5));
      }
   }

   public static void a(dmu $$0, jb $$1, ju<dcv> $$2) {
      $$2.forEach($$2x -> a($$0, (double)$$1.u(), (double)$$1.v(), (double)$$1.w(), $$2x));
   }

   public static void a(dmu $$0, double $$1, double $$2, double $$3, dcv $$4) {
      double $$5 = bzv.as.l();
      double $$6 = 1.0 - $$5;
      double $$7 = $$5 / 2.0;
      double $$8 = Math.floor($$1) + $$0.A.j() * $$6 + $$7;
      double $$9 = Math.floor($$2) + $$0.A.j() * $$6;
      double $$10 = Math.floor($$3) + $$0.A.j() * $$6 + $$7;

      while (!$$4.f()) {
         cqz $$11 = new cqz($$0, $$8, $$9, $$10, $$4.a($$0.A.a(21) + 10));
         float $$12 = 0.05F;
         $$11.n($$0.A.a(0.0, 0.11485000171139836), $$0.A.a(0.2, 0.11485000171139836), $$0.A.a(0.0, 0.11485000171139836));
         $$0.b($$11);
      }
   }

   public static void a(eeb $$0, dmu $$1, jb $$2) {
      $$1.b($$2, $$0.b());
   }
}
