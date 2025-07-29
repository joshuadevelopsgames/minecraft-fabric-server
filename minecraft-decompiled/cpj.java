import java.util.Optional;
import java.util.UUID;
import javax.annotation.Nullable;

public class cpj extends cbi implements car {
   private static final alh<Boolean> cq = all.a(cpj.class, alj.k);
   private static final alh<Integer> cr = all.a(cpj.class, alj.b);
   private static final alh<Integer> cs = all.a(cpj.class, alj.b);
   private static final alh<jl<cpm>> ct = all.a(cpj.class, alj.A);
   private static final alh<jl<cpk>> cu = all.a(cpj.class, alj.B);
   public static final clc.a co = ($$0, $$1) -> {
      bzv<?> $$2 = $$0.ap();
      return $$2 == bzv.bd || $$2 == bzv.ba || $$2 == bzv.ab;
   };
   private static final float cv = 8.0F;
   private static final float cw = 40.0F;
   private static final float cx = 0.125F;
   public static final float cp = (float) (Math.PI / 5);
   private static final dbt cy = dbt.o;
   private float cz;
   private float cA;
   private boolean cB;
   private boolean cC;
   private float cD;
   private float cE;
   private static final bwu cF = bdg.a(20, 39);
   @Nullable
   private UUID cG;

   public cpj(bzv<? extends cpj> $$0, dmu $$1) {
      super($$0, $$1);
      this.a(false, false);
      this.a(fbc.f, -1.0F);
      this.a(fbc.g, -1.0F);
   }

   @Override
   protected void H() {
      this.ch.a(1, new chc(this));
      this.ch.a(1, new cbi.a(1.5, azp.G));
      this.ch.a(2, new cin(this));
      this.ch.a(3, new cpj.a<>(this, cot.class, 24.0F, 1.5, 1.5));
      this.ch.a(4, new cho(this, 0.4F));
      this.ch.a(5, new chs(this, 1.0, true));
      this.ch.a(6, new chg(this, 1.0, 10.0F, 2.0F));
      this.ch.a(7, new cgu(this, 1.0));
      this.ch.a(8, new civ(this, 1.0));
      this.ch.a(9, new cgq(this, 8.0F));
      this.ch.a(10, new chq(this, cut.class, 8.0F));
      this.ch.a(10, new cid(this));
      this.ci.a(1, new cjf(this));
      this.ci.a(2, new cjg(this));
      this.ci.a(3, new cja(this).a());
      this.ci.a(4, new cjb<>(this, cut.class, 10, true, false, this::a));
      this.ci.a(5, new cje<>(this, cmd.class, false, co));
      this.ci.a(6, new cje<>(this, cnm.class, false, cnm.ck));
      this.ci.a(7, new cjb<>(this, crd.class, false));
      this.ci.a(8, new cjh<>(this, true));
   }

   public ame gT() {
      cpm $$0 = this.gY().a();
      if (this.m()) {
         return $$0.b().b().b();
      } else {
         return this.ad_() ? $$0.b().c().b() : $$0.b().a().b();
      }
   }

   private jl<cpm> gY() {
      return this.ay.a(ct);
   }

   private void b(jl<cpm> $$0) {
      this.ay.a(ct, $$0);
   }

   private jl<cpk> gZ() {
      return this.ay.a(cu);
   }

   private void k(jl<cpk> $$0) {
      this.ay.a(cu, $$0);
   }

   @Nullable
   @Override
   public <T> T a(kp<? extends T> $$0) {
      if ($$0 == kq.aw) {
         return c((kp<T>)$$0, this.gY());
      } else if ($$0 == kq.ax) {
         return c((kp<T>)$$0, this.gZ());
      } else {
         return $$0 == kq.ay ? c((kp<T>)$$0, this.gW()) : super.a($$0);
      }
   }

   @Override
   protected void a(kl $$0) {
      this.a($$0, kq.aw);
      this.a($$0, kq.ax);
      this.a($$0, kq.ay);
      super.a($$0);
   }

   @Override
   protected <T> boolean b(kp<T> $$0, T $$1) {
      if ($$0 == kq.aw) {
         this.b(c(kq.aw, $$1));
         return true;
      } else if ($$0 == kq.ax) {
         this.k(c(kq.ax, $$1));
         return true;
      } else if ($$0 == kq.ay) {
         this.a(c(kq.ay, $$1));
         return true;
      } else {
         return super.b($$0, $$1);
      }
   }

   public static cbr.a gU() {
      return cmd.gM().a(cbs.w, 0.3F).a(cbs.t, 8.0).a(cbs.c, 4.0);
   }

   @Override
   protected void a(all.a $$0) {
      super.a($$0);
      jy<cpk> $$1 = this.eb().f(mn.bs);
      $$0.a(ct, cxc.a(this.eb(), cpn.j));
      $$0.a(cu, $$1.a(cpl.a).or($$1::a).orElseThrow());
      $$0.a(cq, false);
      $$0.a(cr, cy.a());
      $$0.a(cs, 0);
   }

   @Override
   protected void b(jb $$0, eeb $$1) {
      this.a(ayz.Eq, 0.15F, 1.0F);
   }

   @Override
   protected void a(fdc $$0) {
      super.a($$0);
      $$0.a("CollarColor", dbt.s, this.gW());
      cxc.a($$0, this.gY());
      this.a_($$0);
      this.gZ().e().ifPresent($$1 -> $$0.a("sound_variant", amd.a(mn.bs), $$1));
   }

   @Override
   protected void a(fda $$0) {
      super.a($$0);
      cxc.a($$0, mn.br).ifPresent(this::b);
      this.a($$0.<dbt>a("CollarColor", dbt.s).orElse(cy));
      this.a(this.ai(), $$0);
      $$0.<amd>a("sound_variant", amd.a(mn.bs)).flatMap($$0x -> this.eb().f(mn.bs).a($$0x)).ifPresent(this::k);
   }

   @Nullable
   @Override
   public cbe a(dnl $$0, bxh $$1, bzu $$2, @Nullable cbe $$3) {
      if ($$3 instanceof cpj.b $$4) {
         this.b($$4.a);
      } else {
         Optional<? extends jl<cpm>> $$5 = cxc.a(cwz.a($$0, this.dx()), mn.br);
         if ($$5.isPresent()) {
            this.b((jl<cpm>)$$5.get());
            $$3 = new cpj.b((jl<cpm>)$$5.get());
         }
      }

      this.k(cpl.a(this.eb(), $$0.H_()));
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected ayy p() {
      if (this.ad_()) {
         return this.gZ().a().c().a();
      } else if (this.ar.a(3) == 0) {
         return this.m() && this.eL() < 20.0F ? this.gZ().a().f().a() : this.gZ().a().e().a();
      } else {
         return this.gZ().a().a().a();
      }
   }

   @Override
   protected ayy e(byb $$0) {
      return this.i($$0) ? ayz.En : this.gZ().a().d().a();
   }

   @Override
   protected ayy f_() {
      return this.gZ().a().b().a();
   }

   @Override
   protected float fk() {
      return 0.4F;
   }

   @Override
   public void e_() {
      super.e_();
      if (!this.ai().C && this.cB && !this.cC && !this.gD() && this.aK()) {
         this.cC = true;
         this.cD = 0.0F;
         this.cE = 0.0F;
         this.ai().a(this, (byte)8);
      }

      if (!this.ai().C) {
         this.a((aub)this.ai(), true);
      }
   }

   @Override
   public void g() {
      super.g();
      if (this.bO()) {
         this.cA = this.cz;
         if (this.gX()) {
            this.cz = this.cz + (1.0F - this.cz) * 0.4F;
         } else {
            this.cz = this.cz + (0.0F - this.cz) * 0.4F;
         }

         if (this.bo()) {
            this.cB = true;
            if (this.cC && !this.ai().C) {
               this.ai().a(this, (byte)56);
               this.ha();
            }
         } else if ((this.cB || this.cC) && this.cC) {
            if (this.cD == 0.0F) {
               this.a(ayz.Ep, this.fk(), (this.ar.i() - this.ar.i()) * 0.2F + 1.0F);
               this.c(ejb.u);
            }

            this.cE = this.cD;
            this.cD += 0.05F;
            if (this.cE >= 2.0F) {
               this.cB = false;
               this.cC = false;
               this.cE = 0.0F;
               this.cD = 0.0F;
            }

            if (this.cD > 0.4F) {
               float $$0 = (float)this.dE();
               int $$1 = (int)(bcb.a((this.cD - 0.4F) * (float) Math.PI) * 7.0F);
               fis $$2 = this.dA();

               for (int $$3 = 0; $$3 < $$1; $$3++) {
                  float $$4 = (this.ar.i() * 2.0F - 1.0F) * this.ds() * 0.5F;
                  float $$5 = (this.ar.i() * 2.0F - 1.0F) * this.ds() * 0.5F;
                  this.ai().a(me.ap, this.dC() + $$4, $$0 + 0.8F, this.dI() + $$5, $$2.d, $$2.e, $$2.f);
               }
            }
         }
      }
   }

   private void ha() {
      this.cC = false;
      this.cD = 0.0F;
      this.cE = 0.0F;
   }

   @Override
   public void a(byb $$0) {
      this.cB = false;
      this.cC = false;
      this.cE = 0.0F;
      this.cD = 0.0F;
      super.a($$0);
   }

   public float J(float $$0) {
      return !this.cB ? 1.0F : Math.min(0.75F + bcb.h($$0, this.cE, this.cD) / 2.0F * 0.25F, 1.0F);
   }

   public float K(float $$0) {
      return bcb.h($$0, this.cE, this.cD);
   }

   public float L(float $$0) {
      return bcb.h($$0, this.cA, this.cz) * 0.15F * (float) Math.PI;
   }

   @Override
   public int gg() {
      return this.t() ? 20 : super.gg();
   }

   @Override
   public boolean a(aub $$0, byb $$1, float $$2) {
      if (this.a($$0, $$1)) {
         return false;
      } else {
         this.z(false);
         return super.a($$0, $$1, $$2);
      }
   }

   @Override
   protected void c(aub $$0, byb $$1, float $$2) {
      if (!this.i($$1)) {
         super.c($$0, $$1, $$2);
      } else {
         dcv $$3 = this.gl();
         int $$4 = $$3.o();
         int $$5 = $$3.p();
         $$3.a(bcb.f($$2), this, bzw.g);
         if (bzi.b.a($$4, $$5) != bzi.b.a(this.gl())) {
            this.a(ayz.Em);
            $$0.a(new ma(me.U, dcz.pv.m()), this.dC(), this.dE() + 1.0, this.dI(), 20, 0.2, 0.1, 0.2, 0.1);
         }
      }
   }

   private boolean i(byb $$0) {
      return this.gl().a(dcz.pw) && !$$0.a(azp.C);
   }

   @Override
   protected void n() {
      if (this.m()) {
         this.h(cbs.t).a(40.0);
         this.x(40.0F);
      } else {
         this.h(cbs.t).a(8.0);
      }
   }

   @Override
   protected void c(byb $$0, float $$1) {
      this.a($$0, $$1, new bzw[]{bzw.g});
   }

   @Override
   protected boolean a(cut $$0) {
      return this.j($$0);
   }

   @Override
   public bxj b(cut $$0, bxi $$1) {
      dcv $$2 = $$0.b($$1);
      dcr $$3 = $$2.h();
      if (this.m()) {
         if (this.i($$2) && this.eL() < this.fa()) {
            this.a($$0, $$1, $$2);
            cyj $$4 = $$2.a(kq.v);
            float $$5 = $$4 != null ? $$4.a() : 1.0F;
            this.d(2.0F * $$5);
            return bxj.a;
         }

         if (!($$3 instanceof dbu $$6 && this.j($$0))) {
            if (this.a($$2, bzw.g) && !this.gn() && this.j($$0) && !this.g_()) {
               this.h($$2.c(1));
               $$2.a(1, $$0);
               return bxj.a;
            }

            if (this.t() && this.gn() && this.j($$0) && this.gl().n() && this.gl().c($$2)) {
               $$2.h(1);
               this.a(ayz.Eo);
               dcv $$8 = this.gl();
               int $$9 = (int)($$8.p() * 0.125F);
               $$8.b(Math.max(0, $$8.o() - $$9));
               return bxj.a;
            }

            bxj $$10 = super.b($$0, $$1);
            if (!$$10.a() && this.j($$0)) {
               this.z(!this.gH());
               this.bB = false;
               this.cg.n();
               this.g(null);
               return bxj.a.b();
            }

            return $$10;
         }

         dbt $$7 = $$6.a();
         if ($$7 != this.gW()) {
            this.a($$7);
            $$2.a(1, $$0);
            return bxj.a;
         }
      } else if (!this.ai().C && $$2.a(dcz.sY) && !this.ad_()) {
         $$2.a(1, $$0);
         this.i($$0);
         return bxj.b;
      }

      return super.b($$0, $$1);
   }

   private void i(cut $$0) {
      if (this.ar.a(3) == 0) {
         this.g($$0);
         this.cg.n();
         this.g(null);
         this.z(true);
         this.ai().a(this, (byte)7);
      } else {
         this.ai().a(this, (byte)6);
      }
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 8) {
         this.cC = true;
         this.cD = 0.0F;
         this.cE = 0.0F;
      } else if ($$0 == 56) {
         this.ha();
      } else {
         super.b($$0);
      }
   }

   public float gV() {
      if (this.ad_()) {
         return 1.5393804F;
      } else if (this.m()) {
         float $$0 = this.fa();
         float $$1 = ($$0 - this.eL()) / $$0;
         return (0.55F - $$1 * 0.4F) * (float) Math.PI;
      } else {
         return (float) (Math.PI / 5);
      }
   }

   @Override
   public boolean i(dcv $$0) {
      return $$0.a(azx.az);
   }

   @Override
   public int gk() {
      return 8;
   }

   @Override
   public int a() {
      return this.ay.a(cs);
   }

   @Override
   public void a(int $$0) {
      this.ay.a(cs, $$0);
   }

   @Override
   public void c() {
      this.a(cF.a(this.ar));
   }

   @Nullable
   @Override
   public UUID b() {
      return this.cG;
   }

   @Override
   public void a(@Nullable UUID $$0) {
      this.cG = $$0;
   }

   public dbt gW() {
      return dbt.a(this.ay.a(cr));
   }

   private void a(dbt $$0) {
      this.ay.a(cr, $$0.a());
   }

   @Nullable
   public cpj b(aub $$0, bzc $$1) {
      cpj $$2 = bzv.bO.a($$0, bzu.e);
      if ($$2 != null && $$1 instanceof cpj $$3) {
         if (this.ar.h()) {
            $$2.b(this.gY());
         } else {
            $$2.b($$3.gY());
         }

         if (this.m()) {
            $$2.a(this.d());
            $$2.a(true, true);
            dbt $$4 = this.gW();
            dbt $$5 = $$3.gW();
            $$2.a(dbt.a($$0, $$4, $$5));
         }

         $$2.k(cpl.a(this.eb(), this.ar));
      }

      return $$2;
   }

   public void A(boolean $$0) {
      this.ay.a(cq, $$0);
   }

   @Override
   public boolean a(cmd $$0) {
      if ($$0 == this) {
         return false;
      } else if (!this.m()) {
         return false;
      } else if (!($$0 instanceof cpj $$1)) {
         return false;
      } else if (!$$1.m()) {
         return false;
      } else {
         return $$1.t() ? false : this.gR() && $$1.gR();
      }
   }

   public boolean gX() {
      return this.ay.a(cq);
   }

   @Override
   public boolean a(cam $$0, cam $$1) {
      if ($$0 instanceof crh || $$0 instanceof crp || $$0 instanceof cqo) {
         return false;
      } else if ($$0 instanceof cpj $$2) {
         return !$$2.m() || $$2.U_() != $$1;
      } else if ($$0 instanceof cut $$3 && $$1 instanceof cut $$4 && !$$4.a($$3)) {
         return false;
      } else {
         return $$0 instanceof coq $$5 && $$5.gY() ? false : !($$0 instanceof cbi $$6 && $$6.m());
      }
   }

   @Override
   public boolean v() {
      return !this.ad_();
   }

   @Override
   public fis F() {
      return new fis(0.0, 0.6F * this.cW(), this.ds() * 0.4F);
   }

   public static boolean c(bzv<cpj> $$0, dmv $$1, bzu $$2, jb $$3, bck $$4) {
      return $$1.a_($$3.e()).a(azo.ck) && a($$1, $$3);
   }

   class a<T extends cam> extends cgp<T> {
      private final cpj j;

      public a(final cpj $$0, final Class<T> $$1, final float $$2, final double $$3, final double $$4) {
         super($$0, $$1, $$2, $$3, $$4);
         this.j = $$0;
      }

      @Override
      public boolean b() {
         return super.b() && this.b instanceof cot ? !this.j.m() && this.a((cot)this.b) : false;
      }

      private boolean a(cot $$0) {
         return $$0.gL() >= cpj.this.ar.a(5);
      }

      @Override
      public void d() {
         cpj.this.g(null);
         super.d();
      }

      @Override
      public void a() {
         cpj.this.g(null);
         super.a();
      }
   }

   public static class b extends bzc.a {
      public final jl<cpm> a;

      public b(jl<cpm> $$0) {
         super(false);
         this.a = $$0;
      }
   }
}
