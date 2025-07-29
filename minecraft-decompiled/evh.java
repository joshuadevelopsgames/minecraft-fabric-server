import com.mojang.serialization.MapCodec;

public interface evh<S extends euy> {
   evh<ews> a = a("buried_treasure", ews.d);
   evh<ewu> b = a("desert_pyramid", ewu.d);
   evh<eww> c = a("end_city", eww.d);
   evh<exf> d = a("fortress", exf.e);
   evh<ewy> e = a("igloo", ewy.d);
   evh<ewz> f = a("jigsaw", ewz.i);
   evh<exb> g = a("jungle_temple", exb.d);
   evh<exd> h = a("mineshaft", exd.d);
   evh<exh> i = a("nether_fossil", exh.d);
   evh<exj> j = a("ocean_monument", exj.d);
   evh<exl> k = a("ocean_ruin", exl.d);
   evh<exn> l = a("ruined_portal", exn.d);
   evh<exp> m = a("shipwreck", exp.d);
   evh<exr> n = a("stronghold", exr.d);
   evh<ext> o = a("swamp_hut", ext.d);
   evh<exv> p = a("woodland_mansion", exv.d);

   MapCodec<S> codec();

   private static <S extends euy> evh<S> a(String $$0, MapCodec<S> $$1) {
      return jy.a(mm.R, $$0, () -> $$1);
   }
}
