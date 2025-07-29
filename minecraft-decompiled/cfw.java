import com.google.common.collect.ImmutableMap;

public class cfw<E extends ctw> extends ccd<E> {
   public cfw(int $$0) {
      super(ImmutableMap.of(cjo.p, cjp.b, cjo.n, cjp.b), $$0);
   }

   protected boolean a(aub $$0, E $$1, long $$2) {
      return $$1.dV() == null;
   }

   protected boolean a(aub $$0, E $$1) {
      return $$1.aK() || $$1.bm() || $$1.bA();
   }

   protected void b(aub $$0, E $$1, long $$2) {
      if ($$1.aK()) {
         $$1.b(cay.o);
         $$1.a(ayz.Do, 5.0F, 1.0F);
      } else {
         $$1.a(ayz.Dj, 5.0F, 1.0F);
         this.c($$0, $$1, $$2);
      }
   }

   protected void c(aub $$0, E $$1, long $$2) {
      if ($$1.dV() == null) {
         $$1.a(bzm.e.b);
      }
   }
}
