import com.mojang.logging.LogUtils;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class cvk extends cvo {
   private static final Logger a = LogUtils.getLogger();
   private final bck b = bck.a();
   private boolean c;
   private int d;
   private static final int f = 10;
   private static final alh<Integer> g = all.a(cvk.class, alj.b);
   private static final alh<Boolean> h = all.a(cvk.class, alj.k);
   private int i;
   private int j;
   private int k;
   private int l;
   private float m;
   private boolean n = true;
   @Nullable
   private bzm o;
   private cvk.a p = cvk.a.a;
   private final int q;
   private final int r;
   private final cah s = new cah(this);

   private cvk(bzv<? extends cvk> $$0, dmu $$1, int $$2, int $$3) {
      super($$0, $$1);
      this.q = Math.max(0, $$2);
      this.r = Math.max(0, $$3);
   }

   public cvk(bzv<? extends cvk> $$0, dmu $$1) {
      this($$0, $$1, 0, 0);
   }

   public cvk(cut $$0, dmu $$1, int $$2, int $$3) {
      this(bzv.bV, $$1, $$2, $$3);
      this.c($$0);
      float $$4 = $$0.dR();
      float $$5 = $$0.dP();
      float $$6 = bcb.b(-$$5 * (float) (Math.PI / 180.0) - (float) Math.PI);
      float $$7 = bcb.a(-$$5 * (float) (Math.PI / 180.0) - (float) Math.PI);
      float $$8 = -bcb.b(-$$4 * (float) (Math.PI / 180.0));
      float $$9 = bcb.a(-$$4 * (float) (Math.PI / 180.0));
      double $$10 = $$0.dC() - $$7 * 0.3;
      double $$11 = $$0.dG();
      double $$12 = $$0.dI() - $$6 * 0.3;
      this.b($$10, $$11, $$12, $$5, $$4);
      fis $$13 = new fis(-$$7, bcb.a(-($$9 / $$8), -5.0F, 5.0F), -$$6);
      double $$14 = $$13.g();
      $$13 = $$13.d(0.6 / $$14 + this.ar.a(0.5, 0.0103365), 0.6 / $$14 + this.ar.a(0.5, 0.0103365), 0.6 / $$14 + this.ar.a(0.5, 0.0103365));
      this.i($$13);
      this.v((float)(bcb.d($$13.d, $$13.f) * 180.0F / (float)Math.PI));
      this.w((float)(bcb.d($$13.e, $$13.i()) * 180.0F / (float)Math.PI));
      this.aa = this.dP();
      this.ab = this.dR();
   }

   @Nonnull
   @Override
   public cah l_() {
      return this.s;
   }

   @Override
   protected void a(all.a $$0) {
      $$0.a(g, 0);
      $$0.a(h, false);
   }

   @Override
   protected boolean w() {
      return true;
   }

   @Override
   public void a(alh<?> $$0) {
      if (g.equals($$0)) {
         int $$1 = this.au().a(g);
         this.o = $$1 > 0 ? this.ai().a($$1 - 1) : null;
      }

      if (h.equals($$0)) {
         this.c = this.au().a(h);
         if (this.c) {
            this.n(this.dA().d, -0.4F * bcb.a(this.b, 0.6F, 1.0F), this.dA().f);
         }
      }

      super.a($$0);
   }

   @Override
   public boolean a(double $$0) {
      double $$1 = 64.0;
      return $$0 < 4096.0;
   }

   @Override
   public void g() {
      this.b.b(this.cK().getLeastSignificantBits() ^ this.ai().ae());
      this.l_().e();
      super.g();
      cut $$0 = this.f();
      if ($$0 == null) {
         this.at();
      } else if (this.ai().C || !this.a($$0)) {
         if (this.aK()) {
            this.i++;
            if (this.i >= 1200) {
               this.at();
               return;
            }
         } else {
            this.i = 0;
         }

         float $$1 = 0.0F;
         jb $$2 = this.dx();
         fal $$3 = this.ai().b_($$2);
         if ($$3.a(azu.a)) {
            $$1 = $$3.a(this.ai(), $$2);
         }

         boolean $$4 = $$1 > 0.0F;
         if (this.p == cvk.a.a) {
            if (this.o != null) {
               this.i(fis.c);
               this.p = cvk.a.b;
               return;
            }

            if ($$4) {
               this.i(this.dA().d(0.3, 0.2, 0.3));
               this.p = cvk.a.c;
               return;
            }

            this.l();
         } else {
            if (this.p == cvk.a.b) {
               if (this.o != null) {
                  if (!this.o.dU() && this.o.ai().aj() == this.ai().aj()) {
                     this.a_(this.o.dC(), this.o.e(0.8), this.o.dI());
                  } else {
                     this.C(null);
                     this.p = cvk.a.a;
                  }
               }

               return;
            }

            if (this.p == cvk.a.c) {
               fis $$5 = this.dA();
               double $$6 = this.dE() + $$5.e - $$2.v() - $$1;
               if (Math.abs($$6) < 0.01) {
                  $$6 += Math.signum($$6) * 0.1;
               }

               this.n($$5.d * 0.9, $$5.e - $$6 * this.ar.i() * 0.2, $$5.f * 0.9);
               if (this.j <= 0 && this.l <= 0) {
                  this.n = true;
               } else {
                  this.n = this.n && this.d < 10 && this.b($$2);
               }

               if ($$4) {
                  this.d = Math.max(0, this.d - 1);
                  if (this.c) {
                     this.i(this.dA().b(0.0, -0.1 * this.b.i() * this.b.i(), 0.0));
                  }

                  if (!this.ai().C) {
                     this.a($$2);
                  }
               } else {
                  this.d = Math.min(10, this.d + 1);
               }
            }
         }

         if (!$$3.a(azu.a) && !this.aK() && this.o == null) {
            this.i(this.dA().b(0.0, -0.03, 0.0));
         }

         this.a(caq.a, this.dA());
         this.aL();
         this.z();
         if (this.p == cvk.a.a && (this.aK() || this.ac)) {
            this.i(fis.c);
         }

         double $$7 = 0.92;
         this.i(this.dA().c(0.92));
         this.ay();
      }
   }

   private boolean a(cut $$0) {
      dcv $$1 = $$0.fh();
      dcv $$2 = $$0.fi();
      boolean $$3 = $$1.a(dcz.su);
      boolean $$4 = $$2.a(dcz.su);
      if (!$$0.dU() && $$0.bO() && ($$3 || $$4) && !(this.g($$0) > 1024.0)) {
         return false;
      } else {
         this.at();
         return true;
      }
   }

   private void l() {
      fiq $$0 = cvq.a(this, this::b);
      this.b($$0);
   }

   @Override
   protected boolean b(bzm $$0) {
      return super.b($$0) || $$0.bO() && $$0 instanceof cqz;
   }

   @Override
   protected void a(fip $$0) {
      super.a($$0);
      if (!this.ai().C) {
         this.C($$0.a());
      }
   }

   @Override
   protected void a(fio $$0) {
      super.a($$0);
      this.i(this.dA().d().c($$0.a(this)));
   }

   private void C(@Nullable bzm $$0) {
      this.o = $$0;
      this.au().a(g, $$0 == null ? 0 : $$0.ar() + 1);
   }

   private void a(jb $$0) {
      aub $$1 = (aub)this.ai();
      int $$2 = 1;
      jb $$3 = $$0.d();
      if (this.ar.i() < 0.25F && this.ai().r($$3)) {
         $$2++;
      }

      if (this.ar.i() < 0.5F && !this.ai().h($$3)) {
         $$2--;
      }

      if (this.j > 0) {
         this.j--;
         if (this.j <= 0) {
            this.k = 0;
            this.l = 0;
            this.au().a(h, false);
         }
      } else if (this.l > 0) {
         this.l -= $$2;
         if (this.l > 0) {
            this.m = this.m + (float)this.ar.a(0.0, 9.188);
            float $$4 = this.m * (float) (Math.PI / 180.0);
            float $$5 = bcb.a($$4);
            float $$6 = bcb.b($$4);
            double $$7 = this.dC() + $$5 * this.l * 0.1F;
            double $$8 = bcb.a(this.dE()) + 1.0F;
            double $$9 = this.dI() + $$6 * this.l * 0.1F;
            eeb $$10 = $$1.a_(jb.a($$7, $$8 - 1.0, $$9));
            if ($$10.a(dqb.J)) {
               if (this.ar.i() < 0.15F) {
                  $$1.a(me.d, $$7, $$8 - 0.1F, $$9, 1, $$5, 0.1, $$6, 0.0);
               }

               float $$11 = $$5 * 0.04F;
               float $$12 = $$6 * 0.04F;
               $$1.a(me.E, $$7, $$8, $$9, 0, $$12, 0.01, -$$11, 1.0);
               $$1.a(me.E, $$7, $$8, $$9, 0, -$$12, 0.01, $$11, 1.0);
            }
         } else {
            this.a(ayz.jK, 0.25F, 1.0F + (this.ar.i() - this.ar.i()) * 0.4F);
            double $$13 = this.dE() + 0.5;
            $$1.a(me.d, this.dC(), $$13, this.dI(), (int)(1.0F + this.ds() * 20.0F), this.ds(), 0.0, this.ds(), 0.2F);
            $$1.a(me.E, this.dC(), $$13, this.dI(), (int)(1.0F + this.ds() * 20.0F), this.ds(), 0.0, this.ds(), 0.2F);
            this.j = bcb.a(this.ar, 20, 40);
            this.au().a(h, true);
         }
      } else if (this.k > 0) {
         this.k -= $$2;
         float $$14 = 0.15F;
         if (this.k < 20) {
            $$14 += (20 - this.k) * 0.05F;
         } else if (this.k < 40) {
            $$14 += (40 - this.k) * 0.02F;
         } else if (this.k < 60) {
            $$14 += (60 - this.k) * 0.01F;
         }

         if (this.ar.i() < $$14) {
            float $$15 = bcb.a(this.ar, 0.0F, 360.0F) * (float) (Math.PI / 180.0);
            float $$16 = bcb.a(this.ar, 25.0F, 60.0F);
            double $$17 = this.dC() + bcb.a($$15) * $$16 * 0.1;
            double $$18 = bcb.a(this.dE()) + 1.0F;
            double $$19 = this.dI() + bcb.b($$15) * $$16 * 0.1;
            eeb $$20 = $$1.a_(jb.a($$17, $$18 - 1.0, $$19));
            if ($$20.a(dqb.J)) {
               $$1.a(me.ap, $$17, $$18, $$19, 2 + this.ar.a(2), 0.1F, 0.0, 0.1F, 0.0);
            }
         }

         if (this.k <= 0) {
            this.m = bcb.a(this.ar, 0.0F, 360.0F);
            this.l = bcb.a(this.ar, 20, 80);
         }
      } else {
         this.k = bcb.a(this.ar, 100, 600);
         this.k = this.k - this.r;
      }
   }

   private boolean b(jb $$0) {
      cvk.b $$1 = cvk.b.c;

      for (int $$2 = -1; $$2 <= 2; $$2++) {
         cvk.b $$3 = this.a($$0.b(-2, $$2, -2), $$0.b(2, $$2, 2));
         switch ($$3) {
            case a:
               if ($$1 == cvk.b.c) {
                  return false;
               }
               break;
            case b:
               if ($$1 == cvk.b.a) {
                  return false;
               }
               break;
            case c:
               return false;
         }

         $$1 = $$3;
      }

      return true;
   }

   private cvk.b a(jb $$0, jb $$1) {
      return jb.d($$0, $$1).map(this::c).reduce(($$0x, $$1x) -> $$0x == $$1x ? $$0x : cvk.b.c).orElse(cvk.b.c);
   }

   private cvk.b c(jb $$0) {
      eeb $$1 = this.ai().a_($$0);
      if (!$$1.l() && !$$1.a(dqb.fF)) {
         fal $$2 = $$1.y();
         return $$2.a(azu.a) && $$2.b() && $$1.g(this.ai(), $$0).c() ? cvk.b.b : cvk.b.c;
      } else {
         return cvk.b.a;
      }
   }

   public boolean e() {
      return this.n;
   }

   @Override
   protected void a(fdc $$0) {
   }

   @Override
   protected void a(fda $$0) {
   }

   public int a(dcv $$0) {
      cut $$1 = this.f();
      if (!this.ai().C && $$1 != null && !this.a($$1)) {
         int $$2 = 0;
         if (this.o != null) {
            this.d(this.o);
            aq.E.a((auc)$$1, $$0, this, Collections.emptyList());
            this.ai().a(this, (byte)31);
            $$2 = this.o instanceof cqz ? 3 : 5;
         } else if (this.j > 0) {
            fdm $$3 = new fdm.a((aub)this.ai()).a(fgd.f, this.dv()).a(fgd.i, $$0).a(fgd.a, this).a(this.q + $$1.em()).a(fgc.f);
            fdo $$4 = this.ai().q().bc().a(fdf.am);
            List<dcv> $$5 = $$4.a($$3);
            aq.E.a((auc)$$1, $$0, this, $$5);

            for (dcv $$6 : $$5) {
               cqz $$7 = new cqz(this.ai(), this.dC(), this.dE(), this.dI(), $$6);
               double $$8 = $$1.dC() - this.dC();
               double $$9 = $$1.dE() - this.dE();
               double $$10 = $$1.dI() - this.dI();
               double $$11 = 0.1;
               $$7.n($$8 * 0.1, $$9 * 0.1 + Math.sqrt(Math.sqrt($$8 * $$8 + $$9 * $$9 + $$10 * $$10)) * 0.08, $$10 * 0.1);
               this.ai().b($$7);
               $$1.ai().b(new caa($$1.ai(), $$1.dC(), $$1.dE() + 0.5, $$1.dI() + 0.5, this.ar.a(6) + 1));
               if ($$6.a(azx.bb)) {
                  $$1.a(azj.S, 1);
               }
            }

            $$2 = 1;
         }

         if (this.aK()) {
            $$2 = 2;
         }

         this.at();
         return $$2;
      } else {
         return 0;
      }
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 31 && this.ai().C && this.o instanceof cut $$1 && $$1.gq()) {
         this.d(this.o);
      }

      super.b($$0);
   }

   protected void d(bzm $$0) {
      bzm $$1 = this.ah_();
      if ($$1 != null) {
         fis $$2 = new fis($$1.dC() - this.dC(), $$1.dE() - this.dE(), $$1.dI() - this.dI()).c(0.1);
         $$0.i($$0.dA().e($$2));
      }
   }

   @Override
   protected bzm.d bj() {
      return bzm.d.a;
   }

   @Override
   public void a(bzm.e $$0) {
      this.a(null);
      super.a($$0);
   }

   @Override
   public void av() {
      this.a(null);
   }

   @Override
   public void c(@Nullable bzm $$0) {
      super.c($$0);
      this.a(this);
   }

   private void a(@Nullable cvk $$0) {
      cut $$1 = this.f();
      if ($$1 != null) {
         $$1.cG = $$0;
      }
   }

   @Nullable
   public cut f() {
      return this.ah_() instanceof cut $$1 ? $$1 : null;
   }

   @Nullable
   public bzm i() {
      return this.o;
   }

   @Override
   public boolean o(boolean $$0) {
      return false;
   }

   @Override
   public zw<acq> a(atz $$0) {
      bzm $$1 = this.ah_();
      return new acr(this, $$0, $$1 == null ? this.ar() : $$1.ar());
   }

   @Override
   public void a(acr $$0) {
      super.a($$0);
      if (this.f() == null) {
         int $$1 = $$0.p();
         a.error("Failed to recreate fishing hook on client. {} (id: {}) is not a valid owner.", this.ai().a($$1), $$1);
         this.at();
      }
   }

   static enum a {
      a,
      b,
      c;
   }

   static enum b {
      a,
      b,
      c;
   }
}
