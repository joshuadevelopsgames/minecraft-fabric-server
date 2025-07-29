import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record djq(jp<dcr> c) {
   public static final Codec<djq> a = RecordCodecBuilder.create($$0 -> $$0.group(ka.a(mn.N).fieldOf("items").forGetter(djq::a)).apply($$0, djq::new));
   public static final zm<wx, djq> b = zm.a(zk.c(mn.N), djq::a, djq::new);

   public boolean a(dcv $$0) {
      return $$0.a(this.c);
   }

   public jp<dcr> a() {
      return this.c;
   }
}
