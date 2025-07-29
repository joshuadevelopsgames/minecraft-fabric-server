import com.google.common.collect.Interner;
import com.google.common.collect.Interners;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import io.netty.buffer.ByteBuf;
import java.util.Optional;

public record bae<T>(amd<? extends jy<T>> a, ame b) {
   private static final Interner<bae<?>> c = Interners.newWeakInterner();

   @Deprecated
   public bae(amd<? extends jy<T>> a, ame b) {
      this.a = a;
      this.b = b;
   }

   public static <T> Codec<bae<T>> a(amd<? extends jy<T>> $$0) {
      return ame.a.xmap($$1 -> a($$0, $$1), bae::b);
   }

   public static <T> Codec<bae<T>> b(amd<? extends jy<T>> $$0) {
      return Codec.STRING
         .comapFlatMap(
            $$1 -> $$1.startsWith("#") ? ame.d($$1.substring(1)).map($$1x -> a($$0, $$1x)) : DataResult.error(() -> "Not a tag id"), $$0x -> "#" + $$0x.b
         );
   }

   public static <T> zm<ByteBuf, bae<T>> c(amd<? extends jy<T>> $$0) {
      return ame.b.a($$1 -> a($$0, $$1), bae::b);
   }

   public static <T> bae<T> a(amd<? extends jy<T>> $$0, ame $$1) {
      return (bae<T>)c.intern(new bae<>($$0, $$1));
   }

   public boolean d(amd<? extends jy<?>> $$0) {
      return this.a == $$0;
   }

   public <E> Optional<bae<E>> e(amd<? extends jy<E>> $$0) {
      return this.d($$0) ? Optional.of((bae<E>)this) : Optional.empty();
   }

   @Override
   public String toString() {
      return "TagKey[" + this.a.a() + " / " + this.b + "]";
   }
}
