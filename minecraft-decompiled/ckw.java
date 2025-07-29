import java.util.function.Supplier;

public class ckw<U extends ckv<?>> {
   public static final ckw<ckf> a = a("dummy", ckf::new);
   public static final ckw<ckn> b = a("nearest_items", ckn::new);
   public static final ckw<cko<cam>> c = a("nearest_living_entities", cko::new);
   public static final ckw<cks> d = a("nearest_players", cks::new);
   public static final ckw<ckm> e = a("nearest_bed", ckm::new);
   public static final ckw<ckj> f = a("hurt_by", ckj::new);
   public static final ckw<ckz> g = a("villager_hostiles", ckz::new);
   public static final ckw<cky> h = a("villager_babies", cky::new);
   public static final ckw<ckt> i = a("secondary_pois", ckt::new);
   public static final ckw<ckh> j = a("golem_detected", ckh::new);
   public static final ckw<ckl<cnr>> k = a("armadillo_scare_detected", () -> new ckl<>(5, cnr::i, cnr::gT, cjo.H, 80));
   public static final ckw<ckr> l = a("piglin_specific_sensor", ckr::new);
   public static final ckw<ckq> m = a("piglin_brute_specific_sensor", ckq::new);
   public static final ckw<cki> n = a("hoglin_specific_sensor", cki::new);
   public static final ckw<ckb> o = a("nearest_adult", ckb::new);
   public static final ckw<ckb> p = a("nearest_adult_any_type", ckc::new);
   public static final ckw<ckd> q = a("axolotl_attackables", ckd::new);
   public static final ckw<ckx> r = a("axolotl_temptations", () -> new ckx(cnv.a()));
   public static final ckw<ckx> s = a("goat_temptations", () -> new ckx(col.a()));
   public static final ckw<ckx> t = a("frog_temptations", () -> new ckx(cod.a()));
   public static final ckw<ckx> u = a("camel_temptations", () -> new ckx(coa.b()));
   public static final ckw<ckx> v = a("armadillo_temptations", () -> new ckx(cns.b()));
   public static final ckw<ckx> w = a("happy_ghast_temptations", () -> new ckx(cmt.cu));
   public static final ckw<ckg> x = a("frog_attackables", ckg::new);
   public static final ckw<ckk> y = a("is_in_water", ckk::new);
   public static final ckw<cla> z = a("warden_entity_sensor", cla::new);
   public static final ckw<ckx> A = a("sniffer_temptations", () -> new ckx(cph.a()));
   public static final ckw<cke> B = a("breeze_attack_entity_sensor", cke::new);
   private final Supplier<U> C;

   private ckw(Supplier<U> $$0) {
      this.C = $$0;
   }

   public U a() {
      return this.C.get();
   }

   private static <U extends ckv<?>> ckw<U> a(String $$0, Supplier<U> $$1) {
      return jy.a(mm.A, ame.b($$0), new ckw<>($$1));
   }
}
