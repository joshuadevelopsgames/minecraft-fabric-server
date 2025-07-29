import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class cdx {
   public static cce<cuf> a() {
      return cfq.a((Function<cfq.b<cuf>, ? extends App<cfq.c<cuf>, cft<cuf>>>)($$0 -> $$0.group($$0.c(cjo.c)).apply($$0, $$0x -> ($$0xx, $$1, $$2) -> {
         cug $$3 = $$1.gR();
         boolean $$4 = !$$3.b().a(cui.b) && !$$3.b().a(cui.m);
         if ($$4 && $$1.t() == 0 && $$3.c() <= 1) {
            $$1.a($$1.gR().b($$0xx.K_(), cui.b));
            $$1.g($$0xx);
            return true;
         } else {
            return false;
         }
      })));
   }
}
