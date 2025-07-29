import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.Set;

public record fha(Optional<Long> b, fdi c) implements fgs {
   public static final MapCodec<fha> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.LONG.optionalFieldOf("period").forGetter(fha::c), fdi.a.fieldOf("value").forGetter(fha::d)).apply($$0, fha::new)
   );

   @Override
   public fgt b() {
      return fgu.q;
   }

   @Override
   public Set<bdn<?>> a() {
      return this.c.a();
   }

   public boolean a(fdj $$0) {
      aub $$1 = $$0.d();
      long $$2 = $$1.af();
      if (this.b.isPresent()) {
         $$2 %= this.b.get();
      }

      return this.c.b($$0, (int)$$2);
   }

   public static fha.a a(fdi $$0) {
      return new fha.a($$0);
   }

   public Optional<Long> c() {
      return this.b;
   }

   public fdi d() {
      return this.c;
   }

   public static class a implements fgs.a {
      private Optional<Long> a = Optional.empty();
      private final fdi b;

      public a(fdi $$0) {
         this.b = $$0;
      }

      public fha.a a(long $$0) {
         this.a = Optional.of($$0);
         return this;
      }

      public fha a() {
         return new fha(this.a, this.b);
      }
   }
}
