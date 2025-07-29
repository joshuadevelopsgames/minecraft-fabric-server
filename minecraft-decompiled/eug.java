import com.mojang.serialization.MapCodec;

public interface eug<P extends euf> {
   eug<etr> a = a("block_predicate_filter", etr.a);
   eug<eui> b = a("rarity_filter", eui.a);
   eug<euk> c = a("surface_relative_threshold_filter", euk.a);
   eug<eul> d = a("surface_water_depth_filter", eul.a);
   eug<etq> e = a("biome", etq.a);
   eug<etu> f = a("count", etu.a);
   eug<eua> g = a("noise_based_count", eua.a);
   eug<eub> h = a("noise_threshold_count", eub.a);
   eug<ett> i = a("count_on_every_layer", ett.a);
   eug<etv> j = a("environment_scan", etv.a);
   eug<ety> k = a("heightmap", ety.a);
   eug<etx> l = a("height_range", etx.a);
   eug<etz> m = a("in_square", etz.a);
   eug<euh> n = a("random_offset", euh.a);
   eug<etw> o = a("fixed_placement", etw.a);

   MapCodec<P> codec();

   private static <P extends euf> eug<P> a(String $$0, MapCodec<P> $$1) {
      return jy.a(mm.S, $$0, () -> $$1);
   }
}
