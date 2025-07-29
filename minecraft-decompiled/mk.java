import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class mk implements mc {
   private static final Codec<ejf> c = ejf.c
      .validate($$0 -> $$0 instanceof eiz ? DataResult.error(() -> "Entity position sources are not allowed") : DataResult.success($$0));
   public static final MapCodec<mk> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(c.fieldOf("destination").forGetter(mk::b), Codec.INT.fieldOf("arrival_in_ticks").forGetter(mk::c)).apply($$0, mk::new)
   );
   public static final zm<wx, mk> b = zm.a(ejf.d, mk::b, zk.h, mk::c, mk::new);
   private final ejf d;
   private final int e;

   public mk(ejf $$0, int $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   @Override
   public md<mk> a() {
      return me.V;
   }

   public ejf b() {
      return this.d;
   }

   public int c() {
      return this.e;
   }
}
