import com.mojang.serialization.MapCodec;
import java.util.Objects;
import java.util.Set;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class hqo implements hqv<ech> {
   private final hal a;

   public hqo(hal $$0) {
      this.a = $$0;
   }

   @Nullable
   public ech a(dcv $$0) {
      return $$0.a(kq.ao);
   }

   public void a(@Nullable ech $$0, dct $$1, fod $$2, gxn $$3, int $$4, int $$5, boolean $$6) {
      this.a.a($$2, $$3, $$4, $$5, Objects.requireNonNullElse($$0, ech.a));
   }

   @Override
   public void a(Set<Vector3f> $$0) {
      this.a.a($$0);
   }

   public record a() implements hqv.a {
      public static final MapCodec<hqo.a> a = MapCodec.unit(new hqo.a());

      @Override
      public MapCodec<hqo.a> a() {
         return a;
      }

      @Override
      public hqv<?> a(gqj $$0) {
         return new hqo(new hal($$0));
      }
   }
}
