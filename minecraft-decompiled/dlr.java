import com.mojang.serialization.Codec;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.Function;
import javax.annotation.Nullable;

public class dlr extends ArrayList<dlq> {
   public static final Codec<dlr> a = dlq.a.listOf().optionalFieldOf("Recipes", List.of()).xmap(dlr::new, Function.identity()).codec();
   public static final zm<wx, dlr> b = dlq.b.a(zk.a(dlr::new));

   public dlr() {
   }

   private dlr(int $$0) {
      super($$0);
   }

   private dlr(Collection<dlq> $$0) {
      super($$0);
   }

   @Nullable
   public dlq a(dcv $$0, dcv $$1, int $$2) {
      if ($$2 > 0 && $$2 < this.size()) {
         dlq $$3 = this.get($$2);
         return $$3.a($$0, $$1) ? $$3 : null;
      } else {
         for (int $$4 = 0; $$4 < this.size(); $$4++) {
            dlq $$5 = this.get($$4);
            if ($$5.a($$0, $$1)) {
               return $$5;
            }
         }

         return null;
      }
   }

   public dlr a() {
      dlr $$0 = new dlr(this.size());

      for (dlq $$1 : this) {
         $$0.add($$1.v());
      }

      return $$0;
   }
}
