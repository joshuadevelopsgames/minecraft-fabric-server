import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.function.Predicate;

public record bo(kk d, Map<kz.b<?>, kz> e) implements Predicate<kl> {
   public static final bo a = new bo(kk.c, Map.of());
   public static final MapCodec<bo> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(kk.a.optionalFieldOf("components", kk.c).forGetter(bo::b), kz.b.optionalFieldOf("predicates", Map.of()).forGetter(bo::c))
         .apply($$0, bo::new)
   );
   public static final zm<wx, bo> c = zm.a(kk.b, bo::b, kz.d, bo::c, bo::new);

   public boolean a(kl $$0) {
      if (!this.d.a($$0)) {
         return false;
      } else {
         for (kz $$1 : this.e.values()) {
            if (!$$1.a($$0)) {
               return false;
            }
         }

         return true;
      }
   }

   public boolean a() {
      return this.d.b() && this.e.isEmpty();
   }

   public kk b() {
      return this.d;
   }

   public Map<kz.b<?>, kz> c() {
      return this.e;
   }

   public static class a {
      private kk a = kk.c;
      private final Builder<kz.b<?>, kz> b = ImmutableMap.builder();

      private a() {
      }

      public static bo.a a() {
         return new bo.a();
      }

      public <T extends kz> bo.a a(kz.b<T> $$0, T $$1) {
         this.b.put($$0, $$1);
         return this;
      }

      public bo.a a(kk $$0) {
         this.a = $$0;
         return this;
      }

      public bo b() {
         return new bo(this.a, this.b.buildOrThrow());
      }
   }
}
