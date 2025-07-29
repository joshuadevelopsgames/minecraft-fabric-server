import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class mh implements mc {
   public static final MapCodec<mh> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(Codec.INT.fieldOf("delay").forGetter($$0x -> $$0x.c)).apply($$0, mh::new));
   public static final zm<wx, mh> b = zm.a(zk.h, $$0 -> $$0.c, mh::new);
   private final int c;

   public mh(int $$0) {
      this.c = $$0;
   }

   @Override
   public md<mh> a() {
      return me.aY;
   }

   public int b() {
      return this.c;
   }
}
