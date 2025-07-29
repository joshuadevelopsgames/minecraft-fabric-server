import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;

public class eqi implements epm {
   public static final Codec<eqi> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
            ern.a.fieldOf("trunk_provider").forGetter($$0x -> $$0x.b),
            esu.c.fieldOf("trunk_placer").forGetter($$0x -> $$0x.d),
            ern.a.fieldOf("foliage_provider").forGetter($$0x -> $$0x.e),
            eqy.d.fieldOf("foliage_placer").forGetter($$0x -> $$0x.f),
            erk.d.optionalFieldOf("root_placer").forGetter($$0x -> $$0x.g),
            ern.a.fieldOf("dirt_provider").forGetter($$0x -> $$0x.c),
            eqn.a.fieldOf("minimum_size").forGetter($$0x -> $$0x.h),
            esi.h.listOf().fieldOf("decorators").forGetter($$0x -> $$0x.i),
            Codec.BOOL.fieldOf("ignore_vines").orElse(false).forGetter($$0x -> $$0x.j),
            Codec.BOOL.fieldOf("force_dirt").orElse(false).forGetter($$0x -> $$0x.k)
         )
         .apply($$0, eqi::new)
   );
   public final ern b;
   public final ern c;
   public final esu d;
   public final ern e;
   public final eqy f;
   public final Optional<erk> g;
   public final eqn h;
   public final List<esi> i;
   public final boolean j;
   public final boolean k;

   protected eqi(ern $$0, esu $$1, ern $$2, eqy $$3, Optional<erk> $$4, ern $$5, eqn $$6, List<esi> $$7, boolean $$8, boolean $$9) {
      this.b = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
      this.g = $$4;
      this.c = $$5;
      this.h = $$6;
      this.i = $$7;
      this.j = $$8;
      this.k = $$9;
   }

   public static class a {
      public final ern a;
      private final esu c;
      public final ern b;
      private final eqy d;
      private final Optional<erk> e;
      private ern f;
      private final eqn g;
      private List<esi> h = ImmutableList.of();
      private boolean i;
      private boolean j;

      public a(ern $$0, esu $$1, ern $$2, eqy $$3, Optional<erk> $$4, eqn $$5) {
         this.a = $$0;
         this.c = $$1;
         this.b = $$2;
         this.f = ern.a(dqb.j);
         this.d = $$3;
         this.e = $$4;
         this.g = $$5;
      }

      public a(ern $$0, esu $$1, ern $$2, eqy $$3, eqn $$4) {
         this($$0, $$1, $$2, $$3, Optional.empty(), $$4);
      }

      public eqi.a a(ern $$0) {
         this.f = $$0;
         return this;
      }

      public eqi.a a(List<esi> $$0) {
         this.h = $$0;
         return this;
      }

      public eqi.a a() {
         this.i = true;
         return this;
      }

      public eqi.a b() {
         this.j = true;
         return this;
      }

      public eqi c() {
         return new eqi(this.a, this.c, this.b, this.d, this.e, this.f, this.g, this.h, this.i, this.j);
      }
   }
}
