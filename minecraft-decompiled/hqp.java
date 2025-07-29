import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.Set;
import org.joml.Vector3f;

public class hqp implements hqq {
   private final gof a;
   private final hua b;

   public hqp(gof $$0, hua $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   @Override
   public void a(dct $$0, fod $$1, gxn $$2, int $$3, int $$4, boolean $$5) {
      han.a($$1, $$2, $$3, $$4, this.a, this.b);
   }

   @Override
   public void a(Set<Vector3f> $$0) {
      fod $$1 = new fod();
      han.a($$1, 0.0F);
      $$1.b(1.0F, -1.0F, -1.0F);
      this.a.e().a($$1, $$0);
   }

   public record a(efp b, Optional<ame> c) implements hqv.a {
      public static final MapCodec<hqp.a> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(efp.a.fieldOf("wood_type").forGetter(hqp.a::b), ame.a.optionalFieldOf("texture").forGetter(hqp.a::c)).apply($$0, hqp.a::new)
      );

      public a(efp $$0) {
         this($$0, Optional.empty());
      }

      @Override
      public MapCodec<hqp.a> a() {
         return a;
      }

      @Override
      public hqv<?> a(gqj $$0) {
         gof $$1 = han.a($$0, this.b, han.a.c);
         hua $$2 = this.c.<hua>map(gyi.r::a).orElseGet(() -> gyi.b(this.b));
         return new hqp($$1, $$2);
      }
   }
}
