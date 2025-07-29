import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class cfh {
   private static final int a = 10;
   private static final int b = 7;

   public static cdo<cau> a(float $$0) {
      return a($$0, 10, 7);
   }

   public static cdo<cau> a(float $$0, int $$1, int $$2) {
      return cfq.a((Function<cfq.b<cau>, ? extends App<cfq.c<cau>, cft<cau>>>)($$3 -> $$3.group($$3.c(cjo.n)).apply($$3, $$3x -> ($$4, $$5, $$6) -> {
         jb $$7 = $$5.dx();
         fis $$8;
         if ($$4.c($$7)) {
            $$8 = clj.a($$5, $$1, $$2);
         } else {
            ke $$9 = ke.a($$7);
            ke $$10 = ccf.a($$4, $$9, 2);
            if ($$10 != $$9) {
               $$8 = clg.a($$5, $$1, $$2, fis.c($$10.k()), (float) (Math.PI / 2));
            } else {
               $$8 = clj.a($$5, $$1, $$2);
            }
         }

         $$3x.a(Optional.ofNullable($$8).map($$1xxxx -> new cjr($$1xxxx, $$0, 0)));
         return true;
      })));
   }
}
