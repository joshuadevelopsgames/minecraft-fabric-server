import com.google.common.base.MoreObjects;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import com.google.common.math.IntMath;
import com.mojang.authlib.GameProfile;
import com.mojang.datafixers.util.Either;
import com.mojang.logging.LogUtils;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.function.Predicate;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public abstract class cut extends cam {
   private static final Logger a = LogUtils.getLogger();
   public static final cad bQ = cad.b;
   public static final int bR = 0;
   public static final int bS = 20;
   public static final int bT = 100;
   public static final int bU = 10;
   public static final int bV = 200;
   public static final int bW = 499;
   public static final int bX = 500;
   public static final float bY = 4.5F;
   public static final float bZ = 3.0F;
   public static final float ca = 1.5F;
   public static final float cb = 0.6F;
   public static final float cc = 0.6F;
   public static final float cd = 1.62F;
   private static final int b = 40;
   public static final fis ce = new fis(0.0, 0.6, 0.0);
   public static final bzp cf = bzp.b(0.6F, 1.8F).b(1.62F).a(bzo.a().a(bzn.b, ce));
   private static final Map<cay, bzp> c = ImmutableMap.builder()
      .put(cay.a, cf)
      .put(cay.c, ba)
      .put(cay.b, bzp.b(0.6F, 0.6F).b(0.4F))
      .put(cay.d, bzp.b(0.6F, 0.6F).b(0.4F))
      .put(cay.e, bzp.b(0.6F, 0.6F).b(0.4F))
      .put(cay.f, bzp.b(0.6F, 1.5F).b(1.27F).a(bzo.a().a(bzn.b, ce)))
      .put(cay.h, bzp.c(0.2F, 0.2F).b(1.62F))
      .build();
   private static final alh<Float> d = all.a(cut.class, alj.d);
   private static final alh<Integer> e = all.a(cut.class, alj.b);
   protected static final alh<Byte> cg = all.a(cut.class, alj.a);
   protected static final alh<Byte> ch = all.a(cut.class, alj.a);
   protected static final alh<ui> ci = all.a(cut.class, alj.t);
   protected static final alh<ui> cj = all.a(cut.class, alj.t);
   public static final int ck = 60;
   private static final short f = 0;
   private static final float g = 0.0F;
   private static final int h = 0;
   private static final int i = 0;
   private static final int j = 0;
   private static final int k = 0;
   private static final int cM = 0;
   private static final boolean cN = false;
   private static final int cO = 0;
   private long cP;
   final cus cQ;
   protected daa cl = new daa();
   public final czp cm;
   public cym cn;
   protected cyi co = new cyi();
   protected int cp;
   private boolean cR = false;
   protected int cq = 60;
   public float cr;
   public float cs;
   public int ct;
   public double cu;
   public double cv;
   public double cw;
   public double cx;
   public double cy;
   public double cz;
   private int cS = 0;
   protected boolean cA;
   private final cup cT = new cup();
   public int cB = 0;
   public int cC = 0;
   public float cD = 0.0F;
   protected int cE = 0;
   protected final float cF = 0.02F;
   private int cU;
   private final GameProfile cV;
   private boolean cW;
   private dcv cX = dcv.l;
   private final dcs cY = this.f();
   private Optional<jk> cZ = Optional.empty();
   @Nullable
   public cvk cG;
   protected float cH;
   @Nullable
   public fis cI;
   @Nullable
   public bzm cJ;
   private boolean da = false;
   private int db = 0;

   public cut(dmu $$0, GameProfile $$1) {
      super(bzv.bU, $$0);
      this.a_($$1.getId());
      this.cV = $$1;
      this.cQ = new cus(this, this.bP);
      this.cm = new czp(this.cQ, !$$0.C, this);
      this.cn = this.cm;
   }

   @Override
   protected bzq eg() {
      return new cuu(this);
   }

   public boolean a(dmu $$0, jb $$1, dmr $$2) {
      if (!$$2.f()) {
         return false;
      } else if ($$2 == dmr.d) {
         return true;
      } else if (this.gF()) {
         return false;
      } else {
         dcv $$3 = this.fh();
         return $$3.f() || !$$3.b(new eef($$0, $$1, false));
      }
   }

   public static cbr.a gg() {
      return cam.ej()
         .a(cbs.c, 1.0)
         .a(cbs.w, 0.1F)
         .a(cbs.e)
         .a(cbs.r)
         .a(cbs.g, 4.5)
         .a(cbs.k, 3.0)
         .a(cbs.f)
         .a(cbs.D)
         .a(cbs.A)
         .a(cbs.u)
         .a(cbs.E)
         .a(cbs.H, 6.0E7)
         .a(cbs.I, 6.0E7);
   }

   @Override
   protected void a(all.a $$0) {
      super.a($$0);
      $$0.a(d, 0.0F);
      $$0.a(e, 0);
      $$0.a(cg, (byte)0);
      $$0.a(ch, (byte)bQ.b());
      $$0.a(ci, new ui());
      $$0.a(cj, new ui());
   }

   @Override
   public void g() {
      this.aq = this.am();
      if (this.am() || this.cc()) {
         this.e(false);
      }

      if (this.ct > 0) {
         this.ct--;
      }

      if (this.fY()) {
         this.cS++;
         if (this.cS > 100) {
            this.cS = 100;
         }

         if (!this.ai().C && this.ai().W()) {
            this.a(false, true);
         }
      } else if (this.cS > 0) {
         this.cS++;
         if (this.cS >= 110) {
            this.cS = 0;
         }
      }

      this.gk();
      super.g();
      if (!this.ai().C && this.cn != null && !this.cn.b(this)) {
         this.p();
         this.cn = this.cm;
      }

      this.m();
      if (this instanceof auc $$0) {
         this.co.a($$0);
         this.a(azj.k);
         this.a(azj.l);
         if (this.bO()) {
            this.a(azj.m);
         }

         if (this.cj()) {
            this.a(azj.o);
         }

         if (!this.fY()) {
            this.a(azj.n);
         }
      }

      int $$1 = 29999999;
      double $$2 = bcb.a(this.dC(), -2.9999999E7, 2.9999999E7);
      double $$3 = bcb.a(this.dI(), -2.9999999E7, 2.9999999E7);
      if ($$2 != this.dC() || $$3 != this.dI()) {
         this.a_($$2, this.dE(), $$3);
      }

      this.bo++;
      dcv $$4 = this.fh();
      if (!dcv.a(this.cX, $$4)) {
         if (!dcv.b(this.cX, $$4)) {
            this.gO();
         }

         this.cX = $$4.v();
      }

      if (!this.a(azu.a) && this.c(dcz.pt)) {
         this.l();
      }

      this.cY.a();
      this.gl();
      if (this.db > 0) {
         this.db--;
      }
   }

   @Override
   protected float fv() {
      return this.fN() ? 15.0F : super.fv();
   }

   public boolean gh() {
      return this.cg();
   }

   protected boolean gi() {
      return this.cg();
   }

   protected boolean gj() {
      return this.cg();
   }

   protected boolean gk() {
      this.cA = this.a(azu.a);
      return this.cA;
   }

   @Override
   public void a(boolean $$0, jb $$1) {
      if (!this.gt().b) {
         super.a($$0, $$1);
      }
   }

   @Override
   public void m(boolean $$0) {
      if (!this.gt().b) {
         super.m($$0);
      }
   }

   private void l() {
      this.a(new byq(bys.m, 200, 0, false, false, true));
   }

   private boolean c(dcr $$0) {
      for (bzw $$1 : bzw.j) {
         dcv $$2 = this.a($$1);
         dle $$3 = $$2.a(kq.D);
         if ($$2.a($$0) && $$3 != null && $$3.b() == $$1) {
            return true;
         }
      }

      return false;
   }

   protected dcs f() {
      return new dcs();
   }

   private void m() {
      this.cu = this.cx;
      this.cv = this.cy;
      this.cw = this.cz;
      double $$0 = this.dC() - this.cx;
      double $$1 = this.dE() - this.cy;
      double $$2 = this.dI() - this.cz;
      double $$3 = 10.0;
      if ($$0 > 10.0) {
         this.cx = this.dC();
         this.cu = this.cx;
      }

      if ($$2 > 10.0) {
         this.cz = this.dI();
         this.cw = this.cz;
      }

      if ($$1 > 10.0) {
         this.cy = this.dE();
         this.cv = this.cy;
      }

      if ($$0 < -10.0) {
         this.cx = this.dC();
         this.cu = this.cx;
      }

      if ($$2 < -10.0) {
         this.cz = this.dI();
         this.cw = this.cz;
      }

      if ($$1 < -10.0) {
         this.cy = this.dE();
         this.cv = this.cy;
      }

      this.cx += $$0 * 0.25;
      this.cz += $$2 * 0.25;
      this.cy += $$1 * 0.25;
   }

   protected void gl() {
      if (this.h(cay.d)) {
         cay $$0 = this.n();
         cay $$1;
         if (this.am() || this.cc() || this.h($$0)) {
            $$1 = $$0;
         } else if (this.h(cay.f)) {
            $$1 = cay.f;
         } else {
            $$1 = cay.d;
         }

         this.b($$1);
      }
   }

   private cay n() {
      if (this.fY()) {
         return cay.c;
      } else if (this.cn()) {
         return cay.d;
      } else if (this.fQ()) {
         return cay.b;
      } else if (this.fC()) {
         return cay.e;
      } else {
         return this.cg() && !this.cT.b ? cay.f : cay.a;
      }
   }

   protected boolean h(cay $$0) {
      return this.ai().a(this, this.a($$0).a(this.dv()).h(1.0E-7));
   }

   @Override
   protected ayy aY() {
      return ayz.vI;
   }

   @Override
   protected ayy aZ() {
      return ayz.vG;
   }

   @Override
   protected ayy ba() {
      return ayz.vH;
   }

   @Override
   public int ca() {
      return 10;
   }

   @Override
   public void a(ayy $$0, float $$1, float $$2) {
      this.ai().a(this, this.dC(), this.dE(), this.dI(), $$0, this.do(), $$1, $$2);
   }

   public void a(ayy $$0, aza $$1, float $$2, float $$3) {
   }

   @Override
   public aza do() {
      return aza.h;
   }

   @Override
   protected int dp() {
      return 20;
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 9) {
         this.w();
      } else if ($$0 == 23) {
         this.cW = false;
      } else if ($$0 == 22) {
         this.cW = true;
      } else {
         super.b($$0);
      }
   }

   @Override
   protected void p() {
      this.cn = this.cm;
   }

   protected void q() {
   }

   @Override
   public void r() {
      if (!this.ai().C && this.gi() && this.cc()) {
         this.bS();
         this.h(false);
      } else {
         super.r();
         this.cr = this.cs;
         this.cs = 0.0F;
      }
   }

   @Override
   public void e_() {
      if (this.cp > 0) {
         this.cp--;
      }

      this.i();
      this.cQ.l();
      this.cr = this.cs;
      if (this.cT.b && !this.cc()) {
         this.j();
      }

      super.e_();
      this.ff();
      this.bt = this.dP();
      this.B((float)this.i(cbs.w));
      float $$1;
      if (this.aK() && !this.eM() && !this.cn()) {
         $$1 = Math.min(0.1F, (float)this.dA().i());
      } else {
         $$1 = 0.0F;
      }

      this.cs = this.cs + ($$1 - this.cs) * 0.4F;
      if (this.eL() > 0.0F && !this.am()) {
         fin $$2;
         if (this.cc() && !this.dm().dU()) {
            $$2 = this.cV().b(this.dm().cV()).c(1.0, 0.0, 1.0);
         } else {
            $$2 = this.cV().c(1.0, 0.5, 1.0);
         }

         List<bzm> $$4 = this.ai().a_(this, $$2);
         List<bzm> $$5 = Lists.newArrayList();

         for (bzm $$6 : $$4) {
            if ($$6.ap() == bzv.W) {
               $$5.add($$6);
            } else if (!$$6.dU()) {
               this.d($$6);
            }
         }

         if (!$$5.isEmpty()) {
            this.d(ag.a($$5, this.ar));
         }
      }

      this.d(this.gL());
      this.d(this.gM());
      if (!this.ai().C && (this.am > 0.5 || this.bm()) || this.cT.b || this.fY() || this.aI) {
         this.gH();
      }
   }

   protected void i() {
   }

   private void d(ui $$0) {
      if (!$$0.j() && !$$0.b("Silent", false)) {
         if (this.ai().A.a(200) == 0) {
            bzv<?> $$1 = $$0.<bzv<?>>a("id", bzv.a).orElse(null);
            if ($$1 == bzv.aQ && !cmz.a(this.ai(), this)) {
               this.ai().a(null, this.dC(), this.dE(), this.dI(), cmz.a(this.ai(), this.ai().A), this.do(), 1.0F, cmz.a(this.ai().A));
            }
         }
      }
   }

   private void d(bzm $$0) {
      $$0.a_(this);
   }

   public int gm() {
      return this.ay.a(e);
   }

   public void q(int $$0) {
      this.ay.a(e, $$0);
   }

   public void r(int $$0) {
      int $$1 = this.gm();
      this.ay.a(e, $$1 + $$0);
   }

   public void a(int $$0, float $$1, dcv $$2) {
      this.bL = $$0;
      this.bM = $$1;
      this.bN = $$2;
      if (!this.ai().C) {
         this.gH();
         this.c(4, true);
      }
   }

   @Nonnull
   @Override
   public dcv ed() {
      return this.fC() && this.bN != null ? this.bN : super.ed();
   }

   @Override
   public void a(byb $$0) {
      super.a($$0);
      this.ay();
      if (!this.am() && this.ai() instanceof aub $$1) {
         this.b($$1, $$0);
      }

      if ($$0 != null) {
         this.n(-bcb.b((this.eR() + this.dP()) * (float) (Math.PI / 180.0)) * 0.1F, 0.1F, -bcb.a((this.eR() + this.dP()) * (float) (Math.PI / 180.0)) * 0.1F);
      } else {
         this.n(0.0, 0.1, 0.0);
      }

      this.a(azj.O);
      this.a(azj.i.b(azj.m));
      this.a(azj.i.b(azj.n));
      this.aI();
      this.d(false);
      this.a(Optional.of(jk.a(this.ai().aj(), this.dx())));
   }

   @Override
   protected void f(aub $$0) {
      super.f($$0);
      if (!$$0.P().c(dmq.e)) {
         this.gn();
         this.cQ.m();
      }
   }

   protected void gn() {
      for (int $$0 = 0; $$0 < this.cQ.b(); $$0++) {
         dcv $$1 = this.cQ.a($$0);
         if (!$$1.f() && djk.a($$1, djj.D)) {
            this.cQ.b($$0);
         }
      }
   }

   @Override
   protected ayy e(byb $$0) {
      return $$0.k().d().a();
   }

   @Override
   protected ayy f_() {
      return ayz.vy;
   }

   @Override
   public void g(dcv $$0) {
   }

   @Nullable
   public cqz a(dcv $$0, boolean $$1) {
      return this.a($$0, false, $$1);
   }

   public float c(eeb $$0) {
      float $$1 = this.cQ.g().a($$0);
      if ($$1 > 1.0F) {
         $$1 += (float)this.i(cbs.u);
      }

      if (byr.a(this)) {
         $$1 *= 1.0F + (byr.b(this) + 1) * 0.2F;
      }

      if (this.d(bys.d)) {
         float $$2 = switch (this.e(bys.d).e()) {
            case 0 -> 0.3F;
            case 1 -> 0.09F;
            case 2 -> 0.0027F;
            default -> 8.1E-4F;
         };
         $$1 *= $$2;
      }

      $$1 *= (float)this.i(cbs.f);
      if (this.a(azu.a)) {
         $$1 *= (float)this.h(cbs.D).g();
      }

      if (!this.aK()) {
         $$1 /= 5.0F;
      }

      return $$1;
   }

   @Override
   public boolean d(eeb $$0) {
      return !$$0.C() || this.cQ.g().b($$0);
   }

   @Override
   protected void a(fda $$0) {
      super.a($$0);
      this.a_(this.cV.getId());
      this.cQ.a($$0.c("Inventory", bxk.a));
      this.cQ.c($$0.a("SelectedItemSlot", 0));
      this.cS = $$0.a("SleepTimer", (short)0);
      this.cD = $$0.a("XpP", 0.0F);
      this.cB = $$0.a("XpLevel", 0);
      this.cC = $$0.a("XpTotal", 0);
      this.cE = $$0.a("XpSeed", 0);
      if (this.cE == 0) {
         this.cE = this.ar.f();
      }

      this.q($$0.a("Score", 0));
      this.co.a($$0);
      $$0.<cup.a>a("abilities", cup.a.a).ifPresent(this.cT::a);
      this.h(cbs.w).a(this.cT.b());
      this.cl.b($$0.c("EnderItems", bxk.a));
      this.b($$0.<ui>a("ShoulderEntityLeft", ui.a).orElseGet(ui::new));
      this.c($$0.<ui>a("ShoulderEntityRight", ui.a).orElseGet(ui::new));
      this.a($$0.a("LastDeathLocation", jk.b));
      this.cI = $$0.<fis>a("current_explosion_impact_pos", fis.a).orElse(null);
      this.da = $$0.a("ignore_fall_damage_from_current_explosion", false);
      this.db = $$0.a("current_impulse_context_reset_grace_time", 0);
   }

   @Override
   protected void a(fdc $$0) {
      super.a($$0);
      ux.a($$0);
      this.cQ.a($$0.a("Inventory", bxk.a));
      $$0.a("SelectedItemSlot", this.cQ.f());
      $$0.a("SleepTimer", (short)this.cS);
      $$0.a("XpP", this.cD);
      $$0.a("XpLevel", this.cB);
      $$0.a("XpTotal", this.cC);
      $$0.a("XpSeed", this.cE);
      $$0.a("Score", this.gm());
      this.co.a($$0);
      $$0.a("abilities", cup.a.a, this.cT.c());
      this.cl.b($$0.a("EnderItems", bxk.a));
      if (!this.gL().j()) {
         $$0.a("ShoulderEntityLeft", ui.a, this.gL());
      }

      if (!this.gM().j()) {
         $$0.a("ShoulderEntityRight", ui.a, this.gM());
      }

      this.cZ.ifPresent($$1 -> $$0.a("LastDeathLocation", jk.b, $$1));
      $$0.b("current_explosion_impact_pos", fis.a, this.cI);
      $$0.a("ignore_fall_damage_from_current_explosion", this.da);
      $$0.a("current_impulse_context_reset_grace_time", this.db);
   }

   @Override
   public boolean a(aub $$0, byb $$1) {
      if (super.a($$0, $$1)) {
         return true;
      } else if ($$1.a(azp.n)) {
         return !$$0.P().c(dmq.I);
      } else if ($$1.a(azp.m)) {
         return !$$0.P().c(dmq.J);
      } else if ($$1.a(azp.i)) {
         return !$$0.P().c(dmq.K);
      } else {
         return $$1.a(azp.o) ? !$$0.P().c(dmq.L) : false;
      }
   }

   @Override
   public boolean a(aub $$0, byb $$1, float $$2) {
      if (this.a($$0, $$1)) {
         return false;
      } else if (this.cT.a && !$$1.a(azp.d)) {
         return false;
      } else {
         this.bz = 0;
         if (this.eM()) {
            return false;
         } else {
            this.gH();
            if ($$1.g()) {
               if ($$0.an() == bxg.a) {
                  $$2 = 0.0F;
               }

               if ($$0.an() == bxg.b) {
                  $$2 = Math.min($$2 / 2.0F + 1.0F, $$2);
               }

               if ($$0.an() == bxg.d) {
                  $$2 = $$2 * 3.0F / 2.0F;
               }
            }

            return $$2 == 0.0F ? false : super.a($$0, $$1, $$2);
         }
      }
   }

   @Override
   protected void b(aub $$0, cam $$1) {
      super.b($$0, $$1);
      dcv $$2 = this.fO();
      dew $$3 = $$2 != null ? $$2.a(kq.I) : null;
      float $$4 = $$1.gb();
      if ($$4 > 0.0F && $$3 != null) {
         $$3.a($$0, this, $$4, $$2);
      }
   }

   @Override
   public boolean eE() {
      return !this.gt().a && super.eE();
   }

   public boolean a(cut $$0) {
      fjz $$1 = this.cu();
      fjz $$2 = $$0.cu();
      if ($$1 == null) {
         return true;
      } else {
         return !$$1.a($$2) ? true : $$1.i();
      }
   }

   @Override
   protected void c(byb $$0, float $$1) {
      this.a($$0, $$1, new bzw[]{bzw.c, bzw.d, bzw.e, bzw.f});
   }

   @Override
   protected void d(byb $$0, float $$1) {
      this.a($$0, $$1, new bzw[]{bzw.f});
   }

   @Override
   protected void c(aub $$0, byb $$1, float $$2) {
      if (!this.a($$0, $$1)) {
         $$2 = this.e($$1, $$2);
         $$2 = this.f($$1, $$2);
         float var8 = Math.max($$2 - this.fD(), 0.0F);
         this.E(this.fD() - ($$2 - var8));
         float $$4 = $$2 - var8;
         if ($$4 > 0.0F && $$4 < 3.4028235E37F) {
            this.a(azj.M, Math.round($$4 * 10.0F));
         }

         if (var8 != 0.0F) {
            this.a($$1.a());
            this.eY().a($$1, var8);
            this.x(this.eL() - var8);
            if (var8 < 3.4028235E37F) {
               this.a(azj.K, Math.round(var8 * 10.0F));
            }

            this.c(ejb.o);
         }
      }
   }

   public boolean X() {
      return false;
   }

   public void a(ecn $$0, boolean $$1) {
   }

   public void a(dlt $$0) {
   }

   public void a(ebk $$0) {
   }

   public void a(ecs $$0) {
   }

   public void a(ect $$0) {
   }

   public void a(ecu $$0) {
   }

   public void a(ecd $$0) {
   }

   public void a(coq $$0, bxc $$1) {
   }

   public OptionalInt a(@Nullable bxm $$0) {
      return OptionalInt.empty();
   }

   public void b(jl<art> $$0) {
   }

   public void a(int $$0, dlr $$1, int $$2, int $$3, boolean $$4, boolean $$5) {
   }

   public void a(dcv $$0, bxi $$1) {
   }

   public bxj a(bzm $$0, bxi $$1) {
      if (this.am()) {
         if ($$0 instanceof bxm) {
            this.a((bxm)$$0);
         }

         return bxj.e;
      } else {
         dcv $$2 = this.b($$1);
         dcv $$3 = $$2.v();
         bxj $$4 = $$0.a(this, $$1);
         if ($$4.a()) {
            if (this.gc() && $$2 == this.b($$1) && $$2.M() < $$3.M()) {
               $$2.e($$3.M());
            }

            return $$4;
         } else {
            if (!$$2.f() && $$0 instanceof cam) {
               if (this.gc()) {
                  $$2 = $$3;
               }

               bxj $$5 = $$2.a(this, (cam)$$0, $$1);
               if ($$5.a()) {
                  this.ai().a(ejb.r, $$0.dv(), ejb.a.a(this));
                  if ($$2.f() && !this.gc()) {
                     this.a($$1, dcv.l);
                  }

                  return $$5;
               }
            }

            return bxj.e;
         }
      }
   }

   @Override
   public void ab() {
      super.ab();
      this.W = 0;
   }

   @Override
   protected boolean fm() {
      return super.fm() || this.fY();
   }

   @Override
   public boolean er() {
      return !this.cT.b;
   }

   @Override
   protected fis a(fis $$0, caq $$1) {
      float $$2 = this.dT();
      if (!this.cT.b && !($$0.e > 0.0) && ($$1 == caq.a || $$1 == caq.b) && this.gj() && this.H($$2)) {
         double $$3 = $$0.d;
         double $$4 = $$0.f;
         double $$5 = 0.05;
         double $$6 = Math.signum($$3) * 0.05;

         double $$7;
         for ($$7 = Math.signum($$4) * 0.05; $$3 != 0.0 && this.q($$3, 0.0, $$2); $$3 -= $$6) {
            if (Math.abs($$3) <= 0.05) {
               $$3 = 0.0;
               break;
            }
         }

         while ($$4 != 0.0 && this.q(0.0, $$4, $$2)) {
            if (Math.abs($$4) <= 0.05) {
               $$4 = 0.0;
               break;
            }

            $$4 -= $$7;
         }

         while ($$3 != 0.0 && $$4 != 0.0 && this.q($$3, $$4, $$2)) {
            if (Math.abs($$3) <= 0.05) {
               $$3 = 0.0;
            } else {
               $$3 -= $$6;
            }

            if (Math.abs($$4) <= 0.05) {
               $$4 = 0.0;
            } else {
               $$4 -= $$7;
            }
         }

         return new fis($$3, $$0.e, $$4);
      } else {
         return $$0;
      }
   }

   private boolean H(float $$0) {
      return this.aK() || this.am < $$0 && !this.q(0.0, 0.0, $$0 - this.am);
   }

   private boolean q(double $$0, double $$1, double $$2) {
      fin $$3 = this.cV();
      return this.ai().a(this, new fin($$3.a + 1.0E-7 + $$0, $$3.b - $$2 - 1.0E-7, $$3.c + 1.0E-7 + $$1, $$3.d - 1.0E-7 + $$0, $$3.b, $$3.f - 1.0E-7 + $$1));
   }

   public void e(bzm $$0) {
      if ($$0.cF()) {
         if (!$$0.w(this)) {
            float $$1 = this.fC() ? this.bM : (float)this.i(cbs.c);
            dcv $$2 = this.ed();
            byb $$3 = Optional.ofNullable($$2.h().a(this)).orElse(this.ea().a(this));
            float $$4 = this.a($$0, $$1, $$3) - $$1;
            float $$5 = this.G(0.5F);
            $$1 *= 0.2F + $$5 * $$5 * 0.8F;
            $$4 *= $$5;
            this.gO();
            if ($$0.ap().a(azs.H) && $$0 instanceof cvo $$6 && $$6.a(cvp.c, this, this, true)) {
               this.ai().a(null, this.dC(), this.dE(), this.dI(), ayz.vr, this.do());
            } else {
               if ($$1 > 0.0F || $$4 > 0.0F) {
                  boolean $$7 = $$5 > 0.9F;
                  boolean $$8;
                  if (this.cm() && $$7) {
                     this.ai().a(null, this.dC(), this.dE(), this.dI(), ayz.vq, this.do(), 1.0F, 1.0F);
                     $$8 = true;
                  } else {
                     $$8 = false;
                  }

                  $$1 += $$2.h().a($$0, $$1, $$3);
                  boolean $$10 = $$7
                     && this.am > 0.0
                     && !this.aK()
                     && !this.eV()
                     && !this.bm()
                     && !this.d(bys.o)
                     && !this.cc()
                     && $$0 instanceof cam
                     && !this.cm();
                  if ($$10) {
                     $$1 *= 1.5F;
                  }

                  float $$11 = $$1 + $$4;
                  boolean $$12 = false;
                  if ($$7 && !$$10 && !$$8 && this.aK()) {
                     double $$13 = this.ae().j();
                     double $$14 = this.fu() * 2.5;
                     if ($$13 < bcb.k($$14) && this.b(bxi.a).a(azx.bL)) {
                        $$12 = true;
                     }
                  }

                  float $$15 = 0.0F;
                  if ($$0 instanceof cam $$16) {
                     $$15 = $$16.eL();
                  }

                  fis $$17 = $$0.dA();
                  boolean $$18 = $$0.b($$3, $$11);
                  if ($$18) {
                     float $$19 = this.b($$0, $$3) + ($$8 ? 1.0F : 0.0F);
                     if ($$19 > 0.0F) {
                        if ($$0 instanceof cam $$20) {
                           $$20.p($$19 * 0.5F, bcb.a(this.dP() * (float) (Math.PI / 180.0)), -bcb.b(this.dP() * (float) (Math.PI / 180.0)));
                        } else {
                           $$0.i(-bcb.a(this.dP() * (float) (Math.PI / 180.0)) * $$19 * 0.5F, 0.1, bcb.b(this.dP() * (float) (Math.PI / 180.0)) * $$19 * 0.5F);
                        }

                        this.i(this.dA().d(0.6, 1.0, 0.6));
                        this.i(false);
                     }

                     if ($$12) {
                        float $$21 = 1.0F + (float)this.i(cbs.E) * $$1;

                        for (cam $$23 : this.ai().a(cam.class, $$0.cV().c(1.0, 0.25, 1.0))) {
                           if ($$23 != this && $$23 != $$0 && !this.t($$23) && !($$23 instanceof cqo $$24 && $$24.t()) && this.g($$23) < 9.0) {
                              float $$25 = this.a($$23, $$21, $$3) * $$5;
                              if (this.ai() instanceof aub $$26 && $$23.a($$26, $$3, $$25)) {
                                 $$23.p(0.4F, bcb.a(this.dP() * (float) (Math.PI / 180.0)), -bcb.b(this.dP() * (float) (Math.PI / 180.0)));
                                 djk.a($$26, (bzm)$$23, $$3);
                              }
                           }
                        }

                        this.ai().a(null, this.dC(), this.dE(), this.dI(), ayz.vt, this.do(), 1.0F, 1.0F);
                        this.go();
                     }

                     if ($$0 instanceof auc && $$0.ag) {
                        ((auc)$$0).g.b(new agb($$0));
                        $$0.ag = false;
                        $$0.i($$17);
                     }

                     if ($$10) {
                        this.ai().a(null, this.dC(), this.dE(), this.dI(), ayz.vp, this.do(), 1.0F, 1.0F);
                        this.b($$0);
                     }

                     if (!$$10 && !$$12) {
                        if ($$7) {
                           this.ai().a(null, this.dC(), this.dE(), this.dI(), ayz.vs, this.do(), 1.0F, 1.0F);
                        } else {
                           this.ai().a(null, this.dC(), this.dE(), this.dI(), ayz.vu, this.do(), 1.0F, 1.0F);
                        }
                     }

                     if ($$4 > 0.0F) {
                        this.c($$0);
                     }

                     this.C($$0);
                     bzm $$27 = $$0;
                     if ($$0 instanceof cpp) {
                        $$27 = ((cpp)$$0).a;
                     }

                     boolean $$28 = false;
                     if (this.ai() instanceof aub $$29) {
                        if ($$27 instanceof cam $$30) {
                           $$28 = $$2.a($$30, this);
                        }

                        djk.a($$29, $$0, $$3);
                     }

                     if (!this.ai().C && !$$2.f() && $$27 instanceof cam) {
                        if ($$28) {
                           $$2.b((cam)$$27, this);
                        }

                        if ($$2.f()) {
                           if ($$2 == this.fh()) {
                              this.a(bxi.a, dcv.l);
                           } else {
                              this.a(bxi.b, dcv.l);
                           }
                        }
                     }

                     if ($$0 instanceof cam) {
                        float $$31 = $$15 - ((cam)$$0).eL();
                        this.a(azj.H, Math.round($$31 * 10.0F));
                        if (this.ai() instanceof aub && $$31 > 2.0F) {
                           int $$32 = (int)($$31 * 0.5);
                           ((aub)this.ai()).a(me.g, $$0.dC(), $$0.e(0.5), $$0.dI(), $$32, 0.1, 0.0, 0.1, 0.2);
                        }
                     }

                     this.a(0.1F);
                  } else {
                     this.ai().a(null, this.dC(), this.dE(), this.dI(), ayz.vr, this.do(), 1.0F, 1.0F);
                  }
               }
            }
         }
      }
   }

   protected float a(bzm $$0, float $$1, byb $$2) {
      return $$1;
   }

   @Override
   protected void f(cam $$0) {
      this.e($$0);
   }

   public void b(bzm $$0) {
   }

   public void c(bzm $$0) {
   }

   public void go() {
      double $$0 = -bcb.a(this.dP() * (float) (Math.PI / 180.0));
      double $$1 = bcb.b(this.dP() * (float) (Math.PI / 180.0));
      if (this.ai() instanceof aub) {
         ((aub)this.ai()).a(me.am, this.dC() + $$0, this.e(0.5), this.dI() + $$1, 0, $$0, 0.0, $$1, 0.0);
      }
   }

   public void gp() {
   }

   @Override
   public void a(bzm.e $$0) {
      super.a($$0);
      this.cm.a(this);
      if (this.cn != null && this.gv()) {
         this.q();
      }
   }

   @Override
   public boolean aa_() {
      return true;
   }

   @Override
   protected boolean dj() {
      return this.gq();
   }

   public boolean gq() {
      return false;
   }

   @Override
   public boolean dk() {
      return !this.ai().C || this.gq();
   }

   @Override
   public boolean dl() {
      return !this.ai().C || this.gq();
   }

   public GameProfile gr() {
      return this.cV;
   }

   public cus gs() {
      return this.cQ;
   }

   public cup gt() {
      return this.cT;
   }

   @Override
   public boolean gc() {
      return this.cT.d;
   }

   public boolean gu() {
      return this.cT.d;
   }

   public void a(dcv $$0, dcv $$1, cyw $$2) {
   }

   public boolean gv() {
      return this.cn != this.cm;
   }

   public boolean gw() {
      return true;
   }

   public Either<cut.a, bdk> a(jb $$0) {
      this.b($$0);
      this.cS = 0;
      return Either.right(bdk.a);
   }

   public void a(boolean $$0, boolean $$1) {
      super.fZ();
      if (this.ai() instanceof aub && $$1) {
         ((aub)this.ai()).f();
      }

      this.cS = $$0 ? 0 : 100;
   }

   @Override
   public void fZ() {
      this.a(true, true);
   }

   public boolean gx() {
      return this.fY() && this.cS >= 100;
   }

   public int gy() {
      return this.cS;
   }

   public void a(xo $$0, boolean $$1) {
   }

   public void a(ame $$0) {
      this.b(azj.i.b($$0));
   }

   public void a(ame $$0, int $$1) {
      this.a(azj.i.b($$0), $$1);
   }

   public void b(azg<?> $$0) {
      this.a($$0, 1);
   }

   public void a(azg<?> $$0, int $$1) {
   }

   public void a(azg<?> $$0) {
   }

   public int a(Collection<dhr<?>> $$0) {
      return 0;
   }

   public void a(dhr<?> $$0, List<dcv> $$1) {
   }

   @Override
   public void b(List<amd<dhm<?>>> $$0) {
   }

   public int b(Collection<dhr<?>> $$0) {
      return 0;
   }

   @Override
   public void k(fis $$0) {
      if (this.cc()) {
         super.k($$0);
      } else {
         if (this.cn()) {
            double $$1 = this.bW().e;
            double $$2 = $$1 < -0.2 ? 0.085 : 0.06;
            if ($$1 <= 0.0 || this.bB || !this.ai().b_(jb.a(this.dC(), this.dE() + 1.0 - 0.1, this.dI())).c()) {
               fis $$3 = this.dA();
               this.i($$3.b(0.0, ($$1 - $$3.e) * $$2, 0.0));
            }
         }

         if (this.gt().b) {
            double $$4 = this.dA().e;
            super.k($$0);
            this.i(this.dA().a(jh.a.b, $$4 * 0.6));
         } else {
            super.k($$0);
         }
      }
   }

   @Override
   protected boolean fA() {
      return !this.cT.b && super.fA();
   }

   @Override
   public void bs() {
      if (this.cT.b) {
         this.j(false);
      } else {
         super.bs();
      }
   }

   protected boolean h(jb $$0) {
      return !this.ai().a_($$0).j(this.ai(), $$0);
   }

   @Override
   public float fu() {
      return (float)this.i(cbs.w);
   }

   @Override
   public boolean a(double $$0, float $$1, byb $$2) {
      if (this.cT.c) {
         return false;
      } else {
         if ($$0 >= 2.0) {
            this.a(azj.t, (int)Math.round($$0 * 100.0));
         }

         boolean $$3 = this.cI != null && this.da;
         double $$4;
         if ($$3) {
            $$4 = Math.min($$0, this.cI.e - this.dE());
            boolean $$5 = $$4 <= 0.0;
            if ($$5) {
               this.gZ();
            } else {
               this.gY();
            }
         } else {
            $$4 = $$0;
         }

         if ($$4 > 0.0 && super.a($$4, $$1, $$2)) {
            this.gZ();
            return true;
         } else {
            this.b($$0, $$1, $$2);
            return false;
         }
      }
   }

   public boolean gz() {
      if (!this.fQ() && this.fA() && !this.bm()) {
         this.gA();
         return true;
      } else {
         return false;
      }
   }

   public void gA() {
      this.b(7, true);
   }

   @Override
   protected void bv() {
      if (!this.am()) {
         super.bv();
      }
   }

   @Override
   protected void b(jb $$0, eeb $$1) {
      if (this.bm()) {
         this.bb();
         this.b($$1);
      } else {
         jb $$2 = this.e($$0);
         if (!$$0.equals($$2)) {
            eeb $$3 = this.ai().a_($$2);
            if ($$3.a(azo.bs)) {
               this.a($$3, $$1);
            } else {
               super.b($$2, $$3);
            }
         } else {
            super.b($$0, $$1);
         }
      }
   }

   @Override
   public cam.a eT() {
      return new cam.a(ayz.vF, ayz.vv);
   }

   @Override
   public boolean a(aub $$0, cam $$1) {
      this.b(azj.g.b($$1.ap()));
      return true;
   }

   @Override
   public void a(eeb $$0, fis $$1) {
      if (!this.cT.b) {
         super.a($$0, $$1);
      }

      this.gY();
   }

   public void d(int $$0) {
      this.r($$0);
      this.cD = this.cD + (float)$$0 / this.gC();
      this.cC = bcb.a(this.cC + $$0, 0, Integer.MAX_VALUE);

      while (this.cD < 0.0F) {
         float $$1 = this.cD * this.gC();
         if (this.cB > 0) {
            this.c(-1);
            this.cD = 1.0F + $$1 / this.gC();
         } else {
            this.c(-1);
            this.cD = 0.0F;
         }
      }

      while (this.cD >= 1.0F) {
         this.cD = (this.cD - 1.0F) * this.gC();
         this.c(1);
         this.cD = this.cD / this.gC();
      }
   }

   public int gB() {
      return this.cE;
   }

   public void a(dcv $$0, int $$1) {
      this.cB -= $$1;
      if (this.cB < 0) {
         this.cB = 0;
         this.cD = 0.0F;
         this.cC = 0;
      }

      this.cE = this.ar.f();
   }

   public void c(int $$0) {
      this.cB = IntMath.saturatedAdd(this.cB, $$0);
      if (this.cB < 0) {
         this.cB = 0;
         this.cD = 0.0F;
         this.cC = 0;
      }

      if ($$0 > 0 && this.cB % 5 == 0 && this.cU < this.as - 100.0F) {
         float $$1 = this.cB > 30 ? 1.0F : this.cB / 30.0F;
         this.ai().a(null, this.dC(), this.dE(), this.dI(), ayz.vE, this.do(), $$1 * 0.75F, 1.0F);
         this.cU = this.as;
      }
   }

   public int gC() {
      if (this.cB >= 30) {
         return 112 + (this.cB - 30) * 9;
      } else {
         return this.cB >= 15 ? 37 + (this.cB - 15) * 5 : 7 + this.cB * 2;
      }
   }

   public void a(float $$0) {
      if (!this.cT.a) {
         if (!this.ai().C) {
            this.co.a($$0);
         }
      }
   }

   public Optional<cty> Z() {
      return Optional.empty();
   }

   public cyi gD() {
      return this.co;
   }

   public boolean u(boolean $$0) {
      return this.cT.a || $$0 || this.co.b();
   }

   public boolean gE() {
      return this.eL() > 0.0F && this.eL() < this.fa();
   }

   public boolean gF() {
      return this.cT.e;
   }

   public boolean a(jb $$0, jh $$1, dcv $$2) {
      if (this.cT.e) {
         return true;
      } else {
         jb $$3 = $$0.a($$1.g());
         eef $$4 = new eef(this.ai(), $$3, false);
         return $$2.a($$4);
      }
   }

   @Override
   protected int e(aub $$0) {
      return !$$0.P().c(dmq.e) && !this.am() ? Math.min(this.cB * 7, 100) : 0;
   }

   @Override
   protected boolean ev() {
      return true;
   }

   @Override
   public boolean cQ() {
      return true;
   }

   @Override
   protected bzm.d bj() {
      return this.cT.b || this.aK() && this.cj() ? bzm.d.a : bzm.d.d;
   }

   public void x() {
   }

   @Override
   public xo aj() {
      return xo.b(this.cV.getName());
   }

   public daa gG() {
      return this.cl;
   }

   @Override
   protected boolean b(bzw $$0) {
      return $$0.a() == bzw.a.b;
   }

   public boolean h(dcv $$0) {
      return this.cQ.g($$0);
   }

   public boolean a(ui $$0) {
      if (this.cc() || !this.aK() || this.bm() || this.aI) {
         return false;
      } else if (this.gL().j()) {
         this.b($$0);
         this.cP = this.ai().ae();
         return true;
      } else if (this.gM().j()) {
         this.c($$0);
         this.cP = this.ai().ae();
         return true;
      } else {
         return false;
      }
   }

   protected void gH() {
      if (this.cP + 20L < this.ai().ae()) {
         this.e(this.gL());
         this.b(new ui());
         this.e(this.gM());
         this.c(new ui());
      }
   }

   private void e(ui $$0) {
      if (this.ai() instanceof aub $$1 && !$$0.j()) {
         try (bci.j $$2 = new bci.j(this.ef(), a)) {
            bzv.a(fcy.a($$2.a(() -> ".shoulder"), $$1.K_(), $$0), $$1, bzu.r).ifPresent($$1x -> {
               if ($$1x instanceof cbi $$2x) {
                  $$2x.i(this);
               }

               $$1x.a_(this.dC(), this.dE() + 0.7F, this.dI());
               $$1.c($$1x);
            });
         }
      }
   }

   @Nullable
   public abstract dmr a();

   @Override
   public boolean am() {
      return this.a() == dmr.d;
   }

   @Override
   public boolean bJ() {
      return !this.am() && super.bJ();
   }

   @Override
   public boolean cn() {
      return !this.cT.b && !this.am() && super.cn();
   }

   public boolean gI() {
      return this.a() == dmr.b;
   }

   @Override
   public boolean cN() {
      return !this.cT.b;
   }

   public fjx gJ() {
      return this.ai().S();
   }

   @Override
   public xo Q_() {
      yc $$0 = fjs.a(this.cu(), this.aj());
      return this.a($$0);
   }

   private yc a(yc $$0) {
      String $$1 = this.gr().getName();
      return $$0.a($$1x -> $$1x.a(new xm.i("/tell " + $$1 + " ")).a(this.cU()).a($$1));
   }

   @Override
   public String cM() {
      return this.gr().getName();
   }

   @Override
   protected void F(float $$0) {
      this.au().a(d, $$0);
   }

   @Override
   public float fD() {
      return this.au().a(d);
   }

   public boolean a(cuv $$0) {
      return (this.au().a(cg) & $$0.a()) == $$0.a();
   }

   @Override
   public cbd a_(int $$0) {
      if ($$0 == 499) {
         return new cbd() {
            @Override
            public dcv a() {
               return cut.this.cn.g();
            }

            @Override
            public boolean a(dcv $$0) {
               cut.this.cn.a($$0);
               return true;
            }
         };
      } else {
         final int $$1 = $$0 - 500;
         if ($$1 >= 0 && $$1 < 4) {
            return new cbd() {
               @Override
               public dcv a() {
                  return cut.this.cm.r().a($$1);
               }

               @Override
               public boolean a(dcv $$0) {
                  cut.this.cm.r().a($$1, $$0);
                  cut.this.cm.a(cut.this.cQ);
                  return true;
               }
            };
         } else if ($$0 >= 0 && $$0 < this.cQ.i().size()) {
            return cbd.a(this.cQ, $$0);
         } else {
            int $$2 = $$0 - 200;
            return $$2 >= 0 && $$2 < this.cl.b() ? cbd.a(this.cl, $$2) : super.a_($$0);
         }
      }
   }

   public boolean gK() {
      return this.cW;
   }

   public void v(boolean $$0) {
      this.cW = $$0;
   }

   @Override
   public void h(int $$0) {
      super.h(this.cT.a ? Math.min($$0, 1) : $$0);
   }

   @Override
   public cad fF() {
      return this.ay.a(ch) == 0 ? cad.a : cad.b;
   }

   public void b(cad $$0) {
      this.ay.a(ch, (byte)($$0 == cad.a ? 0 : 1));
   }

   public ui gL() {
      return this.ay.a(ci);
   }

   protected void b(ui $$0) {
      this.ay.a(ci, $$0);
   }

   public ui gM() {
      return this.ay.a(cj);
   }

   protected void c(ui $$0) {
      this.ay.a(cj, $$0);
   }

   public float gN() {
      return (float)(1.0 / this.i(cbs.e) * 20.0);
   }

   @Override
   public float G(float $$0) {
      return bcb.a((this.bo + $$0) / this.gN(), 0.0F, 1.0F);
   }

   public void gO() {
      this.bo = 0;
   }

   public dcs gP() {
      return this.cY;
   }

   @Override
   protected float aW() {
      return !this.cT.b && !this.fQ() ? super.aW() : 1.0F;
   }

   @Override
   public float em() {
      return (float)this.i(cbs.r);
   }

   public boolean gQ() {
      return this.cT.d && this.G() >= 2;
   }

   public int G() {
      return 0;
   }

   public boolean s(int $$0) {
      return this.G() >= $$0;
   }

   @Override
   public bzp e(cay $$0) {
      return c.getOrDefault($$0, cf);
   }

   @Override
   public ImmutableList<cay> fV() {
      return ImmutableList.of(cay.a, cay.f, cay.d);
   }

   @Override
   public dcv d(dcv $$0) {
      if (!($$0.h() instanceof ddq)) {
         return dcv.l;
      } else {
         Predicate<dcv> $$1 = ((ddq)$$0.h()).c();
         dcv $$2 = ddq.a(this, $$1);
         if (!$$2.f()) {
            return $$2;
         } else {
            $$1 = ((ddq)$$0.h()).a();

            for (int $$3 = 0; $$3 < this.cQ.b(); $$3++) {
               dcv $$4 = this.cQ.a($$3);
               if ($$1.test($$4)) {
                  return $$4;
               }
            }

            return this.gc() ? new dcv(dcz.pB) : dcv.l;
         }
      }
   }

   @Override
   public fis u(float $$0) {
      double $$1 = 0.22 * (this.fF() == cad.b ? -1.0 : 1.0);
      float $$2 = bcb.h($$0 * 0.5F, this.dR(), this.ab) * (float) (Math.PI / 180.0);
      float $$3 = bcb.h($$0, this.bs, this.br) * (float) (Math.PI / 180.0);
      if (this.fQ() || this.fC()) {
         fis $$4 = this.h($$0);
         fis $$5 = this.dA();
         double $$6 = $$5.j();
         double $$7 = $$4.j();
         float $$10;
         if ($$6 > 0.0 && $$7 > 0.0) {
            double $$8 = ($$5.d * $$4.d + $$5.f * $$4.f) / Math.sqrt($$6 * $$7);
            double $$9 = $$5.d * $$4.f - $$5.f * $$4.d;
            $$10 = (float)(Math.signum($$9) * Math.acos($$8));
         } else {
            $$10 = 0.0F;
         }

         return this.p($$0).e(new fis($$1, -0.11, 0.85).c(-$$10).a(-$$2).b(-$$3));
      } else if (this.co()) {
         return this.p($$0).e(new fis($$1, 0.2, -0.15).a(-$$2).b(-$$3));
      } else {
         double $$12 = this.cV().c() - 1.0;
         double $$13 = this.cl() ? -0.2 : 0.07;
         return this.p($$0).e(new fis($$1, $$12, $$13).b(-$$3));
      }
   }

   @Override
   public boolean dY() {
      return true;
   }

   public boolean gR() {
      return this.fG() && this.fI().a(dcz.sw);
   }

   @Override
   public boolean dX() {
      return false;
   }

   public Optional<jk> gS() {
      return this.cZ;
   }

   public void a(Optional<jk> $$0) {
      this.cZ = $$0;
   }

   @Override
   public float eR() {
      return this.cH;
   }

   @Override
   public void q(float $$0) {
      super.q($$0);
      this.cH = $$0;
   }

   @Override
   public boolean dS() {
      return true;
   }

   @Override
   protected float ft() {
      if (this.cT.b && !this.cc()) {
         return this.cm() ? this.cT.a() * 2.0F : this.cT.a();
      } else {
         return this.cm() ? 0.025999999F : 0.02F;
      }
   }

   public boolean gT() {
      return this.cR || this.cq <= 0;
   }

   public void gU() {
      if (!this.cR) {
         this.cq--;
      }
   }

   public void w(boolean $$0) {
      this.cR = $$0;
      if (!this.cR) {
         this.cq = 60;
      }
   }

   public double gV() {
      return this.i(cbs.g);
   }

   public double gW() {
      return this.i(cbs.k);
   }

   public boolean b(bzm $$0, double $$1) {
      return $$0.dU() ? false : this.a($$0.cV(), $$1);
   }

   public boolean a(fin $$0, double $$1) {
      double $$2 = this.gW() + $$1;
      return $$0.e(this.bI()) < $$2 * $$2;
   }

   public boolean a(jb $$0, double $$1) {
      double $$2 = this.gV() + $$1;
      return new fin($$0).e(this.bI()) < $$2 * $$2;
   }

   public void x(boolean $$0) {
      this.da = $$0;
      if ($$0) {
         this.db = 40;
      } else {
         this.db = 0;
      }
   }

   public boolean gX() {
      return this.da;
   }

   public void gY() {
      if (this.db == 0) {
         this.gZ();
      }
   }

   public void gZ() {
      this.db = 0;
      this.cJ = null;
      this.cI = null;
      this.da = false;
   }

   public boolean ha() {
      return false;
   }

   @Override
   public boolean eV() {
      return this.cT.b ? false : super.eV();
   }

   public String hb() {
      return MoreObjects.toStringHelper(this)
         .add("name", this.aj().getString())
         .add("id", this.ar())
         .add("pos", this.dv())
         .add("mode", this.a())
         .add("permission", this.G())
         .toString();
   }

   public static enum a {
      a,
      b(xo.c("block.minecraft.bed.no_sleep")),
      c(xo.c("block.minecraft.bed.too_far_away")),
      d(xo.c("block.minecraft.bed.obstructed")),
      e,
      f(xo.c("block.minecraft.bed.not_safe"));

      @Nullable
      private final xo g;

      private a() {
         this.g = null;
      }

      private a(final xo $$0) {
         this.g = $$0;
      }

      @Nullable
      public xo a() {
         return this.g;
      }
   }
}
