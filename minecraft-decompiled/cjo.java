import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.UUID;

public class cjo<U> {
   public static final cjo<Void> a = a("dummy");
   public static final cjo<jk> b = a("home", jk.b);
   public static final cjo<jk> c = a("job_site", jk.b);
   public static final cjo<jk> d = a("potential_job_site", jk.b);
   public static final cjo<jk> e = a("meeting_point", jk.b);
   public static final cjo<List<jk>> f = a("secondary_job_site");
   public static final cjo<List<cam>> g = a("mobs");
   public static final cjo<cjq> h = a("visible_mobs");
   public static final cjo<List<cam>> i = a("visible_villager_babies");
   public static final cjo<List<cut>> j = a("nearest_players");
   public static final cjo<cut> k = a("nearest_visible_player");
   public static final cjo<cut> l = a("nearest_visible_targetable_player");
   public static final cjo<List<cut>> m = a("nearest_visible_targetable_players");
   public static final cjo<cjr> n = a("walk_target");
   public static final cjo<cdr> o = a("look_target");
   public static final cjo<cam> p = a("attack_target");
   public static final cjo<Boolean> q = a("attack_cooling_down");
   public static final cjo<cam> r = a("interaction_target");
   public static final cjo<bzc> s = a("breed_target");
   public static final cjo<bzm> t = a("ride_target");
   public static final cjo<faz> u = a("path");
   public static final cjo<List<jk>> v = a("interactable_doors");
   public static final cjo<Set<jk>> w = a("doors_to_close");
   public static final cjo<jb> x = a("nearest_bed");
   public static final cjo<byb> y = a("hurt_by");
   public static final cjo<cam> z = a("hurt_by_entity");
   public static final cjo<cam> A = a("avoid_target");
   public static final cjo<cam> B = a("nearest_hostile");
   public static final cjo<cam> C = a("nearest_attackable");
   public static final cjo<jk> D = a("hiding_place");
   public static final cjo<Long> E = a("heard_bell_time");
   public static final cjo<Long> F = a("cant_reach_walk_target_since");
   public static final cjo<Boolean> G = a("golem_detected_recently", Codec.BOOL);
   public static final cjo<Boolean> H = a("danger_detected_recently", Codec.BOOL);
   public static final cjo<Long> I = a("last_slept", Codec.LONG);
   public static final cjo<Long> J = a("last_woken", Codec.LONG);
   public static final cjo<Long> K = a("last_worked_at_poi", Codec.LONG);
   public static final cjo<cam> L = a("nearest_visible_adult");
   public static final cjo<cqz> M = a("nearest_visible_wanted_item");
   public static final cjo<cao> N = a("nearest_visible_nemesis");
   public static final cjo<Integer> O = a("play_dead_ticks", Codec.INT);
   public static final cjo<cut> P = a("tempting_player");
   public static final cjo<Integer> Q = a("temptation_cooldown_ticks", Codec.INT);
   public static final cjo<Integer> R = a("gaze_cooldown_ticks", Codec.INT);
   public static final cjo<Boolean> S = a("is_tempted", Codec.BOOL);
   public static final cjo<Integer> T = a("long_jump_cooling_down", Codec.INT);
   public static final cjo<Boolean> U = a("long_jump_mid_jump");
   public static final cjo<Boolean> V = a("has_hunting_cooldown", Codec.BOOL);
   public static final cjo<Integer> W = a("ram_cooldown_ticks", Codec.INT);
   public static final cjo<fis> X = a("ram_target");
   public static final cjo<bdk> Y = a("is_in_water", bdk.b);
   public static final cjo<bdk> Z = a("is_pregnant", bdk.b);
   public static final cjo<Boolean> aa = a("is_panicking", Codec.BOOL);
   public static final cjo<List<UUID>> ab = a("unreachable_tongue_targets");
   public static final cjo<UUID> ac = a("angry_at", kf.a);
   public static final cjo<Boolean> ad = a("universal_anger", Codec.BOOL);
   public static final cjo<Boolean> ae = a("admiring_item", Codec.BOOL);
   public static final cjo<Integer> af = a("time_trying_to_reach_admire_item");
   public static final cjo<Boolean> ag = a("disable_walk_to_admire_item");
   public static final cjo<Boolean> ah = a("admiring_disabled", Codec.BOOL);
   public static final cjo<Boolean> ai = a("hunted_recently", Codec.BOOL);
   public static final cjo<jb> aj = a("celebrate_location");
   public static final cjo<Boolean> ak = a("dancing");
   public static final cjo<ctc> al = a("nearest_visible_huntable_hoglin");
   public static final cjo<ctc> am = a("nearest_visible_baby_hoglin");
   public static final cjo<cut> an = a("nearest_targetable_player_not_wearing_gold");
   public static final cjo<List<cth>> ao = a("nearby_adult_piglins");
   public static final cjo<List<cth>> ap = a("nearest_visible_adult_piglins");
   public static final cjo<List<ctc>> aq = a("nearest_visible_adult_hoglins");
   public static final cjo<cth> ar = a("nearest_visible_adult_piglin");
   public static final cjo<cam> as = a("nearest_visible_zombified");
   public static final cjo<Integer> at = a("visible_adult_piglin_count");
   public static final cjo<Integer> au = a("visible_adult_hoglin_count");
   public static final cjo<cut> av = a("nearest_player_holding_wanted_item");
   public static final cjo<Boolean> aw = a("ate_recently");
   public static final cjo<jb> ax = a("nearest_repellent");
   public static final cjo<Boolean> ay = a("pacified");
   public static final cjo<cam> az = a("roar_target");
   public static final cjo<jb> aA = a("disturbance_location");
   public static final cjo<bdk> aB = a("recent_projectile", bdk.b);
   public static final cjo<bdk> aC = a("is_sniffing", bdk.b);
   public static final cjo<bdk> aD = a("is_emerging", bdk.b);
   public static final cjo<bdk> aE = a("roar_sound_delay", bdk.b);
   public static final cjo<bdk> aF = a("dig_cooldown", bdk.b);
   public static final cjo<bdk> aG = a("roar_sound_cooldown", bdk.b);
   public static final cjo<bdk> aH = a("sniff_cooldown", bdk.b);
   public static final cjo<bdk> aI = a("touch_cooldown", bdk.b);
   public static final cjo<bdk> aJ = a("vibration_cooldown", bdk.b);
   public static final cjo<bdk> aK = a("sonic_boom_cooldown", bdk.b);
   public static final cjo<bdk> aL = a("sonic_boom_sound_cooldown", bdk.b);
   public static final cjo<bdk> aM = a("sonic_boom_sound_delay", bdk.b);
   public static final cjo<UUID> aN = a("liked_player", kf.a);
   public static final cjo<jk> aO = a("liked_noteblock", jk.b);
   public static final cjo<Integer> aP = a("liked_noteblock_cooldown_ticks", Codec.INT);
   public static final cjo<Integer> aQ = a("item_pickup_cooldown_ticks", Codec.INT);
   public static final cjo<List<jk>> aR = a("sniffer_explored_positions", Codec.list(jk.b));
   public static final cjo<jb> aS = a("sniffer_sniffing_target");
   public static final cjo<Boolean> aT = a("sniffer_digging");
   public static final cjo<Boolean> aU = a("sniffer_happy");
   public static final cjo<bdk> aV = a("breeze_jump_cooldown", bdk.b);
   public static final cjo<bdk> aW = a("breeze_shoot", bdk.b);
   public static final cjo<bdk> aX = a("breeze_shoot_charging", bdk.b);
   public static final cjo<bdk> aY = a("breeze_shoot_recover", bdk.b);
   public static final cjo<bdk> aZ = a("breeze_shoot_cooldown", bdk.b);
   public static final cjo<bdk> ba = a("breeze_jump_inhaling", bdk.b);
   public static final cjo<jb> bb = a("breeze_jump_target", jb.a);
   public static final cjo<bdk> bc = a("breeze_leaving_water", bdk.b);
   private final Optional<Codec<cjn<U>>> bd;

   @VisibleForTesting
   public cjo(Optional<Codec<U>> $$0) {
      this.bd = $$0.map(cjn::a);
   }

   @Override
   public String toString() {
      return mm.z.b(this).toString();
   }

   public Optional<Codec<cjn<U>>> a() {
      return this.bd;
   }

   private static <U> cjo<U> a(String $$0, Codec<U> $$1) {
      return jy.a(mm.z, ame.b($$0), new cjo<>(Optional.of($$1)));
   }

   private static <U> cjo<U> a(String $$0) {
      return jy.a(mm.z, ame.b($$0), new cjo<>(Optional.empty()));
   }
}
