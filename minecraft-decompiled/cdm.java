import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import javax.annotation.Nullable;

public class cdm {
   public static cdo<cam> a(float $$0) {
      return cfq.a((Function<cfq.b<cam>, ? extends App<cfq.c<cam>, cft<cam>>>)($$1 -> $$1.group($$1.c(cjo.n)).apply($$1, $$1x -> ($$2, $$3, $$4) -> {
         if ($$2.h($$3.dx())) {
            return false;
         } else {
            Optional<fis> $$5 = Optional.ofNullable(a($$2, $$3));
            $$5.ifPresent($$2x -> $$1x.a(new cjr($$2x, $$0, 0)));
            return true;
         }
      })));
   }

   @Nullable
   private static fis a(aub $$0, cam $$1) {
      bck $$2 = $$1.ec();
      jb $$3 = $$1.dx();

      for (int $$4 = 0; $$4 < 10; $$4++) {
         jb $$5 = $$3.b($$2.a(20) - 10, $$2.a(6) - 3, $$2.a(20) - 10);
         if (a($$0, $$1, $$5)) {
            return fis.c($$5);
         }
      }

      return null;
   }

   public static boolean a(aub $$0, cam $$1, jb $$2) {
      return $$0.h($$2) && $$0.a(eka.a.e, $$2).v() <= $$1.dE();
   }
}
