import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record awp(xo c, int d, Optional<bbt<Integer>> e) {
   public static final Codec<awp> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
            xq.a.fieldOf("description").forGetter(awp::a),
            Codec.INT.fieldOf("pack_format").forGetter(awp::b),
            bbt.a(Codec.INT).lenientOptionalFieldOf("supported_formats").forGetter(awp::c)
         )
         .apply($$0, awp::new)
   );
   public static final awo<awp> b = new awo<>("pack", a);

   public xo a() {
      return this.c;
   }

   public int b() {
      return this.d;
   }

   public Optional<bbt<Integer>> c() {
      return this.e;
   }
}
