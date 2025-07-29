import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public interface eyz<P extends eyx> {
   Codec<eyx> a = mm.af.q().dispatch("processor_type", eyx::a, eyz::codec);
   Codec<eyy> b = a.listOf().xmap(eyy::new, eyy::a);
   Codec<eyy> c = Codec.withAlternative(b.fieldOf("processors").codec(), b);
   Codec<jl<eyy>> d = ama.a(mn.bh, c);
   eyz<eyb> e = a("block_ignore", eyb.a);
   eyz<eyd> f = a("block_rot", eyd.a);
   eyz<eyg> g = a("gravity", eyg.a);
   eyz<eyh> h = a("jigsaw_replacement", eyh.a);
   eyz<eyt> i = a("rule", eyt.a);
   eyz<eyl> j = a("nop", eyl.a);
   eyz<eya> k = a("block_age", eya.a);
   eyz<exz> l = a("blackstone_replace", exz.a);
   eyz<eyi> m = a("lava_submerged_block", eyi.a);
   eyz<eyq> n = a("protected_blocks", eyq.b);
   eyz<eyf> o = a("capped", eyf.a);

   MapCodec<P> codec();

   static <P extends eyx> eyz<P> a(String $$0, MapCodec<P> $$1) {
      return jy.a(mm.af, $$0, () -> $$1);
   }
}
