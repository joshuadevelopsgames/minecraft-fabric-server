import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.Optional;

public record ayy(ame e, Optional<Float> f) {
   public static final Codec<ayy> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ame.a.fieldOf("sound_id").forGetter(ayy::a), Codec.FLOAT.lenientOptionalFieldOf("range").forGetter(ayy::b)).apply($$0, ayy::a)
   );
   public static final Codec<jl<ayy>> b = ama.a(mn.as, a);
   public static final zm<ByteBuf, ayy> c = zm.a(ame.b, ayy::a, zk.l.a(zk::a), ayy::b, ayy::a);
   public static final zm<wx, jl<ayy>> d = zk.a(mn.as, c);

   private static ayy a(ame $$0, Optional<Float> $$1) {
      return $$1.<ayy>map($$1x -> a($$0, $$1x.floatValue())).orElseGet(() -> a($$0));
   }

   public static ayy a(ame $$0) {
      return new ayy($$0, Optional.empty());
   }

   public static ayy a(ame $$0, float $$1) {
      return new ayy($$0, Optional.of($$1));
   }

   public float a(float $$0) {
      return this.f.orElse($$0 > 1.0F ? 16.0F * $$0 : 16.0F);
   }

   public ame a() {
      return this.e;
   }

   public Optional<Float> b() {
      return this.f;
   }
}
