import java.util.Optional;

public class dlj {
   public static final amd<dli> a = a("quartz");
   public static final amd<dli> b = a("iron");
   public static final amd<dli> c = a("netherite");
   public static final amd<dli> d = a("redstone");
   public static final amd<dli> e = a("copper");
   public static final amd<dli> f = a("gold");
   public static final amd<dli> g = a("emerald");
   public static final amd<dli> h = a("diamond");
   public static final amd<dli> i = a("lapis");
   public static final amd<dli> j = a("amethyst");
   public static final amd<dli> k = a("resin");

   public static void a(qq<dli> $$0) {
      a($$0, a, yl.a.a(14931140), dlh.d);
      a($$0, b, yl.a.a(15527148), dlh.e);
      a($$0, c, yl.a.a(6445145), dlh.f);
      a($$0, d, yl.a.a(9901575), dlh.g);
      a($$0, e, yl.a.a(11823181), dlh.h);
      a($$0, f, yl.a.a(14594349), dlh.i);
      a($$0, g, yl.a.a(1155126), dlh.j);
      a($$0, h, yl.a.a(7269586), dlh.k);
      a($$0, i, yl.a.a(4288151), dlh.l);
      a($$0, j, yl.a.a(10116294), dlh.m);
      a($$0, k, yl.a.a(16545810), dlh.n);
   }

   public static Optional<jl<dli>> a(jn.a $$0, dcv $$1) {
      dfu $$2 = $$1.a(kq.ac);
      return $$2 != null ? $$2.a($$0) : Optional.empty();
   }

   private static void a(qq<dli> $$0, amd<dli> $$1, yl $$2, dlh $$3) {
      xo $$4 = xo.c(ag.a("trim_material", $$1.a())).c($$2);
      $$0.a($$1, new dli($$3, $$4));
   }

   private static amd<dli> a(String $$0) {
      return amd.a(mn.bp, ame.b($$0));
   }
}
