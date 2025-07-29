import java.util.EnumSet;
import java.util.Optional;
import java.util.UUID;
import javax.annotation.Nullable;

public class crl extends crv implements car {
   private static final ame c = ame.b("attacking");
   private static final cbq d = new cbq(c, 0.15F, cbq.a.a);
   private static final int e = 400;
   private static final int f = 600;
   private static final alh<Optional<eeb>> ck = all.a(crl.class, alj.j);
   private static final alh<Boolean> cl = all.a(crl.class, alj.k);
   private static final alh<Boolean> cm = all.a(crl.class, alj.k);
   private int cn = Integer.MIN_VALUE;
   private int co;
   private static final bwu cp = bdg.a(20, 39);
   private int cq;
   @Nullable
   private UUID cr;

   public crl(bzv<? extends crl> $$0, dmu $$1) {
      super($$0, $$1);
      this.a(fbc.j, -1.0F);
   }

   @Override
   protected void H() {
      this.ch.a(0, new chc(this));
      this.ch.a(1, new crl.a(this));
      this.ch.a(2, new chs(this, 1.0, false));
      this.ch.a(7, new civ(this, 1.0, 0.0F));
      this.ch.a(8, new chq(this, cut.class, 8.0F));
      this.ch.a(8, new cid(this));
      this.ch.a(10, new crl.b(this));
      this.ch.a(11, new crl.d(this));
      this.ci.a(1, new crl.c(this, this::a));
      this.ci.a(2, new cja(this));
      this.ci.a(3, new cjb<>(this, crm.class, true, false));
      this.ci.a(4, new cjh<>(this, false));
   }

   public static cbr.a l() {
      return crv.gM().a(cbs.t, 40.0).a(cbs.w, 0.3F).a(cbs.c, 7.0).a(cbs.n, 64.0).a(cbs.C, 1.0);
   }

   @Override
   public void g(@Nullable cam $$0) {
      super.g($$0);
      cbo $$1 = this.h(cbs.w);
      if ($$0 == null) {
         this.co = 0;
         this.ay.a(cl, false);
         this.ay.a(cm, false);
         $$1.c(c);
      } else {
         this.co = this.as;
         this.ay.a(cl, true);
         if (!$$1.b(c)) {
            $$1.b(d);
         }
      }
   }

   @Override
   protected void a(all.a $$0) {
      super.a($$0);
      $$0.a(ck, Optional.empty());
      $$0.a(cl, false);
      $$0.a(cm, false);
   }

   @Override
   public void c() {
      this.a(cp.a(this.ar));
   }

   @Override
   public void a(int $$0) {
      this.cq = $$0;
   }

   @Override
   public int a() {
      return this.cq;
   }

   @Override
   public void a(@Nullable UUID $$0) {
      this.cr = $$0;
   }

   @Nullable
   @Override
   public UUID b() {
      return this.cr;
   }

   public void m() {
      if (this.as >= this.cn + 400) {
         this.cn = this.as;
         if (!this.be()) {
            this.ai().a(this.dC(), this.dG(), this.dI(), ayz.iU, this.do(), 2.5F, 1.0F, false);
         }
      }
   }

   @Override
   public void a(alh<?> $$0) {
      if (cl.equals($$0) && this.gI() && this.ai().C) {
         this.m();
      }

      super.a($$0);
   }

   @Override
   protected void a(fdc $$0) {
      super.a($$0);
      eeb $$1 = this.t();
      if ($$1 != null) {
         $$0.a("carriedBlockState", eeb.a, $$1);
      }

      this.a_($$0);
   }

   @Override
   protected void a(fda $$0) {
      super.a($$0);
      this.c($$0.<eeb>a("carriedBlockState", eeb.a).filter($$0x -> !$$0x.l()).orElse(null));
      this.a(this.ai(), $$0);
   }

   boolean g(cut $$0) {
      return !cam.bd.test($$0) ? false : this.a($$0, 0.025, true, false, new double[]{this.dG()});
   }

   @Override
   public void e_() {
      if (this.ai().C) {
         for (int $$0 = 0; $$0 < 2; $$0++) {
            this.ai().a(me.af, this.d(0.5), this.dF() - 0.25, this.g(0.5), (this.ar.j() - 0.5) * 2.0, -this.ar.j(), (this.ar.j() - 0.5) * 2.0);
         }
      }

      this.bB = false;
      if (!this.ai().C) {
         this.a((aub)this.ai(), true);
      }

      super.e_();
   }

   @Override
   public boolean fx() {
      return true;
   }

   @Override
   protected void a(aub $$0) {
      if ($$0.W() && this.as >= this.co + 600) {
         float $$1 = this.bB();
         if ($$1 > 0.5F && $$0.h(this.dx()) && this.ar.i() * 30.0F < ($$1 - 0.4F) * 2.0F) {
            this.g(null);
            this.n();
         }
      }

      super.a($$0);
   }

   protected boolean n() {
      if (!this.ai().B_() && this.bO()) {
         double $$0 = this.dC() + (this.ar.j() - 0.5) * 64.0;
         double $$1 = this.dE() + (this.ar.a(64) - 32);
         double $$2 = this.dI() + (this.ar.j() - 0.5) * 64.0;
         return this.q($$0, $$1, $$2);
      } else {
         return false;
      }
   }

   boolean G(bzm $$0) {
      fis $$1 = new fis(this.dC() - $$0.dC(), this.e(0.5) - $$0.dG(), this.dI() - $$0.dI());
      $$1 = $$1.d();
      double $$2 = 16.0;
      double $$3 = this.dC() + (this.ar.j() - 0.5) * 8.0 - $$1.d * 16.0;
      double $$4 = this.dE() + (this.ar.a(16) - 8) - $$1.e * 16.0;
      double $$5 = this.dI() + (this.ar.j() - 0.5) * 8.0 - $$1.f * 16.0;
      return this.q($$3, $$4, $$5);
   }

   private boolean q(double $$0, double $$1, double $$2) {
      jb.a $$3 = new jb.a($$0, $$1, $$2);

      while ($$3.v() > this.ai().L_() && !this.ai().a_($$3).d()) {
         $$3.c(jh.a);
      }

      eeb $$4 = this.ai().a_($$3);
      boolean $$5 = $$4.d();
      boolean $$6 = $$4.y().a(azu.a);
      if ($$5 && !$$6) {
         fis $$7 = this.dv();
         boolean $$8 = this.b($$0, $$1, $$2, true);
         if ($$8) {
            this.ai().a(ejb.R, $$7, ejb.a.a(this));
            if (!this.be()) {
               this.ai().a(null, this.X, this.Y, this.Z, ayz.iV, this.do(), 1.0F, 1.0F);
               this.a(ayz.iV, 1.0F, 1.0F);
            }
         }

         return $$8;
      } else {
         return false;
      }
   }

   @Override
   protected ayy p() {
      return this.gH() ? ayz.iT : ayz.iQ;
   }

   @Override
   protected ayy e(byb $$0) {
      return ayz.iS;
   }

   @Override
   protected ayy f_() {
      return ayz.iR;
   }

   @Override
   protected void a(aub $$0, byb $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      eeb $$3 = this.t();
      if ($$3 != null) {
         dcv $$4 = new dcv(dcz.qo);
         djk.a($$4, $$0.K_(), dkw.g, $$0.d_(this.dx()), this.ec());
         fdm.a $$5 = new fdm.a((aub)this.ai()).a(fgd.f, this.dv()).a(fgd.i, $$4).b(fgd.a, this);

         for (dcv $$7 : $$3.a($$5)) {
            this.a($$0, $$7);
         }
      }
   }

   public void c(@Nullable eeb $$0) {
      this.ay.a(ck, Optional.ofNullable($$0));
   }

   @Nullable
   public eeb t() {
      return this.ay.a(ck).orElse(null);
   }

   @Override
   public boolean a(aub $$0, byb $$1, float $$2) {
      if (this.a($$0, $$1)) {
         return false;
      } else {
         cvd $$4 = $$1.c() instanceof cvd $$3 ? $$3 : null;
         if (!$$1.a(azp.j) && $$4 == null) {
            boolean $$7 = super.a($$0, $$1, $$2);
            if (!($$1.d() instanceof cam) && this.ar.a(10) != 0) {
               this.n();
            }

            return $$7;
         } else {
            boolean $$5 = $$4 != null && this.a($$0, $$1, $$4, $$2);

            for (int $$6 = 0; $$6 < 64; $$6++) {
               if (this.n()) {
                  return true;
               }
            }

            return $$5;
         }
      }
   }

   private boolean a(aub $$0, byb $$1, cvd $$2, float $$3) {
      dcv $$4 = $$2.e();
      der $$5 = $$4.a(kq.R, der.a);
      return $$5.a(des.a) ? super.a($$0, $$1, $$3) : false;
   }

   public boolean gH() {
      return this.ay.a(cl);
   }

   public boolean gI() {
      return this.ay.a(cm);
   }

   public void gJ() {
      this.ay.a(cm, true);
   }

   @Override
   public boolean af() {
      return super.af() || this.t() != null;
   }

   static class a extends chi {
      private final crl a;
      @Nullable
      private cam b;

      public a(crl $$0) {
         this.a = $$0;
         this.a(EnumSet.of(chi.a.c, chi.a.a));
      }

      @Override
      public boolean b() {
         this.b = this.a.e();
         if (this.b instanceof cut $$0) {
            double $$2 = this.b.g(this.a);
            return $$2 > 256.0 ? false : this.a.g($$0);
         } else {
            return false;
         }
      }

      @Override
      public void d() {
         this.a.S().n();
      }

      @Override
      public void a() {
         this.a.P().a(this.b.dC(), this.b.dG(), this.b.dI());
      }
   }

   static class b extends chi {
      private final crl a;

      public b(crl $$0) {
         this.a = $$0;
      }

      @Override
      public boolean b() {
         if (this.a.t() == null) {
            return false;
         } else {
            return !a(this.a).P().c(dmq.d) ? false : this.a.ec().a(b(2000)) == 0;
         }
      }

      @Override
      public void a() {
         bck $$0 = this.a.ec();
         dmu $$1 = this.a.ai();
         int $$2 = bcb.a(this.a.dC() - 1.0 + $$0.j() * 2.0);
         int $$3 = bcb.a(this.a.dE() + $$0.j() * 2.0);
         int $$4 = bcb.a(this.a.dI() - 1.0 + $$0.j() * 2.0);
         jb $$5 = new jb($$2, $$3, $$4);
         eeb $$6 = $$1.a_($$5);
         jb $$7 = $$5.e();
         eeb $$8 = $$1.a_($$7);
         eeb $$9 = this.a.t();
         if ($$9 != null) {
            $$9 = dpz.b($$9, this.a.ai(), $$5);
            if (this.a($$1, $$5, $$9, $$6, $$8, $$7)) {
               $$1.a($$5, $$9, 3);
               $$1.a(ejb.i, $$5, ejb.a.a(this.a, $$9));
               this.a.c(null);
            }
         }
      }

      private boolean a(dmu $$0, jb $$1, eeb $$2, eeb $$3, eeb $$4, jb $$5) {
         return $$3.l() && !$$4.l() && !$$4.a(dqb.I) && $$4.m($$0, $$5) && $$2.a((dmx)$$0, $$1) && $$0.a_(this.a, fin.a(fis.a($$1))).isEmpty();
      }
   }

   static class c extends cjb<cut> {
      private final crl i;
      @Nullable
      private cut j;
      private int k;
      private int l;
      private final clc m;
      private final clc n = clc.a().d();
      private final clc.a o;

      public c(crl $$0, @Nullable clc.a $$1) {
         super($$0, cut.class, 10, false, false, $$1);
         this.i = $$0;
         this.o = ($$1x, $$2) -> ($$0.g((cut)$$1x) || $$0.a($$1x, $$2)) && !$$0.B($$1x);
         this.m = clc.a().a(this.l()).a(this.o);
      }

      @Override
      public boolean b() {
         this.j = a(this.i).a(this.m.a(this.l()), this.i);
         return this.j != null;
      }

      @Override
      public void d() {
         this.k = this.a(5);
         this.l = 0;
         this.i.gJ();
      }

      @Override
      public void e() {
         this.j = null;
         super.e();
      }

      @Override
      public boolean c() {
         if (this.j != null) {
            if (!this.o.test(this.j, a(this.i))) {
               return false;
            } else {
               this.i.a(this.j, 10.0F, 10.0F);
               return true;
            }
         } else {
            if (this.c != null) {
               if (this.i.B(this.c)) {
                  return false;
               }

               if (this.n.a(a(this.i), this.i, this.c)) {
                  return true;
               }
            }

            return super.c();
         }
      }

      @Override
      public void a() {
         if (this.i.e() == null) {
            super.a(null);
         }

         if (this.j != null) {
            if (--this.k <= 0) {
               this.c = this.j;
               this.j = null;
               super.d();
            }
         } else {
            if (this.c != null && !this.i.cc()) {
               if (this.i.g((cut)this.c)) {
                  if (this.c.g(this.i) < 16.0) {
                     this.i.n();
                  }

                  this.l = 0;
               } else if (this.c.g(this.i) > 256.0 && this.l++ >= this.a(30) && this.i.G(this.c)) {
                  this.l = 0;
               }
            }

            super.a();
         }
      }
   }

   static class d extends chi {
      private final crl a;

      public d(crl $$0) {
         this.a = $$0;
      }

      @Override
      public boolean b() {
         if (this.a.t() != null) {
            return false;
         } else {
            return !a(this.a).P().c(dmq.d) ? false : this.a.ec().a(b(20)) == 0;
         }
      }

      @Override
      public void a() {
         bck $$0 = this.a.ec();
         dmu $$1 = this.a.ai();
         int $$2 = bcb.a(this.a.dC() - 2.0 + $$0.j() * 4.0);
         int $$3 = bcb.a(this.a.dE() + $$0.j() * 3.0);
         int $$4 = bcb.a(this.a.dI() - 2.0 + $$0.j() * 4.0);
         jb $$5 = new jb($$2, $$3, $$4);
         eeb $$6 = $$1.a_($$5);
         fis $$7 = new fis(this.a.dB() + 0.5, $$3 + 0.5, this.a.dH() + 0.5);
         fis $$8 = new fis($$2 + 0.5, $$3 + 0.5, $$4 + 0.5);
         fio $$9 = $$1.a(new dmb($$7, $$8, dmb.a.b, dmb.b.a, this.a));
         boolean $$10 = $$9.b().equals($$5);
         if ($$6.a(azo.at) && $$10) {
            $$1.a($$5, false);
            $$1.a(ejb.f, $$5, ejb.a.a(this.a, $$6));
            this.a.c($$6.b().m());
         }
      }
   }
}
