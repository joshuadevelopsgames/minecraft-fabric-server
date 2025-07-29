import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record djf<T>(T a, Optional<fgs> b) {
   public static Codec<fgs> a(bdo $$0) {
      return fgs.e.validate($$1 -> {
         bci.a $$2 = new bci.a();
         fdp $$3 = new fdp($$2, $$0);
         $$1.a($$3);
         return !$$2.a() ? DataResult.error(() -> "Validation error in enchantment effect condition: " + $$2.b()) : DataResult.success($$1);
      });
   }

   public static <T> Codec<djf<T>> a(Codec<T> $$0, bdo $$1) {
      return RecordCodecBuilder.create(
         $$2 -> $$2.group($$0.fieldOf("effect").forGetter(djf::a), a($$1).optionalFieldOf("requirements").forGetter(djf::b)).apply($$2, djf::new)
      );
   }

   public boolean a(fdj $$0) {
      return this.b.isEmpty() ? true : this.b.get().test($$0);
   }
}
