import it.unimi.dsi.fastutil.objects.Object2BooleanMap;
import it.unimi.dsi.fastutil.objects.Object2BooleanOpenHashMap;
import java.util.Set;

public final class atu {
   private final Object2BooleanMap<auc> a = new Object2BooleanOpenHashMap();

   public Set<auc> a() {
      return this.a.keySet();
   }

   public void a(auc $$0, boolean $$1) {
      this.a.put($$0, $$1);
   }

   public void a(auc $$0) {
      this.a.removeBoolean($$0);
   }

   public void b(auc $$0) {
      this.a.replace($$0, true);
   }

   public void c(auc $$0) {
      this.a.replace($$0, false);
   }

   public boolean d(auc $$0) {
      return this.a.getOrDefault($$0, true);
   }

   public boolean e(auc $$0) {
      return this.a.getBoolean($$0);
   }
}
