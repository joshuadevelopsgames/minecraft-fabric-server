import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Stream;

public class fwh implements fwe {
   private final dpz a;
   private final List<fwh.b> b;
   private final Set<efe<?>> c;

   fwh(dpz $$0, List<fwh.b> $$1, Set<efe<?>> $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   static Set<efe<?>> a(Set<efe<?>> $$0, dpz $$1, fwi<?> $$2) {
      List<efe<?>> $$3 = $$2.b();
      $$3.forEach($$2x -> {
         if ($$1.l().a($$2x.f()) != $$2x) {
            throw new IllegalStateException("Property " + $$2x + " is not defined for block " + $$1);
         } else if ($$0.contains($$2x)) {
            throw new IllegalStateException("Values of property " + $$2x + " already defined for block " + $$1);
         }
      });
      Set<efe<?>> $$4 = new HashSet<>($$0);
      $$4.addAll($$3);
      return $$4;
   }

   public fwh a(fwi<gzm> $$0) {
      Set<efe<?>> $$1 = a(this.c, this.a, $$0);
      List<fwh.b> $$2 = this.b.stream().flatMap($$1x -> $$1x.a($$0)).toList();
      return new fwh(this.a, $$2, $$1);
   }

   public fwh a(gzm $$0) {
      List<fwh.b> $$1 = this.b.stream().flatMap($$1x -> $$1x.a($$0)).toList();
      return new fwh(this.a, $$1, this.c);
   }

   @Override
   public gza b() {
      Map<String, gzc.b> $$0 = new HashMap<>();

      for (fwh.b $$1 : this.b) {
         $$0.put($$1.a.a(), $$1.b.a());
      }

      return new gza(Optional.of(new gza.b($$0)), Optional.empty());
   }

   @Override
   public dpz a() {
      return this.a;
   }

   public static fwh.a a(dpz $$0) {
      return new fwh.a($$0);
   }

   public static fwh a(dpz $$0, fwc $$1) {
      return new fwh($$0, List.of(new fwh.b(fwj.a, $$1)), Set.of());
   }

   public static class a {
      private final dpz a;

      public a(dpz $$0) {
         this.a = $$0;
      }

      public fwh a(fwi<fwc> $$0) {
         Set<efe<?>> $$1 = fwh.a(Set.of(), this.a, $$0);
         List<fwh.b> $$2 = $$0.a().entrySet().stream().map($$0x -> new fwh.b((fwj)$$0x.getKey(), (fwc)$$0x.getValue())).toList();
         return new fwh(this.a, $$2, $$1);
      }
   }

   record b(fwj a, fwc b) {

      public Stream<fwh.b> a(fwi<gzm> $$0) {
         return $$0.a().entrySet().stream().map($$0x -> {
            fwj $$1 = this.a.a((fwj)$$0x.getKey());
            fwc $$2 = this.b.a((gzm)$$0x.getValue());
            return new fwh.b($$1, $$2);
         });
      }

      public Stream<fwh.b> a(gzm $$0) {
         return Stream.of(new fwh.b(this.a, this.b.a($$0)));
      }
   }
}
