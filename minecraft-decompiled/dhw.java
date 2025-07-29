import com.mojang.serialization.MapCodec;

public interface dhw<T extends dhm<?>> {
   dhw<dia> a = a("crafting_shaped", new dia.a());
   dhw<dic> b = a("crafting_shapeless", new dic.a());
   dhw<dgt> c = a("crafting_special_armordye", new dhc.a<>(dgt::new));
   dhw<dgw> d = a("crafting_special_bookcloning", new dhc.a<>(dgw::new));
   dhw<dhj> e = a("crafting_special_mapcloning", new dhc.a<>(dhj::new));
   dhw<dhk> f = a("crafting_special_mapextending", new dhc.a<>(dhk::new));
   dhw<dhf> g = a("crafting_special_firework_rocket", new dhc.a<>(dhf::new));
   dhw<dhh> h = a("crafting_special_firework_star", new dhc.a<>(dhh::new));
   dhw<dhg> i = a("crafting_special_firework_star_fade", new dhc.a<>(dhg::new));
   dhw<din> j = a("crafting_special_tippedarrow", new dhc.a<>(din::new));
   dhw<dgu> k = a("crafting_special_bannerduplicate", new dhc.a<>(dgu::new));
   dhw<did> l = a("crafting_special_shielddecoration", new dhc.a<>(did::new));
   dhw<dio> m = a("crafting_transmute", new dio.a());
   dhw<dhy> n = a("crafting_special_repairitem", new dhc.a<>(dhy::new));
   dhw<dig> o = a("smelting", new dgs.b<>(dig::new, 200));
   dhw<dgv> p = a("blasting", new dgs.b<>(dgv::new, 100));
   dhw<dil> q = a("smoking", new dgs.b<>(dil::new, 100));
   dhw<dgx> r = a("campfire_cooking", new dgs.b<>(dgx::new, 100));
   dhw<dim> s = a("stonecutting", new die.b<>(dim::new));
   dhw<dij> t = a("smithing_transform", new dij.a());
   dhw<dik> u = a("smithing_trim", new dik.a());
   dhw<dhd> v = a("crafting_decorated_pot", new dhc.a<>(dhd::new));

   MapCodec<T> a();

   @Deprecated
   zm<wx, T> b();

   static <S extends dhw<T>, T extends dhm<?>> S a(String $$0, S $$1) {
      return jy.a(mm.r, $$0, $$1);
   }
}
