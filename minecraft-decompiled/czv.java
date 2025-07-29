public class czv<T extends cym> implements cya {
   public static final czv<cyv> a = a("generic_9x1", cyv::a);
   public static final czv<cyv> b = a("generic_9x2", cyv::b);
   public static final czv<cyv> c = a("generic_9x3", cyv::c);
   public static final czv<cyv> d = a("generic_9x4", cyv::d);
   public static final czv<cyv> e = a("generic_9x5", cyv::e);
   public static final czv<cyv> f = a("generic_9x6", cyv::f);
   public static final czv<czh> g = a("generic_3x3", czh::new);
   public static final czv<czc> h = a("crafter_3x3", czc::new);
   public static final czv<cyp> i = a("anvil", cyp::new);
   public static final czv<cyr> j = a("beacon", cyr::new);
   public static final czv<cys> k = a("blast_furnace", cys::new);
   public static final czv<cyt> l = a("brewing_stand", cyt::new);
   public static final czv<czf> m = a("crafting", czf::new);
   public static final czv<czi> n = a("enchantment", czi::new);
   public static final czv<czk> o = a("furnace", czk::new);
   public static final czv<czm> p = a("grindstone", czm::new);
   public static final czv<czn> q = a("hopper", czn::new);
   public static final czv<czs> r = a("lectern", ($$0, $$1) -> new czs($$0));
   public static final czv<czt> s = a("loom", czt::new);
   public static final czv<czx> t = a("merchant", czx::new);
   public static final czv<dah> u = a("shulker_box", dah::new);
   public static final czv<dan> v = a("smithing", dan::new);
   public static final czv<dao> w = a("smoker", dao::new);
   public static final czv<cyu> x = a("cartography_table", cyu::new);
   public static final czv<daq> y = a("stonecutter", daq::new);
   private final cyd z;
   private final czv.a<T> A;

   private static <T extends cym> czv<T> a(String $$0, czv.a<T> $$1) {
      return jy.a(mm.p, $$0, new czv<>($$1, cyf.g));
   }

   private static <T extends cym> czv<T> a(String $$0, czv.a<T> $$1, cyb... $$2) {
      return jy.a(mm.p, $$0, new czv<>($$1, cyf.e.a($$2)));
   }

   private czv(czv.a<T> $$0, cyd $$1) {
      this.A = $$0;
      this.z = $$1;
   }

   public T a(int $$0, cus $$1) {
      return this.A.create($$0, $$1);
   }

   @Override
   public cyd k() {
      return this.z;
   }

   interface a<T extends cym> {
      T create(int var1, cus var2);
   }
}
