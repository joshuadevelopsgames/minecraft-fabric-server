import com.mojang.serialization.MapCodec;
import java.util.Set;
import org.joml.Vector3f;

public class hqy implements hqq {
   private final gpq a;

   public hqy(gpq $$0) {
      this.a = $$0;
   }

   @Override
   public void a(dct $$0, fod $$1, gxn $$2, int $$3, int $$4, boolean $$5) {
      $$1.a();
      $$1.b(1.0F, -1.0F, -1.0F);
      fog $$6 = hfd.a($$2, this.a.a(gpq.a), false, $$5);
      this.a.a($$1, $$6, $$3, $$4);
      $$1.b();
   }

   @Override
   public void a(Set<Vector3f> $$0) {
      fod $$1 = new fod();
      $$1.b(1.0F, -1.0F, -1.0F);
      this.a.e().a($$1, $$0);
   }

   public record a() implements hqv.a {
      public static final MapCodec<hqy.a> a = MapCodec.unit(new hqy.a());

      @Override
      public MapCodec<hqy.a> a() {
         return a;
      }

      @Override
      public hqv<?> a(gqj $$0) {
         return new hqy(new gpq($$0.a(gqm.dJ)));
      }
   }
}
