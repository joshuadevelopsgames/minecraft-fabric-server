import com.google.common.collect.Iterables;
import it.unimi.dsi.fastutil.objects.Object2BooleanOpenHashMap;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class cjq {
   private static final cjq a = new cjq();
   private final List<cam> b;
   private final Predicate<cam> c;

   private cjq() {
      this.b = List.of();
      this.c = $$0 -> false;
   }

   public cjq(aub $$0, cam $$1, List<cam> $$2) {
      this.b = $$2;
      Object2BooleanOpenHashMap<cam> $$3 = new Object2BooleanOpenHashMap($$2.size());
      Predicate<cam> $$4 = $$2x -> ckv.b($$0, $$1, $$2x);
      this.c = $$2x -> $$3.computeIfAbsent($$2x, $$4);
   }

   public static cjq a() {
      return a;
   }

   public Optional<cam> a(Predicate<cam> $$0) {
      for (cam $$1 : this.b) {
         if ($$0.test($$1) && this.c.test($$1)) {
            return Optional.of($$1);
         }
      }

      return Optional.empty();
   }

   public Iterable<cam> b(Predicate<cam> $$0) {
      return Iterables.filter(this.b, $$1 -> $$0.test($$1) && this.c.test($$1));
   }

   public Stream<cam> c(Predicate<cam> $$0) {
      return this.b.stream().filter($$1 -> $$0.test($$1) && this.c.test($$1));
   }

   public boolean a(cam $$0) {
      return this.b.contains($$0) && this.c.test($$0);
   }

   public boolean d(Predicate<cam> $$0) {
      for (cam $$1 : this.b) {
         if ($$0.test($$1) && this.c.test($$1)) {
            return true;
         }
      }

      return false;
   }
}
