import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;
import org.joml.Vector3f;

public class hql implements hqq {
   private final gzz a;
   private final hua b;

   public hql(gzz $$0, hua $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   @Override
   public void a(dct $$0, fod $$1, gxn $$2, int $$3, int $$4, boolean $$5) {
      this.a.a($$1, $$2, $$3, $$4, this.b);
   }

   @Override
   public void a(Set<Vector3f> $$0) {
      this.a.a($$0);
   }

   public record a(ame b) implements hqv.a {
      public static final MapCodec<hql.a> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ame.a.fieldOf("texture").forGetter(hql.a::b)).apply($$0, hql.a::new));

      public a(dbt $$0) {
         this(gyi.b($$0));
      }

      @Override
      public MapCodec<hql.a> a() {
         return a;
      }

      @Override
      public hqv<?> a(gqj $$0) {
         return new hql(new gzz($$0), gyi.o.a(this.b));
      }
   }
}
