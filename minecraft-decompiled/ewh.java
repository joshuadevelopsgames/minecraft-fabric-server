import com.mojang.serialization.MapCodec;

public interface ewh<P extends ewg> {
   ewh<ewf> a = a("single_pool_element", ewf.b);
   ewh<ewe> b = a("list_pool_element", ewe.a);
   ewh<ewa> c = a("feature_pool_element", ewa.a);
   ewh<evz> d = a("empty_pool_element", evz.a);
   ewh<ewd> e = a("legacy_single_pool_element", ewd.a);

   MapCodec<P> codec();

   static <P extends ewg> ewh<P> a(String $$0, MapCodec<P> $$1) {
      return jy.a(mm.ag, $$0, () -> $$1);
   }
}
