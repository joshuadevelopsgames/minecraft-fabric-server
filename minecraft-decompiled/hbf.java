import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;

public class hbf {
   private final Long2ObjectMap<hbj> a = new Long2ObjectOpenHashMap();

   public hbg a(dmu $$0, long $$1) {
      int $$2 = ke.b($$1);
      int $$3 = ke.c($$1);
      int $$4 = ke.d($$1);
      int $$5 = $$2 - 1;
      int $$6 = $$3 - 1;
      int $$7 = $$4 - 1;
      int $$8 = $$2 + 1;
      int $$9 = $$3 + 1;
      int $$10 = $$4 + 1;
      hbj[] $$11 = new hbj[27];

      for (int $$12 = $$7; $$12 <= $$10; $$12++) {
         for (int $$13 = $$6; $$13 <= $$9; $$13++) {
            for (int $$14 = $$5; $$14 <= $$8; $$14++) {
               int $$15 = hbg.a($$5, $$6, $$7, $$14, $$13, $$12);
               $$11[$$15] = this.a($$0, $$14, $$13, $$12);
            }
         }
      }

      return new hbg($$0, $$5, $$6, $$7, $$11);
   }

   private hbj a(dmu $$0, int $$1, int $$2, int $$3) {
      return (hbj)this.a.computeIfAbsent(ke.b($$1, $$2, $$3), $$4 -> {
         egi $$5 = $$0.d($$1, $$3);
         return new hbj($$5, $$5.g($$2));
      });
   }
}
