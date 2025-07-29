import com.mojang.datafixers.kinds.App;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public class cfp {
   public static cce<cuf> a(float $$0) {
      return cfq.a(
         (Function<cfq.b<cuf>, ? extends App<cfq.c<cuf>, cft<cuf>>>)($$1 -> $$1.group($$1.b(cjo.d), $$1.c(cjo.c), $$1.b(cjo.g), $$1.a(cjo.n), $$1.a(cjo.o))
            .apply(
               $$1,
               ($$2, $$3, $$4, $$5, $$6) -> ($$6x, $$7, $$8) -> {
                  if ($$7.g_()) {
                     return false;
                  } else if (!$$7.gR().b().a(cui.b)) {
                     return false;
                  } else {
                     jb $$9 = $$1.<jk>b($$2).b();
                     Optional<jl<cls>> $$10 = $$6x.B().c($$9);
                     if ($$10.isEmpty()) {
                        return true;
                     } else {
                        $$1.<List<cam>>b($$4)
                           .stream()
                           .filter($$1xxx -> $$1xxx instanceof cuf && $$1xxx != $$7)
                           .map($$0xxxx -> (cuf)$$0xxxx)
                           .filter(cam::bO)
                           .filter($$2xx -> a($$10.get(), $$2xx, $$9))
                           .findFirst()
                           .ifPresent($$6xx -> {
                              $$5.b();
                              $$6.b();
                              $$2.b();
                              if ($$6xx.eh().c(cjo.c).isEmpty()) {
                                 ccf.a($$6xx, $$9, $$0, 1);
                                 $$6xx.eh().a(cjo.d, jk.a($$6x.aj(), $$9));
                                 ahj.c($$6x, $$9);
                              }
                           });
                        return true;
                     }
                  }
               }
            ))
      );
   }

   private static boolean a(jl<cls> $$0, cuf $$1, jb $$2) {
      boolean $$3 = $$1.eh().c(cjo.d).isPresent();
      if ($$3) {
         return false;
      } else {
         Optional<jk> $$4 = $$1.eh().c(cjo.c);
         jl<cui> $$5 = $$1.gR().b();
         if ($$5.a().b().test($$0)) {
            return $$4.isEmpty() ? a($$1, $$2, $$0.a()) : $$4.get().b().equals($$2);
         } else {
            return false;
         }
      }
   }

   private static boolean a(cau $$0, jb $$1, cls $$2) {
      faz $$3 = $$0.S().a($$1, $$2.c());
      return $$3 != null && $$3.j();
   }
}
