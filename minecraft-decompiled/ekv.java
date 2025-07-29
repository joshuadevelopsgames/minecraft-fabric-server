import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.Lifecycle;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public record ekv(Map<amd<ehz>, ehz> b) {
   public static final MapCodec<ekv> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.unboundedMap(amd.a(mn.bv), ehz.a).fieldOf("dimensions").forGetter(ekv::d)).apply($$0, $$0.stable(ekv::new))
   );
   private static final Set<amd<ehz>> c = ImmutableSet.of(ehz.b, ehz.c, ehz.d);
   private static final int d = c.size();

   public ekv(Map<amd<ehz>, ehz> b) {
      ehz $$1 = b.get(ehz.b);
      if ($$1 == null) {
         throw new IllegalStateException("Overworld settings missing");
      } else {
         this.b = b;
      }
   }

   public ekv(jy<ehz> $$0) {
      this($$0.c().collect(Collectors.toMap(jl.c::h, jl.c::a)));
   }

   public static Stream<amd<ehz>> a(Stream<amd<ehz>> $$0) {
      return Stream.concat(c.stream(), $$0.filter($$0x -> !c.contains($$0x)));
   }

   public ekv a(jn.a $$0, efz $$1) {
      jn<ehy> $$2 = $$0.e(mn.aU);
      Map<amd<ehz>, ehz> $$3 = a($$2, this.b, $$1);
      return new ekv($$3);
   }

   public static Map<amd<ehz>, ehz> a(jn<ehy> $$0, Map<amd<ehz>, ehz> $$1, efz $$2) {
      ehz $$3 = $$1.get(ehz.b);
      jl<ehy> $$4 = (jl<ehy>)($$3 == null ? $$0.b(ehw.a) : $$3.a());
      return a($$1, $$4, $$2);
   }

   public static Map<amd<ehz>, ehz> a(Map<amd<ehz>, ehz> $$0, jl<ehy> $$1, efz $$2) {
      Builder<amd<ehz>, ehz> $$3 = ImmutableMap.builder();
      $$3.putAll($$0);
      $$3.put(ehz.b, new ehz($$1, $$2));
      return $$3.buildKeepingLast();
   }

   public efz a() {
      ehz $$0 = this.b.get(ehz.b);
      if ($$0 == null) {
         throw new IllegalStateException("Overworld settings missing");
      } else {
         return $$0.b();
      }
   }

   public Optional<ehz> a(amd<ehz> $$0) {
      return Optional.ofNullable(this.b.get($$0));
   }

   public ImmutableSet<amd<dmu>> b() {
      return this.d().keySet().stream().map(mn::a).collect(ImmutableSet.toImmutableSet());
   }

   public boolean c() {
      return this.a() instanceof ejr;
   }

   private static fcw.a b(jy<ehz> $$0) {
      return $$0.f(ehz.b).map($$0x -> {
         efz $$1 = $$0x.b();
         if ($$1 instanceof ejr) {
            return fcw.a.c;
         } else {
            return $$1 instanceof ejv ? fcw.a.b : fcw.a.a;
         }
      }).orElse(fcw.a.a);
   }

   static Lifecycle a(amd<ehz> $$0, ehz $$1) {
      return b($$0, $$1) ? Lifecycle.stable() : Lifecycle.experimental();
   }

   private static boolean b(amd<ehz> $$0, ehz $$1) {
      if ($$0 == ehz.b) {
         return a($$1);
      } else if ($$0 == ehz.c) {
         return b($$1);
      } else {
         return $$0 == ehz.d ? c($$1) : false;
      }
   }

   private static boolean a(ehz $$0) {
      jl<ehy> $$1 = $$0.a();
      return !$$1.a(ehw.a) && !$$1.a(ehw.d) ? false : !($$0.b().d() instanceof dok $$2 && !$$2.a(dom.b));
   }

   private static boolean b(ehz $$0) {
      return $$0.a().a(ehw.b) && $$0.b() instanceof ekd $$1 && $$1.a(ekf.f) && $$1.d() instanceof dok $$2 && $$2.a(dom.a);
   }

   private static boolean c(ehz $$0) {
      return $$0.a().a(ehw.c) && $$0.b() instanceof ekd $$1 && $$1.a(ekf.g) && $$1.d() instanceof doo;
   }

   public ekv.b a(jy<ehz> $$0) {
      Stream<amd<ehz>> $$1 = Stream.concat($$0.j().stream(), this.b.keySet().stream()).distinct();

      record a(amd<ehz> a, ehz b) {

         jx c() {
            return new jx(Optional.empty(), ekv.a(this.a, this.b));
         }
      }

      List<a> $$2 = new ArrayList<>();
      a($$1).forEach($$2x -> $$0.f($$2x).or(() -> Optional.ofNullable(this.b.get($$2x))).ifPresent($$2xx -> $$2.add(new a($$2x, $$2xx))));
      Lifecycle $$3 = $$2.size() == d ? Lifecycle.stable() : Lifecycle.experimental();
      kh<ehz> $$4 = new jt<>(mn.bv, $$3);
      $$2.forEach($$1x -> $$4.a($$1x.a, $$1x.b, $$1x.c()));
      jy<ehz> $$5 = $$4.n();
      fcw.a $$6 = b($$5);
      return new ekv.b($$5.n(), $$6);
   }

   public Map<amd<ehz>, ehz> d() {
      return this.b;
   }

   public record b(jy<ehz> a, fcw.a b) {
      public Lifecycle a() {
         return this.a.h();
      }

      public jz.b b() {
         return new jz.c(List.of(this.a)).e();
      }

      public jy<ehz> c() {
         return this.a;
      }

      public fcw.a d() {
         return this.b;
      }
   }
}
