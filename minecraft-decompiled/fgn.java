import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.stream.Stream;

public record fgn(Map<String, fdi> b, fdj.b c) implements fgs {
   public static final MapCodec<fgn> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.unboundedMap(Codec.STRING, fdi.a).fieldOf("scores").forGetter(fgn::c), fdj.b.e.fieldOf("entity").forGetter(fgn::d))
         .apply($$0, fgn::new)
   );

   @Override
   public fgt b() {
      return fgu.h;
   }

   @Override
   public Set<bdn<?>> a() {
      return Stream.concat(Stream.of(this.c.a()), this.b.values().stream().flatMap($$0 -> $$0.a().stream())).collect(ImmutableSet.toImmutableSet());
   }

   public boolean a(fdj $$0) {
      bzm $$1 = $$0.c(this.c.a());
      if ($$1 == null) {
         return false;
      } else {
         fjx $$2 = $$0.d().g();

         for (Entry<String, fdi> $$3 : this.b.entrySet()) {
            if (!this.a($$0, $$1, $$2, $$3.getKey(), $$3.getValue())) {
               return false;
            }
         }

         return true;
      }
   }

   protected boolean a(fdj $$0, bzm $$1, fjx $$2, String $$3, fdi $$4) {
      fjp $$5 = $$2.a($$3);
      if ($$5 == null) {
         return false;
      } else {
         fjt $$6 = $$2.d($$1, $$5);
         return $$6 == null ? false : $$4.b($$0, $$6.a());
      }
   }

   public static fgn.a a(fdj.b $$0) {
      return new fgn.a($$0);
   }

   public Map<String, fdi> c() {
      return this.b;
   }

   public fdj.b d() {
      return this.c;
   }

   public static class a implements fgs.a {
      private final Builder<String, fdi> a = ImmutableMap.builder();
      private final fdj.b b;

      public a(fdj.b $$0) {
         this.b = $$0;
      }

      public fgn.a a(String $$0, fdi $$1) {
         this.a.put($$0, $$1);
         return this;
      }

      @Override
      public fgs build() {
         return new fgn(this.a.build(), this.b);
      }
   }
}
