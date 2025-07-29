import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import java.util.EnumSet;
import java.util.List;
import java.util.Optional;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public class cms extends cmd {
   private static final alh<Integer> co = all.a(cms.class, alj.b);
   private static final alh<Byte> cp = all.a(cms.class, alj.a);
   private static final int cq = 1;
   public static final int ck = 4;
   public static final int cl = 8;
   public static final int cm = 16;
   private static final int cr = 32;
   private static final int cs = 64;
   private static final int ct = 128;
   private static final alh<Optional<bzs<cam>>> cu = all.a(cms.class, alj.r);
   private static final alh<Optional<bzs<cam>>> cv = all.a(cms.class, alj.r);
   static final Predicate<cqz> cw = $$0 -> !$$0.n() && $$0.bO();
   private static final Predicate<bzm> cx = $$0 -> !($$0 instanceof cam $$1) ? false : $$1.ez() != null && $$1.eA() < $$1.as + 600;
   static final Predicate<bzm> cy = $$0 -> $$0 instanceof cmj || $$0 instanceof cnf;
   private static final Predicate<bzm> cz = $$0 -> !$$0.cj() && bzt.e.test($$0);
   private static final int cA = 600;
   private static final bzp cB = bzv.ab.n().a(0.5F).b(0.2975F);
   private static final Codec<List<bzs<cam>>> cC = bzs.a().listOf();
   private static final boolean cD = false;
   private static final boolean cE = false;
   private static final boolean cF = false;
   private chi cG;
   private chi cH;
   private chi cI;
   private float cJ;
   private float cM;
   float cN;
   float cO;
   private int cP;

   public cms(bzv<? extends cms> $$0, dmu $$1) {
      super($$0, $$1);
      this.cd = new cms.k();
      this.ce = new cms.m();
      this.a(fbc.p, 0.0F);
      this.a(fbc.q, 0.0F);
      this.a_(true);
      this.S().a(32.0F);
   }

   @Override
   protected void a(all.a $$0) {
      super.a($$0);
      $$0.a(cu, Optional.empty());
      $$0.a(cv, Optional.empty());
      $$0.a(co, cms.v.c.a());
      $$0.a(cp, (byte)0);
   }

   @Override
   protected void H() {
      this.cG = new cjb<>(this, cmd.class, 10, false, false, ($$0, $$1) -> $$0 instanceof cmj || $$0 instanceof cnf);
      this.cH = new cjb<>(this, cnm.class, 10, false, false, cnm.ck);
      this.cI = new cjb<>(this, clz.class, 20, false, false, ($$0, $$1) -> $$0 instanceof cmb);
      this.ch.a(0, new cms.g());
      this.ch.a(0, new cgx(this, this.ai()));
      this.ch.a(1, new cms.b());
      this.ch.a(2, new cms.n(2.2));
      this.ch.a(3, new cms.e(1.0));
      this.ch.a(4, new cgp<>(this, cut.class, 16.0F, 1.6, 1.4, $$0 -> cz.test($$0) && !this.j($$0) && !this.gV()));
      this.ch.a(4, new cgp<>(this, cpj.class, 8.0F, 1.6, 1.4, $$0 -> !((cpj)$$0).m() && !this.gV()));
      this.ch.a(4, new cgp<>(this, cnd.class, 8.0F, 1.6, 1.4, $$0 -> !this.gV()));
      this.ch.a(5, new cms.u());
      this.ch.a(6, new cms.o());
      this.ch.a(6, new cms.s(1.25));
      this.ch.a(7, new cms.l(1.2F, true));
      this.ch.a(7, new cms.t());
      this.ch.a(8, new cms.h(this, 1.25));
      this.ch.a(9, new cms.q(32, 200));
      this.ch.a(10, new cms.f(1.2F, 12, 1));
      this.ch.a(10, new cho(this, 0.4F));
      this.ch.a(11, new civ(this, 1.0));
      this.ch.a(11, new cms.p());
      this.ch.a(12, new cms.j(this, cut.class, 24.0F));
      this.ch.a(13, new cms.r());
      this.ci.a(3, new cms.a(cam.class, false, false, ($$0, $$1) -> cx.test($$0) && !this.j($$0)));
   }

   @Override
   public void e_() {
      if (!this.ai().C && this.bO() && this.dl()) {
         this.cP++;
         dcv $$0 = this.a(bzw.a);
         if (this.j($$0)) {
            if (this.cP > 600) {
               dcv $$1 = $$0.a(this.ai(), this);
               if (!$$1.f()) {
                  this.a(bzw.a, $$1);
               }

               this.cP = 0;
            } else if (this.cP > 560 && this.ar.i() < 0.1F) {
               this.gN();
               this.ai().a(this, (byte)45);
            }
         }

         cam $$2 = this.e();
         if ($$2 == null || !$$2.bO()) {
            this.z(false);
            this.A(false);
         }
      }

      if (this.fY() || this.fm()) {
         this.bB = false;
         this.bC = 0.0F;
         this.bE = 0.0F;
      }

      super.e_();
      if (this.gV() && this.ar.i() < 0.05F) {
         this.a(ayz.jS, 1.0F, 1.0F);
      }
   }

   @Override
   protected boolean fm() {
      return this.eM();
   }

   private boolean j(dcv $$0) {
      return $$0.c(kq.v) && this.e() == null && this.aK() && !this.fY();
   }

   @Override
   protected void a(bck $$0, bxh $$1) {
      if ($$0.i() < 0.2F) {
         float $$2 = $$0.i();
         dcv $$3;
         if ($$2 < 0.05F) {
            $$3 = new dcv(dcz.pF);
         } else if ($$2 < 0.2F) {
            $$3 = new dcv(dcz.rY);
         } else if ($$2 < 0.4F) {
            $$3 = $$0.h() ? new dcv(dcz.wg) : new dcv(dcz.wh);
         } else if ($$2 < 0.6F) {
            $$3 = new dcv(dcz.qB);
         } else if ($$2 < 0.8F) {
            $$3 = new dcv(dcz.rK);
         } else {
            $$3 = new dcv(dcz.qy);
         }

         this.a(bzw.a, $$3);
      }
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 45) {
         dcv $$1 = this.a(bzw.a);
         if (!$$1.f()) {
            for (int $$2 = 0; $$2 < 8; $$2++) {
               fis $$3 = new fis((this.ar.i() - 0.5) * 0.1, Math.random() * 0.1 + 0.1, 0.0)
                  .a(-this.dR() * (float) (Math.PI / 180.0))
                  .b(-this.dP() * (float) (Math.PI / 180.0));
               this.ai().a(new ma(me.U, $$1), this.dC() + this.bW().d / 2.0, this.dE(), this.dI() + this.bW().f / 2.0, $$3.d, $$3.e + 0.05, $$3.f);
            }
         }
      } else {
         super.b($$0);
      }
   }

   public static cbr.a m() {
      return cmd.gM().a(cbs.w, 0.3F).a(cbs.t, 10.0).a(cbs.c, 2.0).a(cbs.y, 5.0).a(cbs.n, 32.0);
   }

   @Nullable
   public cms b(aub $$0, bzc $$1) {
      cms $$2 = bzv.ab.a($$0, bzu.e);
      if ($$2 != null) {
         $$2.a(this.ar.h() ? this.n() : ((cms)$$1).n());
      }

      return $$2;
   }

   public static boolean c(bzv<cms> $$0, dmv $$1, bzu $$2, jb $$3, bck $$4) {
      return $$1.a_($$3.e()).a(azo.cj) && a($$1, $$3);
   }

   @Nullable
   @Override
   public cbe a(dnl $$0, bxh $$1, bzu $$2, @Nullable cbe $$3) {
      jl<dnx> $$4 = $$0.v(this.dx());
      cms.v $$5 = cms.v.a($$4);
      boolean $$6 = false;
      if ($$3 instanceof cms.i $$7) {
         $$5 = $$7.a;
         if ($$7.a() >= 2) {
            $$6 = true;
         }
      } else {
         $$3 = new cms.i($$5);
      }

      this.a($$5);
      if ($$6) {
         this.c_(-24000);
      }

      if ($$0 instanceof aub) {
         this.gL();
      }

      this.a($$0.H_(), $$1);
      return super.a($$0, $$1, $$2, $$3);
   }

   private void gL() {
      if (this.n() == cms.v.a) {
         this.ci.a(4, this.cG);
         this.ci.a(4, this.cH);
         this.ci.a(6, this.cI);
      } else {
         this.ci.a(4, this.cI);
         this.ci.a(6, this.cG);
         this.ci.a(6, this.cH);
      }
   }

   @Override
   protected void gN() {
      this.a(ayz.jW, 1.0F, 1.0F);
   }

   @Override
   public bzp e(cay $$0) {
      return this.g_() ? cB : super.e($$0);
   }

   public cms.v n() {
      return cms.v.a(this.ay.a(co));
   }

   private void a(cms.v $$0) {
      this.ay.a(co, $$0.a());
   }

   @Nullable
   @Override
   public <T> T a(kp<? extends T> $$0) {
      return $$0 == kq.az ? c((kp<T>)$$0, this.n()) : super.a($$0);
   }

   @Override
   protected void a(kl $$0) {
      this.a($$0, kq.az);
      super.a($$0);
   }

   @Override
   protected <T> boolean b(kp<T> $$0, T $$1) {
      if ($$0 == kq.az) {
         this.a(c(kq.az, $$1));
         return true;
      } else {
         return super.b($$0, $$1);
      }
   }

   Stream<bzs<cam>> gT() {
      return Stream.concat(this.ay.a(cu).stream(), this.ay.a(cv).stream());
   }

   void i(cam $$0) {
      this.a(new bzs<>($$0));
   }

   private void a(bzs<cam> $$0) {
      if (this.ay.a(cu).isPresent()) {
         this.ay.a(cv, Optional.of($$0));
      } else {
         this.ay.a(cu, Optional.of($$0));
      }
   }

   @Override
   protected void a(fdc $$0) {
      super.a($$0);
      $$0.a("Trusted", cC, this.gT().toList());
      $$0.a("Sleeping", this.fY());
      $$0.a("Type", cms.v.d, this.n());
      $$0.a("Sitting", this.t());
      $$0.a("Crouching", this.cl());
   }

   @Override
   protected void a(fda $$0) {
      super.a($$0);
      this.gU();
      $$0.<List>a("Trusted", cC).orElse(List.of()).forEach(this::a);
      this.D($$0.a("Sleeping", false));
      this.a($$0.<cms.v>a("Type", cms.v.d).orElse(cms.v.c));
      this.x($$0.a("Sitting", false));
      this.z($$0.a("Crouching", false));
      if (this.ai() instanceof aub) {
         this.gL();
      }
   }

   private void gU() {
      this.ay.a(cu, Optional.empty());
      this.ay.a(cv, Optional.empty());
   }

   public boolean t() {
      return this.s(1);
   }

   public void x(boolean $$0) {
      this.d(1, $$0);
   }

   public boolean gH() {
      return this.s(64);
   }

   void B(boolean $$0) {
      this.d(64, $$0);
   }

   boolean gV() {
      return this.s(128);
   }

   void C(boolean $$0) {
      this.d(128, $$0);
   }

   @Override
   public boolean fY() {
      return this.s(32);
   }

   void D(boolean $$0) {
      this.d(32, $$0);
   }

   private void d(int $$0, boolean $$1) {
      if ($$1) {
         this.ay.a(cp, (byte)(this.ay.a(cp) | $$0));
      } else {
         this.ay.a(cp, (byte)(this.ay.a(cp) & ~$$0));
      }
   }

   private boolean s(int $$0) {
      return (this.ay.a(cp) & $$0) != 0;
   }

   @Override
   protected boolean f(bzw $$0) {
      return $$0 == bzw.a && this.fU();
   }

   @Override
   public boolean g(dcv $$0) {
      dcv $$1 = this.a(bzw.a);
      return $$1.f() || this.cP > 0 && $$0.c(kq.v) && !$$1.c(kq.v);
   }

   private void k(dcv $$0) {
      if (!$$0.f() && !this.ai().C) {
         cqz $$1 = new cqz(this.ai(), this.dC() + this.bW().d, this.dE() + 1.0, this.dI() + this.bW().f, $$0);
         $$1.b(40);
         $$1.b(this);
         this.a(ayz.kb, 1.0F, 1.0F);
         this.ai().b($$1);
      }
   }

   private void l(dcv $$0) {
      cqz $$1 = new cqz(this.ai(), this.dC(), this.dE(), this.dI(), $$0);
      this.ai().b($$1);
   }

   @Override
   protected void a(aub $$0, cqz $$1) {
      dcv $$2 = $$1.e();
      if (this.g($$2)) {
         int $$3 = $$2.M();
         if ($$3 > 1) {
            this.l($$2.a($$3 - 1));
         }

         this.k(this.a(bzw.a));
         this.a($$1);
         this.a(bzw.a, $$2.a(1));
         this.g(bzw.a);
         this.a($$1, $$2.M());
         $$1.at();
         this.cP = 0;
      }
   }

   @Override
   public void g() {
      super.g();
      if (this.dl()) {
         boolean $$0 = this.bm();
         if ($$0 || this.e() != null || this.ai().ag()) {
            this.gW();
         }

         if ($$0 || this.fY()) {
            this.x(false);
         }

         if (this.gH() && this.ai().A.i() < 0.2F) {
            jb $$1 = this.dx();
            eeb $$2 = this.ai().a_($$1);
            this.ai().c(2001, $$1, dpz.j($$2));
         }
      }

      this.cM = this.cJ;
      if (this.gK()) {
         this.cJ = this.cJ + (1.0F - this.cJ) * 0.4F;
      } else {
         this.cJ = this.cJ + (0.0F - this.cJ) * 0.4F;
      }

      this.cO = this.cN;
      if (this.cl()) {
         this.cN += 0.2F;
         if (this.cN > 3.0F) {
            this.cN = 3.0F;
         }
      } else {
         this.cN = 0.0F;
      }
   }

   @Override
   public boolean i(dcv $$0) {
      return $$0.a(azx.av);
   }

   @Override
   protected void a(cut $$0, cao $$1) {
      ((cms)$$1).i($$0);
   }

   public boolean gI() {
      return this.s(16);
   }

   public void y(boolean $$0) {
      this.d(16, $$0);
   }

   public boolean gJ() {
      return this.cN == 3.0F;
   }

   public void z(boolean $$0) {
      this.d(4, $$0);
   }

   @Override
   public boolean cl() {
      return this.s(4);
   }

   public void A(boolean $$0) {
      this.d(8, $$0);
   }

   public boolean gK() {
      return this.s(8);
   }

   public float J(float $$0) {
      return bcb.h($$0, this.cM, this.cJ) * 0.11F * (float) Math.PI;
   }

   public float K(float $$0) {
      return bcb.h($$0, this.cO, this.cN);
   }

   @Override
   public void g(@Nullable cam $$0) {
      if (this.gV() && $$0 == null) {
         this.C(false);
      }

      super.g($$0);
   }

   void gW() {
      this.D(false);
   }

   void gX() {
      this.A(false);
      this.z(false);
      this.x(false);
      this.D(false);
      this.C(false);
      this.B(false);
   }

   boolean gY() {
      return !this.fY() && !this.t() && !this.gH();
   }

   @Override
   public void X() {
      ayy $$0 = this.p();
      if ($$0 == ayz.jY) {
         this.a($$0, 2.0F, this.fl());
      } else {
         super.X();
      }
   }

   @Nullable
   @Override
   protected ayy p() {
      if (this.fY()) {
         return ayz.jZ;
      } else {
         if (!this.ai().W() && this.ar.i() < 0.1F) {
            List<cut> $$0 = this.ai().a(cut.class, this.cV().c(16.0, 16.0, 16.0), bzt.f);
            if ($$0.isEmpty()) {
               return ayz.jY;
            }
         }

         return ayz.jT;
      }
   }

   @Nullable
   @Override
   protected ayy e(byb $$0) {
      return ayz.jX;
   }

   @Nullable
   @Override
   protected ayy f_() {
      return ayz.jV;
   }

   boolean j(cam $$0) {
      return this.gT().anyMatch($$1 -> $$1.a($$0));
   }

   @Override
   protected void b(aub $$0, byb $$1) {
      dcv $$2 = this.a(bzw.a);
      if (!$$2.f()) {
         this.a($$0, $$2);
         this.a(bzw.a, dcv.l);
      }

      super.b($$0, $$1);
   }

   public static boolean a(cms $$0, cam $$1) {
      double $$2 = $$1.dI() - $$0.dI();
      double $$3 = $$1.dC() - $$0.dC();
      double $$4 = $$2 / $$3;
      int $$5 = 6;

      for (int $$6 = 0; $$6 < 6; $$6++) {
         double $$7 = $$4 == 0.0 ? 0.0 : $$2 * ($$6 / 6.0F);
         double $$8 = $$4 == 0.0 ? $$3 * ($$6 / 6.0F) : $$7 / $$4;

         for (int $$9 = 1; $$9 < 4; $$9++) {
            if (!$$0.ai().a_(jb.a($$0.dC() + $$8, $$0.dE() + $$9, $$0.dI() + $$7)).v()) {
               return false;
            }
         }
      }

      return true;
   }

   @Override
   public fis F() {
      return new fis(0.0, 0.55F * this.cW(), this.ds() * 0.4F);
   }

   class a extends cjb<cam> {
      @Nullable
      private cam j;
      @Nullable
      private cam k;
      private int l;

      public a(final Class<cam> $$0, final boolean $$1, final boolean $$2, @Nullable final clc.a $$3) {
         super(cms.this, $$0, 10, $$1, $$2, $$3);
      }

      @Override
      public boolean b() {
         if (this.b > 0 && this.e.ec().a(this.b) != 0) {
            return false;
         } else {
            aub $$0 = a(cms.this.ai());

            for (bzs<cam> $$1 : cms.this.gT().toList()) {
               cam $$2 = $$1.a($$0, cam.class);
               if ($$2 != null) {
                  this.k = $$2;
                  this.j = $$2.ew();
                  int $$3 = $$2.ey();
                  return $$3 != this.l && this.a(this.j, this.d);
               }
            }

            return false;
         }
      }

      @Override
      public void d() {
         this.a(this.j);
         this.c = this.j;
         if (this.k != null) {
            this.l = this.k.ey();
         }

         cms.this.a(ayz.jS, 1.0F, 1.0F);
         cms.this.C(true);
         cms.this.gW();
         super.d();
      }
   }

   class b extends chi {
      int a;

      public b() {
         this.a(EnumSet.of(chi.a.b, chi.a.c, chi.a.a));
      }

      @Override
      public boolean b() {
         return cms.this.gH();
      }

      @Override
      public boolean c() {
         return this.b() && this.a > 0;
      }

      @Override
      public void d() {
         this.a = this.a(40);
      }

      @Override
      public void e() {
         cms.this.B(false);
      }

      @Override
      public void a() {
         this.a--;
      }
   }

   public class c implements clc.a {
      @Override
      public boolean test(cam $$0, aub $$1) {
         if ($$0 instanceof cms) {
            return false;
         } else if ($$0 instanceof cmj || $$0 instanceof cnf || $$0 instanceof crv) {
            return true;
         } else if ($$0 instanceof cbi) {
            return !((cbi)$$0).m();
         } else if ($$0 instanceof cut $$2 && ($$2.am() || $$2.gI())) {
            return false;
         } else {
            return cms.this.j($$0) ? false : !$$0.fY() && !$$0.cj();
         }
      }
   }

   abstract class d extends chi {
      private final clc b = clc.a().a(12.0).d().a(cms.this.new c());

      protected boolean h() {
         jb $$0 = jb.a(cms.this.dC(), cms.this.cV().e, cms.this.dI());
         return !cms.this.ai().h($$0) && cms.this.c($$0) >= 0.0F;
      }

      protected boolean i() {
         return !a(cms.this.ai()).a(cam.class, this.b, cms.this, cms.this.cV().c(12.0, 6.0, 12.0)).isEmpty();
      }
   }

   class e extends cgu {
      public e(final double $$0) {
         super(cms.this, $$0);
      }

      @Override
      public void d() {
         ((cms)this.a).gX();
         ((cms)this.c).gX();
         super.d();
      }

      @Override
      protected void g() {
         aub $$0 = this.b;
         cms $$1 = (cms)this.a.a($$0, (bzc)this.c);
         if ($$1 != null) {
            auc $$2 = this.a.gQ();
            auc $$3 = this.c.gQ();
            auc $$4 = $$2;
            if ($$2 != null) {
               $$1.i($$2);
            } else {
               $$4 = $$3;
            }

            if ($$3 != null && $$2 != $$3) {
               $$1.i($$3);
            }

            if ($$4 != null) {
               $$4.a(azj.Q);
               aq.p.a($$4, this.a, this.c, $$1);
            }

            this.a.c_(6000);
            this.c.c_(6000);
            this.a.gS();
            this.c.gS();
            $$1.c_(-24000);
            $$1.b(this.a.dC(), this.a.dE(), this.a.dI(), 0.0F, 0.0F);
            $$0.a_($$1);
            this.b.a(this.a, (byte)18);
            if ($$0.P().c(dmq.g)) {
               this.b.b(new caa(this.b, this.a.dC(), this.a.dE(), this.a.dI(), this.a.ec().a(7) + 1));
            }
         }
      }
   }

   public class f extends chv {
      private static final int i = 40;
      protected int g;

      public f(final double $$1, final int $$2, final int $$3) {
         super(cms.this, $$1, $$2, $$3);
      }

      @Override
      public double i() {
         return 2.0;
      }

      @Override
      public boolean l() {
         return this.d % 100 == 0;
      }

      @Override
      protected boolean a(dmx $$0, jb $$1) {
         eeb $$2 = $$0.a_($$1);
         return $$2.a(dqb.oP) && $$2.c(dyn.c) >= 2 || dqx.j_($$2);
      }

      @Override
      public void a() {
         if (this.m()) {
            if (this.g >= 40) {
               this.o();
            } else {
               this.g++;
            }
         } else if (!this.m() && cms.this.ar.i() < 0.05F) {
            cms.this.a(ayz.ka, 1.0F, 1.0F);
         }

         super.a();
      }

      protected void o() {
         if (a(cms.this.ai()).P().c(dmq.d)) {
            eeb $$0 = cms.this.ai().a_(this.e);
            if ($$0.a(dqb.oP)) {
               this.b($$0);
            } else if (dqx.j_($$0)) {
               this.a($$0);
            }
         }
      }

      private void a(eeb $$0) {
         dqx.a(cms.this, $$0, cms.this.ai(), this.e);
      }

      private void b(eeb $$0) {
         int $$1 = $$0.c(dyn.c);
         $$0.b(dyn.c, 1);
         int $$2 = 1 + cms.this.ai().A.a(2) + ($$1 == 3 ? 1 : 0);
         dcv $$3 = cms.this.a(bzw.a);
         if ($$3.f()) {
            cms.this.a(bzw.a, new dcv(dcz.ya));
            $$2--;
         }

         if ($$2 > 0) {
            dpz.a(cms.this.ai(), this.e, new dcv(dcz.ya, $$2));
         }

         cms.this.a(ayz.AV, 1.0F, 1.0F);
         cms.this.ai().a(this.e, $$0.b(dyn.c, 1), 2);
         cms.this.ai().a(ejb.c, this.e, ejb.a.a(cms.this));
      }

      @Override
      public boolean b() {
         return !cms.this.fY() && super.b();
      }

      @Override
      public void d() {
         this.g = 0;
         cms.this.x(false);
         super.d();
      }
   }

   class g extends chc {
      public g() {
         super(cms.this);
      }

      @Override
      public void d() {
         super.d();
         cms.this.gX();
      }

      @Override
      public boolean b() {
         return cms.this.bm() && cms.this.b(azu.a) > 0.25 || cms.this.bA();
      }
   }

   static class h extends chh {
      private final cms d;

      public h(cms $$0, double $$1) {
         super($$0, $$1);
         this.d = $$0;
      }

      @Override
      public boolean b() {
         return !this.d.gV() && super.b();
      }

      @Override
      public boolean c() {
         return !this.d.gV() && super.c();
      }

      @Override
      public void d() {
         this.d.gX();
         super.d();
      }
   }

   public static class i extends bzc.a {
      public final cms.v a;

      public i(cms.v $$0) {
         super(false);
         this.a = $$0;
      }
   }

   class j extends chq {
      public j(final cao $$0, final Class<? extends cam> $$1, final float $$2) {
         super($$0, $$1, $$2);
      }

      @Override
      public boolean b() {
         return super.b() && !cms.this.gH() && !cms.this.gK();
      }

      @Override
      public boolean c() {
         return super.c() && !cms.this.gH() && !cms.this.gK();
      }
   }

   public class k extends cgk {
      public k() {
         super(cms.this);
      }

      @Override
      public void a() {
         if (!cms.this.fY()) {
            super.a();
         }
      }

      @Override
      protected boolean c() {
         return !cms.this.gI() && !cms.this.cl() && !cms.this.gK() && !cms.this.gH();
      }
   }

   class l extends chs {
      public l(final double $$0, final boolean $$1) {
         super(cms.this, $$0, $$1);
      }

      @Override
      protected void a(cam $$0) {
         if (this.b($$0)) {
            this.h();
            this.a.c(a(this.a), $$0);
            cms.this.a(ayz.jU, 1.0F, 1.0F);
         }
      }

      @Override
      public void d() {
         cms.this.A(false);
         super.d();
      }

      @Override
      public boolean b() {
         return !cms.this.t() && !cms.this.fY() && !cms.this.cl() && !cms.this.gH() && super.b();
      }
   }

   class m extends cgl {
      public m() {
         super(cms.this);
      }

      @Override
      public void a() {
         if (cms.this.gY()) {
            super.a();
         }
      }
   }

   class n extends cib {
      public n(final double $$0) {
         super(cms.this, $$0);
      }

      @Override
      public boolean h() {
         return !cms.this.gV() && super.h();
      }
   }

   public class o extends chm {
      @Override
      public boolean b() {
         if (!cms.this.gJ()) {
            return false;
         } else {
            cam $$0 = cms.this.e();
            if ($$0 != null && $$0.bO()) {
               if ($$0.cT() != $$0.cS()) {
                  return false;
               } else {
                  boolean $$1 = cms.a(cms.this, $$0);
                  if (!$$1) {
                     cms.this.S().a($$0, 0);
                     cms.this.z(false);
                     cms.this.A(false);
                  }

                  return $$1;
               }
            } else {
               return false;
            }
         }
      }

      @Override
      public boolean c() {
         cam $$0 = cms.this.e();
         if ($$0 != null && $$0.bO()) {
            double $$1 = cms.this.dA().e;
            return (!($$1 * $$1 < 0.05F) || !(Math.abs(cms.this.dR()) < 15.0F) || !cms.this.aK()) && !cms.this.gH();
         } else {
            return false;
         }
      }

      @Override
      public boolean W_() {
         return false;
      }

      @Override
      public void d() {
         cms.this.t(true);
         cms.this.y(true);
         cms.this.A(false);
         cam $$0 = cms.this.e();
         if ($$0 != null) {
            cms.this.P().a($$0, 60.0F, 30.0F);
            fis $$1 = new fis($$0.dC() - cms.this.dC(), $$0.dE() - cms.this.dE(), $$0.dI() - cms.this.dI()).d();
            cms.this.i(cms.this.dA().b($$1.d * 0.8, 0.9, $$1.f * 0.8));
         }

         cms.this.S().n();
      }

      @Override
      public void e() {
         cms.this.z(false);
         cms.this.cN = 0.0F;
         cms.this.cO = 0.0F;
         cms.this.A(false);
         cms.this.y(false);
      }

      @Override
      public void a() {
         cam $$0 = cms.this.e();
         if ($$0 != null) {
            cms.this.P().a($$0, 60.0F, 30.0F);
         }

         if (!cms.this.gH()) {
            fis $$1 = cms.this.dA();
            if ($$1.e * $$1.e < 0.03F && cms.this.dR() != 0.0F) {
               cms.this.w(bcb.i(0.2F, cms.this.dR(), 0.0F));
            } else {
               double $$2 = $$1.i();
               double $$3 = Math.signum(-$$1.e) * Math.acos($$2 / $$1.g()) * 180.0F / (float)Math.PI;
               cms.this.w((float)$$3);
            }
         }

         if ($$0 != null && cms.this.f($$0) <= 2.0F) {
            cms.this.c(a(cms.this.ai()), $$0);
         } else if (cms.this.dR() > 0.0F && cms.this.aK() && (float)cms.this.dA().e != 0.0F && cms.this.ai().a_(cms.this.dx()).a(dqb.ed)) {
            cms.this.w(60.0F);
            cms.this.g(null);
            cms.this.B(true);
         }
      }
   }

   class p extends chi {
      public p() {
         this.a(EnumSet.of(chi.a.a));
      }

      @Override
      public boolean b() {
         if (!cms.this.a(bzw.a).f()) {
            return false;
         } else if (cms.this.e() != null || cms.this.ew() != null) {
            return false;
         } else if (!cms.this.gY()) {
            return false;
         } else if (cms.this.ec().a(b(10)) != 0) {
            return false;
         } else {
            List<cqz> $$0 = cms.this.ai().a(cqz.class, cms.this.cV().c(8.0, 8.0, 8.0), cms.cw);
            return !$$0.isEmpty() && cms.this.a(bzw.a).f();
         }
      }

      @Override
      public void a() {
         List<cqz> $$0 = cms.this.ai().a(cqz.class, cms.this.cV().c(8.0, 8.0, 8.0), cms.cw);
         dcv $$1 = cms.this.a(bzw.a);
         if ($$1.f() && !$$0.isEmpty()) {
            cms.this.S().a($$0.get(0), 1.2F);
         }
      }

      @Override
      public void d() {
         List<cqz> $$0 = cms.this.ai().a(cqz.class, cms.this.cV().c(8.0, 8.0, 8.0), cms.cw);
         if (!$$0.isEmpty()) {
            cms.this.S().a($$0.get(0), 1.2F);
         }
      }
   }

   class q extends cio {
      public q(final int $$0, final int $$1) {
         super(cms.this, $$1);
      }

      @Override
      public void d() {
         cms.this.gX();
         super.d();
      }

      @Override
      public boolean b() {
         return super.b() && this.h();
      }

      @Override
      public boolean c() {
         return super.c() && this.h();
      }

      private boolean h() {
         return !cms.this.fY() && !cms.this.t() && !cms.this.gV() && cms.this.e() == null;
      }
   }

   class r extends cms.d {
      private double c;
      private double d;
      private int e;
      private int f;

      public r() {
         this.a(EnumSet.of(chi.a.a, chi.a.b));
      }

      @Override
      public boolean b() {
         return cms.this.ew() == null
            && cms.this.ec().i() < 0.02F
            && !cms.this.fY()
            && cms.this.e() == null
            && cms.this.S().l()
            && !this.i()
            && !cms.this.gI()
            && !cms.this.cl();
      }

      @Override
      public boolean c() {
         return this.f > 0;
      }

      @Override
      public void d() {
         this.k();
         this.f = 2 + cms.this.ec().a(3);
         cms.this.x(true);
         cms.this.S().n();
      }

      @Override
      public void e() {
         cms.this.x(false);
      }

      @Override
      public void a() {
         this.e--;
         if (this.e <= 0) {
            this.f--;
            this.k();
         }

         cms.this.P().a(cms.this.dC() + this.c, cms.this.dG(), cms.this.dI() + this.d, cms.this.gh(), cms.this.gg());
      }

      private void k() {
         double $$0 = (Math.PI * 2) * cms.this.ec().j();
         this.c = Math.cos($$0);
         this.d = Math.sin($$0);
         this.e = this.a(80 + cms.this.ec().a(20));
      }
   }

   class s extends chb {
      private int c = b(100);

      public s(final double $$0) {
         super(cms.this, $$0);
      }

      @Override
      public boolean b() {
         if (!cms.this.fY() && this.a.e() == null) {
            if (cms.this.ai().ag() && cms.this.ai().h(this.a.dx())) {
               return this.h();
            } else if (this.c > 0) {
               this.c--;
               return false;
            } else {
               this.c = 100;
               jb $$0 = this.a.dx();
               return cms.this.ai().W() && cms.this.ai().h($$0) && !((aub)cms.this.ai()).c($$0) && this.h();
            }
         } else {
            return false;
         }
      }

      @Override
      public void d() {
         cms.this.gX();
         super.d();
      }
   }

   class t extends cms.d {
      private static final int c = b(140);
      private int d = cms.this.ar.a(c);

      public t() {
         this.a(EnumSet.of(chi.a.a, chi.a.b, chi.a.c));
      }

      @Override
      public boolean b() {
         return cms.this.bC == 0.0F && cms.this.bD == 0.0F && cms.this.bE == 0.0F ? this.k() || cms.this.fY() : false;
      }

      @Override
      public boolean c() {
         return this.k();
      }

      private boolean k() {
         if (this.d > 0) {
            this.d--;
            return false;
         } else {
            return cms.this.ai().W() && this.h() && !this.i() && !cms.this.aI;
         }
      }

      @Override
      public void e() {
         this.d = cms.this.ar.a(c);
         cms.this.gX();
      }

      @Override
      public void d() {
         cms.this.x(false);
         cms.this.z(false);
         cms.this.A(false);
         cms.this.t(false);
         cms.this.D(true);
         cms.this.S().n();
         cms.this.Q().a(cms.this.dC(), cms.this.dE(), cms.this.dI(), 0.0);
      }
   }

   class u extends chi {
      public u() {
         this.a(EnumSet.of(chi.a.a, chi.a.b));
      }

      @Override
      public boolean b() {
         if (cms.this.fY()) {
            return false;
         } else {
            cam $$0 = cms.this.e();
            return $$0 != null && $$0.bO() && cms.cy.test($$0) && cms.this.g((bzm)$$0) > 36.0 && !cms.this.cl() && !cms.this.gK() && !cms.this.bB;
         }
      }

      @Override
      public void d() {
         cms.this.x(false);
         cms.this.B(false);
      }

      @Override
      public void e() {
         cam $$0 = cms.this.e();
         if ($$0 != null && cms.a(cms.this, $$0)) {
            cms.this.A(true);
            cms.this.z(true);
            cms.this.S().n();
            cms.this.P().a($$0, cms.this.gh(), cms.this.gg());
         } else {
            cms.this.A(false);
            cms.this.z(false);
         }
      }

      @Override
      public void a() {
         cam $$0 = cms.this.e();
         if ($$0 != null) {
            cms.this.P().a($$0, cms.this.gh(), cms.this.gg());
            if (cms.this.g((bzm)$$0) <= 36.0) {
               cms.this.A(true);
               cms.this.z(true);
               cms.this.S().n();
            } else {
               cms.this.S().a($$0, 1.5);
            }
         }
      }
   }

   public static enum v implements bda {
      a(0, "red"),
      b(1, "snow");

      public static final cms.v c = a;
      public static final bda.a<cms.v> d = bda.a(cms.v::values);
      private static final IntFunction<cms.v> f = baq.a(cms.v::a, values(), baq.a.a);
      public static final zm<ByteBuf, cms.v> e = zk.a(f, cms.v::a);
      private final int g;
      private final String h;

      private v(final int $$0, final String $$1) {
         this.g = $$0;
         this.h = $$1;
      }

      @Override
      public String c() {
         return this.h;
      }

      public int a() {
         return this.g;
      }

      public static cms.v a(int $$0) {
         return f.apply($$0);
      }

      public static cms.v a(jl<dnx> $$0) {
         return $$0.a(azn.at) ? b : a;
      }
   }
}
