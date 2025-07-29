import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.Maps;
import it.unimi.dsi.fastutil.objects.Object2IntMap.Entry;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public abstract class cao extends cam implements bzz, cak, cbj {
   private static final alh<Byte> a = all.a(cao.class, alj.a);
   private static final int b = 1;
   private static final int c = 2;
   private static final int d = 4;
   protected static final int bQ = 1;
   private static final kg e = new kg(1, 0, 1);
   private static final List<bzw> cj = List.of(bzw.f, bzw.e, bzw.d, bzw.c);
   public static final float bR = 0.15F;
   public static final float bS = 0.55F;
   public static final float bT = 0.5F;
   public static final float bU = 0.25F;
   public static final int bV = 2;
   private static final double ck = Math.sqrt(2.04F) - 0.6F;
   private static final boolean cl = false;
   private static final boolean cm = false;
   private static final boolean cn = false;
   private static final boolean co = false;
   protected static final ame bW = ame.b("random_spawn_bonus");
   public static final String bX = "drop_chances";
   public static final String bY = "LeftHanded";
   public static final String bZ = "CanPickUpLoot";
   public static final String ca = "NoAI";
   public int cb;
   protected int cc;
   protected cgk cd;
   protected cgl ce;
   protected cgj cf;
   private final cgg cp;
   protected cjw cg;
   protected final chj ch;
   protected final chj ci;
   @Nullable
   private cam cq;
   private final cku cr;
   private bzk cs = bzk.d;
   private boolean ct = false;
   private boolean cu = false;
   private final Map<fbc, Float> cv = Maps.newEnumMap(fbc.class);
   private Optional<amd<fdo>> cw = Optional.empty();
   private long cx;
   @Nullable
   private cak.a cy;
   private jb cz = jb.c;
   private int cA = -1;

   protected cao(bzv<? extends cao> $$0, dmu $$1) {
      super($$0, $$1);
      this.ch = new chj();
      this.ci = new chj();
      this.cd = new cgk(this);
      this.ce = new cgl(this);
      this.cf = new cgj(this);
      this.cp = this.O();
      this.cg = this.b($$1);
      this.cr = new cku(this);
      if ($$1 instanceof aub) {
         this.H();
      }
   }

   @Override
   protected void H() {
   }

   public static cbr.a I() {
      return cam.ej().a(cbs.n, 16.0);
   }

   protected cjw b(dmu $$0) {
      return new cjv(this, $$0);
   }

   protected boolean J() {
      return false;
   }

   public float a(fbc $$0) {
      cao $$2;
      if (this.dn() instanceof cao $$1 && $$1.J()) {
         $$2 = $$1;
      } else {
         $$2 = this;
      }

      Float $$4 = $$2.cv.get($$0);
      return $$4 == null ? $$0.a() : $$4;
   }

   public void a(fbc $$0, float $$1) {
      this.cv.put($$0, $$1);
   }

   @Override
   public void L() {
   }

   @Override
   public void N() {
   }

   protected cgg O() {
      return new cgg(this);
   }

   public cgk P() {
      return this.cd;
   }

   public cgl Q() {
      return this.dn() instanceof cao $$0 ? $$0.Q() : this.ce;
   }

   public cgj R() {
      return this.cf;
   }

   public cjw S() {
      return this.dn() instanceof cao $$0 ? $$0.S() : this.cg;
   }

   @Nullable
   @Override
   public cam cY() {
      bzm $$0 = this.db();
      return !this.gw() && $$0 instanceof cao $$1 && $$0.cf() ? $$1 : null;
   }

   public cku T() {
      return this.cr;
   }

   @Nullable
   @Override
   public cam e() {
      return this.cq;
   }

   @Nullable
   protected final cam U() {
      return this.eh().c(cjo.p).orElse(null);
   }

   public void g(@Nullable cam $$0) {
      this.cq = $$0;
   }

   @Override
   public boolean a(bzv<?> $$0) {
      return $$0 != bzv.ae;
   }

   public boolean a(ddq $$0) {
      return false;
   }

   public void V() {
      this.c(ejb.m);
   }

   @Override
   protected void a(all.a $$0) {
      super.a($$0);
      $$0.a(a, (byte)0);
   }

   public int W() {
      return 80;
   }

   public void X() {
      this.b(this.p());
   }

   @Override
   public void az() {
      super.az();
      btt $$0 = bts.a();
      $$0.a("mobBaseTick");
      if (this.bO() && this.ar.a(1000) < this.cb++) {
         this.l();
         this.X();
      }

      $$0.c();
   }

   @Override
   protected void h(byb $$0) {
      this.l();
      super.h($$0);
   }

   private void l() {
      this.cb = -this.W();
   }

   @Override
   protected int e(aub $$0) {
      if (this.cc > 0) {
         int $$1 = this.cc;

         for (bzw $$2 : bzw.j) {
            if ($$2.g()) {
               dcv $$3 = this.a($$2);
               if (!$$3.f() && this.cs.b($$2) <= 1.0F) {
                  $$1 += 1 + this.ar.a(3);
               }
            }
         }

         return $$1;
      } else {
         return this.cc;
      }
   }

   public void Y() {
      if (this.ai().C) {
         this.fe();
      } else {
         this.ai().a(this, (byte)20);
      }
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 20) {
         this.Y();
      } else {
         super.b($$0);
      }
   }

   @Override
   public void g() {
      super.g();
      if (!this.ai().C && this.as % 5 == 0) {
         this.Z();
      }
   }

   protected void Z() {
      boolean $$0 = !(this.cY() instanceof cao);
      boolean $$1 = !(this.dm() instanceof cxe);
      this.ch.a(chi.a.a, $$0);
      this.ch.a(chi.a.c, $$0 && $$1);
      this.ch.a(chi.a.b, $$0);
   }

   @Override
   protected void C(float $$0) {
      this.cp.a();
   }

   @Nullable
   protected ayy p() {
      return null;
   }

   @Override
   protected void a(fdc $$0) {
      super.a($$0);
      $$0.a("CanPickUpLoot", this.fU());
      $$0.a("PersistenceRequired", this.cu);
      if (!this.cs.equals(bzk.d)) {
         $$0.a("drop_chances", bzk.e, this.cs);
      }

      this.a($$0, this.cy);
      if (this.gv()) {
         $$0.a("home_radius", this.cA);
         $$0.a("home_pos", jb.a, this.cz);
      }

      $$0.a("LeftHanded", this.gx());
      this.cw.ifPresent($$1 -> $$0.a("DeathLootTable", fdo.a, $$1));
      if (this.cx != 0L) {
         $$0.a("DeathLootTableSeed", this.cx);
      }

      if (this.gw()) {
         $$0.a("NoAI", this.gw());
      }
   }

   @Override
   protected void a(fda $$0) {
      super.a($$0);
      this.a_($$0.a("CanPickUpLoot", false));
      this.cu = $$0.a("PersistenceRequired", false);
      this.cs = $$0.<bzk>a("drop_chances", bzk.e).orElse(bzk.d);
      this.b($$0);
      this.cA = $$0.a("home_radius", -1);
      if (this.cA >= 0) {
         this.cz = $$0.<jb>a("home_pos", jb.a).orElse(jb.c);
      }

      this.v($$0.a("LeftHanded", false));
      this.cw = $$0.a("DeathLootTable", fdo.a);
      this.cx = $$0.a("DeathLootTableSeed", 0L);
      this.u($$0.a("NoAI", false));
   }

   @Override
   protected void b(aub $$0, byb $$1, boolean $$2) {
      super.b($$0, $$1, $$2);
      this.cw = Optional.empty();
   }

   @Override
   public final Optional<amd<fdo>> ee() {
      return this.cw.isPresent() ? this.cw : super.ee();
   }

   @Override
   public long eO() {
      return this.cx;
   }

   public void G(float $$0) {
      this.bE = $$0;
   }

   public void H(float $$0) {
      this.bD = $$0;
   }

   public void I(float $$0) {
      this.bC = $$0;
   }

   @Override
   public void B(float $$0) {
      super.B($$0);
      this.G($$0);
   }

   public void aa() {
      this.S().n();
      this.I(0.0F);
      this.H(0.0F);
      this.B(0.0F);
      this.n(0.0, 0.0, 0.0);
      this.gD();
   }

   @Override
   public void e_() {
      super.e_();
      btt $$0 = bts.a();
      $$0.a("looting");
      if (this.ai() instanceof aub $$1 && this.fU() && this.bO() && !this.by && $$1.P().c(dmq.d)) {
         kg $$2 = this.ac();

         for (cqz $$4 : this.ai().a(cqz.class, this.cV().c($$2.u(), $$2.v(), $$2.w()))) {
            if (!$$4.dU() && !$$4.e().f() && !$$4.n() && this.c($$1, $$4.e())) {
               this.a($$1, $$4);
            }
         }
      }

      $$0.c();
   }

   protected kg ac() {
      return e;
   }

   protected void a(aub $$0, cqz $$1) {
      dcv $$2 = $$1.e();
      dcv $$3 = this.b($$0, $$2.v());
      if (!$$3.f()) {
         this.a($$1);
         this.a($$1, $$3.M());
         $$2.h($$3.M());
         if ($$2.f()) {
            $$1.at();
         }
      }
   }

   public dcv b(aub $$0, dcv $$1) {
      bzw $$2 = this.f($$1);
      if (!this.a($$1, $$2)) {
         return dcv.l;
      } else {
         dcv $$3 = this.a($$2);
         boolean $$4 = this.a($$1, $$3, $$2);
         if ($$2.f() && !$$4) {
            $$2 = bzw.a;
            $$3 = this.a($$2);
            $$4 = $$3.f();
         }

         if ($$4 && this.g($$1)) {
            double $$5 = this.cs.b($$2);
            if (!$$3.f() && Math.max(this.ar.i() - 0.1F, 0.0F) < $$5) {
               this.a($$0, $$3);
            }

            dcv $$6 = $$2.a($$1);
            this.b($$2, $$6);
            return $$6;
         } else {
            return dcv.l;
         }
      }
   }

   protected void b(bzw $$0, dcv $$1) {
      this.a($$0, $$1);
      this.g($$0);
      this.cu = true;
   }

   protected boolean a(cut $$0) {
      return !this.cd();
   }

   public void g(bzw $$0) {
      this.cs = this.cs.a($$0);
   }

   protected boolean a(dcv $$0, dcv $$1, bzw $$2) {
      if ($$1.f()) {
         return true;
      } else if ($$2.f()) {
         return this.b($$0, $$1, $$2);
      } else {
         return $$2 == bzw.a ? this.c($$0, $$1, $$2) : false;
      }
   }

   private boolean b(dcv $$0, dcv $$1, bzw $$2) {
      if (djk.a($$1, djj.E)) {
         return false;
      } else {
         double $$3 = this.a($$0, cbs.a, $$2);
         double $$4 = this.a($$1, cbs.a, $$2);
         double $$5 = this.a($$0, cbs.b, $$2);
         double $$6 = this.a($$1, cbs.b, $$2);
         if ($$3 != $$4) {
            return $$3 > $$4;
         } else {
            return $$5 != $$6 ? $$5 > $$6 : this.b($$0, $$1);
         }
      }
   }

   private boolean c(dcv $$0, dcv $$1, bzw $$2) {
      bae<dcr> $$3 = this.ad();
      if ($$3 != null) {
         if ($$1.a($$3) && !$$0.a($$3)) {
            return false;
         }

         if (!$$1.a($$3) && $$0.a($$3)) {
            return true;
         }
      }

      double $$4 = this.a($$0, cbs.c, $$2);
      double $$5 = this.a($$1, cbs.c, $$2);
      return $$4 != $$5 ? $$4 > $$5 : this.b($$0, $$1);
   }

   private double a(dcv $$0, jl<cbn> $$1, bzw $$2) {
      double $$3 = this.fg().b($$1) ? this.j($$1) : 0.0;
      dfm $$4 = $$0.a(kq.o, dfm.a);
      return $$4.a($$3, $$2);
   }

   public boolean b(dcv $$0, dcv $$1) {
      Set<Entry<jl<dji>>> $$2 = $$1.a(kq.l, djo.a).b();
      Set<Entry<jl<dji>>> $$3 = $$0.a(kq.l, djo.a).b();
      if ($$3.size() != $$2.size()) {
         return $$3.size() > $$2.size();
      } else {
         int $$4 = $$0.o();
         int $$5 = $$1.o();
         return $$4 != $$5 ? $$4 < $$5 : $$0.c(kq.g) && !$$1.c(kq.g);
      }
   }

   public boolean g(dcv $$0) {
      return true;
   }

   public boolean c(aub $$0, dcv $$1) {
      return this.g($$1);
   }

   @Nullable
   public bae<dcr> ad() {
      return null;
   }

   public boolean h(double $$0) {
      return true;
   }

   public boolean af() {
      return this.cc();
   }

   protected boolean ag() {
      return false;
   }

   @Override
   public void dJ() {
      if (this.ai().an() == bxg.a && this.ag()) {
         this.at();
      } else if (!this.gq() && !this.af()) {
         bzm $$0 = this.ai().a(this, -1.0);
         if ($$0 != null) {
            double $$1 = $$0.g(this);
            int $$2 = this.ap().f().f();
            int $$3 = $$2 * $$2;
            if ($$1 > $$3 && this.h($$1)) {
               this.at();
            }

            int $$4 = this.ap().f().g();
            int $$5 = $$4 * $$4;
            if (this.bz > 600 && this.ar.a(800) == 0 && $$1 > $$5 && this.h($$1)) {
               this.at();
            } else if ($$1 < $$5) {
               this.bz = 0;
            }
         }
      } else {
         this.bz = 0;
      }
   }

   @Override
   protected final void fB() {
      this.bz++;
      btt $$0 = bts.a();
      $$0.a("sensing");
      this.cr.a();
      $$0.c();
      int $$1 = this.as + this.ar();
      if ($$1 % 2 != 0 && this.as > 1) {
         $$0.a("targetSelector");
         this.ci.a(false);
         $$0.c();
         $$0.a("goalSelector");
         this.ch.a(false);
         $$0.c();
      } else {
         $$0.a("targetSelector");
         this.ci.a();
         $$0.c();
         $$0.a("goalSelector");
         this.ch.a();
         $$0.c();
      }

      $$0.a("navigation");
      this.cg.d();
      $$0.c();
      $$0.a("mob tick");
      this.a((aub)this.ai());
      $$0.c();
      $$0.a("controls");
      $$0.a("move");
      this.ce.a();
      $$0.b("look");
      this.cd.a();
      $$0.b("jump");
      this.cf.b();
      $$0.c();
      $$0.c();
      this.ah();
   }

   protected void ah() {
      ahj.a(this.ai(), this, this.ch);
   }

   protected void a(aub $$0) {
   }

   public int gg() {
      return 40;
   }

   public int gh() {
      return 75;
   }

   protected void gi() {
      float $$0 = this.gh();
      float $$1 = this.cE();
      float $$2 = bcb.h(this.br - $$1);
      float $$3 = bcb.a(bcb.h(this.br - $$1), -$$0, $$0);
      float $$4 = $$1 + $$2 - $$3;
      this.r($$4);
   }

   public int gj() {
      return 10;
   }

   public void a(bzm $$0, float $$1, float $$2) {
      double $$3 = $$0.dC() - this.dC();
      double $$4 = $$0.dI() - this.dI();
      double $$6;
      if ($$0 instanceof cam $$5) {
         $$6 = $$5.dG() - this.dG();
      } else {
         $$6 = ($$0.cV().b + $$0.cV().e) / 2.0 - this.dG();
      }

      double $$8 = Math.sqrt($$3 * $$3 + $$4 * $$4);
      float $$9 = (float)(bcb.d($$4, $$3) * 180.0F / (float)Math.PI) - 90.0F;
      float $$10 = (float)(-(bcb.d($$6, $$8) * 180.0F / (float)Math.PI));
      this.w(this.a(this.dR(), $$10, $$2));
      this.v(this.a(this.dP(), $$9, $$1));
   }

   private float a(float $$0, float $$1, float $$2) {
      float $$3 = bcb.h($$1 - $$0);
      if ($$3 > $$2) {
         $$3 = $$2;
      }

      if ($$3 < -$$2) {
         $$3 = -$$2;
      }

      return $$0 + $$3;
   }

   public static boolean a(bzv<? extends cao> $$0, dmv $$1, bzu $$2, jb $$3, bck $$4) {
      jb $$5 = $$3.e();
      return bzu.a($$2) || $$1.a_($$5).a($$1, $$5, $$0);
   }

   public boolean a(dmv $$0, bzu $$1) {
      return true;
   }

   public boolean a(dmx $$0) {
      return !$$0.d(this.cV()) && $$0.f(this);
   }

   public int gk() {
      return 4;
   }

   public boolean q(int $$0) {
      return false;
   }

   @Override
   public int cI() {
      if (this.e() == null) {
         return this.y(0.0F);
      } else {
         int $$0 = (int)(this.eL() - this.fa() * 0.33F);
         $$0 -= (3 - this.ai().an().a()) * 4;
         if ($$0 < 0) {
            $$0 = 0;
         }

         return this.y($$0);
      }
   }

   public dcv gl() {
      return this.a(bzw.g);
   }

   public boolean gm() {
      return this.i(bzw.h);
   }

   public boolean gn() {
      return this.i(bzw.g);
   }

   private boolean i(bzw $$0) {
      return this.d($$0) && this.a(this.a($$0), $$0);
   }

   public void h(dcv $$0) {
      this.b(bzw.g, $$0);
   }

   public bxc h(final bzw $$0) {
      return new fke() {
         @Override
         public dcv f() {
            return cao.this.a($$0);
         }

         @Override
         public void b(dcv $$0x) {
            cao.this.a($$0, $$0);
            if (!$$0.f()) {
               cao.this.g($$0);
               cao.this.gp();
            }
         }

         @Override
         public void e() {
         }

         @Override
         public boolean a(cut $$0x) {
            return $$0.dm() == cao.this || $$0.b(cao.this, 4.0);
         }
      };
   }

   @Override
   protected void a(aub $$0, byb $$1, boolean $$2) {
      super.a($$0, $$1, $$2);

      for (bzw $$3 : bzw.j) {
         dcv $$4 = this.a($$3);
         float $$5 = this.cs.b($$3);
         if ($$5 != 0.0F) {
            boolean $$6 = this.cs.c($$3);
            if ($$1.d() instanceof cam $$7 && this.ai() instanceof aub $$8) {
               $$5 = djk.a($$8, $$7, $$1, $$5);
            }

            if (!$$4.f() && !djk.a($$4, djj.D) && ($$2 || $$6) && this.ar.i() < $$5) {
               if (!$$6 && $$4.m()) {
                  $$4.b($$4.p() - this.ar.a(1 + this.ar.a(Math.max($$4.p() - 3, 1))));
               }

               this.a($$0, $$4);
               this.a($$3, dcv.l);
            }
         }
      }
   }

   public bzk go() {
      return this.cs;
   }

   public void b(aub $$0) {
      this.a($$0, $$0x -> true);
   }

   public Set<bzw> a(aub $$0, Predicate<dcv> $$1) {
      Set<bzw> $$2 = new HashSet<>();

      for (bzw $$3 : bzw.j) {
         dcv $$4 = this.a($$3);
         if (!$$4.f()) {
            if (!$$1.test($$4)) {
               $$2.add($$3);
            } else if (this.cs.c($$3)) {
               this.a($$3, dcv.l);
               this.a($$0, $$4);
            }
         }
      }

      return $$2;
   }

   private fdm g(aub $$0) {
      return new fdm.a($$0).a(fgd.f, this.dv()).a(fgd.a, this).a(fgc.h);
   }

   public void a(bzy $$0) {
      this.a($$0.a(), $$0.b());
   }

   public void a(amd<fdo> $$0, Map<bzw, Float> $$1) {
      if (this.ai() instanceof aub $$2) {
         this.a($$0, this.g($$2), $$1);
      }
   }

   protected void a(bck $$0, bxh $$1) {
      if ($$0.i() < 0.15F * $$1.d()) {
         int $$2 = $$0.a(2);
         float $$3 = this.ai().an() == bxg.d ? 0.1F : 0.25F;
         if ($$0.i() < 0.095F) {
            $$2++;
         }

         if ($$0.i() < 0.095F) {
            $$2++;
         }

         if ($$0.i() < 0.095F) {
            $$2++;
         }

         boolean $$4 = true;

         for (bzw $$5 : cj) {
            dcv $$6 = this.a($$5);
            if (!$$4 && $$0.i() < $$3) {
               break;
            }

            $$4 = false;
            if ($$6.f()) {
               dcr $$7 = a($$5, $$2);
               if ($$7 != null) {
                  this.a($$5, new dcv($$7));
               }
            }
         }
      }
   }

   @Nullable
   public static dcr a(bzw $$0, int $$1) {
      switch ($$0) {
         case f:
            if ($$1 == 0) {
               return dcz.qD;
            } else if ($$1 == 1) {
               return dcz.qT;
            } else if ($$1 == 2) {
               return dcz.qH;
            } else if ($$1 == 3) {
               return dcz.qL;
            } else if ($$1 == 4) {
               return dcz.qP;
            }
         case e:
            if ($$1 == 0) {
               return dcz.qE;
            } else if ($$1 == 1) {
               return dcz.qU;
            } else if ($$1 == 2) {
               return dcz.qI;
            } else if ($$1 == 3) {
               return dcz.qM;
            } else if ($$1 == 4) {
               return dcz.qQ;
            }
         case d:
            if ($$1 == 0) {
               return dcz.qF;
            } else if ($$1 == 1) {
               return dcz.qV;
            } else if ($$1 == 2) {
               return dcz.qJ;
            } else if ($$1 == 3) {
               return dcz.qN;
            } else if ($$1 == 4) {
               return dcz.qR;
            }
         case c:
            if ($$1 == 0) {
               return dcz.qG;
            } else if ($$1 == 1) {
               return dcz.qW;
            } else if ($$1 == 2) {
               return dcz.qK;
            } else if ($$1 == 3) {
               return dcz.qO;
            } else if ($$1 == 4) {
               return dcz.qS;
            }
         default:
            return null;
      }
   }

   protected void a(dnl $$0, bck $$1, bxh $$2) {
      this.b($$0, $$1, $$2);

      for (bzw $$3 : bzw.j) {
         if ($$3.a() == bzw.a.b) {
            this.a($$0, $$1, $$3, $$2);
         }
      }
   }

   protected void b(dnl $$0, bck $$1, bxh $$2) {
      this.a($$0, bzw.a, $$1, 0.25F, $$2);
   }

   protected void a(dnl $$0, bck $$1, bzw $$2, bxh $$3) {
      this.a($$0, $$2, $$1, 0.5F, $$3);
   }

   private void a(dnl $$0, bzw $$1, bck $$2, float $$3, bxh $$4) {
      dcv $$5 = this.a($$1);
      if (!$$5.f() && $$2.i() < $$3 * $$4.d()) {
         djk.a($$5, $$0.K_(), dkw.a, $$4, $$2);
         this.a($$1, $$5);
      }
   }

   @Nullable
   public cbe a(dnl $$0, bxh $$1, bzu $$2, @Nullable cbe $$3) {
      bck $$4 = $$0.H_();
      cbo $$5 = Objects.requireNonNull(this.h(cbs.n));
      if (!$$5.b(bW)) {
         $$5.d(new cbq(bW, $$4.a(0.0, 0.11485000000000001), cbq.a.b));
      }

      this.v($$4.i() < 0.05F);
      return $$3;
   }

   public void gp() {
      this.cu = true;
   }

   @Override
   public void a(bzw $$0, float $$1) {
      this.cs = this.cs.a($$0, $$1);
   }

   @Override
   public boolean fU() {
      return this.ct;
   }

   public void a_(boolean $$0) {
      this.ct = $$0;
   }

   @Override
   protected boolean f(bzw $$0) {
      return this.fU();
   }

   public boolean gq() {
      return this.cu;
   }

   @Override
   public final bxj a(cut $$0, bxi $$1) {
      if (!this.bO()) {
         return bxj.e;
      } else {
         bxj $$2 = this.c($$0, $$1);
         if ($$2.a()) {
            this.a(ejb.r, $$0);
            return $$2;
         } else {
            bxj $$3 = super.a($$0, $$1);
            if ($$3 != bxj.e) {
               return $$3;
            } else {
               $$2 = this.b($$0, $$1);
               if ($$2.a()) {
                  this.a(ejb.r, $$0);
                  return $$2;
               } else {
                  return bxj.e;
               }
            }
         }
      }
   }

   private bxj c(cut $$0, bxi $$1) {
      dcv $$2 = $$0.b($$1);
      if ($$2.a(dcz.wo)) {
         bxj $$3 = $$2.a($$0, this, $$1);
         if ($$3.a()) {
            return $$3;
         }
      }

      if ($$2.h() instanceof dec) {
         if (this.ai() instanceof aub) {
            dec $$4 = (dec)$$2.h();
            Optional<cao> $$5 = $$4.a($$0, this, (bzv<? extends cao>)this.ap(), (aub)this.ai(), this.dv(), $$2);
            $$5.ifPresent($$1x -> this.a($$0, $$1x));
            if ($$5.isEmpty()) {
               return bxj.e;
            }
         }

         return bxj.b;
      } else {
         return bxj.e;
      }
   }

   protected void a(cut $$0, cao $$1) {
   }

   protected bxj b(cut $$0, bxi $$1) {
      return bxj.e;
   }

   public boolean gr() {
      return this.a(this.dx());
   }

   public boolean a(jb $$0) {
      return this.cA == -1 ? true : this.cz.j($$0) < this.cA * this.cA;
   }

   public boolean a(fis $$0) {
      return this.cA == -1 ? true : this.cz.b($$0) < this.cA * this.cA;
   }

   public void a(jb $$0, int $$1) {
      this.cz = $$0;
      this.cA = $$1;
   }

   public jb gs() {
      return this.cz;
   }

   public int gt() {
      return this.cA;
   }

   public void gu() {
      this.cA = -1;
   }

   public boolean gv() {
      return this.cA != -1;
   }

   @Nullable
   public <T extends cao> T a(bzv<T> $$0, bzg $$1, bzu $$2, bzg.a<T> $$3) {
      if (this.dU()) {
         return null;
      } else {
         T $$4 = (T)$$0.a(this.ai(), $$2);
         if ($$4 == null) {
            return null;
         } else {
            $$1.a().a(this, $$4, $$1);
            $$3.finalizeConversion($$4);
            if (this.ai() instanceof aub $$5) {
               $$5.b($$4);
            }

            if ($$1.a().a()) {
               this.at();
            }

            return $$4;
         }
      }
   }

   @Nullable
   public <T extends cao> T a(bzv<T> $$0, bzg $$1, bzg.a<T> $$2) {
      return this.a($$0, $$1, bzu.i, $$2);
   }

   @Nullable
   @Override
   public cak.a T_() {
      return this.cy;
   }

   private void gD() {
      if (this.cy != null) {
         this.cy.d = 0.0;
      }
   }

   @Override
   public void a(@Nullable cak.a $$0) {
      this.cy = $$0;
   }

   @Override
   public void y() {
      if (this.T_() == null) {
         this.gu();
      }
   }

   @Override
   public void C() {
      cak.super.C();
      this.ch.a(chi.a.a);
   }

   @Override
   public boolean v() {
      return !(this instanceof crn);
   }

   @Override
   public boolean a(bzm $$0, boolean $$1) {
      boolean $$2 = super.a($$0, $$1);
      if ($$2 && this.R_()) {
         this.S_();
      }

      return $$2;
   }

   @Override
   public boolean dl() {
      return super.dl() && !this.gw();
   }

   public void u(boolean $$0) {
      byte $$1 = this.ay.a(a);
      this.ay.a(a, $$0 ? (byte)($$1 | 1) : (byte)($$1 & -2));
   }

   public void v(boolean $$0) {
      byte $$1 = this.ay.a(a);
      this.ay.a(a, $$0 ? (byte)($$1 | 2) : (byte)($$1 & -3));
   }

   public void w(boolean $$0) {
      byte $$1 = this.ay.a(a);
      this.ay.a(a, $$0 ? (byte)($$1 | 4) : (byte)($$1 & -5));
   }

   public boolean gw() {
      return (this.ay.a(a) & 1) != 0;
   }

   public boolean gx() {
      return (this.ay.a(a) & 2) != 0;
   }

   public boolean gy() {
      return (this.ay.a(a) & 4) != 0;
   }

   public void a(boolean $$0) {
   }

   @Override
   public cad fF() {
      return this.gx() ? cad.a : cad.b;
   }

   public boolean h(cam $$0) {
      return this.gz().c($$0.eS());
   }

   protected fin gz() {
      bzm $$0 = this.dm();
      fin $$3;
      if ($$0 != null) {
         fin $$1 = $$0.cV();
         fin $$2 = this.cV();
         $$3 = new fin(Math.min($$2.a, $$1.a), $$2.b, Math.min($$2.c, $$1.c), Math.max($$2.d, $$1.d), $$2.e, Math.max($$2.f, $$1.f));
      } else {
         $$3 = this.cV();
      }

      return $$3.c(ck, 0.0, ck);
   }

   @Override
   public boolean c(aub $$0, bzm $$1) {
      float $$2 = (float)this.i(cbs.c);
      dcv $$3 = this.ed();
      byb $$4 = Optional.ofNullable($$3.h().a(this)).orElse(this.ea().b((cam)this));
      $$2 = djk.a($$0, $$3, $$1, $$4, $$2);
      $$2 += $$3.h().a($$1, $$2, $$4);
      boolean $$5 = $$1.a($$0, $$4, $$2);
      if ($$5) {
         float $$6 = this.b($$1, $$4);
         if ($$6 > 0.0F && $$1 instanceof cam $$7) {
            $$7.p($$6 * 0.5F, bcb.a(this.dP() * (float) (Math.PI / 180.0)), -bcb.b(this.dP() * (float) (Math.PI / 180.0)));
            this.i(this.dA().d(0.6, 1.0, 0.6));
         }

         if ($$1 instanceof cam $$8) {
            $$3.a($$8, this);
         }

         djk.a($$0, $$1, $$4);
         this.C($$1);
         this.gA();
      }

      return $$5;
   }

   protected void gA() {
   }

   protected boolean gB() {
      if (this.ai().W() && !this.ai().C) {
         float $$0 = this.bB();
         jb $$1 = jb.a(this.dC(), this.dG(), this.dI());
         boolean $$2 = this.bo() || this.aI || this.aJ;
         if ($$0 > 0.5F && this.ar.i() * 30.0F < ($$0 - 0.4F) * 2.0F && !$$2 && this.ai().h($$1)) {
            return true;
         }
      }

      return false;
   }

   @Override
   protected void c(bae<fak> $$0) {
      if (this.S().p()) {
         super.c($$0);
      } else {
         this.i(this.dA().b(0.0, 0.3, 0.0));
      }
   }

   @VisibleForTesting
   public void gC() {
      this.c($$0 -> true);
      this.eh().h();
   }

   public void c(Predicate<chi> $$0) {
      this.ch.a($$0);
   }

   @Override
   protected void cH() {
      super.cH();

      for (bzw $$0 : bzw.j) {
         dcv $$1 = this.a($$0);
         if (!$$1.f()) {
            $$1.e(0);
         }
      }
   }

   @Nullable
   @Override
   public dcv dM() {
      dec $$0 = dec.a(this.ap());
      return $$0 == null ? null : new dcv($$0);
   }

   @Override
   protected void a(jl<cbn> $$0) {
      super.a($$0);
      if ($$0.a(cbs.n) || $$0.a(cbs.F)) {
         this.S().f();
      }
   }
}
