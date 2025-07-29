import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.datafixers.util.Pair;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public class fvx {
   final Consumer<fwe> i;
   final fwa j;
   final BiConsumer<ame, fwn> k;
   static final List<dpz> l = List.of(dqb.eP, dqb.eV, dqb.iA);
   public static final gzm a = $$0 -> $$0;
   public static final gzm b = gzm.d.withValue(true);
   public static final gzm c = gzm.a.withValue(i.b);
   public static final gzm d = gzm.a.withValue(i.c);
   public static final gzm e = gzm.a.withValue(i.d);
   public static final gzm f = gzm.b.withValue(i.b);
   public static final gzm g = gzm.b.withValue(i.c);
   public static final gzm h = gzm.b.withValue(i.d);
   private static final Function<fwf, fwf> m = $$0 -> $$0;
   private static final Function<fwf, fwf> n = $$0 -> $$0.a(eer.U, 2, 3, 4);
   private static final Function<fwf, fwf> o = $$0 -> $$0.a(eer.U, 3, 4);
   private static final Function<fwf, fwf> p = $$0 -> $$0.a(eer.U, 4);
   private static final Function<fwf, fwf> q = $$0 -> $$0.a(eer.V, 1);
   private static final Function<fwf, fwf> r = $$0 -> $$0.a(eer.V, 2, 3);
   private static final Function<fwf, fwf> s = $$0 -> $$0.a(eer.V, 3);
   private static final Function<fwf, fwf> t = $$0 -> $$0.a(eer.V, 4);
   static final Map<dpz, fvx.b> u = Map.of(dqb.b, fvx::a, dqb.tu, fvx::c, dqb.fe, fvx::b);
   private static final fwi<gzm> v = fwi.b(eer.R).a(jh.a, c).a(jh.b, e).a(jh.c, a).a(jh.d, g).a(jh.e, h).a(jh.f, f);
   private static final fwi<gzm> w = fwi.b(eer.R).a(jh.a, d).a(jh.b, a).a(jh.c, c).a(jh.d, c.then(g)).a(jh.e, c.then(h)).a(jh.f, c.then(f));
   private static final fwi<gzm> x = fwi.b(eer.T).a(jh.f, a).a(jh.d, f).a(jh.e, g).a(jh.c, h);
   private static final fwi<gzm> y = fwi.b(eer.T).a(jh.d, a).a(jh.e, f).a(jh.c, g).a(jh.f, h);
   private static final fwi<gzm> z = fwi.b(eer.T).a(jh.f, f).a(jh.d, g).a(jh.e, h).a(jh.c, a);
   static final Map<dpz, fwt> A = ImmutableMap.builder()
      .put(dqb.bc, fwt.C.get(dqb.bc))
      .put(dqb.jR, fwt.C.get(dqb.jR))
      .put(dqb.kv, fwt.a(fwr.a(dqb.bc, "_top")))
      .put(dqb.kx, fwt.a(fwr.a(dqb.jR, "_top")))
      .put(dqb.be, fwt.d.get(dqb.bc).a($$0 -> $$0.a(fws.i, fwr.J(dqb.be))))
      .put(dqb.jT, fwt.d.get(dqb.jR).a($$0 -> $$0.a(fws.i, fwr.J(dqb.jT))))
      .put(dqb.hE, fwt.d.get(dqb.hE))
      .put(dqb.kw, fwt.a(fwr.a(dqb.hE, "_bottom")))
      .put(dqb.qa, fwt.D.get(dqb.qa))
      .put(dqb.tu, fwt.D.get(dqb.tu))
      .put(dqb.hF, fwt.d.get(dqb.hF).a($$0 -> $$0.a(fws.i, fwr.J(dqb.hF))))
      .put(dqb.bd, fwt.d.get(dqb.bd).a($$0 -> {
         $$0.a(fws.d, fwr.a(dqb.bc, "_top"));
         $$0.a(fws.i, fwr.J(dqb.bd));
      }))
      .put(dqb.jS, fwt.d.get(dqb.jS).a($$0 -> {
         $$0.a(fws.d, fwr.a(dqb.jR, "_top"));
         $$0.a(fws.i, fwr.J(dqb.jS));
      }))
      .put(dqb.rv, fwt.D.get(dqb.rv))
      .put(dqb.rq, fwt.D.get(dqb.rq))
      .build();
   static final Map<mq.b, BiConsumer<fvx.a, dpz>> B = ImmutableMap.builder()
      .put(mq.b.a, fvx.a::a)
      .put(mq.b.e, fvx.a::l)
      .put(mq.b.b, fvx.a::k)
      .put(mq.b.c, fvx.a::k)
      .put(mq.b.f, fvx.a::c)
      .put(mq.b.g, fvx.a::d)
      .put(mq.b.h, fvx.a::e)
      .put(mq.b.i, fvx.a::f)
      .put(mq.b.k, fvx.a::h)
      .put(mq.b.l, fvx.a::i)
      .put(mq.b.m, fvx.a::j)
      .put(mq.b.n, fvx.a::g)
      .put(mq.b.p, fvx.a::m)
      .put(mq.b.q, fvx.a::b)
      .build();
   private static final Map<jh, gzm> C = ImmutableMap.of(jh.c, a, jh.f, f.then(b), jh.d, g.then(b), jh.e, h.then(b), jh.b, e.then(b), jh.a, c.then(b));
   private static final Map<fvx.c, ame> D = new HashMap<>();

   static gzl a(ame $$0) {
      return new gzl($$0);
   }

   static fwc a(gzl $$0) {
      return new fwc(bvt.a($$0));
   }

   private static fwc a(gzl... $$0) {
      return new fwc(bvt.a(Arrays.stream($$0).map($$0x -> new bvs<>($$0x, 1)).toList()));
   }

   static fwc b(ame $$0) {
      return a(a($$0));
   }

   private static fwf b() {
      return new fwf();
   }

   private static gzp a(fwf... $$0) {
      return new gzo(gzo.a.b, Stream.of($$0).map(fwf::a).toList());
   }

   private static fwe a(dpz $$0, gzl $$1, fwr $$2, BiConsumer<ame, fwn> $$3) {
      gzl $$4 = a(fwq.e.a($$0, $$2, $$3));
      return fwh.a($$0, a($$1, $$4));
   }

   private static fwe b(dpz $$0, gzl $$1, fwr $$2, BiConsumer<ame, fwn> $$3) {
      fwc $$4 = b(fwq.f.a($$0, $$2, $$3));
      return a($$0, $$4);
   }

   private static fwe c(dpz $$0, gzl $$1, fwr $$2, BiConsumer<ame, fwn> $$3) {
      gzl $$4 = a(fwq.l.a($$0, $$2, $$3));
      return fwh.a($$0, a($$1, $$4)).a(c());
   }

   public fvx(Consumer<fwe> $$0, fwa $$1, BiConsumer<ame, fwn> $$2) {
      this.i = $$0;
      this.j = $$1;
      this.k = $$2;
   }

   private void a(dcr $$0, ame $$1) {
      this.j.a($$0, fwm.a($$1));
   }

   void a(dpz $$0, ame $$1) {
      this.j.a($$0.h(), fwm.a($$1));
   }

   private void a(dpz $$0, ame $$1, fvq $$2) {
      this.j.a($$0.h(), fwm.a($$1, $$2));
   }

   private ame a(dcr $$0) {
      return fwq.bJ.a(fwo.a($$0), fwr.b($$0), this.k);
   }

   ame a(dcr $$0, dpz $$1) {
      return fwq.bJ.a(fwo.a($$0), fwr.I($$1), this.k);
   }

   private ame a(dcr $$0, dpz $$1, String $$2) {
      return fwq.bJ.a(fwo.a($$0), fwr.k(fwr.a($$1, $$2)), this.k);
   }

   ame b(dcr $$0, dpz $$1, String $$2) {
      ame $$3 = fwr.J($$1);
      ame $$4 = fwr.a($$1, $$2);
      return fwq.bN.a(fwo.a($$0), fwr.c($$3, $$4), this.k);
   }

   void b(dcr $$0) {
      this.a($$0, this.a($$0));
   }

   private void c(dpz $$0) {
      dcr $$1 = $$0.h();
      if ($$1 != dcz.a) {
         this.a($$1, this.a($$1, $$0));
      }
   }

   private void a(dpz $$0, String $$1) {
      dcr $$2 = $$0.h();
      if ($$2 != dcz.a) {
         this.a($$2, this.a($$2, $$0, $$1));
      }
   }

   private void b(dpz $$0, String $$1) {
      dcr $$2 = $$0.h();
      if ($$2 != dcz.a) {
         ame $$3 = this.b($$2, $$0, $$1);
         this.a($$2, $$3);
      }
   }

   private static fwc b(gzl $$0) {
      return a($$0, $$0.a(f), $$0.a(g), $$0.a(h));
   }

   private static fwc a(gzl $$0, gzl $$1) {
      return a($$0, $$1, $$0.a(g), $$1.a(g));
   }

   private static fwi<fwc> a(ees $$0, fwc $$1, fwc $$2) {
      return fwi.a($$0).a(true, $$1).a(false, $$2);
   }

   private void d(dpz $$0) {
      gzl $$1 = a(fwt.a.create($$0, this.k));
      gzl $$2 = a(fwt.c.create($$0, this.k));
      this.i.accept(fwh.a($$0, a($$1, $$2)));
   }

   private void e(dpz $$0) {
      gzl $$1 = a(fwt.a.create($$0, this.k));
      this.i.accept(fwh.a($$0, b($$1)));
   }

   private void f(dpz $$0) {
      this.i.accept(fwh.a($$0).a(fwi.a(eer.bz).a($$1 -> {
         String $$2 = "_" + $$1;
         ame $$3 = fwr.a($$0, $$2);
         ame $$4 = fwq.c.a($$0, $$2, new fwr().a(fws.a, $$3), this.k);
         return b($$4);
      })));
      this.a($$0, fwo.a($$0, "_0"));
   }

   static fwe a(dpz $$0, fwc $$1, fwc $$2) {
      return fwh.a($$0)
         .a(fwi.a(eer.A).a(false, $$1).a(true, $$2))
         .a(
            fwi.b(eer.X, eer.T)
               .a(eem.a, jh.f, f)
               .a(eem.a, jh.e, h)
               .a(eem.a, jh.d, g)
               .a(eem.a, jh.c, a)
               .a(eem.b, jh.f, f.then(c).then(b))
               .a(eem.b, jh.e, h.then(c).then(b))
               .a(eem.b, jh.d, g.then(c).then(b))
               .a(eem.b, jh.c, c.then(b))
               .a(eem.c, jh.f, h.then(d))
               .a(eem.c, jh.e, f.then(d))
               .a(eem.c, jh.d, d)
               .a(eem.c, jh.c, g.then(d))
         );
   }

   private static fwe a(dpz $$0, fwc $$1, fwc $$2, fwc $$3, fwc $$4, fwc $$5, fwc $$6, fwc $$7, fwc $$8) {
      return fwh.a($$0)
         .a(
            fwi.a(eer.T, eer.ah, eer.bi, eer.y)
               .a(jh.f, eex.b, eew.a, false, $$1)
               .a(jh.d, eex.b, eew.a, false, $$1.a(f))
               .a(jh.e, eex.b, eew.a, false, $$1.a(g))
               .a(jh.c, eex.b, eew.a, false, $$1.a(h))
               .a(jh.f, eex.b, eew.b, false, $$3)
               .a(jh.d, eex.b, eew.b, false, $$3.a(f))
               .a(jh.e, eex.b, eew.b, false, $$3.a(g))
               .a(jh.c, eex.b, eew.b, false, $$3.a(h))
               .a(jh.f, eex.b, eew.a, true, $$2.a(f))
               .a(jh.d, eex.b, eew.a, true, $$2.a(g))
               .a(jh.e, eex.b, eew.a, true, $$2.a(h))
               .a(jh.c, eex.b, eew.a, true, $$2)
               .a(jh.f, eex.b, eew.b, true, $$4.a(h))
               .a(jh.d, eex.b, eew.b, true, $$4)
               .a(jh.e, eex.b, eew.b, true, $$4.a(f))
               .a(jh.c, eex.b, eew.b, true, $$4.a(g))
               .a(jh.f, eex.a, eew.a, false, $$5)
               .a(jh.d, eex.a, eew.a, false, $$5.a(f))
               .a(jh.e, eex.a, eew.a, false, $$5.a(g))
               .a(jh.c, eex.a, eew.a, false, $$5.a(h))
               .a(jh.f, eex.a, eew.b, false, $$7)
               .a(jh.d, eex.a, eew.b, false, $$7.a(f))
               .a(jh.e, eex.a, eew.b, false, $$7.a(g))
               .a(jh.c, eex.a, eew.b, false, $$7.a(h))
               .a(jh.f, eex.a, eew.a, true, $$6.a(f))
               .a(jh.d, eex.a, eew.a, true, $$6.a(g))
               .a(jh.e, eex.a, eew.a, true, $$6.a(h))
               .a(jh.c, eex.a, eew.a, true, $$6)
               .a(jh.f, eex.a, eew.b, true, $$8.a(h))
               .a(jh.d, eex.a, eew.b, true, $$8)
               .a(jh.e, eex.a, eew.b, true, $$8.a(f))
               .a(jh.c, eex.a, eew.b, true, $$8.a(g))
         );
   }

   static fwe a(dpz $$0, fwc $$1, fwc $$2, fwc $$3, fwc $$4, fwc $$5) {
      return fwg.a($$0).a($$1).a(b().a(eer.N, true), $$2).a(b().a(eer.O, true), $$3).a(b().a(eer.P, true), $$4).a(b().a(eer.Q, true), $$5);
   }

   static fwe b(dpz $$0, fwc $$1, fwc $$2) {
      return fwg.a($$0)
         .a($$1)
         .a(b().a(eer.N, true), $$2.a(b))
         .a(b().a(eer.O, true), $$2.a(f).a(b))
         .a(b().a(eer.P, true), $$2.a(g).a(b))
         .a(b().a(eer.Q, true), $$2.a(h).a(b));
   }

   static fwe a(dpz $$0, fwc $$1, fwc $$2, fwc $$3) {
      return fwg.a($$0)
         .a(b().a(eer.L, true), $$1)
         .a(b().a(eer.aa, efo.b), $$2.a(b))
         .a(b().a(eer.Z, efo.b), $$2.a(f).a(b))
         .a(b().a(eer.ab, efo.b), $$2.a(g).a(b))
         .a(b().a(eer.ac, efo.b), $$2.a(h).a(b))
         .a(b().a(eer.aa, efo.c), $$3.a(b))
         .a(b().a(eer.Z, efo.c), $$3.a(f).a(b))
         .a(b().a(eer.ab, efo.c), $$3.a(g).a(b))
         .a(b().a(eer.ac, efo.c), $$3.a(h).a(b));
   }

   static fwe a(dpz $$0, fwc $$1, fwc $$2, fwc $$3, fwc $$4, boolean $$5) {
      return fwh.a($$0).a(fwi.a(eer.t, eer.y).a(false, false, $$2).a(true, false, $$4).a(false, true, $$1).a(true, true, $$3)).a($$5 ? b : a).a(y);
   }

   static fwe b(dpz $$0, fwc $$1, fwc $$2, fwc $$3) {
      return fwh.a($$0)
         .a(
            fwi.a(eer.T, eer.ai, eer.bm)
               .a(jh.f, efa.b, efk.a, $$2)
               .a(jh.e, efa.b, efk.a, $$2.a(g).a(b))
               .a(jh.d, efa.b, efk.a, $$2.a(f).a(b))
               .a(jh.c, efa.b, efk.a, $$2.a(h).a(b))
               .a(jh.f, efa.b, efk.e, $$3)
               .a(jh.e, efa.b, efk.e, $$3.a(g).a(b))
               .a(jh.d, efa.b, efk.e, $$3.a(f).a(b))
               .a(jh.c, efa.b, efk.e, $$3.a(h).a(b))
               .a(jh.f, efa.b, efk.d, $$3.a(h).a(b))
               .a(jh.e, efa.b, efk.d, $$3.a(f).a(b))
               .a(jh.d, efa.b, efk.d, $$3)
               .a(jh.c, efa.b, efk.d, $$3.a(g).a(b))
               .a(jh.f, efa.b, efk.c, $$1)
               .a(jh.e, efa.b, efk.c, $$1.a(g).a(b))
               .a(jh.d, efa.b, efk.c, $$1.a(f).a(b))
               .a(jh.c, efa.b, efk.c, $$1.a(h).a(b))
               .a(jh.f, efa.b, efk.b, $$1.a(h).a(b))
               .a(jh.e, efa.b, efk.b, $$1.a(f).a(b))
               .a(jh.d, efa.b, efk.b, $$1)
               .a(jh.c, efa.b, efk.b, $$1.a(g).a(b))
               .a(jh.f, efa.a, efk.a, $$2.a(d).a(b))
               .a(jh.e, efa.a, efk.a, $$2.a(d).a(g).a(b))
               .a(jh.d, efa.a, efk.a, $$2.a(d).a(f).a(b))
               .a(jh.c, efa.a, efk.a, $$2.a(d).a(h).a(b))
               .a(jh.f, efa.a, efk.e, $$3.a(d).a(f).a(b))
               .a(jh.e, efa.a, efk.e, $$3.a(d).a(h).a(b))
               .a(jh.d, efa.a, efk.e, $$3.a(d).a(g).a(b))
               .a(jh.c, efa.a, efk.e, $$3.a(d).a(b))
               .a(jh.f, efa.a, efk.d, $$3.a(d).a(b))
               .a(jh.e, efa.a, efk.d, $$3.a(d).a(g).a(b))
               .a(jh.d, efa.a, efk.d, $$3.a(d).a(f).a(b))
               .a(jh.c, efa.a, efk.d, $$3.a(d).a(h).a(b))
               .a(jh.f, efa.a, efk.c, $$1.a(d).a(f).a(b))
               .a(jh.e, efa.a, efk.c, $$1.a(d).a(h).a(b))
               .a(jh.d, efa.a, efk.c, $$1.a(d).a(g).a(b))
               .a(jh.c, efa.a, efk.c, $$1.a(d).a(b))
               .a(jh.f, efa.a, efk.b, $$1.a(d).a(b))
               .a(jh.e, efa.a, efk.b, $$1.a(d).a(g).a(b))
               .a(jh.d, efa.a, efk.b, $$1.a(d).a(f).a(b))
               .a(jh.c, efa.a, efk.b, $$1.a(d).a(h).a(b))
         );
   }

   private static fwe c(dpz $$0, fwc $$1, fwc $$2, fwc $$3) {
      return fwh.a($$0)
         .a(
            fwi.a(eer.T, eer.ai, eer.y)
               .a(jh.c, efa.b, false, $$2)
               .a(jh.d, efa.b, false, $$2.a(g))
               .a(jh.f, efa.b, false, $$2.a(f))
               .a(jh.e, efa.b, false, $$2.a(h))
               .a(jh.c, efa.a, false, $$1)
               .a(jh.d, efa.a, false, $$1.a(g))
               .a(jh.f, efa.a, false, $$1.a(f))
               .a(jh.e, efa.a, false, $$1.a(h))
               .a(jh.c, efa.b, true, $$3)
               .a(jh.d, efa.b, true, $$3.a(g))
               .a(jh.f, efa.b, true, $$3.a(f))
               .a(jh.e, efa.b, true, $$3.a(h))
               .a(jh.c, efa.a, true, $$3.a(d).a(g))
               .a(jh.d, efa.a, true, $$3.a(d))
               .a(jh.f, efa.a, true, $$3.a(d).a(h))
               .a(jh.e, efa.a, true, $$3.a(d).a(f))
         );
   }

   private static fwe d(dpz $$0, fwc $$1, fwc $$2, fwc $$3) {
      return fwh.a($$0)
         .a(
            fwi.a(eer.T, eer.ai, eer.y)
               .a(jh.c, efa.b, false, $$2)
               .a(jh.d, efa.b, false, $$2)
               .a(jh.f, efa.b, false, $$2)
               .a(jh.e, efa.b, false, $$2)
               .a(jh.c, efa.a, false, $$1)
               .a(jh.d, efa.a, false, $$1)
               .a(jh.f, efa.a, false, $$1)
               .a(jh.e, efa.a, false, $$1)
               .a(jh.c, efa.b, true, $$3)
               .a(jh.d, efa.b, true, $$3.a(g))
               .a(jh.f, efa.b, true, $$3.a(f))
               .a(jh.e, efa.b, true, $$3.a(h))
               .a(jh.c, efa.a, true, $$3)
               .a(jh.d, efa.a, true, $$3.a(g))
               .a(jh.f, efa.a, true, $$3.a(f))
               .a(jh.e, efa.a, true, $$3.a(h))
         );
   }

   static fwh a(dpz $$0, fwc $$1) {
      return fwh.a($$0, $$1);
   }

   private static fwi<gzm> c() {
      return fwi.b(eer.K).a(jh.a.b, a).a(jh.a.c, c).a(jh.a.a, c.then(f));
   }

   static fwe a(dpz $$0, fwr $$1, BiConsumer<ame, fwn> $$2) {
      fwc $$3 = b(fwq.g.a($$0, $$1, $$2));
      fwc $$4 = b(fwq.h.a($$0, $$1, $$2));
      fwc $$5 = b(fwq.i.a($$0, $$1, $$2));
      return fwh.a($$0).a(fwi.a(eer.K).a(jh.a.a, $$3).a(jh.a.b, $$4).a(jh.a.c, $$5));
   }

   static fwe b(dpz $$0, fwc $$1) {
      return fwh.a($$0, $$1).a(c());
   }

   private void c(dpz $$0, fwc $$1) {
      this.i.accept(b($$0, $$1));
   }

   public void a(dpz $$0, fwt.a $$1) {
      fwc $$2 = b($$1.create($$0, this.k));
      this.i.accept(b($$0, $$2));
   }

   private void c(dpz $$0, fwt.a $$1) {
      fwc $$2 = b($$1.create($$0, this.k));
      this.i.accept(fwh.a($$0, $$2).a(z));
   }

   static fwe c(dpz $$0, fwc $$1, fwc $$2) {
      return fwh.a($$0).a(fwi.a(eer.K).a(jh.a.b, $$1).a(jh.a.c, $$2.a(c)).a(jh.a.a, $$2.a(c).a(f)));
   }

   private void a(dpz $$0, fwt.a $$1, fwt.a $$2) {
      fwc $$3 = b($$1.create($$0, this.k));
      fwc $$4 = b($$2.create($$0, this.k));
      this.i.accept(c($$0, $$3, $$4));
   }

   private void g(dpz $$0) {
      fwc $$1 = b(fwt.A.create($$0, this.k));
      fwc $$2 = b(fwt.B.create($$0, this.k));
      fwc $$3 = b(this.a(fwt.A, $$0, "_awake"));
      fwc $$4 = b(this.a(fwt.B, $$0, "_awake"));
      fwc $$5 = b(this.a(fwt.A, $$0, "_dormant"));
      fwc $$6 = b(this.a(fwt.B, $$0, "_dormant"));
      this.i
         .accept(
            fwh.a($$0)
               .a(
                  fwi.a(eer.K, drv.c)
                     .a(jh.a.b, eev.a, $$1)
                     .a(jh.a.c, eev.a, $$2.a(c))
                     .a(jh.a.a, eev.a, $$2.a(c).a(f))
                     .a(jh.a.b, eev.b, $$5)
                     .a(jh.a.c, eev.b, $$6.a(c))
                     .a(jh.a.a, eev.b, $$6.a(c).a(f))
                     .a(jh.a.b, eev.c, $$3)
                     .a(jh.a.c, eev.c, $$4.a(c))
                     .a(jh.a.a, eev.c, $$4.a(c).a(f))
               )
         );
   }

   private ame a(fwt.a $$0, dpz $$1, String $$2) {
      return $$0.updateTexture($$2x -> $$2x.a(fws.i, fwr.a($$1, $$2)).a(fws.d, fwr.a($$1, "_top" + $$2))).createWithSuffix($$1, $$2, this.k);
   }

   private ame a(dpz $$0, String $$1, fwp $$2, Function<ame, fwr> $$3) {
      return $$2.a($$0, $$1, $$3.apply(fwr.a($$0, $$1)), this.k);
   }

   static fwe d(dpz $$0, fwc $$1, fwc $$2) {
      return fwh.a($$0).a(a(eer.A, $$2, $$1));
   }

   static fwe e(dpz $$0, fwc $$1, fwc $$2, fwc $$3) {
      return fwh.a($$0).a(fwi.a(eer.bl).a(efj.b, $$1).a(efj.a, $$2).a(efj.c, $$3));
   }

   public void a(dpz $$0) {
      this.b($$0, fwt.a);
   }

   public void b(dpz $$0, fwt.a $$1) {
      this.i.accept(a($$0, b($$1.create($$0, this.k))));
   }

   public void a(dpz $$0, fwt.a $$1, int $$2) {
      ame $$3 = $$1.create($$0, this.k);
      this.i.accept(a($$0, b($$3)));
      this.a($$0, $$3, fwm.a($$2));
   }

   private void d() {
      this.K(dqb.fx);
      ame $$0 = this.a(dcz.gr, dqb.fx);
      this.a(dqb.fx, $$0, fwm.a(-12012264));
   }

   private void h(dpz $$0) {
      ame $$1 = this.a($$0.h(), $$0);
      this.a($$0, $$1, new fvp());
   }

   private fvx.a i(dpz $$0) {
      fwt $$1 = A.getOrDefault($$0, fwt.a.get($$0));
      return new fvx.a($$1.b()).a($$0, $$1.a());
   }

   public void a(dpz $$0, dpz $$1, dpz $$2) {
      fwc $$3 = this.g($$1, $$0);
      this.i.accept(a($$1, $$3));
      this.i.accept(a($$2, $$3));
      this.b($$1.h());
   }

   void j(dpz $$0) {
      fwr $$1 = fwr.w($$0);
      fwc $$2 = b(fwq.v.a($$0, $$1, this.k));
      fwc $$3 = b(fwq.w.a($$0, $$1, this.k));
      fwc $$4 = b(fwq.x.a($$0, $$1, this.k));
      fwc $$5 = b(fwq.y.a($$0, $$1, this.k));
      fwc $$6 = b(fwq.z.a($$0, $$1, this.k));
      fwc $$7 = b(fwq.A.a($$0, $$1, this.k));
      fwc $$8 = b(fwq.B.a($$0, $$1, this.k));
      fwc $$9 = b(fwq.C.a($$0, $$1, this.k));
      this.b($$0.h());
      this.i.accept(a($$0, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9));
   }

   private void b(dpz $$0, dpz $$1) {
      fwc $$2 = b(fwq.v.a($$0));
      fwc $$3 = b(fwq.w.a($$0));
      fwc $$4 = b(fwq.x.a($$0));
      fwc $$5 = b(fwq.y.a($$0));
      fwc $$6 = b(fwq.z.a($$0));
      fwc $$7 = b(fwq.A.a($$0));
      fwc $$8 = b(fwq.B.a($$0));
      fwc $$9 = b(fwq.C.a($$0));
      this.j.a($$0.h(), $$1.h());
      this.i.accept(a($$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9));
   }

   void k(dpz $$0) {
      fwr $$1 = fwr.b($$0);
      fwc $$2 = b(fwq.ak.a($$0, $$1, this.k));
      ame $$3 = fwq.al.a($$0, $$1, this.k);
      fwc $$4 = b(fwq.am.a($$0, $$1, this.k));
      this.i.accept(c($$0, $$2, b($$3), $$4));
      this.a($$0, $$3);
   }

   void l(dpz $$0) {
      fwr $$1 = fwr.b($$0);
      fwc $$2 = b(fwq.ah.a($$0, $$1, this.k));
      ame $$3 = fwq.ai.a($$0, $$1, this.k);
      fwc $$4 = b(fwq.aj.a($$0, $$1, this.k));
      this.i.accept(d($$0, $$2, b($$3), $$4));
      this.a($$0, $$3);
   }

   private void c(dpz $$0, dpz $$1) {
      fwc $$2 = b(fwq.ah.a($$0));
      fwc $$3 = b(fwq.ai.a($$0));
      fwc $$4 = b(fwq.aj.a($$0));
      this.j.a($$0.h(), $$1.h());
      this.i.accept(d($$1, $$2, $$3, $$4));
   }

   private void e() {
      fwc $$0 = b(fwo.a(dqb.to));
      fwc $$1 = b(fwo.a(dqb.to, "_partial_tilt"));
      fwc $$2 = b(fwo.a(dqb.to, "_full_tilt"));
      this.i.accept(fwh.a(dqb.to).a(fwi.a(eer.bp).a(efn.a, $$0).a(efn.b, $$0).a(efn.c, $$1).a(efn.d, $$2)).a(z));
   }

   private fvx.e m(dpz $$0) {
      return new fvx.e(fwr.q($$0));
   }

   private void n(dpz $$0) {
      this.d($$0, $$0);
   }

   private void d(dpz $$0, dpz $$1) {
      this.i.accept(a($$0, b(fwo.a($$1))));
   }

   private void a(dpz $$0, fvx.d $$1) {
      this.a($$0.h(), $$1.a(this, $$0));
      this.b($$0, $$1);
   }

   private void a(dpz $$0, fvx.d $$1, fwr $$2) {
      this.c($$0);
      this.b($$0, $$1, $$2);
   }

   private void b(dpz $$0, fvx.d $$1) {
      fwr $$2 = $$1.a($$0);
      this.b($$0, $$1, $$2);
   }

   private void b(dpz $$0, fvx.d $$1, fwr $$2) {
      fwc $$3 = b($$1.a().a($$0, $$2, this.k));
      this.i.accept(a($$0, $$3));
   }

   private void a(dpz $$0, fvx.d $$1, efe<Integer> $$2, int... $$3) {
      if ($$2.a().size() != $$3.length) {
         throw new IllegalArgumentException("missing values for property: " + $$2);
      } else {
         this.b($$0.h());
         this.i.accept(fwh.a($$0).a(fwi.a($$2).a($$3x -> {
            String $$4 = "_stage" + $$3[$$3x];
            fwr $$5 = fwr.c(fwr.a($$0, $$4));
            return b($$1.a().a($$0, $$4, $$5, this.k));
         })));
      }
   }

   private void a(dpz $$0, dpz $$1, fvx.d $$2) {
      this.a($$0.h(), $$2.a(this, $$0));
      this.b($$0, $$1, $$2);
   }

   private void b(dpz $$0, dpz $$1, fvx.d $$2) {
      this.b($$0, $$2);
      fwr $$3 = $$2.b($$0);
      fwc $$4 = b($$2.b().a($$1, $$3, this.k));
      this.i.accept(a($$1, $$4));
   }

   private void e(dpz $$0, dpz $$1) {
      fwt $$2 = fwt.u.get($$0);
      fwc $$3 = b($$2.a($$0, this.k));
      this.i.accept(a($$0, $$3));
      fwc $$4 = b(fwq.aJ.a($$1, $$2.b(), this.k));
      this.i.accept(fwh.a($$1, $$4).a(z));
      this.c($$0);
   }

   private void f(dpz $$0, dpz $$1) {
      this.b($$0.h());
      fwr $$2 = fwr.k($$0);
      fwr $$3 = fwr.a($$0, $$1);
      fwc $$4 = b(fwq.bb.a($$1, $$3, this.k));
      this.i.accept(fwh.a($$1, $$4).a(fwi.b(eer.T).a(jh.e, a).a(jh.d, h).a(jh.c, f).a(jh.f, g)));
      this.i.accept(fwh.a($$0).a(fwi.a(eer.ay).a($$2x -> b(fwq.ba[$$2x].a($$0, $$2, this.k)))));
   }

   private void f() {
      dpz $$0 = dqb.li;
      this.b($$0.h());
      fwc $$1 = b(fwo.a($$0, "_top"));
      fwc $$2 = b(fwo.a($$0, "_bottom"));
      this.e($$0, $$1, $$2);
   }

   private void g() {
      dpz $$0 = dqb.lh;
      this.b($$0.h());
      this.i.accept(fwh.a($$0).a(fwi.a(dvv.e, eer.ah).a(($$1, $$2) -> {
         return switch ($$2) {
            case a -> b(fwo.a($$0, "_top_stage_" + $$1));
            case b -> b(fwo.a($$0, "_bottom_stage_" + $$1));
         };
      })));
   }

   private void a(dpz $$0, dpz $$1, dpz $$2, dpz $$3, dpz $$4, dpz $$5, dpz $$6, dpz $$7) {
      this.a($$0, fvx.d.b);
      this.a($$1, fvx.d.b);
      this.a($$2);
      this.a($$3);
      this.e($$4, $$6);
      this.e($$5, $$7);
   }

   private void c(dpz $$0, fvx.d $$1) {
      fwc $$2 = b(this.a($$0, "_top", $$1.a(), fwr::c));
      fwc $$3 = b(this.a($$0, "_bottom", $$1.a(), fwr::c));
      this.e($$0, $$2, $$3);
   }

   private void d(dpz $$0, fvx.d $$1) {
      this.a($$0, "_top");
      this.c($$0, $$1);
   }

   private void o(dpz $$0) {
      ame $$1 = this.a($$0.h(), $$0, "_top");
      this.a($$0, $$1, new fvp());
      this.c($$0, fvx.d.a);
   }

   private void h() {
      this.a(dqb.jf, "_front");
      fwc $$0 = b(fwo.a(dqb.jf, "_top"));
      fwc $$1 = b(this.a(dqb.jf, "_bottom", fvx.d.b.a(), fwr::c));
      this.e(dqb.jf, $$0, $$1);
   }

   private void i() {
      fwc $$0 = b(this.a(dqb.bH, "_top", fwq.bv, fwr::a));
      fwc $$1 = b(this.a(dqb.bH, "_bottom", fwq.bv, fwr::a));
      this.e(dqb.bH, $$0, $$1);
   }

   private void j() {
      fwc $$0 = b(fwo.a(dqb.tq, "_top"));
      fwc $$1 = b(fwo.a(dqb.tq, "_bottom"));
      this.i.accept(fwh.a(dqb.tq).a(fwi.a(eer.ah).a(eex.b, $$1).a(eex.a, $$0)).a(z));
   }

   private void e(dpz $$0, fwc $$1, fwc $$2) {
      this.i.accept(fwh.a($$0).a(fwi.a(eer.ah).a(eex.b, $$2).a(eex.a, $$1)));
   }

   private void p(dpz $$0) {
      fwr $$1 = fwr.h($$0);
      fwr $$2 = fwr.e(fwr.a($$0, "_corner"));
      fwc $$3 = b(fwq.au.a($$0, $$1, this.k));
      fwc $$4 = b(fwq.av.a($$0, $$2, this.k));
      fwc $$5 = b(fwq.aw.a($$0, $$1, this.k));
      fwc $$6 = b(fwq.ax.a($$0, $$1, this.k));
      this.c($$0);
      this.i
         .accept(
            fwh.a($$0)
               .a(
                  fwi.a(eer.aj)
                     .a(eff.a, $$3)
                     .a(eff.b, $$3.a(f))
                     .a(eff.c, $$5.a(f))
                     .a(eff.d, $$6.a(f))
                     .a(eff.e, $$5)
                     .a(eff.f, $$6)
                     .a(eff.g, $$4)
                     .a(eff.h, $$4.a(f))
                     .a(eff.i, $$4.a(g))
                     .a(eff.j, $$4.a(h))
               )
         );
   }

   private void q(dpz $$0) {
      fwc $$1 = b(this.a($$0, "", fwq.au, fwr::e));
      fwc $$2 = b(this.a($$0, "", fwq.aw, fwr::e));
      fwc $$3 = b(this.a($$0, "", fwq.ax, fwr::e));
      fwc $$4 = b(this.a($$0, "_on", fwq.au, fwr::e));
      fwc $$5 = b(this.a($$0, "_on", fwq.aw, fwr::e));
      fwc $$6 = b(this.a($$0, "_on", fwq.ax, fwr::e));
      this.c($$0);
      this.i.accept(fwh.a($$0).a(fwi.a(eer.A, eer.ak).a(($$6x, $$7) -> {
         return switch ($$7) {
            case a -> $$6x ? $$4 : $$1;
            case b -> ($$6x ? $$4 : $$1).a(f);
            case c -> ($$6x ? $$5 : $$2).a(f);
            case d -> ($$6x ? $$6 : $$3).a(f);
            case e -> $$6x ? $$5 : $$2;
            case f -> $$6x ? $$6 : $$3;
            default -> throw new UnsupportedOperationException("Fix you generator!");
         };
      })));
   }

   private void a(dpz $$0, dcr $$1) {
      fwc $$2 = b(fwq.aa.a($$0, fwr.a($$1), this.k));
      this.i.accept(a($$0, $$2));
   }

   private void b(dpz $$0, ame $$1) {
      fwc $$2 = b(fwq.aa.a($$0, fwr.h($$1), this.k));
      this.i.accept(a($$0, $$2));
   }

   private fwc g(dpz $$0, dpz $$1) {
      return b(fwq.aa.a($$0, fwr.x($$1), this.k));
   }

   public void a(dpz $$0, dpz $$1) {
      this.i.accept(a($$0, this.g($$0, $$1)));
   }

   private void r(dpz $$0) {
      this.a($$0, $$0);
   }

   private void h(dpz $$0, dpz $$1) {
      this.a($$0);
      fwc $$2 = b(fwt.j.get($$0).a($$1, this.k));
      this.i.accept(a($$1, $$2));
   }

   private void s(dpz $$0) {
      fwc $$1 = b(fwt.p.create($$0, this.k));
      fwc $$2 = b(fwt.q.create($$0, this.k));
      fwc $$3 = b(fwt.r.create($$0, this.k));
      fwc $$4 = b(fwt.s.create($$0, this.k));
      this.b($$0.h());
      this.a($$0, $$1, q, $$2, r, $$3, s, $$4, t);
   }

   private void t(dpz $$0) {
      fwc $$1 = b(fwt.l.create($$0, this.k));
      fwc $$2 = b(fwt.m.create($$0, this.k));
      fwc $$3 = b(fwt.n.create($$0, this.k));
      fwc $$4 = b(fwt.o.create($$0, this.k));
      this.b($$0.h());
      this.a($$0, $$1, m, $$2, n, $$3, o, $$4, p);
   }

   private void a(dpz $$0, fwc $$1, Function<fwf, fwf> $$2, fwc $$3, Function<fwf, fwf> $$4, fwc $$5, Function<fwf, fwf> $$6, fwc $$7, Function<fwf, fwf> $$8) {
      this.i
         .accept(
            fwg.a($$0)
               .a($$2.apply(b().a(eer.T, jh.c)), $$1)
               .a($$2.apply(b().a(eer.T, jh.f)), $$1.a(f))
               .a($$2.apply(b().a(eer.T, jh.d)), $$1.a(g))
               .a($$2.apply(b().a(eer.T, jh.e)), $$1.a(h))
               .a($$4.apply(b().a(eer.T, jh.c)), $$3)
               .a($$4.apply(b().a(eer.T, jh.f)), $$3.a(f))
               .a($$4.apply(b().a(eer.T, jh.d)), $$3.a(g))
               .a($$4.apply(b().a(eer.T, jh.e)), $$3.a(h))
               .a($$6.apply(b().a(eer.T, jh.c)), $$5)
               .a($$6.apply(b().a(eer.T, jh.f)), $$5.a(f))
               .a($$6.apply(b().a(eer.T, jh.d)), $$5.a(g))
               .a($$6.apply(b().a(eer.T, jh.e)), $$5.a(h))
               .a($$8.apply(b().a(eer.T, jh.c)), $$7)
               .a($$8.apply(b().a(eer.T, jh.f)), $$7.a(f))
               .a($$8.apply(b().a(eer.T, jh.d)), $$7.a(g))
               .a($$8.apply(b().a(eer.T, jh.e)), $$7.a(h))
         );
   }

   private void a(fwt.a $$0, dpz... $$1) {
      for (dpz $$2 : $$1) {
         gzl $$3 = a($$0.create($$2, this.k));
         this.i.accept(fwh.a($$2, b($$3)));
      }
   }

   private void b(fwt.a $$0, dpz... $$1) {
      for (dpz $$2 : $$1) {
         fwc $$3 = b($$0.create($$2, this.k));
         this.i.accept(fwh.a($$2, $$3).a(y));
      }
   }

   private void i(dpz $$0, dpz $$1) {
      this.a($$0);
      fwr $$2 = fwr.b($$0, $$1);
      fwc $$3 = b(fwq.aP.a($$1, $$2, this.k));
      fwc $$4 = b(fwq.aQ.a($$1, $$2, this.k));
      fwc $$5 = b(fwq.aR.a($$1, $$2, this.k));
      fwc $$6 = b(fwq.aN.a($$1, $$2, this.k));
      fwc $$7 = b(fwq.aO.a($$1, $$2, this.k));
      dcr $$8 = $$1.h();
      this.a($$8, this.a($$8, $$0));
      this.i
         .accept(
            fwg.a($$1)
               .a($$3)
               .a(b().a(eer.N, true), $$4)
               .a(b().a(eer.O, true), $$4.a(f))
               .a(b().a(eer.P, true), $$5)
               .a(b().a(eer.Q, true), $$5.a(f))
               .a(b().a(eer.N, false), $$6)
               .a(b().a(eer.O, false), $$7)
               .a(b().a(eer.P, false), $$7.a(f))
               .a(b().a(eer.Q, false), $$6.a(h))
         );
   }

   private void u(dpz $$0) {
      fwr $$1 = fwr.C($$0);
      fwc $$2 = b(fwq.aS.a($$0, $$1, this.k));
      fwc $$3 = b(this.a($$0, "_conditional", fwq.aS, $$1x -> $$1.c(fws.i, $$1x)));
      this.i.accept(fwh.a($$0).a(a(eer.f, $$3, $$2)).a(v));
   }

   private void v(dpz $$0) {
      fwc $$1 = b(fwt.v.create($$0, this.k));
      this.i.accept(a($$0, $$1).a(y));
   }

   private static fwc a(int $$0) {
      String $$1 = "_age" + $$0;
      return new fwc(bvt.a(IntStream.range(1, 5).mapToObj($$1x -> new bvs<>(a(fwo.a(dqb.nG, $$1x + $$1)), 1)).collect(Collectors.toList())));
   }

   private void k() {
      this.i
         .accept(
            fwg.a(dqb.nG)
               .a(b().a(eer.at, 0), a(0))
               .a(b().a(eer.at, 1), a(1))
               .a(b().a(eer.bo, een.b), b(fwo.a(dqb.nG, "_small_leaves")))
               .a(b().a(eer.bo, een.c), b(fwo.a(dqb.nG, "_large_leaves")))
         );
   }

   private void l() {
      ame $$0 = fwr.a(dqb.oB, "_top_open");
      fwc $$1 = b(fwt.f.create(dqb.oB, this.k));
      fwc $$2 = b(fwt.f.get(dqb.oB).a($$1x -> $$1x.a(fws.f, $$0)).a(dqb.oB, "_open", this.k));
      this.i.accept(fwh.a(dqb.oB).a(fwi.a(eer.y).a(false, $$1).a(true, $$2)).a(w));
   }

   private static <T extends Comparable<T>> fwi<fwc> a(efe<T> $$0, T $$1, fwc $$2, fwc $$3) {
      return fwi.a($$0).a($$3x -> {
         boolean $$4 = $$3x.compareTo($$1) >= 0;
         return $$4 ? $$2 : $$3;
      });
   }

   private void a(dpz $$0, Function<dpz, fwr> $$1) {
      fwr $$2 = $$1.apply($$0).b(fws.i, fws.c);
      fwr $$3 = $$2.c(fws.g, fwr.a($$0, "_front_honey"));
      ame $$4 = fwq.q.a($$0, "_empty", $$2, this.k);
      ame $$5 = fwq.q.a($$0, "_honey", $$3, this.k);
      this.j.a($$0.h(), fwm.a(dpt.c, fwm.a($$4), Map.of(5, fwm.a($$5))));
      this.i.accept(fwh.a($$0).a(a(dpt.c, 5, b($$5), b($$4))).a(z));
   }

   private void a(dpz $$0, efe<Integer> $$1, int... $$2) {
      this.b($$0.h());
      if ($$1.a().size() != $$2.length) {
         throw new IllegalArgumentException();
      } else {
         Int2ObjectMap<ame> $$3 = new Int2ObjectOpenHashMap();
         this.i.accept(fwh.a($$0).a(fwi.a($$1).a($$3x -> {
            int $$4 = $$2[$$3x];
            return b((ame)$$3.computeIfAbsent($$4, $$1xx -> this.a($$0, "_stage" + $$1xx, fwq.bc, fwr::g)));
         })));
      }
   }

   private void m() {
      fwc $$0 = b(fwo.a(dqb.oK, "_floor"));
      fwc $$1 = b(fwo.a(dqb.oK, "_ceiling"));
      fwc $$2 = b(fwo.a(dqb.oK, "_wall"));
      fwc $$3 = b(fwo.a(dqb.oK, "_between_walls"));
      this.b(dcz.xX);
      this.i
         .accept(
            fwh.a(dqb.oK)
               .a(
                  fwi.a(eer.T, eer.Y)
                     .a(jh.c, eep.a, $$0)
                     .a(jh.d, eep.a, $$0.a(g))
                     .a(jh.f, eep.a, $$0.a(f))
                     .a(jh.e, eep.a, $$0.a(h))
                     .a(jh.c, eep.b, $$1)
                     .a(jh.d, eep.b, $$1.a(g))
                     .a(jh.f, eep.b, $$1.a(f))
                     .a(jh.e, eep.b, $$1.a(h))
                     .a(jh.c, eep.c, $$2.a(h))
                     .a(jh.d, eep.c, $$2.a(f))
                     .a(jh.f, eep.c, $$2)
                     .a(jh.e, eep.c, $$2.a(g))
                     .a(jh.d, eep.d, $$3.a(f))
                     .a(jh.c, eep.d, $$3.a(h))
                     .a(jh.f, eep.d, $$3)
                     .a(jh.e, eep.d, $$3.a(g))
               )
         );
   }

   private void n() {
      this.i
         .accept(
            fwh.a(dqb.oG, b(fwo.a(dqb.oG)))
               .a(
                  fwi.b(eer.X, eer.T)
                     .a(eem.a, jh.c, a)
                     .a(eem.a, jh.f, f)
                     .a(eem.a, jh.d, g)
                     .a(eem.a, jh.e, h)
                     .a(eem.b, jh.c, c)
                     .a(eem.b, jh.f, c.then(f))
                     .a(eem.b, jh.d, c.then(g))
                     .a(eem.b, jh.e, c.then(h))
                     .a(eem.c, jh.d, d)
                     .a(eem.c, jh.e, d.then(f))
                     .a(eem.c, jh.c, d.then(g))
                     .a(eem.c, jh.f, d.then(h))
               )
         );
   }

   private void d(dpz $$0, fwt.a $$1) {
      fwc $$2 = b($$1.create($$0, this.k));
      ame $$3 = fwr.a($$0, "_front_on");
      fwc $$4 = b($$1.get($$0).a($$1x -> $$1x.a(fws.g, $$3)).a($$0, "_on", this.k));
      this.i.accept(fwh.a($$0).a(a(eer.u, $$4, $$2)).a(z));
   }

   private void a(dpz... $$0) {
      fwc $$1 = b(fwo.a("campfire_off"));

      for (dpz $$2 : $$0) {
         fwc $$3 = b(fwq.bj.a($$2, fwr.H($$2), this.k));
         this.b($$2.h());
         this.i.accept(fwh.a($$2).a(a(eer.u, $$3, $$1)).a(y));
      }
   }

   private void w(dpz $$0) {
      fwc $$1 = b(fwq.bF.a($$0, fwr.o($$0), this.k));
      this.i.accept(a($$0, $$1));
   }

   private void x(dpz $$0) {
      fwc $$1;
      if ($$0 == dqb.tU) {
         $$1 = b(fwq.bH.a($$0, fwr.p($$0), this.k));
      } else {
         $$1 = b(fwq.bG.a($$0, fwr.p($$0), this.k));
      }

      this.i.accept(a($$0, $$1));
   }

   private void o() {
      fwr $$0 = fwr.a(fwr.J(dqb.cv), fwr.J(dqb.n));
      fwc $$1 = b(fwq.j.a(dqb.cv, $$0, this.k));
      this.i.accept(a(dqb.cv, $$1));
   }

   private void p() {
      this.b(dcz.mm);
      this.i
         .accept(
            fwg.a(dqb.cH)
               .a(
                  a(
                     b().a(eer.ae, efg.c).a(eer.ad, efg.c).a(eer.af, efg.c).a(eer.ag, efg.c),
                     b().a(eer.ae, efg.b, efg.a).a(eer.ad, efg.b, efg.a),
                     b().a(eer.ad, efg.b, efg.a).a(eer.af, efg.b, efg.a),
                     b().a(eer.af, efg.b, efg.a).a(eer.ag, efg.b, efg.a),
                     b().a(eer.ag, efg.b, efg.a).a(eer.ae, efg.b, efg.a)
                  ),
                  b(fwo.a("redstone_dust_dot"))
               )
               .a(b().a(eer.ae, efg.b, efg.a), b(fwo.a("redstone_dust_side0")))
               .a(b().a(eer.af, efg.b, efg.a), b(fwo.a("redstone_dust_side_alt0")))
               .a(b().a(eer.ad, efg.b, efg.a), b(fwo.a("redstone_dust_side_alt1")).a(h))
               .a(b().a(eer.ag, efg.b, efg.a), b(fwo.a("redstone_dust_side1")).a(h))
               .a(b().a(eer.ae, efg.a), b(fwo.a("redstone_dust_up")))
               .a(b().a(eer.ad, efg.a), b(fwo.a("redstone_dust_up")).a(f))
               .a(b().a(eer.af, efg.a), b(fwo.a("redstone_dust_up")).a(g))
               .a(b().a(eer.ag, efg.a), b(fwo.a("redstone_dust_up")).a(h))
         );
   }

   private void q() {
      this.b(dcz.mq);
      this.i
         .accept(
            fwh.a(dqb.hz)
               .a(
                  fwi.a(eer.bh, eer.A)
                     .a(eeu.a, false, b(fwo.a(dqb.hz)))
                     .a(eeu.a, true, b(fwo.a(dqb.hz, "_on")))
                     .a(eeu.b, false, b(fwo.a(dqb.hz, "_subtract")))
                     .a(eeu.b, true, b(fwo.a(dqb.hz, "_on_subtract")))
               )
               .a(y)
         );
   }

   private void r() {
      fwr $$0 = fwr.a(dqb.ku);
      fwr $$1 = fwr.a(fwr.a(dqb.kh, "_side"), $$0.a(fws.f));
      fwc $$2 = b(fwq.ab.a(dqb.kh, $$1, this.k));
      fwc $$3 = b(fwq.ac.a(dqb.kh, $$1, this.k));
      fwc $$4 = b(fwq.j.b(dqb.kh, "_double", $$1, this.k));
      this.i.accept(e(dqb.kh, $$2, $$3, $$4));
      this.i.accept(a(dqb.ku, b(fwq.c.a(dqb.ku, $$0, this.k))));
   }

   private void s() {
      this.b(dcz.tP);
      this.i
         .accept(
            fwg.a(dqb.fR)
               .a(b(fwr.J(dqb.fR)))
               .a(b().a(eer.n, true), b(fwr.a(dqb.fR, "_bottle0")))
               .a(b().a(eer.o, true), b(fwr.a(dqb.fR, "_bottle1")))
               .a(b().a(eer.p, true), b(fwr.a(dqb.fR, "_bottle2")))
               .a(b().a(eer.n, false), b(fwr.a(dqb.fR, "_empty0")))
               .a(b().a(eer.o, false), b(fwr.a(dqb.fR, "_empty1")))
               .a(b().a(eer.p, false), b(fwr.a(dqb.fR, "_empty2")))
         );
   }

   private void y(dpz $$0) {
      fwc $$1 = b(fwq.bB.a($$0, fwr.b($$0), this.k));
      fwc $$2 = b(fwo.a("mushroom_block_inside"));
      this.i
         .accept(
            fwg.a($$0)
               .a(b().a(eer.N, true), $$1)
               .a(b().a(eer.O, true), $$1.a(f).a(b))
               .a(b().a(eer.P, true), $$1.a(g).a(b))
               .a(b().a(eer.Q, true), $$1.a(h).a(b))
               .a(b().a(eer.L, true), $$1.a(e).a(b))
               .a(b().a(eer.M, true), $$1.a(c).a(b))
               .a(b().a(eer.N, false), $$2)
               .a(b().a(eer.O, false), $$2.a(f))
               .a(b().a(eer.P, false), $$2.a(g))
               .a(b().a(eer.Q, false), $$2.a(h))
               .a(b().a(eer.L, false), $$2.a(e))
               .a(b().a(eer.M, false), $$2.a(c))
         );
      this.a($$0, fwt.a.createWithSuffix($$0, "_inventory", this.k));
   }

   private void t() {
      this.b(dcz.ta);
      this.i
         .accept(
            fwh.a(dqb.ex)
               .a(
                  fwi.a(eer.aB)
                     .a(0, b(fwo.a(dqb.ex)))
                     .a(1, b(fwo.a(dqb.ex, "_slice1")))
                     .a(2, b(fwo.a(dqb.ex, "_slice2")))
                     .a(3, b(fwo.a(dqb.ex, "_slice3")))
                     .a(4, b(fwo.a(dqb.ex, "_slice4")))
                     .a(5, b(fwo.a(dqb.ex, "_slice5")))
                     .a(6, b(fwo.a(dqb.ex, "_slice6")))
               )
         );
   }

   private void u() {
      fwr $$0 = new fwr()
         .a(fws.c, fwr.a(dqb.oE, "_side3"))
         .a(fws.o, fwr.J(dqb.t))
         .a(fws.n, fwr.a(dqb.oE, "_top"))
         .a(fws.j, fwr.a(dqb.oE, "_side3"))
         .a(fws.l, fwr.a(dqb.oE, "_side3"))
         .a(fws.k, fwr.a(dqb.oE, "_side1"))
         .a(fws.m, fwr.a(dqb.oE, "_side2"));
      this.i.accept(a(dqb.oE, b(fwq.a.a(dqb.oE, $$0, this.k))));
   }

   private void v() {
      fwr $$0 = new fwr()
         .a(fws.c, fwr.a(dqb.oI, "_front"))
         .a(fws.o, fwr.a(dqb.oI, "_bottom"))
         .a(fws.n, fwr.a(dqb.oI, "_top"))
         .a(fws.j, fwr.a(dqb.oI, "_front"))
         .a(fws.k, fwr.a(dqb.oI, "_front"))
         .a(fws.l, fwr.a(dqb.oI, "_side"))
         .a(fws.m, fwr.a(dqb.oI, "_side"));
      this.i.accept(a(dqb.oI, b(fwq.a.a(dqb.oI, $$0, this.k))));
   }

   private void a(dpz $$0, dpz $$1, BiFunction<dpz, dpz, fwr> $$2) {
      fwr $$3 = $$2.apply($$0, $$1);
      this.i.accept(a($$0, b(fwq.a.a($$0, $$3, this.k))));
   }

   public void b(dpz $$0) {
      fwr $$1 = new fwr()
         .a(fws.c, fwr.a($$0, "_particle"))
         .a(fws.o, fwr.a($$0, "_down"))
         .a(fws.n, fwr.a($$0, "_up"))
         .a(fws.j, fwr.a($$0, "_north"))
         .a(fws.k, fwr.a($$0, "_south"))
         .a(fws.l, fwr.a($$0, "_east"))
         .a(fws.m, fwr.a($$0, "_west"));
      this.i.accept(a($$0, b(fwq.a.a($$0, $$1, this.k))));
   }

   private void w() {
      fwr $$0 = fwr.n(dqb.fr);
      this.i.accept(a(dqb.fr, b(fwo.a(dqb.fr))));
      this.a(dqb.ev, $$0);
      this.a(dqb.ew, $$0);
   }

   private void a(dpz $$0, fwr $$1) {
      fwc $$2 = b(fwq.p.a($$0, $$1.c(fws.g, fwr.J($$0)), this.k));
      this.i.accept(fwh.a($$0, $$2).a(z));
   }

   private void x() {
      this.b(dcz.tQ);
      this.n(dqb.fS);
      this.i.accept(a(dqb.fU, b(fwq.bE.a(dqb.fU, fwr.j(fwr.a(dqb.K, "_still")), this.k))));
      this.i
         .accept(
            fwh.a(dqb.fT)
               .a(
                  fwi.a(duo.g)
                     .a(1, b(fwq.bC.a(dqb.fT, "_level1", fwr.j(fwr.a(dqb.J, "_still")), this.k)))
                     .a(2, b(fwq.bD.a(dqb.fT, "_level2", fwr.j(fwr.a(dqb.J, "_still")), this.k)))
                     .a(3, b(fwq.bE.a(dqb.fT, "_full", fwr.j(fwr.a(dqb.J, "_still")), this.k)))
               )
         );
      this.i
         .accept(
            fwh.a(dqb.fV)
               .a(
                  fwi.a(duo.g)
                     .a(1, b(fwq.bC.a(dqb.fV, "_level1", fwr.j(fwr.J(dqb.ry)), this.k)))
                     .a(2, b(fwq.bD.a(dqb.fV, "_level2", fwr.j(fwr.J(dqb.ry)), this.k)))
                     .a(3, b(fwq.bE.a(dqb.fV, "_full", fwr.j(fwr.J(dqb.ry)), this.k)))
               )
         );
   }

   private void y() {
      fwr $$0 = fwr.b(dqb.lb);
      fwc $$1 = b(fwq.aL.a(dqb.lb, $$0, this.k));
      fwc $$2 = b(this.a(dqb.lb, "_dead", fwq.aL, $$1x -> $$0.c(fws.b, $$1x)));
      this.i.accept(fwh.a(dqb.lb).a(a(eer.ax, 5, $$2, $$1)));
   }

   private void z() {
      fwc $$0 = b(fwo.a(dqb.ub));
      fwc $$1 = b(fwo.a(dqb.ub, "_triggered"));
      fwc $$2 = b(fwo.a(dqb.ub, "_crafting"));
      fwc $$3 = b(fwo.a(dqb.ub, "_crafting_triggered"));
      this.i
         .accept(fwh.a(dqb.ub).a(fwi.a(eer.G, drt.b).a(false, false, $$0).a(true, true, $$3).a(true, false, $$1).a(false, true, $$2)).a(fwi.b(eer.W).a(fvx::a)));
   }

   private void z(dpz $$0) {
      fwr $$1 = new fwr().a(fws.f, fwr.a(dqb.cO, "_top")).a(fws.i, fwr.a(dqb.cO, "_side")).a(fws.g, fwr.a($$0, "_front"));
      fwr $$2 = new fwr().a(fws.i, fwr.a(dqb.cO, "_top")).a(fws.g, fwr.a($$0, "_front_vertical"));
      fwc $$3 = b(fwq.p.a($$0, $$1, this.k));
      fwc $$4 = b(fwq.r.a($$0, $$2, this.k));
      this.i.accept(fwh.a($$0).a(fwi.a(eer.R).a(jh.a, $$4.a(d)).a(jh.b, $$4).a(jh.c, $$3).a(jh.f, $$3.a(f)).a(jh.d, $$3.a(g)).a(jh.e, $$3.a(h))));
   }

   private void A() {
      fwc $$0 = b(fwo.a(dqb.fX));
      fwc $$1 = b(fwo.a(dqb.fX, "_filled"));
      this.i.accept(fwh.a(dqb.fX).a(fwi.a(eer.k).a(false, $$0).a(true, $$1)).a(y));
   }

   private void B() {
      fwc $$0 = b(fwo.a(dqb.la, "_side"));
      gzl $$1 = a(fwo.a(dqb.la, "_noside"));
      gzl $$2 = a(fwo.a(dqb.la, "_noside1"));
      gzl $$3 = a(fwo.a(dqb.la, "_noside2"));
      gzl $$4 = a(fwo.a(dqb.la, "_noside3"));
      gzl $$5 = $$1.a(b);
      gzl $$6 = $$2.a(b);
      gzl $$7 = $$3.a(b);
      gzl $$8 = $$4.a(b);
      this.i
         .accept(
            fwg.a(dqb.la)
               .a(b().a(eer.N, true), $$0)
               .a(b().a(eer.O, true), $$0.a(f).a(b))
               .a(b().a(eer.P, true), $$0.a(g).a(b))
               .a(b().a(eer.Q, true), $$0.a(h).a(b))
               .a(b().a(eer.L, true), $$0.a(e).a(b))
               .a(b().a(eer.M, true), $$0.a(c).a(b))
               .a(b().a(eer.N, false), new fwc(bvt.a(new bvs<>($$1, 2), new bvs<>($$2, 1), new bvs<>($$3, 1), new bvs<>($$4, 1))))
               .a(b().a(eer.O, false), new fwc(bvt.a(new bvs<>($$6.a(f), 1), new bvs<>($$7.a(f), 1), new bvs<>($$8.a(f), 1), new bvs<>($$5.a(f), 2))))
               .a(b().a(eer.P, false), new fwc(bvt.a(new bvs<>($$7.a(g), 1), new bvs<>($$8.a(g), 1), new bvs<>($$5.a(g), 2), new bvs<>($$6.a(g), 1))))
               .a(b().a(eer.Q, false), new fwc(bvt.a(new bvs<>($$8.a(h), 1), new bvs<>($$5.a(h), 2), new bvs<>($$6.a(h), 1), new bvs<>($$7.a(h), 1))))
               .a(b().a(eer.L, false), new fwc(bvt.a(new bvs<>($$5.a(e), 2), new bvs<>($$8.a(e), 1), new bvs<>($$6.a(e), 1), new bvs<>($$7.a(e), 1))))
               .a(b().a(eer.M, false), new fwc(bvt.a(new bvs<>($$8.a(c), 1), new bvs<>($$7.a(c), 1), new bvs<>($$6.a(c), 1), new bvs<>($$5.a(c), 2))))
         );
   }

   private void C() {
      this.i
         .accept(
            fwg.a(dqb.pL)
               .a(b(fwr.J(dqb.pL)))
               .a(b().a(eer.aO, 1), b(fwr.a(dqb.pL, "_contents1")))
               .a(b().a(eer.aO, 2), b(fwr.a(dqb.pL, "_contents2")))
               .a(b().a(eer.aO, 3), b(fwr.a(dqb.pL, "_contents3")))
               .a(b().a(eer.aO, 4), b(fwr.a(dqb.pL, "_contents4")))
               .a(b().a(eer.aO, 5), b(fwr.a(dqb.pL, "_contents5")))
               .a(b().a(eer.aO, 6), b(fwr.a(dqb.pL, "_contents6")))
               .a(b().a(eer.aO, 7), b(fwr.a(dqb.pL, "_contents7")))
               .a(b().a(eer.aO, 8), b(fwr.a(dqb.pL, "_contents_ready")))
         );
   }

   private void A(dpz $$0) {
      fwc $$1 = b(fwq.c.a($$0, fwr.a($$0), this.k));
      fwc $$2 = b(this.a($$0, "_powered", fwq.c, fwr::b));
      fwc $$3 = b(this.a($$0, "_lit", fwq.c, fwr::b));
      fwc $$4 = b(this.a($$0, "_lit_powered", fwq.c, fwr::b));
      this.i.accept(a($$0, $$1, $$3, $$2, $$4));
   }

   private static fwe a(dpz $$0, fwc $$1, fwc $$2, fwc $$3, fwc $$4) {
      return fwh.a($$0).a(fwi.a(eer.u, eer.A).a(($$4x, $$5) -> {
         if ($$4x) {
            return $$5 ? $$4 : $$2;
         } else {
            return $$5 ? $$3 : $$1;
         }
      }));
   }

   private void j(dpz $$0, dpz $$1) {
      fwc $$2 = b(fwo.a($$0));
      fwc $$3 = b(fwo.a($$0, "_powered"));
      fwc $$4 = b(fwo.a($$0, "_lit"));
      fwc $$5 = b(fwo.a($$0, "_lit_powered"));
      this.j.a($$0.h(), $$1.h());
      this.i.accept(a($$1, $$2, $$4, $$3, $$5));
   }

   private void B(dpz $$0) {
      fwc $$1 = b(fwq.ao.a($$0, fwr.c($$0), this.k));
      this.i.accept(fwh.a($$0, $$1).a(w));
   }

   private void D() {
      this.B(dqb.rh);
      this.B(dqb.rg);
      this.B(dqb.rf);
      this.B(dqb.re);
   }

   private void E() {
      fwi.b<fwc, jh, eey> $$0 = fwi.a(eer.bq, eer.br);

      for (eey $$1 : eey.values()) {
         $$0.a(jh.b, $$1, this.a(jh.b, $$1));
      }

      for (eey $$2 : eey.values()) {
         $$0.a(jh.a, $$2, this.a(jh.a, $$2));
      }

      this.i.accept(fwh.a(dqb.tc).a($$0));
   }

   private fwc a(jh $$0, eey $$1) {
      String $$2 = "_" + $$0.c() + "_" + $$1.c();
      fwr $$3 = fwr.c(fwr.a(dqb.tc, $$2));
      return b(fwq.an.a(dqb.tc, $$2, $$3, this.k));
   }

   private void C(dpz $$0) {
      fwr $$1 = new fwr().a(fws.e, fwr.J(dqb.em)).a(fws.f, fwr.J($$0)).a(fws.i, fwr.a($$0, "_side"));
      this.i.accept(a($$0, b(fwq.n.a($$0, $$1, this.k))));
   }

   private void F() {
      ame $$0 = fwr.a(dqb.hA, "_side");
      fwr $$1 = new fwr().a(fws.f, fwr.a(dqb.hA, "_top")).a(fws.i, $$0);
      fwr $$2 = new fwr().a(fws.f, fwr.a(dqb.hA, "_inverted_top")).a(fws.i, $$0);
      this.i.accept(fwh.a(dqb.hA).a(fwi.a(eer.s).a(false, b(fwq.aM.a(dqb.hA, $$1, this.k))).a(true, b(fwq.aM.a(fwo.a(dqb.hA, "_inverted"), $$2, this.k)))));
   }

   private void D(dpz $$0) {
      this.i.accept(fwh.a($$0, b(fwo.a($$0))).a(w));
   }

   private void G() {
      dpz $$0 = dqb.tb;
      fwc $$1 = b(fwo.a($$0, "_on"));
      fwc $$2 = b(fwo.a($$0));
      this.i.accept(fwh.a($$0).a(a(eer.A, $$1, $$2)).a(w));
   }

   private void H() {
      fwr $$0 = new fwr().a(fws.C, fwr.J(dqb.j)).a(fws.f, fwr.J(dqb.cN));
      fwr $$1 = new fwr().a(fws.C, fwr.J(dqb.j)).a(fws.f, fwr.a(dqb.cN, "_moist"));
      fwc $$2 = b(fwq.bd.a(dqb.cN, $$0, this.k));
      fwc $$3 = b(fwq.bd.a(fwr.a(dqb.cN, "_moist"), $$1, this.k));
      this.i.accept(fwh.a(dqb.cN).a(a(eer.aT, 7, $$3, $$2)));
   }

   private fwc E(dpz $$0) {
      return a(a(fwq.be.a(fwo.a($$0, "_floor0"), fwr.y($$0), this.k)), a(fwq.be.a(fwo.a($$0, "_floor1"), fwr.z($$0), this.k)));
   }

   private fwc F(dpz $$0) {
      return a(
         a(fwq.bf.a(fwo.a($$0, "_side0"), fwr.y($$0), this.k)),
         a(fwq.bf.a(fwo.a($$0, "_side1"), fwr.z($$0), this.k)),
         a(fwq.bg.a(fwo.a($$0, "_side_alt0"), fwr.y($$0), this.k)),
         a(fwq.bg.a(fwo.a($$0, "_side_alt1"), fwr.z($$0), this.k))
      );
   }

   private fwc G(dpz $$0) {
      return a(
         a(fwq.bh.a(fwo.a($$0, "_up0"), fwr.y($$0), this.k)),
         a(fwq.bh.a(fwo.a($$0, "_up1"), fwr.z($$0), this.k)),
         a(fwq.bi.a(fwo.a($$0, "_up_alt0"), fwr.y($$0), this.k)),
         a(fwq.bi.a(fwo.a($$0, "_up_alt1"), fwr.z($$0), this.k))
      );
   }

   private void I() {
      fwf $$0 = b().a(eer.N, false).a(eer.O, false).a(eer.P, false).a(eer.Q, false).a(eer.L, false);
      fwc $$1 = this.E(dqb.cB);
      fwc $$2 = this.F(dqb.cB);
      fwc $$3 = this.G(dqb.cB);
      this.i
         .accept(
            fwg.a(dqb.cB)
               .a($$0, $$1)
               .a(a(b().a(eer.N, true), $$0), $$2)
               .a(a(b().a(eer.O, true), $$0), $$2.a(f))
               .a(a(b().a(eer.P, true), $$0), $$2.a(g))
               .a(a(b().a(eer.Q, true), $$0), $$2.a(h))
               .a(b().a(eer.L, true), $$3)
         );
   }

   private void J() {
      fwc $$0 = this.E(dqb.cC);
      fwc $$1 = this.F(dqb.cC);
      this.i.accept(fwg.a(dqb.cC).a($$0).a($$1).a($$1.a(f)).a($$1.a(g)).a($$1.a(h)));
   }

   private void H(dpz $$0) {
      fwc $$1 = b(fwt.x.create($$0, this.k));
      fwc $$2 = b(fwt.y.create($$0, this.k));
      this.b($$0.h());
      this.i.accept(fwh.a($$0).a(a(eer.m, $$2, $$1)));
   }

   private void K() {
      fwr $$0 = fwr.a(fwr.a(dqb.ah, "_side"), fwr.a(dqb.ah, "_top"));
      fwc $$1 = b(fwq.j.a(dqb.ah, $$0, this.k));
      this.i.accept(b(dqb.ah, $$1));
   }

   private void L() {
      this.b(dcz.af);
      dpz $$0 = dqb.H;
      fwc $$1 = b(fwo.a($$0));
      this.i.accept(fwh.a(dqb.H).a(fwi.a(dvb.d, dvb.b).a(($$2, $$3) -> $$2 ? b(fwo.a($$0, "_hanging_" + $$3)) : $$1)));
   }

   private void M() {
      this.i
         .accept(
            fwh.a(dqb.lo)
               .a(
                  fwi.a(eer.av)
                     .a(0, b(this.a(dqb.lo, "_0", fwq.c, fwr::b)))
                     .a(1, b(this.a(dqb.lo, "_1", fwq.c, fwr::b)))
                     .a(2, b(this.a(dqb.lo, "_2", fwq.c, fwr::b)))
                     .a(3, b(this.a(dqb.lo, "_3", fwq.c, fwr::b)))
               )
         );
   }

   private void N() {
      ame $$0 = fwr.J(dqb.j);
      fwr $$1 = new fwr().a(fws.e, $$0).b(fws.e, fws.c).a(fws.f, fwr.a(dqb.i, "_top")).a(fws.i, fwr.a(dqb.i, "_snow"));
      fwc $$2 = b(fwq.n.a(dqb.i, "_snow", $$1, this.k));
      ame $$3 = fwo.a(dqb.i);
      this.f(dqb.i, b(a($$3)), $$2);
      this.a(dqb.i, $$3, new fvp());
      fwc $$4 = b(a(fwt.f.get(dqb.fE).a($$1x -> $$1x.a(fws.e, $$0)).a(dqb.fE, this.k)));
      this.f(dqb.fE, $$4, $$2);
      fwc $$5 = b(a(fwt.f.get(dqb.l).a($$1x -> $$1x.a(fws.e, $$0)).a(dqb.l, this.k)));
      this.f(dqb.l, $$5, $$2);
   }

   private void f(dpz $$0, fwc $$1, fwc $$2) {
      this.i.accept(fwh.a($$0).a(fwi.a(eer.E).a(true, $$2).a(false, $$1)));
   }

   private void O() {
      this.b(dcz.sG);
      this.i.accept(fwh.a(dqb.gb).a(fwi.a(eer.au).a(0, b(fwo.a(dqb.gb, "_stage0"))).a(1, b(fwo.a(dqb.gb, "_stage1"))).a(2, b(fwo.a(dqb.gb, "_stage2")))).a(y));
   }

   private void P() {
      gzl $$0 = a(fwo.a(dqb.lk));
      this.i.accept(fwh.a(dqb.lk, b($$0)));
   }

   private void k(dpz $$0, dpz $$1) {
      fwr $$2 = fwr.b($$1);
      fwc $$3 = b(fwq.Y.a($$0, $$2, this.k));
      fwc $$4 = b(fwq.Z.a($$0, $$2, this.k));
      this.i.accept(fwh.a($$0).a(a(eer.aW, 1, $$4, $$3)));
   }

   private void Q() {
      fwc $$0 = b(fwo.a(dqb.hD));
      fwc $$1 = b(fwo.a(dqb.hD, "_side"));
      this.b(dcz.mw);
      this.i.accept(fwh.a(dqb.hD).a(fwi.a(eer.S).a(jh.a, $$0).a(jh.c, $$1).a(jh.f, $$1.a(f)).a(jh.d, $$1.a(g)).a(jh.e, $$1.a(h))));
   }

   private void l(dpz $$0, dpz $$1) {
      fwc $$2 = b(fwo.a($$0));
      this.i.accept(fwh.a($$1, $$2));
      this.j.a($$0.h(), $$1.h());
   }

   private void R() {
      fwc $$0 = b(fwo.a(dqb.fo, "_post_ends"));
      fwc $$1 = b(fwo.a(dqb.fo, "_post"));
      fwc $$2 = b(fwo.a(dqb.fo, "_cap"));
      fwc $$3 = b(fwo.a(dqb.fo, "_cap_alt"));
      fwc $$4 = b(fwo.a(dqb.fo, "_side"));
      fwc $$5 = b(fwo.a(dqb.fo, "_side_alt"));
      this.i
         .accept(
            fwg.a(dqb.fo)
               .a($$0)
               .a(b().a(eer.N, false).a(eer.O, false).a(eer.P, false).a(eer.Q, false), $$1)
               .a(b().a(eer.N, true).a(eer.O, false).a(eer.P, false).a(eer.Q, false), $$2)
               .a(b().a(eer.N, false).a(eer.O, true).a(eer.P, false).a(eer.Q, false), $$2.a(f))
               .a(b().a(eer.N, false).a(eer.O, false).a(eer.P, true).a(eer.Q, false), $$3)
               .a(b().a(eer.N, false).a(eer.O, false).a(eer.P, false).a(eer.Q, true), $$3.a(f))
               .a(b().a(eer.N, true), $$4)
               .a(b().a(eer.O, true), $$4.a(f))
               .a(b().a(eer.P, true), $$5)
               .a(b().a(eer.Q, true), $$5.a(f))
         );
      this.c(dqb.fo);
   }

   private void I(dpz $$0) {
      this.i.accept(fwh.a($$0, b(fwo.a($$0))).a(z));
   }

   private void S() {
      fwc $$0 = b(fwo.a(dqb.dL));
      fwc $$1 = b(fwo.a(dqb.dL, "_on"));
      this.c(dqb.dL);
      this.i
         .accept(
            fwh.a(dqb.dL)
               .a(a(eer.A, $$0, $$1))
               .a(
                  fwi.b(eer.X, eer.T)
                     .a(eem.c, jh.c, d.then(g))
                     .a(eem.c, jh.f, d.then(h))
                     .a(eem.c, jh.d, d)
                     .a(eem.c, jh.e, d.then(f))
                     .a(eem.a, jh.c, a)
                     .a(eem.a, jh.f, f)
                     .a(eem.a, jh.d, g)
                     .a(eem.a, jh.e, h)
                     .a(eem.b, jh.c, c)
                     .a(eem.b, jh.f, c.then(f))
                     .a(eem.b, jh.d, c.then(g))
                     .a(eem.b, jh.e, c.then(h))
               )
         );
   }

   private void T() {
      ame $$0 = this.a(dcz.gE, dqb.fF);
      this.a(dqb.fF, $$0, fwm.a(-9321636));
      gzl $$1 = a(fwo.a(dqb.fF));
      this.i.accept(fwh.a(dqb.fF, b($$1)));
   }

   private void U() {
      this.c(dqb.tY);
      this.i.accept(a(dqb.tY, b(fwo.a(dqb.tY))));
   }

   private void V() {
      this.i.accept(fwh.a(dqb.eu).a(fwi.a(eer.J).a(jh.a.a, b(fwo.a(dqb.eu, "_ns"))).a(jh.a.c, b(fwo.a(dqb.eu, "_ew")))));
   }

   private void W() {
      gzl $$0 = a(fwt.a.create(dqb.em, this.k));
      this.i
         .accept(
            fwh.a(
               dqb.em,
               a(
                  $$0,
                  $$0.a(c),
                  $$0.a(d),
                  $$0.a(e),
                  $$0.a(f),
                  $$0.a(f.then(c)),
                  $$0.a(f.then(d)),
                  $$0.a(f.then(e)),
                  $$0.a(g),
                  $$0.a(g.then(c)),
                  $$0.a(g.then(d)),
                  $$0.a(g.then(e)),
                  $$0.a(h),
                  $$0.a(h.then(c)),
                  $$0.a(h.then(d)),
                  $$0.a(h.then(e))
               )
            )
         );
   }

   private void X() {
      fwc $$0 = b(fwo.a(dqb.lu));
      fwc $$1 = b(fwo.a(dqb.lu, "_on"));
      this.i.accept(fwh.a(dqb.lu).a(a(eer.A, $$1, $$0)).a(v));
   }

   private void Y() {
      fwr $$0 = new fwr().a(fws.e, fwr.a(dqb.bI, "_bottom")).a(fws.i, fwr.a(dqb.bI, "_side"));
      ame $$1 = fwr.a(dqb.bI, "_top_sticky");
      ame $$2 = fwr.a(dqb.bI, "_top");
      fwr $$3 = $$0.c(fws.F, $$1);
      fwr $$4 = $$0.c(fws.F, $$2);
      fwc $$5 = b(fwo.a(dqb.bI, "_base"));
      this.a(dqb.bI, $$5, $$4);
      this.a(dqb.by, $$5, $$3);
      ame $$6 = fwq.n.a(dqb.bI, "_inventory", $$0.c(fws.f, $$2), this.k);
      ame $$7 = fwq.n.a(dqb.by, "_inventory", $$0.c(fws.f, $$1), this.k);
      this.a(dqb.bI, $$6);
      this.a(dqb.by, $$7);
   }

   private void a(dpz $$0, fwc $$1, fwr $$2) {
      fwc $$3 = b(fwq.bs.a($$0, $$2, this.k));
      this.i.accept(fwh.a($$0).a(a(eer.j, $$1, $$3)).a(v));
   }

   private void Z() {
      fwr $$0 = new fwr().a(fws.G, fwr.a(dqb.bI, "_top")).a(fws.i, fwr.a(dqb.bI, "_side"));
      fwr $$1 = $$0.c(fws.F, fwr.a(dqb.bI, "_top_sticky"));
      fwr $$2 = $$0.c(fws.F, fwr.a(dqb.bI, "_top"));
      this.i
         .accept(
            fwh.a(dqb.bJ)
               .a(
                  fwi.a(eer.B, eer.bk)
                     .a(false, efd.a, b(fwq.bt.a(dqb.bI, "_head", $$2, this.k)))
                     .a(false, efd.b, b(fwq.bt.a(dqb.bI, "_head_sticky", $$1, this.k)))
                     .a(true, efd.a, b(fwq.bu.a(dqb.bI, "_head_short", $$2, this.k)))
                     .a(true, efd.b, b(fwq.bu.a(dqb.bI, "_head_short_sticky", $$1, this.k)))
               )
               .a(v)
         );
   }

   private void aa() {
      dpz $$0 = dqb.uc;
      fwr $$1 = fwr.a($$0, "_side_inactive", "_top_inactive");
      fwr $$2 = fwr.a($$0, "_side_active", "_top_active");
      fwr $$3 = fwr.a($$0, "_side_active", "_top_ejecting_reward");
      fwr $$4 = fwr.a($$0, "_side_inactive_ominous", "_top_inactive_ominous");
      fwr $$5 = fwr.a($$0, "_side_active_ominous", "_top_active_ominous");
      fwr $$6 = fwr.a($$0, "_side_active_ominous", "_top_ejecting_reward_ominous");
      ame $$7 = fwq.o.a($$0, $$1, this.k);
      fwc $$8 = b($$7);
      fwc $$9 = b(fwq.o.a($$0, "_active", $$2, this.k));
      fwc $$10 = b(fwq.o.a($$0, "_ejecting_reward", $$3, this.k));
      fwc $$11 = b(fwq.o.a($$0, "_inactive_ominous", $$4, this.k));
      fwc $$12 = b(fwq.o.a($$0, "_active_ominous", $$5, this.k));
      fwc $$13 = b(fwq.o.a($$0, "_ejecting_reward_ominous", $$6, this.k));
      this.a($$0, $$7);
      this.i.accept(fwh.a($$0).a(fwi.a(eer.bC, eer.bF).a(($$6x, $$7x) -> {
         return switch ($$6x) {
            case a, f -> $$7x ? $$11 : $$8;
            case b, c, d -> $$7x ? $$12 : $$9;
            case e -> $$7x ? $$13 : $$10;
         };
      })));
   }

   private void ab() {
      dpz $$0 = dqb.ud;
      fwr $$1 = fwr.a($$0, "_front_off", "_side_off", "_top", "_bottom");
      fwr $$2 = fwr.a($$0, "_front_on", "_side_on", "_top", "_bottom");
      fwr $$3 = fwr.a($$0, "_front_ejecting", "_side_on", "_top", "_bottom");
      fwr $$4 = fwr.a($$0, "_front_ejecting", "_side_on", "_top_ejecting", "_bottom");
      ame $$5 = fwq.cc.a($$0, $$1, this.k);
      fwc $$6 = b($$5);
      fwc $$7 = b(fwq.cc.a($$0, "_active", $$2, this.k));
      fwc $$8 = b(fwq.cc.a($$0, "_unlocking", $$3, this.k));
      fwc $$9 = b(fwq.cc.a($$0, "_ejecting_reward", $$4, this.k));
      fwr $$10 = fwr.a($$0, "_front_off_ominous", "_side_off_ominous", "_top_ominous", "_bottom_ominous");
      fwr $$11 = fwr.a($$0, "_front_on_ominous", "_side_on_ominous", "_top_ominous", "_bottom_ominous");
      fwr $$12 = fwr.a($$0, "_front_ejecting_ominous", "_side_on_ominous", "_top_ominous", "_bottom_ominous");
      fwr $$13 = fwr.a($$0, "_front_ejecting_ominous", "_side_on_ominous", "_top_ejecting_ominous", "_bottom_ominous");
      fwc $$14 = b(fwq.cc.a($$0, "_ominous", $$10, this.k));
      fwc $$15 = b(fwq.cc.a($$0, "_active_ominous", $$11, this.k));
      fwc $$16 = b(fwq.cc.a($$0, "_unlocking_ominous", $$12, this.k));
      fwc $$17 = b(fwq.cc.a($$0, "_ejecting_reward_ominous", $$13, this.k));
      this.a($$0, $$5);
      this.i.accept(fwh.a($$0).a(fwi.a(dzk.b, dzk.d).a(($$8x, $$9x) -> {
         return switch ($$8x) {
            case a -> $$9x ? $$14 : $$6;
            case b -> $$9x ? $$15 : $$7;
            case c -> $$9x ? $$16 : $$8;
            case d -> $$9x ? $$17 : $$9;
         };
      })).a(z));
   }

   private void ac() {
      ame $$0 = fwo.a(dqb.rz, "_inactive");
      fwc $$1 = b($$0);
      fwc $$2 = b(fwo.a(dqb.rz, "_active"));
      this.a(dqb.rz, $$0);
      this.i.accept(fwh.a(dqb.rz).a(fwi.a(eer.bs).a($$2x -> $$2x != efi.b && $$2x != efi.c ? $$1 : $$2)));
   }

   private void ad() {
      ame $$0 = fwo.a(dqb.rA, "_inactive");
      fwc $$1 = b($$0);
      fwc $$2 = b(fwo.a(dqb.rA, "_active"));
      this.a(dqb.rA, $$0);
      this.i.accept(fwh.a(dqb.rA).a(fwi.a(eer.bs).a($$2x -> $$2x != efi.b && $$2x != efi.c ? $$1 : $$2)).a(z));
   }

   private void ae() {
      ame $$0 = fwq.cb.a(dqb.rE, fwr.a(false), this.k);
      fwc $$1 = b($$0);
      fwc $$2 = b(fwq.cb.a(dqb.rE, "_can_summon", fwr.a(true), this.k));
      this.a(dqb.rE, $$0);
      this.i.accept(fwh.a(dqb.rE).a(a(eer.e, $$2, $$1)));
   }

   private void af() {
      ame $$0 = fwo.a(dqb.oz, "_stable");
      fwc $$1 = b($$0);
      fwc $$2 = b(fwo.a(dqb.oz, "_unstable"));
      this.a(dqb.oz, $$0);
      this.i.accept(fwh.a(dqb.oz).a(a(eer.d, $$2, $$1)));
   }

   private void ag() {
      fwc $$0 = b(this.a(dqb.te, "", fwq.ao, fwr::c));
      fwc $$1 = b(this.a(dqb.te, "_lit", fwq.ao, fwr::c));
      this.i.accept(fwh.a(dqb.te).a(a(eer.b, $$1, $$0)));
      fwc $$2 = b(this.a(dqb.tf, "", fwq.ao, fwr::c));
      fwc $$3 = b(this.a(dqb.tf, "_lit", fwq.ao, fwr::c));
      this.i.accept(fwh.a(dqb.tf).a(a(eer.b, $$3, $$2)));
   }

   private void ah() {
      fwc $$0 = b(fwt.a.create(dqb.ga, this.k));
      fwc $$1 = b(this.a(dqb.ga, "_on", fwq.c, fwr::b));
      this.i.accept(fwh.a(dqb.ga).a(a(eer.u, $$1, $$0)));
   }

   private void m(dpz $$0, dpz $$1) {
      fwr $$2 = fwr.B($$0);
      this.i.accept(a($$0, b(fwq.bm.a($$0, $$2, this.k))));
      this.i.accept(fwh.a($$1, b(fwq.bo.a($$1, $$2, this.k))).a(x));
      this.c($$0);
   }

   private void ai() {
      fwr $$0 = fwr.B(dqb.ea);
      fwr $$1 = fwr.i(fwr.a(dqb.ea, "_off"));
      fwc $$2 = b(fwq.bq.a(dqb.ea, $$0, this.k));
      fwc $$3 = b(fwq.bn.a(dqb.ea, "_off", $$1, this.k));
      this.i.accept(fwh.a(dqb.ea).a(a(eer.u, $$2, $$3)));
      fwc $$4 = b(fwq.br.a(dqb.eb, $$0, this.k));
      fwc $$5 = b(fwq.bp.a(dqb.eb, "_off", $$1, this.k));
      this.i.accept(fwh.a(dqb.eb).a(a(eer.u, $$4, $$5)).a(x));
      this.c(dqb.ea);
   }

   private void aj() {
      this.b(dcz.mp);
      this.i.accept(fwh.a(dqb.ey).a(fwi.a(eer.aD, eer.v, eer.A).a(($$0, $$1, $$2) -> {
         StringBuilder $$3 = new StringBuilder();
         $$3.append('_').append($$0).append("tick");
         if ($$2) {
            $$3.append("_on");
         }

         if ($$1) {
            $$3.append("_locked");
         }

         return b(fwr.a(dqb.ey, $$3.toString()));
      })).a(y));
   }

   private void ak() {
      this.b(dcz.de);
      this.i
         .accept(
            fwh.a(dqb.nC)
               .a(
                  fwi.a(eer.aV, eer.I)
                     .a(1, false, b(a(fwo.a("dead_sea_pickle"))))
                     .a(2, false, b(a(fwo.a("two_dead_sea_pickles"))))
                     .a(3, false, b(a(fwo.a("three_dead_sea_pickles"))))
                     .a(4, false, b(a(fwo.a("four_dead_sea_pickles"))))
                     .a(1, true, b(a(fwo.a("sea_pickle"))))
                     .a(2, true, b(a(fwo.a("two_sea_pickles"))))
                     .a(3, true, b(a(fwo.a("three_sea_pickles"))))
                     .a(4, true, b(a(fwo.a("four_sea_pickles"))))
               )
         );
   }

   private void al() {
      fwr $$0 = fwr.a(dqb.ed);
      fwc $$1 = b(fwq.c.a(dqb.ef, $$0, this.k));
      this.i.accept(fwh.a(dqb.ed).a(fwi.a(eer.aI).a($$1x -> $$1x < 8 ? b(fwo.a(dqb.ed, "_height" + $$1x * 2)) : $$1)));
      this.a(dqb.ed, fwo.a(dqb.ed, "_height2"));
      this.i.accept(a(dqb.ef, $$1));
   }

   private void am() {
      this.i.accept(fwh.a(dqb.oJ, b(fwo.a(dqb.oJ))).a(z));
   }

   private void an() {
      ame $$0 = fwt.a.create(dqb.pH, this.k);
      this.a(dqb.pH, $$0);
      this.i.accept(fwh.a(dqb.pH).a(fwi.a(eer.bn).a($$0x -> b(this.a(dqb.pH, "_" + $$0x.c(), fwq.c, fwr::b)))));
   }

   private void ao() {
      Map<efm, ame> $$0 = new HashMap<>();

      for (efm $$1 : efm.values()) {
         $$0.put($$1, this.a(dqb.pJ, "_" + $$1.c(), fwq.c, fwr::b));
      }

      this.i.accept(fwh.a(dqb.pJ).a(fwi.a(eer.bG).a($$1x -> b($$0.get($$1x)))));
      this.j.a(dcz.pr, fwm.a(dyt.b, fwm.a($$0.get(efm.a)), Map.of(efm.c, fwm.a($$0.get(efm.c)), efm.b, fwm.a($$0.get(efm.b)), efm.d, fwm.a($$0.get(efm.d)))));
   }

   private void ap() {
      this.b(dcz.ya);
      this.i.accept(fwh.a(dqb.oP).a(fwi.a(eer.av).a($$0 -> b(this.a(dqb.oP, "_stage" + $$0, fwq.ao, fwr::c)))));
   }

   private void aq() {
      this.b(dcz.qx);
      this.i
         .accept(
            fwh.a(dqb.gh)
               .a(
                  fwi.a(eer.a, eer.O, eer.N, eer.P, eer.Q)
                     .a(false, false, false, false, false, b(fwo.a(dqb.gh, "_ns")))
                     .a(false, true, false, false, false, b(fwo.a(dqb.gh, "_n")).a(f))
                     .a(false, false, true, false, false, b(fwo.a(dqb.gh, "_n")))
                     .a(false, false, false, true, false, b(fwo.a(dqb.gh, "_n")).a(g))
                     .a(false, false, false, false, true, b(fwo.a(dqb.gh, "_n")).a(h))
                     .a(false, true, true, false, false, b(fwo.a(dqb.gh, "_ne")))
                     .a(false, true, false, true, false, b(fwo.a(dqb.gh, "_ne")).a(f))
                     .a(false, false, false, true, true, b(fwo.a(dqb.gh, "_ne")).a(g))
                     .a(false, false, true, false, true, b(fwo.a(dqb.gh, "_ne")).a(h))
                     .a(false, false, true, true, false, b(fwo.a(dqb.gh, "_ns")))
                     .a(false, true, false, false, true, b(fwo.a(dqb.gh, "_ns")).a(f))
                     .a(false, true, true, true, false, b(fwo.a(dqb.gh, "_nse")))
                     .a(false, true, false, true, true, b(fwo.a(dqb.gh, "_nse")).a(f))
                     .a(false, false, true, true, true, b(fwo.a(dqb.gh, "_nse")).a(g))
                     .a(false, true, true, false, true, b(fwo.a(dqb.gh, "_nse")).a(h))
                     .a(false, true, true, true, true, b(fwo.a(dqb.gh, "_nsew")))
                     .a(true, false, false, false, false, b(fwo.a(dqb.gh, "_attached_ns")))
                     .a(true, false, true, false, false, b(fwo.a(dqb.gh, "_attached_n")))
                     .a(true, false, false, true, false, b(fwo.a(dqb.gh, "_attached_n")).a(g))
                     .a(true, true, false, false, false, b(fwo.a(dqb.gh, "_attached_n")).a(f))
                     .a(true, false, false, false, true, b(fwo.a(dqb.gh, "_attached_n")).a(h))
                     .a(true, true, true, false, false, b(fwo.a(dqb.gh, "_attached_ne")))
                     .a(true, true, false, true, false, b(fwo.a(dqb.gh, "_attached_ne")).a(f))
                     .a(true, false, false, true, true, b(fwo.a(dqb.gh, "_attached_ne")).a(g))
                     .a(true, false, true, false, true, b(fwo.a(dqb.gh, "_attached_ne")).a(h))
                     .a(true, false, true, true, false, b(fwo.a(dqb.gh, "_attached_ns")))
                     .a(true, true, false, false, true, b(fwo.a(dqb.gh, "_attached_ns")).a(f))
                     .a(true, true, true, true, false, b(fwo.a(dqb.gh, "_attached_nse")))
                     .a(true, true, false, true, true, b(fwo.a(dqb.gh, "_attached_nse")).a(f))
                     .a(true, false, true, true, true, b(fwo.a(dqb.gh, "_attached_nse")).a(g))
                     .a(true, true, true, false, true, b(fwo.a(dqb.gh, "_attached_nse")).a(h))
                     .a(true, true, true, true, true, b(fwo.a(dqb.gh, "_attached_nsew")))
               )
         );
   }

   private void ar() {
      this.c(dqb.gg);
      this.i.accept(fwh.a(dqb.gg).a(fwi.a(eer.a, eer.A).a(($$0, $$1) -> b(fwo.a(dqb.gg, ($$0 ? "_attached" : "") + ($$1 ? "_on" : ""))))).a(z));
   }

   private gzl a(int $$0, String $$1, fwr $$2) {
      return switch ($$0) {
         case 1 -> a(fwq.bw.a(fwo.a($$1 + "turtle_egg"), $$2, this.k));
         case 2 -> a(fwq.by.a(fwo.a("two_" + $$1 + "turtle_eggs"), $$2, this.k));
         case 3 -> a(fwq.bz.a(fwo.a("three_" + $$1 + "turtle_eggs"), $$2, this.k));
         case 4 -> a(fwq.bA.a(fwo.a("four_" + $$1 + "turtle_eggs"), $$2, this.k));
         default -> throw new UnsupportedOperationException();
      };
   }

   private gzl a(int $$0, int $$1) {
      return switch ($$1) {
         case 0 -> this.a($$0, "", fwr.b(fwr.J(dqb.mL)));
         case 1 -> this.a($$0, "slightly_cracked_", fwr.b(fwr.a(dqb.mL, "_slightly_cracked")));
         case 2 -> this.a($$0, "very_cracked_", fwr.b(fwr.a(dqb.mL, "_very_cracked")));
         default -> throw new UnsupportedOperationException();
      };
   }

   private void as() {
      this.b(dcz.kT);
      this.i.accept(fwh.a(dqb.mL).a(fwi.a(eer.aG, eer.aH).a(($$0, $$1) -> b(this.a($$0.intValue(), $$1.intValue())))));
   }

   private void at() {
      ame $$0 = fwo.a(dqb.mN, "_hydration_0");
      this.a(dqb.mN, $$0);
      Function<Integer, ame> $$1 = $$0x -> {
         String $$1x = switch ($$0x) {
            case 1 -> "_hydration_1";
            case 2 -> "_hydration_2";
            case 3 -> "_hydration_3";
            default -> "_hydration_0";
         };
         fwr $$2 = fwr.b($$1x);
         return fwq.bx.a(dqb.mN, $$1x, $$2, this.k);
      };
      this.i.accept(fwh.a(dqb.mN).a(fwi.a(dsk.c).a($$1x -> b($$1.apply($$1x)))).a(z));
   }

   private void au() {
      this.b(dcz.kU);
      this.i.accept(fwh.a(dqb.mM).a(fwi.a(dxs.c).a($$0 -> {
         String $$1 = switch ($$0) {
            case 1 -> "_slightly_cracked";
            case 2 -> "_very_cracked";
            default -> "_not_cracked";
         };
         fwr $$2 = fwr.a($$1);
         return b(fwq.bI.a(dqb.mM, $$1, $$2, this.k));
      })));
   }

   private void J(dpz $$0) {
      this.c($$0);
      this.K($$0);
   }

   private void b(dpz $$0, dcr $$1) {
      this.b($$1);
      this.K($$0);
   }

   private static <T extends efe<?>> Map<T, gzm> a(eed<?, ?> $$0, Function<jh, T> $$1) {
      Builder<T, gzm> $$2 = ImmutableMap.builderWithExpectedSize(C.size());
      C.forEach(($$3, $$4) -> {
         T $$5 = $$1.apply($$3);
         if ($$0.b($$5)) {
            $$2.put($$5, $$4);
         }
      });
      return $$2.build();
   }

   private void K(dpz $$0) {
      Map<efe<Boolean>, gzm> $$1 = a($$0.m(), dvg::b);
      fwf $$2 = b();
      $$1.forEach(($$1x, $$2x) -> $$2.a($$1x, false));
      fwc $$3 = b(fwo.a($$0));
      fwg $$4 = fwg.a($$0);
      $$1.forEach(($$3x, $$4x) -> {
         $$4.a(b().a($$3x, true), $$3.a($$4x));
         $$4.a($$2, $$3.a($$4x));
      });
      this.i.accept($$4);
   }

   private void L(dpz $$0) {
      Map<efe<efo>, gzm> $$1 = a($$0.m(), dve::a);
      fwf $$2 = b().a(dve.b, false);
      $$1.forEach(($$1x, $$2x) -> $$2.a($$1x, efo.a));
      fwc $$3 = b(fwt.j.create($$0, this.k));
      fwc $$4 = b(fwt.k.get($$0).a($$1x -> $$1x.a(fws.i, fwr.a($$0, "_side_tall"))).a($$0, "_side_tall", this.k));
      fwc $$5 = b(fwt.k.get($$0).a($$1x -> $$1x.a(fws.i, fwr.a($$0, "_side_small"))).a($$0, "_side_small", this.k));
      fwg $$6 = fwg.a($$0);
      $$6.a(b().a(dve.b, true), $$3);
      $$6.a($$2, $$3);
      $$1.forEach(($$4x, $$5x) -> {
         $$6.a(b().a($$4x, efo.c), $$4.a($$5x));
         $$6.a(b().a($$4x, efo.b), $$5.a($$5x));
         $$6.a($$2, $$4.a($$5x));
      });
      this.i.accept($$6);
   }

   private void M(dpz $$0) {
      this.c($$0);
      this.i.accept(fwh.a($$0).a(fwi.a(dtv.b).a($$1 -> {
         String $$2 = $$1 ? "_tip" : "";
         fwr $$3 = fwr.c(fwr.a($$0, $$2));
         return b(fvx.d.b.a().a($$0, $$2, $$3, this.k));
      })));
   }

   private void av() {
      ame $$0 = fwr.a(dqb.rD, "_bottom");
      fwr $$1 = new fwr().a(fws.e, $$0).a(fws.f, fwr.a(dqb.rD, "_top")).a(fws.i, fwr.a(dqb.rD, "_side"));
      fwr $$2 = new fwr().a(fws.e, $$0).a(fws.f, fwr.a(dqb.rD, "_top_bloom")).a(fws.i, fwr.a(dqb.rD, "_side_bloom"));
      ame $$3 = fwq.n.a(dqb.rD, $$1, this.k);
      fwc $$4 = b($$3);
      fwc $$5 = b(fwq.n.a(dqb.rD, "_bloom", $$2, this.k));
      this.i.accept(fwh.a(dqb.rD).a(fwi.a(eer.c).a($$2x -> $$2x ? $$5 : $$4)));
      this.a(dqb.rD, $$3);
   }

   private void aw() {
      dpz $$0 = dqb.cw;
      fwc $$1 = b(fwo.a($$0));
      fwg $$2 = fwg.a($$0);
      List.of(Pair.of(jh.c, a), Pair.of(jh.f, f), Pair.of(jh.d, g), Pair.of(jh.e, h)).forEach($$2x -> {
         jh $$3 = (jh)$$2x.getFirst();
         gzm $$4 = (gzm)$$2x.getSecond();
         gzp $$5 = b().a(eer.T, $$3).a();
         $$2.a($$5, $$1.a($$4).a(b));
         this.a($$2, $$5, $$4);
      });
      this.i.accept($$2);
      this.a($$0, fwo.a($$0, "_inventory"));
      D.clear();
   }

   private void a(fwg $$0, gzp $$1, gzm $$2) {
      List.of(
            Pair.of(eer.bt, fwq.aT),
            Pair.of(eer.bu, fwq.aU),
            Pair.of(eer.bv, fwq.aV),
            Pair.of(eer.bw, fwq.aW),
            Pair.of(eer.bx, fwq.aX),
            Pair.of(eer.by, fwq.aY)
         )
         .forEach($$3 -> {
            ees $$4 = (ees)$$3.getFirst();
            fwp $$5 = (fwp)$$3.getSecond();
            this.a($$0, $$1, $$2, $$4, $$5, true);
            this.a($$0, $$1, $$2, $$4, $$5, false);
         });
   }

   private void a(fwg $$0, gzp $$1, gzm $$2, ees $$3, fwp $$4, boolean $$5) {
      String $$6 = $$5 ? "_occupied" : "_empty";
      fwr $$7 = new fwr().a(fws.b, fwr.a(dqb.cw, $$6));
      fvx.c $$8 = new fvx.c($$4, $$6);
      fwc $$9 = b(D.computeIfAbsent($$8, $$3x -> $$4.a(dqb.cw, $$6, $$7, this.k)));
      $$0.a(new gzo(gzo.a.a, List.of($$1, b().a($$3, $$5).a())), $$9.a($$2));
   }

   private void ax() {
      fwc $$0 = b(fwq.c.a(dqb.lp, fwr.b(fwo.a("magma")), this.k));
      this.i.accept(a(dqb.lp, $$0));
   }

   private void a(dpz $$0, @Nullable dbt $$1) {
      this.r($$0);
      dcr $$2 = $$0.h();
      ame $$3 = fwq.bP.a($$2, fwr.x($$0), this.k);
      hoe.b $$4 = $$1 != null ? fwm.a($$3, new hqt.a($$1)) : fwm.a($$3, new hqt.a());
      this.j.a($$2, $$4);
   }

   private void c(dpz $$0, dpz $$1, fvx.d $$2) {
      this.b($$0, $$2);
      this.b($$1, $$2);
   }

   private void ay() {
      ame $$0 = fwo.a(dqb.b);
      gzl $$1 = a($$0);
      gzl $$2 = a(fwo.a(dqb.b, "_mirrored"));
      this.i.accept(fwh.a(dqb.ff, a($$1, $$2)));
      this.a(dqb.ff, $$0);
   }

   private void az() {
      ame $$0 = fwo.a(dqb.tu);
      gzl $$1 = a($$0);
      gzl $$2 = a(fwo.a(dqb.tu, "_mirrored"));
      this.i.accept(fwh.a(dqb.tO, a($$1, $$2)).a(c()));
      this.a(dqb.tO, $$0);
   }

   private void n(dpz $$0, dpz $$1) {
      this.a($$0, fvx.d.b);
      fwr $$2 = fwr.d(fwr.a($$0, "_pot"));
      fwc $$3 = b(fvx.d.b.b().a($$1, $$2, this.k));
      this.i.accept(a($$1, $$3));
   }

   private void aA() {
      ame $$0 = fwr.a(dqb.pU, "_bottom");
      ame $$1 = fwr.a(dqb.pU, "_top_off");
      ame $$2 = fwr.a(dqb.pU, "_top");
      ame[] $$3 = new ame[5];

      for (int $$4 = 0; $$4 < 5; $$4++) {
         fwr $$5 = new fwr().a(fws.e, $$0).a(fws.f, $$4 == 0 ? $$1 : $$2).a(fws.i, fwr.a(dqb.pU, "_side" + $$4));
         $$3[$$4] = fwq.n.a(dqb.pU, "_" + $$4, $$5, this.k);
      }

      this.i.accept(fwh.a(dqb.pU).a(fwi.a(eer.bc).a($$1x -> b($$3[$$1x]))));
      this.a(dqb.pU, $$3[0]);
   }

   private static gzm a(jj $$0) {
      return switch ($$0) {
         case b -> c;
         case c -> c.then(g);
         case d -> c.then(h);
         case a -> c.then(f);
         case f -> e.then(g);
         case g -> e;
         case h -> e.then(f);
         case e -> e.then(h);
         case k -> a;
         case l -> g;
         case i -> h;
         case j -> f;
      };
   }

   private void aB() {
      ame $$0 = fwr.a(dqb.pI, "_top");
      ame $$1 = fwr.a(dqb.pI, "_bottom");
      ame $$2 = fwr.a(dqb.pI, "_side");
      ame $$3 = fwr.a(dqb.pI, "_lock");
      fwr $$4 = new fwr().a(fws.o, $$2).a(fws.m, $$2).a(fws.l, $$2).a(fws.c, $$0).a(fws.j, $$0).a(fws.k, $$1).a(fws.n, $$3);
      this.i.accept(fwh.a(dqb.pI, b(fwq.b.a(dqb.pI, $$4, this.k))).a(fwi.b(eer.W).a(fvx::a)));
   }

   private void aC() {
      dpz $$0 = dqb.n;
      fwc $$1 = b(fwo.a($$0));
      fwr $$2 = fwr.a($$0);
      dpz $$3 = dqb.kk;
      fwc $$4 = b(fwq.ab.a($$3, $$2, this.k));
      fwc $$5 = b(fwq.ac.a($$3, $$2, this.k));
      this.i.accept(e($$3, $$4, $$5, $$1));
   }

   private void a(dpz $$0, dpz $$1, dxm.a $$2, ame $$3) {
      fwc $$4 = b(fwo.a("skull"));
      this.i.accept(a($$0, $$4));
      this.i.accept(a($$1, $$4));
      if ($$2 == dxm.b.e) {
         this.j.a($$0.h(), fwm.a($$3, new hqr.b()));
      } else {
         this.j.a($$0.h(), fwm.a($$3, new hqu.a($$2)));
      }
   }

   private void aD() {
      ame $$0 = fwo.b("template_skull");
      this.a(dqb.hn, dqb.ho, dxm.b.g, $$0);
      this.a(dqb.hl, dqb.hm, dxm.b.e, $$0);
      this.a(dqb.hj, dqb.hk, dxm.b.f, $$0);
      this.a(dqb.hf, dqb.hg, dxm.b.c, $$0);
      this.a(dqb.hh, dqb.hi, dxm.b.d, $$0);
      this.a(dqb.hr, dqb.hs, dxm.b.h, $$0);
      this.a(dqb.hp, dqb.hq, dxm.b.i, fwo.a(dcz.vS));
   }

   private void a(dpz $$0, dpz $$1, dbt $$2) {
      fwc $$3 = b(fwo.a("banner"));
      ame $$4 = fwo.b("template_banner");
      this.i.accept(a($$0, $$3));
      this.i.accept(a($$1, $$3));
      dcr $$5 = $$0.h();
      this.j.a($$5, fwm.a($$4, new hqk.a($$2)));
   }

   private void aE() {
      this.a(dqb.jl, dqb.jB, dbt.a);
      this.a(dqb.jm, dqb.jC, dbt.b);
      this.a(dqb.jn, dqb.jD, dbt.c);
      this.a(dqb.jo, dqb.jE, dbt.d);
      this.a(dqb.jp, dqb.jF, dbt.e);
      this.a(dqb.jq, dqb.jG, dbt.f);
      this.a(dqb.jr, dqb.jH, dbt.g);
      this.a(dqb.js, dqb.jI, dbt.h);
      this.a(dqb.jt, dqb.jJ, dbt.i);
      this.a(dqb.ju, dqb.jK, dbt.j);
      this.a(dqb.jv, dqb.jL, dbt.k);
      this.a(dqb.jw, dqb.jM, dbt.l);
      this.a(dqb.jx, dqb.jN, dbt.m);
      this.a(dqb.jy, dqb.jO, dbt.n);
      this.a(dqb.jz, dqb.jP, dbt.o);
      this.a(dqb.jA, dqb.jQ, dbt.p);
   }

   private void a(dpz $$0, dpz $$1, ame $$2, boolean $$3) {
      this.a($$0, $$1);
      dcr $$4 = $$0.h();
      ame $$5 = fwq.bR.a($$4, fwr.x($$1), this.k);
      hoe.b $$6 = fwm.a($$5, new hqm.a($$2));
      if ($$3) {
         hoe.b $$7 = fwm.a($$5, new hqm.a(hqm.a));
         this.j.a($$4, fwm.b($$7, $$6));
      } else {
         this.j.a($$4, $$6);
      }
   }

   private void aF() {
      this.a(dqb.cG, dqb.n, hqm.b, true);
      this.a(dqb.hw, dqb.n, hqm.c, true);
      this.a(dqb.gf, dqb.cy, hqm.d, false);
   }

   private void b(dpz $$0, dpz $$1, dbt $$2) {
      fwc $$3 = b(fwo.a("bed"));
      this.i.accept(a($$0, $$3));
      dcr $$4 = $$0.h();
      ame $$5 = fwq.bQ.a(fwo.a($$4), fwr.x($$1), this.k);
      this.j.a($$4, fwm.a($$5, new hql.a($$2)));
   }

   private void aG() {
      this.b(dqb.bg, dqb.bK, dbt.a);
      this.b(dqb.bh, dqb.bL, dbt.b);
      this.b(dqb.bi, dqb.bM, dbt.c);
      this.b(dqb.bj, dqb.bN, dbt.d);
      this.b(dqb.bk, dqb.bO, dbt.e);
      this.b(dqb.bl, dqb.bP, dbt.f);
      this.b(dqb.bm, dqb.bQ, dbt.g);
      this.b(dqb.bn, dqb.bR, dbt.h);
      this.b(dqb.bo, dqb.bS, dbt.i);
      this.b(dqb.bp, dqb.bT, dbt.j);
      this.b(dqb.bq, dqb.bU, dbt.k);
      this.b(dqb.br, dqb.bV, dbt.l);
      this.b(dqb.bs, dqb.bW, dbt.m);
      this.b(dqb.bt, dqb.bX, dbt.n);
      this.b(dqb.bu, dqb.bY, dbt.o);
      this.b(dqb.bv, dqb.bZ, dbt.p);
   }

   private void a(dpz $$0, hqv.a $$1) {
      dcr $$2 = $$0.h();
      ame $$3 = fwo.a($$2);
      this.j.a($$2, fwm.a($$3, $$1));
   }

   public void a() {
      mp.a().filter(mq::c).forEach($$0 -> this.i($$0.a()).a($$0));
      this.i(dqb.rO).a(mp.x).a(dqb.rO, dqb.sm).a(dqb.rS, dqb.rW).a(mp.z);
      this.i(dqb.rN).a(mp.B).a(dqb.rN, dqb.sl).a(dqb.rR, dqb.rV).a(mp.D);
      this.i(dqb.rM).a(mp.F).a(dqb.rM, dqb.sk).a(dqb.rQ, dqb.rU).a(mp.H);
      this.i(dqb.rL).a(mp.J).a(dqb.rL, dqb.sj).a(dqb.rP, dqb.rT).a(mp.L);
      this.A(dqb.sT);
      this.A(dqb.sU);
      this.A(dqb.sV);
      this.A(dqb.sW);
      this.j(dqb.sT, dqb.sX);
      this.j(dqb.sU, dqb.sY);
      this.j(dqb.sV, dqb.sZ);
      this.j(dqb.sW, dqb.ta);
      this.n(dqb.a);
      this.d(dqb.nJ, dqb.a);
      this.d(dqb.nI, dqb.a);
      this.n(dqb.gn);
      this.n(dqb.eg);
      this.d(dqb.nK, dqb.J);
      this.n(dqb.fZ);
      this.n(dqb.mK);
      this.n(dqb.fQ);
      this.n(dqb.gq);
      this.b(dcz.vG);
      this.n(dqb.pP);
      this.n(dqb.J);
      this.n(dqb.K);
      this.n(dqb.ix);
      this.b(dcz.go);
      this.o(dqb.qv, dqb.qM);
      this.o(dqb.qw, dqb.qN);
      this.o(dqb.qx, dqb.qO);
      this.o(dqb.qy, dqb.qP);
      this.o(dqb.qz, dqb.qQ);
      this.o(dqb.qA, dqb.qR);
      this.o(dqb.qB, dqb.qS);
      this.o(dqb.qC, dqb.qT);
      this.o(dqb.qD, dqb.qU);
      this.o(dqb.qE, dqb.qV);
      this.o(dqb.qF, dqb.qW);
      this.o(dqb.qG, dqb.qX);
      this.o(dqb.qH, dqb.qY);
      this.o(dqb.qI, dqb.qZ);
      this.o(dqb.qJ, dqb.ra);
      this.o(dqb.qK, dqb.rb);
      this.o(dqb.qu, dqb.qL);
      this.n(dqb.nH);
      this.n(dqb.gS);
      this.n(dqb.ry);
      this.n(dqb.tg);
      this.w(dqb.th);
      this.w(dqb.ti);
      this.x(dqb.tT);
      this.x(dqb.tU);
      this.ag();
      this.h(dqb.tn, dqb.tj);
      this.L(dqb.ug);
      this.M(dqb.uh);
      this.a(dqb.uf);
      this.t(dqb.tk);
      this.t(dqb.tl);
      this.s(dqb.tm);
      this.b(dqb.um, fvx.d.c);
      this.b(dcz.da);
      this.a(dqb.iy, dcz.if);
      this.b(dcz.if);
      this.aH();
      this.a(dqb.lt, dcz.jF);
      this.b(dcz.jF);
      this.b(dqb.ca, fwr.a(dqb.bI, "_side"));
      this.a(dqb.U);
      this.a(dqb.V);
      this.a(dqb.jd);
      this.a(dqb.cI);
      this.a(dqb.cJ);
      this.a(dqb.cK);
      this.a(dqb.gd);
      this.a(dqb.ge);
      this.a(dqb.gi);
      this.a(dqb.Q);
      this.a(dqb.W);
      this.a(dqb.R);
      this.a(dqb.cr);
      this.a(dqb.S);
      this.a(dqb.T);
      this.a(dqb.cs);
      this.b(dqb.pS, fwt.d);
      this.a(dqb.pR);
      this.a(dqb.aY);
      this.a(dqb.aZ);
      this.a(dqb.ba);
      this.a(dqb.fG);
      this.a(dqb.hC);
      this.a(dqb.dY);
      this.a(dqb.dZ);
      this.a(dqb.hB);
      this.a(dqb.ql);
      this.a(dqb.nD);
      this.a(dqb.ei);
      this.a(dqb.k);
      this.a(dqb.pT);
      this.a(dqb.fY);
      this.a(dqb.et);
      this.a(dqb.O);
      this.a(dqb.pQ);
      this.a(dqb.ee);
      this.b(dqb.ek, fwt.g);
      this.b(dqb.pZ, fwt.d);
      this.b(dqb.fs, fwt.d);
      this.n(dqb.ag);
      this.n(dqb.gA);
      this.a(dqb.lq);
      this.a(dqb.bf);
      this.a(dqb.je);
      this.a(dqb.cy);
      this.a(dqb.qt);
      this.a(dqb.iK);
      this.a(dqb.pf);
      this.a(dqb.en);
      this.a(dqb.eo);
      this.b(dqb.cD, fwt.b);
      this.g(dqb.cE);
      this.a(dqb.aV);
      this.b(dqb.bG, fwt.z);
      this.b(dcz.dd);
      this.b(dqb.cu, fwt.f);
      this.b(dqb.pM, fwt.d);
      this.a(dqb.oW);
      this.a(dqb.aW);
      this.a(dqb.rc);
      this.a(dqb.rd);
      this.a(dqb.rw);
      this.a(dqb.td);
      this.a(dqb.tQ);
      this.a(dqb.tR);
      this.a(dqb.tS);
      this.d(dqb.rB);
      this.n(dqb.ue);
      this.aC();
      this.a(dqb.rJ);
      this.a(dqb.rK);
      this.a(dqb.rF);
      this.a(dqb.rG);
      this.a(dqb.rH);
      this.a(dqb.rI);
      this.l(dqb.rF, dqb.sf);
      this.l(dqb.rG, dqb.sh);
      this.l(dqb.rH, dqb.sg);
      this.l(dqb.rI, dqb.si);
      this.j(dqb.sv);
      this.j(dqb.sw);
      this.j(dqb.sy);
      this.j(dqb.sx);
      this.b(dqb.sv, dqb.sz);
      this.b(dqb.sw, dqb.sA);
      this.b(dqb.sy, dqb.sC);
      this.b(dqb.sx, dqb.sB);
      this.l(dqb.sD);
      this.l(dqb.sE);
      this.l(dqb.sG);
      this.l(dqb.sF);
      this.c(dqb.sD, dqb.sH);
      this.c(dqb.sE, dqb.sI);
      this.c(dqb.sG, dqb.sK);
      this.c(dqb.sF, dqb.sJ);
      this.a(dqb.sL);
      this.a(dqb.sM);
      this.a(dqb.sN);
      this.a(dqb.sO);
      this.l(dqb.sL, dqb.sP);
      this.l(dqb.sM, dqb.sQ);
      this.l(dqb.sN, dqb.sR);
      this.l(dqb.sO, dqb.sS);
      this.k(dqb.hx, dqb.cr);
      this.k(dqb.hy, dqb.cs);
      this.D();
      this.o();
      this.aw();
      this.s();
      this.t();
      this.a(dqb.oN, dqb.oO);
      this.u();
      this.x();
      this.y();
      this.B();
      this.C();
      this.F();
      this.A();
      this.D(dqb.kZ);
      this.G();
      this.H();
      this.I();
      this.J();
      this.M();
      this.N();
      this.O();
      this.P();
      this.n();
      this.Q();
      this.R();
      this.S();
      this.T();
      this.V();
      this.W();
      this.X();
      this.Y();
      this.Z();
      this.af();
      this.ai();
      this.ah();
      this.aj();
      this.ak();
      this.v();
      this.al();
      this.am();
      this.an();
      this.ap();
      this.ao();
      this.a(dqb.pK);
      this.aq();
      this.ar();
      this.as();
      this.au();
      this.at();
      this.d();
      this.J(dqb.fy);
      this.J(dqb.rC);
      this.b(dqb.fz, dcz.gt);
      this.ax();
      this.aB();
      this.ac();
      this.ad();
      this.ae();
      this.U();
      this.L();
      this.K();
      this.aa();
      this.ab();
      this.I(dqb.da);
      this.c(dqb.da);
      this.I(dqb.oH);
      this.e();
      this.I(dqb.tp);
      this.m(dqb.cz, dqb.cA);
      this.m(dqb.er, dqb.es);
      this.a(dqb.cL, dqb.n, fwr::c);
      this.a(dqb.oF, dqb.p, fwr::d);
      this.C(dqb.pd);
      this.C(dqb.oU);
      this.z(dqb.bb);
      this.z(dqb.hJ);
      this.z();
      this.H(dqb.oL);
      this.H(dqb.oM);
      this.c(dqb.fp, b(fwo.a(dqb.fp)));
      this.a(dqb.ep, fwt.d);
      this.a(dqb.eq, fwt.d);
      this.a(dqb.tP);
      this.a(dqb.ls, fwt.d);
      this.e(dqb.j);
      this.e(dqb.ts);
      this.e(dqb.L);
      this.f(dqb.M);
      this.f(dqb.P);
      this.e(dqb.N);
      this.d(dqb.I);
      this.b(dqb.tZ, fwt.f);
      this.a(dqb.iL, fwt.d, fwt.e);
      this.a(dqb.ld, fwt.A, fwt.B);
      this.a(dqb.hG, fwt.A, fwt.B);
      this.a(dqb.tV, fwt.d, fwt.e);
      this.a(dqb.tW, fwt.d, fwt.e);
      this.a(dqb.tX, fwt.d, fwt.e);
      this.c(dqb.oA, fwt.i);
      this.w();
      this.a(dqb.pN, fwr::D);
      this.a(dqb.pO, fwr::F);
      this.a(dqb.lj, eer.av, 0, 1, 2, 3);
      this.a(dqb.gT, eer.ay, 0, 0, 1, 1, 2, 2, 2, 3);
      this.a(dqb.fP, eer.av, 0, 1, 1, 2);
      this.a(dqb.gU, eer.ay, 0, 0, 1, 1, 2, 2, 2, 3);
      this.a(dqb.cM, eer.ay, 0, 1, 2, 3, 4, 5, 6, 7);
      this.a(dqb.lg, fvx.d.b, eer.at, 0, 1);
      this.g();
      this.f();
      this.aE();
      this.aG();
      this.aD();
      this.aF();
      this.a(dqb.lv, null);
      this.a(dqb.lw, dbt.a);
      this.a(dqb.lx, dbt.b);
      this.a(dqb.ly, dbt.c);
      this.a(dqb.lz, dbt.d);
      this.a(dqb.lA, dbt.e);
      this.a(dqb.lB, dbt.f);
      this.a(dqb.lC, dbt.g);
      this.a(dqb.lD, dbt.h);
      this.a(dqb.lE, dbt.i);
      this.a(dqb.lF, dbt.j);
      this.a(dqb.lG, dbt.k);
      this.a(dqb.lH, dbt.l);
      this.a(dqb.lI, dbt.m);
      this.a(dqb.lJ, dbt.n);
      this.a(dqb.lK, dbt.o);
      this.a(dqb.lL, dbt.p);
      this.r(dqb.nE);
      this.a(dqb.nE, new hqn.a());
      this.a(dqb.ua, dqb.jc);
      this.a(dqb.ua, new hqo.a());
      this.a(dqb.fW, dqb.cy);
      this.a(dqb.ll, dqb.cy);
      this.a(dqb.aT);
      this.a(dqb.aU);
      this.a(dqb.mc);
      this.a(dqb.md);
      this.a(dqb.me);
      this.a(dqb.mf);
      this.a(dqb.mg);
      this.a(dqb.mh);
      this.a(dqb.mi);
      this.a(dqb.mj);
      this.a(dqb.mk);
      this.a(dqb.ml);
      this.a(dqb.mm);
      this.a(dqb.mn);
      this.a(dqb.mo);
      this.a(dqb.mp);
      this.a(dqb.mq);
      this.a(dqb.mr);
      this.a(fwt.a, dqb.ms, dqb.mt, dqb.mu, dqb.mv, dqb.mw, dqb.mx, dqb.my, dqb.mz, dqb.mA, dqb.mB, dqb.mC, dqb.mD, dqb.mE, dqb.mF, dqb.mG, dqb.mH);
      this.a(dqb.jc);
      this.a(dqb.hK);
      this.a(dqb.hL);
      this.a(dqb.hM);
      this.a(dqb.hN);
      this.a(dqb.hO);
      this.a(dqb.hP);
      this.a(dqb.hQ);
      this.a(dqb.hR);
      this.a(dqb.hS);
      this.a(dqb.hT);
      this.a(dqb.hU);
      this.a(dqb.hV);
      this.a(dqb.hW);
      this.a(dqb.hX);
      this.a(dqb.hY);
      this.a(dqb.hZ);
      this.a(dqb.rx);
      this.i(dqb.aX, dqb.fq);
      this.i(dqb.ez, dqb.ia);
      this.i(dqb.eA, dqb.ib);
      this.i(dqb.eB, dqb.ic);
      this.i(dqb.eC, dqb.id);
      this.i(dqb.eD, dqb.ie);
      this.i(dqb.eE, dqb.if);
      this.i(dqb.eF, dqb.ig);
      this.i(dqb.eG, dqb.ih);
      this.i(dqb.eH, dqb.ii);
      this.i(dqb.eI, dqb.ij);
      this.i(dqb.eJ, dqb.ik);
      this.i(dqb.eK, dqb.il);
      this.i(dqb.eL, dqb.im);
      this.i(dqb.eM, dqb.in);
      this.i(dqb.eN, dqb.io);
      this.i(dqb.eO, dqb.ip);
      this.b(fwt.t, dqb.lM, dqb.lN, dqb.lO, dqb.lP, dqb.lQ, dqb.lR, dqb.lS, dqb.lT, dqb.lU, dqb.lV, dqb.lW, dqb.lX, dqb.lY, dqb.lZ, dqb.ma, dqb.mb);
      this.h(dqb.bK, dqb.iM);
      this.h(dqb.bL, dqb.iN);
      this.h(dqb.bM, dqb.iO);
      this.h(dqb.bN, dqb.iP);
      this.h(dqb.bO, dqb.iQ);
      this.h(dqb.bP, dqb.iR);
      this.h(dqb.bQ, dqb.iS);
      this.h(dqb.bR, dqb.iT);
      this.h(dqb.bS, dqb.iU);
      this.h(dqb.bT, dqb.iV);
      this.h(dqb.bU, dqb.iW);
      this.h(dqb.bV, dqb.iX);
      this.h(dqb.bW, dqb.iY);
      this.h(dqb.bX, dqb.iZ);
      this.h(dqb.bY, dqb.ja);
      this.h(dqb.bZ, dqb.jb);
      this.a(dqb.tt);
      this.a(dqb.fd);
      this.b(dqb.bB, dqb.gB, fvx.d.a);
      this.h(dqb.bB);
      this.a(dqb.cb, dqb.gC, fvx.d.b);
      this.a(dqb.cd, dqb.gD, fvx.d.b);
      this.a(dqb.ui, dqb.uk, fvx.d.c);
      this.a(dqb.uj, dqb.ul, fvx.d.b);
      this.a(dqb.ce, dqb.gE, fvx.d.b);
      this.a(dqb.cf, dqb.gF, fvx.d.b);
      this.a(dqb.cg, dqb.gG, fvx.d.b);
      this.a(dqb.ch, dqb.gH, fvx.d.b);
      this.a(dqb.ci, dqb.gI, fvx.d.b);
      this.a(dqb.cj, dqb.gJ, fvx.d.b);
      this.a(dqb.ck, dqb.gK, fvx.d.b);
      this.a(dqb.cl, dqb.gL, fvx.d.b);
      this.a(dqb.cm, dqb.gM, fvx.d.b);
      this.a(dqb.co, dqb.gN, fvx.d.b);
      this.a(dqb.cn, dqb.gO, fvx.d.b);
      this.a(dqb.cq, dqb.gP, fvx.d.b);
      this.a(dqb.cp, dqb.gQ, fvx.d.b);
      this.a(dqb.bC, dqb.gR, fvx.d.b);
      this.a(dqb.cc, dqb.gr, fvx.d.b);
      this.E();
      this.y(dqb.fl);
      this.y(dqb.fm);
      this.y(dqb.fn);
      this.b(dqb.bA, fvx.d.a);
      this.h(dqb.bA);
      this.a(dqb.bE, fvx.d.b);
      this.a(dqb.bF, fvx.d.b);
      this.b(dqb.bD, fvx.d.a);
      this.h(dqb.bD);
      this.b(dqb.ej, fvx.d.a);
      this.b(dcz.dW);
      this.c(dqb.mI, dqb.mJ, fvx.d.b);
      this.b(dcz.dX);
      this.b(dqb.tr, fvx.d.b);
      this.c(dqb.pg, dqb.ph, fvx.d.b);
      this.c(dqb.pi, dqb.pj, fvx.d.b);
      this.a(dqb.pg, "_plant");
      this.a(dqb.pi, "_plant");
      this.a(dqb.nF, fvx.d.a, fwr.c(fwr.a(dqb.nG, "_stage0")));
      this.k();
      this.a(dqb.eh, fvx.d.b);
      this.a(dqb.bz, fvx.d.b);
      this.d(dqb.jg, fvx.d.b);
      this.d(dqb.jh, fvx.d.b);
      this.d(dqb.ji, fvx.d.b);
      this.o(dqb.jj);
      this.o(dqb.jk);
      this.h();
      this.i();
      this.j();
      this.a(dqb.nd, dqb.mY, dqb.mT, dqb.mO, dqb.nn, dqb.ni, dqb.nx, dqb.ns);
      this.a(dqb.ne, dqb.mZ, dqb.mU, dqb.mP, dqb.no, dqb.nj, dqb.ny, dqb.nt);
      this.a(dqb.nf, dqb.na, dqb.mV, dqb.mQ, dqb.np, dqb.nk, dqb.nz, dqb.nu);
      this.a(dqb.ng, dqb.nb, dqb.mW, dqb.mR, dqb.nq, dqb.nl, dqb.nA, dqb.nv);
      this.a(dqb.nh, dqb.nc, dqb.mX, dqb.mS, dqb.nr, dqb.nm, dqb.nB, dqb.nw);
      this.f(dqb.fw, dqb.fu);
      this.f(dqb.fv, dqb.ft);
      this.m(dqb.af).c(dqb.af).a(dqb.aA);
      this.m(dqb.ar).c(dqb.ar).a(dqb.aJ);
      this.a(dqb.ar, dqb.dx, dqb.dH);
      this.a(dqb.aS, fwt.w, -7158200);
      this.m(dqb.ab).c(dqb.ab).a(dqb.ax);
      this.m(dqb.am).c(dqb.am).a(dqb.aF);
      this.a(dqb.am, dqb.dq, dqb.dC);
      this.a(dqb.D, dqb.gw, fvx.d.b);
      this.a(dqb.aO, fwt.w, -12012264);
      this.m(dqb.ac).d(dqb.ac).a(dqb.ay);
      this.m(dqb.an).d(dqb.an).a(dqb.aG);
      this.a(dqb.an, dqb.dr, dqb.dD);
      this.a(dqb.E, dqb.gx, fvx.d.b);
      this.b(dqb.aP, fwt.w);
      this.m(dqb.Z).c(dqb.Z).a(dqb.av);
      this.m(dqb.ak).c(dqb.ak).a(dqb.aD);
      this.a(dqb.ak, dqb.dp, dqb.dB);
      this.a(dqb.B, dqb.gu, fvx.d.b);
      this.a(dqb.aM, fwt.w, -8345771);
      this.m(dqb.X).c(dqb.X).a(dqb.at);
      this.m(dqb.aq).c(dqb.aq).a(dqb.aB);
      this.a(dqb.aq, dqb.dn, dqb.dz);
      this.a(dqb.z, dqb.gs, fvx.d.b);
      this.a(dqb.aK, fwt.w, -12012264);
      this.m(dqb.Y).c(dqb.Y).a(dqb.au);
      this.m(dqb.aj).c(dqb.aj).a(dqb.aC);
      this.a(dqb.aj, dqb.do, dqb.dA);
      this.a(dqb.A, dqb.gt, fvx.d.b);
      this.a(dqb.aL, fwt.w, -10380959);
      this.m(dqb.ad).c(dqb.ad).a(dqb.az);
      this.m(dqb.ao).c(dqb.ao).a(dqb.aH);
      this.a(dqb.ao, dqb.dt, dqb.dF);
      this.a(dqb.F, dqb.gy, fvx.d.b);
      this.a(dqb.aQ, fwt.w, -12012264);
      this.m(dqb.ae).c(dqb.ae).a(dqb.u);
      this.m(dqb.ap).c(dqb.ap).a(dqb.aI);
      this.a(dqb.ap, dqb.du, dqb.dG);
      this.a(dqb.G, dqb.gz, fvx.d.b);
      this.b(dqb.aR, fwt.w);
      this.m(dqb.aa).c(dqb.aa).a(dqb.aw);
      this.m(dqb.al).c(dqb.al).a(dqb.aE);
      this.a(dqb.al, dqb.ds, dqb.dE);
      this.a(dqb.C, dqb.gv, fvx.d.b);
      this.a(dqb.aN, fwt.w, -12012264);
      this.m(dqb.oZ).b(dqb.oZ).a(dqb.pb);
      this.m(dqb.pa).b(dqb.pa).a(dqb.pc);
      this.a(dqb.pa, dqb.dv, dqb.dI);
      this.a(dqb.pe, dqb.pV, fvx.d.b);
      this.n(dqb.pk, dqb.pX);
      this.m(dqb.oQ).b(dqb.oQ).a(dqb.oS);
      this.m(dqb.oR).b(dqb.oR).a(dqb.oT);
      this.a(dqb.oR, dqb.dw, dqb.dJ);
      this.a(dqb.oV, dqb.pW, fvx.d.b);
      this.n(dqb.oX, dqb.pY);
      this.m(dqb.ai).d(dqb.ai);
      this.m(dqb.as).d(dqb.as);
      this.a(dqb.x, dqb.dy, dqb.dK);
      this.b(dqb.oY, fvx.d.b);
      this.b(dcz.dT);
      this.j(dqb.dN);
      this.l(dqb.iA);
      this.r();
      this.p(dqb.db);
      this.q(dqb.bw);
      this.q(dqb.bx);
      this.q(dqb.hI);
      this.q();
      this.u(dqb.gm);
      this.u(dqb.lm);
      this.u(dqb.ln);
      this.v(dqb.ht);
      this.v(dqb.hu);
      this.v(dqb.hv);
      this.l();
      this.m();
      this.d(dqb.cO, fwt.h);
      this.d(dqb.oD, fwt.h);
      this.d(dqb.oC, fwt.i);
      this.p();
      this.aA();
      this.av();
      this.l(dqb.fc, dqb.fk);
      this.l(dqb.m, dqb.fg);
      this.l(dqb.fb, dqb.fj);
      this.l(dqb.fa, dqb.fi);
      this.ay();
      this.l(dqb.eZ, dqb.fh);
      this.az();
   }

   private void aH() {
      hoe.b $$0 = fwm.a(this.a(dcz.ig));
      Map<Integer, hoe.b> $$1 = new HashMap<>(16);
      fwi.a<fwc, Integer> $$2 = fwi.a(eer.aS);

      for (int $$3 = 0; $$3 <= 15; $$3++) {
         String $$4 = String.format(Locale.ROOT, "_%02d", $$3);
         ame $$5 = fwr.a(dcz.ig, $$4);
         $$2.a($$3, b(fwq.aa.a(dqb.iz, $$4, fwr.h($$5), this.k)));
         hoe.b $$6 = fwm.a(fwq.bJ.a(fwo.a(dcz.ig, $$4), fwr.k($$5), this.k));
         $$1.put($$3, $$6);
      }

      this.j.a(dcz.ig, fwm.a(duu.c, $$0, $$1));
      this.i.accept(fwh.a(dqb.iz).a($$2));
   }

   private void o(dpz $$0, dpz $$1) {
      this.b($$0.h());
      fwr $$2 = fwr.b(fwr.J($$0));
      fwr $$3 = fwr.b(fwr.a($$0, "_lit"));
      fwc $$4 = b(fwq.bW.a($$0, "_one_candle", $$2, this.k));
      fwc $$5 = b(fwq.bX.a($$0, "_two_candles", $$2, this.k));
      fwc $$6 = b(fwq.bY.a($$0, "_three_candles", $$2, this.k));
      fwc $$7 = b(fwq.bZ.a($$0, "_four_candles", $$2, this.k));
      fwc $$8 = b(fwq.bW.a($$0, "_one_candle_lit", $$3, this.k));
      fwc $$9 = b(fwq.bX.a($$0, "_two_candles_lit", $$3, this.k));
      fwc $$10 = b(fwq.bY.a($$0, "_three_candles_lit", $$3, this.k));
      fwc $$11 = b(fwq.bZ.a($$0, "_four_candles_lit", $$3, this.k));
      this.i
         .accept(
            fwh.a($$0)
               .a(
                  fwi.a(eer.aC, eer.u)
                     .a(1, false, $$4)
                     .a(2, false, $$5)
                     .a(3, false, $$6)
                     .a(4, false, $$7)
                     .a(1, true, $$8)
                     .a(2, true, $$9)
                     .a(3, true, $$10)
                     .a(4, true, $$11)
               )
         );
      fwc $$12 = b(fwq.ca.a($$1, fwr.a($$0, false), this.k));
      fwc $$13 = b(fwq.ca.a($$1, "_lit", fwr.a($$0, true), this.k));
      this.i.accept(fwh.a($$1).a(a(eer.u, $$13, $$12)));
   }

   class a {
      private final fwr b;
      private final Map<fwp, ame> c = new HashMap<>();
      @Nullable
      private mq d;
      @Nullable
      private gzl e;
      private final Set<dpz> f = new HashSet<>();

      public a(final fwr $$0) {
         this.b = $$0;
      }

      public fvx.a a(dpz $$0, fwp $$1) {
         this.e = fvx.a($$1.a($$0, this.b, fvx.this.k));
         if (fvx.u.containsKey($$0)) {
            fvx.this.i.accept(fvx.u.get($$0).create($$0, this.e, this.b, fvx.this.k));
         } else {
            fvx.this.i.accept(fvx.a($$0, fvx.a(this.e)));
         }

         return this;
      }

      public fvx.a a(dpz $$0, dpz $$1) {
         ame $$2 = fwo.a($$0);
         fvx.this.i.accept(fvx.a($$1, fvx.b($$2)));
         fvx.this.j.a($$0.h(), $$1.h());
         this.f.add($$1);
         return this;
      }

      public fvx.a a(dpz $$0) {
         fwc $$1 = fvx.b(fwq.s.a($$0, this.b, fvx.this.k));
         fwc $$2 = fvx.b(fwq.t.a($$0, this.b, fvx.this.k));
         fvx.this.i.accept(fvx.a($$0, $$1, $$2));
         ame $$3 = fwq.u.a($$0, this.b, fvx.this.k);
         fvx.this.a($$0, $$3);
         return this;
      }

      public fvx.a b(dpz $$0) {
         fwc $$1 = fvx.b(fwq.M.a($$0, this.b, fvx.this.k));
         fwc $$2 = fvx.b(fwq.N.a($$0, this.b, fvx.this.k));
         fwc $$3 = fvx.b(fwq.O.a($$0, this.b, fvx.this.k));
         fvx.this.i.accept(fvx.a($$0, $$1, $$2, $$3));
         ame $$4 = fwq.P.a($$0, this.b, fvx.this.k);
         fvx.this.a($$0, $$4);
         return this;
      }

      public fvx.a c(dpz $$0) {
         fwr $$1 = fwr.s($$0);
         fwc $$2 = fvx.b(fwq.D.a($$0, $$1, fvx.this.k));
         fwc $$3 = fvx.b(fwq.E.a($$0, $$1, fvx.this.k));
         fwc $$4 = fvx.b(fwq.F.a($$0, $$1, fvx.this.k));
         fwc $$5 = fvx.b(fwq.G.a($$0, $$1, fvx.this.k));
         fwc $$6 = fvx.b(fwq.H.a($$0, $$1, fvx.this.k));
         fvx.this.i.accept(fvx.a($$0, $$2, $$3, $$4, $$5, $$6));
         ame $$7 = fwq.I.a($$0, $$1, fvx.this.k);
         fvx.this.a($$0, $$7);
         return this;
      }

      public fvx.a d(dpz $$0) {
         fwc $$1 = fvx.b(fwq.J.a($$0, this.b, fvx.this.k));
         fwc $$2 = fvx.b(fwq.K.a($$0, this.b, fvx.this.k));
         fvx.this.i.accept(fvx.b($$0, $$1, $$2));
         ame $$3 = fwq.L.a($$0, this.b, fvx.this.k);
         fvx.this.a($$0, $$3);
         return this;
      }

      public fvx.a e(dpz $$0) {
         fwr $$1 = fwr.s($$0);
         fwc $$2 = fvx.b(fwq.R.a($$0, $$1, fvx.this.k));
         fwc $$3 = fvx.b(fwq.Q.a($$0, $$1, fvx.this.k));
         fwc $$4 = fvx.b(fwq.T.a($$0, $$1, fvx.this.k));
         fwc $$5 = fvx.b(fwq.S.a($$0, $$1, fvx.this.k));
         fvx.this.i.accept(fvx.a($$0, $$2, $$3, $$4, $$5, false));
         return this;
      }

      public fvx.a f(dpz $$0) {
         fwc $$1 = fvx.b(fwq.V.a($$0, this.b, fvx.this.k));
         fwc $$2 = fvx.b(fwq.U.a($$0, this.b, fvx.this.k));
         fwc $$3 = fvx.b(fwq.X.a($$0, this.b, fvx.this.k));
         fwc $$4 = fvx.b(fwq.W.a($$0, this.b, fvx.this.k));
         fvx.this.i.accept(fvx.a($$0, $$1, $$2, $$3, $$4, true));
         return this;
      }

      public fvx.a g(dpz $$0) {
         fwc $$1 = fvx.b(fwq.Y.a($$0, this.b, fvx.this.k));
         fwc $$2 = fvx.b(fwq.Z.a($$0, this.b, fvx.this.k));
         fvx.this.i.accept(fvx.d($$0, $$1, $$2));
         return this;
      }

      public fvx.a h(dpz $$0) {
         if (this.d == null) {
            throw new IllegalStateException("Family not defined");
         } else {
            dpz $$1 = this.d.b().get(mq.b.r);
            fwc $$2 = fvx.b(fwq.aa.a($$0, this.b, fvx.this.k));
            fvx.this.i.accept(fvx.a($$0, $$2));
            fvx.this.i.accept(fvx.a($$1, $$2));
            fvx.this.b($$0.h());
            return this;
         }
      }

      public fvx.a i(dpz $$0) {
         if (this.e == null) {
            throw new IllegalStateException("Full block not generated yet");
         } else {
            ame $$1 = this.a(fwq.ab, $$0);
            fwc $$2 = fvx.b(this.a(fwq.ac, $$0));
            fvx.this.i.accept(fvx.e($$0, fvx.b($$1), $$2, fvx.a(this.e)));
            fvx.this.a($$0, $$1);
            return this;
         }
      }

      public fvx.a j(dpz $$0) {
         fwc $$1 = fvx.b(this.a(fwq.af, $$0));
         ame $$2 = this.a(fwq.ae, $$0);
         fwc $$3 = fvx.b(this.a(fwq.ag, $$0));
         fvx.this.i.accept(fvx.b($$0, $$1, fvx.b($$2), $$3));
         fvx.this.a($$0, $$2);
         return this;
      }

      private fvx.a k(dpz $$0) {
         fwt $$1 = fvx.A.getOrDefault($$0, fwt.a.get($$0));
         fwc $$2 = fvx.b($$1.a($$0, fvx.this.k));
         fvx.this.i.accept(fvx.a($$0, $$2));
         return this;
      }

      private fvx.a l(dpz $$0) {
         fvx.this.j($$0);
         return this;
      }

      private void m(dpz $$0) {
         if (fvx.l.contains($$0)) {
            fvx.this.l($$0);
         } else {
            fvx.this.k($$0);
         }
      }

      private ame a(fwp $$0, dpz $$1) {
         return this.c.computeIfAbsent($$0, $$1x -> $$1x.a($$1, this.b, fvx.this.k));
      }

      public fvx.a a(mq $$0) {
         this.d = $$0;
         $$0.b().forEach(($$0x, $$1) -> {
            if (!this.f.contains($$1)) {
               BiConsumer<fvx.a, dpz> $$2 = fvx.B.get($$0x);
               if ($$2 != null) {
                  $$2.accept(this, $$1);
               }
            }
         });
         return this;
      }
   }

   @FunctionalInterface
   interface b {
      fwe create(dpz var1, gzl var2, fwr var3, BiConsumer<ame, fwn> var4);
   }

   record c(fwp a, String b) {
   }

   static enum d {
      a(fwq.ap, fwq.as, false),
      b(fwq.ao, fwq.ar, false),
      c(fwq.aq, fwq.at, true);

      private final fwp d;
      private final fwp e;
      private final boolean f;

      private d(final fwp $$0, final fwp $$1, final boolean $$2) {
         this.d = $$0;
         this.e = $$1;
         this.f = $$2;
      }

      public fwp a() {
         return this.d;
      }

      public fwp b() {
         return this.e;
      }

      public ame a(fvx $$0, dpz $$1) {
         dcr $$2 = $$1.h();
         return this.f ? $$0.b($$2, $$1, "_emissive") : $$0.a($$2, $$1);
      }

      public fwr a(dpz $$0) {
         return this.f ? fwr.e($$0) : fwr.c($$0);
      }

      public fwr b(dpz $$0) {
         return this.f ? fwr.g($$0) : fwr.f($$0);
      }
   }

   class e {
      private final fwr b;

      public e(final fwr $$0) {
         this.b = $$0;
      }

      public fvx.e a(dpz $$0) {
         fwr $$1 = this.b.c(fws.d, this.b.a(fws.i));
         ame $$2 = fwq.j.a($$0, $$1, fvx.this.k);
         fvx.this.i.accept(fvx.b($$0, fvx.b($$2)));
         fvx.this.a($$0, $$2);
         return this;
      }

      public fvx.e b(dpz $$0) {
         ame $$1 = fwq.j.a($$0, this.b, fvx.this.k);
         fvx.this.i.accept(fvx.b($$0, fvx.b($$1)));
         fvx.this.a($$0, $$1);
         return this;
      }

      public fvx.e c(dpz $$0) {
         ame $$1 = fwq.j.a($$0, this.b, fvx.this.k);
         fwc $$2 = fvx.b(fwq.k.a($$0, this.b, fvx.this.k));
         fvx.this.i.accept(fvx.c($$0, fvx.b($$1), $$2));
         fvx.this.a($$0, $$1);
         return this;
      }

      public fvx.e d(dpz $$0) {
         fvx.this.i.accept(fvx.a($$0, this.b, fvx.this.k));
         fvx.this.a($$0, fwq.j.a($$0, this.b, fvx.this.k));
         return this;
      }
   }
}
