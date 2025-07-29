import java.util.List;
import java.util.Map;

public class alx {
   private final String a;
   private final String b;

   public alx(String $$0, String $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public static alx a(String $$0) {
      return new alx($$0, ".json");
   }

   public static alx a(amd<? extends jy<?>> $$0) {
      return a(mn.c($$0));
   }

   public ame a(ame $$0) {
      return $$0.e(this.a + "/" + $$0.a() + this.b);
   }

   public ame b(ame $$0) {
      String $$1 = $$0.a();
      return $$0.e($$1.substring(this.a.length() + 1, $$1.length() - this.b.length()));
   }

   public Map<ame, axm> a(axo $$0) {
      return $$0.b(this.a, $$0x -> $$0x.a().endsWith(this.b));
   }

   public Map<ame, List<axm>> b(axo $$0) {
      return $$0.c(this.a, $$0x -> $$0x.a().endsWith(this.b));
   }
}
