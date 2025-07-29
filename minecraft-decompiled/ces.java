import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class ces {
   private static final int a = 200;

   public static <E extends cao> cce<E> a(ces.b<E> $$0) {
      return a(($$0x, $$1) -> false, $$0, true);
   }

   public static <E extends cao> cce<E> a(ces.a $$0) {
      return a($$0, ($$0x, $$1, $$2) -> {}, true);
   }

   public static <E extends cao> cce<E> a() {
      return a(($$0, $$1) -> false, ($$0, $$1, $$2) -> {}, true);
   }

   public static <E extends cao> cce<E> a(ces.a $$0, ces.b<E> $$1, boolean $$2) {
      return cfq.a(
         (Function<cfq.b<E>, ? extends App<cfq.c<E>, cft<E>>>)($$3 -> $$3.group($$3.b(cjo.p), $$3.a(cjo.F)).apply($$3, ($$4, $$5) -> ($$6, $$7, $$8) -> {
            cam $$9 = $$3.b($$4);
            if ($$7.c($$9) && (!$$2 || !a($$7, $$3.a($$5))) && $$9.bO() && $$9.ai() == $$7.ai() && !$$0.test($$6, $$9)) {
               return true;
            } else {
               $$1.accept($$6, (E)$$7, $$9);
               $$4.b();
               return true;
            }
         }))
      );
   }

   private static boolean a(cam $$0, Optional<Long> $$1) {
      return $$1.isPresent() && $$0.ai().ae() - $$1.get() > 200L;
   }

   @FunctionalInterface
   public interface a {
      boolean test(aub var1, cam var2);
   }

   @FunctionalInterface
   public interface b<E> {
      void accept(aub var1, E var2, cam var3);
   }
}
