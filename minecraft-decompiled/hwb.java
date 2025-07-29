import java.util.List;
import java.util.Locale;
import java.util.function.Function;
import java.util.stream.Stream;

@FunctionalInterface
public interface hwb<T> {
   static <T> hwb<T> empty() {
      return $$0 -> List.of();
   }

   static <T> hwb<T> plainText(List<T> $$0, Function<T, Stream<String>> $$1) {
      if ($$0.isEmpty()) {
         return empty();
      } else {
         hwc<T> $$2 = new hwc<>();

         for (T $$3 : $$0) {
            $$1.apply($$3).forEach($$2x -> $$2.a($$3, $$2x.toLowerCase(Locale.ROOT)));
         }

         $$2.a();
         return $$2::a;
      }
   }

   List<T> search(String var1);
}
