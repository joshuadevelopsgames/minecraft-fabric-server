import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import java.util.Locale;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

public class clt {
   public static final amd<cls> a = a("armorer");
   public static final amd<cls> b = a("butcher");
   public static final amd<cls> c = a("cartographer");
   public static final amd<cls> d = a("cleric");
   public static final amd<cls> e = a("farmer");
   public static final amd<cls> f = a("fisherman");
   public static final amd<cls> g = a("fletcher");
   public static final amd<cls> h = a("leatherworker");
   public static final amd<cls> i = a("librarian");
   public static final amd<cls> j = a("mason");
   public static final amd<cls> k = a("shepherd");
   public static final amd<cls> l = a("toolsmith");
   public static final amd<cls> m = a("weaponsmith");
   public static final amd<cls> n = a("home");
   public static final amd<cls> o = a("meeting");
   public static final amd<cls> p = a("beehive");
   public static final amd<cls> q = a("bee_nest");
   public static final amd<cls> r = a("nether_portal");
   public static final amd<cls> s = a("lodestone");
   public static final amd<cls> t = a("lightning_rod");
   public static final amd<cls> u = a("test_instance");
   private static final Set<eeb> v = ImmutableList.of(
         dqb.bu, dqb.bv, dqb.br, dqb.bs, dqb.bp, dqb.bn, dqb.bt, dqb.bj, dqb.bo, dqb.bl, dqb.bi, dqb.bh, new dpz[]{dqb.bm, dqb.bq, dqb.bg, dqb.bk}
      )
      .stream()
      .flatMap($$0 -> $$0.l().a().stream())
      .filter($$0 -> $$0.c(dps.b) == eeo.a)
      .collect(ImmutableSet.toImmutableSet());
   private static final Set<eeb> w = ImmutableList.of(dqb.fS, dqb.fU, dqb.fT, dqb.fV)
      .stream()
      .flatMap($$0 -> $$0.l().a().stream())
      .collect(ImmutableSet.toImmutableSet());
   private static final Map<eeb, jl<cls>> x = Maps.newHashMap();

   private static Set<eeb> a(dpz $$0) {
      return ImmutableSet.copyOf($$0.l().a());
   }

   private static amd<cls> a(String $$0) {
      return amd.a(mn.ad, ame.b($$0));
   }

   private static cls a(jy<cls> $$0, amd<cls> $$1, Set<eeb> $$2, int $$3, int $$4) {
      cls $$5 = new cls($$2, $$3, $$4);
      jy.a($$0, $$1, $$5);
      a($$0.b($$1), $$2);
      return $$5;
   }

   private static void a(jl<cls> $$0, Set<eeb> $$1) {
      $$1.forEach($$1x -> {
         jl<cls> $$2 = x.put($$1x, $$0);
         if ($$2 != null) {
            throw (IllegalStateException)ag.b(new IllegalStateException(String.format(Locale.ROOT, "%s is defined in more than one PoI type", $$1x)));
         }
      });
   }

   public static Optional<jl<cls>> a(eeb $$0) {
      return Optional.ofNullable(x.get($$0));
   }

   public static boolean b(eeb $$0) {
      return x.containsKey($$0);
   }

   public static cls a(jy<cls> $$0) {
      a($$0, a, a(dqb.oD), 1, 1);
      a($$0, b, a(dqb.oC), 1, 1);
      a($$0, c, a(dqb.oE), 1, 1);
      a($$0, d, a(dqb.fR), 1, 1);
      a($$0, e, a(dqb.pL), 1, 1);
      a($$0, f, a(dqb.oB), 1, 1);
      a($$0, g, a(dqb.oF), 1, 1);
      a($$0, h, w, 1, 1);
      a($$0, i, a(dqb.oH), 1, 1);
      a($$0, j, a(dqb.oJ), 1, 1);
      a($$0, k, a(dqb.oA), 1, 1);
      a($$0, l, a(dqb.oI), 1, 1);
      a($$0, m, a(dqb.oG), 1, 1);
      a($$0, n, v, 1, 1);
      a($$0, o, a(dqb.oK), 32, 6);
      a($$0, p, a(dqb.pO), 0, 1);
      a($$0, q, a(dqb.pN), 0, 1);
      a($$0, r, a(dqb.eu), 0, 1);
      a($$0, s, a(dqb.pZ), 0, 1);
      a($$0, u, a(dqb.pK), 0, 1);
      return a($$0, t, a(dqb.tb), 0, 1);
   }
}
