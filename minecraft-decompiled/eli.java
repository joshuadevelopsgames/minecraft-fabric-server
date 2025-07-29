import com.mojang.serialization.MapCodec;

public interface eli<P extends elh> {
   eli<eln> a = a("matching_blocks", eln.a);
   eli<elm> b = a("matching_block_tag", elm.e);
   eli<elo> c = a("matching_fluids", elo.a);
   eli<elk> d = a("has_sturdy_face", elk.a);
   eli<elr> e = a("solid", elr.a);
   eli<elq> f = a("replaceable", elq.a);
   eli<elv> g = a("would_survive", elv.a);
   eli<ell> h = a("inside_world_bounds", ell.a);
   eli<elg> i = a("any_of", elg.a);
   eli<elf> j = a("all_of", elf.a);
   eli<elp> k = a("not", elp.a);
   eli<elt> l = a("true", elt.e);
   eli<elu> m = a("unobstructed", elu.a);

   MapCodec<P> codec();

   private static <P extends elh> eli<P> a(String $$0, MapCodec<P> $$1) {
      return jy.a(mm.M, $$0, () -> $$1);
   }
}
