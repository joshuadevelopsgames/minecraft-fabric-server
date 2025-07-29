import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import it.unimi.dsi.fastutil.objects.Reference2ObjectOpenHashMap;
import java.util.Collections;
import java.util.Map;
import java.util.function.Consumer;
import javax.annotation.Nullable;

class fjr {
   private final Reference2ObjectOpenHashMap<fjp, fju> a = new Reference2ObjectOpenHashMap(16, 0.5F);

   @Nullable
   public fju a(fjp $$0) {
      return (fju)this.a.get($$0);
   }

   public fju a(fjp $$0, Consumer<fju> $$1) {
      return (fju)this.a.computeIfAbsent($$0, $$1x -> {
         fju $$2 = new fju();
         $$1.accept($$2);
         return $$2;
      });
   }

   public boolean b(fjp $$0) {
      return this.a.remove($$0) != null;
   }

   public boolean a() {
      return !this.a.isEmpty();
   }

   public Object2IntMap<fjp> b() {
      Object2IntMap<fjp> $$0 = new Object2IntOpenHashMap();
      this.a.forEach(($$1, $$2) -> $$0.put($$1, $$2.a()));
      return $$0;
   }

   void a(fjp $$0, fju $$1) {
      this.a.put($$0, $$1);
   }

   Map<fjp, fju> c() {
      return Collections.unmodifiableMap(this.a);
   }
}
