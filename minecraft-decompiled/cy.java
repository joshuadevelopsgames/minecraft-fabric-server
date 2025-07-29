import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.Optional;
import java.util.Map.Entry;
import javax.annotation.Nullable;

public record cy(Map<jl<byo>, cy.b> b) {
   public static final Codec<cy> a = Codec.unboundedMap(byo.a, cy.b.a).xmap(cy::new, cy::a);

   public boolean a(bzm $$0) {
      return $$0 instanceof cam $$1 && this.a($$1.eJ());
   }

   public boolean a(cam $$0) {
      return this.a($$0.eJ());
   }

   public boolean a(Map<jl<byo>, byq> $$0) {
      for (Entry<jl<byo>, cy.b> $$1 : this.b.entrySet()) {
         byq $$2 = $$0.get($$1.getKey());
         if (!$$1.getValue().a($$2)) {
            return false;
         }
      }

      return true;
   }

   public Map<jl<byo>, cy.b> a() {
      return this.b;
   }

   public static class a {
      private final Builder<jl<byo>, cy.b> a = ImmutableMap.builder();

      public static cy.a a() {
         return new cy.a();
      }

      public cy.a a(jl<byo> $$0) {
         this.a.put($$0, new cy.b());
         return this;
      }

      public cy.a a(jl<byo> $$0, cy.b $$1) {
         this.a.put($$0, $$1);
         return this;
      }

      public Optional<cy> b() {
         return Optional.of(new cy(this.a.build()));
      }
   }

   public record b(cx.d b, cx.d c, Optional<Boolean> d, Optional<Boolean> e) {
      public static final Codec<cy.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
               cx.d.d.optionalFieldOf("amplifier", cx.d.c).forGetter(cy.b::a),
               cx.d.d.optionalFieldOf("duration", cx.d.c).forGetter(cy.b::b),
               Codec.BOOL.optionalFieldOf("ambient").forGetter(cy.b::c),
               Codec.BOOL.optionalFieldOf("visible").forGetter(cy.b::d)
            )
            .apply($$0, cy.b::new)
      );

      public b() {
         this(cx.d.c, cx.d.c, Optional.empty(), Optional.empty());
      }

      public boolean a(@Nullable byq $$0) {
         if ($$0 == null) {
            return false;
         } else if (!this.b.d($$0.e())) {
            return false;
         } else if (!this.c.d($$0.d())) {
            return false;
         } else {
            return this.d.isPresent() && this.d.get() != $$0.f() ? false : !this.e.isPresent() || this.e.get() == $$0.g();
         }
      }

      public cx.d a() {
         return this.b;
      }

      public cx.d b() {
         return this.c;
      }

      public Optional<Boolean> c() {
         return this.d;
      }

      public Optional<Boolean> d() {
         return this.e;
      }
   }
}
