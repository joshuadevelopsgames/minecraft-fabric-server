import com.google.common.collect.ImmutableMap;

public class cfl extends ccd<cuf> {
   public cfl() {
      super(ImmutableMap.of());
   }

   protected boolean a(aub $$0, cuf $$1, long $$2) {
      return c($$1) || b($$1);
   }

   protected void b(aub $$0, cuf $$1, long $$2) {
      if (c($$1) || b($$1)) {
         cbm<?> $$3 = $$1.eh();
         if (!$$3.c(cwn.g)) {
            $$3.b(cjo.u);
            $$3.b(cjo.n);
            $$3.b(cjo.o);
            $$3.b(cjo.s);
            $$3.b(cjo.r);
         }

         $$3.a(cwn.g);
      }
   }

   protected void c(aub $$0, cuf $$1, long $$2) {
      if ($$2 % 100L == 0L) {
         $$1.a($$0, $$2, 3);
      }
   }

   public static boolean b(cam $$0) {
      return $$0.eh().a(cjo.B);
   }

   public static boolean c(cam $$0) {
      return $$0.eh().a(cjo.y);
   }
}
