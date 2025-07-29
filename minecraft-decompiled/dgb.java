import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record dgb(float c, Optional<ame> d) {
   public static final Codec<dgb> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(bbi.r.fieldOf("seconds").forGetter(dgb::b), ame.a.optionalFieldOf("cooldown_group").forGetter(dgb::c)).apply($$0, dgb::new)
   );
   public static final zm<wx, dgb> b = zm.a(zk.l, dgb::b, ame.b.a(zk::a), dgb::c, dgb::new);

   public dgb(float $$0) {
      this($$0, Optional.empty());
   }

   public int a() {
      return (int)(this.c * 20.0F);
   }

   public void a(dcv $$0, cam $$1) {
      if ($$1 instanceof cut $$2) {
         $$2.gP().a($$0, this.a());
      }
   }

   public float b() {
      return this.c;
   }

   public Optional<ame> c() {
      return this.d;
   }
}
