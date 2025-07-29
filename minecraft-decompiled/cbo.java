import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class cbo {
   private final jl<cbn> a;
   private final Map<cbq.a, Map<ame, cbq>> b = Maps.newEnumMap(cbq.a.class);
   private final Map<ame, cbq> c = new Object2ObjectArrayMap();
   private final Map<ame, cbq> d = new Object2ObjectArrayMap();
   private double e;
   private boolean f = true;
   private double g;
   private final Consumer<cbo> h;

   public cbo(jl<cbn> $$0, Consumer<cbo> $$1) {
      this.a = $$0;
      this.h = $$1;
      this.e = $$0.a().a();
   }

   public jl<cbn> a() {
      return this.a;
   }

   public double b() {
      return this.e;
   }

   public void a(double $$0) {
      if ($$0 != this.e) {
         this.e = $$0;
         this.e();
      }
   }

   @VisibleForTesting
   Map<ame, cbq> a(cbq.a $$0) {
      return this.b.computeIfAbsent($$0, $$0x -> new Object2ObjectOpenHashMap());
   }

   public Set<cbq> c() {
      return ImmutableSet.copyOf(this.c.values());
   }

   public Set<cbq> d() {
      return ImmutableSet.copyOf(this.d.values());
   }

   @Nullable
   public cbq a(ame $$0) {
      return this.c.get($$0);
   }

   public boolean b(ame $$0) {
      return this.c.get($$0) != null;
   }

   private void f(cbq $$0) {
      cbq $$1 = this.c.putIfAbsent($$0.a(), $$0);
      if ($$1 != null) {
         throw new IllegalArgumentException("Modifier is already applied on this attribute!");
      } else {
         this.a($$0.c()).put($$0.a(), $$0);
         this.e();
      }
   }

   public void a(cbq $$0) {
      cbq $$1 = this.c.put($$0.a(), $$0);
      if ($$0 != $$1) {
         this.a($$0.c()).put($$0.a(), $$0);
         this.e();
      }
   }

   public void b(cbq $$0) {
      this.f($$0);
   }

   public void c(cbq $$0) {
      this.c($$0.a());
      this.f($$0);
      this.d.put($$0.a(), $$0);
   }

   public void d(cbq $$0) {
      this.f($$0);
      this.d.put($$0.a(), $$0);
   }

   public void a(Collection<cbq> $$0) {
      for (cbq $$1 : $$0) {
         this.d($$1);
      }
   }

   protected void e() {
      this.f = true;
      this.h.accept(this);
   }

   public void e(cbq $$0) {
      this.c($$0.a());
   }

   public boolean c(ame $$0) {
      cbq $$1 = this.c.remove($$0);
      if ($$1 == null) {
         return false;
      } else {
         this.a($$1.c()).remove($$0);
         this.d.remove($$0);
         this.e();
         return true;
      }
   }

   public void f() {
      for (cbq $$0 : this.c()) {
         this.e($$0);
      }
   }

   public double g() {
      if (this.f) {
         this.g = this.i();
         this.f = false;
      }

      return this.g;
   }

   private double i() {
      double $$0 = this.b();

      for (cbq $$1 : this.b(cbq.a.a)) {
         $$0 += $$1.b();
      }

      double $$2 = $$0;

      for (cbq $$3 : this.b(cbq.a.b)) {
         $$2 += $$0 * $$3.b();
      }

      for (cbq $$4 : this.b(cbq.a.c)) {
         $$2 *= 1.0 + $$4.b();
      }

      return this.a.a().a($$2);
   }

   private Collection<cbq> b(cbq.a $$0) {
      return this.b.getOrDefault($$0, Map.of()).values();
   }

   public void a(cbo $$0) {
      this.e = $$0.e;
      this.c.clear();
      this.c.putAll($$0.c);
      this.d.clear();
      this.d.putAll($$0.d);
      this.b.clear();
      $$0.b.forEach(($$0x, $$1) -> this.a($$0x).putAll((Map<? extends ame, ? extends cbq>)$$1));
      this.e();
   }

   public cbo.a h() {
      return new cbo.a(this.a, this.e, List.copyOf(this.d.values()));
   }

   public void a(cbo.a $$0) {
      this.e = $$0.d;

      for (cbq $$1 : $$0.e) {
         this.c.put($$1.a(), $$1);
         this.a($$1.c()).put($$1.a(), $$1);
         this.d.put($$1.a(), $$1);
      }

      this.e();
   }

   public record a(jl<cbn> c, double d, List<cbq> e) {
      public static final Codec<cbo.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
               mm.s.r().fieldOf("id").forGetter(cbo.a::a),
               Codec.DOUBLE.fieldOf("base").orElse(0.0).forGetter(cbo.a::b),
               cbq.b.listOf().optionalFieldOf("modifiers", List.of()).forGetter(cbo.a::c)
            )
            .apply($$0, cbo.a::new)
      );
      public static final Codec<List<cbo.a>> b = a.listOf();

      public jl<cbn> a() {
         return this.c;
      }

      public double b() {
         return this.d;
      }

      public List<cbq> c() {
         return this.e;
      }
   }
}
