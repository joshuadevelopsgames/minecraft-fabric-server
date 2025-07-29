import java.util.List;
import java.util.Optional;

public record dhz<T extends dhm<?>>(diy a, Optional<dhr<T>> b) {
   public static <T extends dhm<?>> zm<wx, dhz<T>> a() {
      return zm.a(diy.b, dhz::b, $$0 -> new dhz<>($$0, Optional.empty()));
   }

   public diy b() {
      return this.a;
   }

   public Optional<dhr<T>> c() {
      return this.b;
   }

   public record a<T extends dhm<?>>(dhi a, dhz<T> b) {

      public static <T extends dhm<?>> zm<wx, dhz.a<T>> a() {
         return zm.a(dhi.a, dhz.a::b, dhz.a(), dhz.a::c, dhz.a::new);
      }

      public dhi b() {
         return this.a;
      }

      public dhz<T> c() {
         return this.b;
      }
   }

   public record b<T extends dhm<?>>(List<dhz.a<T>> a) {
      public static <T extends dhm<?>> dhz.b<T> a() {
         return new dhz.b<>(List.of());
      }

      public static <T extends dhm<?>> zm<wx, dhz.b<T>> b() {
         return zm.a(dhz.a.<T>a().a(zk.a()), dhz.b::e, dhz.b::new);
      }

      public boolean a(dcv $$0) {
         return this.a.stream().anyMatch($$1 -> $$1.a.a($$0));
      }

      public dhz.b<T> b(dcv $$0) {
         return new dhz.b<>(this.a.stream().filter($$1 -> $$1.a.a($$0)).toList());
      }

      public boolean c() {
         return this.a.isEmpty();
      }

      public int d() {
         return this.a.size();
      }

      public List<dhz.a<T>> e() {
         return this.a;
      }
   }
}
