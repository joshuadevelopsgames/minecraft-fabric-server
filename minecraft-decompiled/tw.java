import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public abstract class tw {
   private static final List<tw> a = new ArrayList<>();

   public static void a(tw $$0) {
      a.add($$0);
   }

   public static void b(jy<Consumer<sy>> $$0) {
      for (tw $$1 : a) {
         $$1.a(($$1x, $$2) -> jy.a($$0, $$1x, $$2));
      }
   }

   public abstract void a(BiConsumer<amd<Consumer<sy>>, Consumer<sy>> var1);
}
