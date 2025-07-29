import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Queues;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import it.unimi.dsi.fastutil.objects.ReferenceOpenHashSet;
import java.util.Arrays;
import java.util.Deque;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.BooleanSupplier;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class grk extends dmu implements grd.a<grk> {
   private static final Logger b = LogUtils.getLogger();
   public static final xo a = xo.c("multiplayer.status.quitting");
   private static final double c = 0.05;
   private static final int d = 10;
   private static final int e = 1000;
   final eim f = new eim();
   private final eis<bzm> E = new eis<>(bzm.class, new grk.b());
   private final grl F;
   private final gxh G;
   private final gxg H;
   private final grk.a I;
   private final gwx J;
   private final bxt K;
   private final fue L = fue.R();
   final List<gwf> M = Lists.newArrayList();
   final List<cpp> N = Lists.newArrayList();
   private final Map<fce, fcg> O = Maps.newHashMap();
   private static final int P = -1;
   private int Q;
   private final Object2ObjectArrayMap<dme, fvj> R = ag.a(new Object2ObjectArrayMap(3), $$0x -> {
      $$0x.put(gws.a, new fvj($$0xx -> this.b($$0xx, gws.a)));
      $$0x.put(gws.b, new fvj($$0xx -> this.b($$0xx, gws.b)));
      $$0x.put(gws.c, new fvj($$0xx -> this.b($$0xx, gws.c)));
      $$0x.put(gws.d, new fvj($$0xx -> this.b($$0xx, gws.d)));
   });
   private final grg S;
   private final Deque<Runnable> T = Queues.newArrayDeque();
   private int U;
   private final gsx V = new gsx();
   private final Set<eaz> W = new ReferenceOpenHashSet();
   private final int X;
   private boolean Y;
   private static final Set<dcr> Z = Set.of(dcz.if, dcz.ig);

   public void b(int $$0) {
      this.V.a($$0, this);
   }

   @Override
   public void b(eaz $$0) {
      hac<eaz> $$1 = this.L.as().a($$0);
      if ($$1 != null && $$1.aY_()) {
         this.W.add($$0);
      }
   }

   public Set<eaz> a() {
      return this.W;
   }

   public void b(jb $$0, eeb $$1, int $$2) {
      if (!this.V.a($$0, $$1)) {
         super.a($$0, $$1, $$2, 512);
      }
   }

   public void a(jb $$0, eeb $$1, fis $$2) {
      eeb $$3 = this.a_($$0);
      if ($$3 != $$1) {
         this.a($$0, $$1, 19);
         cut $$4 = this.L.t;
         if (this == $$4.ai() && $$4.a($$0, $$1)) {
            $$4.g($$2.d, $$2.e, $$2.f);
         }
      }
   }

   gsx b() {
      return this.V;
   }

   @Override
   public boolean a(jb $$0, eeb $$1, int $$2, int $$3) {
      if (this.V.c()) {
         eeb $$4 = this.a_($$0);
         boolean $$5 = super.a($$0, $$1, $$2, $$3);
         if ($$5) {
            this.V.a($$0, $$4, this.L.t);
         }

         return $$5;
      } else {
         return super.a($$0, $$1, $$2, $$3);
      }
   }

   public grk(grl $$0, grk.a $$1, amd<dmu> $$2, jl<ehy> $$3, int $$4, int $$5, gxh $$6, boolean $$7, long $$8, int $$9) {
      super($$1, $$2, $$0.x(), $$3, true, $$7, $$8, 1000000);
      this.F = $$0;
      this.S = new grg(this, $$4);
      this.K = new bxt();
      this.I = $$1;
      this.G = $$6;
      this.X = $$9;
      this.H = new gxg(this.L, this, $$6);
      this.J = gwx.a($$3.a());
      this.a(new jb(8, 64, 8), 0.0F);
      this.U = $$5;
      this.aa();
      this.ad();
   }

   public void a(Runnable $$0) {
      this.T.add($$0);
   }

   public void c() {
      int $$0 = this.T.size();
      int $$1 = $$0 < 1000 ? Math.max(10, $$0 / 10) : $$0;

      for (int $$2 = 0; $$2 < $$1; $$2++) {
         Runnable $$3 = this.T.poll();
         if ($$3 == null) {
            break;
         }

         $$3.run();
      }
   }

   public gwx d() {
      return this.J;
   }

   public void a(BooleanSupplier $$0) {
      this.F_().s();
      this.aa();
      if (this.v().i()) {
         this.o();
      }

      if (this.Q > 0) {
         this.c(this.Q - 1);
      }

      try (bty $$1 = bts.a().d("blocks")) {
         this.S.a($$0, true);
      }
   }

   private void o() {
      this.I.a(this.I.c() + 1L);
      if (this.Y) {
         this.I.b(this.I.d() + 1L);
      }
   }

   public void a(long $$0, long $$1, boolean $$2) {
      this.I.a($$0);
      this.I.b($$1);
      this.Y = $$2;
   }

   public Iterable<bzm> e() {
      return this.I().a();
   }

   public void f() {
      btt $$0 = bts.a();
      $$0.a("entities");
      this.f.a($$0x -> {
         if (!$$0x.dU() && !$$0x.cc() && !this.K.a($$0x)) {
            this.a(this::c, $$0x);
         }
      });
      $$0.c();
      this.Z();
   }

   public boolean a(bzm $$0) {
      return this.f.c($$0);
   }

   @Override
   public boolean h(bzm $$0) {
      return $$0.dz().a(this.L.t.dz()) <= this.U;
   }

   public void c(bzm $$0) {
      $$0.bC();
      $$0.as++;
      bts.a().a(() -> mm.f.b($$0.ap()).toString());
      $$0.g();
      bts.a().c();

      for (bzm $$1 : $$0.da()) {
         this.a($$0, $$1);
      }
   }

   private void a(bzm $$0, bzm $$1) {
      if ($$1.dU() || $$1.dm() != $$0) {
         $$1.bS();
      } else if ($$1 instanceof cut || this.f.c($$1)) {
         $$1.bC();
         $$1.as++;
         $$1.r();

         for (bzm $$2 : $$1.da()) {
            this.a($$1, $$2);
         }
      }
   }

   public void a(egi $$0) {
      $$0.K();
      this.S.q().a($$0.f(), false);
      this.E.b($$0.f());
   }

   public void a(dlz $$0) {
      this.R.forEach(($$1, $$2) -> $$2.a($$0.h, $$0.i));
      this.E.a($$0);
   }

   public void b(long $$0) {
      this.G.a($$0);
   }

   public void g() {
      this.R.forEach(($$0, $$1) -> $$1.a());
   }

   @Override
   public boolean b(int $$0, int $$1) {
      return true;
   }

   public int h() {
      return this.E.b();
   }

   public void d(bzm $$0) {
      this.a($$0.ar(), bzm.e.b);
      this.E.a($$0);
   }

   public void a(int $$0, bzm.e $$1) {
      bzm $$2 = this.I().a($$0);
      if ($$2 != null) {
         $$2.c($$1);
         $$2.av();
      }
   }

   @Override
   public List<bzm> i(bzm $$0, fin $$1) {
      gwi $$2 = this.L.t;
      return $$2 != null && $$2 != $$0 && $$2.cV().c($$1) && bzt.a($$0).test($$2) ? List.of($$2) : List.of();
   }

   @Nullable
   @Override
   public bzm a(int $$0) {
      return this.I().a($$0);
   }

   public void a(xo $$0) {
      this.F.m().a($$0);
   }

   public void b(int $$0, int $$1, int $$2) {
      int $$3 = 32;
      bck $$4 = bck.a();
      dpz $$5 = this.p();
      jb.a $$6 = new jb.a();

      for (int $$7 = 0; $$7 < 667; $$7++) {
         this.a($$0, $$1, $$2, 16, $$4, $$5, $$6);
         this.a($$0, $$1, $$2, 32, $$4, $$5, $$6);
      }
   }

   @Nullable
   private dpz p() {
      if (this.L.r.i() == dmr.b) {
         dcv $$0 = this.L.t.fh();
         dcr $$1 = $$0.h();
         if (Z.contains($$1) && $$1 instanceof dbd $$2) {
            return $$2.c();
         }
      }

      return null;
   }

   public void a(int $$0, int $$1, int $$2, int $$3, bck $$4, @Nullable dpz $$5, jb.a $$6) {
      int $$7 = $$0 + this.A.a($$3) - this.A.a($$3);
      int $$8 = $$1 + this.A.a($$3) - this.A.a($$3);
      int $$9 = $$2 + this.A.a($$3) - this.A.a($$3);
      $$6.d($$7, $$8, $$9);
      eeb $$10 = this.a_($$6);
      $$10.b().a($$10, this, $$6, $$4);
      fal $$11 = this.b_($$6);
      if (!$$11.c()) {
         $$11.a(this, $$6, $$4);
         mc $$12 = $$11.h();
         if ($$12 != null && this.A.a(10) == 0) {
            boolean $$13 = $$10.c(this, $$6, jh.a);
            jb $$14 = $$6.e();
            this.a($$14, this.a_($$14), $$12, $$13);
         }
      }

      if ($$5 == $$10.b()) {
         this.a(new lw(me.c, $$10), $$7 + 0.5, $$8 + 0.5, $$9 + 0.5, 0.0, 0.0, 0.0);
      }

      if (!$$10.m(this, $$6)) {
         this.v($$6).a().l().ifPresent($$1x -> {
            if ($$1x.a(this.A)) {
               this.a($$1x.a(), $$6.u() + this.A.j(), $$6.v() + this.A.j(), $$6.w() + this.A.j(), 0.0, 0.0, 0.0);
            }
         });
      }
   }

   private void a(jb $$0, eeb $$1, mc $$2, boolean $$3) {
      if ($$1.y().c()) {
         fjm $$4 = $$1.g(this, $$0);
         double $$5 = $$4.c(jh.a.b);
         if ($$5 < 1.0) {
            if ($$3) {
               this.a($$0.u(), $$0.u() + 1, $$0.w(), $$0.w() + 1, $$0.v() + 1 - 0.05, $$2);
            }
         } else if (!$$1.a(azo.aw)) {
            double $$6 = $$4.b(jh.a.b);
            if ($$6 > 0.0) {
               this.a($$0, $$2, $$4, $$0.v() + $$6 - 0.05);
            } else {
               jb $$7 = $$0.e();
               eeb $$8 = this.a_($$7);
               fjm $$9 = $$8.g(this, $$7);
               double $$10 = $$9.c(jh.a.b);
               if ($$10 < 1.0 && $$8.y().c()) {
                  this.a($$0, $$2, $$4, $$0.v() - 0.05);
               }
            }
         }
      }
   }

   private void a(jb $$0, mc $$1, fjm $$2, double $$3) {
      this.a($$0.u() + $$2.b(jh.a.a), $$0.u() + $$2.c(jh.a.a), $$0.w() + $$2.b(jh.a.c), $$0.w() + $$2.c(jh.a.c), $$3, $$1);
   }

   private void a(double $$0, double $$1, double $$2, double $$3, double $$4, mc $$5) {
      this.a($$5, bcb.d(this.A.j(), $$0, $$1), $$4, bcb.d(this.A.j(), $$2, $$3), 0.0, 0.0, 0.0);
   }

   @Override
   public q a(p $$0) {
      q $$1 = super.a($$0);
      $$1.a("Server brand", () -> this.L.t.j.h());
      $$1.a("Server type", () -> this.L.W() == null ? "Non-integrated multiplayer server" : "Integrated singleplayer server");
      $$1.a("Tracked entity count", () -> String.valueOf(this.h()));
      return $$1;
   }

   @Override
   public void a(@Nullable bzm $$0, double $$1, double $$2, double $$3, jl<ayy> $$4, aza $$5, float $$6, float $$7, long $$8) {
      if ($$0 == this.L.t) {
         this.a($$1, $$2, $$3, $$4.a(), $$5, $$6, $$7, false, $$8);
      }
   }

   @Override
   public void a(@Nullable bzm $$0, bzm $$1, jl<ayy> $$2, aza $$3, float $$4, float $$5, long $$6) {
      if ($$0 == this.L.t) {
         this.L.al().a((hvr)(new hvh($$2.a(), $$3, $$4, $$5, $$1, $$6)));
      }
   }

   @Override
   public void a(bzm $$0, ayy $$1, aza $$2, float $$3, float $$4) {
      this.L.al().a((hvr)(new hvh($$1, $$2, $$3, $$4, $$0, this.A.g())));
   }

   @Override
   public void a(ayy $$0, aza $$1, float $$2, float $$3) {
      if (this.L.t != null) {
         this.L.al().a((hvr)(new hvh($$0, $$1, $$2, $$3, this.L.t, this.A.g())));
      }
   }

   @Override
   public void a(double $$0, double $$1, double $$2, ayy $$3, aza $$4, float $$5, float $$6, boolean $$7) {
      this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, this.A.g());
   }

   private void a(double $$0, double $$1, double $$2, ayy $$3, aza $$4, float $$5, float $$6, boolean $$7, long $$8) {
      double $$9 = this.L.j.l().d().c($$0, $$1, $$2);
      hvm $$10 = new hvm($$3, $$4, $$5, $$6, bck.a($$8), $$0, $$1, $$2);
      if ($$7 && $$9 > 100.0) {
         double $$11 = Math.sqrt($$9) / 40.0;
         this.L.al().a($$10, (int)($$11 * 20.0));
      } else {
         this.L.al().a($$10);
      }
   }

   @Override
   public void a(double $$0, double $$1, double $$2, double $$3, double $$4, double $$5, List<dfj> $$6) {
      if ($$6.isEmpty()) {
         for (int $$7 = 0; $$7 < this.A.a(3) + 2; $$7++) {
            this.a(me.ae, $$0, $$1, $$2, this.A.k() * 0.05, 0.005, this.A.k() * 0.05);
         }
      } else {
         this.L.g.a(new gud.e(this, $$0, $$1, $$2, $$3, $$4, $$5, this.L.g, $$6));
      }
   }

   @Override
   public void a(zw<?> $$0) {
      this.F.b($$0);
   }

   @Override
   public dhn R() {
      return this.F.l();
   }

   @Override
   public bxt v() {
      return this.K;
   }

   @Override
   public fkg<dpz> V() {
      return fkd.b();
   }

   @Override
   public fkg<fak> U() {
      return fkd.b();
   }

   public grg i() {
      return this.S;
   }

   @Nullable
   @Override
   public fcg a(fce $$0) {
      return this.O.get($$0);
   }

   public void a(fce $$0, fcg $$1) {
      this.O.put($$0, $$1);
   }

   @Override
   public fjx S() {
      return this.F.B();
   }

   @Override
   public void a(jb $$0, eeb $$1, eeb $$2, int $$3) {
      this.G.a(this, $$0, $$1, $$2, $$3);
   }

   @Override
   public void b(jb $$0, eeb $$1, eeb $$2) {
      this.G.a($$0, $$1, $$2);
   }

   public void c(int $$0, int $$1, int $$2) {
      this.G.a($$0, $$1, $$2);
   }

   public void b(int $$0, int $$1, int $$2, int $$3, int $$4, int $$5) {
      this.G.b($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public void a(int $$0, jb $$1, int $$2) {
      this.G.a($$0, $$1, $$2);
   }

   @Override
   public void b(int $$0, jb $$1, int $$2) {
      this.H.a($$0, $$1, $$2);
   }

   @Override
   public void a(@Nullable bzm $$0, int $$1, jb $$2, int $$3) {
      try {
         this.H.b($$1, $$2, $$3);
      } catch (Throwable var8) {
         p $$5 = p.a(var8, "Playing level event");
         q $$6 = $$5.a("Level event being played");
         $$6.a("Block coordinates", q.a(this, $$2));
         $$6.a("Event source", $$0);
         $$6.a("Event type", $$1);
         $$6.a("Event data", $$3);
         throw new aa($$5);
      }
   }

   @Override
   public void a(mc $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6) {
      this.G.a($$0, $$0.a().b(), $$1, $$2, $$3, $$4, $$5, $$6);
   }

   @Override
   public void a(mc $$0, boolean $$1, boolean $$2, double $$3, double $$4, double $$5, double $$6, double $$7, double $$8) {
      this.G.a($$0, $$0.a().b() || $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8);
   }

   @Override
   public void b(mc $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6) {
      this.G.a($$0, false, true, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   @Override
   public void a(mc $$0, boolean $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      this.G.a($$0, $$0.a().b() || $$1, true, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   public List<gwf> A() {
      return this.M;
   }

   public List<cpp> j() {
      return this.N;
   }

   @Override
   public jl<dnx> a(int $$0, int $$1, int $$2) {
      return this.K_().f(mn.aK).b(doe.b);
   }

   public float g(float $$0) {
      float $$1 = this.f($$0);
      float $$2 = 1.0F - (bcb.b($$1 * (float) (Math.PI * 2)) * 2.0F + 0.2F);
      $$2 = bcb.a($$2, 0.0F, 1.0F);
      $$2 = 1.0F - $$2;
      $$2 *= 1.0F - this.d($$0) * 5.0F / 16.0F;
      $$2 *= 1.0F - this.b($$0) * 5.0F / 16.0F;
      return $$2 * 0.8F + 0.2F;
   }

   public int a(fis $$0, float $$1) {
      float $$2 = this.f($$1);
      fis $$3 = $$0.a(2.0, 2.0, 2.0).c(0.25);
      fis $$4 = bba.a($$3, ($$0x, $$1x, $$2x) -> fis.a(this.I_().a($$0x, $$1x, $$2x).a().a()));
      float $$5 = bcb.b($$2 * (float) (Math.PI * 2)) * 2.0F + 0.5F;
      $$5 = bcb.a($$5, 0.0F, 1.0F);
      $$4 = $$4.c((double)$$5);
      int $$6 = baj.a($$4);
      float $$7 = this.d($$1);
      if ($$7 > 0.0F) {
         float $$8 = 0.6F;
         float $$9 = $$7 * 0.75F;
         int $$10 = baj.a(baj.e($$6), 0.6F);
         $$6 = baj.a($$9, $$6, $$10);
      }

      float $$11 = this.b($$1);
      if ($$11 > 0.0F) {
         float $$12 = 0.2F;
         float $$13 = $$11 * 0.75F;
         int $$14 = baj.a(baj.e($$6), 0.2F);
         $$6 = baj.a($$13, $$6, $$14);
      }

      int $$15 = this.k();
      if ($$15 > 0) {
         float $$16 = Math.min($$15 - $$1, 1.0F);
         $$16 *= 0.45F;
         $$6 = baj.a($$16, $$6, baj.a(204, 204, 255));
      }

      return $$6;
   }

   public int h(float $$0) {
      int $$1 = -1;
      float $$2 = this.d($$0);
      if ($$2 > 0.0F) {
         int $$3 = baj.a(baj.e($$1), 0.6F);
         $$1 = baj.a($$2 * 0.95F, $$1, $$3);
      }

      float $$4 = this.f($$0);
      float $$5 = bcb.b($$4 * (float) (Math.PI * 2)) * 2.0F + 0.5F;
      $$5 = bcb.a($$5, 0.0F, 1.0F);
      $$1 = baj.a($$1, baj.a(1.0F, $$5 * 0.9F + 0.1F, $$5 * 0.9F + 0.1F, $$5 * 0.85F + 0.15F));
      float $$6 = this.b($$0);
      if ($$6 > 0.0F) {
         int $$7 = baj.a(baj.e($$1), 0.2F);
         $$1 = baj.a($$6 * 0.95F, $$1, $$7);
      }

      return $$1;
   }

   public float i(float $$0) {
      float $$1 = this.f($$0);
      float $$2 = 1.0F - (bcb.b($$1 * (float) (Math.PI * 2)) * 2.0F + 0.25F);
      $$2 = bcb.a($$2, 0.0F, 1.0F);
      return $$2 * $$2 * 0.5F;
   }

   public int k() {
      return this.L.n.b().c() ? 0 : this.Q;
   }

   @Override
   public void c(int $$0) {
      this.Q = $$0;
   }

   @Override
   public float a(jh $$0, boolean $$1) {
      boolean $$2 = this.d().c();
      if (!$$1) {
         return $$2 ? 0.9F : 1.0F;
      } else {
         switch ($$0) {
            case a:
               return $$2 ? 0.9F : 0.5F;
            case b:
               return $$2 ? 0.9F : 1.0F;
            case c:
            case d:
               return 0.8F;
            case e:
            case f:
               return 0.6F;
            default:
               return 1.0F;
         }
      }
   }

   @Override
   public int a(jb $$0, dme $$1) {
      fvj $$2 = (fvj)this.R.get($$1);
      return $$2.a($$0);
   }

   public int b(jb $$0, dme $$1) {
      int $$2 = fue.R().n.H().c();
      if ($$2 == 0) {
         return $$1.getColor(this.v($$0).a(), $$0.u(), $$0.w());
      } else {
         int $$3 = ($$2 * 2 + 1) * ($$2 * 2 + 1);
         int $$4 = 0;
         int $$5 = 0;
         int $$6 = 0;
         je $$7 = new je($$0.u() - $$2, $$0.v(), $$0.w() - $$2, $$0.u() + $$2, $$0.v(), $$0.w() + $$2);
         jb.a $$8 = new jb.a();

         while ($$7.a()) {
            $$8.d($$7.b(), $$7.c(), $$7.d());
            int $$9 = $$1.getColor(this.v($$8).a(), $$8.u(), $$8.w());
            $$4 += ($$9 & 0xFF0000) >> 16;
            $$5 += ($$9 & 0xFF00) >> 8;
            $$6 += $$9 & 0xFF;
         }

         return ($$4 / $$3 & 0xFF) << 16 | ($$5 / $$3 & 0xFF) << 8 | $$6 / $$3 & 0xFF;
      }
   }

   public void a(jb $$0, float $$1) {
      this.B.a($$0, $$1);
   }

   @Override
   public String toString() {
      return "ClientLevel";
   }

   public grk.a l() {
      return this.I;
   }

   @Override
   public void a(jl<ejb> $$0, fis $$1, ejb.a $$2) {
   }

   protected Map<fce, fcg> m() {
      return ImmutableMap.copyOf(this.O);
   }

   protected void a(Map<fce, fcg> $$0) {
      this.O.putAll($$0);
   }

   @Override
   protected eip<bzm> I() {
      return this.E.a();
   }

   @Override
   public String K() {
      return "Chunks[C] W: " + this.S.e() + " E: " + this.E.c();
   }

   @Override
   public void b(jb $$0, eeb $$1) {
      this.L.g.a($$0, $$1);
   }

   public void i(int $$0) {
      this.U = $$0;
   }

   public int n() {
      return this.U;
   }

   @Override
   public cyd L() {
      return this.F.A();
   }

   @Override
   public deq M() {
      return this.F.C();
   }

   @Override
   public eby N() {
      return this.F.D();
   }

   @Override
   public void a(
      @Nullable bzm $$0,
      @Nullable byb $$1,
      @Nullable dmo $$2,
      double $$3,
      double $$4,
      double $$5,
      float $$6,
      boolean $$7,
      dmu.a $$8,
      mc $$9,
      mc $$10,
      jl<ayy> $$11
   ) {
   }

   @Override
   public int Q() {
      return this.X;
   }

   @Override
   public int t(jb $$0) {
      return fue.R().az().a(this.a_($$0), this, $$0, 0);
   }

   @Override
   public void registerForCleaning(grd<grk, ?> $$0) {
      this.F.a($$0);
   }

   public static class a implements fde {
      private final boolean a;
      private final boolean b;
      private jb c;
      private float d;
      private long e;
      private long f;
      private boolean g;
      private bxg h;
      private boolean i;

      public a(bxg $$0, boolean $$1, boolean $$2) {
         this.h = $$0;
         this.a = $$1;
         this.b = $$2;
      }

      @Override
      public jb a() {
         return this.c;
      }

      @Override
      public float b() {
         return this.d;
      }

      @Override
      public long c() {
         return this.e;
      }

      @Override
      public long d() {
         return this.f;
      }

      public void a(long $$0) {
         this.e = $$0;
      }

      public void b(long $$0) {
         this.f = $$0;
      }

      @Override
      public void a(jb $$0, float $$1) {
         this.c = $$0.j();
         this.d = $$1;
      }

      @Override
      public boolean g() {
         return false;
      }

      @Override
      public boolean i() {
         return this.g;
      }

      @Override
      public void b(boolean $$0) {
         this.g = $$0;
      }

      @Override
      public boolean l() {
         return this.a;
      }

      @Override
      public bxg q() {
         return this.h;
      }

      @Override
      public boolean r() {
         return this.i;
      }

      @Override
      public void a(q $$0, dmw $$1) {
         fde.super.a($$0, $$1);
      }

      public void a(bxg $$0) {
         this.h = $$0;
      }

      public void a(boolean $$0) {
         this.i = $$0;
      }

      public double a(dmw $$0) {
         return this.b ? $$0.L_() : 63.0;
      }

      public float e() {
         return this.b ? 1.0F : 32.0F;
      }
   }

   final class b implements eio<bzm> {
      public void a(bzm $$0) {
      }

      public void b(bzm $$0) {
      }

      public void c(bzm $$0) {
         grk.this.f.a($$0);
      }

      public void d(bzm $$0) {
         grk.this.f.b($$0);
      }

      public void e(bzm $$0) {
         switch ($$0) {
            case gwf $$1:
               grk.this.M.add($$1);
               break;
            case cps $$2:
               grk.this.N.addAll(Arrays.asList($$2.t()));
               break;
            default:
         }
      }

      public void f(bzm $$0) {
         $$0.an();
         switch ($$0) {
            case gwf $$1:
               grk.this.M.remove($$1);
               break;
            case cps $$2:
               grk.this.N.removeAll(Arrays.asList($$2.t()));
               break;
            default:
         }
      }

      public void g(bzm $$0) {
      }
   }
}
