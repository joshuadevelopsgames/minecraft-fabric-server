import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;

public record wi(Map<kp<?>, Integer> b, Set<kp<?>> c) {
   public static final zm<wx, wi> a = zm.a(zk.a(HashMap::new, zk.a(mn.r), zk.g, 256), wi::a, zk.a(HashSet::new, zk.a(mn.r), 256), wi::b, wi::new);

   public static wi a(ko $$0, wi.a $$1) {
      ko.d $$2 = $$0.e();
      Map<kp<?>, Integer> $$3 = new IdentityHashMap<>($$2.a().d());
      $$2.a().forEach($$2x -> $$3.put($$2x.a(), $$1.apply($$2x)));
      return new wi($$3, $$2.b());
   }

   public boolean b(ko $$0, wi.a $$1) {
      ko.d $$2 = $$0.e();
      if (!$$2.b().equals(this.c)) {
         return false;
      } else if (this.b.size() != $$2.a().d()) {
         return false;
      } else {
         for (ks<?> $$3 : $$2.a()) {
            Integer $$4 = this.b.get($$3.a());
            if ($$4 == null) {
               return false;
            }

            Integer $$5 = $$1.apply($$3);
            if (!$$5.equals($$4)) {
               return false;
            }
         }

         return true;
      }
   }

   public Map<kp<?>, Integer> a() {
      return this.b;
   }

   public Set<kp<?>> b() {
      return this.c;
   }

   @FunctionalInterface
   public interface a extends Function<ks<?>, Integer> {
   }
}
