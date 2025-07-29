import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ffk extends few {
   public static final MapCodec<ffk> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
         .and(
            $$0.group(
               Codec.unboundedMap(dji.c, fhp.a).optionalFieldOf("enchantments", Map.of()).forGetter($$0x -> $$0x.b),
               Codec.BOOL.fieldOf("add").orElse(false).forGetter($$0x -> $$0x.c)
            )
         )
         .apply($$0, ffk::new)
   );
   private final Map<jl<dji>, fho> b;
   private final boolean c;

   ffk(List<fgs> $$0, Map<jl<dji>, fho> $$1, boolean $$2) {
      super($$0);
      this.b = Map.copyOf($$1);
      this.c = $$2;
   }

   @Override
   public fey<ffk> b() {
      return fez.i;
   }

   @Override
   public Set<bdn<?>> a() {
      return this.b.values().stream().flatMap($$0 -> $$0.a().stream()).collect(ImmutableSet.toImmutableSet());
   }

   @Override
   public dcv a(dcv $$0, fdj $$1) {
      if ($$0.a(dcz.rW)) {
         $$0 = $$0.a((dmt)dcz.vY);
      }

      djk.a($$0, $$1x -> {
         if (this.c) {
            this.b.forEach(($$2, $$3) -> $$1x.a((jl<dji>)$$2, bcb.a($$1x.a((jl<dji>)$$2) + $$3.a($$1), 0, 255)));
         } else {
            this.b.forEach(($$2, $$3) -> $$1x.a((jl<dji>)$$2, bcb.a($$3.a($$1), 0, 255)));
         }
      });
      return $$0;
   }

   public static class a extends few.a<ffk.a> {
      private final Builder<jl<dji>, fho> a = ImmutableMap.builder();
      private final boolean b;

      public a() {
         this(false);
      }

      public a(boolean $$0) {
         this.b = $$0;
      }

      protected ffk.a a() {
         return this;
      }

      public ffk.a a(jl<dji> $$0, fho $$1) {
         this.a.put($$0, $$1);
         return this;
      }

      @Override
      public fex b() {
         return new ffk(this.g(), this.a.build(), this.b);
      }
   }
}
