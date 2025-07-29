import com.google.common.collect.Maps;
import java.util.Map;
import org.joml.Matrix4f;
import org.joml.Quaternionf;
import org.joml.Vector3f;

public class ja {
   private static final Map<jh, k> a = Maps.newEnumMap(
      Map.of(
         jh.d,
         k.a(),
         jh.f,
         new k(null, new Quaternionf().rotateY((float) (Math.PI / 2)), null, null),
         jh.e,
         new k(null, new Quaternionf().rotateY((float) (-Math.PI / 2)), null, null),
         jh.c,
         new k(null, new Quaternionf().rotateY((float) Math.PI), null, null),
         jh.b,
         new k(null, new Quaternionf().rotateX((float) (-Math.PI / 2)), null, null),
         jh.a,
         new k(null, new Quaternionf().rotateX((float) (Math.PI / 2)), null, null)
      )
   );
   private static final Map<jh, k> b = Maps.newEnumMap(ag.a(a, k::b));

   public static k a(k $$0) {
      Matrix4f $$1 = new Matrix4f().translation(0.5F, 0.5F, 0.5F);
      $$1.mul($$0.c());
      $$1.translate(-0.5F, -0.5F, -0.5F);
      return new k($$1);
   }

   public static k b(k $$0) {
      Matrix4f $$1 = new Matrix4f().translation(-0.5F, -0.5F, -0.5F);
      $$1.mul($$0.c());
      $$1.translate(0.5F, 0.5F, 0.5F);
      return new k($$1);
   }

   public static k a(k $$0, jh $$1) {
      if (f.a($$0.c())) {
         return $$0;
      } else {
         k $$2 = a.get($$1);
         $$2 = $$0.a($$2);
         Vector3f $$3 = $$2.c().transformDirection(new Vector3f(0.0F, 0.0F, 1.0F));
         jh $$4 = jh.a($$3.x, $$3.y, $$3.z);
         return b.get($$4).a($$2);
      }
   }
}
