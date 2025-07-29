import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.ObjectOpenHashSet;
import java.util.List;
import java.util.Set;

public class ffv extends few {
   private static final Codec<List<ffv.b>> b = ffv.b.a.listOf().validate($$0 -> {
      Set<jl<byo>> $$1 = new ObjectOpenHashSet();

      for (ffv.b $$2 : $$0) {
         if (!$$1.add($$2.a())) {
            return DataResult.error(() -> "Encountered duplicate mob effect: '" + $$2.a() + "'");
         }
      }

      return DataResult.success($$0);
   });
   public static final MapCodec<ffv> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(b.optionalFieldOf("effects", List.of()).forGetter($$0x -> $$0x.c)).apply($$0, ffv::new)
   );
   private final List<ffv.b> c;

   ffv(List<fgs> $$0, List<ffv.b> $$1) {
      super($$0);
      this.c = $$1;
   }

   @Override
   public fey<ffv> b() {
      return fez.r;
   }

   @Override
   public Set<bdn<?>> a() {
      return this.c.stream().flatMap($$0 -> $$0.b().a().stream()).collect(ImmutableSet.toImmutableSet());
   }

   @Override
   public dcv a(dcv $$0, fdj $$1) {
      if ($$0.a(dcz.xB) && !this.c.isEmpty()) {
         ffv.b $$2 = ag.a(this.c, $$1.b());
         jl<byo> $$3 = $$2.a();
         int $$4 = $$2.b().a($$1);
         if (!$$3.a().a()) {
            $$4 *= 20;
         }

         dfx.a $$5 = new dfx.a($$3, $$4);
         $$0.a(kq.T, dfx.a, $$5, dfx::a);
         return $$0;
      } else {
         return $$0;
      }
   }

   public static ffv.a c() {
      return new ffv.a();
   }

   public static class a extends few.a<ffv.a> {
      private final Builder<ffv.b> a = ImmutableList.builder();

      protected ffv.a a() {
         return this;
      }

      public ffv.a a(jl<byo> $$0, fho $$1) {
         this.a.add(new ffv.b($$0, $$1));
         return this;
      }

      @Override
      public fex b() {
         return new ffv(this.g(), this.a.build());
      }
   }

   record b(jl<byo> b, fho c) {
      public static final Codec<ffv.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(byo.a.fieldOf("type").forGetter(ffv.b::a), fhp.a.fieldOf("duration").forGetter(ffv.b::b)).apply($$0, ffv.b::new)
      );

      public jl<byo> a() {
         return this.b;
      }

      public fho b() {
         return this.c;
      }
   }
}
