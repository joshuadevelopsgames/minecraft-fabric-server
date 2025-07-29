import com.mojang.serialization.MapCodec;

public class eqz<P extends eqy> {
   public static final eqz<eqt> a = a("blob_foliage_placer", eqt.a);
   public static final eqz<ere> b = a("spruce_foliage_placer", ere.a);
   public static final eqz<erc> c = a("pine_foliage_placer", erc.a);
   public static final eqz<eqs> d = a("acacia_foliage_placer", eqs.a);
   public static final eqz<equ> e = a("bush_foliage_placer", equ.c);
   public static final eqz<eqx> f = a("fancy_foliage_placer", eqx.c);
   public static final eqz<era> g = a("jungle_foliage_placer", era.a);
   public static final eqz<erb> h = a("mega_pine_foliage_placer", erb.a);
   public static final eqz<eqw> i = a("dark_oak_foliage_placer", eqw.a);
   public static final eqz<erd> j = a("random_spread_foliage_placer", erd.a);
   public static final eqz<eqv> k = a("cherry_foliage_placer", eqv.a);
   private final MapCodec<P> l;

   private static <P extends eqy> eqz<P> a(String $$0, MapCodec<P> $$1) {
      return jy.a(mm.U, $$0, new eqz<>($$1));
   }

   private eqz(MapCodec<P> $$0) {
      this.l = $$0;
   }

   public MapCodec<P> a() {
      return this.l;
   }
}
