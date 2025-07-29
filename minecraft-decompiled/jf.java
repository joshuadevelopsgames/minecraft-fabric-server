import com.mojang.serialization.Lifecycle;
import java.util.Optional;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;

public class jf<T> extends jt<T> implements jg<T> {
   private final ame b;
   private jl.c<T> c;

   public jf(String $$0, amd<? extends jy<T>> $$1, Lifecycle $$2, boolean $$3) {
      super($$1, $$2, $$3);
      this.b = ame.a($$0);
   }

   @Override
   public jl.c<T> a(amd<T> $$0, T $$1, jx $$2) {
      jl.c<T> $$3 = super.a($$0, $$1, $$2);
      if (this.b.equals($$0.a())) {
         this.c = $$3;
      }

      return $$3;
   }

   @Override
   public int a(@Nullable T $$0) {
      int $$1 = super.a($$0);
      return $$1 == -1 ? super.a(this.c.a()) : $$1;
   }

   @Nonnull
   @Override
   public ame b(T $$0) {
      ame $$1 = super.b($$0);
      return $$1 == null ? this.b : $$1;
   }

   @Nonnull
   @Override
   public T a(@Nullable ame $$0) {
      T $$1 = super.a($$0);
      return $$1 == null ? this.c.a() : $$1;
   }

   @Override
   public Optional<T> b(@Nullable ame $$0) {
      return Optional.ofNullable(super.a($$0));
   }

   @Override
   public Optional<jl.c<T>> a() {
      return Optional.ofNullable(this.c);
   }

   @Nonnull
   @Override
   public T a(int $$0) {
      T $$1 = super.a($$0);
      return $$1 == null ? this.c.a() : $$1;
   }

   @Override
   public Optional<jl.c<T>> a(bck $$0) {
      return super.a($$0).or(() -> Optional.of(this.c));
   }

   @Override
   public ame b() {
      return this.b;
   }
}
