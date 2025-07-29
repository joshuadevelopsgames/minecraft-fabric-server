import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class cca {
   public static cdo<cam> a(bwu $$0, float $$1) {
      return a($$0, $$1x -> $$1, cjo.L, false);
   }

   public static cdo<cam> a(bwu $$0, Function<cam, Float> $$1, cjo<? extends cam> $$2, boolean $$3) {
      return cfq.a(
         (Function<cfq.b<cam>, ? extends App<cfq.c<cam>, cft<cam>>>)($$4 -> $$4.group($$4.b($$2), $$4.a(cjo.o), $$4.c(cjo.n))
            .apply($$4, ($$4x, $$5, $$6) -> ($$7, $$8, $$9) -> {
               if (!$$8.g_()) {
                  return false;
               } else {
                  cam $$10 = $$4.b($$4x);
                  if ($$8.a($$10, $$0.b() + 1) && !$$8.a($$10, $$0.a())) {
                     cjr $$11 = new cjr(new cco($$10, $$3, $$3), $$1.apply($$8), $$0.a() - 1);
                     $$5.a(new cco($$10, true, $$3));
                     $$6.a($$11);
                     return true;
                  } else {
                     return false;
                  }
               }
            }))
      );
   }
}
