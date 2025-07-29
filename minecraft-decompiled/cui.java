import com.google.common.collect.ImmutableSet;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public record cui(xo q, Predicate<jl<cls>> r, Predicate<jl<cls>> s, ImmutableSet<dcr> t, ImmutableSet<dpz> u, @Nullable ayy v) {
   public static final Predicate<jl<cls>> a = $$0 -> $$0.a(azz.a);
   public static final amd<cui> b = a("none");
   public static final amd<cui> c = a("armorer");
   public static final amd<cui> d = a("butcher");
   public static final amd<cui> e = a("cartographer");
   public static final amd<cui> f = a("cleric");
   public static final amd<cui> g = a("farmer");
   public static final amd<cui> h = a("fisherman");
   public static final amd<cui> i = a("fletcher");
   public static final amd<cui> j = a("leatherworker");
   public static final amd<cui> k = a("librarian");
   public static final amd<cui> l = a("mason");
   public static final amd<cui> m = a("nitwit");
   public static final amd<cui> n = a("shepherd");
   public static final amd<cui> o = a("toolsmith");
   public static final amd<cui> p = a("weaponsmith");

   private static amd<cui> a(String $$0) {
      return amd.a(mn.aH, ame.b($$0));
   }

   private static cui a(jy<cui> $$0, amd<cui> $$1, amd<cls> $$2, @Nullable ayy $$3) {
      return a($$0, $$1, $$1x -> $$1x.a($$2), $$1x -> $$1x.a($$2), $$3);
   }

   private static cui a(jy<cui> $$0, amd<cui> $$1, Predicate<jl<cls>> $$2, Predicate<jl<cls>> $$3, @Nullable ayy $$4) {
      return a($$0, $$1, $$2, $$3, ImmutableSet.of(), ImmutableSet.of(), $$4);
   }

   private static cui a(jy<cui> $$0, amd<cui> $$1, amd<cls> $$2, ImmutableSet<dcr> $$3, ImmutableSet<dpz> $$4, @Nullable ayy $$5) {
      return a($$0, $$1, $$1x -> $$1x.a($$2), $$1x -> $$1x.a($$2), $$3, $$4, $$5);
   }

   private static cui a(
      jy<cui> $$0, amd<cui> $$1, Predicate<jl<cls>> $$2, Predicate<jl<cls>> $$3, ImmutableSet<dcr> $$4, ImmutableSet<dpz> $$5, @Nullable ayy $$6
   ) {
      return jy.a($$0, $$1, new cui(xo.c("entity." + $$1.a().b() + ".villager." + $$1.a().a()), $$2, $$3, $$4, $$5, $$6));
   }

   public static cui a(jy<cui> $$0) {
      a($$0, b, cls.a, a, null);
      a($$0, c, clt.a, ayz.CC);
      a($$0, d, clt.b, ayz.CD);
      a($$0, e, clt.c, ayz.CE);
      a($$0, f, clt.d, ayz.CF);
      a($$0, g, clt.e, ImmutableSet.of(dcz.qB, dcz.qA, dcz.wO, dcz.sX), ImmutableSet.of(dqb.cN), ayz.CG);
      a($$0, h, clt.f, ayz.CH);
      a($$0, i, clt.g, ayz.CI);
      a($$0, j, clt.h, ayz.CJ);
      a($$0, k, clt.i, ayz.CK);
      a($$0, l, clt.j, ayz.CL);
      a($$0, m, cls.a, cls.a, null);
      a($$0, n, clt.k, ayz.CM);
      a($$0, o, clt.l, ayz.CN);
      return a($$0, p, clt.m, ayz.CO);
   }

   public xo a() {
      return this.q;
   }

   public Predicate<jl<cls>> b() {
      return this.r;
   }

   public Predicate<jl<cls>> c() {
      return this.s;
   }

   public ImmutableSet<dcr> d() {
      return this.t;
   }

   public ImmutableSet<dpz> e() {
      return this.u;
   }

   @Nullable
   public ayy f() {
      return this.v;
   }
}
