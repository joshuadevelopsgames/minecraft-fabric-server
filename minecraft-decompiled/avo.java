import com.mojang.serialization.DynamicOps;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;

public class avo implements aus {
   public static final aus.a a = new aus.a("synchronize_registries");
   private final List<awv> b;
   private final js<amn> c;

   public avo(List<awv> $$0, js<amn> $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public void a(Consumer<zw<?>> $$0) {
      $$0.accept(new acc(this.b));
   }

   private void a(Consumer<zw<?>> $$0, Set<awv> $$1) {
      DynamicOps<vi> $$2 = this.c.a().a(uw.a);
      kc.a($$2, this.c.c(amn.b), $$1, ($$1x, $$2x) -> $$0.accept(new aca($$1x, $$2x)));
      $$0.accept(new aar(bag.a(this.c)));
   }

   public void a(List<awv> $$0, Consumer<zw<?>> $$1) {
      if ($$0.equals(this.b)) {
         this.a($$1, Set.copyOf(this.b));
      } else {
         this.a($$1, Set.of());
      }
   }

   @Override
   public aus.a a() {
      return a;
   }
}
