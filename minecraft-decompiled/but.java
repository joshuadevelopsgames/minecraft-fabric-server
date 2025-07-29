import java.time.Duration;
import java.time.Instant;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import jdk.jfr.consumer.RecordedEvent;

public record but(Instant a, long b, but.b c) {
   public static but a(RecordedEvent $$0) {
      return new but($$0.getStartTime(), $$0.getLong("heapUsed"), $$0.getString("when").equalsIgnoreCase("before gc") ? but.b.a : but.b.b);
   }

   public static but.a a(Duration $$0, List<but> $$1, Duration $$2, int $$3) {
      return new but.a($$0, $$2, $$3, a($$1));
   }

   private static double a(List<but> $$0) {
      long $$1 = 0L;
      Map<but.b, List<but>> $$2 = $$0.stream().collect(Collectors.groupingBy($$0x -> $$0x.c));
      List<but> $$3 = $$2.get(but.b.a);
      List<but> $$4 = $$2.get(but.b.b);

      for (int $$5 = 1; $$5 < $$3.size(); $$5++) {
         but $$6 = $$3.get($$5);
         but $$7 = $$4.get($$5 - 1);
         $$1 += $$6.b - $$7.b;
      }

      Duration $$8 = Duration.between($$0.get(1).a, $$0.get($$0.size() - 1).a);
      return (double)$$1 / $$8.getSeconds();
   }

   public record a(Duration a, Duration b, int c, double d) {
      public float a() {
         return (float)this.b.toMillis() / (float)this.a.toMillis();
      }

      public Duration b() {
         return this.a;
      }

      public Duration c() {
         return this.b;
      }

      public int d() {
         return this.c;
      }

      public double e() {
         return this.d;
      }
   }

   static enum b {
      a,
      b;
   }
}
