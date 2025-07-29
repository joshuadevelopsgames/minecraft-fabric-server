import it.unimi.dsi.fastutil.Hash.Strategy;
import it.unimi.dsi.fastutil.objects.ObjectLinkedOpenCustomHashSet;
import java.util.Set;
import javax.annotation.Nullable;

public class dcw {
   private static final Strategy<? super dcv> a = new Strategy<dcv>() {
      public int a(@Nullable dcv $$0) {
         return dcv.b($$0);
      }

      public boolean a(@Nullable dcv $$0, @Nullable dcv $$1) {
         return $$0 == $$1 || $$0 != null && $$1 != null && $$0.f() == $$1.f() && dcv.c($$0, $$1);
      }
   };

   public static Set<dcv> a() {
      return new ObjectLinkedOpenCustomHashSet(a);
   }
}
