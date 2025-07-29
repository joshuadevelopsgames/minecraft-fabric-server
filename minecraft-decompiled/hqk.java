import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Objects;
import java.util.Set;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class hqk implements hqv<eap> {
   private final gzx a;
   private final dbt b;

   public hqk(dbt $$0, gzx $$1) {
      this.a = $$1;
      this.b = $$0;
   }

   @Nullable
   public eap a(dcv $$0) {
      return $$0.a(kq.am);
   }

   public void a(@Nullable eap $$0, dct $$1, fod $$2, gxn $$3, int $$4, int $$5, boolean $$6) {
      this.a.a($$2, $$3, $$4, $$5, this.b, Objects.requireNonNullElse($$0, eap.a));
   }

   @Override
   public void a(Set<Vector3f> $$0) {
      this.a.a($$0);
   }

   public record a(dbt b) implements hqv.a {
      public static final MapCodec<hqk.a> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dbt.q.fieldOf("color").forGetter(hqk.a::b)).apply($$0, hqk.a::new));

      @Override
      public MapCodec<hqk.a> a() {
         return a;
      }

      @Override
      public hqv<?> a(gqj $$0) {
         return new hqk(this.b, new gzx($$0));
      }
   }
}
