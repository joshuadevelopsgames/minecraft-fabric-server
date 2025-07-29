public abstract class zs<T extends ws> implements zw<T> {
   @Override
   public final void a(T $$0) {
      throw new AssertionError("This packet should be handled by pipeline");
   }

   @Override
   public abstract zy<? extends zs<T>> a();
}
