import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;

public interface dad {
   void a(@Nullable dhr<?> var1);

   @Nullable
   dhr<?> d();

   default void a(cut $$0, List<dcv> $$1) {
      dhr<?> $$2 = this.d();
      if ($$2 != null) {
         $$0.a($$2, $$1);
         if (!$$2.b().ap_()) {
            $$0.a(Collections.singleton($$2));
            this.a(null);
         }
      }
   }

   default boolean a(auc $$0, dhr<?> $$1) {
      if (!$$1.b().ap_() && $$0.y().P().c(dmq.y) && !$$0.J().b($$1.a())) {
         return false;
      } else {
         this.a($$1);
         return true;
      }
   }
}
