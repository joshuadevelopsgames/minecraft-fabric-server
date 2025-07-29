import java.util.Optional;
import java.util.stream.IntStream;

public class fwq {
   public static final fwp a = a("cube", fws.c, fws.j, fws.k, fws.l, fws.m, fws.n, fws.o);
   public static final fwp b = a("cube_directional", fws.c, fws.j, fws.k, fws.l, fws.m, fws.n, fws.o);
   public static final fwp c = a("cube_all", fws.a);
   public static final fwp d = a("cube_all_inner_faces", fws.a);
   public static final fwp e = b("cube_mirrored_all", "_mirrored", fws.a);
   public static final fwp f = b("cube_north_west_mirrored_all", "_north_west_mirrored", fws.a);
   public static final fwp g = b("cube_column_uv_locked_x", "_x", fws.d, fws.i);
   public static final fwp h = b("cube_column_uv_locked_y", "_y", fws.d, fws.i);
   public static final fwp i = b("cube_column_uv_locked_z", "_z", fws.d, fws.i);
   public static final fwp j = a("cube_column", fws.d, fws.i);
   public static final fwp k = b("cube_column_horizontal", "_horizontal", fws.d, fws.i);
   public static final fwp l = b("cube_column_mirrored", "_mirrored", fws.d, fws.i);
   public static final fwp m = a("cube_top", fws.f, fws.i);
   public static final fwp n = a("cube_bottom_top", fws.f, fws.e, fws.i);
   public static final fwp o = a("cube_bottom_top_inner_faces", fws.f, fws.e, fws.i);
   public static final fwp p = a("orientable", fws.f, fws.g, fws.i);
   public static final fwp q = a("orientable_with_bottom", fws.f, fws.e, fws.i, fws.g);
   public static final fwp r = b("orientable_vertical", "_vertical", fws.g, fws.i);
   public static final fwp s = a("button", fws.b);
   public static final fwp t = b("button_pressed", "_pressed", fws.b);
   public static final fwp u = b("button_inventory", "_inventory", fws.b);
   public static final fwp v = b("door_bottom_left", "_bottom_left", fws.f, fws.e);
   public static final fwp w = b("door_bottom_left_open", "_bottom_left_open", fws.f, fws.e);
   public static final fwp x = b("door_bottom_right", "_bottom_right", fws.f, fws.e);
   public static final fwp y = b("door_bottom_right_open", "_bottom_right_open", fws.f, fws.e);
   public static final fwp z = b("door_top_left", "_top_left", fws.f, fws.e);
   public static final fwp A = b("door_top_left_open", "_top_left_open", fws.f, fws.e);
   public static final fwp B = b("door_top_right", "_top_right", fws.f, fws.e);
   public static final fwp C = b("door_top_right_open", "_top_right_open", fws.f, fws.e);
   public static final fwp D = b("custom_fence_post", "_post", fws.b, fws.c);
   public static final fwp E = b("custom_fence_side_north", "_side_north", fws.b);
   public static final fwp F = b("custom_fence_side_east", "_side_east", fws.b);
   public static final fwp G = b("custom_fence_side_south", "_side_south", fws.b);
   public static final fwp H = b("custom_fence_side_west", "_side_west", fws.b);
   public static final fwp I = b("custom_fence_inventory", "_inventory", fws.b);
   public static final fwp J = b("fence_post", "_post", fws.b);
   public static final fwp K = b("fence_side", "_side", fws.b);
   public static final fwp L = b("fence_inventory", "_inventory", fws.b);
   public static final fwp M = b("template_wall_post", "_post", fws.s);
   public static final fwp N = b("template_wall_side", "_side", fws.s);
   public static final fwp O = b("template_wall_side_tall", "_side_tall", fws.s);
   public static final fwp P = b("wall_inventory", "_inventory", fws.s);
   public static final fwp Q = a("template_custom_fence_gate", fws.b, fws.c);
   public static final fwp R = b("template_custom_fence_gate_open", "_open", fws.b, fws.c);
   public static final fwp S = b("template_custom_fence_gate_wall", "_wall", fws.b, fws.c);
   public static final fwp T = b("template_custom_fence_gate_wall_open", "_wall_open", fws.b, fws.c);
   public static final fwp U = a("template_fence_gate", fws.b);
   public static final fwp V = b("template_fence_gate_open", "_open", fws.b);
   public static final fwp W = b("template_fence_gate_wall", "_wall", fws.b);
   public static final fwp X = b("template_fence_gate_wall_open", "_wall_open", fws.b);
   public static final fwp Y = a("pressure_plate_up", fws.b);
   public static final fwp Z = b("pressure_plate_down", "_down", fws.b);
   public static final fwp aa = a(fws.c);
   public static final fwp ab = a("slab", fws.e, fws.f, fws.i);
   public static final fwp ac = b("slab_top", "_top", fws.e, fws.f, fws.i);
   public static final fwp ad = a("leaves", fws.a);
   public static final fwp ae = a("stairs", fws.e, fws.f, fws.i);
   public static final fwp af = b("inner_stairs", "_inner", fws.e, fws.f, fws.i);
   public static final fwp ag = b("outer_stairs", "_outer", fws.e, fws.f, fws.i);
   public static final fwp ah = b("template_trapdoor_top", "_top", fws.b);
   public static final fwp ai = b("template_trapdoor_bottom", "_bottom", fws.b);
   public static final fwp aj = b("template_trapdoor_open", "_open", fws.b);
   public static final fwp ak = b("template_orientable_trapdoor_top", "_top", fws.b);
   public static final fwp al = b("template_orientable_trapdoor_bottom", "_bottom", fws.b);
   public static final fwp am = b("template_orientable_trapdoor_open", "_open", fws.b);
   public static final fwp an = a("pointed_dripstone", fws.p);
   public static final fwp ao = a("cross", fws.p);
   public static final fwp ap = a("tinted_cross", fws.p);
   public static final fwp aq = a("cross_emissive", fws.p, fws.q);
   public static final fwp ar = a("flower_pot_cross", fws.r);
   public static final fwp as = a("tinted_flower_pot_cross", fws.r);
   public static final fwp at = a("flower_pot_cross_emissive", fws.r, fws.q);
   public static final fwp au = a("rail_flat", fws.t);
   public static final fwp av = b("rail_curved", "_corner", fws.t);
   public static final fwp aw = b("template_rail_raised_ne", "_raised_ne", fws.t);
   public static final fwp ax = b("template_rail_raised_sw", "_raised_sw", fws.t);
   public static final fwp ay = a("carpet", fws.u);
   public static final fwp az = a("mossy_carpet_side", fws.i);
   public static final fwp aA = b("flowerbed_1", "_1", fws.Q, fws.z);
   public static final fwp aB = b("flowerbed_2", "_2", fws.Q, fws.z);
   public static final fwp aC = b("flowerbed_3", "_3", fws.Q, fws.z);
   public static final fwp aD = b("flowerbed_4", "_4", fws.Q, fws.z);
   public static final fwp aE = b("template_leaf_litter_1", "_1", fws.b);
   public static final fwp aF = b("template_leaf_litter_2", "_2", fws.b);
   public static final fwp aG = b("template_leaf_litter_3", "_3", fws.b);
   public static final fwp aH = b("template_leaf_litter_4", "_4", fws.b);
   public static final fwp aI = a("coral_fan", fws.y);
   public static final fwp aJ = a("coral_wall_fan", fws.y);
   public static final fwp aK = a("template_glazed_terracotta", fws.v);
   public static final fwp aL = a("template_chorus_flower", fws.b);
   public static final fwp aM = a("template_daylight_detector", fws.f, fws.i);
   public static final fwp aN = b("template_glass_pane_noside", "_noside", fws.w);
   public static final fwp aO = b("template_glass_pane_noside_alt", "_noside_alt", fws.w);
   public static final fwp aP = b("template_glass_pane_post", "_post", fws.w, fws.x);
   public static final fwp aQ = b("template_glass_pane_side", "_side", fws.w, fws.x);
   public static final fwp aR = b("template_glass_pane_side_alt", "_side_alt", fws.w, fws.x);
   public static final fwp aS = a("template_command_block", fws.g, fws.h, fws.i);
   public static final fwp aT = b("template_chiseled_bookshelf_slot_top_left", "_slot_top_left", fws.b);
   public static final fwp aU = b("template_chiseled_bookshelf_slot_top_mid", "_slot_top_mid", fws.b);
   public static final fwp aV = b("template_chiseled_bookshelf_slot_top_right", "_slot_top_right", fws.b);
   public static final fwp aW = b("template_chiseled_bookshelf_slot_bottom_left", "_slot_bottom_left", fws.b);
   public static final fwp aX = b("template_chiseled_bookshelf_slot_bottom_mid", "_slot_bottom_mid", fws.b);
   public static final fwp aY = b("template_chiseled_bookshelf_slot_bottom_right", "_slot_bottom_right", fws.b);
   public static final fwp aZ = a("template_anvil", fws.f);
   public static final fwp[] ba = IntStream.range(0, 8).mapToObj($$0 -> b("stem_growth" + $$0, "_stage" + $$0, fws.z)).toArray(fwp[]::new);
   public static final fwp bb = a("stem_fruit", fws.z, fws.A);
   public static final fwp bc = a("crop", fws.B);
   public static final fwp bd = a("template_farmland", fws.C, fws.f);
   public static final fwp be = a("template_fire_floor", fws.D);
   public static final fwp bf = a("template_fire_side", fws.D);
   public static final fwp bg = a("template_fire_side_alt", fws.D);
   public static final fwp bh = a("template_fire_up", fws.D);
   public static final fwp bi = a("template_fire_up_alt", fws.D);
   public static final fwp bj = a("template_campfire", fws.D, fws.L);
   public static final fwp bk = a("template_lantern", fws.E);
   public static final fwp bl = b("template_hanging_lantern", "_hanging", fws.E);
   public static final fwp bm = a("template_torch", fws.H);
   public static final fwp bn = a("template_torch_unlit", fws.H);
   public static final fwp bo = a("template_torch_wall", fws.H);
   public static final fwp bp = a("template_torch_wall_unlit", fws.H);
   public static final fwp bq = a("template_redstone_torch", fws.H);
   public static final fwp br = a("template_redstone_torch_wall", fws.H);
   public static final fwp bs = a("template_piston", fws.F, fws.e, fws.i);
   public static final fwp bt = a("template_piston_head", fws.F, fws.i, fws.G);
   public static final fwp bu = a("template_piston_head_short", fws.F, fws.i, fws.G);
   public static final fwp bv = a("template_seagrass", fws.b);
   public static final fwp bw = a("template_turtle_egg", fws.a);
   public static final fwp bx = a("dried_ghast", fws.c, fws.f, fws.e, fws.j, fws.k, fws.l, fws.m, fws.R);
   public static final fwp by = a("template_two_turtle_eggs", fws.a);
   public static final fwp bz = a("template_three_turtle_eggs", fws.a);
   public static final fwp bA = a("template_four_turtle_eggs", fws.a);
   public static final fwp bB = a("template_single_face", fws.b);
   public static final fwp bC = a("template_cauldron_level1", fws.O, fws.N, fws.c, fws.f, fws.e, fws.i);
   public static final fwp bD = a("template_cauldron_level2", fws.O, fws.N, fws.c, fws.f, fws.e, fws.i);
   public static final fwp bE = a("template_cauldron_full", fws.O, fws.N, fws.c, fws.f, fws.e, fws.i);
   public static final fwp bF = a("template_azalea", fws.f, fws.i);
   public static final fwp bG = a("template_potted_azalea_bush", fws.r, fws.f, fws.i);
   public static final fwp bH = a("template_potted_azalea_bush", fws.r, fws.f, fws.i);
   public static final fwp bI = a("sniffer_egg", fws.f, fws.e, fws.j, fws.k, fws.l, fws.m);
   public static final fwp bJ = b("generated", fws.I);
   public static final fwp bK = b("template_music_disc", fws.I);
   public static final fwp bL = b("handheld", fws.I);
   public static final fwp bM = b("handheld_rod", fws.I);
   public static final fwp bN = b("generated", fws.I, fws.J);
   public static final fwp bO = b("generated", fws.I, fws.J, fws.K);
   public static final fwp bP = b("template_shulker_box", fws.c);
   public static final fwp bQ = b("template_bed", fws.c);
   public static final fwp bR = b("template_chest", fws.c);
   public static final fwp bS = a("template_bundle_open_front", "_open_front", fws.I);
   public static final fwp bT = a("template_bundle_open_back", "_open_back", fws.I);
   public static final fwp bU = b("bow", fws.I);
   public static final fwp bV = b("crossbow", fws.I);
   public static final fwp bW = a("template_candle", fws.a, fws.c);
   public static final fwp bX = a("template_two_candles", fws.a, fws.c);
   public static final fwp bY = a("template_three_candles", fws.a, fws.c);
   public static final fwp bZ = a("template_four_candles", fws.a, fws.c);
   public static final fwp ca = a("template_cake_with_candle", fws.M, fws.e, fws.i, fws.f, fws.c);
   public static final fwp cb = a("template_sculk_shrieker", fws.e, fws.i, fws.f, fws.c, fws.P);
   public static final fwp cc = a("template_vault", fws.f, fws.e, fws.i, fws.g);
   public static final fwp cd = b("handheld_mace", fws.I);

   private static fwp a(fws... $$0) {
      return new fwp(Optional.empty(), Optional.empty(), $$0);
   }

   private static fwp a(String $$0, fws... $$1) {
      return new fwp(Optional.of(ame.b("block/" + $$0)), Optional.empty(), $$1);
   }

   private static fwp b(String $$0, fws... $$1) {
      return new fwp(Optional.of(ame.b("item/" + $$0)), Optional.empty(), $$1);
   }

   private static fwp a(String $$0, String $$1, fws... $$2) {
      return new fwp(Optional.of(ame.b("item/" + $$0)), Optional.of($$1), $$2);
   }

   private static fwp b(String $$0, String $$1, fws... $$2) {
      return new fwp(Optional.of(ame.b("block/" + $$0)), Optional.of($$1), $$2);
   }
}
