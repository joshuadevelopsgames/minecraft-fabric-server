import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.Predicate;

public class fej extends few {
   public static final MapCodec<fej> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
         .and(
            $$0.group(
               fej.b.b.fieldOf("source").forGetter($$0x -> $$0x.b),
               kp.a.listOf().optionalFieldOf("include").forGetter($$0x -> $$0x.c),
               kp.a.listOf().optionalFieldOf("exclude").forGetter($$0x -> $$0x.d)
            )
         )
         .apply($$0, fej::new)
   );
   private final fej.b b;
   private final Optional<List<kp<?>>> c;
   private final Optional<List<kp<?>>> d;
   private final Predicate<kp<?>> e;

   fej(List<fgs> $$0, fej.b $$1, Optional<List<kp<?>>> $$2, Optional<List<kp<?>>> $$3) {
      super($$0);
      this.b = $$1;
      this.c = $$2.map(List::copyOf);
      this.d = $$3.map(List::copyOf);
      List<Predicate<kp<?>>> $$4 = new ArrayList<>(2);
      $$3.ifPresent($$1x -> $$4.add($$1xx -> !$$1x.contains($$1xx)));
      $$2.ifPresent($$1x -> $$4.add($$1x::contains));
      this.e = ag.a($$4);
   }

   @Override
   public fey<fej> b() {
      return fez.J;
   }

   @Override
   public Set<bdn<?>> a() {
      return this.b.a();
   }

   @Override
   public dcv a(dcv $$0, fdj $$1) {
      kn $$2 = this.b.a($$1);
      $$0.b($$2.a(this.e));
      return $$0;
   }

   public static fej.a a(fej.b $$0) {
      return new fej.a($$0);
   }

   public static class a extends few.a<fej.a> {
      private final fej.b a;
      private Optional<Builder<kp<?>>> b = Optional.empty();
      private Optional<Builder<kp<?>>> c = Optional.empty();

      a(fej.b $$0) {
         this.a = $$0;
      }

      public fej.a a(kp<?> $$0) {
         if (this.b.isEmpty()) {
            this.b = Optional.of(ImmutableList.builder());
         }

         this.b.get().add($$0);
         return this;
      }

      public fej.a b(kp<?> $$0) {
         if (this.c.isEmpty()) {
            this.c = Optional.of(ImmutableList.builder());
         }

         this.c.get().add($$0);
         return this;
      }

      protected fej.a a() {
         return this;
      }

      @Override
      public fex b() {
         return new fej(this.g(), this.a, this.b.map(Builder::build), this.c.map(Builder::build));
      }
   }

   public static enum b implements bda {
      a("block_entity");

      public static final Codec<fej.b> b = bda.b(fej.b::values);
      private final String c;

      private b(final String $$0) {
         this.c = $$0;
      }

      public kn a(fdj $$0) {
         switch (this) {
            case a:
               eaz $$1 = $$0.c(fgd.h);
               return $$1 != null ? $$1.r() : kn.a;
            default:
               throw new MatchException(null, null);
         }
      }

      public Set<bdn<?>> a() {
         switch (this) {
            case a:
               return Set.of(fgd.h);
            default:
               throw new MatchException(null, null);
         }
      }

      @Override
      public String c() {
         return this.c;
      }
   }
}
