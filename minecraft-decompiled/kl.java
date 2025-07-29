import javax.annotation.Nullable;

public interface kl {
   @Nullable
   <T> T a(kp<? extends T> var1);

   default <T> T a(kp<? extends T> $$0, T $$1) {
      T $$2 = this.a($$0);
      return $$2 != null ? $$2 : $$1;
   }

   @Nullable
   default <T> ks<T> b(kp<T> $$0) {
      T $$1 = this.a($$0);
      return $$1 != null ? new ks<>($$0, $$1) : null;
   }
}
