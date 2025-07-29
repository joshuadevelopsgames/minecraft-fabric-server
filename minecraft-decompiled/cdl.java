import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class cdl {
   private static final int a = 1;

   public static cce<cam> a(float $$0) {
      return cfq.a(
         (Function<cfq.b<cam>, ? extends App<cfq.c<cam>, cft<cam>>>)($$1 -> $$1.group($$1.a(cjo.o), $$1.c(cjo.n), $$1.b(cjo.t))
            .apply($$1, ($$2, $$3, $$4) -> ($$5, $$6, $$7) -> {
               if ($$6.cc()) {
                  return false;
               } else {
                  bzm $$8 = $$1.b($$4);
                  if ($$8.a($$6, 1.0)) {
                     $$6.o($$8);
                  } else {
                     $$2.a(new cco($$8, true));
                     $$3.a(new cjr(new cco($$8, false), $$0, 1));
                  }

                  return true;
               }
            }))
      );
   }
}
