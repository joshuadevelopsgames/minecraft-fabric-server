import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import javax.annotation.Nullable;

public interface zu {
   int a = 4096;

   static <T extends ws, P extends zt<? super T>> zu a(final zy<P> $$0, final Function<Iterable<zw<? super T>>, P> $$1, final zs<? super T> $$2) {
      return new zu() {
         @Override
         public void a(zw<?> $$0x, Consumer<zw<?>> $$1x) {
            if ($$0.a() == $$0) {
               P $$2x = (P)$$0;
               $$1.accept($$2);
               $$2x.b().forEach($$1);
               $$1.accept($$2);
            } else {
               $$1.accept($$0);
            }
         }

         @Nullable
         @Override
         public zu.a a(zw<?> $$0x) {
            return $$0 == $$2 ? new zu.a() {
               private final List<zw<? super T>> b = new ArrayList<>();

               @Nullable
               @Override
               public zw<?> a(zw<?> $$0x) {
                  if ($$0 == $$2) {
                     return $$1.apply(this.b);
                  } else if (this.b.size() >= 4096) {
                     throw new IllegalStateException("Too many packets in a bundle");
                  } else {
                     this.b.add((zw<? super T>)$$0);
                     return null;
                  }
               }
            } : null;
         }
      };
   }

   void a(zw<?> var1, Consumer<zw<?>> var2);

   @Nullable
   zu.a a(zw<?> var1);

   public interface a {
      @Nullable
      zw<?> a(zw<?> var1);
   }
}
