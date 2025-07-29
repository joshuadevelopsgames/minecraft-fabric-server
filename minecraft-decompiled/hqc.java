import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.PrimitiveCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public record hqc(String c) implements hqg<String> {
   public static final PrimitiveCodec<String> a = Codec.STRING;
   public static final hqg.a<hqc, String> b = hqg.a.a(
      RecordCodecBuilder.mapCodec($$0 -> $$0.group(Codec.STRING.fieldOf("block_state_property").forGetter(hqc::c)).apply($$0, hqc::new)), a
   );

   @Nullable
   public String a(dcv $$0, @Nullable grk $$1, @Nullable cam $$2, int $$3, dct $$4) {
      dev $$5 = $$0.a(kq.aq);
      return $$5 == null ? null : $$5.b().get(this.c);
   }

   @Override
   public hqg.a<hqc, String> a() {
      return b;
   }

   @Override
   public Codec<String> b() {
      return a;
   }
}
