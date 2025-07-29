import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record mg(float c) implements mc {
   public static final MapCodec<mg> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(Codec.FLOAT.fieldOf("roll").forGetter($$0x -> $$0x.c)).apply($$0, mg::new));
   public static final zm<wx, mg> b = zm.a(zk.l, $$0 -> $$0.c, mg::new);

   @Override
   public md<mg> a() {
      return me.L;
   }

   public float b() {
      return this.c;
   }
}
