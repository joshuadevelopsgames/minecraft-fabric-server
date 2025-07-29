import it.unimi.dsi.fastutil.objects.ObjectOpenHashSet;
import java.util.Set;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class bvl {
   private final Set<String> a = new ObjectOpenHashSet();

   public Set<bvd> a(Supplier<btq> $$0) {
      Set<bvd> $$1 = $$0.get()
         .e()
         .stream()
         .filter($$0x -> !this.a.contains($$0x.getLeft()))
         .map($$1x -> a($$0, (String)$$1x.getLeft(), (bvc)$$1x.getRight()))
         .collect(Collectors.toSet());

      for (bvd $$2 : $$1) {
         this.a.add($$2.d());
      }

      return $$1;
   }

   private static bvd a(Supplier<btq> $$0, String $$1, bvc $$2) {
      return bvd.a($$1, $$2, () -> {
         btl.a $$2x = $$0.get().c($$1);
         return $$2x == null ? 0.0 : (double)$$2x.b() / bdg.b;
      });
   }
}
