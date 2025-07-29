import java.util.function.UnaryOperator;

public class fwo {
   @Deprecated
   public static ame a(String $$0) {
      return ame.b("block/" + $$0);
   }

   public static ame b(String $$0) {
      return ame.b("item/" + $$0);
   }

   public static ame a(dpz $$0, String $$1) {
      ame $$2 = mm.e.b($$0);
      return $$2.a((UnaryOperator<String>)($$1x -> "block/" + $$1x + $$1));
   }

   public static ame a(dpz $$0) {
      ame $$1 = mm.e.b($$0);
      return $$1.f("block/");
   }

   public static ame a(dcr $$0) {
      ame $$1 = mm.g.b($$0);
      return $$1.f("item/");
   }

   public static ame a(dcr $$0, String $$1) {
      ame $$2 = mm.g.b($$0);
      return $$2.a((UnaryOperator<String>)($$1x -> "item/" + $$1x + $$1));
   }
}
