import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class bve {
   public static final bve a = new bve();
   private final WeakHashMap<bvg, Void> b = new WeakHashMap<>();

   private bve() {
   }

   public void a(bvg $$0) {
      this.b.put($$0, null);
   }

   public List<bvd> a() {
      Map<String, List<bvd>> $$0 = this.b.keySet().stream().flatMap($$0x -> $$0x.bw().stream()).collect(Collectors.groupingBy(bvd::d));
      return a($$0);
   }

   private static List<bvd> a(Map<String, List<bvd>> $$0) {
      return $$0.entrySet().stream().map($$0x -> {
         String $$1 = (String)$$0x.getKey();
         List<bvd> $$2 = (List<bvd>)$$0x.getValue();
         return (bvd)($$2.size() > 1 ? new bve.a($$1, $$2) : $$2.get(0));
      }).collect(Collectors.toList());
   }

   static class a extends bvd {
      private final List<bvd> b;

      a(String $$0, List<bvd> $$1) {
         super($$0, $$1.get(0).e(), () -> c($$1), () -> b($$1), a($$1));
         this.b = $$1;
      }

      private static bvd.c a(List<bvd> $$0) {
         return $$1 -> $$0.stream().anyMatch($$1x -> $$1x.a != null ? $$1x.a.test($$1) : false);
      }

      private static void b(List<bvd> $$0) {
         for (bvd $$1 : $$0) {
            $$1.a();
         }
      }

      private static double c(List<bvd> $$0) {
         double $$1 = 0.0;

         for (bvd $$2 : $$0) {
            $$1 += $$2.c().getAsDouble();
         }

         return $$1 / $$0.size();
      }

      @Override
      public boolean equals(@Nullable Object $$0) {
         if (this == $$0) {
            return true;
         } else if ($$0 == null || this.getClass() != $$0.getClass()) {
            return false;
         } else if (!super.equals($$0)) {
            return false;
         } else {
            bve.a $$1 = (bve.a)$$0;
            return this.b.equals($$1.b);
         }
      }

      @Override
      public int hashCode() {
         return Objects.hash(super.hashCode(), this.b);
      }
   }
}
