import com.google.common.collect.HashBasedTable;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Table;
import com.google.common.collect.ImmutableList.Builder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.OptionalInt;
import java.util.Set;

public class ftp extends azc {
   private final Map<diu, dit> b = new HashMap<>();
   private final Set<diu> c = new HashSet<>();
   private Map<dhe, List<gjn>> d = Map.of();
   private List<gjn> e = List.of();

   public void a(dit $$0) {
      this.b.put($$0.a(), $$0);
   }

   public void a(diu $$0) {
      this.b.remove($$0);
      this.c.remove($$0);
   }

   public void b() {
      this.b.clear();
      this.c.clear();
   }

   public boolean b(diu $$0) {
      return this.c.contains($$0);
   }

   public void c(diu $$0) {
      this.c.remove($$0);
   }

   public void d(diu $$0) {
      this.c.add($$0);
   }

   public void c() {
      Map<dhp, List<List<dit>>> $$0 = a(this.b.values());
      Map<dhe, List<gjn>> $$1 = new HashMap<>();
      Builder<gjn> $$2 = ImmutableList.builder();
      $$0.forEach(($$2x, $$3x) -> $$1.put($$2x, (List)$$3x.stream().map(gjn::new).peek($$2::add).collect(ImmutableList.toImmutableList())));

      for (gjp $$3 : gjp.values()) {
         $$1.put($$3, $$3.a().stream().flatMap($$1x -> $$1.getOrDefault($$1x, List.of()).stream()).collect(ImmutableList.toImmutableList()));
      }

      this.d = Map.copyOf($$1);
      this.e = $$2.build();
   }

   private static Map<dhp, List<List<dit>>> a(Iterable<dit> $$0) {
      Map<dhp, List<List<dit>>> $$1 = new HashMap<>();
      Table<dhp, Integer, List<dit>> $$2 = HashBasedTable.create();

      for (dit $$3 : $$0) {
         dhp $$4 = $$3.d();
         OptionalInt $$5 = $$3.c();
         if ($$5.isEmpty()) {
            $$1.computeIfAbsent($$4, $$0x -> new ArrayList<>()).add(List.of($$3));
         } else {
            List<dit> $$6 = (List<dit>)$$2.get($$4, $$5.getAsInt());
            if ($$6 == null) {
               $$6 = new ArrayList<>();
               $$2.put($$4, $$5.getAsInt(), $$6);
               $$1.computeIfAbsent($$4, $$0x -> new ArrayList<>()).add($$6);
            }

            $$6.add($$3);
         }
      }

      return $$1;
   }

   public List<gjn> d() {
      return this.e;
   }

   public List<gjn> a(dhe $$0) {
      return this.d.getOrDefault($$0, Collections.emptyList());
   }
}
