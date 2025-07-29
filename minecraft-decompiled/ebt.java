import java.util.Map;
import javax.annotation.Nullable;

public class ebt {
   public static final amd<ebs> a = a("blank");
   public static final amd<ebs> b = a("angler");
   public static final amd<ebs> c = a("archer");
   public static final amd<ebs> d = a("arms_up");
   public static final amd<ebs> e = a("blade");
   public static final amd<ebs> f = a("brewer");
   public static final amd<ebs> g = a("burn");
   public static final amd<ebs> h = a("danger");
   public static final amd<ebs> i = a("explorer");
   public static final amd<ebs> j = a("flow");
   public static final amd<ebs> k = a("friend");
   public static final amd<ebs> l = a("guster");
   public static final amd<ebs> m = a("heart");
   public static final amd<ebs> n = a("heartbreak");
   public static final amd<ebs> o = a("howl");
   public static final amd<ebs> p = a("miner");
   public static final amd<ebs> q = a("mourner");
   public static final amd<ebs> r = a("plenty");
   public static final amd<ebs> s = a("prize");
   public static final amd<ebs> t = a("scrape");
   public static final amd<ebs> u = a("sheaf");
   public static final amd<ebs> v = a("shelter");
   public static final amd<ebs> w = a("skull");
   public static final amd<ebs> x = a("snort");
   private static final Map<dcr, amd<ebs>> y = Map.ofEntries(
      Map.entry(dcz.rS, a),
      Map.entry(dcz.zu, b),
      Map.entry(dcz.zv, c),
      Map.entry(dcz.zw, d),
      Map.entry(dcz.zx, e),
      Map.entry(dcz.zy, f),
      Map.entry(dcz.zz, g),
      Map.entry(dcz.zA, h),
      Map.entry(dcz.zB, i),
      Map.entry(dcz.zC, j),
      Map.entry(dcz.zD, k),
      Map.entry(dcz.zE, l),
      Map.entry(dcz.zF, m),
      Map.entry(dcz.zG, n),
      Map.entry(dcz.zH, o),
      Map.entry(dcz.zI, p),
      Map.entry(dcz.zJ, q),
      Map.entry(dcz.zK, r),
      Map.entry(dcz.zL, s),
      Map.entry(dcz.zM, t),
      Map.entry(dcz.zN, u),
      Map.entry(dcz.zO, v),
      Map.entry(dcz.zP, w),
      Map.entry(dcz.zQ, x)
   );

   @Nullable
   public static amd<ebs> a(dcr $$0) {
      return y.get($$0);
   }

   private static amd<ebs> a(String $$0) {
      return amd.a(mn.s, ame.b($$0));
   }

   public static ebs a(jy<ebs> $$0) {
      a($$0, b, "angler_pottery_pattern");
      a($$0, c, "archer_pottery_pattern");
      a($$0, d, "arms_up_pottery_pattern");
      a($$0, e, "blade_pottery_pattern");
      a($$0, f, "brewer_pottery_pattern");
      a($$0, g, "burn_pottery_pattern");
      a($$0, h, "danger_pottery_pattern");
      a($$0, i, "explorer_pottery_pattern");
      a($$0, j, "flow_pottery_pattern");
      a($$0, k, "friend_pottery_pattern");
      a($$0, l, "guster_pottery_pattern");
      a($$0, m, "heart_pottery_pattern");
      a($$0, n, "heartbreak_pottery_pattern");
      a($$0, o, "howl_pottery_pattern");
      a($$0, p, "miner_pottery_pattern");
      a($$0, q, "mourner_pottery_pattern");
      a($$0, r, "plenty_pottery_pattern");
      a($$0, s, "prize_pottery_pattern");
      a($$0, t, "scrape_pottery_pattern");
      a($$0, u, "sheaf_pottery_pattern");
      a($$0, v, "shelter_pottery_pattern");
      a($$0, w, "skull_pottery_pattern");
      a($$0, x, "snort_pottery_pattern");
      return a($$0, a, "decorated_pot_side");
   }

   private static ebs a(jy<ebs> $$0, amd<ebs> $$1, String $$2) {
      return jy.a($$0, $$1, new ebs(ame.b($$2)));
   }
}
