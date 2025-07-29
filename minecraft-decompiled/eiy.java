import java.util.function.Consumer;
import javax.annotation.Nullable;

public class eiy<T extends ejd> {
   private final T a;
   @Nullable
   private ke b;

   public eiy(T $$0) {
      this.a = $$0;
   }

   public void a(aub $$0) {
      this.c($$0);
   }

   public T a() {
      return this.a;
   }

   public void b(aub $$0) {
      a($$0, this.b, $$0x -> $$0x.b(this.a));
   }

   public void c(aub $$0) {
      this.a.a().a($$0).map(ke::a).ifPresent($$1 -> {
         if (this.b == null || !this.b.equals($$1)) {
            a($$0, this.b, $$0xx -> $$0xx.b(this.a));
            this.b = $$1;
            a($$0, this.b, $$0xx -> $$0xx.a(this.a));
         }
      });
   }

   private static void a(dmx $$0, @Nullable ke $$1, Consumer<eje> $$2) {
      if ($$1 != null) {
         efy $$3 = $$0.a($$1.a(), $$1.c(), egz.n, false);
         if ($$3 != null) {
            $$2.accept($$3.a($$1.b()));
         }
      }
   }
}
