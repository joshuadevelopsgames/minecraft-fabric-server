import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import io.netty.buffer.ByteBuf;
import java.util.function.UnaryOperator;

public record jc(ame d, ame e) {
   public static final Codec<jc> a = ame.a.xmap(jc::new, jc::a);
   public static final MapCodec<jc> b = a.fieldOf("asset_id");
   public static final zm<ByteBuf, jc> c = zm.a(ame.b, jc::a, jc::new);

   public jc(ame $$0) {
      this($$0, $$0.a((UnaryOperator<String>)($$0x -> "textures/" + $$0x + ".png")));
   }

   public ame a() {
      return this.d;
   }

   public ame b() {
      return this.e;
   }
}
