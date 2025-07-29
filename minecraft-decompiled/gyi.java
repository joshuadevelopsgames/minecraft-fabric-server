import com.google.common.collect.ImmutableList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class gyi {
   public static final ame a = ame.b("textures/atlas/shulker_boxes.png");
   public static final ame b = ame.b("textures/atlas/beds.png");
   public static final ame c = ame.b("textures/atlas/banner_patterns.png");
   public static final ame d = ame.b("textures/atlas/shield_patterns.png");
   public static final ame e = ame.b("textures/atlas/signs.png");
   public static final ame f = ame.b("textures/atlas/chest.png");
   public static final ame g = ame.b("textures/atlas/armor_trims.png");
   public static final ame h = ame.b("textures/atlas/decorated_pot.png");
   private static final gxz L = gxz.g(a);
   private static final gxz M = gxz.d(b);
   private static final gxz N = gxz.n(c);
   private static final gxz O = gxz.n(d);
   private static final gxz P = gxz.g(e);
   private static final gxz Q = gxz.f(f);
   private static final gxz R = gxz.a(g);
   private static final gxz S = gxz.b(g);
   private static final gxz T = gxz.d(hrr.c);
   private static final gxz U = gxz.f(hrr.c);
   private static final gxz V = gxz.i(hrr.c);
   public static final gxm i = new gxm(hrr.c, "item");
   public static final gxm j = new gxm(hrr.c, "block");
   public static final gxm k = new gxm(c, "entity/banner");
   public static final gxm l = new gxm(d, "entity/shield");
   public static final gxm m = new gxm(f, "entity/chest");
   public static final gxm n = new gxm(h, "entity/decorated_pot");
   public static final gxm o = new gxm(b, "entity/bed");
   public static final gxm p = new gxm(a, "entity/shulker");
   public static final gxm q = new gxm(e, "entity/signs");
   public static final gxm r = new gxm(e, "entity/signs/hanging");
   public static final hua s = p.a("shulker");
   public static final List<hua> t = Arrays.stream(dbt.values()).sorted(Comparator.comparingInt(dbt::a)).map(gyi::f).collect(ImmutableList.toImmutableList());
   public static final Map<efp, hua> u = efp.a().collect(Collectors.toMap(Function.identity(), gyi::c));
   public static final Map<efp, hua> v = efp.a().collect(Collectors.toMap(Function.identity(), gyi::d));
   public static final hua w = k.a("base");
   public static final hua x = l.a("base");
   private static final Map<ame, hua> W = new HashMap<>();
   private static final Map<ame, hua> X = new HashMap<>();
   public static final Map<amd<ebs>, hua> y = mm.ai.c().collect(Collectors.toMap(jl.c::h, $$0 -> n.a($$0.a().a())));
   public static final hua z = n.a("decorated_pot_base");
   public static final hua A = n.a("decorated_pot_side");
   private static final hua[] Y = Arrays.stream(dbt.values()).sorted(Comparator.comparingInt(dbt::a)).map(gyi::c).toArray(hua[]::new);
   public static final hua B = m.a("trapped");
   public static final hua C = m.a("trapped_left");
   public static final hua D = m.a("trapped_right");
   public static final hua E = m.a("christmas");
   public static final hua F = m.a("christmas_left");
   public static final hua G = m.a("christmas_right");
   public static final hua H = m.a("normal");
   public static final hua I = m.a("normal_left");
   public static final hua J = m.a("normal_right");
   public static final hua K = m.a("ender");

   public static gxz a() {
      return N;
   }

   public static gxz b() {
      return O;
   }

   public static gxz c() {
      return M;
   }

   public static gxz d() {
      return L;
   }

   public static gxz e() {
      return P;
   }

   public static gxz f() {
      return P;
   }

   public static gxz g() {
      return Q;
   }

   public static gxz a(boolean $$0) {
      return $$0 ? S : R;
   }

   public static gxz h() {
      return T;
   }

   public static gxz i() {
      return U;
   }

   public static gxz j() {
      return V;
   }

   public static hua a(dbt $$0) {
      return Y[$$0.a()];
   }

   public static ame b(dbt $$0) {
      return ame.b($$0.b());
   }

   public static hua c(dbt $$0) {
      return o.a(b($$0));
   }

   public static hua d(dbt $$0) {
      return t.get($$0.a());
   }

   public static ame e(dbt $$0) {
      return ame.b("shulker_" + $$0.b());
   }

   public static hua f(dbt $$0) {
      return p.a(e($$0));
   }

   private static hua c(efp $$0) {
      return q.a($$0.b());
   }

   private static hua d(efp $$0) {
      return r.a($$0.b());
   }

   public static hua a(efp $$0) {
      return u.get($$0);
   }

   public static hua b(efp $$0) {
      return v.get($$0);
   }

   public static hua a(jl<eao> $$0) {
      return W.computeIfAbsent($$0.a().a(), k::a);
   }

   public static hua b(jl<eao> $$0) {
      return X.computeIfAbsent($$0.a().a(), l::a);
   }

   @Nullable
   public static hua a(@Nullable amd<ebs> $$0) {
      return $$0 == null ? null : y.get($$0);
   }

   public static hua a(eaz $$0, eet $$1, boolean $$2) {
      if ($$0 instanceof ebx) {
         return K;
      } else if ($$2) {
         return a($$1, E, F, G);
      } else {
         return $$0 instanceof ecy ? a($$1, B, C, D) : a($$1, H, I, J);
      }
   }

   private static hua a(eet $$0, hua $$1, hua $$2, hua $$3) {
      switch ($$0) {
         case b:
            return $$2;
         case c:
            return $$3;
         case a:
         default:
            return $$1;
      }
   }
}
