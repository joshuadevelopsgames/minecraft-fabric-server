import com.mojang.serialization.MapCodec;
import java.util.Set;
import org.joml.Vector3f;

public class hqn implements hqq {
   private final gqn a;

   public hqn(gqn $$0) {
      this.a = $$0;
   }

   @Override
   public void a(dct $$0, fod $$1, gxn $$2, int $$3, int $$4, boolean $$5) {
      fog $$6 = hak.b.a($$2, gxz::d);
      $$1.a();
      $$1.a(0.5F, 0.5F, 0.5F);
      this.a.a($$1, $$6, $$3, $$4);
      $$1.b();
   }

   @Override
   public void a(Set<Vector3f> $$0) {
      fod $$1 = new fod();
      $$1.a(0.5F, 0.5F, 0.5F);
      this.a.a($$1, $$0);
   }

   public record a() implements hqv.a {
      public static final MapCodec<hqn.a> a = MapCodec.unit(new hqn.a());

      @Override
      public MapCodec<hqn.a> a() {
         return a;
      }

      @Override
      public hqv<?> a(gqj $$0) {
         return new hqn($$0.a(gqm.al));
      }
   }
}
