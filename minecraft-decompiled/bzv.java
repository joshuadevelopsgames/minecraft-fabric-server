import com.google.common.collect.ImmutableSet;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import java.util.Optional;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Stream;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;
import org.slf4j.Logger;

public class bzv<T extends bzm> implements cya, ein<bzm, T> {
   private static final Logger bX = LogUtils.getLogger();
   private final jl.c<bzv<?>> bY = mm.f.f(this);
   public static final Codec<bzv<?>> a = mm.f.q();
   private static final float bZ = 1.3964844F;
   private static final int ca = 10;
   public static final bzv<cxi> b = a("acacia_boat", bzv.a.a(a(() -> dcz.pd), cap.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bzv<cxj> c = a("acacia_chest_boat", bzv.a.a(b(() -> dcz.pe), cap.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bzv<cno> d = a("allay", bzv.a.a(cno::new, cap.b).a(0.35F, 0.6F).b(0.36F).c(0.04F).a(8).b(2));
   public static final bzv<bze> e = a("area_effect_cloud", bzv.a.<bze>a(bze::new, cap.h).e().c().a(6.0F, 0.5F).a(10).b(Integer.MAX_VALUE));
   public static final bzv<cnr> f = a("armadillo", bzv.a.a(cnr::new, cap.b).a(0.7F, 0.65F).b(0.26F).a(10));
   public static final bzv<cqo> g = a("armor_stand", bzv.a.<cqo>a(cqo::new, cap.h).a(0.5F, 1.975F).b(1.7775F).a(10));
   public static final bzv<cve> h = a("arrow", bzv.a.<cve>a(cve::new, cap.h).e().a(0.5F, 0.5F).b(0.13F).a(4).b(20));
   public static final bzv<cnu> i = a("axolotl", bzv.a.a(cnu::new, cap.d).a(0.75F, 0.42F).b(0.2751F).a(10));
   public static final bzv<cxk> j = a("bamboo_chest_raft", bzv.a.a(d(() -> dcz.po), cap.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bzv<cxx> k = a("bamboo_raft", bzv.a.a(c(() -> dcz.pn), cap.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bzv<clw> l = a("bat", bzv.a.a(clw::new, cap.c).a(0.5F, 0.9F).b(0.45F).a(5));
   public static final bzv<cme> m = a("bee", bzv.a.a(cme::new, cap.b).a(0.7F, 0.6F).b(0.3F).a(8));
   public static final bzv<cxi> n = a("birch_boat", bzv.a.a(a(() -> dcz.oZ), cap.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bzv<cxj> o = a("birch_chest_boat", bzv.a.a(b(() -> dcz.pa), cap.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bzv<cre> p = a("blaze", bzv.a.a(cre::new, cap.a).c().a(0.6F, 1.8F).a(8));
   public static final bzv<bzj.b> q = a("block_display", bzv.a.a(bzj.b::new, cap.h).e().a(0.0F, 0.0F).a(10).b(1));
   public static final bzv<crf> r = a("bogged", bzv.a.a(crf::new, cap.a).a(0.6F, 1.99F).b(1.74F).c(-0.7F).a(8));
   public static final bzv<csr> s = a("breeze", bzv.a.a(csr::new, cap.a).a(0.6F, 1.77F).b(1.3452F).a(10));
   public static final bzv<cwg> t = a("breeze_wind_charge", bzv.a.<cwg>a(cwg::new, cap.h).e().a(0.3125F, 0.3125F).b(0.0F).a(4).b(10));
   public static final bzv<cnz> u = a("camel", bzv.a.a(cnz::new, cap.b).a(1.7F, 2.375F).b(2.275F).a(10));
   public static final bzv<cmg> v = a("cat", bzv.a.a(cmg::new, cap.b).a(0.6F, 0.7F).b(0.35F).a(0.5125F).a(8));
   public static final bzv<crg> w = a("cave_spider", bzv.a.a(crg::new, cap.a).a(0.7F, 0.5F).b(0.45F).a(8));
   public static final bzv<cxi> x = a("cherry_boat", bzv.a.a(a(() -> dcz.pf), cap.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bzv<cxj> y = a("cherry_chest_boat", bzv.a.a(b(() -> dcz.pg), cap.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bzv<cxp> z = a("chest_minecart", bzv.a.a(cxp::new, cap.h).e().a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final bzv<cmj> A = a("chicken", bzv.a.a(cmj::new, cap.b).a(0.4F, 0.7F).b(0.644F).a(new fis(0.0, 0.7, -0.1)).a(10));
   public static final bzv<cmm> B = a("cod", bzv.a.a(cmm::new, cap.g).a(0.5F, 0.3F).b(0.195F).a(4));
   public static final bzv<cxq> C = a("command_block_minecart", bzv.a.a(cxq::new, cap.h).e().a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final bzv<cmn> D = a("cow", bzv.a.a(cmn::new, cap.b).a(0.9F, 1.4F).b(1.3F).a(1.36875F).a(10));
   public static final bzv<csz> E = a("creaking", bzv.a.a(csz::new, cap.a).a(0.9F, 2.7F).b(2.3F).a(8));
   public static final bzv<crh> F = a("creeper", bzv.a.a(crh::new, cap.a).a(0.6F, 1.7F).a(8));
   public static final bzv<cxi> G = a("dark_oak_boat", bzv.a.a(a(() -> dcz.ph), cap.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bzv<cxj> H = a("dark_oak_chest_boat", bzv.a.a(b(() -> dcz.pi), cap.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bzv<cmq> I = a("dolphin", bzv.a.a(cmq::new, cap.f).a(0.9F, 0.6F).b(0.3F));
   public static final bzv<cor> J = a("donkey", bzv.a.a(cor::new, cap.b).a(1.3964844F, 1.5F).b(1.425F).a(1.1125F).a(10));
   public static final bzv<cvf> K = a("dragon_fireball", bzv.a.<cvf>a(cvf::new, cap.h).e().a(1.0F, 1.0F).a(4).b(10));
   public static final bzv<crj> L = a("drowned", bzv.a.a(crj::new, cap.a).a(0.6F, 1.95F).b(1.74F).a(2.0125F).c(-0.7F).a(8));
   public static final bzv<cvx> M = a("egg", bzv.a.<cvx>a(cvx::new, cap.h).e().a(0.25F, 0.25F).a(4).b(10));
   public static final bzv<crk> N = a("elder_guardian", bzv.a.a(crk::new, cap.a).a(1.9975F, 1.9975F).b(0.99875F).a(2.350625F).a(10));
   public static final bzv<crl> O = a("enderman", bzv.a.a(crl::new, cap.a).a(0.6F, 2.9F).b(2.55F).a(2.80625F).a(8));
   public static final bzv<crm> P = a("endermite", bzv.a.a(crm::new, cap.a).a(0.4F, 0.3F).b(0.13F).a(0.2375F).a(8));
   public static final bzv<cps> Q = a("ender_dragon", bzv.a.a(cps::new, cap.a).c().a(16.0F, 8.0F).a(3.0F).a(10));
   public static final bzv<cvy> R = a("ender_pearl", bzv.a.<cvy>a(cvy::new, cap.h).e().a(0.25F, 0.25F).a(4).b(10));
   public static final bzv<cpr> S = a("end_crystal", bzv.a.<cpr>a(cpr::new, cap.h).e().c().a(2.0F, 2.0F).a(16).b(Integer.MAX_VALUE));
   public static final bzv<cro> T = a("evoker", bzv.a.a(cro::new, cap.a).a(0.6F, 1.95F).a(2.0F).c(-0.6F).a(8));
   public static final bzv<cvg> U = a("evoker_fangs", bzv.a.<cvg>a(cvg::new, cap.h).e().a(0.5F, 0.8F).a(6).b(2));
   public static final bzv<cvz> V = a("experience_bottle", bzv.a.<cvz>a(cvz::new, cap.h).e().a(0.25F, 0.25F).a(4).b(10));
   public static final bzv<caa> W = a("experience_orb", bzv.a.<caa>a(caa::new, cap.h).e().a(0.5F, 0.5F).a(6).b(20));
   public static final bzv<cvh> X = a("eye_of_ender", bzv.a.<cvh>a(cvh::new, cap.h).e().a(0.25F, 0.25F).a(4).b(4));
   public static final bzv<cqy> Y = a("falling_block", bzv.a.<cqy>a(cqy::new, cap.h).e().a(0.98F, 0.98F).a(10).b(20));
   public static final bzv<cvm> Z = a("fireball", bzv.a.<cvm>a(cvm::new, cap.h).e().a(1.0F, 1.0F).a(4).b(10));
   public static final bzv<cvj> aa = a("firework_rocket", bzv.a.<cvj>a(cvj::new, cap.h).e().a(0.25F, 0.25F).a(4).b(10));
   public static final bzv<cms> ab = a("fox", bzv.a.a(cms::new, cap.b).a(0.6F, 0.7F).b(0.4F).a(new fis(0.0, 0.6375, -0.25)).a(8).a(dqb.oP));
   public static final bzv<coc> ac = a("frog", bzv.a.a(coc::new, cap.b).a(0.5F, 0.5F).a(new fis(0.0, 0.375, -0.25)).a(10));
   public static final bzv<cxr> ad = a("furnace_minecart", bzv.a.a(cxr::new, cap.h).e().a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final bzv<crp> ae = a("ghast", bzv.a.a(crp::new, cap.a).c().a(4.0F, 4.0F).b(2.6F).a(4.0625F).c(0.5F).a(10));
   public static final bzv<cmt> af = a(
      "happy_ghast",
      bzv.a.a(cmt::new, cap.b)
         .a(4.0F, 4.0F)
         .b(2.6F)
         .a(new fis(0.0, 4.0, 1.7), new fis(-1.7, 4.0, 0.0), new fis(0.0, 4.0, -1.7), new fis(1.7, 4.0, 0.0))
         .c(0.5F)
         .a(10)
   );
   public static final bzv<crq> ag = a("giant", bzv.a.a(crq::new, cap.a).a(3.6F, 12.0F).b(10.44F).c(-3.75F).a(10));
   public static final bzv<cqq> ah = a("glow_item_frame", bzv.a.<cqq>a(cqq::new, cap.h).e().a(0.5F, 0.5F).b(0.0F).a(10).b(Integer.MAX_VALUE));
   public static final bzv<cab> ai = a("glow_squid", bzv.a.a(cab::new, cap.e).a(0.8F, 0.8F).b(0.4F).a(10));
   public static final bzv<cok> aj = a("goat", bzv.a.a(cok::new, cap.b).a(0.9F, 1.3F).a(1.1125F).a(10));
   public static final bzv<crr> ak = a("guardian", bzv.a.a(crr::new, cap.a).a(0.85F, 0.85F).b(0.425F).a(0.975F).a(8));
   public static final bzv<ctc> al = a("hoglin", bzv.a.a(ctc::new, cap.a).a(1.3964844F, 1.4F).a(1.49375F).a(8));
   public static final bzv<cxs> am = a("hopper_minecart", bzv.a.a(cxs::new, cap.h).e().a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final bzv<cos> an = a("horse", bzv.a.a(cos::new, cap.b).a(1.3964844F, 1.6F).b(1.52F).a(1.44375F).a(10));
   public static final bzv<crs> ao = a("husk", bzv.a.a(crs::new, cap.a).a(0.6F, 1.95F).b(1.74F).a(2.075F).c(-0.7F).a(8));
   public static final bzv<crt> ap = a("illusioner", bzv.a.a(crt::new, cap.a).a(0.6F, 1.95F).a(2.0F).c(-0.6F).a(8));
   public static final bzv<cag> aq = a("interaction", bzv.a.a(cag::new, cap.h).e().a(0.0F, 0.0F).a(10));
   public static final bzv<cmv> ar = a("iron_golem", bzv.a.a(cmv::new, cap.h).a(1.4F, 2.7F).a(10));
   public static final bzv<cqz> as = a("item", bzv.a.<cqz>a(cqz::new, cap.h).e().a(0.25F, 0.25F).b(0.2125F).a(6).b(20));
   public static final bzv<bzj.g> at = a("item_display", bzv.a.a(bzj.g::new, cap.h).e().a(0.0F, 0.0F).a(10).b(1));
   public static final bzv<cqs> au = a("item_frame", bzv.a.<cqs>a(cqs::new, cap.h).e().a(0.5F, 0.5F).b(0.0F).a(10).b(Integer.MAX_VALUE));
   public static final bzv<cxi> av = a("jungle_boat", bzv.a.a(a(() -> dcz.pb), cap.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bzv<cxj> aw = a("jungle_chest_boat", bzv.a.a(b(() -> dcz.pc), cap.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bzv<cqt> ax = a("leash_knot", bzv.a.<cqt>a(cqt::new, cap.h).e().b().a(0.375F, 0.5F).b(0.0625F).a(10).b(Integer.MAX_VALUE));
   public static final bzv<cal> ay = a("lightning_bolt", bzv.a.a(cal::new, cap.h).e().b().a(0.0F, 0.0F).a(16).b(Integer.MAX_VALUE));
   public static final bzv<cot> az = a("llama", bzv.a.a(cot::new, cap.b).a(0.9F, 1.87F).b(1.7765F).a(new fis(0.0, 1.37, -0.3)).a(10));
   public static final bzv<cvn> aA = a("llama_spit", bzv.a.<cvn>a(cvn::new, cap.h).e().a(0.25F, 0.25F).a(4).b(10));
   public static final bzv<cru> aB = a("magma_cube", bzv.a.a(cru::new, cap.a).c().a(0.52F, 0.52F).b(0.325F).a(4.0F).a(8));
   public static final bzv<cxi> aC = a("mangrove_boat", bzv.a.a(a(() -> dcz.pl), cap.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bzv<cxj> aD = a("mangrove_chest_boat", bzv.a.a(b(() -> dcz.pm), cap.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bzv<can> aE = a("marker", bzv.a.a(can::new, cap.h).e().a(0.0F, 0.0F).a(0));
   public static final bzv<cxn> aF = a("minecart", bzv.a.a(cxn::new, cap.h).e().a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final bzv<cmw> aG = a("mooshroom", bzv.a.a(cmw::new, cap.b).a(0.9F, 1.4F).b(1.3F).a(1.36875F).a(10));
   public static final bzv<cov> aH = a("mule", bzv.a.a(cov::new, cap.b).a(1.3964844F, 1.6F).b(1.52F).a(1.2125F).a(8));
   public static final bzv<cxi> aI = a("oak_boat", bzv.a.a(a(() -> dcz.oV), cap.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bzv<cxj> aJ = a("oak_chest_boat", bzv.a.a(b(() -> dcz.oW), cap.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bzv<cmx> aK = a("ocelot", bzv.a.a(cmx::new, cap.b).a(0.6F, 0.7F).a(0.6375F).a(10));
   public static final bzv<cas> aL = a("ominous_item_spawner", bzv.a.a(cas::new, cap.h).e().a(0.25F, 0.25F).a(8));
   public static final bzv<cqu> aM = a("painting", bzv.a.<cqu>a(cqu::new, cap.h).e().a(0.5F, 0.5F).a(10).b(Integer.MAX_VALUE));
   public static final bzv<cxi> aN = a("pale_oak_boat", bzv.a.a(a(() -> dcz.pj), cap.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bzv<cxj> aO = a("pale_oak_chest_boat", bzv.a.a(b(() -> dcz.pk), cap.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bzv<cmy> aP = a("panda", bzv.a.a(cmy::new, cap.b).a(1.3F, 1.25F).a(10));
   public static final bzv<cmz> aQ = a("parrot", bzv.a.a(cmz::new, cap.b).a(0.5F, 0.9F).b(0.54F).a(0.4625F).a(8));
   public static final bzv<crx> aR = a("phantom", bzv.a.a(crx::new, cap.a).a(0.9F, 0.5F).b(0.175F).a(0.3375F).c(-0.125F).a(8));
   public static final bzv<cna> aS = a("pig", bzv.a.a(cna::new, cap.b).a(0.9F, 0.9F).a(0.86875F).a(10));
   public static final bzv<cti> aT = a("piglin", bzv.a.a(cti::new, cap.a).a(0.6F, 1.95F).b(1.79F).a(2.0125F).c(-0.7F).a(8));
   public static final bzv<ctl> aU = a("piglin_brute", bzv.a.a(ctl::new, cap.a).a(0.6F, 1.95F).b(1.79F).a(2.0125F).c(-0.7F).a(8));
   public static final bzv<cry> aV = a("pillager", bzv.a.a(cry::new, cap.a).d().a(0.6F, 1.95F).a(2.0F).c(-0.6F).a(8));
   public static final bzv<cnd> aW = a("polar_bear", bzv.a.a(cnd::new, cap.b).a(dqb.ry).a(1.4F, 1.4F).a(10));
   public static final bzv<cwb> aX = a("splash_potion", bzv.a.<cwb>a(cwb::new, cap.h).e().a(0.25F, 0.25F).a(4).b(10));
   public static final bzv<cwa> aY = a("lingering_potion", bzv.a.<cwa>a(cwa::new, cap.h).e().a(0.25F, 0.25F).a(4).b(10));
   public static final bzv<cne> aZ = a("pufferfish", bzv.a.a(cne::new, cap.g).a(0.7F, 0.7F).b(0.455F).a(4));
   public static final bzv<cnf> ba = a("rabbit", bzv.a.a(cnf::new, cap.b).a(0.4F, 0.5F).a(8));
   public static final bzv<csa> bb = a("ravager", bzv.a.a(csa::new, cap.a).a(1.95F, 2.2F).a(new fis(0.0, 2.2625, -0.0625)).a(10));
   public static final bzv<cng> bc = a("salmon", bzv.a.a(cng::new, cap.g).a(0.7F, 0.4F).b(0.26F).a(4));
   public static final bzv<cpd> bd = a("sheep", bzv.a.a(cpd::new, cap.b).a(0.9F, 1.3F).b(1.235F).a(1.2375F).a(10));
   public static final bzv<csb> be = a("shulker", bzv.a.a(csb::new, cap.a).c().d().a(1.0F, 1.0F).b(0.5F).a(10));
   public static final bzv<cvr> bf = a("shulker_bullet", bzv.a.<cvr>a(cvr::new, cap.h).e().a(0.3125F, 0.3125F).a(8));
   public static final bzv<csc> bg = a("silverfish", bzv.a.a(csc::new, cap.a).a(0.4F, 0.3F).b(0.13F).a(0.2375F).a(8));
   public static final bzv<csd> bh = a("skeleton", bzv.a.a(csd::new, cap.a).a(0.6F, 1.99F).b(1.74F).c(-0.7F).a(8));
   public static final bzv<cow> bi = a("skeleton_horse", bzv.a.a(cow::new, cap.b).a(1.3964844F, 1.6F).b(1.52F).a(1.31875F).a(10));
   public static final bzv<cse> bj = a("slime", bzv.a.a(cse::new, cap.a).a(0.52F, 0.52F).b(0.325F).a(4.0F).a(10));
   public static final bzv<cvs> bk = a("small_fireball", bzv.a.<cvs>a(cvs::new, cap.h).e().a(0.3125F, 0.3125F).a(4).b(10));
   public static final bzv<cpg> bl = a("sniffer", bzv.a.a(cpg::new, cap.b).a(1.9F, 1.75F).b(1.05F).a(2.09375F).d(2.05F).a(10));
   public static final bzv<cvt> bm = a("snowball", bzv.a.<cvt>a(cvt::new, cap.h).e().a(0.25F, 0.25F).a(4).b(10));
   public static final bzv<cni> bn = a("snow_golem", bzv.a.a(cni::new, cap.h).a(dqb.ry).a(0.7F, 1.9F).b(1.7F).a(8));
   public static final bzv<cxt> bo = a("spawner_minecart", bzv.a.a(cxt::new, cap.h).e().a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final bzv<cvu> bp = a("spectral_arrow", bzv.a.<cvu>a(cvu::new, cap.h).e().a(0.5F, 0.5F).b(0.13F).a(4).b(20));
   public static final bzv<csg> bq = a("spider", bzv.a.a(csg::new, cap.a).a(1.4F, 0.9F).b(0.65F).a(0.765F).a(8));
   public static final bzv<cxi> br = a("spruce_boat", bzv.a.a(a(() -> dcz.oX), cap.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bzv<cxj> bs = a("spruce_chest_boat", bzv.a.a(b(() -> dcz.oY), cap.h).e().a(1.375F, 0.5625F).b(0.5625F).a(10));
   public static final bzv<cnj> bt = a("squid", bzv.a.a(cnj::new, cap.f).a(0.8F, 0.8F).b(0.4F).a(8));
   public static final bzv<csh> bu = a("stray", bzv.a.a(csh::new, cap.a).a(0.6F, 1.99F).b(1.74F).c(-0.7F).a(dqb.ry).a(8));
   public static final bzv<csi> bv = a("strider", bzv.a.a(csi::new, cap.b).c().a(0.9F, 1.7F).a(10));
   public static final bzv<coh> bw = a("tadpole", bzv.a.a(coh::new, cap.b).a(0.4F, 0.3F).b(0.19500001F).a(10));
   public static final bzv<bzj.k> bx = a("text_display", bzv.a.a(bzj.k::new, cap.h).e().a(0.0F, 0.0F).a(10).b(1));
   public static final bzv<cra> by = a("tnt", bzv.a.<cra>a(cra::new, cap.h).e().c().a(0.98F, 0.98F).b(0.15F).a(10).b(10));
   public static final bzv<cxu> bz = a("tnt_minecart", bzv.a.a(cxu::new, cap.h).e().a(0.98F, 0.7F).a(0.1875F).a(8));
   public static final bzv<coy> bA = a("trader_llama", bzv.a.a(coy::new, cap.b).a(0.9F, 1.87F).b(1.7765F).a(new fis(0.0, 1.37, -0.3)).a(10));
   public static final bzv<cwc> bB = a("trident", bzv.a.<cwc>a(cwc::new, cap.h).e().a(0.5F, 0.5F).b(0.13F).a(4).b(20));
   public static final bzv<cnl> bC = a("tropical_fish", bzv.a.a(cnl::new, cap.g).a(0.5F, 0.4F).b(0.26F).a(4));
   public static final bzv<cnm> bD = a("turtle", bzv.a.a(cnm::new, cap.b).a(1.2F, 0.4F).a(new fis(0.0, 0.55625, -0.25)).a(10));
   public static final bzv<csj> bE = a("vex", bzv.a.a(csj::new, cap.a).c().a(0.4F, 0.8F).b(0.51875F).a(0.7375F).c(0.04F).a(8));
   public static final bzv<cuf> bF = a("villager", bzv.a.<cuf>a(cuf::new, cap.h).a(0.6F, 1.95F).b(1.62F).a(10));
   public static final bzv<csk> bG = a("vindicator", bzv.a.a(csk::new, cap.a).a(0.6F, 1.95F).a(2.0F).c(-0.6F).a(8));
   public static final bzv<cul> bH = a("wandering_trader", bzv.a.a(cul::new, cap.b).a(0.6F, 1.95F).b(1.62F).a(10));
   public static final bzv<ctw> bI = a("warden", bzv.a.a(ctw::new, cap.a).a(0.9F, 2.9F).a(3.15F).a(bzn.d, 0.0F, 1.6F, 0.0F).a(16).c());
   public static final bzv<cwh> bJ = a("wind_charge", bzv.a.<cwh>a(cwh::new, cap.h).e().a(0.3125F, 0.3125F).b(0.0F).a(4).b(10));
   public static final bzv<csl> bK = a("witch", bzv.a.a(csl::new, cap.a).a(0.6F, 1.95F).b(1.62F).a(2.2625F).a(8));
   public static final bzv<cqm> bL = a("wither", bzv.a.a(cqm::new, cap.a).c().a(dqb.cn).a(0.9F, 3.5F).a(10));
   public static final bzv<csm> bM = a("wither_skeleton", bzv.a.a(csm::new, cap.a).c().a(dqb.cn).a(0.7F, 2.4F).b(2.1F).c(-0.875F).a(8));
   public static final bzv<cwd> bN = a("wither_skull", bzv.a.<cwd>a(cwd::new, cap.h).e().a(0.3125F, 0.3125F).a(4).b(10));
   public static final bzv<cpj> bO = a("wolf", bzv.a.a(cpj::new, cap.b).a(0.6F, 0.85F).b(0.68F).a(new fis(0.0, 0.81875, -0.0625)).a(10));
   public static final bzv<csn> bP = a("zoglin", bzv.a.a(csn::new, cap.a).c().a(1.3964844F, 1.4F).a(1.49375F).a(8));
   public static final bzv<cso> bQ = a("zombie", bzv.a.<cso>a(cso::new, cap.a).a(0.6F, 1.95F).b(1.74F).a(2.0125F).c(-0.7F).a(8));
   public static final bzv<cpa> bR = a("zombie_horse", bzv.a.a(cpa::new, cap.b).a(1.3964844F, 1.6F).b(1.52F).a(1.31875F).a(10));
   public static final bzv<csp> bS = a("zombie_villager", bzv.a.a(csp::new, cap.a).a(0.6F, 1.95F).a(2.125F).c(-0.7F).b(1.74F).a(8));
   public static final bzv<csq> bT = a("zombified_piglin", bzv.a.a(csq::new, cap.a).c().a(0.6F, 1.95F).b(1.79F).a(2.0F).c(-0.7F).a(8));
   public static final bzv<cut> bU = a("player", bzv.a.<cut>a(cap.h).b().a().a(0.6F, 1.8F).b(1.62F).a(cut.ce).a(32).b(2));
   public static final bzv<cvk> bV = a("fishing_bobber", bzv.a.<cvk>a(cvk::new, cap.h).e().b().a().a(0.25F, 0.25F).a(4).b(5));
   private static final Set<bzv<?>> cb = Set.of(Y, C, bo);
   private final bzv.b<T> cc;
   private final cap cd;
   private final ImmutableSet<dpz> ce;
   private final boolean cf;
   private final boolean cg;
   private final boolean ch;
   private final boolean ci;
   private final int cj;
   private final int ck;
   private final String cl;
   @Nullable
   private xo cm;
   private final Optional<amd<fdo>> cn;
   private final bzp co;
   private final float cp;
   private final cyd cq;

   private static <T extends bzm> bzv<T> a(amd<bzv<?>> $$0, bzv.a<T> $$1) {
      return jy.a(mm.f, $$0, $$1.a($$0));
   }

   private static amd<bzv<?>> b(String $$0) {
      return amd.a(mn.D, ame.b($$0));
   }

   private static <T extends bzm> bzv<T> a(String $$0, bzv.a<T> $$1) {
      return a(b($$0), $$1);
   }

   public static ame a(bzv<?> $$0) {
      return mm.f.b($$0);
   }

   public static Optional<bzv<?>> a(String $$0) {
      return mm.f.b(ame.c($$0));
   }

   public bzv(
      bzv.b<T> $$0,
      cap $$1,
      boolean $$2,
      boolean $$3,
      boolean $$4,
      boolean $$5,
      ImmutableSet<dpz> $$6,
      bzp $$7,
      float $$8,
      int $$9,
      int $$10,
      String $$11,
      Optional<amd<fdo>> $$12,
      cyd $$13
   ) {
      this.cc = $$0;
      this.cd = $$1;
      this.ci = $$5;
      this.cf = $$2;
      this.cg = $$3;
      this.ch = $$4;
      this.ce = $$6;
      this.co = $$7;
      this.cp = $$8;
      this.cj = $$9;
      this.ck = $$10;
      this.cl = $$11;
      this.cn = $$12;
      this.cq = $$13;
   }

   @Nullable
   public T a(aub $$0, @Nullable dcv $$1, @Nullable cam $$2, jb $$3, bzu $$4, boolean $$5, boolean $$6) {
      Consumer<T> $$7;
      if ($$1 != null) {
         $$7 = a($$0, $$1, $$2);
      } else {
         $$7 = $$0x -> {};
      }

      return this.a($$0, $$7, $$3, $$4, $$5, $$6);
   }

   public static <T extends bzm> Consumer<T> a(dmu $$0, dcv $$1, @Nullable cam $$2) {
      return a($$0x -> {}, $$0, $$1, $$2);
   }

   public static <T extends bzm> Consumer<T> a(Consumer<T> $$0, dmu $$1, dcv $$2, @Nullable cam $$3) {
      return b(a($$0, $$2), $$1, $$2, $$3);
   }

   public static <T extends bzm> Consumer<T> a(Consumer<T> $$0, dcv $$1) {
      return $$0.andThen($$1x -> $$1x.c($$1));
   }

   public static <T extends bzm> Consumer<T> b(Consumer<T> $$0, dmu $$1, dcv $$2, @Nullable cam $$3) {
      dfd $$4 = $$2.a(kq.Y, dfd.a);
      return !$$4.c() ? $$0.andThen($$3x -> a($$1, $$3, $$3x, $$4)) : $$0;
   }

   @Nullable
   public T a(aub $$0, jb $$1, bzu $$2) {
      return this.a($$0, null, $$1, $$2, false, false);
   }

   @Nullable
   public T a(aub $$0, @Nullable Consumer<T> $$1, jb $$2, bzu $$3, boolean $$4, boolean $$5) {
      T $$6 = this.b($$0, $$1, $$2, $$3, $$4, $$5);
      if ($$6 != null) {
         $$0.a_($$6);
         if ($$6 instanceof cao $$7) {
            $$7.X();
         }
      }

      return $$6;
   }

   @Nullable
   public T b(aub $$0, @Nullable Consumer<T> $$1, jb $$2, bzu $$3, boolean $$4, boolean $$5) {
      T $$6 = this.a($$0, $$3);
      if ($$6 == null) {
         return null;
      } else {
         double $$7;
         if ($$4) {
            $$6.a_($$2.u() + 0.5, $$2.v() + 1, $$2.w() + 0.5);
            $$7 = a($$0, $$2, $$5, $$6.cV());
         } else {
            $$7 = 0.0;
         }

         $$6.b($$2.u() + 0.5, $$2.v() + $$7, $$2.w() + 0.5, bcb.h($$0.A.i() * 360.0F), 0.0F);
         if ($$6 instanceof cao $$9) {
            $$9.bt = $$9.dP();
            $$9.br = $$9.dP();
            $$9.a($$0, $$0.d_($$9.dx()), $$3, null);
         }

         if ($$1 != null) {
            $$1.accept($$6);
         }

         return $$6;
      }
   }

   protected static double a(dmx $$0, jb $$1, boolean $$2, fin $$3) {
      fin $$4 = new fin($$1);
      if ($$2) {
         $$4 = $$4.b(0.0, -1.0, 0.0);
      }

      Iterable<fjm> $$5 = $$0.d(null, $$4);
      return 1.0 + fjj.a(jh.a.b, $$3, $$5, $$2 ? -2.0 : -1.0);
   }

   public static void a(dmu $$0, @Nullable cam $$1, @Nullable bzm $$2, dfd $$3) {
      MinecraftServer $$4 = $$0.q();
      if ($$4 != null && $$2 != null) {
         bzv<?> $$5 = $$3.a($$4.ba(), mn.D);
         if ($$2.ap() == $$5) {
            if ($$0.C || !$$2.ap().s() || $$1 instanceof cut $$6 && $$4.ag().f($$6.gr())) {
               $$3.a($$2);
            }
         }
      }
   }

   public boolean b() {
      return this.cf;
   }

   public boolean c() {
      return this.cg;
   }

   public boolean d() {
      return this.ch;
   }

   public boolean e() {
      return this.ci;
   }

   public cap f() {
      return this.cd;
   }

   public String g() {
      return this.cl;
   }

   public xo h() {
      if (this.cm == null) {
         this.cm = xo.c(this.g());
      }

      return this.cm;
   }

   @Override
   public String toString() {
      return this.g();
   }

   public String i() {
      int $$0 = this.g().lastIndexOf(46);
      return $$0 == -1 ? this.g() : this.g().substring($$0 + 1);
   }

   public Optional<amd<fdo>> j() {
      return this.cn;
   }

   public float l() {
      return this.co.a();
   }

   public float m() {
      return this.co.b();
   }

   @Override
   public cyd k() {
      return this.cq;
   }

   @Nullable
   public T a(dmu $$0, bzu $$1) {
      return !this.a($$0.L()) ? null : this.cc.create(this, $$0);
   }

   public static Optional<bzm> a(fda $$0, dmu $$1, bzu $$2) {
      return ag.a(a($$0).map($$2x -> $$2x.a($$1, $$2)), $$1x -> $$1x.e($$0), () -> bX.warn("Skipping Entity with id {}", $$0.a("id", "[invalid]")));
   }

   public fin a(double $$0, double $$1, double $$2) {
      float $$3 = this.cp * this.l() / 2.0F;
      float $$4 = this.cp * this.m();
      return new fin($$0 - $$3, $$1, $$2 - $$3, $$0 + $$3, $$1 + $$4, $$2 + $$3);
   }

   public boolean a(eeb $$0) {
      if (this.ce.contains($$0.b())) {
         return false;
      } else {
         return !this.ch && fay.a($$0) ? true : $$0.a(dqb.cn) || $$0.a(dqb.oP) || $$0.a(dqb.eg) || $$0.a(dqb.ry);
      }
   }

   public bzp n() {
      return this.co;
   }

   public static Optional<bzv<?>> a(fda $$0) {
      return $$0.a("id", a);
   }

   @Nullable
   public static bzm a(ui $$0, dmu $$1, bzu $$2, Function<bzm, bzm> $$3) {
      bzm var5;
      try (bci.j $$4 = new bci.j(bX)) {
         var5 = a(fcy.a($$4, $$1.K_(), $$0), $$1, $$2, $$3);
      }

      return var5;
   }

   @Nullable
   public static bzm a(fda $$0, dmu $$1, bzu $$2, Function<bzm, bzm> $$3) {
      return b($$0, $$1, $$2).map($$3).map($$4 -> {
         for (fda $$5 : $$0.d("Passengers")) {
            bzm $$6 = a($$5, $$1, $$2, $$3);
            if ($$6 != null) {
               $$6.a($$4, true);
            }
         }

         return (bzm)$$4;
      }).orElse(null);
   }

   public static Stream<bzm> a(fda.b $$0, dmu $$1, bzu $$2) {
      return $$0.b().mapMulti(($$2x, $$3) -> a($$2x, $$1, $$2, $$1xx -> {
         $$3.accept($$1xx);
         return $$1xx;
      }));
   }

   private static Optional<bzm> b(fda $$0, dmu $$1, bzu $$2) {
      try {
         return a($$0, $$1, $$2);
      } catch (RuntimeException var4) {
         bX.warn("Exception loading entity: ", var4);
         return Optional.empty();
      }
   }

   public int o() {
      return this.cj;
   }

   public int p() {
      return this.ck;
   }

   public boolean q() {
      return this != bU && this != aA && this != bL && this != l && this != au && this != ah && this != ax && this != aM && this != S && this != U;
   }

   public boolean a(bae<bzv<?>> $$0) {
      return this.bY.a($$0);
   }

   public boolean a(jp<bzv<?>> $$0) {
      return $$0.a(this.bY);
   }

   @Nullable
   public T a(bzm $$0) {
      return (T)($$0.ap() == this ? $$0 : null);
   }

   @Override
   public Class<? extends bzm> a() {
      return bzm.class;
   }

   @Deprecated
   public jl.c<bzv<?>> r() {
      return this.bY;
   }

   private static bzv.b<cxi> a(Supplier<dcr> $$0) {
      return ($$1, $$2) -> new cxi($$1, $$2, $$0);
   }

   private static bzv.b<cxj> b(Supplier<dcr> $$0) {
      return ($$1, $$2) -> new cxj($$1, $$2, $$0);
   }

   private static bzv.b<cxx> c(Supplier<dcr> $$0) {
      return ($$1, $$2) -> new cxx($$1, $$2, $$0);
   }

   private static bzv.b<cxk> d(Supplier<dcr> $$0) {
      return ($$1, $$2) -> new cxk($$1, $$2, $$0);
   }

   public boolean s() {
      return cb.contains(this);
   }

   public static class a<T extends bzm> {
      private final bzv.b<T> a;
      private final cap b;
      private ImmutableSet<dpz> c = ImmutableSet.of();
      private boolean d = true;
      private boolean e = true;
      private boolean f;
      private boolean g;
      private int h = 5;
      private int i = 3;
      private bzp j = bzp.b(0.6F, 1.8F);
      private float k = 1.0F;
      private bzo.a l = bzo.a();
      private cyd m = cyf.g;
      private alw<bzv<?>, Optional<amd<fdo>>> n = $$0x -> Optional.of(amd.a(mn.bw, $$0x.a().f("entities/")));
      private final alw<bzv<?>, String> o = $$0x -> ag.a("entity", $$0x.a());

      private a(bzv.b<T> $$0, cap $$1) {
         this.a = $$0;
         this.b = $$1;
         this.g = $$1 == cap.b || $$1 == cap.h;
      }

      public static <T extends bzm> bzv.a<T> a(bzv.b<T> $$0, cap $$1) {
         return new bzv.a<>($$0, $$1);
      }

      public static <T extends bzm> bzv.a<T> a(cap $$0) {
         return new bzv.a<>(($$0x, $$1) -> null, $$0);
      }

      public bzv.a<T> a(float $$0, float $$1) {
         this.j = bzp.b($$0, $$1);
         return this;
      }

      public bzv.a<T> a(float $$0) {
         this.k = $$0;
         return this;
      }

      public bzv.a<T> b(float $$0) {
         this.j = this.j.b($$0);
         return this;
      }

      public bzv.a<T> a(float... $$0) {
         for (float $$1 : $$0) {
            this.l = this.l.a(bzn.a, 0.0F, $$1, 0.0F);
         }

         return this;
      }

      public bzv.a<T> a(fis... $$0) {
         for (fis $$1 : $$0) {
            this.l = this.l.a(bzn.a, $$1);
         }

         return this;
      }

      public bzv.a<T> a(fis $$0) {
         return this.a(bzn.b, $$0);
      }

      public bzv.a<T> c(float $$0) {
         return this.a(bzn.b, 0.0F, -$$0, 0.0F);
      }

      public bzv.a<T> d(float $$0) {
         return this.a(bzn.c, 0.0F, $$0, 0.0F);
      }

      public bzv.a<T> a(bzn $$0, float $$1, float $$2, float $$3) {
         this.l = this.l.a($$0, $$1, $$2, $$3);
         return this;
      }

      public bzv.a<T> a(bzn $$0, fis $$1) {
         this.l = this.l.a($$0, $$1);
         return this;
      }

      public bzv.a<T> a() {
         this.e = false;
         return this;
      }

      public bzv.a<T> b() {
         this.d = false;
         return this;
      }

      public bzv.a<T> c() {
         this.f = true;
         return this;
      }

      public bzv.a<T> a(dpz... $$0) {
         this.c = ImmutableSet.copyOf($$0);
         return this;
      }

      public bzv.a<T> d() {
         this.g = true;
         return this;
      }

      public bzv.a<T> a(int $$0) {
         this.h = $$0;
         return this;
      }

      public bzv.a<T> b(int $$0) {
         this.i = $$0;
         return this;
      }

      public bzv.a<T> a(cyb... $$0) {
         this.m = cyf.e.a($$0);
         return this;
      }

      public bzv.a<T> e() {
         this.n = alw.fixed(Optional.empty());
         return this;
      }

      public bzv<T> a(amd<bzv<?>> $$0) {
         if (this.d) {
            ag.a(blp.D, $$0.a().toString());
         }

         return new bzv<>(
            this.a, this.b, this.d, this.e, this.f, this.g, this.c, this.j.a(this.l), this.k, this.h, this.i, this.o.get($$0), this.n.get($$0), this.m
         );
      }
   }

   @FunctionalInterface
   public interface b<T extends bzm> {
      @Nullable
      T create(bzv<T> var1, dmu var2);
   }
}
