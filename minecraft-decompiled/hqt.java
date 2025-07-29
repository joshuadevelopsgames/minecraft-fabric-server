import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;
import org.joml.Vector3f;

public class hqt implements hqq {
   private final haq a;
   private final float b;
   private final jh c;
   private final hua d;

   public hqt(haq $$0, float $$1, jh $$2, hua $$3) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   @Override
   public void a(dct $$0, fod $$1, gxn $$2, int $$3, int $$4, boolean $$5) {
      this.a.a($$1, $$2, $$3, $$4, this.c, this.b, this.d);
   }

   @Override
   public void a(Set<Vector3f> $$0) {
      this.a.a(this.c, this.b, $$0);
   }

   public record a(ame b, float c, jh d) implements hqv.a {
      public static final MapCodec<hqt.a> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
               ame.a.fieldOf("texture").forGetter(hqt.a::b),
               Codec.FLOAT.optionalFieldOf("openness", 0.0F).forGetter(hqt.a::c),
               jh.g.optionalFieldOf("orientation", jh.b).forGetter(hqt.a::d)
            )
            .apply($$0, hqt.a::new)
      );

      public a() {
         this(ame.b("shulker"), 0.0F, jh.b);
      }

      public a(dbt $$0) {
         this(gyi.e($$0), 0.0F, jh.b);
      }

      @Override
      public MapCodec<hqt.a> a() {
         return a;
      }

      @Override
      public hqv<?> a(gqj $$0) {
         return new hqt(new haq($$0), this.c, this.d, gyi.p.a(this.b));
      }
   }
}
