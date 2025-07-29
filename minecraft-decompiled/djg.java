import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;

public record djg(int c) {
   public static final Codec<djg> a = RecordCodecBuilder.create($$0 -> $$0.group(bbi.p.fieldOf("value").forGetter(djg::a)).apply($$0, djg::new));
   public static final zm<ByteBuf, djg> b = zm.a(zk.h, djg::a, djg::new);

   public djg(int c) {
      if (c <= 0) {
         throw new IllegalArgumentException("Enchantment value must be positive, but was " + c);
      } else {
         this.c = c;
      }
   }

   public int a() {
      return this.c;
   }
}
