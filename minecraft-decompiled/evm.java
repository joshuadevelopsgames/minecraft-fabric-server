import java.util.Optional;
import java.util.function.Predicate;

@FunctionalInterface
public interface evm<C extends epm> {
   Optional<evl<C>> createGenerator(evm.a<C> var1);

   static <C extends epm> evm<C> simple(Predicate<evm.a<C>> $$0, evl<C> $$1) {
      Optional<evl<C>> $$2 = Optional.of($$1);
      return $$2x -> $$0.test($$2x) ? $$2 : Optional.empty();
   }

   static <C extends epm> Predicate<evm.a<C>> checkForBiomeOnTop(eka.a $$0) {
      return $$1 -> $$1.a($$0);
   }

   public record a<C extends epm>(efz a, dob b, eko c, long d, dlz e, C f, dmw g, Predicate<jl<dnx>> h, ezb i, jz j) {
      public boolean a(eka.a $$0) {
         int $$1 = this.e.b();
         int $$2 = this.e.c();
         int $$3 = this.a.c($$1, $$2, $$0, this.g, this.c);
         jl<dnx> $$4 = this.a.d().getNoiseBiome(jw.a($$1), jw.a($$3), jw.a($$2), this.c.b());
         return this.h.test($$4);
      }
   }
}
