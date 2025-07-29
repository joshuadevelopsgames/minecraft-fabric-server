import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Objects;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.mojang.datafixers.util.Pair;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.JavaOps;
import it.unimi.dsi.fastutil.doubles.DoubleDoubleImmutablePair;
import it.unimi.dsi.fastutil.objects.Reference2ObjectArrayMap;
import it.unimi.dsi.fastutil.objects.Reference2ObjectMap;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.UUID;
import java.util.Map.Entry;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.function.Predicate;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import org.jetbrains.annotations.Contract;
import org.slf4j.Logger;

public abstract class cam extends bzm implements bzf, fkx {
   private static final Logger a = LogUtils.getLogger();
   private static final String b = "active_effects";
   public static final String l = "attributes";
   public static final String m = "sleeping_pos";
   public static final String n = "equipment";
   public static final String o = "Brain";
   public static final String p = "FallFlying";
   public static final String q = "HurtTime";
   public static final String r = "DeathTime";
   public static final String s = "HurtByTimestamp";
   public static final String t = "Health";
   private static final ame c = ame.b("powder_snow");
   private static final ame d = ame.b("sprinting");
   private static final cbq e = new cbq(d, 0.3F, cbq.a.c);
   public static final int u = 98;
   public static final int aM = 100;
   public static final int aN = 105;
   public static final int aO = 106;
   public static final int aP = 6;
   public static final int aQ = 100;
   private static final int bQ = 40;
   public static final double aR = 0.003;
   public static final double aS = 0.08;
   public static final int aT = 20;
   protected static final float aU = 0.98F;
   private static final int bR = 10;
   private static final int bS = 2;
   public static final float aV = 0.42F;
   private static final double bT = 128.0;
   protected static final int aW = 1;
   protected static final int aX = 2;
   protected static final int aY = 4;
   protected static final alh<Byte> aZ = all.a(cam.class, alj.a);
   private static final alh<Float> bU = all.a(cam.class, alj.d);
   private static final alh<List<mc>> bV = all.a(cam.class, alj.m);
   private static final alh<Boolean> bW = all.a(cam.class, alj.k);
   private static final alh<Integer> bX = all.a(cam.class, alj.b);
   private static final alh<Integer> bY = all.a(cam.class, alj.b);
   private static final alh<Optional<jb>> bZ = all.a(cam.class, alj.p);
   private static final int ca = 15;
   protected static final bzp ba = bzp.c(0.2F, 0.2F).b(0.2F);
   public static final float bb = 0.5F;
   public static final float bc = 0.5F;
   public static final Predicate<cam> bd = $$0 -> {
      if ($$0 instanceof cut $$1) {
         dcv $$3 = $$1.a(bzw.f);
         return !$$3.a(azx.cw);
      } else {
         return true;
      }
   };
   private static final Dynamic<?> cb = new Dynamic(JavaOps.INSTANCE, Map.of("memories", Map.of()));
   private final cbp cc;
   private final bxy cd = new bxy(this);
   private final Map<jl<byo>, byq> ce = Maps.newHashMap();
   private final Map<bzw, dcv> cf = ag.a(bzw.class, $$0x -> dcv.l);
   public boolean be;
   private boolean cg = false;
   public bxi bf;
   public int bg;
   public int bh;
   public int bi;
   public int bj;
   public int bk;
   public int bl;
   public float bm;
   public float bn;
   protected int bo;
   public final cbl bp = new cbl();
   public final int bq = 20;
   public float br;
   public float bs;
   public float bt;
   public float bu;
   public final bzl bv = new bzl(this);
   @Nullable
   protected bzs<cut> bw;
   protected int bx;
   protected boolean by;
   protected int bz;
   protected float bA;
   protected boolean bB;
   public float bC;
   public float bD;
   public float bE;
   protected cah bF = new cah(this);
   protected double bG;
   protected int bH;
   private boolean ch = true;
   @Nullable
   private bzs<cam> ci;
   private int cj;
   @Nullable
   private cam ck;
   private int cl;
   private float cm;
   private int cn;
   private float co;
   protected dcv bI = dcv.l;
   protected int bJ;
   protected int bK;
   private jb cp;
   private Optional<jb> cq = Optional.empty();
   @Nullable
   private byb cr;
   private long cs;
   protected int bL;
   protected float bM;
   @Nullable
   protected dcv bN;
   private float ct;
   private float cu;
   protected cbm<?> bO;
   private boolean cv;
   private final EnumMap<bzw, Reference2ObjectMap<dji, Set<dka>>> cw = new EnumMap<>(bzw.class);
   protected final bzq bP;
   private fkt.a cx = new fkt.a();

   protected cam(bzv<? extends cam> $$0, dmu $$1) {
      super($$0, $$1);
      this.cc = new cbp(cbt.a($$0));
      this.x(this.fa());
      this.bP = this.eg();
      this.V = true;
      this.ay();
      this.v((float)(Math.random() * (float) (Math.PI * 2)));
      this.bt = this.dP();
      this.bO = this.a(cb);
   }

   @Contract(
      pure = true
   )
   protected bzq eg() {
      return new bzq();
   }

   public cbm<?> eh() {
      return this.bO;
   }

   protected cbm.b<?> ei() {
      return cbm.a(ImmutableList.of(), ImmutableList.of());
   }

   protected cbm<?> a(Dynamic<?> $$0) {
      return this.ei().a($$0);
   }

   @Override
   public void c(aub $$0) {
      this.a($$0, this.ea().y(), Float.MAX_VALUE);
   }

   public boolean a(bzv<?> $$0) {
      return true;
   }

   @Override
   protected void a(all.a $$0) {
      $$0.a(aZ, (byte)0);
      $$0.a(bV, List.of());
      $$0.a(bW, false);
      $$0.a(bX, 0);
      $$0.a(bY, 0);
      $$0.a(bU, 1.0F);
      $$0.a(bZ, Optional.empty());
   }

   public static cbr.a ej() {
      return cbr.a()
         .a(cbs.t)
         .a(cbs.q)
         .a(cbs.w)
         .a(cbs.a)
         .a(cbs.b)
         .a(cbs.s)
         .a(cbs.C)
         .a(cbs.z)
         .a(cbs.o)
         .a(cbs.y)
         .a(cbs.l)
         .a(cbs.p)
         .a(cbs.x)
         .a(cbs.h)
         .a(cbs.j)
         .a(cbs.G)
         .a(cbs.v)
         .a(cbs.d)
         .a(cbs.i)
         .a(cbs.H);
   }

   @Override
   protected void a(double $$0, boolean $$1, eeb $$2, jb $$3) {
      if (!this.bm()) {
         this.bu();
      }

      if (this.ai() instanceof aub $$4 && $$1 && this.am > 0.0) {
         this.b($$4, $$3);
         double $$5 = Math.max(0, bcb.a(this.h(this.am)));
         if ($$5 > 0.0 && !$$2.l()) {
            double $$6 = this.dC();
            double $$7 = this.dE();
            double $$8 = this.dI();
            jb $$9 = this.dx();
            if ($$3.u() != $$9.u() || $$3.w() != $$9.w()) {
               double $$10 = $$6 - $$3.u() - 0.5;
               double $$11 = $$8 - $$3.w() - 0.5;
               double $$12 = Math.max(Math.abs($$10), Math.abs($$11));
               $$6 = $$3.u() + 0.5 + $$10 / $$12 * 0.5;
               $$8 = $$3.w() + 0.5 + $$11 / $$12 * 0.5;
            }

            double $$13 = Math.min(0.2F + $$5 / 15.0, 2.5);
            int $$14 = (int)(150.0 * $$13);
            $$4.a(new lw(me.b, $$2), $$6, $$7, $$8, $$14, 0.0, 0.0, 0.0, 0.15F);
         }
      }

      super.a($$0, $$1, $$2, $$3);
      if ($$1) {
         this.cq = Optional.empty();
      }
   }

   public boolean ek() {
      return this.ap().a(azs.m);
   }

   public float b(float $$0) {
      return bcb.h($$0, this.cu, this.ct);
   }

   public boolean el() {
      return this.dA().b() < 1.0E-5F && this.bp();
   }

   @Override
   public void az() {
      this.bm = this.bn;
      if (this.ax) {
         this.fW().ifPresent(this::a);
      }

      if (this.ai() instanceof aub $$0) {
         djk.b($$0, this);
      }

      super.az();
      btt $$1 = bts.a();
      $$1.a("livingEntityBaseTick");
      if (this.bl() || this.ai().C) {
         this.aI();
      }

      if (this.bO() && this.ai() instanceof aub $$2) {
         boolean $$3 = this instanceof cut;
         if (this.bP()) {
            this.a($$2, this.ea().g(), 1.0F);
         } else if ($$3 && !$$2.F_().a(this.cV())) {
            double $$4 = $$2.F_().a(this) + $$2.F_().n();
            if ($$4 < 0.0) {
               double $$5 = $$2.F_().o();
               if ($$5 > 0.0) {
                  this.a($$2, this.ea().x(), Math.max(1, bcb.a(-$$4 * $$5)));
               }
            }
         }

         if (this.a(azu.a) && !$$2.a_(jb.a(this.dC(), this.dG(), this.dI())).a(dqb.nK)) {
            boolean $$6 = !this.ek() && !byr.c(this) && (!$$3 || !((cut)this).gt().a);
            if ($$6) {
               this.j(this.l(this.cw()));
               if (this.cw() == -20) {
                  this.j(0);
                  $$2.a(this, (byte)67);
                  this.a($$2, this.ea().i(), 2.0F);
               }
            } else if (this.cw() < this.cv()) {
               this.j(this.m(this.cw()));
            }

            if (this.cc() && this.dm() != null && this.dm().ce()) {
               this.bS();
            }
         } else if (this.cw() < this.cv()) {
            this.j(this.m(this.cw()));
         }

         jb $$7 = this.dx();
         if (!Objects.equal(this.cp, $$7)) {
            this.cp = $$7;
            this.b($$2, $$7);
         }
      }

      if (this.bj > 0) {
         this.bj--;
      }

      if (this.aw > 0 && !(this instanceof auc)) {
         this.aw--;
      }

      if (this.eM() && this.ai().h(this)) {
         this.es();
      }

      if (this.bx > 0) {
         this.bx--;
      } else {
         this.bw = null;
      }

      if (this.ck != null && !this.ck.bO()) {
         this.ck = null;
      }

      cam $$8 = this.ew();
      if ($$8 != null) {
         if (!$$8.bO()) {
            this.a(null);
         } else if (this.as - this.cj > 100) {
            this.a(null);
         }
      }

      this.eD();
      this.bu = this.bt;
      this.bs = this.br;
      this.aa = this.dP();
      this.ab = this.dR();
      $$1.c();
   }

   @Override
   protected float aW() {
      return bcb.h((float)this.i(cbs.v), super.aW(), 1.0F);
   }

   public float em() {
      return 0.0F;
   }

   protected void en() {
      cbo $$0 = this.h(cbs.w);
      if ($$0 != null) {
         if ($$0.a(c) != null) {
            $$0.c(c);
         }
      }
   }

   protected void eo() {
      if (!this.bw().l()) {
         int $$0 = this.cy();
         if ($$0 > 0) {
            cbo $$1 = this.h(cbs.w);
            if ($$1 == null) {
               return;
            }

            float $$2 = -0.05F * this.cz();
            $$1.b(new cbq(c, $$2, cbq.a.a));
         }
      }
   }

   protected void b(aub $$0, jb $$1) {
      djk.a($$0, this);
   }

   public boolean g_() {
      return false;
   }

   public float ep() {
      return this.g_() ? 0.5F : 1.0F;
   }

   public final float eq() {
      cbp $$0 = this.fg();
      return $$0 == null ? 1.0F : this.c((float)$$0.c(cbs.z));
   }

   protected float c(float $$0) {
      return $$0;
   }

   public boolean er() {
      return true;
   }

   protected void es() {
      this.bl++;
      if (this.bl >= 20 && !this.ai().B_() && !this.dU()) {
         this.ai().a(this, (byte)60);
         this.a(bzm.e.a);
      }
   }

   public boolean et() {
      return !this.g_();
   }

   protected boolean eu() {
      return !this.g_();
   }

   protected int l(int $$0) {
      cbo $$1 = this.h(cbs.x);
      double $$2;
      if ($$1 != null) {
         $$2 = $$1.g();
      } else {
         $$2 = 0.0;
      }

      return $$2 > 0.0 && this.ar.j() >= 1.0 / ($$2 + 1.0) ? $$0 : $$0 - 1;
   }

   protected int m(int $$0) {
      return Math.min($$0 + 4, this.cv());
   }

   public final int a(aub $$0, @Nullable bzm $$1) {
      return djk.a($$0, $$1, this, this.e($$0));
   }

   protected int e(aub $$0) {
      return 0;
   }

   protected boolean ev() {
      return false;
   }

   @Nullable
   public cam ew() {
      return bzs.a(this.ci, this.ai(), cam.class);
   }

   @Nullable
   public cut ex() {
      return bzs.a(this.bw, this.ai(), cut.class);
   }

   @Override
   public cam ak() {
      return this.ew();
   }

   public int ey() {
      return this.cj;
   }

   public void a(cut $$0, int $$1) {
      this.a(new bzs<>($$0), $$1);
   }

   public void a(UUID $$0, int $$1) {
      this.a(new bzs<>($$0), $$1);
   }

   private void a(bzs<cut> $$0, int $$1) {
      this.bw = $$0;
      this.bx = $$1;
   }

   public void a(@Nullable cam $$0) {
      this.ci = $$0 != null ? new bzs<>($$0) : null;
      this.cj = this.as;
   }

   @Nullable
   public cam ez() {
      return this.ck;
   }

   public int eA() {
      return this.cl;
   }

   public void C(bzm $$0) {
      if ($$0 instanceof cam) {
         this.ck = (cam)$$0;
      } else {
         this.ck = null;
      }

      this.cl = this.as;
   }

   public int eB() {
      return this.bz;
   }

   public void n(int $$0) {
      this.bz = $$0;
   }

   public boolean eC() {
      return this.cg;
   }

   public void r(boolean $$0) {
      this.cg = $$0;
   }

   protected boolean b(bzw $$0) {
      return true;
   }

   public void a(bzw $$0, dcv $$1, dcv $$2) {
      if (!this.ai().B_() && !this.am()) {
         if (!dcv.c($$1, $$2) && !this.ax) {
            dle $$3 = $$2.a(kq.D);
            if (!this.be() && $$3 != null && $$0 == $$3.b()) {
               this.ai().a(null, this.dC(), this.dE(), this.dI(), this.a($$0, $$2, $$3), this.do(), 1.0F, 1.0F, this.ar.g());
            }

            if (this.b($$0)) {
               this.c($$3 != null ? ejb.v : ejb.S);
            }
         }
      }
   }

   protected jl<ayy> a(bzw $$0, dcv $$1, dle $$2) {
      return $$2.c();
   }

   @Override
   public void a(bzm.e $$0) {
      if (($$0 == bzm.e.a || $$0 == bzm.e.b) && this.ai() instanceof aub $$1) {
         this.a($$1, $$0);
      }

      super.a($$0);
      this.bO.a();
   }

   @Override
   public void b(bzm.e $$0) {
      super.b($$0);
      if (this.ai() instanceof aub $$1) {
         $$1.h().c((fkx)this);
      }
   }

   protected void a(aub $$0, bzm.e $$1) {
      for (byq $$2 : this.eI()) {
         $$2.a($$0, this, $$1);
      }

      this.ce.clear();
   }

   @Override
   protected void a(fdc $$0) {
      $$0.a("Health", this.eL());
      $$0.a("HurtTime", (short)this.bj);
      $$0.a("HurtByTimestamp", this.cj);
      $$0.a("DeathTime", (short)this.bl);
      $$0.a("AbsorptionAmount", this.fD());
      $$0.a("attributes", cbo.a.b, this.fg().d());
      if (!this.ce.isEmpty()) {
         $$0.a("active_effects", byq.d.listOf(), List.copyOf(this.ce.values()));
      }

      $$0.a("FallFlying", this.fQ());
      this.fW().ifPresent($$1x -> $$0.a("sleeping_pos", jb.a, $$1x));
      DataResult<Dynamic<?>> $$1 = this.bO.a(uw.a).map($$0x -> new Dynamic(uw.a, $$0x));
      $$1.resultOrPartial(a::error).ifPresent($$1x -> $$0.a("Brain", Codec.PASSTHROUGH, $$1x));
      if (this.bw != null) {
         this.bw.a($$0, "last_hurt_by_player");
         $$0.a("last_hurt_by_player_memory_time", this.bx);
      }

      if (this.ci != null) {
         this.ci.a($$0, "last_hurt_by_mob");
         $$0.a("ticks_since_last_hurt_by_mob", this.as - this.cj);
      }

      if (!this.bP.a()) {
         $$0.a("equipment", bzq.a, this.bP);
      }

      if (this.cx.a()) {
         $$0.a("locator_bar_icon", fkt.a.a, this.cx);
      }
   }

   @Nullable
   public cqz a(dcv $$0, boolean $$1, boolean $$2) {
      if ($$0.f()) {
         return null;
      } else if (this.ai().C) {
         this.a(bxi.a);
         return null;
      } else {
         cqz $$3 = this.b($$0, $$1, $$2);
         if ($$3 != null) {
            this.ai().b($$3);
         }

         return $$3;
      }
   }

   @Override
   protected void a(fda $$0) {
      this.F($$0.a("AbsorptionAmount", 0.0F));
      if (this.ai() != null && !this.ai().C) {
         $$0.<List<cbo.a>>a("attributes", cbo.a.b).ifPresent(this.fg()::a);
      }

      List<byq> $$1 = $$0.<List<byq>>a("active_effects", byq.d.listOf()).orElse(List.of());
      this.ce.clear();

      for (byq $$2 : $$1) {
         this.ce.put($$2.c(), $$2);
      }

      this.x($$0.a("Health", this.fa()));
      this.bj = $$0.a("HurtTime", (short)0);
      this.bl = $$0.a("DeathTime", (short)0);
      this.cj = $$0.a("HurtByTimestamp", 0);
      $$0.g("Team").ifPresent($$0x -> {
         fjx $$1x = this.ai().S();
         fjs $$2x = $$1x.b($$0x);
         boolean $$3 = $$2x != null && $$1x.a(this.cL(), $$2x);
         if (!$$3) {
            a.warn("Unable to add mob to team \"{}\" (that team probably doesn't exist)", $$0x);
         }
      });
      this.b(7, $$0.a("FallFlying", false));
      $$0.<jb>a("sleeping_pos", jb.a).ifPresentOrElse($$0x -> {
         this.g($$0x);
         this.ay.a(aD, cay.c);
         if (!this.ax) {
            this.a($$0x);
         }
      }, this::fX);
      $$0.<Dynamic>a("Brain", Codec.PASSTHROUGH).ifPresent($$0x -> this.bO = this.a($$0x));
      this.bw = bzs.a($$0, "last_hurt_by_player");
      this.bx = $$0.a("last_hurt_by_player_memory_time", 0);
      this.ci = bzs.a($$0, "last_hurt_by_mob");
      this.cj = $$0.a("ticks_since_last_hurt_by_mob", 0) + this.as;
      this.bP.a($$0.<bzq>a("equipment", bzq.a).orElseGet(bzq::new));
      this.cx = $$0.<fkt.a>a("locator_bar_icon", fkt.a.a).orElseGet(fkt.a::new);
   }

   protected void eD() {
      if (this.ai() instanceof aub $$0) {
         Iterator<jl<byo>> $$1 = this.ce.keySet().iterator();

         try {
            while ($$1.hasNext()) {
               jl<byo> $$2 = $$1.next();
               byq $$3 = this.ce.get($$2);
               if (!$$3.a($$0, this, () -> this.a($$3, true, null))) {
                  $$1.remove();
                  this.c(List.of($$3));
               } else if ($$3.d() % 600 == 0) {
                  this.a($$3, false, null);
               }
            }
         } catch (ConcurrentModificationException var6) {
         }

         if (this.ch) {
            this.K();
            this.p();
            this.ch = false;
         }
      } else {
         for (byq $$4 : this.ce.values()) {
            $$4.i();
         }

         List<mc> $$5 = this.ay.a(bV);
         if (!$$5.isEmpty()) {
            boolean $$6 = this.ay.a(bW);
            int $$7 = this.cs() ? 15 : 4;
            int $$8 = $$6 ? 5 : 1;
            if (this.ar.a($$7 * $$8) == 0) {
               this.ai().a(ag.a($$5, this.ar), this.d(0.5), this.dF(), this.g(0.5), 1.0, 1.0, 1.0);
            }
         }
      }
   }

   protected void K() {
      if (this.ce.isEmpty()) {
         this.eG();
         this.l(false);
      } else {
         this.l(this.d(bys.n));
         this.l();
      }
   }

   private void l() {
      List<mc> $$0 = this.ce.values().stream().filter(byq::g).map(byq::a).toList();
      this.ay.a(bV, $$0);
      this.ay.a(bW, d(this.ce.values()));
   }

   private void p() {
      boolean $$0 = this.cr();
      if (this.i(6) != $$0) {
         this.b(6, $$0);
      }
   }

   public double D(@Nullable bzm $$0) {
      double $$1 = 1.0;
      if (this.cj()) {
         $$1 *= 0.8;
      }

      if (this.cs()) {
         float $$2 = this.fj();
         if ($$2 < 0.1F) {
            $$2 = 0.1F;
         }

         $$1 *= 0.7 * $$2;
      }

      if ($$0 != null) {
         dcv $$3 = this.a(bzw.f);
         bzv<?> $$4 = $$0.ap();
         if ($$4 == bzv.bh && $$3.a(dcz.vN)
            || $$4 == bzv.bQ && $$3.a(dcz.vQ)
            || $$4 == bzv.aT && $$3.a(dcz.vT)
            || $$4 == bzv.aU && $$3.a(dcz.vT)
            || $$4 == bzv.F && $$3.a(dcz.vR)) {
            $$1 *= 0.5;
         }
      }

      return $$1;
   }

   public boolean c(cam $$0) {
      return $$0 instanceof cut && this.ai().an() == bxg.a ? false : $$0.eE();
   }

   public boolean eE() {
      return !this.cG() && this.eF();
   }

   public boolean eF() {
      return !this.am() && this.bO();
   }

   public static boolean d(Collection<byq> $$0) {
      for (byq $$1 : $$0) {
         if ($$1.g() && !$$1.f()) {
            return false;
         }
      }

      return true;
   }

   protected void eG() {
      this.ay.a(bV, List.of());
   }

   public boolean eH() {
      if (this.ai().C) {
         return false;
      } else if (this.ce.isEmpty()) {
         return false;
      } else {
         Map<jl<byo>, byq> $$0 = Maps.newHashMap(this.ce);
         this.ce.clear();
         this.c($$0.values());
         return true;
      }
   }

   public Collection<byq> eI() {
      return this.ce.values();
   }

   public Map<jl<byo>, byq> eJ() {
      return this.ce;
   }

   public boolean d(jl<byo> $$0) {
      return this.ce.containsKey($$0);
   }

   @Nullable
   public byq e(jl<byo> $$0) {
      return this.ce.get($$0);
   }

   public float a(jl<byo> $$0, float $$1) {
      byq $$2 = this.e($$0);
      return $$2 != null ? $$2.a(this, $$1) : 0.0F;
   }

   public final boolean a(byq $$0) {
      return this.b($$0, null);
   }

   public boolean b(byq $$0, @Nullable bzm $$1) {
      if (!this.b($$0)) {
         return false;
      } else {
         byq $$2 = this.ce.get($$0.c());
         boolean $$3 = false;
         if ($$2 == null) {
            this.ce.put($$0.c(), $$0);
            this.a($$0, $$1);
            $$3 = true;
            $$0.b(this);
         } else if ($$2.b($$0)) {
            this.a($$2, true, $$1);
            $$3 = true;
         }

         $$0.a(this);
         return $$3;
      }
   }

   public boolean b(byq $$0) {
      if (this.ap().a(azs.G)) {
         return !$$0.a(bys.M);
      } else if (this.ap().a(azs.F)) {
         return !$$0.a(bys.L);
      } else {
         return !this.ap().a(azs.w) ? true : !$$0.a(bys.j) && !$$0.a(bys.s);
      }
   }

   public void c(byq $$0, @Nullable bzm $$1) {
      if (this.b($$0)) {
         byq $$2 = this.ce.put($$0.c(), $$0);
         if ($$2 == null) {
            this.a($$0, $$1);
         } else {
            $$0.d($$2);
            this.a($$0, true, $$1);
         }
      }
   }

   public boolean eK() {
      return this.ap().a(azs.x);
   }

   @Nullable
   public final byq f(jl<byo> $$0) {
      return this.ce.remove($$0);
   }

   public boolean g(jl<byo> $$0) {
      byq $$1 = this.f($$0);
      if ($$1 != null) {
         this.c(List.of($$1));
         return true;
      } else {
         return false;
      }
   }

   protected void a(byq $$0, @Nullable bzm $$1) {
      if (!this.ai().C) {
         this.ch = true;
         $$0.c().a().a(this.fg(), $$0.e());
         this.c($$0);
      }
   }

   public void c(byq $$0) {
      for (bzm $$1 : this.da()) {
         if ($$1 instanceof auc $$2) {
            $$2.g.b(new ahf(this.ar(), $$0, false));
         }
      }
   }

   protected void a(byq $$0, boolean $$1, @Nullable bzm $$2) {
      if (!this.ai().C) {
         this.ch = true;
         if ($$1) {
            byo $$3 = $$0.c().a();
            $$3.a(this.fg());
            $$3.a(this.fg(), $$0.e());
            this.H();
         }

         this.c($$0);
      }
   }

   protected void c(Collection<byq> $$0) {
      if (!this.ai().C) {
         this.ch = true;

         for (byq $$1 : $$0) {
            $$1.c().a().a(this.fg());

            for (bzm $$2 : this.da()) {
               if ($$2 instanceof auc $$3) {
                  $$3.g.b(new afg(this.ar(), $$1.c()));
               }
            }
         }

         this.H();
      }
   }

   private void H() {
      Set<cbo> $$0 = this.fg().b();

      for (cbo $$1 : $$0) {
         this.a($$1.a());
      }

      $$0.clear();
   }

   protected void a(jl<cbn> $$0) {
      if ($$0.a(cbs.t)) {
         float $$1 = this.fa();
         if (this.eL() > $$1) {
            this.x($$1);
         }
      } else if ($$0.a(cbs.s)) {
         float $$2 = this.fb();
         if (this.fD() > $$2) {
            this.E($$2);
         }
      } else if ($$0.a(cbs.z)) {
         this.j_();
      } else if ($$0.a(cbs.H) && this.ai() instanceof aub $$3) {
         ayv $$4 = $$3.h();
         if (this.cc.c($$0) > 0.0) {
            $$4.a((fkx)this);
         } else {
            $$4.c((fkx)this);
         }
      }
   }

   public void d(float $$0) {
      float $$1 = this.eL();
      if ($$1 > 0.0F) {
         this.x($$1 + $$0);
      }
   }

   public float eL() {
      return this.ay.a(bU);
   }

   public void x(float $$0) {
      this.ay.a(bU, bcb.a($$0, 0.0F, this.fa()));
   }

   public boolean eM() {
      return this.eL() <= 0.0F;
   }

   @Override
   public boolean a(aub $$0, byb $$1, float $$2) {
      if (this.a($$0, $$1)) {
         return false;
      } else if (this.eM()) {
         return false;
      } else if ($$1.a(azp.i) && this.d(bys.l)) {
         return false;
      } else {
         if (this.fY()) {
            this.fZ();
         }

         this.bz = 0;
         if ($$2 < 0.0F) {
            $$2 = 0.0F;
         }

         float $$4 = this.b($$0, $$1, $$2);
         $$2 -= $$4;
         boolean $$5 = $$4 > 0.0F;
         if ($$1.a(azp.o) && this.ap().a(azs.l)) {
            $$2 *= 5.0F;
         }

         if ($$1.a(azp.a) && !this.a(bzw.f).f()) {
            this.d($$1, $$2);
            $$2 *= 0.75F;
         }

         if (Float.isNaN($$2) || Float.isInfinite($$2)) {
            $$2 = Float.MAX_VALUE;
         }

         boolean $$6 = true;
         if (this.aw > 10.0F && !$$1.a(azp.e)) {
            if ($$2 <= this.bA) {
               return false;
            }

            this.c($$0, $$1, $$2 - this.bA);
            this.bA = $$2;
            $$6 = false;
         } else {
            this.bA = $$2;
            this.aw = 20;
            this.c($$0, $$1, $$2);
            this.bk = 10;
            this.bj = this.bk;
         }

         this.f($$1);
         this.g($$1);
         if ($$6) {
            dew $$7 = this.fI().a(kq.I);
            if ($$5 && $$7 != null) {
               $$7.a($$0, this);
            } else {
               $$0.a(this, $$1);
            }

            if (!$$1.a(azp.r) && (!$$5 || $$2 > 0.0F)) {
               this.bG();
            }

            if (!$$1.a(azp.z)) {
               double $$8 = 0.0;
               double $$9 = 0.0;
               if ($$1.c() instanceof cvo $$10) {
                  DoubleDoubleImmutablePair $$11 = $$10.a_(this, $$1);
                  $$8 = -$$11.leftDouble();
                  $$9 = -$$11.rightDouble();
               } else if ($$1.i() != null) {
                  $$8 = $$1.i().a() - this.dC();
                  $$9 = $$1.i().c() - this.dI();
               }

               this.p(0.4F, $$8, $$9);
               if (!$$5) {
                  this.a($$8, $$9);
               }
            }
         }

         if (this.eM()) {
            if (!this.j($$1)) {
               if ($$6) {
                  this.b(this.f_());
                  this.i($$1);
               }

               this.a($$1);
            }
         } else if ($$6) {
            this.h($$1);
            this.i($$1);
         }

         boolean $$12 = !$$5 || $$2 > 0.0F;
         if ($$12) {
            this.cr = $$1;
            this.cs = this.ai().ae();

            for (byq $$13 : this.eI()) {
               $$13.a($$0, this, $$1, $$2);
            }
         }

         if (this instanceof auc $$14) {
            aq.i.a($$14, $$1, $$2, $$2, $$5);
            if ($$4 > 0.0F && $$4 < 3.4028235E37F) {
               $$14.a(azj.L, Math.round($$4 * 10.0F));
            }
         }

         if ($$1.d() instanceof auc $$15) {
            aq.h.a($$15, this, $$1, $$2, $$2, $$5);
         }

         return $$12;
      }
   }

   public float b(aub $$0, byb $$1, float $$2) {
      if ($$2 <= 0.0F) {
         return 0.0F;
      } else {
         dcv $$3 = this.fO();
         if ($$3 == null) {
            return 0.0F;
         } else {
            dew $$4 = $$3.a(kq.I);
            if ($$4 != null && !$$4.f().map($$1::a).orElse(false)) {
               if ($$1.c() instanceof cvb $$5 && $$5.t() > 0) {
                  return 0.0F;
               } else {
                  fis $$6 = $$1.i();
                  double $$9;
                  if ($$6 != null) {
                     fis $$7 = this.d(0.0F, this.cE());
                     fis $$8 = $$6.d(this.dv());
                     $$8 = new fis($$8.d, 0.0, $$8.f).d();
                     $$9 = Math.acos($$8.b($$7));
                  } else {
                     $$9 = (float) Math.PI;
                  }

                  float $$11 = $$4.a($$1, $$2, $$9);
                  $$4.a(this.ai(), $$3, this, this.fH(), $$11);
                  if (!$$1.a(azp.j) && $$1.c() instanceof cam $$13) {
                     this.b($$0, $$13);
                  }

                  return $$11;
               }
            } else {
               return 0.0F;
            }
         }
      }
   }

   private void i(byb $$0) {
      if ($$0.a(bye.P)) {
         aza $$1 = this instanceof cut ? aza.h : aza.f;
         this.ai().a(null, this.dv().d, this.dv().e, this.dv().f, ayz.Ba, $$1);
      }
   }

   protected void f(byb $$0) {
      if ($$0.d() instanceof cam $$1 && !$$0.a(azp.q) && (!$$0.a(bye.I) || !this.ap().a(azs.E))) {
         this.a($$1);
      }
   }

   @Nullable
   protected cut g(byb $$0) {
      bzm $$1 = $$0.d();
      if ($$1 instanceof cut $$2) {
         this.a($$2, 100);
      } else if ($$1 instanceof cpj $$3 && $$3.m()) {
         if ($$3.d() != null) {
            this.a($$3.d().c(), 100);
         } else {
            this.bw = null;
            this.bx = 0;
         }
      }

      return bzs.a(this.bw, this.ai(), cut.class);
   }

   protected void b(aub $$0, cam $$1) {
      $$1.d(this);
   }

   protected void d(cam $$0) {
      $$0.p(0.5, $$0.dC() - this.dC(), $$0.dI() - this.dI());
   }

   private boolean j(byb $$0) {
      if ($$0.a(azp.d)) {
         return false;
      } else {
         dcv $$1 = null;
         dfg $$2 = null;

         for (bxi $$3 : bxi.values()) {
            dcv $$4 = this.b($$3);
            $$2 = $$4.a(kq.H);
            if ($$2 != null) {
               $$1 = $$4.v();
               $$4.h(1);
               break;
            }
         }

         if ($$1 != null) {
            if (this instanceof auc $$5) {
               $$5.b(azj.c.b($$1.h()));
               aq.C.a($$5, $$1);
               this.c(ejb.C);
            }

            this.x(1.0F);
            $$2.a($$1, this);
            this.ai().a(this, (byte)35);
         }

         return $$2 != null;
      }
   }

   @Nullable
   public byb eN() {
      if (this.ai().ae() - this.cs > 40L) {
         this.cr = null;
      }

      return this.cr;
   }

   protected void h(byb $$0) {
      this.b(this.e($$0));
   }

   public void b(@Nullable ayy $$0) {
      if ($$0 != null) {
         this.a($$0, this.fk(), this.fl());
      }
   }

   private void g(dcv $$0) {
      if (!$$0.f()) {
         jl<ayy> $$1 = $$0.a(kq.au);
         if ($$1 != null && !this.be()) {
            this.ai().a(this.dC(), this.dE(), this.dI(), $$1.a(), this.do(), 0.8F, 0.8F + this.ai().A.i() * 0.4F, false);
         }

         this.b($$0, 5);
      }
   }

   public void a(byb $$0) {
      if (!this.dU() && !this.by) {
         bzm $$1 = $$0.d();
         cam $$2 = this.eZ();
         if ($$2 != null) {
            $$2.a(this, $$0);
         }

         if (this.fY()) {
            this.fZ();
         }

         if (!this.ai().C && this.i_()) {
            a.info("Named entity {} died: {}", this, this.eY().a().getString());
         }

         this.by = true;
         this.eY().c();
         if (this.ai() instanceof aub $$3) {
            if ($$1 == null || $$1.a($$3, this)) {
               this.c(ejb.p);
               this.b($$3, $$0);
               this.e($$2);
            }

            this.ai().a(this, (byte)3);
         }

         this.b(cay.h);
      }
   }

   protected void e(@Nullable cam $$0) {
      if (this.ai() instanceof aub $$1) {
         boolean var6 = false;
         if ($$0 instanceof cqm) {
            if ($$1.P().c(dmq.d)) {
               jb $$4 = this.dx();
               eeb $$5 = dqb.cn.m();
               if (this.ai().a_($$4).l() && $$5.a((dmx)this.ai(), $$4)) {
                  this.ai().a($$4, $$5, 3);
                  var6 = true;
               }
            }

            if (!var6) {
               cqz $$6 = new cqz(this.ai(), this.dC(), this.dE(), this.dI(), new dcv(dcz.dJ));
               this.ai().b($$6);
            }
         }
      }
   }

   protected void b(aub $$0, byb $$1) {
      boolean $$2 = this.bx > 0;
      if (this.eu() && $$0.P().c(dmq.g)) {
         this.b($$0, $$1, $$2);
         this.a($$0, $$1, $$2);
      }

      this.f($$0);
      this.b($$0, $$1.d());
   }

   protected void f(aub $$0) {
   }

   protected void b(aub $$0, @Nullable bzm $$1) {
      if (!this.eQ() && (this.ev() || this.bx > 0 && this.et() && $$0.P().c(dmq.g))) {
         caa.a($$0, this.dv(), this.a($$0, $$1));
      }
   }

   protected void a(aub $$0, byb $$1, boolean $$2) {
   }

   public long eO() {
      return 0L;
   }

   protected float b(bzm $$0, byb $$1) {
      float $$2 = (float)this.i(cbs.d);
      return this.ai() instanceof aub $$3 ? djk.d($$3, this.ed(), $$0, $$1, $$2) : $$2;
   }

   protected void b(aub $$0, byb $$1, boolean $$2) {
      Optional<amd<fdo>> $$3 = this.ee();
      if (!$$3.isEmpty()) {
         fdo $$4 = $$0.q().bc().a($$3.get());
         fdm.a $$5 = new fdm.a($$0).a(fgd.a, this).a(fgd.f, this.dv()).a(fgd.c, $$1).b(fgd.d, $$1.d()).b(fgd.e, $$1.c());
         cut $$6 = this.ex();
         if ($$2 && $$6 != null) {
            $$5 = $$5.a(fgd.b, $$6).a($$6.em());
         }

         fdm $$7 = $$5.a(fgc.g);
         $$4.a($$7, this.eO(), $$1x -> this.a($$0, $$1x));
      }
   }

   public boolean a(aub $$0, amd<fdo> $$1, BiConsumer<aub, dcv> $$2) {
      return this.a($$0, $$1, $$0x -> $$0x.a(fgd.f, this.dv()).a(fgd.a, this).a(fgc.j), $$2);
   }

   protected void a(aub $$0, amd<fdo> $$1, dcv $$2, BiConsumer<aub, dcv> $$3) {
      this.a($$0, $$1, $$1x -> $$1x.a(fgd.f, this.dv()).a(fgd.a, this).a(fgd.i, $$2).a(fgc.s), $$3);
   }

   protected boolean a(aub $$0, amd<fdo> $$1, Function<fdm.a, fdm> $$2, BiConsumer<aub, dcv> $$3) {
      fdo $$4 = $$0.q().bc().a($$1);
      fdm $$5 = $$2.apply(new fdm.a($$0));
      List<dcv> $$6 = $$4.a($$5);
      if (!$$6.isEmpty()) {
         $$6.forEach($$2x -> $$3.accept($$0, $$2x));
         return true;
      } else {
         return false;
      }
   }

   public void p(double $$0, double $$1, double $$2) {
      $$0 *= 1.0 - this.i(cbs.q);
      if (!($$0 <= 0.0)) {
         this.aE = true;
         fis $$3 = this.dA();

         while ($$1 * $$1 + $$2 * $$2 < 1.0E-5F) {
            $$1 = (Math.random() - Math.random()) * 0.01;
            $$2 = (Math.random() - Math.random()) * 0.01;
         }

         fis $$4 = new fis($$1, 0.0, $$2).d().c($$0);
         this.n($$3.d / 2.0 - $$4.d, this.aK() ? Math.min(0.4, $$3.e / 2.0 + $$0) : $$3.e, $$3.f / 2.0 - $$4.f);
      }
   }

   public void a(double $$0, double $$1) {
   }

   @Nullable
   protected ayy e(byb $$0) {
      return ayz.kT;
   }

   @Nullable
   protected ayy f_() {
      return ayz.kO;
   }

   private ayy q(int $$0) {
      return $$0 > 4 ? this.eT().b() : this.eT().a();
   }

   public void eP() {
      this.cv = true;
   }

   public boolean eQ() {
      return this.cv;
   }

   public float eR() {
      return 0.0F;
   }

   protected fin eS() {
      fin $$0 = this.cV();
      bzm $$1 = this.dm();
      if ($$1 != null) {
         fis $$2 = $$1.n(this);
         return $$0.b(Math.max($$2.e, $$0.b));
      } else {
         return $$0;
      }
   }

   public Map<dji, Set<dka>> c(bzw $$0) {
      return (Map<dji, Set<dka>>)this.cw.computeIfAbsent($$0, $$0x -> new Reference2ObjectArrayMap());
   }

   public cam.a eT() {
      return new cam.a(ayz.kU, ayz.kM);
   }

   public Optional<jb> eU() {
      return this.cq;
   }

   public boolean eV() {
      if (this.am()) {
         return false;
      } else {
         jb $$0 = this.dx();
         eeb $$1 = this.dy();
         if ($$1.a(azo.aV)) {
            this.cq = Optional.of($$0);
            return true;
         } else if ($$1.b() instanceof dzb && this.c($$0, $$1)) {
            this.cq = Optional.of($$0);
            return true;
         } else {
            return false;
         }
      }
   }

   private boolean c(jb $$0, eeb $$1) {
      if (!$$1.c(dzb.b)) {
         return false;
      } else {
         eeb $$2 = this.ai().a_($$0.e());
         return $$2.a(dqb.da) && $$2.c(dul.b) == $$1.c(dzb.f);
      }
   }

   @Override
   public boolean bO() {
      return !this.dU() && this.eL() > 0.0F;
   }

   public boolean a(cam $$0, double $$1, boolean $$2, boolean $$3, double... $$4) {
      fis $$5 = $$0.h(1.0F).d();

      for (double $$6 : $$4) {
         fis $$7 = new fis(this.dC() - $$0.dC(), $$6 - $$0.dG(), this.dI() - $$0.dI());
         double $$8 = $$7.g();
         $$7 = $$7.d();
         double $$9 = $$5.b($$7);
         if ($$9 > 1.0 - $$1 / ($$2 ? $$8 : 1.0) && $$0.a(this, $$3 ? dmb.a.c : dmb.a.a, dmb.b.a, $$6)) {
            return true;
         }
      }

      return false;
   }

   @Override
   public int cI() {
      return this.y(0.0F);
   }

   protected final int y(float $$0) {
      return bcb.d($$0 + 3.0F);
   }

   @Override
   public boolean a(double $$0, float $$1, byb $$2) {
      boolean $$3 = super.a($$0, $$1, $$2);
      int $$4 = this.a($$0, $$1);
      if ($$4 > 0) {
         this.a(this.q($$4), 1.0F, 1.0F);
         this.eW();
         this.a($$2, $$4);
         return true;
      } else {
         return $$3;
      }
   }

   protected int a(double $$0, float $$1) {
      if (this.ap().a(azs.o)) {
         return 0;
      } else {
         double $$2 = this.h($$0);
         return bcb.a($$2 * $$1 * this.i(cbs.l));
      }
   }

   private double h(double $$0) {
      return $$0 + 1.0E-6 - this.i(cbs.y);
   }

   protected void eW() {
      if (!this.be()) {
         int $$0 = bcb.a(this.dC());
         int $$1 = bcb.a(this.dE() - 0.2F);
         int $$2 = bcb.a(this.dI());
         eeb $$3 = this.ai().a_(new jb($$0, $$1, $$2));
         if (!$$3.l()) {
            dxx $$4 = $$3.A();
            this.a($$4.g(), $$4.a() * 0.5F, $$4.b() * 0.75F);
         }
      }
   }

   @Override
   public void q(float $$0) {
      this.bk = 10;
      this.bj = this.bk;
   }

   public int eX() {
      return bcb.a(this.i(cbs.a));
   }

   protected void c(byb $$0, float $$1) {
   }

   protected void d(byb $$0, float $$1) {
   }

   protected void a(byb $$0, float $$1, bzw... $$2) {
      if (!($$1 <= 0.0F)) {
         int $$3 = (int)Math.max(1.0F, $$1 / 4.0F);

         for (bzw $$4 : $$2) {
            dcv $$5 = this.a($$4);
            dle $$6 = $$5.a(kq.D);
            if ($$6 != null && $$6.i() && $$5.m() && $$5.a($$0)) {
               $$5.a($$3, this, $$4);
            }
         }
      }
   }

   protected float e(byb $$0, float $$1) {
      if (!$$0.a(azp.b)) {
         this.c($$0, $$1);
         $$1 = bxx.a(this, $$1, $$0, this.eX(), (float)this.i(cbs.b));
      }

      return $$1;
   }

   protected float f(byb $$0, float $$1) {
      if ($$0.a(azp.f)) {
         return $$1;
      } else {
         if (this.d(bys.k) && !$$0.a(azp.g)) {
            int $$2 = (this.e(bys.k).e() + 1) * 5;
            int $$3 = 25 - $$2;
            float $$4 = $$1 * $$3;
            float $$5 = $$1;
            $$1 = Math.max($$4 / 25.0F, 0.0F);
            float $$6 = $$5 - $$1;
            if ($$6 > 0.0F && $$6 < 3.4028235E37F) {
               if (this instanceof auc) {
                  ((auc)this).a(azj.N, Math.round($$6 * 10.0F));
               } else if ($$0.d() instanceof auc) {
                  ((auc)$$0.d()).a(azj.J, Math.round($$6 * 10.0F));
               }
            }
         }

         if ($$1 <= 0.0F) {
            return 0.0F;
         } else if ($$0.a(azp.h)) {
            return $$1;
         } else {
            float $$8;
            if (this.ai() instanceof aub $$7) {
               $$8 = djk.b($$7, this, $$0);
            } else {
               $$8 = 0.0F;
            }

            if ($$8 > 0.0F) {
               $$1 = bxx.a($$1, $$8);
            }

            return $$1;
         }
      }
   }

   protected void c(aub $$0, byb $$1, float $$2) {
      if (!this.a($$0, $$1)) {
         $$2 = this.e($$1, $$2);
         $$2 = this.f($$1, $$2);
         float var10 = Math.max($$2 - this.fD(), 0.0F);
         this.E(this.fD() - ($$2 - var10));
         float $$4 = $$2 - var10;
         if ($$4 > 0.0F && $$4 < 3.4028235E37F && $$1.d() instanceof auc $$5) {
            $$5.a(azj.I, Math.round($$4 * 10.0F));
         }

         if (var10 != 0.0F) {
            this.eY().a($$1, var10);
            this.x(this.eL() - var10);
            this.E(this.fD() - var10);
            this.c(ejb.o);
         }
      }
   }

   public bxy eY() {
      return this.cd;
   }

   @Nullable
   public cam eZ() {
      if (this.bw != null) {
         return this.bw.a(this.ai(), cut.class);
      } else {
         return this.ci != null ? this.ci.a(this.ai(), cam.class) : null;
      }
   }

   public final float fa() {
      return (float)this.i(cbs.t);
   }

   public final float fb() {
      return (float)this.i(cbs.s);
   }

   public final int fc() {
      return this.ay.a(bX);
   }

   public final void o(int $$0) {
      this.ay.a(bX, $$0);
   }

   public final int fd() {
      return this.ay.a(bY);
   }

   public final void p(int $$0) {
      this.ay.a(bY, $$0);
   }

   private int I() {
      if (byr.a(this)) {
         return 6 - (1 + byr.b(this));
      } else {
         return this.d(bys.d) ? 6 + (1 + this.e(bys.d).e()) * 2 : 6;
      }
   }

   public void a(bxi $$0) {
      this.a($$0, false);
   }

   public void a(bxi $$0, boolean $$1) {
      if (!this.be || this.bg >= this.I() / 2 || this.bg < 0) {
         this.bg = -1;
         this.be = true;
         this.bf = $$0;
         if (this.ai() instanceof aub) {
            acs $$2 = new acs(this, $$0 == bxi.a ? 0 : 3);
            aty $$3 = ((aub)this.ai()).n();
            if ($$1) {
               $$3.a(this, $$2);
            } else {
               $$3.b(this, $$2);
            }
         }
      }
   }

   @Override
   public void c(byb $$0) {
      this.bp.a(1.5F);
      this.aw = 20;
      this.bk = 10;
      this.bj = this.bk;
      ayy $$1 = this.e($$0);
      if ($$1 != null) {
         this.a($$1, this.fk(), (this.ar.i() - this.ar.i()) * 0.2F + 1.0F);
      }

      this.cr = $$0;
      this.cs = this.ai().ae();
   }

   @Override
   public void b(byte $$0) {
      switch ($$0) {
         case 3:
            ayy $$1 = this.f_();
            if ($$1 != null) {
               this.a($$1, this.fk(), (this.ar.i() - this.ar.i()) * 0.2F + 1.0F);
            }

            if (!(this instanceof cut)) {
               this.x(0.0F);
               this.a(this.ea().p());
            }
            break;
         case 46:
            int $$2 = 128;

            for (int $$3 = 0; $$3 < 128; $$3++) {
               double $$4 = $$3 / 127.0;
               float $$5 = (this.ar.i() - 0.5F) * 0.2F;
               float $$6 = (this.ar.i() - 0.5F) * 0.2F;
               float $$7 = (this.ar.i() - 0.5F) * 0.2F;
               double $$8 = bcb.d($$4, this.X, this.dC()) + (this.ar.j() - 0.5) * this.ds() * 2.0;
               double $$9 = bcb.d($$4, this.Y, this.dE()) + this.ar.j() * this.dt();
               double $$10 = bcb.d($$4, this.Z, this.dI()) + (this.ar.j() - 0.5) * this.ds() * 2.0;
               this.ai().a(me.af, $$8, $$9, $$10, $$5, $$6, $$7);
            }
            break;
         case 47:
            this.g(this.a(bzw.a));
            break;
         case 48:
            this.g(this.a(bzw.b));
            break;
         case 49:
            this.g(this.a(bzw.f));
            break;
         case 50:
            this.g(this.a(bzw.e));
            break;
         case 51:
            this.g(this.a(bzw.d));
            break;
         case 52:
            this.g(this.a(bzw.c));
            break;
         case 54:
            dtz.b(this);
            break;
         case 55:
            this.L();
            break;
         case 60:
            this.fe();
            break;
         case 65:
            this.g(this.a(bzw.g));
            break;
         case 67:
            this.J();
            break;
         case 68:
            this.g(this.a(bzw.h));
            break;
         default:
            super.b($$0);
      }
   }

   public void fe() {
      for (int $$0 = 0; $$0 < 20; $$0++) {
         double $$1 = this.ar.k() * 0.02;
         double $$2 = this.ar.k() * 0.02;
         double $$3 = this.ar.k() * 0.02;
         double $$4 = 10.0;
         this.ai().a(me.ae, this.d(1.0) - $$1 * 10.0, this.dF() - $$2 * 10.0, this.g(1.0) - $$3 * 10.0, $$1, $$2, $$3);
      }
   }

   private void J() {
      fis $$0 = this.dA();

      for (int $$1 = 0; $$1 < 8; $$1++) {
         double $$2 = this.ar.a(0.0, 1.0);
         double $$3 = this.ar.a(0.0, 1.0);
         double $$4 = this.ar.a(0.0, 1.0);
         this.ai().a(me.d, this.dC() + $$2, this.dE() + $$3, this.dI() + $$4, $$0.d, $$0.e, $$0.f);
      }
   }

   private void L() {
      dcv $$0 = this.a(bzw.b);
      this.a(bzw.b, this.a(bzw.a));
      this.a(bzw.a, $$0);
   }

   @Override
   protected void aJ() {
      this.a(this.ea().o(), 4.0F);
   }

   protected void ff() {
      int $$0 = this.I();
      if (this.be) {
         this.bg++;
         if (this.bg >= $$0) {
            this.bg = 0;
            this.be = false;
         }
      } else {
         this.bg = 0;
      }

      this.bn = (float)this.bg / $$0;
   }

   @Nullable
   public cbo h(jl<cbn> $$0) {
      return this.fg().a($$0);
   }

   public double i(jl<cbn> $$0) {
      return this.fg().c($$0);
   }

   public double j(jl<cbn> $$0) {
      return this.fg().d($$0);
   }

   public cbp fg() {
      return this.cc;
   }

   public dcv fh() {
      return this.a(bzw.a);
   }

   public dcv fi() {
      return this.a(bzw.b);
   }

   public dcv a(cad $$0) {
      return this.fF() == $$0 ? this.fh() : this.fi();
   }

   @Nonnull
   @Override
   public dcv ed() {
      return this.fh();
   }

   public boolean b(dcr $$0) {
      return this.b((Predicate<dcv>)($$1 -> $$1.a($$0)));
   }

   public boolean b(Predicate<dcv> $$0) {
      return $$0.test(this.fh()) || $$0.test(this.fi());
   }

   public dcv b(bxi $$0) {
      if ($$0 == bxi.a) {
         return this.a(bzw.a);
      } else if ($$0 == bxi.b) {
         return this.a(bzw.b);
      } else {
         throw new IllegalArgumentException("Invalid hand " + $$0);
      }
   }

   public void a(bxi $$0, dcv $$1) {
      if ($$0 == bxi.a) {
         this.a(bzw.a, $$1);
      } else {
         if ($$0 != bxi.b) {
            throw new IllegalArgumentException("Invalid hand " + $$0);
         }

         this.a(bzw.b, $$1);
      }
   }

   public boolean d(bzw $$0) {
      return !this.a($$0).f();
   }

   public boolean e(bzw $$0) {
      return true;
   }

   public dcv a(bzw $$0) {
      return this.bP.a($$0);
   }

   public void a(bzw $$0, dcv $$1) {
      this.a($$0, this.bP.a($$0, $$1), $$1);
   }

   public float fj() {
      int $$0 = 0;
      int $$1 = 0;

      for (bzw $$2 : bzx.i) {
         if ($$2.a() == bzw.a.b) {
            dcv $$3 = this.a($$2);
            if (!$$3.f()) {
               $$1++;
            }

            $$0++;
         }
      }

      return $$0 > 0 ? (float)$$1 / $$0 : 0.0F;
   }

   @Override
   public void i(boolean $$0) {
      super.i($$0);
      cbo $$1 = this.h(cbs.w);
      $$1.c(e.a());
      if ($$0) {
         $$1.b(e);
      }
   }

   protected float fk() {
      return 1.0F;
   }

   public float fl() {
      return this.g_() ? (this.ar.i() - this.ar.i()) * 0.2F + 1.5F : (this.ar.i() - this.ar.i()) * 0.2F + 1.0F;
   }

   protected boolean fm() {
      return this.eM();
   }

   @Override
   public void h(bzm $$0) {
      if (!this.fY()) {
         super.h($$0);
      }
   }

   private void G(bzm $$0) {
      fis $$1;
      if (this.dU()) {
         $$1 = this.dv();
      } else if (!$$0.dU() && !this.ai().a_($$0.dx()).a(azo.aP)) {
         $$1 = $$0.b(this);
      } else {
         double $$2 = Math.max(this.dE(), $$0.dE());
         $$1 = new fis(this.dC(), $$2, this.dI());
         boolean $$4 = this.ds() <= 4.0F && this.dt() <= 4.0F;
         if ($$4) {
            double $$5 = this.dt() / 2.0;
            fis $$6 = $$1.b(0.0, $$5, 0.0);
            fjm $$7 = fjj.a(fin.a($$6, this.ds(), this.dt(), this.ds()));
            $$1 = this.ai().a(this, $$7, $$6, this.ds(), this.dt(), this.ds()).map($$1x -> $$1x.b(0.0, -$$5, 0.0)).orElse($$1);
         }
      }

      this.m($$1.d, $$1.e, $$1.f);
   }

   @Override
   public boolean cQ() {
      return this.cP();
   }

   protected float fn() {
      return this.z(1.0F);
   }

   protected float z(float $$0) {
      return (float)this.i(cbs.p) * $$0 * this.aV() + this.fo();
   }

   public float fo() {
      return this.d(bys.h) ? 0.1F * (this.e(bys.h).e() + 1.0F) : 0.0F;
   }

   @VisibleForTesting
   public void s() {
      float $$0 = this.fn();
      if (!($$0 <= 1.0E-5F)) {
         fis $$1 = this.dA();
         this.n($$1.d, Math.max((double)$$0, $$1.e), $$1.f);
         if (this.cm()) {
            float $$2 = this.dP() * (float) (Math.PI / 180.0);
            this.j(new fis(-bcb.a($$2) * 0.2, 0.0, bcb.b($$2) * 0.2));
         }

         this.aE = true;
      }
   }

   protected void fp() {
      this.i(this.dA().b(0.0, -0.04F, 0.0));
   }

   protected void c(bae<fak> $$0) {
      this.i(this.dA().b(0.0, 0.04F, 0.0));
   }

   protected float fq() {
      return 0.8F;
   }

   public boolean a(fal $$0) {
      return false;
   }

   @Override
   protected double bg() {
      return this.i(cbs.o);
   }

   protected double fr() {
      boolean $$0 = this.dA().e <= 0.0;
      return $$0 && this.d(bys.B) ? Math.min(this.bh(), 0.01) : this.bh();
   }

   public void k(fis $$0) {
      fal $$1 = this.ai().b_(this.dx());
      if ((this.bm() || this.bA()) && this.er() && !this.a($$1)) {
         this.m($$0);
      } else if (this.fQ()) {
         this.n($$0);
      } else {
         this.a($$0);
      }
   }

   protected void a(fis $$0, float $$1) {
      this.a($$0, 0.02F, 0.02F, $$1);
   }

   protected void a(fis $$0, float $$1, float $$2, float $$3) {
      if (this.bm()) {
         this.a($$1, $$0);
         this.a(caq.a, this.dA());
         this.i(this.dA().c(0.8F));
      } else if (this.bA()) {
         this.a($$2, $$0);
         this.a(caq.a, this.dA());
         this.i(this.dA().c(0.5));
      } else {
         this.a($$3, $$0);
         this.a(caq.a, this.dA());
         this.i(this.dA().c(0.91F));
      }
   }

   private void a(fis $$0) {
      jb $$1 = this.aT();
      float $$2 = this.aK() ? this.ai().a_($$1).b().g() : 1.0F;
      float $$3 = $$2 * 0.91F;
      fis $$4 = this.b($$0, $$2);
      double $$5 = $$4.e;
      byq $$6 = this.e(bys.y);
      if ($$6 != null) {
         $$5 += (0.05 * ($$6.e() + 1) - $$4.e) * 0.2;
      } else if (!this.ai().C || this.ai().D($$1)) {
         $$5 -= this.fr();
      } else if (this.dE() > this.ai().L_()) {
         $$5 = -0.1;
      } else {
         $$5 = 0.0;
      }

      if (this.eC()) {
         this.n($$4.d, $$5, $$4.f);
      } else {
         float $$7 = this instanceof cmr ? $$3 : 0.98F;
         this.n($$4.d * $$3, $$5 * $$7, $$4.f * $$3);
      }
   }

   private void m(fis $$0) {
      boolean $$1 = this.dA().e <= 0.0;
      double $$2 = this.dE();
      double $$3 = this.fr();
      if (this.bm()) {
         float $$4 = this.cm() ? 0.9F : this.fq();
         float $$5 = 0.02F;
         float $$6 = (float)this.i(cbs.G);
         if (!this.aK()) {
            $$6 *= 0.5F;
         }

         if ($$6 > 0.0F) {
            $$4 += (0.54600006F - $$4) * $$6;
            $$5 += (this.fu() - $$5) * $$6;
         }

         if (this.d(bys.D)) {
            $$4 = 0.96F;
         }

         this.a($$5, $$0);
         this.a(caq.a, this.dA());
         fis $$7 = this.dA();
         if (this.ac && this.eV()) {
            $$7 = new fis($$7.d, 0.2, $$7.f);
         }

         $$7 = $$7.d($$4, 0.8F, $$4);
         this.i(this.a($$3, $$1, $$7));
      } else {
         this.a(0.02F, $$0);
         this.a(caq.a, this.dA());
         if (this.b(azu.b) <= this.dr()) {
            this.i(this.dA().d(0.5, 0.8F, 0.5));
            fis $$8 = this.a($$3, $$1, this.dA());
            this.i($$8);
         } else {
            this.i(this.dA().c(0.5));
         }

         if ($$3 != 0.0) {
            this.i(this.dA().b(0.0, -$$3 / 4.0, 0.0));
         }
      }

      fis $$9 = this.dA();
      if (this.ac && this.f($$9.d, $$9.e + 0.6F - this.dE() + $$2, $$9.f)) {
         this.n($$9.d, 0.3F, $$9.f);
      }
   }

   private void n(fis $$0) {
      if (this.eV()) {
         this.a($$0);
         this.fs();
      } else {
         fis $$1 = this.dA();
         double $$2 = $$1.i();
         this.i(this.o($$1));
         this.a(caq.a, this.dA());
         if (!this.ai().C) {
            double $$3 = this.dA().i();
            this.c($$2, $$3);
         }
      }
   }

   public void fs() {
      this.b(7, true);
      this.b(7, false);
   }

   private fis o(fis $$0) {
      fis $$1 = this.bW();
      float $$2 = this.dR() * (float) (Math.PI / 180.0);
      double $$3 = Math.sqrt($$1.d * $$1.d + $$1.f * $$1.f);
      double $$4 = $$0.i();
      double $$5 = this.fr();
      double $$6 = bcb.k(Math.cos($$2));
      $$0 = $$0.b(0.0, $$5 * (-1.0 + $$6 * 0.75), 0.0);
      if ($$0.e < 0.0 && $$3 > 0.0) {
         double $$7 = $$0.e * -0.1 * $$6;
         $$0 = $$0.b($$1.d * $$7 / $$3, $$7, $$1.f * $$7 / $$3);
      }

      if ($$2 < 0.0F && $$3 > 0.0) {
         double $$8 = $$4 * -bcb.a($$2) * 0.04;
         $$0 = $$0.b(-$$1.d * $$8 / $$3, $$8 * 3.2, -$$1.f * $$8 / $$3);
      }

      if ($$3 > 0.0) {
         $$0 = $$0.b(($$1.d / $$3 * $$4 - $$0.d) * 0.1, 0.0, ($$1.f / $$3 * $$4 - $$0.f) * 0.1);
      }

      return $$0.d(0.99F, 0.98F, 0.99F);
   }

   private void c(double $$0, double $$1) {
      if (this.ac) {
         double $$2 = $$0 - $$1;
         float $$3 = (float)($$2 * 10.0 - 3.0);
         if ($$3 > 0.0F) {
            this.a(this.q((int)$$3), 1.0F, 1.0F);
            this.a(this.ea().n(), $$3);
         }
      }
   }

   private void c(cut $$0, fis $$1) {
      fis $$2 = this.b($$0, $$1);
      this.a($$0, $$2);
      if (this.dk()) {
         this.B(this.c($$0));
         this.k($$2);
      } else {
         this.i(fis.c);
      }
   }

   protected void a(cut $$0, fis $$1) {
   }

   protected fis b(cut $$0, fis $$1) {
      return $$1;
   }

   protected float c(cut $$0) {
      return this.fu();
   }

   public void s(boolean $$0) {
      float $$1 = (float)bcb.g(this.dC() - this.X, $$0 ? this.dE() - this.Y : 0.0, this.dI() - this.Z);
      if (!this.cc() && this.bO()) {
         this.A($$1);
      } else {
         this.bp.a();
      }
   }

   protected void A(float $$0) {
      float $$1 = Math.min($$0 * 4.0F, 1.0F);
      this.bp.a($$1, 0.4F, this.g_() ? 3.0F : 1.0F);
   }

   private fis b(fis $$0, float $$1) {
      this.a(this.G($$1), $$0);
      this.i(this.p(this.dA()));
      this.a(caq.a, this.dA());
      fis $$2 = this.dA();
      if ((this.ac || this.bB) && (this.eV() || this.aJ && dwb.a(this))) {
         $$2 = new fis($$2.d, 0.2, $$2.f);
      }

      return $$2;
   }

   public fis a(double $$0, boolean $$1, fis $$2) {
      if ($$0 != 0.0 && !this.cm()) {
         double $$3;
         if ($$1 && Math.abs($$2.e - 0.005) >= 0.003 && Math.abs($$2.e - $$0 / 16.0) < 0.003) {
            $$3 = -0.003;
         } else {
            $$3 = $$2.e - $$0 / 16.0;
         }

         return new fis($$2.d, $$3, $$2.f);
      } else {
         return $$2;
      }
   }

   private fis p(fis $$0) {
      if (this.eV()) {
         this.j();
         float $$1 = 0.15F;
         double $$2 = bcb.a($$0.d, -0.15F, 0.15F);
         double $$3 = bcb.a($$0.f, -0.15F, 0.15F);
         double $$4 = Math.max($$0.e, -0.15F);
         if ($$4 < 0.0 && !this.dy().a(dqb.oz) && this.fP() && this instanceof cut) {
            $$4 = 0.0;
         }

         $$0 = new fis($$2, $$4, $$3);
      }

      return $$0;
   }

   private float G(float $$0) {
      return this.aK() ? this.fu() * (0.21600002F / ($$0 * $$0 * $$0)) : this.ft();
   }

   protected float ft() {
      return this.cY() instanceof cut ? this.fu() * 0.1F : 0.02F;
   }

   public float fu() {
      return this.cm;
   }

   public void B(float $$0) {
      this.cm = $$0;
   }

   public boolean c(aub $$0, bzm $$1) {
      this.C($$1);
      return false;
   }

   @Override
   public void g() {
      super.g();
      this.P();
      this.Q();
      if (!this.ai().C) {
         int $$0 = this.fc();
         if ($$0 > 0) {
            if (this.bh <= 0) {
               this.bh = 20 * (30 - $$0);
            }

            this.bh--;
            if (this.bh <= 0) {
               this.o($$0 - 1);
            }
         }

         int $$1 = this.fd();
         if ($$1 > 0) {
            if (this.bi <= 0) {
               this.bi = 20 * (30 - $$1);
            }

            this.bi--;
            if (this.bi <= 0) {
               this.p($$1 - 1);
            }
         }

         this.N();
         if (this.as % 20 == 0) {
            this.eY().c();
         }

         if (this.fY() && !this.R()) {
            this.fZ();
         }
      }

      if (!this.dU()) {
         this.e_();
      }

      double $$2 = this.dC() - this.X;
      double $$3 = this.dI() - this.Z;
      float $$4 = (float)($$2 * $$2 + $$3 * $$3);
      float $$5 = this.br;
      if ($$4 > 0.0025000002F) {
         float $$6 = (float)bcb.d($$3, $$2) * (180.0F / (float)Math.PI) - 90.0F;
         float $$7 = bcb.e(bcb.h(this.dP()) - $$6);
         if (95.0F < $$7 && $$7 < 265.0F) {
            $$5 = $$6 - 180.0F;
         } else {
            $$5 = $$6;
         }
      }

      if (this.bn > 0.0F) {
         $$5 = this.dP();
      }

      btt $$8 = bts.a();
      $$8.a("headTurn");
      this.C($$5);
      $$8.c();
      $$8.a("rangeChecks");

      while (this.dP() - this.aa < -180.0F) {
         this.aa -= 360.0F;
      }

      while (this.dP() - this.aa >= 180.0F) {
         this.aa += 360.0F;
      }

      while (this.br - this.bs < -180.0F) {
         this.bs -= 360.0F;
      }

      while (this.br - this.bs >= 180.0F) {
         this.bs += 360.0F;
      }

      while (this.dR() - this.ab < -180.0F) {
         this.ab -= 360.0F;
      }

      while (this.dR() - this.ab >= 180.0F) {
         this.ab += 360.0F;
      }

      while (this.bt - this.bu < -180.0F) {
         this.bu -= 360.0F;
      }

      while (this.bt - this.bu >= 180.0F) {
         this.bu += 360.0F;
      }

      $$8.c();
      if (this.fQ()) {
         this.bK++;
      } else {
         this.bK = 0;
      }

      if (this.fY()) {
         this.w(0.0F);
      }

      this.H();
      this.bv.a();
   }

   private void N() {
      Map<bzw, dcv> $$0 = this.O();
      if ($$0 != null) {
         this.a($$0);
         if (!$$0.isEmpty()) {
            this.b($$0);
         }
      }
   }

   @Nullable
   private Map<bzw, dcv> O() {
      Map<bzw, dcv> $$0 = null;

      for (bzw $$1 : bzw.j) {
         dcv $$2 = this.cf.get($$1);
         dcv $$3 = this.a($$1);
         if (this.a($$2, $$3)) {
            if ($$0 == null) {
               $$0 = Maps.newEnumMap(bzw.class);
            }

            $$0.put($$1, $$3);
            cbp $$4 = this.fg();
            if (!$$2.f()) {
               this.a($$2, $$1, $$4);
            }
         }
      }

      if ($$0 != null) {
         for (Entry<bzw, dcv> $$5 : $$0.entrySet()) {
            bzw $$6 = $$5.getKey();
            dcv $$7 = $$5.getValue();
            if (!$$7.f() && !$$7.q()) {
               $$7.a($$6, ($$0x, $$1x) -> {
                  cbo $$2 = this.cc.a($$0x);
                  if ($$2 != null) {
                     $$2.c($$1x.a());
                     $$2.b($$1x);
                  }
               });
               if (this.ai() instanceof aub $$8) {
                  djk.a($$8, $$7, this, $$6);
               }
            }
         }
      }

      return $$0;
   }

   public boolean a(dcv $$0, dcv $$1) {
      return !dcv.a($$1, $$0);
   }

   private void a(Map<bzw, dcv> $$0) {
      dcv $$1 = $$0.get(bzw.a);
      dcv $$2 = $$0.get(bzw.b);
      if ($$1 != null && $$2 != null && dcv.a($$1, this.cf.get(bzw.b)) && dcv.a($$2, this.cf.get(bzw.a))) {
         ((aub)this.ai()).n().b(this, new adt(this, (byte)55));
         $$0.remove(bzw.a);
         $$0.remove(bzw.b);
         this.cf.put(bzw.a, $$1.v());
         this.cf.put(bzw.b, $$2.v());
      }
   }

   private void b(Map<bzw, dcv> $$0) {
      List<Pair<bzw, dcv>> $$1 = Lists.newArrayListWithCapacity($$0.size());
      $$0.forEach(($$1x, $$2) -> {
         dcv $$3 = $$2.v();
         $$1.add(Pair.of($$1x, $$3));
         this.cf.put($$1x, $$3);
      });
      ((aub)this.ai()).n().b(this, new agc(this.ar(), $$1));
   }

   protected void C(float $$0) {
      float $$1 = bcb.h($$0 - this.br);
      this.br += $$1 * 0.3F;
      float $$2 = bcb.h(this.dP() - this.br);
      float $$3 = this.fv();
      if (Math.abs($$2) > $$3) {
         this.br = this.br + ($$2 - bcb.j((double)$$2) * $$3);
      }
   }

   protected float fv() {
      return 50.0F;
   }

   public void e_() {
      if (this.cn > 0) {
         this.cn--;
      }

      if (this.bU()) {
         this.l_().e();
      } else if (!this.dk()) {
         this.i(this.dA().c(0.98));
      }

      if (this.bH > 0) {
         this.a(this.bH, this.bG);
         this.bH--;
      }

      this.bP.a((bzm)this);
      fis $$0 = this.dA();
      double $$1 = $$0.d;
      double $$2 = $$0.e;
      double $$3 = $$0.f;
      if (this.ap().equals(bzv.bU)) {
         if ($$0.j() < 9.0E-6) {
            $$1 = 0.0;
            $$3 = 0.0;
         }
      } else {
         if (Math.abs($$0.d) < 0.003) {
            $$1 = 0.0;
         }

         if (Math.abs($$0.f) < 0.003) {
            $$3 = 0.0;
         }
      }

      if (Math.abs($$0.e) < 0.003) {
         $$2 = 0.0;
      }

      this.n($$1, $$2, $$3);
      btt $$4 = bts.a();
      $$4.a("ai");
      this.fw();
      if (this.fm()) {
         this.bB = false;
         this.bC = 0.0F;
         this.bE = 0.0F;
      } else if (this.dl() && !this.ai().C) {
         $$4.a("newAi");
         this.fB();
         $$4.c();
      }

      $$4.c();
      $$4.a("jump");
      if (this.bB && this.er()) {
         double $$5;
         if (this.bA()) {
            $$5 = this.b(azu.b);
         } else {
            $$5 = this.b(azu.a);
         }

         boolean $$7 = this.bm() && $$5 > 0.0;
         double $$8 = this.dr();
         if (!$$7 || this.aK() && !($$5 > $$8)) {
            if (!this.bA() || this.aK() && !($$5 > $$8)) {
               if ((this.aK() || $$7 && $$5 <= $$8) && this.cn == 0) {
                  this.s();
                  this.cn = 10;
               }
            } else {
               this.c(azu.b);
            }
         } else {
            this.c(azu.a);
         }
      } else {
         this.cn = 0;
      }

      $$4.c();
      $$4.a("travel");
      if (this.fQ()) {
         this.fz();
      }

      fin $$9 = this.cV();
      fis $$10 = new fis(this.bC, this.bD, this.bE);
      if (this.d(bys.B) || this.d(bys.y)) {
         this.j();
      }

      if (this.cY() instanceof cut $$11 && this.bO()) {
         this.c($$11, $$10);
      } else if (this.dk() && this.dl()) {
         this.k($$10);
      }

      if (!this.ai().B_() || this.di()) {
         this.aL();
      }

      if (this.ai().B_()) {
         this.s(this instanceof cmr);
      }

      $$4.c();
      if (this.ai() instanceof aub $$12) {
         $$4.a("freezing");
         if (!this.aI || !this.dN()) {
            this.k(Math.max(0, this.cy() - 2));
         }

         this.en();
         this.eo();
         if (this.as % 40 == 0 && this.cA() && this.dN()) {
            this.a($$12, this.ea().v(), 1.0F);
         }

         $$4.c();
      }

      $$4.a("push");
      if (this.bL > 0) {
         this.bL--;
         this.a($$9, this.cV());
      }

      this.o();
      $$4.c();
      if (this.ai() instanceof aub $$13 && this.fx() && this.bo()) {
         this.a($$13, this.ea().i(), 1.0F);
      }
   }

   protected void fw() {
      this.bC *= 0.98F;
      this.bE *= 0.98F;
   }

   public boolean fx() {
      return false;
   }

   public boolean fy() {
      return this.bB;
   }

   protected void fz() {
      this.cC();
      if (!this.ai().C) {
         if (!this.fA()) {
            this.b(7, false);
            return;
         }

         int $$0 = this.bK + 1;
         if ($$0 % 10 == 0) {
            int $$1 = $$0 / 10;
            if ($$1 % 2 == 0) {
               List<bzw> $$2 = bzw.j.stream().filter($$0x -> b(this.a($$0x), $$0x)).toList();
               bzw $$3 = ag.a($$2, this.ar);
               this.a($$3).a(1, this, $$3);
            }

            this.c(ejb.n);
         }
      }
   }

   protected boolean fA() {
      if (!this.aK() && !this.cc() && !this.d(bys.y)) {
         for (bzw $$0 : bzw.j) {
            if (b(this.a($$0), $$0)) {
               return true;
            }
         }

         return false;
      } else {
         return false;
      }
   }

   protected void fB() {
   }

   protected void o() {
      List<bzm> $$0 = this.ai().i(this, this.cV());
      if (!$$0.isEmpty()) {
         if (this.ai() instanceof aub $$1) {
            int $$2 = $$1.P().d(dmq.w);
            if ($$2 > 0 && $$0.size() > $$2 - 1 && this.ar.a(4) == 0) {
               int $$3 = 0;

               for (bzm $$4 : $$0) {
                  if (!$$4.cc()) {
                     $$3++;
                  }
               }

               if ($$3 > $$2 - 1) {
                  this.a($$1, this.ea().h(), 6.0F);
               }
            }
         }

         for (bzm $$5 : $$0) {
            this.E($$5);
         }
      }
   }

   protected void a(fin $$0, fin $$1) {
      fin $$2 = $$0.b($$1);
      List<bzm> $$3 = this.ai().a_(this, $$2);
      if (!$$3.isEmpty()) {
         for (bzm $$4 : $$3) {
            if ($$4 instanceof cam) {
               this.f((cam)$$4);
               this.bL = 0;
               this.i(this.dA().c(-0.2));
               break;
            }
         }
      } else if (this.ac) {
         this.bL = 0;
      }

      if (!this.ai().C && this.bL <= 0) {
         this.c(4, false);
         this.bM = 0.0F;
         this.bN = null;
      }
   }

   protected void E(bzm $$0) {
      $$0.h(this);
   }

   protected void f(cam $$0) {
   }

   public boolean fC() {
      return (this.ay.a(aZ) & 4) != 0;
   }

   @Override
   public void bS() {
      bzm $$0 = this.dm();
      super.bS();
      if ($$0 != null && $$0 != this.dm() && !this.ai().C) {
         this.G($$0);
      }
   }

   @Override
   public void r() {
      super.r();
      this.j();
   }

   @Override
   public cah l_() {
      return this.bF;
   }

   @Override
   public void a(float $$0, int $$1) {
      this.bG = $$0;
      this.bH = $$1;
   }

   public void t(boolean $$0) {
      this.bB = $$0;
   }

   public void a(cqz $$0) {
      bzm $$1 = $$0.ah_();
      if ($$1 instanceof auc) {
         aq.R.a((auc)$$1, $$0.e(), this);
      }
   }

   public void a(bzm $$0, int $$1) {
      if (!$$0.dU() && !this.ai().C && ($$0 instanceof cqz || $$0 instanceof cvb || $$0 instanceof caa)) {
         ((aub)this.ai()).n().b($$0, new agx($$0.ar(), this.ar(), $$1));
      }
   }

   public boolean F(bzm $$0) {
      return this.a($$0, dmb.a.a, dmb.b.a, $$0.dG());
   }

   public boolean a(bzm $$0, dmb.a $$1, dmb.b $$2, double $$3) {
      if ($$0.ai() != this.ai()) {
         return false;
      } else {
         fis $$4 = new fis(this.dC(), this.dG(), this.dI());
         fis $$5 = new fis($$0.dC(), $$3, $$0.dI());
         return $$5.f($$4) > 128.0 ? false : this.ai().a(new dmb($$4, $$5, $$1, $$2, this)).d() == fiq.a.a;
      }
   }

   @Override
   public float j(float $$0) {
      return $$0 == 1.0F ? this.bt : bcb.i($$0, this.bu, this.bt);
   }

   public float D(float $$0) {
      float $$1 = this.bn - this.bm;
      if ($$1 < 0.0F) {
         $$1++;
      }

      return this.bm + $$1 * $$0;
   }

   @Override
   public boolean bK() {
      return !this.dU();
   }

   @Override
   public boolean bL() {
      return this.bO() && !this.am() && !this.eV();
   }

   @Override
   public float cE() {
      return this.bt;
   }

   @Override
   public void r(float $$0) {
      this.bt = $$0;
   }

   @Override
   public void s(float $$0) {
      this.br = $$0;
   }

   @Override
   public fis a(jh.a $$0, m.a $$1) {
      return l(super.a($$0, $$1));
   }

   public static fis l(fis $$0) {
      return new fis($$0.d, $$0.e, 0.0);
   }

   public float fD() {
      return this.co;
   }

   public final void E(float $$0) {
      this.F(bcb.a($$0, 0.0F, this.fb()));
   }

   protected void F(float $$0) {
      this.co = $$0;
   }

   public void h_() {
   }

   public void P_() {
   }

   protected void fE() {
      this.ch = true;
   }

   public abstract cad fF();

   public boolean fG() {
      return (this.ay.a(aZ) & 1) > 0;
   }

   public bxi fH() {
      return (this.ay.a(aZ) & 2) > 0 ? bxi.b : bxi.a;
   }

   private void P() {
      if (this.fG()) {
         if (dcv.b(this.b(this.fH()), this.bI)) {
            this.bI = this.b(this.fH());
            this.a(this.bI);
         } else {
            this.fM();
         }
      }
   }

   @Nullable
   private cqz b(dcv $$0, boolean $$1, boolean $$2) {
      if ($$0.f()) {
         return null;
      } else {
         double $$3 = this.dG() - 0.3F;
         cqz $$4 = new cqz(this.ai(), this.dC(), $$3, this.dI(), $$0);
         $$4.b(40);
         if ($$2) {
            $$4.b(this);
         }

         if ($$1) {
            float $$5 = this.ar.i() * 0.5F;
            float $$6 = this.ar.i() * (float) (Math.PI * 2);
            $$4.n(-bcb.a($$6) * $$5, 0.2F, bcb.b($$6) * $$5);
         } else {
            float $$7 = 0.3F;
            float $$8 = bcb.a(this.dR() * (float) (Math.PI / 180.0));
            float $$9 = bcb.b(this.dR() * (float) (Math.PI / 180.0));
            float $$10 = bcb.a(this.dP() * (float) (Math.PI / 180.0));
            float $$11 = bcb.b(this.dP() * (float) (Math.PI / 180.0));
            float $$12 = this.ar.i() * (float) (Math.PI * 2);
            float $$13 = 0.02F * this.ar.i();
            $$4.n(
               -$$10 * $$9 * 0.3F + Math.cos($$12) * $$13, -$$8 * 0.3F + 0.1F + (this.ar.i() - this.ar.i()) * 0.1F, $$11 * $$9 * 0.3F + Math.sin($$12) * $$13
            );
         }

         return $$4;
      }
   }

   protected void a(dcv $$0) {
      $$0.b(this.ai(), this, this.fJ());
      if (--this.bJ == 0 && !this.ai().C && !$$0.x()) {
         this.w();
      }
   }

   private void Q() {
      this.cu = this.ct;
      if (this.co()) {
         this.ct = Math.min(1.0F, this.ct + 0.09F);
      } else {
         this.ct = Math.max(0.0F, this.ct - 0.09F);
      }
   }

   protected void c(int $$0, boolean $$1) {
      int $$2 = this.ay.a(aZ);
      if ($$1) {
         $$2 |= $$0;
      } else {
         $$2 &= ~$$0;
      }

      this.ay.a(aZ, (byte)$$2);
   }

   public void c(bxi $$0) {
      dcv $$1 = this.b($$0);
      if (!$$1.f() && !this.fG()) {
         this.bI = $$1;
         this.bJ = $$1.a(this);
         if (!this.ai().C) {
            this.c(1, true);
            this.c(2, $$0 == bxi.b);
            this.c(ejb.D);
         }
      }
   }

   @Override
   public void a(alh<?> $$0) {
      super.a($$0);
      if (bZ.equals($$0)) {
         if (this.ai().C) {
            this.fW().ifPresent(this::a);
         }
      } else if (aZ.equals($$0) && this.ai().C) {
         if (this.fG() && this.bI.f()) {
            this.bI = this.b(this.fH());
            if (!this.bI.f()) {
               this.bJ = this.bI.a(this);
            }
         } else if (!this.fG() && !this.bI.f()) {
            this.bI = dcv.l;
            this.bJ = 0;
         }
      }
   }

   @Override
   public void a(ex.a $$0, fis $$1) {
      super.a($$0, $$1);
      this.bu = this.bt;
      this.br = this.bt;
      this.bs = this.br;
   }

   @Override
   public float t(float $$0) {
      return bcb.h($$0, this.bs, this.br);
   }

   public void b(dcv $$0, int $$1) {
      for (int $$2 = 0; $$2 < $$1; $$2++) {
         fis $$3 = new fis((this.ar.i() - 0.5) * 0.1, Math.random() * 0.1 + 0.1, 0.0);
         $$3 = $$3.a(-this.dR() * (float) (Math.PI / 180.0));
         $$3 = $$3.b(-this.dP() * (float) (Math.PI / 180.0));
         double $$4 = -this.ar.i() * 0.6 - 0.3;
         fis $$5 = new fis((this.ar.i() - 0.5) * 0.3, $$4, 0.6);
         $$5 = $$5.a(-this.dR() * (float) (Math.PI / 180.0));
         $$5 = $$5.b(-this.dP() * (float) (Math.PI / 180.0));
         $$5 = $$5.b(this.dC(), this.dG(), this.dI());
         this.ai().a(new ma(me.U, $$0), $$5.d, $$5.e, $$5.f, $$3.d, $$3.e + 0.05, $$3.f);
      }
   }

   protected void w() {
      if (!this.ai().C || this.fG()) {
         bxi $$0 = this.fH();
         if (!this.bI.equals(this.b($$0))) {
            this.fL();
         } else {
            if (!this.bI.f() && this.fG()) {
               dcv $$1 = this.bI.a(this.ai(), this);
               if ($$1 != this.bI) {
                  this.a($$0, $$1);
               }

               this.fM();
            }
         }
      }
   }

   public void b(dcv $$0) {
   }

   public dcv fI() {
      return this.bI;
   }

   public int fJ() {
      return this.bJ;
   }

   public int fK() {
      return this.fG() ? this.bI.a(this) - this.fJ() : 0;
   }

   public void fL() {
      dcv $$0 = this.b(this.fH());
      if (!this.bI.f() && dcv.b($$0, this.bI)) {
         this.bI = $$0;
         this.bI.a(this.ai(), this, this.fJ());
         if (this.bI.x()) {
            this.P();
         }
      }

      this.fM();
   }

   public void fM() {
      if (!this.ai().C) {
         boolean $$0 = this.fG();
         this.c(1, false);
         if ($$0) {
            this.c(ejb.C);
         }
      }

      this.bI = dcv.l;
      this.bJ = 0;
   }

   public boolean fN() {
      return this.fO() != null;
   }

   @Nullable
   public dcv fO() {
      if (!this.fG()) {
         return null;
      } else {
         dew $$0 = this.bI.a(kq.I);
         if ($$0 != null) {
            int $$1 = this.bI.h().a(this.bI, this) - this.bJ;
            if ($$1 >= $$0.a()) {
               return this.bI;
            }
         }

         return null;
      }
   }

   public boolean fP() {
      return this.cg();
   }

   public boolean fQ() {
      return this.i(7);
   }

   @Override
   public boolean co() {
      return super.co() || !this.fQ() && this.c(cay.b);
   }

   public int fR() {
      return this.bK;
   }

   public boolean b(double $$0, double $$1, double $$2, boolean $$3) {
      double $$4 = this.dC();
      double $$5 = this.dE();
      double $$6 = this.dI();
      double $$7 = $$1;
      boolean $$8 = false;
      jb $$9 = jb.a($$0, $$1, $$2);
      dmu $$10 = this.ai();
      if ($$10.D($$9)) {
         boolean $$11 = false;

         while (!$$11 && $$9.v() > $$10.L_()) {
            jb $$12 = $$9.e();
            eeb $$13 = $$10.a_($$12);
            if ($$13.d()) {
               $$11 = true;
            } else {
               $$7--;
               $$9 = $$12;
            }
         }

         if ($$11) {
            this.b($$0, $$7, $$2);
            if ($$10.g(this) && !$$10.d(this.cV())) {
               $$8 = true;
            }
         }
      }

      if (!$$8) {
         this.b($$4, $$5, $$6);
         return false;
      } else {
         if ($$3) {
            $$10.a(this, (byte)46);
         }

         if (this instanceof cau $$14) {
            $$14.S().n();
         }

         return true;
      }
   }

   public boolean fS() {
      return !this.eM();
   }

   public boolean fT() {
      return true;
   }

   public void a(jb $$0, boolean $$1) {
   }

   public boolean fU() {
      return false;
   }

   @Override
   public final bzp a(cay $$0) {
      return $$0 == cay.c ? ba : this.e($$0).a(this.eq());
   }

   protected bzp e(cay $$0) {
      return this.ap().n().a(this.ep());
   }

   public ImmutableList<cay> fV() {
      return ImmutableList.of(cay.a);
   }

   public fin f(cay $$0) {
      bzp $$1 = this.a($$0);
      return new fin(-$$1.a() / 2.0F, 0.0, -$$1.a() / 2.0F, $$1.a() / 2.0F, $$1.b(), $$1.a() / 2.0F);
   }

   protected boolean g(cay $$0) {
      fin $$1 = this.a($$0).a(this.dv());
      return this.ai().b(this, $$1);
   }

   @Override
   public boolean o(boolean $$0) {
      return super.o($$0) && !this.fY();
   }

   public Optional<jb> fW() {
      return this.ay.a(bZ);
   }

   public void g(jb $$0) {
      this.ay.a(bZ, Optional.of($$0));
   }

   public void fX() {
      this.ay.a(bZ, Optional.empty());
   }

   public boolean fY() {
      return this.fW().isPresent();
   }

   public void b(jb $$0) {
      if (this.cc()) {
         this.bS();
      }

      eeb $$1 = this.ai().a_($$0);
      if ($$1.b() instanceof dps) {
         this.ai().a($$0, $$1.b(dps.c, true), 3);
      }

      this.b(cay.c);
      this.a($$0);
      this.g($$0);
      this.i(fis.c);
      this.aE = true;
   }

   private void a(jb $$0) {
      this.a_($$0.u() + 0.5, $$0.v() + 0.6875, $$0.w() + 0.5);
   }

   private boolean R() {
      return this.fW().map($$0 -> this.ai().a_($$0).b() instanceof dps).orElse(false);
   }

   public void fZ() {
      this.fW().filter(this.ai()::D).ifPresent($$0x -> {
         eeb $$1 = this.ai().a_($$0x);
         if ($$1.b() instanceof dps) {
            jh $$2 = $$1.c(dps.f);
            this.ai().a($$0x, $$1.b(dps.c, false), 3);
            fis $$3 = dps.a(this.ap(), this.ai(), $$0x, $$2, this.dP()).orElseGet(() -> {
               jb $$1x = $$0x.d();
               return new fis($$1x.u() + 0.5, $$1x.v() + 0.1, $$1x.w() + 0.5);
            });
            fis $$4 = fis.c($$0x).d($$3).d();
            float $$5 = (float)bcb.d(bcb.d($$4.f, $$4.d) * 180.0F / (float)Math.PI - 90.0);
            this.a_($$3.d, $$3.e, $$3.f);
            this.v($$5);
            this.w(0.0F);
         }
      });
      fis $$0 = this.dv();
      this.b(cay.a);
      this.a_($$0.d, $$0.e, $$0.f);
      this.fX();
   }

   @Nullable
   public jh ga() {
      jb $$0 = this.fW().orElse(null);
      return $$0 != null ? dps.a(this.ai(), $$0) : null;
   }

   @Override
   public boolean bP() {
      return !this.fY() && super.bP();
   }

   public dcv d(dcv $$0) {
      return dcv.l;
   }

   private static byte g(bzw $$0) {
      return switch ($$0) {
         case a -> 47;
         case b -> 48;
         case f -> 49;
         case e -> 50;
         case c -> 52;
         case d -> 51;
         case g -> 65;
         case h -> 68;
      };
   }

   public void a(dcr $$0, bzw $$1) {
      this.ai().a(this, g($$1));
      this.a(this.a($$1), $$1, this.cc);
   }

   private void a(dcv $$0, bzw $$1, cbp $$2) {
      $$0.a($$1, ($$1x, $$2x) -> {
         cbo $$3 = $$2.a($$1x);
         if ($$3 != null) {
            $$3.e($$2x);
         }
      });
      djk.a($$0, this, $$1);
   }

   public static bzw d(bxi $$0) {
      return $$0 == bxi.a ? bzw.a : bzw.b;
   }

   public final boolean e(dcv $$0) {
      if (this.bO() && !this.am()) {
         dle $$1 = $$0.a(kq.D);
         if ($$1 != null && $$1.g()) {
            bzw $$2 = $$1.b();
            return this.e($$2) && $$1.a(this.ap()) ? this.a($$2).f() && this.f($$2) : false;
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   protected boolean f(bzw $$0) {
      return true;
   }

   public final bzw f(dcv $$0) {
      dle $$1 = $$0.a(kq.D);
      return $$1 != null && this.e($$1.b()) ? $$1.b() : bzw.a;
   }

   public final boolean a(dcv $$0, bzw $$1) {
      dle $$2 = $$0.a(kq.D);
      return $$2 == null ? $$1 == bzw.a && this.e(bzw.a) : $$1 == $$2.b() && this.e($$2.b()) && $$2.a(this.ap());
   }

   private static cbd a(cam $$0, bzw $$1) {
      return $$1 != bzw.f && $$1 != bzw.a && $$1 != bzw.b ? cbd.a($$0, $$1, $$2 -> $$2.f() || $$0.f($$2) == $$1) : cbd.a($$0, $$1);
   }

   @Nullable
   private static bzw r(int $$0) {
      if ($$0 == 100 + bzw.f.b()) {
         return bzw.f;
      } else if ($$0 == 100 + bzw.e.b()) {
         return bzw.e;
      } else if ($$0 == 100 + bzw.d.b()) {
         return bzw.d;
      } else if ($$0 == 100 + bzw.c.b()) {
         return bzw.c;
      } else if ($$0 == 98) {
         return bzw.a;
      } else if ($$0 == 99) {
         return bzw.b;
      } else if ($$0 == 105) {
         return bzw.g;
      } else {
         return $$0 == 106 ? bzw.h : null;
      }
   }

   @Override
   public cbd a_(int $$0) {
      bzw $$1 = r($$0);
      return $$1 != null ? a(this, $$1) : super.a_($$0);
   }

   @Override
   public boolean dN() {
      if (this.am()) {
         return false;
      } else {
         for (bzw $$0 : bzx.i) {
            if (this.a($$0).a(azx.bx)) {
               return false;
            }
         }

         return super.dN();
      }
   }

   @Override
   public boolean cr() {
      return !this.ai().B_() && this.d(bys.x) || super.cr();
   }

   @Override
   public float dQ() {
      return this.br;
   }

   @Override
   public void a(acr $$0) {
      double $$1 = $$0.g();
      double $$2 = $$0.h();
      double $$3 = $$0.i();
      float $$4 = $$0.n();
      float $$5 = $$0.m();
      this.e($$1, $$2, $$3);
      this.br = $$0.o();
      this.bt = $$0.o();
      this.bs = this.br;
      this.bu = this.bt;
      this.e($$0.b());
      this.a_($$0.e());
      this.a($$1, $$2, $$3, $$4, $$5);
      this.n($$0.j(), $$0.k(), $$0.l());
   }

   public float gb() {
      dgd $$0 = this.ed().a(kq.B);
      return $$0 != null ? $$0.b() : 0.0F;
   }

   @Override
   public float dT() {
      float $$0 = (float)this.i(cbs.C);
      return this.cY() instanceof cut ? Math.max($$0, 1.0F) : $$0;
   }

   @Override
   public fis n(bzm $$0) {
      return this.dv().e(this.a($$0, this.a(this.aw()), this.eq() * this.ep()));
   }

   protected void a(int $$0, double $$1) {
      this.bt = (float)bcb.e(1.0 / $$0, (double)this.bt, $$1);
   }

   @Override
   public void g(int $$0) {
      super.g(bcb.c($$0 * this.i(cbs.h)));
   }

   public boolean gc() {
      return false;
   }

   public boolean a(aub $$0, byb $$1) {
      return this.d($$1) || djk.a($$0, this, $$1);
   }

   public static boolean b(dcv $$0, bzw $$1) {
      if (!$$0.c(kq.F)) {
         return false;
      } else {
         dle $$2 = $$0.a(kq.D);
         return $$2 != null && $$1 == $$2.b() && !$$0.r();
      }
   }

   @VisibleForTesting
   public int gd() {
      return this.bx;
   }

   @Override
   public boolean ge() {
      return this.i(cbs.H) > 0.0;
   }

   @Override
   public Optional<fkx.c> f(auc $$0) {
      if (this.ax || $$0 == this) {
         return Optional.empty();
      } else if (fkx.a(this, $$0)) {
         return Optional.empty();
      } else {
         fkt.a $$1 = this.cx.a(this);
         if (fkx.b(this, $$0)) {
            return Optional.of(new fkx.d(this, $$1, $$0));
         } else {
            return !fkx.a(this.dz(), $$0) ? Optional.of(new fkx.f(this, $$1, $$0)) : Optional.of(new fkx.e(this, $$1, $$0));
         }
      }
   }

   @Override
   public fkt.a gf() {
      return this.cx;
   }

   public record a(ayy a, ayy b) {
   }
}
