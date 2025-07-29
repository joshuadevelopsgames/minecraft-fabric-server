import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class ccb {
   public static cdo<cao> a(int $$0, float $$1) {
      return cfq.a(
         (Function<cfq.b<cao>, ? extends App<cfq.c<cao>, cft<cao>>>)($$2 -> $$2.group($$2.c(cjo.n), $$2.a(cjo.o), $$2.b(cjo.p), $$2.b(cjo.h))
            .apply($$2, ($$3, $$4, $$5, $$6) -> ($$6x, $$7, $$8) -> {
               cam $$9 = $$2.b($$5);
               if ($$9.a($$7, $$0) && $$2.<cjq>b($$6).a($$9)) {
                  $$4.a(new cco($$9, true));
                  $$7.Q().a(-$$1, 0.0F);
                  $$7.v(bcb.c($$7.dP(), $$7.bt, 0.0F));
                  return true;
               } else {
                  return false;
               }
            }))
      );
   }
}
