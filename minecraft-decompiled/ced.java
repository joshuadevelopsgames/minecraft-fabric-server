import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

@Deprecated
public class ced {
   public static cce<cam> a(float $$0, bwu $$1) {
      return a($$0, $$1, $$0x -> true);
   }

   public static cce<cam> a(bzv<?> $$0, float $$1, bwu $$2) {
      return a($$1, $$2, $$1x -> $$0.equals($$1x.ap()));
   }

   private static cce<cam> a(float $$0, bwu $$1, Predicate<cam> $$2) {
      float $$3 = $$0 * $$0;
      ced.a $$4 = new ced.a($$1);
      return cfq.a(
         (Function<cfq.b<cam>, ? extends App<cfq.c<cam>, cft<cam>>>)($$3x -> $$3x.group($$3x.c(cjo.o), $$3x.b(cjo.h))
            .apply($$3x, ($$4x, $$5) -> ($$6, $$7, $$8) -> {
               Optional<cam> $$9 = $$3x.<cjq>b($$5).a($$2.and($$2xxxx -> $$2xxxx.g($$7) <= $$3));
               if ($$9.isEmpty()) {
                  return false;
               } else if (!$$4.a($$6.A)) {
                  return false;
               } else {
                  $$4x.a(new cco($$9.get(), true));
                  return true;
               }
            }))
      );
   }

   public static final class a {
      private final bwu a;
      private int b;

      public a(bwu $$0) {
         if ($$0.a() <= 1) {
            throw new IllegalArgumentException();
         } else {
            this.a = $$0;
         }
      }

      public boolean a(bck $$0) {
         if (this.b == 0) {
            this.b = this.a.a($$0) - 1;
            return false;
         } else {
            return --this.b == 0;
         }
      }
   }
}
