import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class gfj {
   public static final Supplier<Optional<xm>> a = Optional::empty;
   private final gfl<?> b;
   private final Map<String, asd.a> c = new HashMap<>();

   public gfj(gfl<?> $$0) {
      this.b = $$0;
   }

   public void a(ary $$0, Consumer<gbm> $$1) {
      String $$2 = $$0.a();
      gfv.a($$0.b(), this.b, ($$2x, $$3) -> {
         this.c.put($$2, $$3);
         $$1.accept($$2x);
      });
   }

   private static fxo.a a(arq $$0, fxo.c $$1) {
      fxo.a $$2 = fxo.a($$0.a(), $$1);
      $$2.a($$0.c());
      if ($$0.b().isPresent()) {
         $$2 = $$2.a(fzb.a($$0.b().get()));
      }

      return $$2;
   }

   public Supplier<Optional<xm>> a(Optional<asd> $$0) {
      if ($$0.isPresent()) {
         asd $$1 = $$0.get();
         return () -> $$1.a(this.c);
      } else {
         return a;
      }
   }

   public fxo.a a(aro $$0) {
      Supplier<Optional<xm>> $$1 = this.a($$0.b());
      return a($$0.a(), $$1x -> this.b.a($$1.get()));
   }
}
