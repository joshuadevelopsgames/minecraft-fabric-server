import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dff(bae<byd> c) {
   public static final Codec<dff> a = RecordCodecBuilder.create($$0 -> $$0.group(bae.b(mn.aR).fieldOf("types").forGetter(dff::a)).apply($$0, dff::new));
   public static final zm<wx, dff> b = zm.a(bae.c(mn.aR), dff::a, dff::new);

   public boolean a(byb $$0) {
      return $$0.a(this.c);
   }

   public bae<byd> a() {
      return this.c;
   }
}
