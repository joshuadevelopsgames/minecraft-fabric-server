import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class ckl<T extends cam> extends ckv<T> {
   private final BiPredicate<T, cam> a;
   private final Predicate<T> b;
   private final cjo<Boolean> c;
   private final int d;

   public ckl(int $$0, BiPredicate<T, cam> $$1, Predicate<T> $$2, cjo<Boolean> $$3, int $$4) {
      super($$0);
      this.a = $$1;
      this.b = $$2;
      this.c = $$3;
      this.d = $$4;
   }

   @Override
   protected void a(aub $$0, T $$1) {
      if (!this.b.test($$1)) {
         this.c($$1);
      } else {
         this.a($$1);
      }
   }

   @Override
   public Set<cjo<?>> a() {
      return Set.of(cjo.g);
   }

   @Override
   public void a(T $$0) {
      Optional<List<cam>> $$1 = $$0.eh().c(cjo.g);
      if (!$$1.isEmpty()) {
         boolean $$2 = $$1.get().stream().anyMatch($$1x -> this.a.test($$0, $$1x));
         if ($$2) {
            this.b($$0);
         }
      }
   }

   public void b(T $$0) {
      $$0.eh().a(this.c, true, this.d);
   }

   public void c(T $$0) {
      $$0.eh().b(this.c);
   }
}
