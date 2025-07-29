import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public class fec extends feb {
   public static final MapCodec<fec> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.either(fdo.a, fdo.d).fieldOf("value").forGetter($$0x -> $$0x.k)).and(b($$0)).apply($$0, fec::new)
   );
   public static final bci.f j = new bci.f() {
      @Override
      public String get() {
         return "->{inline}";
      }
   };
   private final Either<amd<fdo>, fdo> k;

   private fec(Either<amd<fdo>, fdo> $$0, int $$1, int $$2, List<fgs> $$3, List<fex> $$4) {
      super($$1, $$2, $$3, $$4);
      this.k = $$0;
   }

   @Override
   public fea a() {
      return fdx.d;
   }

   @Override
   public void a(Consumer<dcv> $$0, fdj $$1) {
      ((fdo)this.k.map($$1x -> $$1.a().c($$1x).map(jl::a).orElse(fdo.f), $$0x -> $$0x)).a($$1, $$0);
   }

   @Override
   public void a(fdp $$0) {
      Optional<amd<fdo>> $$1 = this.k.left();
      if ($$1.isPresent()) {
         amd<fdo> $$2 = $$1.get();
         if (!$$0.b()) {
            $$0.a(new fdp.d($$2));
            return;
         }

         if ($$0.a($$2)) {
            $$0.a(new fdp.c($$2));
            return;
         }
      }

      super.a($$0);
      this.k
         .ifLeft($$1x -> $$0.a().c($$1x).ifPresentOrElse($$2x -> ((fdo)$$2x.a()).a($$0.a(new bci.b($$1x), $$1x)), () -> $$0.a(new fdp.a($$1x))))
         .ifRight($$1x -> $$1x.a($$0.a(j)));
   }

   public static feb.a<?> a(amd<fdo> $$0) {
      return a(($$1, $$2, $$3, $$4) -> new fec(Either.left($$0), $$1, $$2, $$3, $$4));
   }

   public static feb.a<?> a(fdo $$0) {
      return a(($$1, $$2, $$3, $$4) -> new fec(Either.right($$0), $$1, $$2, $$3, $$4));
   }
}
