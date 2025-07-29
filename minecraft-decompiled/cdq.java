import com.mojang.datafixers.kinds.App;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public class cdq {
   public static cce<cuf> a() {
      return cfq.a(
         (Function<cfq.b<cuf>, ? extends App<cfq.c<cuf>, cft<cuf>>>)($$0 -> $$0.group($$0.b(cjo.c), $$0.b(cjo.g))
            .apply(
               $$0,
               ($$1, $$2) -> ($$3, $$4, $$5) -> {
                  jk $$6 = $$0.b($$1);
                  $$3.B()
                     .c($$6.b())
                     .ifPresent(
                        $$4x -> $$0.<List<cam>>b($$2)
                           .stream()
                           .filter($$1xxx -> $$1xxx instanceof cuf && $$1xxx != $$4)
                           .map($$0xxxx -> (cuf)$$0xxxx)
                           .filter(cam::bO)
                           .filter($$2xxx -> a($$6, $$4x, $$2xxx))
                           .reduce($$4, cdq::a)
                     );
                  return true;
               }
            ))
      );
   }

   private static cuf a(cuf $$0, cuf $$1) {
      cuf $$2;
      cuf $$3;
      if ($$0.t() > $$1.t()) {
         $$2 = $$0;
         $$3 = $$1;
      } else {
         $$2 = $$1;
         $$3 = $$0;
      }

      $$3.eh().b(cjo.c);
      return $$2;
   }

   private static boolean a(jk $$0, jl<cls> $$1, cuf $$2) {
      Optional<jk> $$3 = $$2.eh().c(cjo.c);
      return $$3.isPresent() && $$0.equals($$3.get()) && a($$1, $$2.gR().b());
   }

   private static boolean a(jl<cls> $$0, jl<cui> $$1) {
      return $$1.a().b().test($$0);
   }
}
