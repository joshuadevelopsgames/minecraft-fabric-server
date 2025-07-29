import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class doo extends dob {
   public static final MapCodec<doo> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(amc.d(doe.ai), amc.d(doe.aj), amc.d(doe.ak), amc.d(doe.al), amc.d(doe.am)).apply($$0, $$0.stable(doo::new))
   );
   private final jl<dnx> c;
   private final jl<dnx> d;
   private final jl<dnx> e;
   private final jl<dnx> f;
   private final jl<dnx> g;

   public static doo a(jm<dnx> $$0) {
      return new doo($$0.b(doe.ai), $$0.b(doe.aj), $$0.b(doe.ak), $$0.b(doe.al), $$0.b(doe.am));
   }

   private doo(jl<dnx> $$0, jl<dnx> $$1, jl<dnx> $$2, jl<dnx> $$3, jl<dnx> $$4) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
      this.g = $$4;
   }

   @Override
   protected Stream<jl<dnx>> b() {
      return Stream.of(this.c, this.d, this.e, this.f, this.g);
   }

   @Override
   protected MapCodec<? extends dob> a() {
      return b;
   }

   @Override
   public jl<dnx> getNoiseBiome(int $$0, int $$1, int $$2, dog.f $$3) {
      int $$4 = jw.c($$0);
      int $$5 = jw.c($$1);
      int $$6 = jw.c($$2);
      int $$7 = ke.a($$4);
      int $$8 = ke.a($$6);
      if ((long)$$7 * $$7 + (long)$$8 * $$8 <= 4096L) {
         return this.c;
      } else {
         int $$9 = (ke.a($$4) * 2 + 1) * 8;
         int $$10 = (ke.a($$6) * 2 + 1) * 8;
         double $$11 = $$3.e().a(new ejt.e($$9, $$5, $$10));
         if ($$11 > 0.25) {
            return this.d;
         } else if ($$11 >= -0.0625) {
            return this.e;
         } else {
            return $$11 < -0.21875 ? this.f : this.g;
         }
      }
   }
}
