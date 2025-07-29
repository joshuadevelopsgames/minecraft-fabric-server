public interface cte {
   int u_ = 10;
   float v_ = 0.2F;

   int t();

   static boolean a(aub $$0, cam $$1, cam $$2) {
      float $$3 = (float)$$1.i(cbs.c);
      float $$4;
      if (!$$1.g_() && (int)$$3 > 0) {
         $$4 = $$3 / 2.0F + $$0.A.a((int)$$3);
      } else {
         $$4 = $$3;
      }

      byb $$6 = $$1.ea().b($$1);
      boolean $$7 = $$2.a($$0, $$6, $$4);
      if ($$7) {
         djk.a($$0, (bzm)$$2, $$6);
         if (!$$1.g_()) {
            a($$1, $$2);
         }
      }

      return $$7;
   }

   static void a(cam $$0, cam $$1) {
      double $$2 = $$0.i(cbs.d);
      double $$3 = $$1.i(cbs.q);
      double $$4 = $$2 - $$3;
      if (!($$4 <= 0.0)) {
         double $$5 = $$1.dC() - $$0.dC();
         double $$6 = $$1.dI() - $$0.dI();
         float $$7 = $$0.ai().A.a(21) - 10;
         double $$8 = $$4 * ($$0.ai().A.i() * 0.5F + 0.2F);
         fis $$9 = new fis($$5, 0.0, $$6).d().c($$8).b($$7);
         double $$10 = $$4 * $$0.ai().A.i() * 0.5;
         $$1.i($$9.d, $$10, $$9.f);
         $$1.ag = true;
      }
   }
}
