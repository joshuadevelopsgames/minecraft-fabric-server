import com.google.common.collect.Maps;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public record fus(float a, boolean b, Map<String, List<fur>> c) {
   public fuu a(gqn $$0) {
      return fuu.a($$0, this);
   }

   public static class a {
      private final float a;
      private final Map<String, List<fur>> b = Maps.newHashMap();
      private boolean c;

      public static fus.a a(float $$0) {
         return new fus.a($$0);
      }

      private a(float $$0) {
         this.a = $$0;
      }

      public fus.a a() {
         this.c = true;
         return this;
      }

      public fus.a a(String $$0, fur $$1) {
         this.b.computeIfAbsent($$0, $$0x -> new ArrayList<>()).add($$1);
         return this;
      }

      public fus b() {
         return new fus(this.a, this.c, this.b);
      }
   }
}
