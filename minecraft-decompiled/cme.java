import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.longs.Long2LongOpenHashMap;
import java.util.Comparator;
import java.util.EnumSet;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public class cme extends cmd implements car, cmr {
   public static final float ck = 120.32113F;
   public static final int cl = bcb.f(1.4959966F);
   private static final alh<Byte> cv = all.a(cme.class, alj.a);
   private static final alh<Integer> cw = all.a(cme.class, alj.b);
   private static final int cx = 2;
   private static final int cy = 4;
   private static final int cz = 8;
   private static final int cA = 1200;
   private static final int cB = 600;
   private static final int cC = 3600;
   private static final int cD = 4;
   private static final int cE = 10;
   private static final int cF = 10;
   private static final int cG = 18;
   private static final int cH = 48;
   private static final int cI = 2;
   private static final int cJ = 24;
   private static final int cM = 16;
   private static final int cN = 16;
   private static final int cO = 20;
   public static final String cm = "CropsGrownSincePollination";
   public static final String co = "CannotEnterHiveTicks";
   public static final String cp = "TicksSincePollination";
   public static final String cq = "HasStung";
   public static final String cr = "HasNectar";
   public static final String cs = "flower_pos";
   public static final String ct = "hive_pos";
   public static final boolean cu = false;
   private static final boolean cP = false;
   private static final int cQ = 0;
   private static final int cR = 0;
   private static final int cS = 0;
   private static final bwu cT = bdg.a(20, 39);
   @Nullable
   private UUID cU;
   private float cV;
   private float cW;
   private int cX;
   int cY = 0;
   private int cZ = 0;
   private int da = 0;
   private static final int db = 200;
   int dc;
   private static final int dd = 200;
   private static final int de = 20;
   private static final int df = 60;
   int dg = bcb.a(this.ar, 20, 60);
   @Nullable
   jb dh;
   @Nullable
   jb di;
   cme.k dj;
   cme.e dk;
   private cme.f dl;
   private int dm;

   public cme(bzv<? extends cme> $$0, dmu $$1) {
      super($$0, $$1);
      this.ce = new cgi(this, 20, true);
      this.cd = new cme.j(this);
      this.a(fbc.n, -1.0F);
      this.a(fbc.j, -1.0F);
      this.a(fbc.k, 16.0F);
      this.a(fbc.x, -1.0F);
      this.a(fbc.h, -1.0F);
   }

   @Override
   protected void a(all.a $$0) {
      super.a($$0);
      $$0.a(cv, (byte)0);
      $$0.a(cw, 0);
   }

   @Override
   public float a(jb $$0, dmx $$1) {
      return $$1.a_($$0).l() ? 10.0F : 0.0F;
   }

   @Override
   protected void H() {
      this.ch.a(0, new cme.b(this, 1.4F, true));
      this.ch.a(1, new cme.d());
      this.ch.a(2, new cgu(this, 1.0));
      this.ch.a(3, new ciq(this, 1.25, $$0 -> $$0.a(azx.aj), false));
      this.ch.a(3, new cme.n());
      this.ch.a(3, new cme.m());
      this.dj = new cme.k();
      this.ch.a(4, this.dj);
      this.ch.a(5, new chh(this, 1.25));
      this.ch.a(5, new cme.i());
      this.dk = new cme.e();
      this.ch.a(5, this.dk);
      this.dl = new cme.f();
      this.ch.a(6, this.dl);
      this.ch.a(7, new cme.g());
      this.ch.a(8, new cme.l());
      this.ch.a(9, new chc(this));
      this.ci.a(1, new cme.h(this).a(new Class[0]));
      this.ci.a(2, new cme.c(this));
      this.ci.a(3, new cjh<>(this, true));
   }

   @Override
   protected void a(fdc $$0) {
      super.a($$0);
      $$0.b("hive_pos", jb.a, this.di);
      $$0.b("flower_pos", jb.a, this.dh);
      $$0.a("HasNectar", this.gT());
      $$0.a("HasStung", this.gU());
      $$0.a("TicksSincePollination", this.cY);
      $$0.a("CannotEnterHiveTicks", this.cZ);
      $$0.a("CropsGrownSincePollination", this.da);
      this.a_($$0);
   }

   @Override
   protected void a(fda $$0) {
      super.a($$0);
      this.x($$0.a("HasNectar", false));
      this.y($$0.a("HasStung", false));
      this.cY = $$0.a("TicksSincePollination", 0);
      this.cZ = $$0.a("CannotEnterHiveTicks", 0);
      this.da = $$0.a("CropsGrownSincePollination", 0);
      this.di = $$0.<jb>a("hive_pos", jb.a).orElse(null);
      this.dh = $$0.<jb>a("flower_pos", jb.a).orElse(null);
      this.a(this.ai(), $$0);
   }

   @Override
   public boolean c(aub $$0, bzm $$1) {
      byb $$2 = this.ea().a((cam)this);
      boolean $$3 = $$1.a($$0, $$2, (float)((int)this.i(cbs.c)));
      if ($$3) {
         djk.a($$0, $$1, $$2);
         if ($$1 instanceof cam $$4) {
            $$4.p($$4.fd() + 1);
            int $$5 = 0;
            if (this.ai().an() == bxg.c) {
               $$5 = 10;
            } else if (this.ai().an() == bxg.d) {
               $$5 = 18;
            }

            if ($$5 > 0) {
               $$4.b(new byq(bys.s, $$5 * 20, 0), this);
            }
         }

         this.y(true);
         this.i();
         this.a(ayz.bS, 1.0F, 1.0F);
      }

      return $$3;
   }

   @Override
   public void g() {
      super.g();
      if (this.gT() && this.he() < 10 && this.ar.i() < 0.05F) {
         for (int $$0 = 0; $$0 < this.ar.a(2) + 1; $$0++) {
            this.a(this.ai(), this.dC() - 0.3F, this.dC() + 0.3F, this.dI() - 0.3F, this.dI() + 0.3F, this.e(0.5), me.aB);
         }
      }

      this.hc();
   }

   private void a(dmu $$0, double $$1, double $$2, double $$3, double $$4, double $$5, mc $$6) {
      $$0.a($$6, bcb.d($$0.A.j(), $$1, $$2), $$5, bcb.d($$0.A.j(), $$3, $$4), 0.0, 0.0, 0.0);
   }

   @Override
   void j(jb $$0) {
      fis $$1 = fis.c($$0);
      int $$2 = 0;
      jb $$3 = this.dx();
      int $$4 = (int)$$1.e - $$3.v();
      if ($$4 > 2) {
         $$2 = 4;
      } else if ($$4 < -2) {
         $$2 = -4;
      }

      int $$5 = 6;
      int $$6 = 8;
      int $$7 = $$3.k($$0);
      if ($$7 < 15) {
         $$5 = $$7 / 2;
         $$6 = $$7 / 2;
      }

      fis $$8 = clf.a(this, $$5, $$6, $$2, $$1, (float) (Math.PI / 10));
      if ($$8 != null) {
         this.cg.b(0.5F);
         this.cg.a($$8.d, $$8.e, $$8.f, 1.0);
      }
   }

   @Nullable
   public jb m() {
      return this.dh;
   }

   public boolean n() {
      return this.dh != null;
   }

   public void h(jb $$0) {
      this.dh = $$0;
   }

   @bdl
   public int t() {
      return Math.max(this.dk.d, this.dl.d);
   }

   @bdl
   public List<jb> gH() {
      return this.dk.f;
   }

   private boolean gY() {
      return this.cY > 3600;
   }

   void gZ() {
      this.di = null;
      this.dc = 200;
   }

   void ha() {
      this.dh = null;
      this.dg = bcb.a(this.ar, 20, 60);
   }

   boolean hb() {
      if (this.cZ <= 0 && !this.dj.l() && !this.gU() && this.e() == null) {
         boolean $$0 = this.gY() || c(this.ai()) || this.gT();
         return $$0 && !this.hd();
      } else {
         return false;
      }
   }

   public static boolean c(dmu $$0) {
      return $$0.G_().g() && ($$0.X() || $$0.ah());
   }

   public void s(int $$0) {
      this.cZ = $$0;
   }

   public float J(float $$0) {
      return bcb.h($$0, this.cW, this.cV);
   }

   private void hc() {
      this.cW = this.cV;
      if (this.hj()) {
         this.cV = Math.min(1.0F, this.cV + 0.2F);
      } else {
         this.cV = Math.max(0.0F, this.cV - 0.24F);
      }
   }

   @Override
   protected void a(aub $$0) {
      boolean $$1 = this.gU();
      if (this.bm()) {
         this.dm++;
      } else {
         this.dm = 0;
      }

      if (this.dm > 20) {
         this.a($$0, this.ea().i(), 1.0F);
      }

      if ($$1) {
         this.cX++;
         if (this.cX % 5 == 0 && this.ar.a(bcb.a(1200 - this.cX, 1, 1200)) == 0) {
            this.a($$0, this.ea().p(), this.eL());
         }
      }

      if (!this.gT()) {
         this.cY++;
      }

      this.a($$0, false);
   }

   public void gI() {
      this.cY = 0;
   }

   private boolean hd() {
      eaw $$0 = this.hh();
      return $$0 != null && $$0.a();
   }

   @Override
   public int a() {
      return this.ay.a(cw);
   }

   @Override
   public void a(int $$0) {
      this.ay.a(cw, $$0);
   }

   @Nullable
   @Override
   public UUID b() {
      return this.cU;
   }

   @Override
   public void a(@Nullable UUID $$0) {
      this.cU = $$0;
   }

   @Override
   public void c() {
      this.a(cT.a(this.ar));
   }

   private boolean k(jb $$0) {
      eaz $$1 = this.ai().c_($$0);
      return $$1 instanceof eaw ? !((eaw)$$1).d() : false;
   }

   @bdl
   public boolean gJ() {
      return this.di != null;
   }

   @Nullable
   @bdl
   public jb gK() {
      return this.di;
   }

   @bdl
   public chj gL() {
      return this.ch;
   }

   @Override
   protected void ah() {
      super.ah();
      ahj.a(this);
   }

   int he() {
      return this.da;
   }

   private void hf() {
      this.da = 0;
   }

   void hg() {
      this.da++;
   }

   @Override
   public void e_() {
      super.e_();
      if (!this.ai().C) {
         if (this.cZ > 0) {
            this.cZ--;
         }

         if (this.dc > 0) {
            this.dc--;
         }

         if (this.dg > 0) {
            this.dg--;
         }

         boolean $$0 = this.ad_() && !this.gU() && this.e() != null && this.e().g(this) < 4.0;
         this.z($$0);
         if (this.as % 20 == 0 && !this.hi()) {
            this.di = null;
         }
      }
   }

   @Nullable
   eaw hh() {
      if (this.di == null) {
         return null;
      } else {
         return this.l(this.di) ? null : this.ai().a(this.di, ebb.I).orElse(null);
      }
   }

   boolean hi() {
      return this.hh() != null;
   }

   public boolean gT() {
      return this.t(8);
   }

   void x(boolean $$0) {
      if ($$0) {
         this.gI();
      }

      this.d(8, $$0);
   }

   public boolean gU() {
      return this.t(4);
   }

   private void y(boolean $$0) {
      this.d(4, $$0);
   }

   private boolean hj() {
      return this.t(2);
   }

   private void z(boolean $$0) {
      this.d(2, $$0);
   }

   boolean l(jb $$0) {
      return !this.b($$0, 48);
   }

   private void d(int $$0, boolean $$1) {
      if ($$1) {
         this.ay.a(cv, (byte)(this.ay.a(cv) | $$0));
      } else {
         this.ay.a(cv, (byte)(this.ay.a(cv) & ~$$0));
      }
   }

   private boolean t(int $$0) {
      return (this.ay.a(cv) & $$0) != 0;
   }

   public static cbr.a gV() {
      return cmd.gM().a(cbs.t, 10.0).a(cbs.m, 0.6F).a(cbs.w, 0.3F).a(cbs.c, 2.0);
   }

   @Override
   protected cjw b(dmu $$0) {
      cju $$1 = new cju(this, $$0) {
         @Override
         public boolean a(jb $$0) {
            return !this.b.a_($$0.e()).l();
         }

         @Override
         public void d() {
            if (!cme.this.dj.l()) {
               super.d();
            }
         }
      };
      $$1.d(false);
      $$1.a(false);
      $$1.a(48.0F);
      return $$1;
   }

   @Override
   public bxj b(cut $$0, bxi $$1) {
      dcv $$2 = $$0.b($$1);
      if (this.i($$2) && $$2.h() instanceof dbd $$3 && $$3.c() instanceof dtg $$4) {
         byq $$5 = $$4.b();
         if ($$5 != null) {
            this.a($$0, $$1, $$2);
            if (!this.ai().C) {
               this.a($$5);
            }

            return bxj.a;
         }
      }

      return super.b($$0, $$1);
   }

   @Override
   public boolean i(dcv $$0) {
      return $$0.a(azx.aj);
   }

   @Override
   protected void b(jb $$0, eeb $$1) {
   }

   @Override
   protected ayy p() {
      return null;
   }

   @Override
   protected ayy e(byb $$0) {
      return ayz.bP;
   }

   @Override
   protected ayy f_() {
      return ayz.bO;
   }

   @Override
   protected float fk() {
      return 0.4F;
   }

   @Nullable
   public cme b(aub $$0, bzc $$1) {
      return bzv.m.a($$0, bzu.e);
   }

   @Override
   protected void a(double $$0, boolean $$1, eeb $$2, jb $$3) {
   }

   @Override
   public boolean bd() {
      return this.gW() && this.as % cl == 0;
   }

   @Override
   public boolean gW() {
      return !this.aK();
   }

   public void gX() {
      this.x(false);
      this.hf();
   }

   @Override
   public boolean a(aub $$0, byb $$1, float $$2) {
      if (this.a($$0, $$1)) {
         return false;
      } else {
         this.dj.m();
         return super.a($$0, $$1, $$2);
      }
   }

   @Override
   protected void c(bae<fak> $$0) {
      this.i(this.dA().b(0.0, 0.01, 0.0));
   }

   @Override
   public fis F() {
      return new fis(0.0, 0.5F * this.cW(), this.ds() * 0.2F);
   }

   boolean b(jb $$0, int $$1) {
      return $$0.a(this.dx(), $$1);
   }

   public void i(jb $$0) {
      this.di = $$0;
   }

   public static boolean c(eeb $$0) {
      if ($$0.a(azo.aj)) {
         if ($$0.a(eer.I, false)) {
            return false;
         } else {
            return $$0.a(dqb.jf) ? $$0.c(dsi.b) == eex.a : true;
         }
      } else {
         return false;
      }
   }

   abstract class a extends chi {
      public abstract boolean h();

      public abstract boolean i();

      @Override
      public boolean b() {
         return this.h() && !cme.this.ad_();
      }

      @Override
      public boolean c() {
         return this.i() && !cme.this.ad_();
      }
   }

   class b extends chs {
      b(final cau $$0, final double $$1, final boolean $$2) {
         super($$0, $$1, $$2);
      }

      @Override
      public boolean b() {
         return super.b() && cme.this.ad_() && !cme.this.gU();
      }

      @Override
      public boolean c() {
         return super.c() && cme.this.ad_() && !cme.this.gU();
      }
   }

   static class c extends cjb<cut> {
      c(cme $$0) {
         super($$0, cut.class, 10, true, false, $$0::a);
      }

      @Override
      public boolean b() {
         return this.i() && super.b();
      }

      @Override
      public boolean c() {
         boolean $$0 = this.i();
         if ($$0 && this.e.e() != null) {
            return super.c();
         } else {
            this.g = null;
            return false;
         }
      }

      private boolean i() {
         cme $$0 = (cme)this.e;
         return $$0.ad_() && !$$0.gU();
      }
   }

   class d extends cme.a {
      @Override
      public boolean h() {
         if (cme.this.di != null && cme.this.hb() && cme.this.di.a(cme.this.dv(), 2.0)) {
            eaw $$0 = cme.this.hh();
            if ($$0 != null) {
               if (!$$0.d()) {
                  return true;
               }

               cme.this.di = null;
            }
         }

         return false;
      }

      @Override
      public boolean i() {
         return false;
      }

      @Override
      public void d() {
         eaw $$0 = cme.this.hh();
         if ($$0 != null) {
            $$0.a(cme.this);
         }
      }
   }

   @bdl
   public class e extends cme.a {
      public static final int b = 2400;
      int d;
      private static final int e = 3;
      final List<jb> f = Lists.newArrayList();
      @Nullable
      private faz g;
      private static final int h = 60;
      private int i;

      e() {
         this.a(EnumSet.of(chi.a.a));
      }

      @Override
      public boolean h() {
         return cme.this.di != null
            && !cme.this.l(cme.this.di)
            && !cme.this.gv()
            && cme.this.hb()
            && !this.d(cme.this.di)
            && cme.this.ai().a_(cme.this.di).a(azo.aM);
      }

      @Override
      public boolean i() {
         return this.h();
      }

      @Override
      public void d() {
         this.d = 0;
         this.i = 0;
         super.d();
      }

      @Override
      public void e() {
         this.d = 0;
         this.i = 0;
         cme.this.cg.n();
         cme.this.cg.g();
      }

      @Override
      public void a() {
         if (cme.this.di != null) {
            this.d++;
            if (this.d > this.a(2400)) {
               this.l();
            } else if (!cme.this.cg.m()) {
               if (!cme.this.b(cme.this.di, 16)) {
                  if (cme.this.l(cme.this.di)) {
                     cme.this.gZ();
                  } else {
                     cme.this.j(cme.this.di);
                  }
               } else {
                  boolean $$0 = this.a(cme.this.di);
                  if (!$$0) {
                     this.l();
                  } else if (this.g != null && cme.this.cg.j().a(this.g)) {
                     this.i++;
                     if (this.i > 60) {
                        cme.this.gZ();
                        this.i = 0;
                     }
                  } else {
                     this.g = cme.this.cg.j();
                  }
               }
            }
         }
      }

      private boolean a(jb $$0) {
         int $$1 = cme.this.b($$0, 3) ? 1 : 2;
         cme.this.cg.b(10.0F);
         cme.this.cg.a($$0.u(), $$0.v(), $$0.w(), $$1, 1.0);
         return cme.this.cg.j() != null && cme.this.cg.j().j();
      }

      boolean b(jb $$0) {
         return this.f.contains($$0);
      }

      private void c(jb $$0) {
         this.f.add($$0);

         while (this.f.size() > 3) {
            this.f.remove(0);
         }
      }

      void k() {
         this.f.clear();
      }

      private void l() {
         if (cme.this.di != null) {
            this.c(cme.this.di);
         }

         cme.this.gZ();
      }

      private boolean d(jb $$0) {
         if (cme.this.b($$0, 2)) {
            return true;
         } else {
            faz $$1 = cme.this.cg.j();
            return $$1 != null && $$1.l().equals($$0) && $$1.j() && $$1.c();
         }
      }
   }

   public class f extends cme.a {
      private static final int c = 2400;
      int d;

      f() {
         this.a(EnumSet.of(chi.a.a));
      }

      @Override
      public boolean h() {
         return cme.this.dh != null && !cme.this.gv() && this.k() && !cme.this.b(cme.this.dh, 2);
      }

      @Override
      public boolean i() {
         return this.h();
      }

      @Override
      public void d() {
         this.d = 0;
         super.d();
      }

      @Override
      public void e() {
         this.d = 0;
         cme.this.cg.n();
         cme.this.cg.g();
      }

      @Override
      public void a() {
         if (cme.this.dh != null) {
            this.d++;
            if (this.d > this.a(2400)) {
               cme.this.ha();
            } else if (!cme.this.cg.m()) {
               if (cme.this.l(cme.this.dh)) {
                  cme.this.ha();
               } else {
                  cme.this.j(cme.this.dh);
               }
            }
         }
      }

      private boolean k() {
         return cme.this.cY > 600;
      }
   }

   class g extends cme.a {
      static final int b = 30;

      @Override
      public boolean h() {
         if (cme.this.he() >= 10) {
            return false;
         } else {
            return cme.this.ar.i() < 0.3F ? false : cme.this.gT() && cme.this.hi();
         }
      }

      @Override
      public boolean i() {
         return this.h();
      }

      @Override
      public void a() {
         if (cme.this.ar.a(this.a(30)) == 0) {
            for (int $$0 = 1; $$0 <= 2; $$0++) {
               jb $$1 = cme.this.dx().c($$0);
               eeb $$2 = cme.this.ai().a_($$1);
               dpz $$3 = $$2.b();
               eeb $$4 = null;
               if ($$2.a(azo.aO)) {
                  if ($$3 instanceof drw $$5) {
                     if (!$$5.i($$2)) {
                        $$4 = $$5.b($$5.h($$2) + 1);
                     }
                  } else if ($$3 instanceof dyg) {
                     int $$6 = $$2.c(dyg.c);
                     if ($$6 < 7) {
                        $$4 = $$2.b(dyg.c, $$6 + 1);
                     }
                  } else if ($$2.a(dqb.oP)) {
                     int $$7 = $$2.c(dyn.c);
                     if ($$7 < 3) {
                        $$4 = $$2.b(dyn.c, $$7 + 1);
                     }
                  } else if ($$2.a(dqb.te) || $$2.a(dqb.tf)) {
                     dqc $$8 = (dqc)$$2.b();
                     if ($$8.a((dmx)cme.this.ai(), $$1, $$2)) {
                        $$8.a((aub)cme.this.ai(), cme.this.ar, $$1, $$2);
                        $$4 = cme.this.ai().a_($$1);
                     }
                  }

                  if ($$4 != null) {
                     cme.this.ai().c(2011, $$1, 15);
                     cme.this.ai().c($$1, $$4);
                     cme.this.hg();
                  }
               }
            }
         }
      }
   }

   class h extends cja {
      h(final cme $$0) {
         super($$0);
      }

      @Override
      public boolean c() {
         return cme.this.ad_() && super.c();
      }

      @Override
      protected void a(cao $$0, cam $$1) {
         if ($$0 instanceof cme && this.e.F($$1)) {
            $$0.g($$1);
         }
      }
   }

   class i extends cme.a {
      @Override
      public boolean h() {
         return cme.this.dc == 0 && !cme.this.gJ() && cme.this.hb();
      }

      @Override
      public boolean i() {
         return false;
      }

      @Override
      public void d() {
         cme.this.dc = 200;
         List<jb> $$0 = this.k();
         if (!$$0.isEmpty()) {
            for (jb $$1 : $$0) {
               if (!cme.this.dk.b($$1)) {
                  cme.this.di = $$1;
                  return;
               }
            }

            cme.this.dk.k();
            cme.this.di = $$0.get(0);
         }
      }

      private List<jb> k() {
         jb $$0 = cme.this.dx();
         clp $$1 = ((aub)cme.this.ai()).B();
         Stream<clq> $$2 = $$1.c($$0x -> $$0x.a(azz.c), $$0, 20, clp.b.c);
         return $$2.map(clq::g).filter(cme.this::k).sorted(Comparator.comparingDouble($$1x -> $$1x.j($$0))).collect(Collectors.toList());
      }
   }

   class j extends cgk {
      j(final cao $$0) {
         super($$0);
      }

      @Override
      public void a() {
         if (!cme.this.ad_()) {
            super.a();
         }
      }

      @Override
      protected boolean c() {
         return !cme.this.dj.l();
      }
   }

   class k extends cme.a {
      private static final int c = 400;
      private static final double d = 0.1;
      private static final int e = 25;
      private static final float f = 0.35F;
      private static final float g = 0.6F;
      private static final float h = 0.33333334F;
      private static final int i = 5;
      private int j;
      private int k;
      private boolean l;
      @Nullable
      private fis m;
      private int n;
      private static final int o = 600;
      private Long2LongOpenHashMap p = new Long2LongOpenHashMap();

      k() {
         this.a(EnumSet.of(chi.a.a));
      }

      @Override
      public boolean h() {
         if (cme.this.dg > 0) {
            return false;
         } else if (cme.this.gT()) {
            return false;
         } else if (cme.this.ai().ah()) {
            return false;
         } else {
            Optional<jb> $$0 = this.p();
            if ($$0.isPresent()) {
               cme.this.dh = $$0.get();
               cme.this.cg.a(cme.this.dh.u() + 0.5, cme.this.dh.v() + 0.5, cme.this.dh.w() + 0.5, 1.2F);
               return true;
            } else {
               cme.this.dg = bcb.a(cme.this.ar, 20, 60);
               return false;
            }
         }
      }

      @Override
      public boolean i() {
         if (!this.l) {
            return false;
         } else if (!cme.this.n()) {
            return false;
         } else if (cme.this.ai().ah()) {
            return false;
         } else {
            return this.k() ? cme.this.ar.i() < 0.2F : true;
         }
      }

      private boolean k() {
         return this.j > 400;
      }

      boolean l() {
         return this.l;
      }

      void m() {
         this.l = false;
      }

      @Override
      public void d() {
         this.j = 0;
         this.n = 0;
         this.k = 0;
         this.l = true;
         cme.this.gI();
      }

      @Override
      public void e() {
         if (this.k()) {
            cme.this.x(true);
         }

         this.l = false;
         cme.this.cg.n();
         cme.this.dg = 200;
      }

      @Override
      public boolean X_() {
         return true;
      }

      @Override
      public void a() {
         if (cme.this.n()) {
            this.n++;
            if (this.n > 600) {
               cme.this.ha();
               this.l = false;
               cme.this.dg = 200;
            } else {
               fis $$0 = fis.c(cme.this.dh).b(0.0, 0.6F, 0.0);
               if ($$0.f(cme.this.dv()) > 1.0) {
                  this.m = $$0;
                  this.n();
               } else {
                  if (this.m == null) {
                     this.m = $$0;
                  }

                  boolean $$1 = cme.this.dv().f(this.m) <= 0.1;
                  boolean $$2 = true;
                  if (!$$1 && this.n > 600) {
                     cme.this.ha();
                  } else {
                     if ($$1) {
                        boolean $$3 = cme.this.ar.a(25) == 0;
                        if ($$3) {
                           this.m = new fis($$0.a() + this.o(), $$0.b(), $$0.c() + this.o());
                           cme.this.cg.n();
                        } else {
                           $$2 = false;
                        }

                        cme.this.P().a($$0.a(), $$0.b(), $$0.c());
                     }

                     if ($$2) {
                        this.n();
                     }

                     this.j++;
                     if (cme.this.ar.i() < 0.05F && this.j > this.k + 60) {
                        this.k = this.j;
                        cme.this.a(ayz.bT, 1.0F, 1.0F);
                     }
                  }
               }
            }
         }
      }

      private void n() {
         cme.this.Q().a(this.m.a(), this.m.b(), this.m.c(), 0.35F);
      }

      private float o() {
         return (cme.this.ar.i() * 2.0F - 1.0F) * 0.33333334F;
      }

      private Optional<jb> p() {
         Iterable<jb> $$0 = jb.a(cme.this.dx(), 5, 5, 5);
         Long2LongOpenHashMap $$1 = new Long2LongOpenHashMap();

         for (jb $$2 : $$0) {
            long $$3 = this.p.getOrDefault($$2.a(), Long.MIN_VALUE);
            if (cme.this.ai().ae() < $$3) {
               $$1.put($$2.a(), $$3);
            } else if (cme.c(cme.this.ai().a_($$2))) {
               faz $$4 = cme.this.cg.a($$2, 1);
               if ($$4 != null && $$4.j()) {
                  return Optional.of($$2);
               }

               $$1.put($$2.a(), cme.this.ai().ae() + 600L);
            }
         }

         this.p = $$1;
         return Optional.empty();
      }
   }

   class l extends chi {
      l() {
         this.a(EnumSet.of(chi.a.a));
      }

      @Override
      public boolean b() {
         return cme.this.cg.l() && cme.this.ar.a(10) == 0;
      }

      @Override
      public boolean c() {
         return cme.this.cg.m();
      }

      @Override
      public void d() {
         fis $$0 = this.h();
         if ($$0 != null) {
            cme.this.cg.a(cme.this.cg.a(jb.a((jv)$$0), 1), 1.0);
         }
      }

      @Nullable
      private fis h() {
         fis $$1;
         if (cme.this.hi() && !cme.this.b(cme.this.di, this.i())) {
            fis $$0 = fis.b(cme.this.di);
            $$1 = $$0.d(cme.this.dv()).d();
         } else {
            $$1 = cme.this.h(0.0F);
         }

         int $$3 = 8;
         fis $$4 = cli.a(cme.this, 8, 7, $$1.d, $$1.f, (float) (Math.PI / 2), 3, 1);
         return $$4 != null ? $$4 : cle.a(cme.this, 8, 4, -2, $$1.d, $$1.f, (float) (Math.PI / 2));
      }

      private int i() {
         int $$0 = !cme.this.gJ() && !cme.this.n() ? 16 : 24;
         return 48 - $$0;
      }
   }

   class m extends cme.a {
      private final int c = bcb.a(cme.this.ar, 20, 40);
      private long d = -1L;

      @Override
      public void d() {
         if (cme.this.dh != null && cme.this.ai().p(cme.this.dh) && !this.a(cme.this.dh)) {
            cme.this.ha();
         }

         this.d = cme.this.ai().ae();
      }

      @Override
      public boolean h() {
         return cme.this.ai().ae() > this.d + this.c;
      }

      @Override
      public boolean i() {
         return false;
      }

      private boolean a(jb $$0) {
         return cme.c(cme.this.ai().a_($$0));
      }
   }

   class n extends cme.a {
      private final int c = bcb.a(cme.this.ar, 20, 40);
      private long d = -1L;

      @Override
      public void d() {
         if (cme.this.di != null && cme.this.ai().p(cme.this.di) && !cme.this.hi()) {
            cme.this.gZ();
         }

         this.d = cme.this.ai().ae();
      }

      @Override
      public boolean h() {
         return cme.this.ai().ae() > this.d + this.c;
      }

      @Override
      public boolean i() {
         return false;
      }
   }
}
