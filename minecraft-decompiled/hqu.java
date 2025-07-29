import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.Set;
import java.util.function.UnaryOperator;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class hqu implements hqq {
   private final gph a;
   private final float b;
   private final gxz c;

   public hqu(gph $$0, float $$1, gxz $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   public void a(dct $$0, fod $$1, gxn $$2, int $$3, int $$4, boolean $$5) {
      has.a(null, 180.0F, this.b, $$1, $$2, $$3, this.a, this.c);
   }

   @Override
   public void a(Set<Vector3f> $$0) {
      fod $$1 = new fod();
      $$1.a(0.5F, 0.0F, 0.5F);
      $$1.b(-1.0F, -1.0F, 1.0F);
      this.a.a(this.b, 180.0F, 0.0F);
      this.a.e().a($$1, $$0);
   }

   public record a(dxm.a b, Optional<ame> c, float d) implements hqv.a {
      public static final MapCodec<hqu.a> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
               dxm.a.b.fieldOf("kind").forGetter(hqu.a::b),
               ame.a.optionalFieldOf("texture").forGetter(hqu.a::c),
               Codec.FLOAT.optionalFieldOf("animation", 0.0F).forGetter(hqu.a::d)
            )
            .apply($$0, hqu.a::new)
      );

      public a(dxm.a $$0) {
         this($$0, Optional.empty(), 0.0F);
      }

      @Override
      public MapCodec<hqu.a> a() {
         return a;
      }

      @Nullable
      @Override
      public hqv<?> a(gqj $$0) {
         gph $$1 = has.a($$0, this.b);
         ame $$2 = this.c.<ame>map($$0x -> $$0x.a((UnaryOperator<String>)($$0xx -> "textures/entity/" + $$0xx + ".png"))).orElse(null);
         if ($$1 == null) {
            return null;
         } else {
            gxz $$3 = has.a(this.b, $$2);
            return new hqu($$1, this.d, $$3);
         }
      }
   }
}
