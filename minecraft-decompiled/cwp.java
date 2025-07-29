import com.google.common.collect.Maps;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class cwp {
   public static final int a = 2000;
   public static final int b = 7000;
   public static final cwp c = a("empty").a(0, cwn.b).a();
   public static final cwp d = a("simple").a(5000, cwn.c).a(11000, cwn.e).a();
   public static final cwp e = a("villager_baby").a(10, cwn.b).a(3000, cwn.d).a(6000, cwn.b).a(10000, cwn.d).a(12000, cwn.e).a();
   public static final cwp f = a("villager_default").a(10, cwn.b).a(2000, cwn.c).a(9000, cwn.f).a(11000, cwn.b).a(12000, cwn.e).a();
   private final Map<cwn, cwr> g = Maps.newHashMap();

   protected static cwq a(String $$0) {
      cwp $$1 = jy.a(mm.B, $$0, new cwp());
      return new cwq($$1);
   }

   protected void a(cwn $$0) {
      if (!this.g.containsKey($$0)) {
         this.g.put($$0, new cwr());
      }
   }

   protected cwr b(cwn $$0) {
      return this.g.get($$0);
   }

   protected List<cwr> c(cwn $$0) {
      return this.g.entrySet().stream().filter($$1 -> $$1.getKey() != $$0).map(Entry::getValue).collect(Collectors.toList());
   }

   public cwn a(int $$0) {
      return this.g.entrySet().stream().max(Comparator.comparingDouble($$1 -> $$1.getValue().a($$0))).map(Entry::getKey).orElse(cwn.b);
   }
}
