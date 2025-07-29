import com.mojang.datafixers.util.Either;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.Lifecycle;
import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class dok extends dob {
   private static final MapCodec<jl<dnx>> d = dnx.c.fieldOf("biome");
   public static final MapCodec<dog.c<jl<dnx>>> b = dog.c.a(d).fieldOf("biomes");
   private static final MapCodec<jl<dol>> e = dol.b.fieldOf("preset").withLifecycle(Lifecycle.stable());
   public static final MapCodec<dok> c = Codec.mapEither(b, e).xmap(dok::new, $$0 -> $$0.f);
   private final Either<dog.c<jl<dnx>>, jl<dol>> f;

   private dok(Either<dog.c<jl<dnx>>, jl<dol>> $$0) {
      this.f = $$0;
   }

   public static dok a(dog.c<jl<dnx>> $$0) {
      return new dok(Either.left($$0));
   }

   public static dok a(jl<dol> $$0) {
      return new dok(Either.right($$0));
   }

   private dog.c<jl<dnx>> d() {
      return (dog.c<jl<dnx>>)this.f.map($$0 -> $$0, $$0 -> ((dol)$$0.a()).a());
   }

   @Override
   protected Stream<jl<dnx>> b() {
      return this.d().a().stream().map(Pair::getSecond);
   }

   @Override
   protected MapCodec<? extends dob> a() {
      return c;
   }

   public boolean a(amd<dol> $$0) {
      Optional<jl<dol>> $$1 = this.f.right();
      return $$1.isPresent() && $$1.get().a($$0);
   }

   @Override
   public jl<dnx> getNoiseBiome(int $$0, int $$1, int $$2, dog.f $$3) {
      return this.a($$3.a($$0, $$1, $$2));
   }

   @bdl
   public jl<dnx> a(dog.h $$0) {
      return this.d().a($$0);
   }

   @Override
   public void a(List<String> $$0, jb $$1, dog.f $$2) {
      int $$3 = jw.a($$1.u());
      int $$4 = jw.a($$1.v());
      int $$5 = jw.a($$1.w());
      dog.h $$6 = $$2.a($$3, $$4, $$5);
      float $$7 = dog.a($$6.d());
      float $$8 = dog.a($$6.e());
      float $$9 = dog.a($$6.b());
      float $$10 = dog.a($$6.c());
      float $$11 = dog.a($$6.g());
      double $$12 = ekh.a($$11);
      don $$13 = new don();
      $$0.add("Biome builder PV: " + don.a($$12) + " C: " + $$13.b($$7) + " E: " + $$13.c($$8) + " T: " + $$13.d($$9) + " H: " + $$13.e($$10));
   }
}
