import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableSet.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;

public class fei extends few {
   public static final MapCodec<fei> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
         .and(
            $$0.group(
               mm.e.r().fieldOf("block").forGetter($$0x -> $$0x.b),
               Codec.STRING.listOf().fieldOf("properties").forGetter($$0x -> $$0x.c.stream().map(efe::f).toList())
            )
         )
         .apply($$0, fei::new)
   );
   private final jl<dpz> b;
   private final Set<efe<?>> c;

   fei(List<fgs> $$0, jl<dpz> $$1, Set<efe<?>> $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   private fei(List<fgs> $$0, jl<dpz> $$1, List<String> $$2) {
      this($$0, $$1, $$2.stream().map($$1.a().l()::a).filter(Objects::nonNull).collect(Collectors.toSet()));
   }

   @Override
   public fey<fei> b() {
      return fez.D;
   }

   @Override
   public Set<bdn<?>> a() {
      return Set.of(fgd.g);
   }

   @Override
   protected dcv a(dcv $$0, fdj $$1) {
      eeb $$2 = $$1.c(fgd.g);
      if ($$2 != null) {
         $$0.a(kq.aq, dev.a, $$1x -> {
            for (efe<?> $$2x : this.c) {
               if ($$2.b($$2x)) {
                  $$1x = $$1x.a($$2x, $$2);
               }
            }

            return $$1x;
         });
      }

      return $$0;
   }

   public static fei.a a(dpz $$0) {
      return new fei.a($$0);
   }

   public static class a extends few.a<fei.a> {
      private final jl<dpz> a;
      private final Builder<efe<?>> b = ImmutableSet.builder();

      a(dpz $$0) {
         this.a = $$0.p();
      }

      public fei.a a(efe<?> $$0) {
         if (!this.a.a().l().d().contains($$0)) {
            throw new IllegalStateException("Property " + $$0 + " is not present on block " + this.a);
         } else {
            this.b.add($$0);
            return this;
         }
      }

      protected fei.a a() {
         return this;
      }

      @Override
      public fex b() {
         return new fei(this.g(), this.a, this.b.build());
      }
   }
}
