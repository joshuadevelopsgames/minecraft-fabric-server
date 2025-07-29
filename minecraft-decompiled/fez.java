import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.function.BiFunction;

public class fez {
   public static final BiFunction<dcv, fdj, dcv> a = ($$0, $$1) -> $$0;
   public static final Codec<fex> b = mm.E.q().dispatch("function", fex::b, fey::a);
   public static final Codec<fex> c = Codec.lazyInitialized(() -> Codec.withAlternative(b, ffb.b));
   public static final Codec<jl<fex>> d = ama.a(mn.bx, c);
   public static final fey<ffo> e = a("set_count", ffo.a);
   public static final fey<ffq> f = a("set_item", ffq.a);
   public static final fey<fen> g = a("enchant_with_levels", fen.a);
   public static final fey<fem> h = a("enchant_randomly", fem.a);
   public static final fey<ffk> i = a("set_enchantments", ffk.a);
   public static final fey<ffi> j = a("set_custom_data", ffi.a);
   public static final fey<fff> k = a("set_components", fff.a);
   public static final fey<ffy> l = a("furnace_smelt", ffy.a);
   public static final fey<feo> m = a("enchanted_count_increase", feo.b);
   public static final fey<ffp> n = a("set_damage", ffp.a);
   public static final fey<ffc> o = a("set_attributes", ffc.a);
   public static final fey<ffs> p = a("set_name", ffs.a);
   public static final fey<fep> q = a("exploration_map", fep.f);
   public static final fey<ffv> r = a("set_stew_effect", ffv.a);
   public static final fey<fel> s = a("copy_name", fel.a);
   public static final fey<ffg> t = a("set_contents", ffg.a);
   public static final fey<ffa> u = a("modify_contents", ffa.a);
   public static final fey<fer> v = a("filtered", fer.a);
   public static final fey<feu> w = a("limit_count", feu.a);
   public static final fey<feg> x = a("apply_bonus", feg.a);
   public static final fey<ffh> y = a("set_loot_table", ffh.a);
   public static final fey<feh> z = a("explosion_decay", feh.a);
   public static final fey<ffr> A = a("set_lore", ffr.a);
   public static final fey<feq> B = a("fill_player_head", feq.a);
   public static final fey<fek> C = a("copy_custom_data", fek.a);
   public static final fey<fei> D = a("copy_state", fei.a);
   public static final fey<ffd> E = a("set_banner_pattern", ffd.a);
   public static final fey<ffu> F = a("set_potion", ffu.a);
   public static final fey<ffn> G = a("set_instrument", ffn.a);
   public static final fey<fes> H = a("reference", fes.a);
   public static final fey<ffb> I = a("sequence", ffb.a);
   public static final fey<fej> J = a("copy_components", fej.a);
   public static final fey<ffm> K = a("set_fireworks", ffm.a);
   public static final fey<ffl> L = a("set_firework_explosion", ffl.a);
   public static final fey<ffe> M = a("set_book_cover", ffe.a);
   public static final fey<ffx> N = a("set_written_book_pages", ffx.a);
   public static final fey<ffw> O = a("set_writable_book_pages", ffw.a);
   public static final fey<ffz> P = a("toggle_tooltips", ffz.a);
   public static final fey<fft> Q = a("set_ominous_bottle_amplifier", fft.a);
   public static final fey<ffj> R = a("set_custom_model_data", ffj.a);

   private static <T extends fex> fey<T> a(String $$0, MapCodec<T> $$1) {
      return jy.a(mm.E, ame.b($$0), new fey<>($$1));
   }

   public static BiFunction<dcv, fdj, dcv> a(List<? extends BiFunction<dcv, fdj, dcv>> $$0) {
      List<BiFunction<dcv, fdj, dcv>> $$1 = List.copyOf($$0);

      return switch ($$1.size()) {
         case 0 -> a;
         case 1 -> (BiFunction)$$1.get(0);
         case 2 -> {
            BiFunction<dcv, fdj, dcv> $$2 = $$1.get(0);
            BiFunction<dcv, fdj, dcv> $$3 = $$1.get(1);
            yield ($$2x, $$3x) -> $$3.apply($$2.apply($$2x, $$3x), $$3x);
         }
         default -> ($$1x, $$2x) -> {
            for (BiFunction<dcv, fdj, dcv> $$3x : $$1) {
               $$1x = $$3x.apply($$1x, $$2x);
            }

            return $$1x;
         };
      };
   }
}
