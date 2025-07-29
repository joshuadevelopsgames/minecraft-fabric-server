import com.mojang.datafixers.kinds.App;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;

public class ccz {
   public static cce<cau> a(float $$0) {
      return cfq.a(
         (Function<cfq.b<cau>, ? extends App<cfq.c<cau>, cft<cau>>>)($$1 -> $$1.group($$1.c(cjo.n))
            .apply(
               $$1,
               $$1x -> ($$2, $$3, $$4) -> {
                  if ($$2.h($$3.dx())) {
                     return false;
                  } else {
                     jb $$5 = $$3.dx();
                     List<jb> $$6 = jb.d($$5.b(-1, -1, -1), $$5.b(1, 1, 1)).map(jb::j).collect(ag.b());
                     Collections.shuffle($$6);
                     $$6.stream()
                        .filter($$1xxx -> !$$2.h($$1xxx))
                        .filter($$2x -> $$2.a($$2x, $$3))
                        .filter($$2x -> $$2.g($$3))
                        .findFirst()
                        .ifPresent($$2x -> $$1x.a(new cjr($$2x, $$0, 0)));
                     return true;
                  }
               }
            ))
      );
   }
}
