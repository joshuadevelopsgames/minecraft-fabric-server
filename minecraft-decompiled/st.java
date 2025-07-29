import com.google.common.collect.Lists;
import com.google.common.collect.Streams;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class st {
   private static final int b = 50;
   public static final st.a a = ($$0, $$1) -> Stream.of(new sz($$0, dwu.a, $$1, tp.a()));

   public static List<ss> a(Collection<jl.c<ta>> $$0, st.a $$1, aub $$2) {
      Map<jl<tu>, List<sz>> $$3 = $$0.stream().flatMap($$2x -> $$1.decorate($$2x, $$2)).collect(Collectors.groupingBy($$0x -> $$0x.v().d()));
      return $$3.entrySet().stream().flatMap($$0x -> {
         jl<tu> $$1x = (jl<tu>)$$0x.getKey();
         List<sz> $$2x = (List<sz>)$$0x.getValue();
         return Streams.mapWithIndex(Lists.partition($$2x, 50).stream(), ($$1xx, $$2xx) -> a($$1xx, $$1x, (int)$$2xx));
      }).toList();
   }

   public static te.b a() {
      return a(50);
   }

   public static te.b a(int $$0) {
      return $$1 -> {
         Map<jl<tu>, List<sz>> $$2 = $$1.stream().filter(Objects::nonNull).collect(Collectors.groupingBy($$0xx -> $$0xx.v().d()));
         return $$2.entrySet().stream().flatMap($$1x -> {
            jl<tu> $$2x = (jl<tu>)$$1x.getKey();
            List<sz> $$3 = (List<sz>)$$1x.getValue();
            return Streams.mapWithIndex(Lists.partition($$3, $$0).stream(), ($$1xx, $$2xx) -> a(List.copyOf($$1xx), $$2x, (int)$$2xx));
         }).toList();
      };
   }

   public static ss a(Collection<sz> $$0, jl<tu> $$1, int $$2) {
      return new ss($$2, $$0, $$1);
   }

   @FunctionalInterface
   public interface a {
      Stream<sz> decorate(jl.c<ta> var1, aub var2);
   }
}
