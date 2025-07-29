import java.util.function.UnaryOperator;
import javax.annotation.Nullable;

public class gib {
   private static final ame f = ame.b("tooltip/background");
   private static final ame g = ame.b("tooltip/frame");
   public static final int a = 12;
   private static final int h = 3;
   public static final int b = 3;
   public static final int c = 3;
   public static final int d = 3;
   public static final int e = 3;
   private static final int i = 9;

   public static void a(fxb $$0, int $$1, int $$2, int $$3, int $$4, @Nullable ame $$5) {
      int $$6 = $$1 - 3 - 9;
      int $$7 = $$2 - 3 - 9;
      int $$8 = $$3 + 3 + 3 + 18;
      int $$9 = $$4 + 3 + 3 + 18;
      $$0.a(gxx.ar, a($$5), $$6, $$7, $$8, $$9);
      $$0.a(gxx.ar, b($$5), $$6, $$7, $$8, $$9);
   }

   private static ame a(@Nullable ame $$0) {
      return $$0 == null ? f : $$0.a((UnaryOperator<String>)($$0x -> "tooltip/" + $$0x + "_background"));
   }

   private static ame b(@Nullable ame $$0) {
      return $$0 == null ? g : $$0.a((UnaryOperator<String>)($$0x -> "tooltip/" + $$0x + "_frame"));
   }
}
