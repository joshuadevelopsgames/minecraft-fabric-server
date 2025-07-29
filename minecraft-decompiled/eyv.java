import com.mojang.serialization.MapCodec;

public interface eyv<P extends eyu> {
   eyv<exx> a = a("always_true", exx.a);
   eyv<eyc> b = a("block_match", eyc.a);
   eyv<eye> c = a("blockstate_match", eye.a);
   eyv<ezc> d = a("tag_match", ezc.a);
   eyv<eyr> e = a("random_block_match", eyr.a);
   eyv<eys> f = a("random_blockstate_match", eys.a);

   MapCodec<P> codec();

   static <P extends eyu> eyv<P> a(String $$0, MapCodec<P> $$1) {
      return jy.a(mm.m, $$0, () -> $$1);
   }
}
