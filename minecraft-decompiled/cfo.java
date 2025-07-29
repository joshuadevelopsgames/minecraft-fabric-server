import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class cfo extends ccd<cuf> {
   private static final int c = 300;
   private static final double d = 1.73;
   private long e;

   public cfo() {
      super(ImmutableMap.of(cjo.c, cjp.a, cjo.o, cjp.c));
   }

   protected boolean b(aub $$0, cuf $$1) {
      if ($$0.ae() - this.e < 300L) {
         return false;
      } else if ($$0.A.a(2) != 0) {
         return false;
      } else {
         this.e = $$0.ae();
         jk $$2 = $$1.eh().c(cjo.c).get();
         return $$2.a() == $$0.aj() && $$2.b().a($$1.dv(), 1.73);
      }
   }

   protected void a(aub $$0, cuf $$1, long $$2) {
      cbm<cuf> $$3 = $$1.eh();
      $$3.a(cjo.K, $$2);
      $$3.c(cjo.c).ifPresent($$1x -> $$3.a(cjo.o, new ccg($$1x.b())));
      $$1.gX();
      this.a($$0, $$1);
      if ($$1.gV()) {
         $$1.gU();
      }
   }

   protected void a(aub $$0, cuf $$1) {
   }

   protected boolean b(aub $$0, cuf $$1, long $$2) {
      Optional<jk> $$3 = $$1.eh().c(cjo.c);
      if ($$3.isEmpty()) {
         return false;
      } else {
         jk $$4 = $$3.get();
         return $$4.a() == $$0.aj() && $$4.b().a($$1.dv(), 1.73);
      }
   }
}
