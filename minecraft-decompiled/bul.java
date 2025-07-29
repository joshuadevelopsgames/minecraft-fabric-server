import com.mojang.datafixers.util.Pair;
import java.time.Duration;
import java.time.Instant;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public record bul(
   Instant a,
   Instant b,
   Duration c,
   @Nullable Duration d,
   List<buy> e,
   List<bur> f,
   but.a g,
   bux.a h,
   buu<buv> i,
   buu<buv> j,
   buu<buq> k,
   buu<buq> l,
   bus.a m,
   bus.a n,
   List<bup> o,
   List<buw> p
) {
   public List<Pair<egz, bva<bup>>> a() {
      Map<egz, List<bup>> $$0 = this.o.stream().collect(Collectors.groupingBy(bup::d));
      return $$0.entrySet()
         .stream()
         .map($$0x -> Pair.of((egz)$$0x.getKey(), bva.a((List)$$0x.getValue())))
         .sorted(Comparator.<Pair<egz, bva<bup>>, Duration>comparing($$0x -> ((bva)$$0x.getSecond()).f()).reversed())
         .toList();
   }

   public String b() {
      return new bun().a(this);
   }

   public Instant c() {
      return this.a;
   }

   public Instant d() {
      return this.b;
   }

   public Duration e() {
      return this.c;
   }

   @Nullable
   public Duration f() {
      return this.d;
   }

   public List<buy> g() {
      return this.e;
   }

   public List<bur> h() {
      return this.f;
   }

   public but.a i() {
      return this.g;
   }

   public bux.a j() {
      return this.h;
   }

   public buu<buv> k() {
      return this.i;
   }

   public buu<buv> l() {
      return this.j;
   }

   public buu<buq> m() {
      return this.k;
   }

   public buu<buq> n() {
      return this.l;
   }

   public bus.a o() {
      return this.m;
   }

   public bus.a p() {
      return this.n;
   }

   public List<bup> q() {
      return this.o;
   }

   public List<buw> r() {
      return this.p;
   }
}
