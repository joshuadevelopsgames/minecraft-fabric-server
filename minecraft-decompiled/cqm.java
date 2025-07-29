import com.google.common.collect.ImmutableList;
import java.util.EnumSet;
import java.util.List;
import javax.annotation.Nullable;

public class cqm extends crv implements crz {
   private static final alh<Integer> a = all.a(cqm.class, alj.b);
   private static final alh<Integer> b = all.a(cqm.class, alj.b);
   private static final alh<Integer> c = all.a(cqm.class, alj.b);
   private static final List<alh<Integer>> d = ImmutableList.of(a, b, c);
   private static final alh<Integer> e = all.a(cqm.class, alj.b);
   private static final int f = 220;
   private static final int ck = 0;
   private final float[] cl = new float[2];
   private final float[] cm = new float[2];
   private final float[] cn = new float[2];
   private final float[] co = new float[2];
   private final int[] cp = new int[2];
   private final int[] cq = new int[2];
   private int cr;
   private final atx cs = (atx)new atx(this.Q_(), bwz.a.f, bwz.b.a).a(true);
   private static final clc.a ct = ($$0, $$1) -> !$$0.ap().a(azs.y) && $$0.fT();
   private static final clc cu = clc.a().a(20.0).a(ct);

   public cqm(bzv<? extends cqm> $$0, dmu $$1) {
      super($$0, $$1);
      this.ce = new cgi(this, 10, false);
      this.x(this.fa());
      this.cc = 50;
   }

   @Override
   protected cjw b(dmu $$0) {
      cju $$1 = new cju(this, $$0);
      $$1.d(false);
      $$1.a(true);
      return $$1;
   }

   @Override
   protected void H() {
      this.ch.a(0, new cqm.a());
      this.ch.a(2, new cih(this, 1.0, 40, 20.0F));
      this.ch.a(5, new ciu(this, 1.0));
      this.ch.a(6, new chq(this, cut.class, 8.0F));
      this.ch.a(7, new cid(this));
      this.ci.a(1, new cja(this));
      this.ci.a(2, new cjb<>(this, cam.class, 0, false, false, ct));
   }

   @Override
   protected void a(all.a $$0) {
      super.a($$0);
      $$0.a(a, 0);
      $$0.a(b, 0);
      $$0.a(c, 0);
      $$0.a(e, 0);
   }

   @Override
   protected void a(fdc $$0) {
      super.a($$0);
      $$0.a("Invul", this.gH());
   }

   @Override
   protected void a(fda $$0) {
      super.a($$0);
      this.b($$0.a("Invul", 0));
      if (this.i_()) {
         this.cs.a(this.Q_());
      }
   }

   @Override
   public void b(@Nullable xo $$0) {
      super.b($$0);
      this.cs.a(this.Q_());
   }

   @Override
   protected ayy p() {
      return ayz.Eb;
   }

   @Override
   protected ayy e(byb $$0) {
      return ayz.Ee;
   }

   @Override
   protected ayy f_() {
      return ayz.Ed;
   }

   @Override
   public void e_() {
      fis $$0 = this.dA().d(1.0, 0.6, 1.0);
      if (!this.ai().C && this.c(0) > 0) {
         bzm $$1 = this.ai().a(this.c(0));
         if ($$1 != null) {
            double $$2 = $$0.e;
            if (this.dE() < $$1.dE() || !this.gI() && this.dE() < $$1.dE() + 5.0) {
               $$2 = Math.max(0.0, $$2);
               $$2 += 0.3 - $$2 * 0.6F;
            }

            $$0 = new fis($$0.d, $$2, $$0.f);
            fis $$3 = new fis($$1.dC() - this.dC(), 0.0, $$1.dI() - this.dI());
            if ($$3.j() > 9.0) {
               fis $$4 = $$3.d();
               $$0 = $$0.b($$4.d * 0.3 - $$0.d * 0.6, 0.0, $$4.f * 0.3 - $$0.f * 0.6);
            }
         }
      }

      this.i($$0);
      if ($$0.j() > 0.05) {
         this.v((float)bcb.d($$0.f, $$0.d) * (180.0F / (float)Math.PI) - 90.0F);
      }

      super.e_();

      for (int $$5 = 0; $$5 < 2; $$5++) {
         this.co[$$5] = this.cm[$$5];
         this.cn[$$5] = this.cl[$$5];
      }

      for (int $$6 = 0; $$6 < 2; $$6++) {
         int $$7 = this.c($$6 + 1);
         bzm $$8 = null;
         if ($$7 > 0) {
            $$8 = this.ai().a($$7);
         }

         if ($$8 != null) {
            double $$9 = this.r($$6 + 1);
            double $$10 = this.s($$6 + 1);
            double $$11 = this.t($$6 + 1);
            double $$12 = $$8.dC() - $$9;
            double $$13 = $$8.dG() - $$10;
            double $$14 = $$8.dI() - $$11;
            double $$15 = Math.sqrt($$12 * $$12 + $$14 * $$14);
            float $$16 = (float)(bcb.d($$14, $$12) * 180.0F / (float)Math.PI) - 90.0F;
            float $$17 = (float)(-(bcb.d($$13, $$15) * 180.0F / (float)Math.PI));
            this.cl[$$6] = this.a(this.cl[$$6], $$17, 40.0F);
            this.cm[$$6] = this.a(this.cm[$$6], $$16, 10.0F);
         } else {
            this.cm[$$6] = this.a(this.cm[$$6], this.br, 10.0F);
         }
      }

      boolean $$18 = this.gI();

      for (int $$19 = 0; $$19 < 3; $$19++) {
         double $$20 = this.r($$19);
         double $$21 = this.s($$19);
         double $$22 = this.t($$19);
         float $$23 = 0.3F * this.eq();
         this.ai().a(me.ah, $$20 + this.ar.k() * $$23, $$21 + this.ar.k() * $$23, $$22 + this.ar.k() * $$23, 0.0, 0.0, 0.0);
         if ($$18 && this.ai().A.a(4) == 0) {
            this.ai().a(lx.a(me.u, 0.7F, 0.7F, 0.5F), $$20 + this.ar.k() * $$23, $$21 + this.ar.k() * $$23, $$22 + this.ar.k() * $$23, 0.0, 0.0, 0.0);
         }
      }

      if (this.gH() > 0) {
         float $$24 = 3.3F * this.eq();

         for (int $$25 = 0; $$25 < 3; $$25++) {
            this.ai().a(lx.a(me.u, 0.7F, 0.7F, 0.9F), this.dC() + this.ar.k(), this.dE() + this.ar.i() * $$24, this.dI() + this.ar.k(), 0.0, 0.0, 0.0);
         }
      }
   }

   @Override
   protected void a(aub $$0) {
      if (this.gH() > 0) {
         int $$1 = this.gH() - 1;
         this.cs.a(1.0F - $$1 / 220.0F);
         if ($$1 <= 0) {
            $$0.a(this, this.dC(), this.dG(), this.dI(), 7.0F, false, dmu.a.c);
            if (!this.be()) {
               $$0.b(1023, this.dx(), 0);
            }
         }

         this.b($$1);
         if (this.as % 10 == 0) {
            this.d(10.0F);
         }
      } else {
         super.a($$0);

         for (int $$2 = 1; $$2 < 3; $$2++) {
            if (this.as >= this.cp[$$2 - 1]) {
               this.cp[$$2 - 1] = this.as + 10 + this.ar.a(10);
               if (($$0.an() == bxg.c || $$0.an() == bxg.d) && this.cq[$$2 - 1]++ > 15) {
                  float $$3 = 10.0F;
                  float $$4 = 5.0F;
                  double $$5 = bcb.a(this.ar, this.dC() - 10.0, this.dC() + 10.0);
                  double $$6 = bcb.a(this.ar, this.dE() - 5.0, this.dE() + 5.0);
                  double $$7 = bcb.a(this.ar, this.dI() - 10.0, this.dI() + 10.0);
                  this.a($$2 + 1, $$5, $$6, $$7, true);
                  this.cq[$$2 - 1] = 0;
               }

               int $$8 = this.c($$2);
               if ($$8 > 0) {
                  cam $$9 = (cam)$$0.a($$8);
                  if ($$9 != null && this.c($$9) && !(this.g((bzm)$$9) > 900.0) && this.F($$9)) {
                     this.a($$2 + 1, $$9);
                     this.cp[$$2 - 1] = this.as + 40 + this.ar.a(20);
                     this.cq[$$2 - 1] = 0;
                  } else {
                     this.a($$2, 0);
                  }
               } else {
                  List<cam> $$10 = $$0.a(cam.class, cu, this, this.cV().c(20.0, 8.0, 20.0));
                  if (!$$10.isEmpty()) {
                     cam $$11 = $$10.get(this.ar.a($$10.size()));
                     this.a($$2, $$11.ar());
                  }
               }
            }
         }

         if (this.e() != null) {
            this.a(0, this.e().ar());
         } else {
            this.a(0, 0);
         }

         if (this.cr > 0) {
            this.cr--;
            if (this.cr == 0 && $$0.P().c(dmq.d)) {
               boolean $$12 = false;
               int $$13 = bcb.d(this.ds() / 2.0F + 1.0F);
               int $$14 = bcb.d(this.dt());

               for (jb $$15 : jb.b(this.dB() - $$13, this.dD(), this.dH() - $$13, this.dB() + $$13, this.dD() + $$14, this.dH() + $$13)) {
                  eeb $$16 = $$0.a_($$15);
                  if (c($$16)) {
                     $$12 = $$0.a($$15, true, this) || $$12;
                  }
               }

               if ($$12) {
                  $$0.a(null, 1022, this.dx(), 0);
               }
            }
         }

         if (this.as % 20 == 0) {
            this.d(1.0F);
         }

         this.cs.a(this.eL() / this.fa());
      }
   }

   public static boolean c(eeb $$0) {
      return !$$0.l() && !$$0.a(azo.aK);
   }

   @Override
   public void l() {
      this.b(220);
      this.cs.a(0.0F);
      this.x(this.fa() / 3.0F);
   }

   @Override
   public void a(eeb $$0, fis $$1) {
   }

   @Override
   public void d(auc $$0) {
      super.d($$0);
      this.cs.a($$0);
   }

   @Override
   public void e(auc $$0) {
      super.e($$0);
      this.cs.b($$0);
   }

   private double r(int $$0) {
      if ($$0 <= 0) {
         return this.dC();
      } else {
         float $$1 = (this.br + 180 * ($$0 - 1)) * (float) (Math.PI / 180.0);
         float $$2 = bcb.b($$1);
         return this.dC() + $$2 * 1.3 * this.eq();
      }
   }

   private double s(int $$0) {
      float $$1 = $$0 <= 0 ? 3.0F : 2.2F;
      return this.dE() + $$1 * this.eq();
   }

   private double t(int $$0) {
      if ($$0 <= 0) {
         return this.dI();
      } else {
         float $$1 = (this.br + 180 * ($$0 - 1)) * (float) (Math.PI / 180.0);
         float $$2 = bcb.a($$1);
         return this.dI() + $$2 * 1.3 * this.eq();
      }
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

   private void a(int $$0, cam $$1) {
      this.a($$0, $$1.dC(), $$1.dE() + $$1.cW() * 0.5, $$1.dI(), $$0 == 0 && this.ar.i() < 0.001F);
   }

   private void a(int $$0, double $$1, double $$2, double $$3, boolean $$4) {
      if (!this.be()) {
         this.ai().a(null, 1024, this.dx(), 0);
      }

      double $$5 = this.r($$0);
      double $$6 = this.s($$0);
      double $$7 = this.t($$0);
      double $$8 = $$1 - $$5;
      double $$9 = $$2 - $$6;
      double $$10 = $$3 - $$7;
      fis $$11 = new fis($$8, $$9, $$10);
      cwd $$12 = new cwd(this.ai(), this, $$11.d());
      $$12.c(this);
      if ($$4) {
         $$12.a(true);
      }

      $$12.a_($$5, $$6, $$7);
      this.ai().b($$12);
   }

   @Override
   public void a(cam $$0, float $$1) {
      this.a(0, $$0);
   }

   @Override
   public boolean a(aub $$0, byb $$1, float $$2) {
      if (this.a($$0, $$1)) {
         return false;
      } else if ($$1.a(azp.t) || $$1.d() instanceof cqm) {
         return false;
      } else if (this.gH() > 0 && !$$1.a(azp.d)) {
         return false;
      } else {
         if (this.gI()) {
            bzm $$3 = $$1.c();
            if ($$3 instanceof cvb || $$3 instanceof cwh) {
               return false;
            }
         }

         bzm $$4 = $$1.d();
         if ($$4 != null && $$4.ap().a(azs.y)) {
            return false;
         } else {
            if (this.cr <= 0) {
               this.cr = 20;
            }

            for (int $$5 = 0; $$5 < this.cq.length; $$5++) {
               this.cq[$$5] = this.cq[$$5] + 3;
            }

            return super.a($$0, $$1, $$2);
         }
      }
   }

   @Override
   protected void a(aub $$0, byb $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      cqz $$3 = this.a($$0, dcz.vU);
      if ($$3 != null) {
         $$3.s();
      }
   }

   @Override
   public void dJ() {
      if (this.ai().an() == bxg.a && this.ag()) {
         this.at();
      } else {
         this.bz = 0;
      }
   }

   @Override
   public boolean b(byq $$0, @Nullable bzm $$1) {
      return false;
   }

   public static cbr.a m() {
      return crv.gM().a(cbs.t, 300.0).a(cbs.w, 0.6F).a(cbs.m, 0.6F).a(cbs.n, 40.0).a(cbs.a, 4.0);
   }

   public float[] n() {
      return this.cm;
   }

   public float[] t() {
      return this.cl;
   }

   public int gH() {
      return this.ay.a(e);
   }

   public void b(int $$0) {
      this.ay.a(e, $$0);
   }

   public int c(int $$0) {
      return this.ay.a(d.get($$0));
   }

   public void a(int $$0, int $$1) {
      this.ay.a(d.get($$0), $$1);
   }

   public boolean gI() {
      return this.eL() <= this.fa() / 2.0F;
   }

   @Override
   protected boolean p(bzm $$0) {
      return false;
   }

   @Override
   public boolean o(boolean $$0) {
      return false;
   }

   @Override
   public boolean b(byq $$0) {
      return $$0.a(bys.t) ? false : super.b($$0);
   }

   class a extends chi {
      public a() {
         this.a(EnumSet.of(chi.a.a, chi.a.c, chi.a.b));
      }

      @Override
      public boolean b() {
         return cqm.this.gH() > 0;
      }
   }
}
