import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class ccu {
   public static cce<cuf> a(float $$0, int $$1) {
      return cfq.a((Function<cfq.b<cuf>, ? extends App<cfq.c<cuf>, cft<cuf>>>)($$2 -> $$2.group($$2.c(cjo.n)).apply($$2, $$2x -> ($$3, $$4, $$5) -> {
         if ($$3.c($$4.dx())) {
            return false;
         } else {
            clp $$6 = $$3.B();
            int $$7 = $$6.a(ke.a($$4.dx()));
            fis $$8 = null;

            for (int $$9 = 0; $$9 < 5; $$9++) {
               fis $$10 = clj.a($$4, 15, 7, $$1xxxx -> -$$6.a(ke.a($$1xxxx)));
               if ($$10 != null) {
                  int $$11 = $$6.a(ke.a(jb.a((jv)$$10)));
                  if ($$11 < $$7) {
                     $$8 = $$10;
                     break;
                  }

                  if ($$11 == $$7) {
                     $$8 = $$10;
                  }
               }
            }

            if ($$8 != null) {
               $$2x.a(new cjr($$8, $$0, $$1));
            }

            return true;
         }
      })));
   }
}
