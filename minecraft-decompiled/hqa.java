import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.PrimitiveCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public record hqa(int c) implements hqg<String> {
   public static final PrimitiveCodec<String> a = Codec.STRING;
   public static final hqg.a<hqa, String> b = hqg.a.a(
      RecordCodecBuilder.mapCodec($$0 -> $$0.group(bbi.o.optionalFieldOf("index", 0).forGetter(hqa::c)).apply($$0, hqa::new)), a
   );

   @Nullable
   public String a(dcv $$0, @Nullable grk $$1, @Nullable cam $$2, int $$3, dct $$4) {
      dfe $$5 = $$0.a(kq.p);
      return $$5 != null ? $$5.c(this.c) : null;
   }

   @Override
   public hqg.a<hqa, String> a() {
      return b;
   }

   @Override
   public Codec<String> b() {
      return a;
   }
}
