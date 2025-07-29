import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record fhc(Optional<Boolean> b, Optional<Boolean> c) implements fgs {
   public static final MapCodec<fhc> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.BOOL.optionalFieldOf("raining").forGetter(fhc::d), Codec.BOOL.optionalFieldOf("thundering").forGetter(fhc::e))
         .apply($$0, fhc::new)
   );

   @Override
   public fgt b() {
      return fgu.o;
   }

   public boolean a(fdj $$0) {
      aub $$1 = $$0.d();
      return this.b.isPresent() && this.b.get() != $$1.ah() ? false : !this.c.isPresent() || this.c.get() == $$1.ag();
   }

   public static fhc.a c() {
      return new fhc.a();
   }

   public Optional<Boolean> d() {
      return this.b;
   }

   public Optional<Boolean> e() {
      return this.c;
   }

   public static class a implements fgs.a {
      private Optional<Boolean> a = Optional.empty();
      private Optional<Boolean> b = Optional.empty();

      public fhc.a a(boolean $$0) {
         this.a = Optional.of($$0);
         return this;
      }

      public fhc.a b(boolean $$0) {
         this.b = Optional.of($$0);
         return this;
      }

      public fhc a() {
         return new fhc(this.a, this.b);
      }
   }
}
