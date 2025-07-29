import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record du<T>(bae<T> a, boolean b) {
   public static <T> Codec<du<T>> a(amd<? extends jy<T>> $$0) {
      return RecordCodecBuilder.create(
         $$1 -> $$1.group(bae.a($$0).fieldOf("id").forGetter(du::a), Codec.BOOL.fieldOf("expected").forGetter(du::b)).apply($$1, du::new)
      );
   }

   public static <T> du<T> a(bae<T> $$0) {
      return new du<>($$0, true);
   }

   public static <T> du<T> b(bae<T> $$0) {
      return new du<>($$0, false);
   }

   public boolean a(jl<T> $$0) {
      return $$0.a(this.a) == this.b;
   }
}
