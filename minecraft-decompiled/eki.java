import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.Function;

public record eki(int g, int h, int i, int j) {
   public static final Codec<eki> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
               Codec.intRange(ehy.e, ehy.d).fieldOf("min_y").forGetter(eki::c),
               Codec.intRange(0, ehy.c).fieldOf("height").forGetter(eki::d),
               Codec.intRange(1, 4).fieldOf("size_horizontal").forGetter(eki::e),
               Codec.intRange(1, 4).fieldOf("size_vertical").forGetter(eki::f)
            )
            .apply($$0, eki::new)
      )
      .comapFlatMap(eki::a, Function.identity());
   protected static final eki b = a(-64, 384, 1, 2);
   protected static final eki c = a(0, 128, 1, 2);
   protected static final eki d = a(0, 128, 2, 1);
   protected static final eki e = a(-64, 192, 1, 2);
   protected static final eki f = a(0, 256, 2, 1);

   private static DataResult<eki> a(eki $$0) {
      if ($$0.c() + $$0.d() > ehy.d + 1) {
         return DataResult.error(() -> "min_y + height cannot be higher than: " + (ehy.d + 1));
      } else if ($$0.d() % 16 != 0) {
         return DataResult.error(() -> "height has to be a multiple of 16");
      } else {
         return $$0.c() % 16 != 0 ? DataResult.error(() -> "min_y has to be a multiple of 16") : DataResult.success($$0);
      }
   }

   public static eki a(int $$0, int $$1, int $$2, int $$3) {
      eki $$4 = new eki($$0, $$1, $$2, $$3);
      a($$4).error().ifPresent($$0x -> {
         throw new IllegalStateException($$0x.message());
      });
      return $$4;
   }

   public int a() {
      return jw.c(this.f());
   }

   public int b() {
      return jw.c(this.e());
   }

   public eki a(dmw $$0) {
      int $$1 = Math.max(this.g, $$0.L_());
      int $$2 = Math.min(this.g + this.h, $$0.ao() + 1) - $$1;
      return new eki($$1, $$2, this.i, this.j);
   }

   public int c() {
      return this.g;
   }

   public int d() {
      return this.h;
   }

   public int e() {
      return this.i;
   }

   public int f() {
      return this.j;
   }
}
