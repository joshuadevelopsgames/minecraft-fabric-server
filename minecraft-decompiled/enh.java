import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

public abstract class enh<FC extends epm> {
   public static final enh<ept> e = a("no_op", new eob(ept.a));
   public static final enh<eqi> f = a("tree", new eot(eqi.a));
   public static final enh<epl> g = a("fallen_tree", new eng(epl.a));
   public static final enh<epz> h = a("flower", new eof(epz.a));
   public static final enh<epz> i = a("no_bonemeal_flower", new eof(epz.a));
   public static final enh<epz> j = a("random_patch", new eof(epz.a));
   public static final enh<epd> k = a("block_pile", new emo(epd.a));
   public static final enh<eqh> l = a("spring_feature", new eos(eqh.a));
   public static final enh<ept> m = a("chorus_plant", new emr(ept.a));
   public static final enh<eqa> n = a("replace_single_block", new eoi(eqa.a));
   public static final enh<ept> o = a("void_start_platform", new eoy(ept.a));
   public static final enh<ept> p = a("desert_well", new emy(ept.a));
   public static final enh<enm> q = a("fossil", new enl(enm.a));
   public static final enh<epo> r = a("huge_red_mushroom", new ens(epo.a));
   public static final enh<epo> s = a("huge_brown_mushroom", new enp(epo.a));
   public static final enh<ept> t = a("ice_spike", new ent(ept.a));
   public static final enh<ept> u = a("glowstone_blob", new eno(ept.a));
   public static final enh<ept> v = a("freeze_top_layer", new eoq(ept.a));
   public static final enh<ept> w = a("vines", new eox(ept.a));
   public static final enh<epc> x = a("block_column", new emn(epc.a));
   public static final enh<eql> y = a("vegetation_patch", new eow(eql.a));
   public static final enh<eql> z = a("waterlogged_vegetation_patch", new eoz(eql.a));
   public static final enh<eqc> A = a("root_system", new eoj(eqc.a));
   public static final enh<epr> B = a("multiface_growth", new enz(epr.a));
   public static final enh<eqk> C = a("underwater_magma", new eov(eqk.a));
   public static final enh<ept> D = a("monster_room", new eny(ept.a));
   public static final enh<ept> E = a("blue_ice", new emp(ept.a));
   public static final enh<epe> F = a("iceberg", new enu(epe.a));
   public static final enh<epe> G = a("forest_rock", new emm(epe.a));
   public static final enh<epi> H = a("disk", new emz(epi.a));
   public static final enh<enw.a> I = a("lake", new enw(enw.a.a));
   public static final enh<epu> J = a("ore", new eoc(epu.a));
   public static final enh<ept> K = a("end_platform", new ene(ept.a));
   public static final enh<eqg> L = a("end_spike", new eor(eqg.a));
   public static final enh<ept> M = a("end_island", new end(ept.a));
   public static final enh<epk> N = a("end_gateway", new enc(epk.a));
   public static final eon O = a("seagrass", new eon(epw.k));
   public static final enh<ept> P = a("kelp", new env(ept.a));
   public static final enh<ept> Q = a("coral_tree", new emw(ept.a));
   public static final enh<ept> R = a("coral_mushroom", new emv(ept.a));
   public static final enh<ept> S = a("coral_claw", new emt(ept.a));
   public static final enh<epg> T = a("sea_pickle", new eom(epg.a));
   public static final enh<eqe> U = a("simple_block", new eoo(eqe.a));
   public static final enh<epw> V = a("bamboo", new emj(epw.k));
   public static final enh<enq> W = a("huge_fungus", new enr(enq.a));
   public static final enh<eps> X = a("nether_forest_vegetation", new eoa(eps.c));
   public static final enh<ept> Y = a("weeping_vines", new epa(ept.a));
   public static final enh<eqj> Z = a("twisting_vines", new eou(eqj.a));
   public static final enh<epf> aa = a("basalt_columns", new emk(epf.a));
   public static final enh<eph> ab = a("delta_feature", new emx(eph.a));
   public static final enh<eqb> ac = a("netherrack_replace_blobs", new eoh(eqb.a));
   public static final enh<epq> ad = a("fill_layer", new enk(epq.a));
   public static final emq ae = a("bonus_chest", new emq(ept.a));
   public static final enh<ept> af = a("basalt_pillar", new eml(ept.a));
   public static final enh<epu> ag = a("scattered_ore", new eok(epu.a));
   public static final enh<epy> ah = a("random_selector", new eog(epy.a));
   public static final enh<eqf> ai = a("simple_random_selector", new eop(eqf.a));
   public static final enh<epx> aj = a("random_boolean_selector", new eoe(epx.a));
   public static final enh<epn> ak = a("geode", new enn(epn.b));
   public static final enh<epj> al = a("dripstone_cluster", new ena(epj.a));
   public static final enh<epp> am = a("large_dripstone", new enx(epp.a));
   public static final enh<epv> an = a("pointed_dripstone", new eod(epv.a));
   public static final enh<eqd> ao = a("sculk_patch", new eol(eqd.a));
   private final MapCodec<ems<FC, enh<FC>>> a;

   private static <C extends epm, F extends enh<C>> F a(String $$0, F $$1) {
      return jy.a(mm.O, $$0, $$1);
   }

   public enh(Codec<FC> $$0) {
      this.a = $$0.fieldOf("config").xmap($$0x -> new ems<>(this, $$0x), ems::c);
   }

   public MapCodec<ems<FC, enh<FC>>> a() {
      return this.a;
   }

   protected void a(dnc $$0, jb $$1, eeb $$2) {
      $$0.a($$1, $$2, 3);
   }

   public static Predicate<eeb> a(bae<dpz> $$0) {
      return $$1 -> !$$1.a($$0);
   }

   protected void a(dnt $$0, jb $$1, eeb $$2, Predicate<eeb> $$3) {
      if ($$3.test($$0.a_($$1))) {
         $$0.a($$1, $$2, 2);
      }
   }

   public abstract boolean a(enj<FC> var1);

   public boolean a(FC $$0, dnt $$1, efz $$2, bck $$3, jb $$4) {
      return $$1.f_($$4) ? this.a(new enj<>(Optional.empty(), $$1, $$2, $$3, $$4, $$0)) : false;
   }

   protected static boolean a(eeb $$0) {
      return $$0.a(azo.bi);
   }

   public static boolean b(eeb $$0) {
      return $$0.a(azo.ad);
   }

   public static boolean a(dna $$0, jb $$1) {
      return $$0.a($$1, enh::b);
   }

   public static boolean a(Function<jb, eeb> $$0, jb $$1, Predicate<eeb> $$2) {
      jb.a $$3 = new jb.a();

      for (jh $$4 : jh.values()) {
         $$3.a($$1, $$4);
         if ($$2.test($$0.apply($$3))) {
            return true;
         }
      }

      return false;
   }

   public static boolean a(Function<jb, eeb> $$0, jb $$1) {
      return a($$0, $$1, eea.a::l);
   }

   protected void a(dnt $$0, jb $$1) {
      jb.a $$2 = $$1.k();

      for (int $$3 = 0; $$3 < 2; $$3++) {
         $$2.c(jh.b);
         if ($$0.a_($$2).l()) {
            return;
         }

         $$0.A($$2).e($$2);
      }
   }
}
