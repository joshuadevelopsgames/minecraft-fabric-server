import com.google.common.annotations.VisibleForTesting;
import java.util.ArrayList;
import java.util.List;
import java.util.function.ToIntFunction;

class byt extends byo {
   private static final int d = 2;
   public static final int c = 2;
   private final ToIntFunction<bck> e;

   protected byt(byp $$0, int $$1, ToIntFunction<bck> $$2) {
      super($$0, $$1, me.X);
      this.e = $$2;
   }

   @VisibleForTesting
   protected static int a(int $$0, byt.a $$1, int $$2) {
      return $$0 < 1 ? $$2 : bcb.a(0, $$0 - $$1.count($$0), $$2);
   }

   @Override
   public void a(aub $$0, cam $$1, int $$2, bzm.e $$3) {
      if ($$3 == bzm.e.a) {
         int $$4 = this.e.applyAsInt($$1.ec());
         int $$5 = $$0.P().d(dmq.w);
         int $$6 = a($$5, byt.a.a($$1), $$4);

         for (int $$7 = 0; $$7 < $$6; $$7++) {
            this.a($$1.ai(), $$1.dC(), $$1.dE() + 0.5, $$1.dI());
         }
      }
   }

   private void a(dmu $$0, double $$1, double $$2, double $$3) {
      cse $$4 = bzv.bj.a($$0, bzu.k);
      if ($$4 != null) {
         $$4.a(2, true);
         $$4.b($$1, $$2, $$3, $$0.H_().i() * 360.0F, 0.0F);
         $$0.b($$4);
      }
   }

   @FunctionalInterface
   protected interface a {
      int count(int var1);

      static byt.a a(cam $$0) {
         return $$1 -> {
            List<cse> $$2 = new ArrayList<>();
            $$0.ai().a(bzv.bj, $$0.cV().g(2.0), $$1x -> $$1x != $$0, $$2, $$1);
            return $$2.size();
         };
      }
   }
}
