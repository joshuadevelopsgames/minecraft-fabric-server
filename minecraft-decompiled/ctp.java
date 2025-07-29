import com.mojang.datafixers.kinds.App;
import java.util.List;
import java.util.function.Function;

public class ctp {
   public static cdo<cti> a() {
      return cfq.a(
         (Function<cfq.b<cti>, ? extends App<cfq.c<cti>, cft<cti>>>)($$0 -> $$0.group($$0.b(cjo.al), $$0.c(cjo.ac), $$0.c(cjo.ai), $$0.a(cjo.ap))
            .apply($$0, ($$1, $$2, $$3, $$4) -> ($$3x, $$4x, $$5) -> {
               if (!$$4x.g_() && !$$0.<List>a($$4).map($$0xxx -> $$0xxx.stream().anyMatch(ctp::a)).isPresent()) {
                  ctc $$6 = $$0.b($$1);
                  ctj.c($$3x, $$4x, $$6);
                  ctj.b((cth)$$4x);
                  ctj.b($$3x, $$4x, $$6);
                  $$0.<List>a($$4).ifPresent($$0xxx -> $$0xxx.forEach(ctj::b));
                  return true;
               } else {
                  return false;
               }
            }))
      );
   }

   private static boolean a(cth $$0) {
      return $$0.eh().a(cjo.ai);
   }
}
