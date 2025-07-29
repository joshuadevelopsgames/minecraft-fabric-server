import com.google.common.collect.Maps;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.arguments.BoolArgumentType;
import com.mojang.brigadier.arguments.DoubleArgumentType;
import com.mojang.brigadier.arguments.FloatArgumentType;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.arguments.LongArgumentType;
import com.mojang.brigadier.arguments.StringArgumentType;
import java.util.Locale;
import java.util.Map;

public class il {
   private static final Map<Class<?>, ik<?, ?>> a = Maps.newHashMap();

   private static <A extends ArgumentType<?>, T extends ik.a<A>> ik<A, T> a(jy<ik<?, ?>> $$0, String $$1, Class<? extends A> $$2, ik<A, T> $$3) {
      a.put($$2, $$3);
      return jy.a($$0, $$1, $$3);
   }

   public static ik<?, ?> a(jy<ik<?, ?>> $$0) {
      a($$0, "brigadier:bool", BoolArgumentType.class, in.a(BoolArgumentType::bool));
      a($$0, "brigadier:float", FloatArgumentType.class, new ir());
      a($$0, "brigadier:double", DoubleArgumentType.class, new iq());
      a($$0, "brigadier:integer", IntegerArgumentType.class, new is());
      a($$0, "brigadier:long", LongArgumentType.class, new iu());
      a($$0, "brigadier:string", StringArgumentType.class, new iv());
      a($$0, "entity", ey.class, new ey.a());
      a($$0, "game_profile", fa.class, in.a(fa::a));
      a($$0, "block_pos", gk.class, in.a(gk::a));
      a($$0, "column_pos", gl.class, in.a(gl::a));
      a($$0, "vec3", gr.class, in.a(gr::a));
      a($$0, "vec2", gq.class, in.a(gq::a));
      a($$0, "block_state", gh.class, in.a(gh::a));
      a($$0, "block_predicate", gg.class, in.a(gg::a));
      a($$0, "item_stack", gx.class, in.a(gx::a));
      a($$0, "item_predicate", ha.class, in.a(ha::a));
      a($$0, "color", et.class, in.a(et::a));
      a($$0, "hex_color", fc.class, in.a(fc::a));
      a($$0, "component", eu.class, in.a(eu::a));
      a($$0, "style", fy.class, in.a(fy::a));
      a($$0, "message", fd.class, in.a(fd::a));
      a($$0, "nbt_compound_tag", ev.class, in.a(ev::a));
      a($$0, "nbt_tag", ff.class, in.a(ff::a));
      a($$0, "nbt_path", fe.class, in.a(fe::a));
      a($$0, "objective", fg.class, in.a(fg::a));
      a($$0, "objective_criteria", fh.class, in.a(fh::a));
      a($$0, "operation", fi.class, in.a(fi::a));
      a($$0, "particle", fj.class, in.a(fj::a));
      a($$0, "angle", er.class, in.a(er::a));
      a($$0, "rotation", go.class, in.a(go::a));
      a($$0, "scoreboard_slot", ft.class, in.a(ft::a));
      a($$0, "score_holder", fs.class, new fs.a());
      a($$0, "swizzle", gp.class, in.a(gp::a));
      a($$0, "team", fz.class, in.a(fz::a));
      a($$0, "item_slot", fv.class, in.a(fv::a));
      a($$0, "item_slots", fw.class, in.a(fw::a));
      a($$0, "resource_location", fn.class, in.a(fn::a));
      a($$0, "function", gw.class, in.a(gw::a));
      a($$0, "entity_anchor", ex.class, in.a(ex::a));
      a($$0, "int_range", fk.b.class, in.a(fk::a));
      a($$0, "float_range", fk.a.class, in.a(fk::b));
      a($$0, "dimension", ew.class, in.a(ew::a));
      a($$0, "gamemode", ez.class, in.a(ez::a));
      a($$0, "time", gc.class, new gc.a());
      a($$0, "resource_or_tag", b(fp.class), new fp.a());
      a($$0, "resource_or_tag_key", b(fq.class), new fq.a());
      a($$0, "resource", b(fl.class), new fl.a());
      a($$0, "resource_key", b(fm.class), new fm.a());
      a($$0, "resource_selector", b(fr.class), new fr.a());
      a($$0, "template_mirror", ga.class, in.a(ga::a));
      a($$0, "template_rotation", gb.class, in.a(gb::a));
      a($$0, "heightmap", fb.class, in.a(fb::a));
      a($$0, "loot_table", fo.e.class, in.a(fo::a));
      a($$0, "loot_predicate", fo.d.class, in.a(fo::c));
      a($$0, "loot_modifier", fo.c.class, in.a(fo::b));
      a($$0, "dialog", fo.a.class, in.a(fo::d));
      return a($$0, "uuid", gd.class, in.a(gd::a));
   }

   private static <T extends ArgumentType<?>> Class<T> b(Class<? super T> $$0) {
      return (Class<T>)$$0;
   }

   public static boolean a(Class<?> $$0) {
      return a.containsKey($$0);
   }

   public static <A extends ArgumentType<?>> ik<A, ?> a(A $$0) {
      ik<?, ?> $$1 = a.get($$0.getClass());
      if ($$1 == null) {
         throw new IllegalArgumentException(String.format(Locale.ROOT, "Unrecognized argument type %s (%s)", $$0, $$0.getClass()));
      } else {
         return (ik<A, ?>)$$1;
      }
   }

   public static <A extends ArgumentType<?>> ik.a<A> b(A $$0) {
      return a($$0).a($$0);
   }
}
