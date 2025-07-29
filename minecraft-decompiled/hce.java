import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;

public class hce implements hbz.a {
   private final fue a;
   private static final int b = 10;

   public hce(fue $$0) {
      this.a = $$0;
   }

   @Override
   public void a(fod $$0, gxn $$1, double $$2, double $$3, double $$4) {
      dmu $$5 = this.a.s;
      jb $$6 = jb.a($$2, $$3, $$4);
      LongSet $$7 = new LongOpenHashSet();

      for (jb $$8 : jb.c($$6.b(-10, -10, -10), $$6.b(10, 10, 10))) {
         int $$9 = $$5.a(dnd.a, $$8);
         float $$10 = (15 - $$9) / 15.0F * 0.5F + 0.16F;
         int $$11 = bcb.g($$10, 0.9F, 0.9F);
         long $$12 = ke.e($$8.a());
         if ($$7.add($$12)) {
            hbz.a(
               $$0, $$1, $$5.T().q().a(dnd.a, ke.a($$12)), (double)ke.a(ke.b($$12), 8), (double)ke.a(ke.c($$12), 8), (double)ke.a(ke.d($$12), 8), -65536, 0.3F
            );
         }

         if ($$9 != 15) {
            hbz.a($$0, $$1, String.valueOf($$9), $$8.u() + 0.5, $$8.v() + 0.25, $$8.w() + 0.5, $$11);
         }
      }
   }
}
