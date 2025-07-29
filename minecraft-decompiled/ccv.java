import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class ccv extends ccd<cuf> {
   private static final int d = 1200;
   final float c;

   public ccv(float $$0) {
      super(ImmutableMap.of(cjo.d, cjp.a), 1200);
      this.c = $$0;
   }

   protected boolean a(aub $$0, cuf $$1) {
      return $$1.eh().g().map($$0x -> $$0x == cwn.b || $$0x == cwn.c || $$0x == cwn.d).orElse(true);
   }

   protected boolean a(aub $$0, cuf $$1, long $$2) {
      return $$1.eh().a(cjo.d);
   }

   protected void b(aub $$0, cuf $$1, long $$2) {
      ccf.a($$1, $$1.eh().c(cjo.d).get().b(), this.c, 1);
   }

   protected void c(aub $$0, cuf $$1, long $$2) {
      Optional<jk> $$3 = $$1.eh().c(cjo.d);
      $$3.ifPresent($$1x -> {
         jb $$2x = $$1x.b();
         aub $$3x = $$0.q().a($$1x.a());
         if ($$3x != null) {
            clp $$4 = $$3x.B();
            if ($$4.a($$2x, $$0xx -> true)) {
               $$4.b($$2x);
            }

            ahj.c($$0, $$2x);
         }
      });
      $$1.eh().b(cjo.d);
   }
}
