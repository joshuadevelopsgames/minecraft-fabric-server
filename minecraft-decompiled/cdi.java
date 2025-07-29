import com.google.common.collect.ImmutableMap;

public class cdi extends ccd<cuf> {
   private final float c;

   public cdi(float $$0) {
      super(ImmutableMap.of(cjo.n, cjp.c, cjo.o, cjp.c), Integer.MAX_VALUE);
      this.c = $$0;
   }

   protected boolean a(aub $$0, cuf $$1) {
      cut $$2 = $$1.gH();
      return $$1.bO() && $$2 != null && !$$1.bm() && !$$1.ag && $$1.g((bzm)$$2) <= 16.0 && $$2.cn != null;
   }

   protected boolean a(aub $$0, cuf $$1, long $$2) {
      return this.a($$0, $$1);
   }

   protected void b(aub $$0, cuf $$1, long $$2) {
      this.a($$1);
   }

   protected void c(aub $$0, cuf $$1, long $$2) {
      cbm<?> $$3 = $$1.eh();
      $$3.b(cjo.n);
      $$3.b(cjo.o);
   }

   protected void d(aub $$0, cuf $$1, long $$2) {
      this.a($$1);
   }

   @Override
   protected boolean a(long $$0) {
      return false;
   }

   private void a(cuf $$0) {
      cbm<?> $$1 = $$0.eh();
      $$1.a(cjo.n, new cjr(new cco($$0.gH(), false), this.c, 2));
      $$1.a(cjo.o, new cco($$0.gH(), true));
   }
}
