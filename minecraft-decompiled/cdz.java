import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class cdz {
   private static final float b = 0.95F;
   public static final int a = 3;

   public static cce<cam> a() {
      return cfq.a((Function<cfq.b<cam>, ? extends App<cfq.c<cam>, cft<cam>>>)($$0 -> $$0.group($$0.b(cjo.e)).apply($$0, $$1 -> ($$2, $$3, $$4) -> {
         if ($$2.A.i() <= 0.95F) {
            return false;
         } else {
            jb $$5 = $$0.<jk>b($$1).b();
            if ($$5.a($$3.dx(), 3.0)) {
               eeb $$6 = $$2.a_($$5);
               if ($$6.a(dqb.oK)) {
                  dpv $$7 = (dpv)$$6.b();
                  $$7.a($$3, $$2, $$5, null);
               }
            }

            return true;
         }
      })));
   }
}
