import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.UnaryOperator;
import javax.annotation.Nullable;

public class ffr extends few {
   public static final MapCodec<ffr> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
         .and(
            $$0.group(
               xq.a.sizeLimitedListOf(256).fieldOf("lore").forGetter($$0x -> $$0x.b),
               fev.a(256).forGetter($$0x -> $$0x.c),
               fdj.b.e.optionalFieldOf("entity").forGetter($$0x -> $$0x.d)
            )
         )
         .apply($$0, ffr::new)
   );
   private final List<xo> b;
   private final fev c;
   private final Optional<fdj.b> d;

   public ffr(List<fgs> $$0, List<xo> $$1, fev $$2, Optional<fdj.b> $$3) {
      super($$0);
      this.b = List.copyOf($$1);
      this.c = $$2;
      this.d = $$3;
   }

   @Override
   public fey<ffr> b() {
      return fez.A;
   }

   @Override
   public Set<bdn<?>> a() {
      return this.d.<Set<bdn<?>>>map($$0 -> Set.of($$0.a())).orElseGet(Set::of);
   }

   @Override
   public dcv a(dcv $$0, fdj $$1) {
      $$0.a(kq.j, dfo.a, $$1x -> new dfo(this.a($$1x, $$1)));
      return $$0;
   }

   private List<xo> a(@Nullable dfo $$0, fdj $$1) {
      if ($$0 == null && this.b.isEmpty()) {
         return List.of();
      } else {
         UnaryOperator<xo> $$2 = ffs.a($$1, this.d.orElse(null));
         List<xo> $$3 = this.b.stream().map($$2).toList();
         return this.c.a($$0.a(), $$3, 256);
      }
   }

   public static ffr.a c() {
      return new ffr.a();
   }

   public static class a extends few.a<ffr.a> {
      private Optional<fdj.b> a = Optional.empty();
      private final Builder<xo> b = ImmutableList.builder();
      private fev c = fev.a.b;

      public ffr.a a(fev $$0) {
         this.c = $$0;
         return this;
      }

      public ffr.a a(fdj.b $$0) {
         this.a = Optional.of($$0);
         return this;
      }

      public ffr.a a(xo $$0) {
         this.b.add($$0);
         return this;
      }

      protected ffr.a a() {
         return this;
      }

      @Override
      public fex b() {
         return new ffr(this.g(), this.b.build(), this.c, this.a);
      }
   }
}
