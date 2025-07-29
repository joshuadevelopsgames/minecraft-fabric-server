import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class feo extends few {
   public static final int a = 0;
   public static final MapCodec<feo> b = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
         .and(
            $$0.group(
               dji.c.fieldOf("enchantment").forGetter($$0x -> $$0x.c),
               fhp.a.fieldOf("count").forGetter($$0x -> $$0x.d),
               Codec.INT.optionalFieldOf("limit", 0).forGetter($$0x -> $$0x.e)
            )
         )
         .apply($$0, feo::new)
   );
   private final jl<dji> c;
   private final fho d;
   private final int e;

   feo(List<fgs> $$0, jl<dji> $$1, fho $$2, int $$3) {
      super($$0);
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
   }

   @Override
   public fey<feo> b() {
      return fez.m;
   }

   @Override
   public Set<bdn<?>> a() {
      return Sets.union(ImmutableSet.of(fgd.d), this.d.a());
   }

   private boolean c() {
      return this.e > 0;
   }

   @Override
   public dcv a(dcv $$0, fdj $$1) {
      bzm $$2 = $$1.c(fgd.d);
      if ($$2 instanceof cam $$3) {
         int $$4 = djk.a(this.c, $$3);
         if ($$4 == 0) {
            return $$0;
         }

         float $$5 = $$4 * this.d.b($$1);
         $$0.g(Math.round($$5));
         if (this.c()) {
            $$0.f(this.e);
         }
      }

      return $$0;
   }

   public static feo.a a(jn.a $$0, fho $$1) {
      jn.b<dji> $$2 = $$0.e(mn.aW);
      return new feo.a($$2.b(djn.s), $$1);
   }

   public static class a extends few.a<feo.a> {
      private final jl<dji> a;
      private final fho b;
      private int c = 0;

      public a(jl<dji> $$0, fho $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      protected feo.a a() {
         return this;
      }

      public feo.a a(int $$0) {
         this.c = $$0;
         return this;
      }

      @Override
      public fex b() {
         return new feo(this.g(), this.a, this.b, this.c);
      }
   }
}
