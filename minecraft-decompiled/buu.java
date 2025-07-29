import com.mojang.datafixers.util.Pair;
import java.time.Duration;
import java.util.Comparator;
import java.util.List;

public final class buu<T> {
   private final buu.a a;
   private final List<Pair<T, buu.a>> b;
   private final Duration c;

   public buu(Duration $$0, List<Pair<T, buu.a>> $$1) {
      this.c = $$0;
      this.a = $$1.stream().<buu.a>map(Pair::getSecond).reduce(new buu.a(0L, 0L), buu.a::a);
      this.b = $$1.stream().sorted(Comparator.comparing(Pair::getSecond, buu.a.c)).limit(10L).toList();
   }

   public double a() {
      return (double)this.a.a / this.c.getSeconds();
   }

   public double b() {
      return (double)this.a.b / this.c.getSeconds();
   }

   public long c() {
      return this.a.a;
   }

   public long d() {
      return this.a.b;
   }

   public List<Pair<T, buu.a>> e() {
      return this.b;
   }

   public record a(long a, long b) {
      static final Comparator<buu.a> c = Comparator.comparing(buu.a::c).thenComparing(buu.a::b).reversed();

      buu.a a(buu.a $$0) {
         return new buu.a(this.a + $$0.a, this.b + $$0.b);
      }

      public float a() {
         return (float)this.b / (float)this.a;
      }

      public long b() {
         return this.a;
      }

      public long c() {
         return this.b;
      }
   }
}
