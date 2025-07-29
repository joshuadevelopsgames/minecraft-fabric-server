import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class ctr {
   public static cce<cam> a(int $$0, int $$1) {
      return cfq.a(
         (Function<cfq.b<cam>, ? extends App<cfq.c<cam>, cft<cam>>>)($$2 -> $$2.group($$2.b(cjo.ae), $$2.b(cjo.M), $$2.a(cjo.af), $$2.a(cjo.ag))
            .apply($$2, ($$3, $$4, $$5, $$6) -> ($$6x, $$7, $$8) -> {
               if (!$$7.fi().f()) {
                  return false;
               } else {
                  Optional<Integer> $$9 = $$2.a($$5);
                  if ($$9.isEmpty()) {
                     $$5.a(0);
                  } else {
                     int $$10 = $$9.get();
                     if ($$10 > $$0) {
                        $$3.b();
                        $$5.b();
                        $$6.a(true, $$1);
                     } else {
                        $$5.a($$10 + 1);
                     }
                  }

                  return true;
               }
            }))
      );
   }
}
