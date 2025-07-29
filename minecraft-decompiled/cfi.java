import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class cfi {
   private static final int a = 36;

   public static cce<cam> a() {
      return cfq.a(
         (Function<cfq.b<cam>, ? extends App<cfq.c<cam>, cft<cam>>>)($$0 -> $$0.group($$0.a(cjo.y), $$0.a(cjo.z), $$0.a(cjo.B))
            .apply($$0, ($$1, $$2, $$3) -> ($$4, $$5, $$6) -> {
               boolean $$7 = $$0.a($$1).isPresent() || $$0.a($$3).isPresent() || $$0.<cam>a($$2).filter($$1xx -> $$1xx.g($$5) <= 36.0).isPresent();
               if (!$$7) {
                  $$1.b();
                  $$2.b();
                  $$5.eh().a($$4.af(), $$4.ae());
               }

               return true;
            }))
      );
   }
}
