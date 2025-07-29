import com.mojang.serialization.DataResult;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.Lifecycle;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;

public class amc<T> extends alv<T> {
   private final amc.c b;

   public static <T> amc<T> a(DynamicOps<T> $$0, jn.a $$1) {
      return a($$0, new amc.a($$1));
   }

   public static <T> amc<T> a(DynamicOps<T> $$0, amc.c $$1) {
      return new amc<>($$0, $$1);
   }

   public static <T> Dynamic<T> a(Dynamic<T> $$0, jn.a $$1) {
      return new Dynamic($$1.a($$0.getOps()), $$0.getValue());
   }

   private amc(DynamicOps<T> $$0, amc.c $$1) {
      super($$0);
      this.b = $$1;
   }

   public <U> amc<U> a(DynamicOps<U> $$0) {
      return (amc<U>)($$0 == this.a ? this : new amc((DynamicOps<T>)$$0, this.b));
   }

   public <E> Optional<jo<E>> a(amd<? extends jy<? extends E>> $$0) {
      return this.b.a($$0).map(amc.b::a);
   }

   public <E> Optional<jm<E>> b(amd<? extends jy<? extends E>> $$0) {
      return this.b.a($$0).map(amc.b::b);
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else if ($$0 != null && this.getClass() == $$0.getClass()) {
         amc<?> $$1 = (amc<?>)$$0;
         return this.a.equals($$1.a) && this.b.equals($$1.b);
      } else {
         return false;
      }
   }

   @Override
   public int hashCode() {
      return this.a.hashCode() * 31 + this.b.hashCode();
   }

   public static <E, O> RecordCodecBuilder<O, jm<E>> c(amd<? extends jy<? extends E>> $$0) {
      return bbi.a(
            (Function<DynamicOps<?>, DataResult<E>>)($$1 -> $$1 instanceof amc<?> $$2
               ? $$2.b.a($$0).map($$0xx -> DataResult.success($$0xx.b(), $$0xx.c())).orElseGet(() -> DataResult.error(() -> "Unknown registry: " + $$0))
               : DataResult.error(() -> "Not a registry ops"))
         )
         .forGetter($$0x -> null);
   }

   public static <E, O> RecordCodecBuilder<O, jl.c<E>> d(amd<E> $$0) {
      amd<? extends jy<E>> $$1 = amd.a($$0.b());
      return bbi.a(
            (Function<DynamicOps<?>, DataResult<E>>)($$2 -> $$2 instanceof amc<?> $$3
               ? $$3.b
                  .a($$1)
                  .flatMap($$1xx -> $$1xx.b().a($$0))
                  .<DataResult<E>>map(DataResult::success)
                  .orElseGet(() -> DataResult.error(() -> "Can't find value: " + $$0))
               : DataResult.error(() -> "Not a registry ops"))
         )
         .forGetter($$0x -> null);
   }

   static final class a implements amc.c {
      private final jn.a a;
      private final Map<amd<? extends jy<?>>, Optional<? extends amc.b<?>>> b = new ConcurrentHashMap<>();

      public a(jn.a $$0) {
         this.a = $$0;
      }

      @Override
      public <E> Optional<amc.b<E>> a(amd<? extends jy<? extends E>> $$0) {
         return (Optional<amc.b<E>>)this.b.computeIfAbsent($$0, this::b);
      }

      private Optional<amc.b<Object>> b(amd<? extends jy<?>> $$0) {
         return this.a.a($$0).map(amc.b::a);
      }

      @Override
      public boolean equals(Object $$0) {
         return this == $$0 ? true : $$0 instanceof amc.a $$1 && this.a.equals($$1.a);
      }

      @Override
      public int hashCode() {
         return this.a.hashCode();
      }
   }

   public record b<T>(jo<T> a, jm<T> b, Lifecycle c) {
      public static <T> amc.b<T> a(jn.b<T> $$0) {
         return new amc.b<>($$0, $$0, $$0.h());
      }
   }

   public interface c {
      <T> Optional<amc.b<T>> a(amd<? extends jy<? extends T>> var1);
   }
}
