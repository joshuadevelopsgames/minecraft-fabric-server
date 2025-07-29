import com.google.common.collect.ImmutableMap;

public class cck extends ccd<coc> {
   private static final int c = 60;
   private static final int d = 100;
   private int e;

   public cck() {
      super(ImmutableMap.of(cjo.n, cjp.b), 100);
   }

   protected boolean a(aub $$0, coc $$1) {
      return $$1.aw() == cay.a;
   }

   protected boolean a(aub $$0, coc $$1, long $$2) {
      return this.e < 60;
   }

   protected void b(aub $$0, coc $$1, long $$2) {
      if (!$$1.bp()) {
         $$1.b(cay.i);
         this.e = 0;
      }
   }

   protected void c(aub $$0, coc $$1, long $$2) {
      $$1.b(cay.a);
   }

   protected void d(aub $$0, coc $$1, long $$2) {
      this.e++;
   }
}
