import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class eql implements epm {
   public static final Codec<eql> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
            bae.b(mn.i).fieldOf("replaceable").forGetter($$0x -> $$0x.b),
            ern.a.fieldOf("ground_state").forGetter($$0x -> $$0x.c),
            euc.b.fieldOf("vegetation_feature").forGetter($$0x -> $$0x.d),
            ets.c.fieldOf("surface").forGetter($$0x -> $$0x.e),
            bwo.b(1, 128).fieldOf("depth").forGetter($$0x -> $$0x.f),
            Codec.floatRange(0.0F, 1.0F).fieldOf("extra_bottom_block_chance").forGetter($$0x -> $$0x.g),
            Codec.intRange(1, 256).fieldOf("vertical_range").forGetter($$0x -> $$0x.h),
            Codec.floatRange(0.0F, 1.0F).fieldOf("vegetation_chance").forGetter($$0x -> $$0x.i),
            bwo.c.fieldOf("xz_radius").forGetter($$0x -> $$0x.j),
            Codec.floatRange(0.0F, 1.0F).fieldOf("extra_edge_column_chance").forGetter($$0x -> $$0x.k)
         )
         .apply($$0, eql::new)
   );
   public final bae<dpz> b;
   public final ern c;
   public final jl<euc> d;
   public final ets e;
   public final bwo f;
   public final float g;
   public final int h;
   public final float i;
   public final bwo j;
   public final float k;

   public eql(bae<dpz> $$0, ern $$1, jl<euc> $$2, ets $$3, bwo $$4, float $$5, int $$6, float $$7, bwo $$8, float $$9) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
      this.f = $$4;
      this.g = $$5;
      this.h = $$6;
      this.i = $$7;
      this.j = $$8;
      this.k = $$9;
   }
}
