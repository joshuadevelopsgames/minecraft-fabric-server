import com.mojang.datafixers.kinds.App;
import java.util.function.Function;
import java.util.function.Predicate;

public class cek {
   public static cdo<cam> a(float $$0, int $$1) {
      return a($$0x -> true, $$1x -> $$0, $$1);
   }

   public static cdo<cam> a(Predicate<cam> $$0, Function<cam, Float> $$1, int $$2) {
      return cfq.a(
         (Function<cfq.b<cam>, ? extends App<cfq.c<cam>, cft<cam>>>)($$3 -> $$3.group($$3.c(cjo.n), $$3.b(cjo.o)).apply($$3, ($$4, $$5) -> ($$6, $$7, $$8) -> {
            if (!$$0.test($$7)) {
               return false;
            } else {
               $$4.a(new cjr($$3.b($$5), $$1.apply($$7), $$2));
               return true;
            }
         }))
      );
   }
}
