import java.util.Map;

public class gyr {
   private Map<eeb, gzc> a = Map.of();
   private final huh b;

   public gyr(huh $$0) {
      this.b = $$0;
   }

   public hrs a(eeb $$0) {
      return this.b($$0).a();
   }

   public gzc b(eeb $$0) {
      gzc $$1 = this.a.get($$0);
      if ($$1 == null) {
         $$1 = this.b.a();
      }

      return $$1;
   }

   public huh a() {
      return this.b;
   }

   public void a(Map<eeb, gzc> $$0) {
      this.a = $$0;
   }
}
