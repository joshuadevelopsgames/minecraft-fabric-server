import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Map.Entry;

public class fwm {
   public static hoe.b a(ame $$0) {
      return new hny.a($$0, List.of());
   }

   public static hoe.b a(ame $$0, fvq... $$1) {
      return new hny.a($$0, List.of($$1));
   }

   public static fvq a(int $$0) {
      return new fvl($$0);
   }

   public static hoe.b a(hoe.b... $$0) {
      return new hob.a(List.of($$0));
   }

   public static hoe.b a(ame $$0, hqv.a $$1) {
      return new hom.a($$0, $$1);
   }

   public static hok.a a(hoe.b $$0, float $$1) {
      return new hok.a($$1, $$0);
   }

   public static hoe.b a(hpq $$0, hoe.b $$1, hok.a... $$2) {
      return new hok.b($$0, 1.0F, List.of($$2), Optional.of($$1));
   }

   public static hoe.b a(hpq $$0, float $$1, hoe.b $$2, hok.a... $$3) {
      return new hok.b($$0, $$1, List.of($$3), Optional.of($$2));
   }

   public static hoe.b a(hpq $$0, hoe.b $$1, List<hok.a> $$2) {
      return new hok.b($$0, 1.0F, $$2, Optional.of($$1));
   }

   public static hoe.b a(hpq $$0, List<hok.a> $$1) {
      return new hok.b($$0, 1.0F, $$1, Optional.empty());
   }

   public static hoe.b a(hpq $$0, float $$1, List<hok.a> $$2) {
      return new hok.b($$0, $$1, $$2, Optional.empty());
   }

   public static hoe.b a(hot $$0, hoe.b $$1, hoe.b $$2) {
      return new hoc.a($$0, $$1, $$2);
   }

   public static <T> hol.b<T> a(T $$0, hoe.b $$1) {
      return new hol.b<>(List.of($$0), $$1);
   }

   public static <T> hol.b<T> a(List<T> $$0, hoe.b $$1) {
      return new hol.b<>($$0, $$1);
   }

   @SafeVarargs
   public static <T> hoe.b a(hqg<T> $$0, hoe.b $$1, hol.b<T>... $$2) {
      return a($$0, $$1, List.of($$2));
   }

   public static <T> hoe.b a(hqg<T> $$0, hoe.b $$1, List<hol.b<T>> $$2) {
      return new hol.c(new hol.d<>($$0, $$2), Optional.of($$1));
   }

   @SafeVarargs
   public static <T> hoe.b a(hqg<T> $$0, hol.b<T>... $$1) {
      return a($$0, List.of($$1));
   }

   public static <T> hoe.b a(hqg<T> $$0, List<hol.b<T>> $$1) {
      return new hol.c(new hol.d<>($$0, $$1), Optional.empty());
   }

   public static hot a() {
      return new hpc();
   }

   public static hot a(kp<?> $$0) {
      return new hoy($$0, false);
   }

   public static hoe.b a(hoe.b $$0, hoe.b $$1) {
      return a(new hpy(), $$1, a(dmu.i, $$0));
   }

   public static <T extends Comparable<T>> hoe.b a(efe<T> $$0, hoe.b $$1, Map<T, hoe.b> $$2) {
      List<hol.b<String>> $$3 = $$2.entrySet().stream().sorted(Entry.comparingByKey()).map($$1x -> {
         String $$2x = $$0.b((T)$$1x.getKey());
         return new hol.b<>(List.of($$2x), (hoe.b)$$1x.getValue());
      }).toList();
      return a(new hqc($$0.f()), $$1, $$3);
   }

   public static hoe.b b(hoe.b $$0, hoe.b $$1) {
      return a(hqd.a("MM-dd", "", Optional.empty()), $$1, List.of(a(List.of("12-24", "12-25", "12-26"), $$0)));
   }
}
