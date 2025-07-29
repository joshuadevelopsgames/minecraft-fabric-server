import com.mojang.datafixers.util.Either;
import java.util.Comparator;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Consumer;

public class hyd implements fks {
   private final Map<Either<UUID, String>, fkr> a = new ConcurrentHashMap<>();

   public void a(fkr $$0) {
      this.a.put($$0.a(), $$0);
   }

   public void b(fkr $$0) {
      this.a.get($$0.a()).a($$0);
   }

   public void c(fkr $$0) {
      this.a.remove($$0.a());
   }

   public boolean a() {
      return !this.a.isEmpty();
   }

   public void a(bzm $$0, Consumer<fkr> $$1) {
      this.a.values().stream().sorted(Comparator.<fkr>comparingDouble($$1x -> $$1x.a($$0)).reversed()).forEachOrdered($$1);
   }
}
