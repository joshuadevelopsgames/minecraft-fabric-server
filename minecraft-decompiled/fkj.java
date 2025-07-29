import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.Hash.Strategy;
import java.util.List;
import javax.annotation.Nullable;

public record fkj<T>(T b, jb c, int d, fko e) {
   public static final Strategy<fkj<?>> a = new Strategy<fkj<?>>() {
      public int a(fkj<?> $$0) {
         return 31 * $$0.b().hashCode() + $$0.a().hashCode();
      }

      public boolean a(@Nullable fkj<?> $$0, @Nullable fkj<?> $$1) {
         if ($$0 == $$1) {
            return true;
         } else {
            return $$0 != null && $$1 != null ? $$0.a() == $$1.a() && $$0.b().equals($$1.b()) : false;
         }
      }
   };

   public static <T> Codec<fkj<T>> a(Codec<T> $$0) {
      MapCodec<jb> $$1 = RecordCodecBuilder.mapCodec(
         $$0x -> $$0x.group(Codec.INT.fieldOf("x").forGetter(kg::u), Codec.INT.fieldOf("y").forGetter(kg::v), Codec.INT.fieldOf("z").forGetter(kg::w))
            .apply($$0x, jb::new)
      );
      return RecordCodecBuilder.create(
         $$2 -> $$2.group(
               $$0.fieldOf("i").forGetter(fkj::a), $$1.forGetter(fkj::b), Codec.INT.fieldOf("t").forGetter(fkj::c), fko.h.fieldOf("p").forGetter(fkj::d)
            )
            .apply($$2, fkj::new)
      );
   }

   public static <T> List<fkj<T>> a(List<fkj<T>> $$0, dlz $$1) {
      long $$2 = $$1.a();
      return $$0.stream().filter($$1x -> dlz.a($$1x.b()) == $$2).toList();
   }

   public fkk<T> a(long $$0, long $$1) {
      return new fkk<>(this.b, this.c, $$0 + this.d, this.e, $$1);
   }

   public static <T> fkj<T> a(T $$0, jb $$1) {
      return new fkj<>($$0, $$1, 0, fko.d);
   }

   public T a() {
      return this.b;
   }

   public jb b() {
      return this.c;
   }

   public int c() {
      return this.d;
   }

   public fko d() {
      return this.e;
   }
}
