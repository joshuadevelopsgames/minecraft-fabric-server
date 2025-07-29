import com.mojang.serialization.MapCodec;

public interface bwp<P extends bwo> {
   bwp<bwl> a = a("constant", bwl.b);
   bwp<bwu> b = a("uniform", bwu.a);
   bwp<bwg> c = a("biased_to_bottom", bwg.a);
   bwp<bwh> d = a("clamped", bwh.a);
   bwp<bwv> e = a("weighted_list", bwv.a);
   bwp<bwj> f = a("clamped_normal", bwj.a);

   MapCodec<P> codec();

   static <P extends bwo> bwp<P> a(String $$0, MapCodec<P> $$1) {
      return jy.a(mm.K, $$0, () -> $$1);
   }
}
