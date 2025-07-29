public class edz {
   private static final int a = 2100;
   private static final int b = 200;
   private static final int c = 130;
   private static final int d = 3;
   private static final int e = 3;
   private static final int f = 8;
   private static final int g = 5;
   private static final int h = 4;

   public static void a(dmu $$0, jb $$1, bck $$2) {
      if ($$0.a_($$1.d()).a(dqb.a)) {
         if ($$2.a(2100) == 0 && b($$0, $$1)) {
            $$0.a($$1.u(), $$1.v(), $$1.w(), ayz.xb, aza.i, 1.0F, 1.0F, false);
         }
      }
   }

   public static void b(dmu $$0, jb $$1, bck $$2) {
      if ($$2.a(200) == 0 && a($$0, $$1.e())) {
         $$0.a(ayz.hX, aza.i, 1.0F, 1.0F);
      }
   }

   public static void c(dmu $$0, jb $$1, bck $$2) {
      if ($$2.a(130) == 0) {
         eeb $$3 = $$0.a_($$1.e());
         if (($$3.a(dqb.N) || $$3.a(azo.ae)) && $$2.a(3) != 0) {
            return;
         }

         if (a($$0, $$1.e())) {
            $$0.a($$1.u(), $$1.v(), $$1.w(), ayz.gS, aza.i, 1.0F, 1.0F, false);
         }
      }
   }

   public static boolean a(dmu $$0, jb $$1) {
      return $$0.a_($$1).a(azo.cJ) && $$0.a_($$1.e()).a(azo.cJ);
   }

   private static boolean b(dmu $$0, jb $$1) {
      int $$2 = 0;
      int $$3 = 0;
      jb.a $$4 = $$1.k();

      for (jh $$5 : jh.c.a) {
         $$4.g($$1).c($$5, 8);
         if (a($$0, $$4) && $$2++ >= 3) {
            return true;
         }

         $$3++;
         int $$6 = 4 - $$3;
         int $$7 = $$6 + $$2;
         boolean $$8 = $$7 >= 3;
         if (!$$8) {
            return false;
         }
      }

      return false;
   }

   private static boolean a(dmu $$0, jb.a $$1) {
      int $$2 = $$0.b(eka.a.b, $$1) - 1;
      if (Math.abs($$2 - $$1.v()) > 5) {
         $$1.c(jh.b, 6);
         eeb $$4 = $$0.a_($$1);
         $$1.c(jh.a);

         for (int $$5 = 0; $$5 < 10; $$5++) {
            eeb $$6 = $$0.a_($$1);
            if ($$4.l() && a($$6)) {
               return true;
            }

            $$4 = $$6;
            $$1.c(jh.a);
         }

         return false;
      } else {
         boolean $$3 = $$0.a_($$1.q($$2 + 1)).l();
         return $$3 && a($$0.a_($$1.q($$2)));
      }
   }

   private static boolean a(eeb $$0) {
      return $$0.a(azo.cI);
   }
}
