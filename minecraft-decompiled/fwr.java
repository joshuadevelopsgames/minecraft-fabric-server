import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import java.util.Map;
import java.util.Set;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

public class fwr {
   private final Map<fws, ame> a = Maps.newHashMap();
   private final Set<fws> b = Sets.newHashSet();

   public fwr a(fws $$0, ame $$1) {
      this.a.put($$0, $$1);
      return this;
   }

   public fwr b(fws $$0, ame $$1) {
      this.a.put($$0, $$1);
      this.b.add($$0);
      return this;
   }

   public Stream<fws> a() {
      return this.b.stream();
   }

   public fwr a(fws $$0, fws $$1) {
      this.a.put($$1, this.a.get($$0));
      return this;
   }

   public fwr b(fws $$0, fws $$1) {
      this.a.put($$1, this.a.get($$0));
      this.b.add($$1);
      return this;
   }

   public ame a(fws $$0) {
      for (fws $$1 = $$0; $$1 != null; $$1 = $$1.b()) {
         ame $$2 = this.a.get($$1);
         if ($$2 != null) {
            return $$2;
         }
      }

      throw new IllegalStateException("Can't find texture for slot " + $$0);
   }

   public fwr c(fws $$0, ame $$1) {
      fwr $$2 = new fwr();
      $$2.a.putAll(this.a);
      $$2.b.addAll(this.b);
      $$2.a($$0, $$1);
      return $$2;
   }

   public static fwr a(dpz $$0) {
      ame $$1 = J($$0);
      return b($$1);
   }

   public static fwr b(dpz $$0) {
      ame $$1 = J($$0);
      return a($$1);
   }

   public static fwr a(ame $$0) {
      return new fwr().a(fws.b, $$0);
   }

   public static fwr b(ame $$0) {
      return new fwr().a(fws.a, $$0);
   }

   public static fwr c(dpz $$0) {
      return d(fws.p, J($$0));
   }

   public static fwr d(dpz $$0) {
      return d(fws.i, J($$0));
   }

   public static fwr e(dpz $$0) {
      return new fwr().a(fws.p, J($$0)).a(fws.q, a($$0, "_emissive"));
   }

   public static fwr c(ame $$0) {
      return d(fws.p, $$0);
   }

   public static fwr f(dpz $$0) {
      return d(fws.r, J($$0));
   }

   public static fwr g(dpz $$0) {
      return new fwr().a(fws.r, J($$0)).a(fws.q, a($$0, "_emissive"));
   }

   public static fwr d(ame $$0) {
      return d(fws.r, $$0);
   }

   public static fwr h(dpz $$0) {
      return d(fws.t, J($$0));
   }

   public static fwr e(ame $$0) {
      return d(fws.t, $$0);
   }

   public static fwr i(dpz $$0) {
      return d(fws.u, J($$0));
   }

   public static fwr j(dpz $$0) {
      return new fwr().a(fws.Q, J($$0)).a(fws.z, a($$0, "_stem"));
   }

   public static fwr f(ame $$0) {
      return d(fws.u, $$0);
   }

   public static fwr k(dpz $$0) {
      return d(fws.z, J($$0));
   }

   public static fwr a(dpz $$0, dpz $$1) {
      return new fwr().a(fws.z, J($$0)).a(fws.A, J($$1));
   }

   public static fwr l(dpz $$0) {
      return d(fws.v, J($$0));
   }

   public static fwr m(dpz $$0) {
      return d(fws.y, J($$0));
   }

   public static fwr g(ame $$0) {
      return d(fws.B, $$0);
   }

   public static fwr b(dpz $$0, dpz $$1) {
      return new fwr().a(fws.w, J($$0)).a(fws.x, a($$1, "_top"));
   }

   public static fwr d(fws $$0, ame $$1) {
      return new fwr().a($$0, $$1);
   }

   public static fwr n(dpz $$0) {
      return new fwr().a(fws.i, a($$0, "_side")).a(fws.d, a($$0, "_top"));
   }

   public static fwr o(dpz $$0) {
      return new fwr().a(fws.i, a($$0, "_side")).a(fws.f, a($$0, "_top"));
   }

   public static fwr p(dpz $$0) {
      return new fwr().a(fws.r, a($$0, "_plant")).a(fws.i, a($$0, "_side")).a(fws.f, a($$0, "_top"));
   }

   public static fwr q(dpz $$0) {
      return new fwr().a(fws.i, J($$0)).a(fws.d, a($$0, "_top")).a(fws.c, J($$0));
   }

   public static fwr a(ame $$0, ame $$1) {
      return new fwr().a(fws.i, $$0).a(fws.d, $$1);
   }

   public static fwr r(dpz $$0) {
      return new fwr().a(fws.b, J($$0)).a(fws.i, a($$0, "_side")).a(fws.f, a($$0, "_top"));
   }

   public static fwr s(dpz $$0) {
      return new fwr().a(fws.b, J($$0)).a(fws.c, a($$0, "_particle"));
   }

   public static fwr t(dpz $$0) {
      return new fwr().a(fws.i, a($$0, "_side")).a(fws.f, a($$0, "_top")).a(fws.e, a($$0, "_bottom"));
   }

   public static fwr u(dpz $$0) {
      ame $$1 = J($$0);
      return new fwr().a(fws.s, $$1).a(fws.i, $$1).a(fws.f, a($$0, "_top")).a(fws.e, a($$0, "_bottom"));
   }

   public static fwr v(dpz $$0) {
      ame $$1 = J($$0);
      return new fwr().a(fws.b, $$1).a(fws.s, $$1).a(fws.i, $$1).a(fws.d, a($$0, "_top"));
   }

   public static fwr b(ame $$0, ame $$1) {
      return new fwr().a(fws.f, $$0).a(fws.e, $$1);
   }

   public static fwr w(dpz $$0) {
      return new fwr().a(fws.f, a($$0, "_top")).a(fws.e, a($$0, "_bottom"));
   }

   public static fwr x(dpz $$0) {
      return new fwr().a(fws.c, J($$0));
   }

   public static fwr h(ame $$0) {
      return new fwr().a(fws.c, $$0);
   }

   public static fwr y(dpz $$0) {
      return new fwr().a(fws.D, a($$0, "_0"));
   }

   public static fwr z(dpz $$0) {
      return new fwr().a(fws.D, a($$0, "_1"));
   }

   public static fwr A(dpz $$0) {
      return new fwr().a(fws.E, J($$0));
   }

   public static fwr B(dpz $$0) {
      return new fwr().a(fws.H, J($$0));
   }

   public static fwr i(ame $$0) {
      return new fwr().a(fws.H, $$0);
   }

   public static fwr a(dpz $$0, String $$1, String $$2) {
      return new fwr().a(fws.i, a($$0, $$1)).a(fws.f, a($$0, $$2)).a(fws.e, a($$0, "_bottom"));
   }

   public static fwr a(dpz $$0, String $$1, String $$2, String $$3, String $$4) {
      return new fwr().a(fws.g, a($$0, $$1)).a(fws.i, a($$0, $$2)).a(fws.f, a($$0, $$3)).a(fws.e, a($$0, $$4));
   }

   public static fwr a(dcr $$0) {
      return new fwr().a(fws.c, c($$0));
   }

   public static fwr C(dpz $$0) {
      return new fwr().a(fws.i, a($$0, "_side")).a(fws.g, a($$0, "_front")).a(fws.h, a($$0, "_back"));
   }

   public static fwr D(dpz $$0) {
      return new fwr().a(fws.i, a($$0, "_side")).a(fws.g, a($$0, "_front")).a(fws.f, a($$0, "_top")).a(fws.e, a($$0, "_bottom"));
   }

   public static fwr E(dpz $$0) {
      return new fwr().a(fws.i, a($$0, "_side")).a(fws.g, a($$0, "_front")).a(fws.f, a($$0, "_top"));
   }

   public static fwr F(dpz $$0) {
      return new fwr().a(fws.i, a($$0, "_side")).a(fws.g, a($$0, "_front")).a(fws.d, a($$0, "_end"));
   }

   public static fwr G(dpz $$0) {
      return new fwr().a(fws.f, a($$0, "_top"));
   }

   public static fwr c(dpz $$0, dpz $$1) {
      return new fwr()
         .a(fws.c, a($$0, "_front"))
         .a(fws.o, J($$1))
         .a(fws.n, a($$0, "_top"))
         .a(fws.j, a($$0, "_front"))
         .a(fws.l, a($$0, "_side"))
         .a(fws.k, a($$0, "_side"))
         .a(fws.m, a($$0, "_front"));
   }

   public static fwr d(dpz $$0, dpz $$1) {
      return new fwr()
         .a(fws.c, a($$0, "_front"))
         .a(fws.o, J($$1))
         .a(fws.n, a($$0, "_top"))
         .a(fws.j, a($$0, "_front"))
         .a(fws.k, a($$0, "_front"))
         .a(fws.l, a($$0, "_side"))
         .a(fws.m, a($$0, "_side"));
   }

   public static fwr a(String $$0) {
      return new fwr()
         .a(fws.c, a(dqb.mM, $$0 + "_north"))
         .a(fws.e, a(dqb.mM, $$0 + "_bottom"))
         .a(fws.f, a(dqb.mM, $$0 + "_top"))
         .a(fws.j, a(dqb.mM, $$0 + "_north"))
         .a(fws.k, a(dqb.mM, $$0 + "_south"))
         .a(fws.l, a(dqb.mM, $$0 + "_east"))
         .a(fws.m, a(dqb.mM, $$0 + "_west"));
   }

   public static fwr b(String $$0) {
      return new fwr()
         .a(fws.c, a(dqb.mN, $$0 + "_north"))
         .a(fws.e, a(dqb.mN, $$0 + "_bottom"))
         .a(fws.f, a(dqb.mN, $$0 + "_top"))
         .a(fws.j, a(dqb.mN, $$0 + "_north"))
         .a(fws.k, a(dqb.mN, $$0 + "_south"))
         .a(fws.l, a(dqb.mN, $$0 + "_east"))
         .a(fws.m, a(dqb.mN, $$0 + "_west"))
         .a(fws.R, a(dqb.mN, $$0 + "_tentacles"));
   }

   public static fwr H(dpz $$0) {
      return new fwr().a(fws.L, a($$0, "_log_lit")).a(fws.D, a($$0, "_fire"));
   }

   public static fwr a(dpz $$0, boolean $$1) {
      return new fwr()
         .a(fws.c, a(dqb.ex, "_side"))
         .a(fws.e, a(dqb.ex, "_bottom"))
         .a(fws.f, a(dqb.ex, "_top"))
         .a(fws.i, a(dqb.ex, "_side"))
         .a(fws.M, a($$0, $$1 ? "_lit" : ""));
   }

   public static fwr j(ame $$0) {
      return new fwr()
         .a(fws.c, a(dqb.fS, "_side"))
         .a(fws.i, a(dqb.fS, "_side"))
         .a(fws.f, a(dqb.fS, "_top"))
         .a(fws.e, a(dqb.fS, "_bottom"))
         .a(fws.N, a(dqb.fS, "_inner"))
         .a(fws.O, $$0);
   }

   public static fwr a(boolean $$0) {
      String $$1 = $$0 ? "_can_summon" : "";
      return new fwr()
         .a(fws.c, a(dqb.rE, "_bottom"))
         .a(fws.i, a(dqb.rE, "_side"))
         .a(fws.f, a(dqb.rE, "_top"))
         .a(fws.P, a(dqb.rE, $$1 + "_inner_top"))
         .a(fws.e, a(dqb.rE, "_bottom"));
   }

   public static fwr b(dcr $$0) {
      return new fwr().a(fws.I, c($$0));
   }

   public static fwr I(dpz $$0) {
      return new fwr().a(fws.I, J($$0));
   }

   public static fwr k(ame $$0) {
      return new fwr().a(fws.I, $$0);
   }

   public static fwr c(ame $$0, ame $$1) {
      return new fwr().a(fws.I, $$0).a(fws.J, $$1);
   }

   public static fwr a(ame $$0, ame $$1, ame $$2) {
      return new fwr().a(fws.I, $$0).a(fws.J, $$1).a(fws.K, $$2);
   }

   public static ame J(dpz $$0) {
      ame $$1 = mm.e.b($$0);
      return $$1.f("block/");
   }

   public static ame a(dpz $$0, String $$1) {
      ame $$2 = mm.e.b($$0);
      return $$2.a((UnaryOperator<String>)($$1x -> "block/" + $$1x + $$1));
   }

   public static ame c(dcr $$0) {
      ame $$1 = mm.g.b($$0);
      return $$1.f("item/");
   }

   public static ame a(dcr $$0, String $$1) {
      ame $$2 = mm.g.b($$0);
      return $$2.a((UnaryOperator<String>)($$1x -> "item/" + $$1x + $$1));
   }
}
