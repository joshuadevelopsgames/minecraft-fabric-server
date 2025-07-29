import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class cei {
   private static final int a = 1;

   public static cce<cao> a(float $$0) {
      return a($$1 -> $$0);
   }

   public static cce<cao> a(Function<cam, Float> $$0) {
      return cfq.a(
         (Function<cfq.b<cao>, ? extends App<cfq.c<cao>, cft<cao>>>)($$1 -> $$1.group($$1.a(cjo.n), $$1.a(cjo.o), $$1.b(cjo.p), $$1.a(cjo.h))
            .apply($$1, ($$2, $$3, $$4, $$5) -> ($$6, $$7, $$8) -> {
               cam $$9 = $$1.b($$4);
               Optional<cjq> $$10 = $$1.a($$5);
               if ($$10.isPresent() && $$10.get().a($$9) && ccf.a($$7, $$9, 1)) {
                  $$2.b();
               } else {
                  $$3.a(new cco($$9, true));
                  $$2.a(new cjr(new cco($$9, false), $$0.apply($$7), 0));
               }

               return true;
            }))
      );
   }
}
