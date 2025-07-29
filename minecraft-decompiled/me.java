import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.function.Function;

public class me {
   public static final mi a = a("angry_villager", false);
   public static final md<lw> b = a("block", false, lw::a, lw::b);
   public static final md<lw> c = a("block_marker", true, lw::a, lw::b);
   public static final mi d = a("bubble", false);
   public static final mi e = a("cloud", false);
   public static final mi f = a("crit", false);
   public static final mi g = a("damage_indicator", true);
   public static final mi h = a("dragon_breath", false);
   public static final mi i = a("dripping_lava", false);
   public static final mi j = a("falling_lava", false);
   public static final mi k = a("landing_lava", false);
   public static final mi l = a("dripping_water", false);
   public static final mi m = a("falling_water", false);
   public static final md<lz> n = a("dust", false, $$0 -> lz.c, $$0 -> lz.d);
   public static final md<ly> o = a("dust_color_transition", false, $$0 -> ly.c, $$0 -> ly.d);
   public static final mi p = a("effect", false);
   public static final mi q = a("elder_guardian", true);
   public static final mi r = a("enchanted_hit", false);
   public static final mi s = a("enchant", false);
   public static final mi t = a("end_rod", false);
   public static final md<lx> u = a("entity_effect", false, lx::a, lx::b);
   public static final mi v = a("explosion_emitter", true);
   public static final mi w = a("explosion", true);
   public static final mi x = a("gust", true);
   public static final mi y = a("small_gust", false);
   public static final mi z = a("gust_emitter_large", true);
   public static final mi A = a("gust_emitter_small", true);
   public static final mi B = a("sonic_boom", true);
   public static final md<lw> C = a("falling_dust", false, lw::a, lw::b);
   public static final mi D = a("firework", false);
   public static final mi E = a("fishing", false);
   public static final mi F = a("flame", false);
   public static final mi G = a("infested", false);
   public static final mi H = a("cherry_leaves", false);
   public static final mi I = a("pale_oak_leaves", false);
   public static final md<lx> J = a("tinted_leaves", false, lx::a, lx::b);
   public static final mi K = a("sculk_soul", false);
   public static final md<mg> L = a("sculk_charge", true, $$0 -> mg.a, $$0 -> mg.b);
   public static final mi M = a("sculk_charge_pop", true);
   public static final mi N = a("soul_fire_flame", false);
   public static final mi O = a("soul", false);
   public static final mi P = a("flash", false);
   public static final mi Q = a("happy_villager", false);
   public static final mi R = a("composter", false);
   public static final mi S = a("heart", false);
   public static final mi T = a("instant_effect", false);
   public static final md<ma> U = a("item", false, ma::a, ma::b);
   public static final md<mk> V = a("vibration", true, $$0 -> mk.a, $$0 -> mk.b);
   public static final md<mj> W = a("trail", false, $$0 -> mj.a, $$0 -> mj.b);
   public static final mi X = a("item_slime", false);
   public static final mi Y = a("item_cobweb", false);
   public static final mi Z = a("item_snowball", false);
   public static final mi aa = a("large_smoke", false);
   public static final mi ab = a("lava", false);
   public static final mi ac = a("mycelium", false);
   public static final mi ad = a("note", false);
   public static final mi ae = a("poof", true);
   public static final mi af = a("portal", false);
   public static final mi ag = a("rain", false);
   public static final mi ah = a("smoke", false);
   public static final mi ai = a("white_smoke", false);
   public static final mi aj = a("sneeze", false);
   public static final mi ak = a("spit", true);
   public static final mi al = a("squid_ink", true);
   public static final mi am = a("sweep_attack", true);
   public static final mi an = a("totem_of_undying", false);
   public static final mi ao = a("underwater", false);
   public static final mi ap = a("splash", false);
   public static final mi aq = a("witch", false);
   public static final mi ar = a("bubble_pop", false);
   public static final mi as = a("current_down", false);
   public static final mi at = a("bubble_column_up", false);
   public static final mi au = a("nautilus", false);
   public static final mi av = a("dolphin", false);
   public static final mi aw = a("campfire_cosy_smoke", true);
   public static final mi ax = a("campfire_signal_smoke", true);
   public static final mi ay = a("dripping_honey", false);
   public static final mi az = a("falling_honey", false);
   public static final mi aA = a("landing_honey", false);
   public static final mi aB = a("falling_nectar", false);
   public static final mi aC = a("falling_spore_blossom", false);
   public static final mi aD = a("ash", false);
   public static final mi aE = a("crimson_spore", false);
   public static final mi aF = a("warped_spore", false);
   public static final mi aG = a("spore_blossom_air", false);
   public static final mi aH = a("dripping_obsidian_tear", false);
   public static final mi aI = a("falling_obsidian_tear", false);
   public static final mi aJ = a("landing_obsidian_tear", false);
   public static final mi aK = a("reverse_portal", false);
   public static final mi aL = a("white_ash", false);
   public static final mi aM = a("small_flame", false);
   public static final mi aN = a("snowflake", false);
   public static final mi aO = a("dripping_dripstone_lava", false);
   public static final mi aP = a("falling_dripstone_lava", false);
   public static final mi aQ = a("dripping_dripstone_water", false);
   public static final mi aR = a("falling_dripstone_water", false);
   public static final mi aS = a("glow_squid_ink", true);
   public static final mi aT = a("glow", true);
   public static final mi aU = a("wax_on", true);
   public static final mi aV = a("wax_off", true);
   public static final mi aW = a("electric_spark", true);
   public static final mi aX = a("scrape", true);
   public static final md<mh> aY = a("shriek", false, $$0 -> mh.a, $$0 -> mh.b);
   public static final mi aZ = a("egg_crack", false);
   public static final mi ba = a("dust_plume", false);
   public static final mi bb = a("trial_spawner_detection", true);
   public static final mi bc = a("trial_spawner_detection_ominous", true);
   public static final mi bd = a("vault_connection", true);
   public static final md<lw> be = a("dust_pillar", false, lw::a, lw::b);
   public static final mi bf = a("ominous_spawning", true);
   public static final mi bg = a("raid_omen", false);
   public static final mi bh = a("trial_omen", false);
   public static final md<lw> bi = a("block_crumble", false, lw::a, lw::b);
   public static final mi bj = a("firefly", false);
   public static final Codec<mc> bk = mm.i.q().dispatch("type", mc::a, md::c);
   public static final zm<wx, mc> bl = zk.a(mn.ab).b(mc::a, md::d);

   private static mi a(String $$0, boolean $$1) {
      return jy.a(mm.i, $$0, new mi($$1));
   }

   private static <T extends mc> md<T> a(String $$0, boolean $$1, final Function<md<T>, MapCodec<T>> $$2, final Function<md<T>, zm<? super wx, T>> $$3) {
      return jy.a(mm.i, $$0, new md<T>($$1) {
         @Override
         public MapCodec<T> c() {
            return $$2.apply(this);
         }

         @Override
         public zm<? super wx, T> d() {
            return $$3.apply(this);
         }
      });
   }
}
