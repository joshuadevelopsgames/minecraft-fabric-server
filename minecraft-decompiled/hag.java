import it.unimi.dsi.fastutil.ints.Int2IntFunction;

public class hag<S extends eaz> implements dsh.b<S, Int2IntFunction> {
   public Int2IntFunction a(S $$0, S $$1) {
      return $$2 -> {
         int $$3 = gxh.a($$0.i(), $$0.aA_());
         int $$4 = gxh.a($$1.i(), $$1.aA_());
         int $$5 = gxj.a($$3);
         int $$6 = gxj.a($$4);
         int $$7 = gxj.b($$3);
         int $$8 = gxj.b($$4);
         return gxj.a(Math.max($$5, $$6), Math.max($$7, $$8));
      };
   }

   public Int2IntFunction a(S $$0) {
      return $$0x -> $$0x;
   }

   public Int2IntFunction a() {
      return $$0 -> $$0;
   }
}
