import com.google.common.collect.ImmutableMap;

public class cde extends ccd<cao> {
   public static final int c = 100;
   private final bwu d;
   private final ayy e;

   public cde(bwu $$0, ayy $$1) {
      super(ImmutableMap.of(cjo.o, cjp.c, cjo.U, cjp.a), 100);
      this.d = $$0;
      this.e = $$1;
   }

   protected boolean a(aub $$0, cao $$1, long $$2) {
      return !$$1.aK();
   }

   protected void b(aub $$0, cao $$1, long $$2) {
      $$1.r(true);
      $$1.b(cay.g);
   }

   protected void c(aub $$0, cao $$1, long $$2) {
      if ($$1.aK()) {
         $$1.i($$1.dA().d(0.1F, 1.0, 0.1F));
         $$0.a(null, $$1, this.e, aza.g, 2.0F, 1.0F);
      }

      $$1.r(false);
      $$1.b(cay.a);
      $$1.eh().b(cjo.U);
      $$1.eh().a(cjo.T, this.d.a($$0.A));
   }
}
