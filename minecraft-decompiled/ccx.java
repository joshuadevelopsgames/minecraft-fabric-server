import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.K1;
import java.util.function.Function;
import java.util.function.Predicate;

public class ccx {
   public static cce<cam> a(float $$0, boolean $$1, int $$2) {
      return a($$0x -> true, $$0, $$1, $$2);
   }

   public static <E extends cam> cce<E> a(Predicate<E> $$0, float $$1, boolean $$2, int $$3) {
      return cfq.a((Function<cfq.b<E>, ? extends App<cfq.c<E>, cft<E>>>)($$4 -> {
         cfq<E, ? extends cfr<? extends K1, cjr>> $$5 = $$2 ? $$4.a(cjo.n) : $$4.c(cjo.n);
         return $$4.group($$4.a(cjo.o), $$5, $$4.b(cjo.M), $$4.a(cjo.aQ)).apply($$4, ($$4x, $$5x, $$6, $$7) -> ($$8, $$9, $$10) -> {
            cqz $$11 = $$4.b($$6);
            if ($$4.a($$7).isEmpty() && $$0.test((E)$$9) && $$11.a($$9, $$3) && $$9.ai().F_().a($$11.dx()) && $$9.fU()) {
               cjr $$12 = new cjr(new cco($$11, false), $$1, 0);
               $$4x.a(new cco($$11, true));
               $$5x.a($$12);
               return true;
            } else {
               return false;
            }
         });
      }));
   }
}
