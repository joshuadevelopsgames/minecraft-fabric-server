import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Sets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public abstract class on {
   protected final jn.a a;
   private final jm<dcr> c;
   protected final om b;
   private static final Map<mq.b, on.a> d = ImmutableMap.builder()
      .put(mq.b.a, (on.a)($$0, $$1, $$2) -> $$0.e($$1, dhi.a($$2)))
      .put(mq.b.b, (on.a)($$0, $$1, $$2) -> $$0.b(ol.a, $$1, dhi.a($$2)))
      .put(mq.b.d, (on.a)($$0, $$1, $$2) -> $$0.f(ol.a, $$1, dhi.a($$2)))
      .put(mq.b.e, (on.a)($$0, $$1, $$2) -> $$0.a($$1, dhi.a($$2)))
      .put(mq.b.f, (on.a)($$0, $$1, $$2) -> $$0.f($$1, dhi.a($$2)))
      .put(mq.b.g, (on.a)($$0, $$1, $$2) -> $$0.f($$1, dhi.a($$2)))
      .put(mq.b.h, (on.a)($$0, $$1, $$2) -> $$0.g($$1, dhi.a($$2)))
      .put(mq.b.i, (on.a)($$0, $$1, $$2) -> $$0.g($$1, dhi.a($$2)))
      .put(mq.b.k, (on.a)($$0, $$1, $$2) -> $$0.h($$1, dhi.a($$2)))
      .put(mq.b.l, (on.a)($$0, $$1, $$2) -> $$0.a(ol.a, $$1, dhi.a($$2)))
      .put(mq.b.m, (on.a)($$0, $$1, $$2) -> $$0.b($$1, dhi.a($$2)))
      .put(mq.b.n, (on.a)($$0, $$1, $$2) -> $$0.c(ol.c, $$1, dhi.a($$2)))
      .put(mq.b.o, (on.a)($$0, $$1, $$2) -> $$0.e(ol.a, $$1, dhi.a($$2)))
      .put(mq.b.p, (on.a)($$0, $$1, $$2) -> $$0.c($$1, dhi.a($$2)))
      .put(mq.b.q, (on.a)($$0, $$1, $$2) -> $$0.d(ol.b, $$1, dhi.a($$2)))
      .build();

   protected on(jn.a $$0, om $$1) {
      this.a = $$0;
      this.c = $$0.e(mn.N);
      this.b = $$1;
   }

   protected abstract void a();

   protected void a(cyd $$0) {
      mp.a().filter(mq::d).forEach($$1 -> this.a($$1, $$0));
   }

   protected void a(dmt $$0, dmt $$1, @Nullable String $$2) {
      this.a($$0, $$1, $$2, 1);
   }

   protected void a(dmt $$0, dmt $$1, @Nullable String $$2, int $$3) {
      this.b(ol.i, $$0, $$3).b($$1).b($$2).b(c($$1), this.b($$1)).a(this.b, q($$0, $$1));
   }

   protected void a(List<dmt> $$0, ol $$1, dmt $$2, float $$3, int $$4, String $$5) {
      this.a(dhw.o, dig::new, $$0, $$1, $$2, $$3, $$4, $$5, "_from_smelting");
   }

   protected void b(List<dmt> $$0, ol $$1, dmt $$2, float $$3, int $$4, String $$5) {
      this.a(dhw.p, dgv::new, $$0, $$1, $$2, $$3, $$4, $$5, "_from_blasting");
   }

   private <T extends dgs> void a(dhw<T> $$0, dgs.a<T> $$1, List<dmt> $$2, ol $$3, dmt $$4, float $$5, int $$6, String $$7, String $$8) {
      for (dmt $$9 : $$2) {
         oq.a(dhi.a($$9), $$3, $$4, $$5, $$6, $$0, $$1).b($$7).b(c($$9), this.b($$9)).a(this.b, d($$4) + $$8 + "_" + d($$9));
      }
   }

   protected void a(dcr $$0, ol $$1, dcr $$2) {
      os.a(dhi.a(dcz.zb), dhi.a($$0), this.b(azx.bn), $$1, $$2).a("has_netherite_ingot", this.a(azx.bn)).a(this.b, d($$2) + "_smithing");
   }

   protected void a(dcr $$0, amd<dlk> $$1, amd<dhm<?>> $$2) {
      jl.c<dlk> $$3 = this.a.e(mn.bq).b($$1);
      ot.a(dhi.a($$0), this.b(azx.bH), this.b(azx.bI), $$3, ol.i).a("has_smithing_trim_template", this.b($$0)).a(this.b, $$2);
   }

   protected void a(ol $$0, dmt $$1, dmt $$2) {
      this.a($$0, $$1, 1).a('#', $$2).b("##").b("##").b(c($$2), this.b($$2)).a(this.b);
   }

   protected void a(ol $$0, dmt $$1, dmt $$2, String $$3) {
      this.b($$0, $$1).a($$2, 9).b($$3, this.b($$2)).a(this.b);
   }

   protected void b(ol $$0, dmt $$1, dmt $$2) {
      this.a($$0, $$1, $$2, c($$2));
   }

   protected void a(dmt $$0, bae<dcr> $$1, int $$2) {
      this.b(ol.a, $$0, $$2).a($$1).b("planks").b("has_log", this.a($$1)).a(this.b);
   }

   protected void b(dmt $$0, bae<dcr> $$1, int $$2) {
      this.b(ol.a, $$0, $$2).a($$1).b("planks").b("has_logs", this.a($$1)).a(this.b);
   }

   protected void a(dmt $$0, dmt $$1) {
      this.a(ol.a, $$0, 3).a('#', $$1).b("##").b("##").c("bark").b("has_log", this.b($$1)).a(this.b);
   }

   protected void b(dmt $$0, dmt $$1) {
      this.a(ol.d, $$0).a('#', $$1).b("# #").b("###").c("boat").b("in_water", a(dqb.J)).a(this.b);
   }

   protected void c(dmt $$0, dmt $$1) {
      this.b(ol.d, $$0).b(dqb.cG).b($$1).b("chest_boat").b("has_boat", this.a(azx.aZ)).a(this.b);
   }

   private ok e(dmt $$0, dhi $$1) {
      return this.b(ol.c, $$0).a($$1);
   }

   protected ok a(dmt $$0, dhi $$1) {
      return this.a(ol.c, $$0, 3).a('#', $$1).b("##").b("##").b("##");
   }

   private ok f(dmt $$0, dhi $$1) {
      int $$2 = $$0 == dqb.fN ? 6 : 3;
      dcr $$3 = $$0 == dqb.fN ? dcz.vZ : dcz.qv;
      return this.a(ol.b, $$0, $$2).a('W', $$1).a('#', $$3).b("W#W").b("W#W");
   }

   private ok g(dmt $$0, dhi $$1) {
      return this.a(ol.c, $$0).a('#', dcz.qv).a('W', $$1).b("#W#").b("#W#");
   }

   protected void d(dmt $$0, dmt $$1) {
      this.c(ol.c, $$0, dhi.a($$1)).a(c($$1), this.b($$1)).a(this.b);
   }

   private ok c(ol $$0, dmt $$1, dhi $$2) {
      return this.a($$0, $$1).a('#', $$2).b("##");
   }

   protected void c(ol $$0, dmt $$1, dmt $$2) {
      this.a($$0, $$1, dhi.a($$2)).a(c($$2), this.b($$2)).a(this.b);
   }

   protected ok a(ol $$0, dmt $$1, dhi $$2) {
      return this.a($$0, $$1, 6).a('#', $$2).b("###");
   }

   protected ok b(dmt $$0, dhi $$1) {
      return this.a(ol.a, $$0, 4).a('#', $$1).b("#  ").b("## ").b("###");
   }

   protected ok c(dmt $$0, dhi $$1) {
      return this.a(ol.c, $$0, 2).a('#', $$1).b("###").b("###");
   }

   private ok h(dmt $$0, dhi $$1) {
      return this.a(ol.b, $$0, 3).c("sign").a('#', $$1).a('X', dcz.qv).b("###").b("###").b(" X ");
   }

   protected void e(dmt $$0, dmt $$1) {
      this.a(ol.b, $$0, 6).c("hanging_sign").a('#', $$1).a('X', dcz.go).b("X X").b("###").b("###").b("has_stripped_logs", this.b($$1)).a(this.b);
   }

   protected void a(List<dcr> $$0, List<dcr> $$1, String $$2, ol $$3) {
      this.a($$0, $$1, null, $$2, $$3);
   }

   protected void a(List<dcr> $$0, List<dcr> $$1, @Nullable dcr $$2, String $$3, ol $$4) {
      for (int $$5 = 0; $$5 < $$0.size(); $$5++) {
         dcr $$6 = $$0.get($$5);
         dcr $$7 = $$1.get($$5);
         Stream<dcr> $$8 = $$1.stream().filter($$1x -> !$$1x.equals($$7));
         if ($$2 != null) {
            $$8 = Stream.concat($$8, Stream.of($$2));
         }

         this.b($$4, $$7).b($$6).a(dhi.a($$8)).b($$3).b("has_needed_dye", this.b($$6)).a(this.b, "dye_" + d($$7));
      }
   }

   protected void f(dmt $$0, dmt $$1) {
      this.a(ol.b, $$0, 3).a('#', $$1).b("##").c("carpet").b(c($$1), this.b($$1)).a(this.b);
   }

   protected void g(dmt $$0, dmt $$1) {
      this.a(ol.b, $$0).a('#', $$1).a('X', azx.b).b("###").b("XXX").c("bed").b(c($$1), this.b($$1)).a(this.b);
   }

   protected void h(dmt $$0, dmt $$1) {
      this.a(ol.b, $$0).a('#', $$1).a('|', dcz.qv).b("###").b("###").b(" | ").c("banner").b(c($$1), this.b($$1)).a(this.b);
   }

   protected void i(dmt $$0, dmt $$1) {
      this.a(ol.a, $$0, 8).a('#', dqb.aX).a('X', $$1).b("###").b("#X#").b("###").c("stained_glass").b("has_glass", this.b(dqb.aX)).a(this.b);
   }

   protected void a(dmt $$0) {
      this.a(ol.a, $$0, 1).a('#', dcz.tG).a('X', dcz.fK).b("###").b("#X#").b("###").c("dry_ghast").b(c(dcz.tG), this.b(dcz.tG)).a(this.b);
   }

   protected void j(dmt $$0, dmt $$1) {
      this.a(ol.f, $$0).a('#', $$1).a('G', dcz.cN).a('L', dcz.rK).b("LLL").b("G#G").c("harness").b("has_dried_ghast", this.b(dqb.mN)).a(this.b);
   }

   protected void k(dmt $$0, dmt $$1) {
      this.a(ol.b, $$0, 16).a('#', $$1).b("###").b("###").c("stained_glass_pane").b("has_glass", this.b($$1)).a(this.b);
   }

   protected void l(dmt $$0, dmt $$1) {
      this.a(ol.b, $$0, 8)
         .a('#', dqb.fq)
         .a('$', $$1)
         .b("###")
         .b("#$#")
         .b("###")
         .c("stained_glass_pane")
         .b("has_glass_pane", this.b(dqb.fq))
         .b(c($$1), this.b($$1))
         .a(this.b, q($$0, dqb.fq));
   }

   protected void m(dmt $$0, dmt $$1) {
      this.a(ol.a, $$0, 8).a('#', dqb.jc).a('X', $$1).b("###").b("#X#").b("###").c("stained_terracotta").b("has_terracotta", this.b(dqb.jc)).a(this.b);
   }

   protected void n(dmt $$0, dmt $$1) {
      this.b(ol.a, $$0, 8).b($$1).a(dqb.L, 4).a(dqb.O, 4).b("concrete_powder").b("has_sand", this.b(dqb.L)).b("has_gravel", this.b(dqb.O)).a(this.b);
   }

   protected void o(dmt $$0, dmt $$1) {
      this.b(ol.b, $$0).b(dqb.qu).b($$1).b("dyed_candle").b(c($$1), this.b($$1)).a(this.b);
   }

   protected void d(ol $$0, dmt $$1, dmt $$2) {
      this.d($$0, $$1, dhi.a($$2)).a(c($$2), this.b($$2)).a(this.b);
   }

   private ok d(ol $$0, dmt $$1, dhi $$2) {
      return this.a($$0, $$1, 6).a('#', $$2).b("###").b("###");
   }

   protected void e(ol $$0, dmt $$1, dmt $$2) {
      this.e($$0, $$1, dhi.a($$2)).a(c($$2), this.b($$2)).a(this.b);
   }

   private ok e(ol $$0, dmt $$1, dhi $$2) {
      return this.a($$0, $$1, 4).a('S', $$2).b("SS").b("SS");
   }

   protected void f(ol $$0, dmt $$1, dmt $$2) {
      this.f($$0, $$1, dhi.a($$2)).b(c($$2), this.b($$2)).a(this.b);
   }

   private oo f(ol $$0, dmt $$1, dhi $$2) {
      return this.a($$0, $$1, 4).a('#', $$2).b("##").b("##");
   }

   protected void g(ol $$0, dmt $$1, dmt $$2) {
      this.b($$0, $$1, dhi.a($$2)).b(c($$2), this.b($$2)).a(this.b);
   }

   protected void h(ol $$0, dmt $$1, dmt $$2) {
      this.a($$0, $$1).a('#', $$2).b("#").b("#").b(c($$2), this.b($$2)).a(this.b);
   }

   protected oo b(ol $$0, dmt $$1, dhi $$2) {
      return this.a($$0, $$1).a('#', $$2).b("#").b("#");
   }

   protected void i(ol $$0, dmt $$1, dmt $$2) {
      this.a($$0, $$1, $$2, 1);
   }

   protected void a(ol $$0, dmt $$1, dmt $$2, int $$3) {
      or.a(dhi.a($$2), $$0, $$1, $$3).b(c($$2), this.b($$2)).a(this.b, q($$1, $$2) + "_stonecutting");
   }

   private void r(dmt $$0, dmt $$1) {
      oq.c(dhi.a($$1), ol.a, $$0, 0.1F, 200).b(c($$1), this.b($$1)).a(this.b);
   }

   protected void a(ol $$0, dmt $$1, ol $$2, dmt $$3) {
      this.a($$0, $$1, $$2, $$3, e($$3), null, e($$1), null);
   }

   protected void a(ol $$0, dmt $$1, ol $$2, dmt $$3, String $$4, String $$5) {
      this.a($$0, $$1, $$2, $$3, $$4, $$5, e($$1), null);
   }

   protected void b(ol $$0, dmt $$1, ol $$2, dmt $$3, String $$4, String $$5) {
      this.a($$0, $$1, $$2, $$3, e($$3), null, $$4, $$5);
   }

   private void a(ol $$0, dmt $$1, ol $$2, dmt $$3, String $$4, @Nullable String $$5, String $$6, @Nullable String $$7) {
      this.b($$0, $$1, 9).b($$3).b($$7).b(c($$3), this.b($$3)).a(this.b, amd.a(mn.bA, ame.a($$6)));
      this.a($$2, $$3).a('#', $$1).b("###").b("###").b("###").c($$5).b(c($$1), this.b($$1)).a(this.b, amd.a(mn.bA, ame.a($$4)));
   }

   protected void p(dmt $$0, dmt $$1) {
      this.a(ol.i, $$0, 2).a('#', dcz.pE).a('C', $$1).a('S', $$0).b("#S#").b("#C#").b("###").b(c($$0), this.b($$0)).a(this.b);
   }

   protected void d(dmt $$0, dhi $$1) {
      this.a(ol.i, $$0, 2).a('#', dcz.pE).a('C', $$1).a('S', $$0).b("#S#").b("#C#").b("###").b(c($$0), this.b($$0)).a(this.b);
   }

   protected <T extends dgs> void a(String $$0, dhw<T> $$1, dgs.a<T> $$2, int $$3) {
      this.a($$0, $$1, $$2, $$3, dcz.tz, dcz.tA, 0.35F);
      this.a($$0, $$1, $$2, $$3, dcz.tB, dcz.tC, 0.35F);
      this.a($$0, $$1, $$2, $$3, dcz.sy, dcz.sC, 0.35F);
      this.a($$0, $$1, $$2, $$3, dcz.dX, dcz.tw, 0.1F);
      this.a($$0, $$1, $$2, $$3, dcz.sz, dcz.sD, 0.35F);
      this.a($$0, $$1, $$2, $$3, dcz.wq, dcz.wr, 0.35F);
      this.a($$0, $$1, $$2, $$3, dcz.rc, dcz.rd, 0.35F);
      this.a($$0, $$1, $$2, $$3, dcz.vI, dcz.vJ, 0.35F);
      this.a($$0, $$1, $$2, $$3, dcz.wd, dcz.we, 0.35F);
   }

   private <T extends dgs> void a(String $$0, dhw<T> $$1, dgs.a<T> $$2, int $$3, dmt $$4, dmt $$5, float $$6) {
      oq.a(dhi.a($$4), ol.g, $$5, $$6, $$3, $$1, $$2).b(c($$4), this.b($$4)).a(this.b, d($$5) + "_from_" + $$0);
   }

   protected void b(cyd $$0) {
      dcm.a.get().forEach(($$1, $$2) -> {
         if ($$2.k().a($$0)) {
            this.b(ol.a, $$2).b($$1).b(dcz.yf).b(d($$2)).b(c($$1), this.b($$1)).a(this.b, q($$2, dcz.yf));
         }
      });
   }

   protected void a(dpz $$0, dpz $$1) {
      this.a(ol.a, $$0, 4).a('M', $$1).b(" M ").b("M M").b(" M ").b(c($$1), this.b($$1)).a(this.b);
   }

   protected void b(dpz $$0, dpz $$1) {
      this.a(ol.c, $$0, 4).a('C', $$1).a('R', dcz.mm).a('B', dcz.tF).b(" C ").b("CBC").b(" R ").b(c($$1), this.b($$1)).a(this.b);
   }

   protected void a(dcr $$0, dym $$1) {
      dcv $$2 = new dcv(dcz.xB.e(), 1, ko.a().a(kq.T, $$1.c()).a());
      this.a(ol.g, $$2).b(dcz.py).b(dcz.dN).b(dcz.dO).b($$0).b("suspicious_stew").b(c($$0), this.b($$0)).a(this.b, d($$2.h()) + "_from_" + d($$0));
   }

   protected void a(mq $$0, cyd $$1) {
      $$0.b().forEach(($$2, $$3) -> {
         if ($$3.k().a($$1)) {
            on.a $$4 = d.get($$2);
            dmt $$5 = this.a($$0, $$2);
            if ($$4 != null) {
               ok $$6 = $$4.create(this, $$3, $$5);
               $$0.e().ifPresent($$2x -> $$6.a($$2x + ($$2 == mq.b.d ? "" : "_" + $$2.a())));
               $$6.a($$0.f().orElseGet(() -> c($$5)), this.b($$5));
               $$6.a(this.b);
            }

            if ($$2 == mq.b.c) {
               this.r($$3, $$5);
            }
         }
      });
   }

   private dpz a(mq $$0, mq.b $$1) {
      if ($$1 == mq.b.b) {
         if (!$$0.b().containsKey(mq.b.l)) {
            throw new IllegalStateException("Slab is not defined for the family.");
         } else {
            return $$0.a(mq.b.l);
         }
      } else {
         return $$0.a();
      }
   }

   private static ar<bv.a> a(dpz $$0) {
      return aq.e.a(new bv.a(Optional.empty(), Optional.of($$0.p()), Optional.empty()));
   }

   private ar<cl.a> a(cx.d $$0, dmt $$1) {
      return a(cn.a.a().a(this.c, $$1).a($$0));
   }

   protected ar<cl.a> b(dmt $$0) {
      return a(cn.a.a().a(this.c, $$0));
   }

   protected ar<cl.a> a(bae<dcr> $$0) {
      return a(cn.a.a().a(this.c, $$0));
   }

   private static ar<cl.a> a(cn.a... $$0) {
      return a(Arrays.stream($$0).map(cn.a::b).toArray(cn[]::new));
   }

   private static ar<cl.a> a(cn... $$0) {
      return aq.f.a(new cl.a(Optional.empty(), cl.a.a.b, List.of($$0)));
   }

   protected static String c(dmt $$0) {
      return "has_" + d($$0);
   }

   protected static String d(dmt $$0) {
      return mm.g.b($$0.h()).a();
   }

   protected static String e(dmt $$0) {
      return d($$0);
   }

   protected static String q(dmt $$0, dmt $$1) {
      return d($$0) + "_from_" + d($$1);
   }

   protected static String f(dmt $$0) {
      return d($$0) + "_from_smelting";
   }

   protected static String g(dmt $$0) {
      return d($$0) + "_from_blasting";
   }

   protected dhi b(bae<dcr> $$0) {
      return dhi.a(this.c.b($$0));
   }

   protected oo a(ol $$0, dmt $$1) {
      return oo.a(this.c, $$0, $$1);
   }

   protected oo a(ol $$0, dmt $$1, int $$2) {
      return oo.a(this.c, $$0, $$1, $$2);
   }

   protected op a(ol $$0, dcv $$1) {
      return op.a(this.c, $$0, $$1);
   }

   protected op b(ol $$0, dmt $$1) {
      return op.a(this.c, $$0, $$1);
   }

   protected op b(ol $$0, dmt $$1, int $$2) {
      return op.a(this.c, $$0, $$1, $$2);
   }

   @FunctionalInterface
   interface a {
      ok create(on var1, dmt var2, dmt var3);
   }

   protected abstract static class b implements mt {
      private final mv d;
      private final CompletableFuture<jn.a> e;

      protected b(mv $$0, CompletableFuture<jn.a> $$1) {
         this.d = $$0;
         this.e = $$1;
      }

      @Override
      public final CompletableFuture<?> a(mr $$0) {
         return this.e.thenCompose($$1 -> {
            final mv.a $$2 = this.d.a(mn.bA);
            final mv.a $$3 = this.d.a(mn.bz);
            final Set<amd<dhm<?>>> $$4 = Sets.newHashSet();
            final List<CompletableFuture<?>> $$5 = new ArrayList<>();
            om $$6 = new om() {
               @Override
               public void a(amd<dhm<?>> $$0x, dhm<?> $$1x, @Nullable aj $$2x) {
                  if (!$$4.add($$0)) {
                     throw new IllegalStateException("Duplicate recipe " + $$0.a());
                  } else {
                     this.a($$0, $$1);
                     if ($$2 != null) {
                        this.a($$2);
                     }
                  }
               }

               @Override
               public ai.a a() {
                  return ai.a.b().a(ok.a);
               }

               @Override
               public void b() {
                  aj $$0x = ai.a.b().a("impossible", aq.b.a(new cj.a())).b(ok.a);
                  this.a($$0x);
               }

               private void a(amd<dhm<?>> $$0x, dhm<?> $$1x) {
                  $$5.add(mt.a($$0, $$1, dhm.a, $$1, $$2.a($$0.a())));
               }

               private void a(aj $$0x) {
                  $$5.add(mt.a($$0, $$1, ai.a, $$0.b(), $$3.a($$0.a())));
               }
            };
            this.a($$1, $$6).a();
            return CompletableFuture.allOf($$5.toArray(CompletableFuture[]::new));
         });
      }

      protected abstract on a(jn.a var1, om var2);
   }
}
