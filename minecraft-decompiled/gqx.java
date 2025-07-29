import com.google.common.collect.Maps;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;

public class gqx {
   private final List<gqq> a;
   private final gqp b;
   private final Map<String, gqx> c = Maps.newHashMap();

   gqx(List<gqq> $$0, gqp $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public gqx a(String $$0, gqs $$1, gqp $$2) {
      gqx $$3 = new gqx($$1.b(), $$2);
      return this.a($$0, $$3);
   }

   public gqx a(String $$0, gqx $$1) {
      gqx $$2 = this.c.put($$0, $$1);
      if ($$2 != null) {
         $$1.c.putAll($$2.c);
      }

      return $$1;
   }

   public gqx a(String $$0) {
      gqx $$1 = this.c.get($$0);
      if ($$1 == null) {
         throw new IllegalArgumentException("No child with name: " + $$0);
      } else {
         return this.a($$0, gqs.c(), $$1.b);
      }
   }

   public gqn a(int $$0, int $$1) {
      Object2ObjectArrayMap<String, gqn> $$2 = this.c
         .entrySet()
         .stream()
         .collect(Collectors.toMap(Entry::getKey, $$2x -> ((gqx)$$2x.getValue()).a($$0, $$1), ($$0x, $$1x) -> $$0x, Object2ObjectArrayMap::new));
      List<gqn.a> $$3 = this.a.stream().map($$2x -> $$2x.a($$0, $$1)).toList();
      gqn $$4 = new gqn($$3, $$2);
      $$4.a(this.b);
      $$4.b(this.b);
      return $$4;
   }

   public gqx b(String $$0) {
      return this.c.get($$0);
   }

   public Set<Entry<String, gqx>> a() {
      return this.c.entrySet();
   }

   public gqx a(UnaryOperator<gqp> $$0) {
      gqx $$1 = new gqx(this.a, $$0.apply(this.b));
      $$1.c.putAll(this.c);
      return $$1;
   }
}
