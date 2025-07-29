import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class ccw {
   private static jb a(cao $$0, jb $$1) {
      bck $$2 = $$0.ai().A;
      return $$1.b(a($$2), 0, a($$2));
   }

   private static int a(bck $$0) {
      return $$0.a(3) - 1;
   }

   public static <E extends cao> cdo<E> a(cjo<jb> $$0, int $$1, float $$2) {
      return cfq.a(
         (Function<cfq.b<E>, ? extends App<cfq.c<E>, cft<E>>>)($$3 -> $$3.group($$3.b($$0), $$3.c(cjo.p), $$3.c(cjo.n), $$3.a(cjo.o))
            .apply($$3, ($$3x, $$4, $$5, $$6) -> ($$4x, $$5x, $$6x) -> {
               jb $$7 = $$3.b($$3x);
               boolean $$8 = $$7.a($$5x.dx(), $$1);
               if (!$$8) {
                  ccf.a($$5x, a($$5x, $$7), $$2, $$1);
               }

               return true;
            }))
      );
   }
}
