import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.Set;
import org.joml.Vector3f;

public class hqx implements hqq {
   private final gof a;
   private final hua b;

   public hqx(gof $$0, hua $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   @Override
   public void a(dct $$0, fod $$1, gxn $$2, int $$3, int $$4, boolean $$5) {
      har.a($$1, $$2, $$3, $$4, this.a, this.b);
   }

   @Override
   public void a(Set<Vector3f> $$0) {
      fod $$1 = new fod();
      har.a($$1);
      this.a.e().a($$1, $$0);
   }

   public record a(efp b, Optional<ame> c) implements hqv.a {
      public static final MapCodec<hqx.a> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(efp.a.fieldOf("wood_type").forGetter(hqx.a::b), ame.a.optionalFieldOf("texture").forGetter(hqx.a::c)).apply($$0, hqx.a::new)
      );

      public a(efp $$0) {
         this($$0, Optional.empty());
      }

      @Override
      public MapCodec<hqx.a> a() {
         return a;
      }

      @Override
      public hqv<?> a(gqj $$0) {
         gof $$1 = har.a($$0, this.b, true);
         hua $$2 = this.c.<hua>map(gyi.q::a).orElseGet(() -> gyi.a(this.b));
         return new hqx($$1, $$2);
      }
   }
}
