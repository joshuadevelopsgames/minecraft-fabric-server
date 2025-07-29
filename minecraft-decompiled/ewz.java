import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;

public final class ewz extends euy {
   public static final evy d = evy.b;
   public static final eyk e = eyk.b;
   public static final int f = 128;
   public static final int g = 0;
   public static final int h = 20;
   public static final MapCodec<ewz> i = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
               a($$0),
               ewi.b.fieldOf("start_pool").forGetter($$0x -> $$0x.j),
               ame.a.optionalFieldOf("start_jigsaw_name").forGetter($$0x -> $$0x.k),
               Codec.intRange(0, 20).fieldOf("size").forGetter($$0x -> $$0x.l),
               etf.c.fieldOf("start_height").forGetter($$0x -> $$0x.m),
               Codec.BOOL.fieldOf("use_expansion_hack").forGetter($$0x -> $$0x.n),
               eka.a.g.optionalFieldOf("project_start_to_heightmap").forGetter($$0x -> $$0x.o),
               Codec.intRange(1, 128).fieldOf("max_distance_from_center").forGetter($$0x -> $$0x.p),
               Codec.list(ewk.b).optionalFieldOf("pool_aliases", List.of()).forGetter($$0x -> $$0x.q),
               evy.a.optionalFieldOf("dimension_padding", d).forGetter($$0x -> $$0x.r),
               eyk.c.optionalFieldOf("liquid_settings", e).forGetter($$0x -> $$0x.s)
            )
            .apply($$0, ewz::new)
      )
      .validate(ewz::a);
   private final jl<ewi> j;
   private final Optional<ame> k;
   private final int l;
   private final etf m;
   private final boolean n;
   private final Optional<eka.a> o;
   private final int p;
   private final List<ewk> q;
   private final evy r;
   private final eyk s;

   private static DataResult<ewz> a(ewz $$0) {
      int $$1 = switch ($$0.d()) {
         case a -> 0;
         case b, c, d, e -> 12;
      };
      return $$0.p + $$1 > 128 ? DataResult.error(() -> "Structure size including terrain adaptation must not exceed 128") : DataResult.success($$0);
   }

   public ewz(euy.c $$0, jl<ewi> $$1, Optional<ame> $$2, int $$3, etf $$4, boolean $$5, Optional<eka.a> $$6, int $$7, List<ewk> $$8, evy $$9, eyk $$10) {
      super($$0);
      this.j = $$1;
      this.k = $$2;
      this.l = $$3;
      this.m = $$4;
      this.n = $$5;
      this.o = $$6;
      this.p = $$7;
      this.q = $$8;
      this.r = $$9;
      this.s = $$10;
   }

   public ewz(euy.c $$0, jl<ewi> $$1, int $$2, etf $$3, boolean $$4, eka.a $$5) {
      this($$0, $$1, Optional.empty(), $$2, $$3, $$4, Optional.of($$5), 80, List.of(), d, e);
   }

   public ewz(euy.c $$0, jl<ewi> $$1, int $$2, etf $$3, boolean $$4) {
      this($$0, $$1, Optional.empty(), $$2, $$3, $$4, Optional.empty(), 80, List.of(), d, e);
   }

   @Override
   public Optional<euy.b> a(euy.a $$0) {
      dlz $$1 = $$0.h();
      int $$2 = this.m.a($$0.f(), new ekx($$0.b(), $$0.i()));
      jb $$3 = new jb($$1.d(), $$2, $$1.e());
      return ewc.a($$0, this.j, this.k, this.l, $$3, this.n, this.o, this.p, ewm.create(this.q, $$3, $$0.g()), this.r, this.s);
   }

   @Override
   public evh<?> e() {
      return evh.f;
   }

   @VisibleForTesting
   public jl<ewi> f() {
      return this.j;
   }

   @VisibleForTesting
   public List<ewk> g() {
      return this.q;
   }
}
