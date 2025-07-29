import java.util.function.Consumer;

public class enb {
   protected static double a(double $$0, double $$1, double $$2, double $$3) {
      if ($$0 < $$3) {
         $$0 = $$3;
      }

      double $$4 = 0.384;
      double $$5 = $$0 / $$1 * 0.384;
      double $$6 = 0.75 * Math.pow($$5, 1.3333333333333333);
      double $$7 = Math.pow($$5, 0.6666666666666666);
      double $$8 = 0.3333333333333333 * Math.log($$5);
      double $$9 = $$2 * ($$6 - $$7 - $$8);
      $$9 = Math.max($$9, 0.0);
      return $$9 / 0.384 * $$1;
   }

   protected static boolean a(dnt $$0, jb $$1, int $$2) {
      if (b($$0, $$1)) {
         return false;
      } else {
         float $$3 = 6.0F;
         float $$4 = 6.0F / $$2;

         for (float $$5 = 0.0F; $$5 < (float) (Math.PI * 2); $$5 += $$4) {
            int $$6 = (int)(bcb.b($$5) * $$2);
            int $$7 = (int)(bcb.a($$5) * $$2);
            if (b($$0, $$1.b($$6, 0, $$7))) {
               return false;
            }
         }

         return true;
      }
   }

   protected static boolean a(dmv $$0, jb $$1) {
      return $$0.a($$1, enb::c);
   }

   protected static boolean b(dmv $$0, jb $$1) {
      return $$0.a($$1, enb::e);
   }

   protected static void a(jh $$0, int $$1, boolean $$2, Consumer<eeb> $$3) {
      if ($$1 >= 3) {
         $$3.accept(a($$0, eey.e));

         for (int $$4 = 0; $$4 < $$1 - 3; $$4++) {
            $$3.accept(a($$0, eey.d));
         }
      }

      if ($$1 >= 2) {
         $$3.accept(a($$0, eey.c));
      }

      if ($$1 >= 1) {
         $$3.accept(a($$0, $$2 ? eey.a : eey.b));
      }
   }

   protected static void a(dmv $$0, jb $$1, jh $$2, int $$3, boolean $$4) {
      if (b($$0.a_($$1.a($$2.g())))) {
         jb.a $$5 = $$1.k();
         a($$2, $$3, $$4, $$3x -> {
            if ($$3x.a(dqb.tc)) {
               $$3x = $$3x.b(dvy.d, $$0.B($$5));
            }

            $$0.a($$5, $$3x, 2);
            $$5.c($$2);
         });
      }
   }

   protected static boolean c(dmv $$0, jb $$1) {
      eeb $$2 = $$0.a_($$1);
      if ($$2.a(azo.bw)) {
         $$0.a($$1, dqb.td.m(), 2);
         return true;
      } else {
         return false;
      }
   }

   private static eeb a(jh $$0, eey $$1) {
      return dqb.tc.m().b(dvy.b, $$0).b(dvy.c, $$1);
   }

   public static boolean a(eeb $$0) {
      return b($$0) || $$0.a(dqb.K);
   }

   public static boolean b(eeb $$0) {
      return $$0.a(dqb.td) || $$0.a(azo.bw);
   }

   public static boolean c(eeb $$0) {
      return $$0.l() || $$0.a(dqb.J);
   }

   public static boolean d(eeb $$0) {
      return !$$0.l() && !$$0.a(dqb.J);
   }

   public static boolean e(eeb $$0) {
      return $$0.l() || $$0.a(dqb.J) || $$0.a(dqb.K);
   }
}
