import com.mojang.serialization.MapCodec;

public class fgu {
   public static final fgt a = a("inverted", fgp.a);
   public static final fgt b = a("any_of", fgg.a);
   public static final fgt c = a("all_of", fgf.a);
   public static final fgt d = a("random_chance", fgx.a);
   public static final fgt e = a("random_chance_with_enchanted_bonus", fgy.a);
   public static final fgt f = a("entity_properties", fgv.a);
   public static final fgt g = a("killed_by_player", fgw.a);
   public static final fgt h = a("entity_scores", fgn.a);
   public static final fgt i = a("block_state_property", fgr.a);
   public static final fgt j = a("match_tool", fgz.a);
   public static final fgt k = a("table_bonus", fgh.a);
   public static final fgt l = a("survives_explosion", fgo.a);
   public static final fgt m = a("damage_source_properties", fgl.a);
   public static final fgt n = a("location_check", fgq.a);
   public static final fgt o = a("weather_check", fhc.a);
   public static final fgt p = a("reference", fgj.a);
   public static final fgt q = a("time_check", fha.a);
   public static final fgt r = a("value_check", fhb.a);
   public static final fgt s = a("enchantment_active_check", fgm.a);

   private static fgt a(String $$0, MapCodec<? extends fgs> $$1) {
      return jy.a(mm.F, ame.b($$0), new fgt($$1));
   }
}
