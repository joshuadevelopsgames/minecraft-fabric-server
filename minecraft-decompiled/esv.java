import com.mojang.serialization.MapCodec;

public class esv<P extends esu> {
   public static final esv<est> a = a("straight_trunk_placer", est.a);
   public static final esv<esq> b = a("forking_trunk_placer", esq.a);
   public static final esv<esr> c = a("giant_trunk_placer", esr.a);
   public static final esv<ess> d = a("mega_jungle_trunk_placer", ess.b);
   public static final esv<eso> e = a("dark_oak_trunk_placer", eso.a);
   public static final esv<esp> f = a("fancy_trunk_placer", esp.a);
   public static final esv<esm> g = a("bending_trunk_placer", esm.a);
   public static final esv<esw> h = a("upwards_branching_trunk_placer", esw.a);
   public static final esv<esn> i = a("cherry_trunk_placer", esn.a);
   private final MapCodec<P> j;

   private static <P extends esu> esv<P> a(String $$0, MapCodec<P> $$1) {
      return jy.a(mm.V, $$0, new esv<>($$1));
   }

   private esv(MapCodec<P> $$0) {
      this.j = $$0;
   }

   public MapCodec<P> a() {
      return this.j;
   }
}
