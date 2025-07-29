import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class cgb {
   public static cce<cam> a() {
      return cfq.a(
         (Function<cfq.b<cam>, ? extends App<cfq.c<cam>, cft<cam>>>)($$0 -> $$0.group($$0.a(cjo.o), $$0.a(cjo.aA), $$0.a(cjo.az), $$0.c(cjo.p))
            .apply($$0, ($$1, $$2, $$3, $$4) -> ($$4x, $$5, $$6) -> {
               Optional<jb> $$7 = $$0.<cam>a($$3).map(bzm::dx).or(() -> $$0.a($$2));
               if ($$7.isEmpty()) {
                  return false;
               } else {
                  $$1.a(new ccg($$7.get()));
                  return true;
               }
            }))
      );
   }
}
