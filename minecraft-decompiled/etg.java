import com.mojang.serialization.MapCodec;

public interface etg<P extends etf> {
   etg<ete> a = a("constant", ete.b);
   etg<eti> b = a("uniform", eti.a);
   etg<etd> c = a("biased_to_bottom", etd.a);
   etg<etj> d = a("very_biased_to_bottom", etj.a);
   etg<eth> e = a("trapezoid", eth.a);
   etg<etk> f = a("weighted_list", etk.a);

   MapCodec<P> codec();

   private static <P extends etf> etg<P> a(String $$0, MapCodec<P> $$1) {
      return jy.a(mm.L, $$0, () -> $$1);
   }
}
