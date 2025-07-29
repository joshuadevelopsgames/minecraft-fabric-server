import com.mojang.datafixers.kinds.App;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class cfg {
   private static final int a = 16;

   public static cce<cam> a(Predicate<jl<cls>> $$0, cjo<jk> $$1) {
      return cfq.a((Function<cfq.b<cam>, ? extends App<cfq.c<cam>, cft<cam>>>)($$2 -> $$2.group($$2.b($$1)).apply($$2, $$2x -> ($$3, $$4, $$5) -> {
         jk $$6 = $$2.b($$2x);
         jb $$7 = $$6.b();
         if ($$3.aj() == $$6.a() && $$7.a($$4.dv(), 16.0)) {
            aub $$8 = $$3.q().a($$6.a());
            if ($$8 == null || !$$8.B().a($$7, $$0)) {
               $$2x.b();
            } else if (a($$8, $$7, $$4)) {
               $$2x.b();
               if (!a($$8, $$7)) {
                  $$3.B().b($$7);
                  ahj.c($$3, $$7);
               }
            }

            return true;
         } else {
            return false;
         }
      })));
   }

   private static boolean a(aub $$0, jb $$1, cam $$2) {
      eeb $$3 = $$0.a_($$1);
      return $$3.a(azo.Q) && $$3.c(dps.c) && !$$2.fY();
   }

   private static boolean a(aub $$0, jb $$1) {
      List<cuf> $$2 = $$0.a(cuf.class, new fin($$1), cam::fY);
      return !$$2.isEmpty();
   }
}
