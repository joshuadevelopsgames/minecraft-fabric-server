public abstract class zt<T extends ws> implements zw<T> {
   private final Iterable<zw<? super T>> a;

   protected zt(Iterable<zw<? super T>> $$0) {
      this.a = $$0;
   }

   public final Iterable<zw<? super T>> b() {
      return this.a;
   }

   @Override
   public abstract zy<? extends zt<T>> a();
}
