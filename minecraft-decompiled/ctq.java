import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class ctq<E extends cti> {
   public static cce<cam> a(int $$0) {
      return cfq.a(
         (Function<cfq.b<cam>, ? extends App<cfq.c<cam>, cft<cam>>>)($$1 -> $$1.group($$1.b(cjo.ae), $$1.a(cjo.M))
            .apply($$1, ($$2, $$3) -> ($$4, $$5, $$6) -> {
               if (!$$5.fi().f()) {
                  return false;
               } else {
                  Optional<cqz> $$7 = $$1.a($$3);
                  if ($$7.isPresent() && $$7.get().a($$5, $$0)) {
                     return false;
                  } else {
                     $$2.b();
                     return true;
                  }
               }
            }))
      );
   }
}
