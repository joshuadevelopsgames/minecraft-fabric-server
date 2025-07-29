import com.google.common.collect.ImmutableMap;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class cen extends ccd<cam> {
   public static final int c = 100;
   private long d;

   public cen() {
      super(ImmutableMap.of(cjo.b, cjp.a, cjo.J, cjp.c));
   }

   @Override
   protected boolean a(aub $$0, cam $$1) {
      if ($$1.cc()) {
         return false;
      } else {
         cbm<?> $$2 = $$1.eh();
         jk $$3 = $$2.c(cjo.b).get();
         if ($$0.aj() != $$3.a()) {
            return false;
         } else {
            Optional<Long> $$4 = $$2.c(cjo.J);
            if ($$4.isPresent()) {
               long $$5 = $$0.ae() - $$4.get();
               if ($$5 > 0L && $$5 < 100L) {
                  return false;
               }
            }

            eeb $$6 = $$0.a_($$3.b());
            return $$3.b().a($$1.dv(), 2.0) && $$6.a(azo.Q) && !$$6.c(dps.c);
         }
      }
   }

   @Override
   protected boolean a(aub $$0, cam $$1, long $$2) {
      Optional<jk> $$3 = $$1.eh().c(cjo.b);
      if ($$3.isEmpty()) {
         return false;
      } else {
         jb $$4 = $$3.get().b();
         return $$1.eh().c(cwn.e) && $$1.dE() > $$4.v() + 0.4 && $$4.a($$1.dv(), 1.14);
      }
   }

   @Override
   protected void d(aub $$0, cam $$1, long $$2) {
      if ($$2 > this.d) {
         cbm<?> $$3 = $$1.eh();
         if ($$3.a(cjo.w)) {
            Set<jk> $$4 = $$3.c(cjo.w).get();
            Optional<List<cam>> $$5;
            if ($$3.a(cjo.g)) {
               $$5 = $$3.c(cjo.g);
            } else {
               $$5 = Optional.empty();
            }

            cdb.a($$0, $$1, null, null, $$4, $$5);
         }

         $$1.b($$1.eh().c(cjo.b).get().b());
      }
   }

   @Override
   protected boolean a(long $$0) {
      return false;
   }

   @Override
   protected void b(aub $$0, cam $$1, long $$2) {
      if ($$1.fY()) {
         $$1.fZ();
         this.d = $$2 + 40L;
      }
   }
}
