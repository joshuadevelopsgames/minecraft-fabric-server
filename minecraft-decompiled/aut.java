import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.Optional;
import java.util.function.Function;

public record aut<T>(T a, Optional<T> b) {
   public static <T> Codec<aut<T>> a(Codec<T> $$0) {
      Codec<aut<T>> $$1 = RecordCodecBuilder.create(
         $$1x -> $$1x.group($$0.fieldOf("raw").forGetter(aut::a), $$0.optionalFieldOf("filtered").forGetter(aut::b)).apply($$1x, aut::new)
      );
      Codec<aut<T>> $$2 = $$0.xmap(aut::a, aut::a);
      return Codec.withAlternative($$1, $$2);
   }

   public static <B extends ByteBuf, T> zm<B, aut<T>> a(zm<B, T> $$0) {
      return zm.a($$0, aut::a, $$0.a(zk::a), aut::b, aut::new);
   }

   public static <T> aut<T> a(T $$0) {
      return new aut<>($$0, Optional.empty());
   }

   public static aut<String> a(auu $$0) {
      return new aut<>($$0.d(), $$0.c() ? Optional.of($$0.b()) : Optional.empty());
   }

   public T a(boolean $$0) {
      return $$0 ? this.b.orElse(this.a) : this.a;
   }

   public <U> aut<U> a(Function<T, U> $$0) {
      return new aut<>($$0.apply(this.a), this.b.map($$0));
   }

   public <U> Optional<aut<U>> b(Function<T, Optional<U>> $$0) {
      Optional<U> $$1 = $$0.apply(this.a);
      if ($$1.isEmpty()) {
         return Optional.empty();
      } else if (this.b.isPresent()) {
         Optional<U> $$2 = $$0.apply(this.b.get());
         return $$2.isEmpty() ? Optional.empty() : Optional.of(new aut<>($$1.get(), $$2));
      } else {
         return Optional.of(new aut<>($$1.get(), Optional.empty()));
      }
   }
}
