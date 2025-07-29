import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class gqj {
   public static final gqj a = new gqj(Map.of());
   private final Map<gql, gqt> b;

   public gqj(Map<gql, gqt> $$0) {
      this.b = $$0;
   }

   public gqn a(gql $$0) {
      gqt $$1 = this.b.get($$0);
      if ($$1 == null) {
         throw new IllegalArgumentException("No model for layer " + $$0);
      } else {
         return $$1.a();
      }
   }

   public static gqj a() {
      return new gqj(ImmutableMap.copyOf(gqk.a()));
   }
}
