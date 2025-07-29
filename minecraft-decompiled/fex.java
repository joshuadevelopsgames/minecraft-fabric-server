import java.util.function.BiFunction;
import java.util.function.Consumer;

public interface fex extends fdk, BiFunction<dcv, fdj, dcv> {
   fey<? extends fex> b();

   static Consumer<dcv> a(BiFunction<dcv, fdj, dcv> $$0, Consumer<dcv> $$1, fdj $$2) {
      return $$3 -> $$1.accept($$0.apply($$3, $$2));
   }

   public interface a {
      fex b();
   }
}
