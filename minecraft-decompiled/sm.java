import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class sm extends tw {
   public static final amd<Consumer<sy>> a = a("always_pass");
   public static final Consumer<sy> b = sy::e;

   private static amd<Consumer<sy>> a(String $$0) {
      return amd.a(mn.aC, ame.b($$0));
   }

   public static Consumer<sy> a(jy<Consumer<sy>> $$0) {
      a(new sm());
      b($$0);
      return b;
   }

   @Override
   public void a(BiConsumer<amd<Consumer<sy>>, Consumer<sy>> $$0) {
      $$0.accept(a, b);
   }
}
