import com.mojang.serialization.Lifecycle;

public interface qq<T> {
   jl.c<T> a(amd<T> var1, T var2, Lifecycle var3);

   default jl.c<T> a(amd<T> $$0, T $$1) {
      return this.a($$0, $$1, Lifecycle.stable());
   }

   <S> jm<S> a(amd<? extends jy<? extends S>> var1);
}
