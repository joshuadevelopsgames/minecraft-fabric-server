import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record djr<T>(djm a, djm b, T c, Optional<fgs> d) {
   public static <S> Codec<djr<S>> a(Codec<S> $$0, bdo $$1) {
      return RecordCodecBuilder.create(
         $$2 -> $$2.group(
               djm.d.fieldOf("enchanted").forGetter(djr::a),
               djm.d.fieldOf("affected").forGetter(djr::b),
               $$0.fieldOf("effect").forGetter(djr::c),
               djf.a($$1).optionalFieldOf("requirements").forGetter(djr::d)
            )
            .apply($$2, djr::new)
      );
   }

   public static <S> Codec<djr<S>> b(Codec<S> $$0, bdo $$1) {
      return RecordCodecBuilder.create(
         $$2 -> $$2.group(
               djm.d
                  .validate($$0xx -> $$0xx != djm.b ? DataResult.success($$0xx) : DataResult.error(() -> "enchanted must be attacker or victim"))
                  .fieldOf("enchanted")
                  .forGetter(djr::a),
               $$0.fieldOf("effect").forGetter(djr::c),
               djf.a($$1).optionalFieldOf("requirements").forGetter(djr::d)
            )
            .apply($$2, ($$0xx, $$1xx, $$2x) -> new djr<>($$0xx, djm.c, $$1xx, $$2x))
      );
   }

   public boolean a(fdj $$0) {
      return this.d.isEmpty() ? true : this.d.get().test($$0);
   }
}
