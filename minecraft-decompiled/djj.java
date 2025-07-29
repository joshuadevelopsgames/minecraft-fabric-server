import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.UnaryOperator;

public interface djj {
   Codec<kp<?>> a = Codec.lazyInitialized(() -> mm.aq.q());
   Codec<kn> b = kn.a(a);
   kp<List<djf<dkb>>> c = a("damage_protection", $$0 -> $$0.a(djf.a(dkb.b, fgc.t).listOf()));
   kp<List<djf<djx>>> d = a("damage_immunity", $$0 -> $$0.a(djf.a(djx.b, fgc.t).listOf()));
   kp<List<djf<dkb>>> e = a("damage", $$0 -> $$0.a(djf.a(dkb.b, fgc.t).listOf()));
   kp<List<djf<dkb>>> f = a("smash_damage_per_fallen_block", $$0 -> $$0.a(djf.a(dkb.b, fgc.t).listOf()));
   kp<List<djf<dkb>>> g = a("knockback", $$0 -> $$0.a(djf.a(dkb.b, fgc.t).listOf()));
   kp<List<djf<dkb>>> h = a("armor_effectiveness", $$0 -> $$0.a(djf.a(dkb.b, fgc.t).listOf()));
   kp<List<djr<djz>>> i = a("post_attack", $$0 -> $$0.a(djr.a(djz.b, fgc.t).listOf()));
   kp<List<djf<djz>>> j = a("hit_block", $$0 -> $$0.a(djf.a(djz.b, fgc.x).listOf()));
   kp<List<djf<dkb>>> k = a("item_damage", $$0 -> $$0.a(djf.a(dkb.b, fgc.u).listOf()));
   kp<List<djy>> l = a("attributes", $$0 -> $$0.a(djy.a.codec().listOf()));
   kp<List<djr<dkb>>> m = a("equipment_drops", $$0 -> $$0.a(djr.b(dkb.b, fgc.t).listOf()));
   kp<List<djf<dka>>> n = a("location_changed", $$0 -> $$0.a(djf.a(dka.c, fgc.v).listOf()));
   kp<List<djf<djz>>> o = a("tick", $$0 -> $$0.a(djf.a(djz.b, fgc.w).listOf()));
   kp<List<djf<dkb>>> p = a("ammo_use", $$0 -> $$0.a(djf.a(dkb.b, fgc.u).listOf()));
   kp<List<djf<dkb>>> q = a("projectile_piercing", $$0 -> $$0.a(djf.a(dkb.b, fgc.u).listOf()));
   kp<List<djf<djz>>> r = a("projectile_spawned", $$0 -> $$0.a(djf.a(djz.b, fgc.w).listOf()));
   kp<List<djf<dkb>>> s = a("projectile_spread", $$0 -> $$0.a(djf.a(dkb.b, fgc.w).listOf()));
   kp<List<djf<dkb>>> t = a("projectile_count", $$0 -> $$0.a(djf.a(dkb.b, fgc.w).listOf()));
   kp<List<djf<dkb>>> u = a("trident_return_acceleration", $$0 -> $$0.a(djf.a(dkb.b, fgc.w).listOf()));
   kp<List<djf<dkb>>> v = a("fishing_time_reduction", $$0 -> $$0.a(djf.a(dkb.b, fgc.w).listOf()));
   kp<List<djf<dkb>>> w = a("fishing_luck_bonus", $$0 -> $$0.a(djf.a(dkb.b, fgc.w).listOf()));
   kp<List<djf<dkb>>> x = a("block_experience", $$0 -> $$0.a(djf.a(dkb.b, fgc.u).listOf()));
   kp<List<djf<dkb>>> y = a("mob_experience", $$0 -> $$0.a(djf.a(dkb.b, fgc.w).listOf()));
   kp<List<djf<dkb>>> z = a("repair_with_xp", $$0 -> $$0.a(djf.a(dkb.b, fgc.u).listOf()));
   kp<dkb> A = a("crossbow_charge_time", $$0 -> $$0.a(dkb.b));
   kp<List<dbo.b>> B = a("crossbow_charging_sounds", $$0 -> $$0.a(dbo.b.a.listOf()));
   kp<List<jl<ayy>>> C = a("trident_sound", $$0 -> $$0.a(ayy.b.listOf()));
   kp<bdk> D = a("prevent_equipment_drop", $$0 -> $$0.a(bdk.b));
   kp<bdk> E = a("prevent_armor_change", $$0 -> $$0.a(bdk.b));
   kp<dkb> F = a("trident_spin_attack_strength", $$0 -> $$0.a(dkb.b));

   static kp<?> a(jy<kp<?>> $$0) {
      return c;
   }

   private static <T> kp<T> a(String $$0, UnaryOperator<kp.a<T>> $$1) {
      return jy.a(mm.aq, $$0, $$1.apply(kp.a()).b());
   }
}
