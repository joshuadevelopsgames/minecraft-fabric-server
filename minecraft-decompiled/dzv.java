import com.google.common.base.Suppliers;
import com.google.common.collect.BiMap;
import com.google.common.collect.ImmutableBiMap;
import com.mojang.serialization.Codec;
import java.util.Optional;
import java.util.function.Supplier;

public interface dzv extends drc<dzv.a> {
   Supplier<BiMap<dpz, dpz>> C_ = Suppliers.memoize(
      () -> ImmutableBiMap.builder()
         .put(dqb.rF, dqb.rG)
         .put(dqb.rG, dqb.rH)
         .put(dqb.rH, dqb.rI)
         .put(dqb.rO, dqb.rN)
         .put(dqb.rN, dqb.rM)
         .put(dqb.rM, dqb.rL)
         .put(dqb.rS, dqb.rR)
         .put(dqb.rR, dqb.rQ)
         .put(dqb.rQ, dqb.rP)
         .put(dqb.se, dqb.sd)
         .put(dqb.sd, dqb.sc)
         .put(dqb.sc, dqb.sb)
         .put(dqb.sa, dqb.rZ)
         .put(dqb.rZ, dqb.rY)
         .put(dqb.rY, dqb.rX)
         .put(dqb.sv, dqb.sw)
         .put(dqb.sw, dqb.sy)
         .put(dqb.sy, dqb.sx)
         .put(dqb.sD, dqb.sE)
         .put(dqb.sE, dqb.sG)
         .put(dqb.sG, dqb.sF)
         .put(dqb.sL, dqb.sM)
         .put(dqb.sM, dqb.sN)
         .put(dqb.sN, dqb.sO)
         .put(dqb.sT, dqb.sU)
         .put(dqb.sU, dqb.sV)
         .put(dqb.sV, dqb.sW)
         .build()
   );
   Supplier<BiMap<dpz, dpz>> D_ = Suppliers.memoize(() -> C_.get().inverse());

   static Optional<dpz> a(dpz $$0) {
      return Optional.ofNullable((dpz)D_.get().get($$0));
   }

   static dpz b(dpz $$0) {
      dpz $$1 = $$0;

      for (dpz $$2 = (dpz)D_.get().get($$0); $$2 != null; $$2 = (dpz)D_.get().get($$2)) {
         $$1 = $$2;
      }

      return $$1;
   }

   static Optional<eeb> b(eeb $$0) {
      return a($$0.b()).map($$1 -> $$1.m($$0));
   }

   static Optional<dpz> c(dpz $$0) {
      return Optional.ofNullable((dpz)C_.get().get($$0));
   }

   static eeb c(eeb $$0) {
      return b($$0.b()).m($$0);
   }

   @Override
   default Optional<eeb> k_(eeb $$0) {
      return c($$0.b()).map($$1 -> $$1.m($$0));
   }

   @Override
   default float au_() {
      return this.c() == dzv.a.a ? 0.75F : 1.0F;
   }

   public static enum a implements bda {
      a("unaffected"),
      b("exposed"),
      c("weathered"),
      d("oxidized");

      public static final Codec<dzv.a> e = bda.a(dzv.a::values);
      private final String f;

      private a(final String $$0) {
         this.f = $$0;
      }

      @Override
      public String c() {
         return this.f;
      }
   }
}
