import java.util.List;
import java.util.Map;
import org.joml.Vector3f;

public class hub {
   private static final String b = "missingno";
   public static final ame a = ame.b("builtin/missing");

   public static huo a() {
      gyx.b $$0 = new gyx.b(0.0F, 0.0F, 16.0F, 16.0F);
      Map<jh, gyx> $$1 = ag.a(jh.class, $$1x -> new gyx($$1x, -1, "missingno", $$0, i.a));
      gyw $$2 = new gyw(new Vector3f(0.0F, 0.0F, 0.0F), new Vector3f(16.0F, 16.0F, 16.0F), $$1);
      return new gyz(new gzi(List.of($$2)), null, null, gzg.a, new gzk.a.a().a("particle", "missingno").a("missingno", new hua(hrr.c, hrh.c())).a(), null);
   }
}
