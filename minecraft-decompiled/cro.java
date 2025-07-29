import java.util.List;
import javax.annotation.Nullable;

public class cro extends csf {
   @Nullable
   private cpd a;

   public cro(bzv<? extends cro> $$0, dmu $$1) {
      super($$0, $$1);
      this.cc = 10;
   }

   @Override
   protected void H() {
      super.H();
      this.ch.a(0, new chc(this));
      this.ch.a(1, new cro.b());
      this.ch.a(2, new cgp<>(this, cut.class, 8.0F, 0.6, 1.0));
      this.ch.a(3, new cgp<>(this, csz.class, 8.0F, 0.6, 1.0));
      this.ch.a(4, new cro.c());
      this.ch.a(5, new cro.a());
      this.ch.a(6, new cro.d());
      this.ch.a(8, new cif(this, 0.6));
      this.ch.a(9, new chq(this, cut.class, 3.0F, 1.0F));
      this.ch.a(10, new chq(this, cao.class, 8.0F));
      this.ci.a(1, new cja(this, cwk.class).a());
      this.ci.a(2, new cjb<>(this, cut.class, true).c(300));
      this.ci.a(3, new cjb<>(this, cua.class, false).c(300));
      this.ci.a(3, new cjb<>(this, cmv.class, false));
   }

   public static cbr.a m() {
      return crv.gM().a(cbs.w, 0.5).a(cbs.n, 12.0).a(cbs.t, 24.0);
   }

   @Override
   public ayy ag_() {
      return ayz.jg;
   }

   @Override
   protected boolean u(bzm $$0) {
      if ($$0 == this) {
         return true;
      } else if (super.u($$0)) {
         return true;
      } else {
         return $$0 instanceof csj $$1 && $$1.m() != null ? this.u($$1.m()) : false;
      }
   }

   @Override
   protected ayy p() {
      return ayz.je;
   }

   @Override
   protected ayy f_() {
      return ayz.jh;
   }

   @Override
   protected ayy e(byb $$0) {
      return ayz.jj;
   }

   void a(@Nullable cpd $$0) {
      this.a = $$0;
   }

   @Nullable
   cpd hb() {
      return this.a;
   }

   @Override
   protected ayy t() {
      return ayz.jf;
   }

   @Override
   public void a(aub $$0, int $$1, boolean $$2) {
   }

   class a extends csf.c {
      @Override
      protected int h() {
         return 40;
      }

      @Override
      protected int i() {
         return 100;
      }

      @Override
      protected void k() {
         cam $$0 = cro.this.e();
         double $$1 = Math.min($$0.dE(), cro.this.dE());
         double $$2 = Math.max($$0.dE(), cro.this.dE()) + 1.0;
         float $$3 = (float)bcb.d($$0.dI() - cro.this.dI(), $$0.dC() - cro.this.dC());
         if (cro.this.g((bzm)$$0) < 9.0) {
            for (int $$4 = 0; $$4 < 5; $$4++) {
               float $$5 = $$3 + $$4 * (float) Math.PI * 0.4F;
               this.a(cro.this.dC() + bcb.b($$5) * 1.5, cro.this.dI() + bcb.a($$5) * 1.5, $$1, $$2, $$5, 0);
            }

            for (int $$6 = 0; $$6 < 8; $$6++) {
               float $$7 = $$3 + $$6 * (float) Math.PI * 2.0F / 8.0F + (float) (Math.PI * 2.0 / 5.0);
               this.a(cro.this.dC() + bcb.b($$7) * 2.5, cro.this.dI() + bcb.a($$7) * 2.5, $$1, $$2, $$7, 3);
            }
         } else {
            for (int $$8 = 0; $$8 < 16; $$8++) {
               double $$9 = 1.25 * ($$8 + 1);
               int $$10 = 1 * $$8;
               this.a(cro.this.dC() + bcb.b($$3) * $$9, cro.this.dI() + bcb.a($$3) * $$9, $$1, $$2, $$3, $$10);
            }
         }
      }

      private void a(double $$0, double $$1, double $$2, double $$3, float $$4, int $$5) {
         jb $$6 = jb.a($$0, $$3, $$1);
         boolean $$7 = false;
         double $$8 = 0.0;

         do {
            jb $$9 = $$6.e();
            eeb $$10 = cro.this.ai().a_($$9);
            if ($$10.c(cro.this.ai(), $$9, jh.b)) {
               if (!cro.this.ai().w($$6)) {
                  eeb $$11 = cro.this.ai().a_($$6);
                  fjm $$12 = $$11.g(cro.this.ai(), $$6);
                  if (!$$12.c()) {
                     $$8 = $$12.c(jh.a.b);
                  }
               }

               $$7 = true;
               break;
            }

            $$6 = $$6.e();
         } while ($$6.v() >= bcb.a($$2) - 1);

         if ($$7) {
            cro.this.ai().b(new cvg(cro.this.ai(), $$0, $$6.v() + $$8, $$1, $$4, $$5, cro.this));
            cro.this.ai().a(ejb.t, new fis($$0, $$6.v() + $$8, $$1), ejb.a.a(cro.this));
         }
      }

      @Override
      protected ayy l() {
         return ayz.jk;
      }

      @Override
      protected csf.a m() {
         return csf.a.c;
      }
   }

   class b extends csf.b {
      @Override
      public void a() {
         if (cro.this.e() != null) {
            cro.this.P().a(cro.this.e(), cro.this.gh(), cro.this.gg());
         } else if (cro.this.hb() != null) {
            cro.this.P().a(cro.this.hb(), cro.this.gh(), cro.this.gg());
         }
      }
   }

   class c extends csf.c {
      private final clc e = clc.b().a(16.0).d().e();

      @Override
      public boolean b() {
         if (!super.b()) {
            return false;
         } else {
            int $$0 = a(cro.this.ai()).a(csj.class, this.e, cro.this, cro.this.cV().g(16.0)).size();
            return cro.this.ar.a(8) + 1 > $$0;
         }
      }

      @Override
      protected int h() {
         return 100;
      }

      @Override
      protected int i() {
         return 340;
      }

      @Override
      protected void k() {
         aub $$0 = (aub)cro.this.ai();
         fjs $$1 = cro.this.cu();

         for (int $$2 = 0; $$2 < 3; $$2++) {
            jb $$3 = cro.this.dx().b(-2 + cro.this.ar.a(5), 1, -2 + cro.this.ar.a(5));
            csj $$4 = bzv.bE.a(cro.this.ai(), bzu.f);
            if ($$4 != null) {
               $$4.a($$3, 0.0F, 0.0F);
               $$4.a($$0, cro.this.ai().d_($$3), bzu.f, null);
               $$4.a(cro.this);
               $$4.h($$3);
               $$4.b(20 * (30 + cro.this.ar.a(90)));
               if ($$1 != null) {
                  $$0.g().a($$4.cM(), $$1);
               }

               $$0.a_($$4);
               $$0.a(ejb.t, $$3, ejb.a.a(cro.this));
            }
         }
      }

      @Override
      protected ayy l() {
         return ayz.jl;
      }

      @Override
      protected csf.a m() {
         return csf.a.b;
      }
   }

   public class d extends csf.c {
      private final clc e = clc.b().a(16.0).a(($$0x, $$1) -> ((cpd)$$0x).n() == dbt.l);

      @Override
      public boolean b() {
         if (cro.this.e() != null) {
            return false;
         } else if (cro.this.gQ()) {
            return false;
         } else if (cro.this.as < this.c) {
            return false;
         } else {
            aub $$0 = a(cro.this.ai());
            if (!$$0.P().c(dmq.d)) {
               return false;
            } else {
               List<cpd> $$1 = $$0.a(cpd.class, this.e, cro.this, cro.this.cV().c(16.0, 4.0, 16.0));
               if ($$1.isEmpty()) {
                  return false;
               } else {
                  cro.this.a($$1.get(cro.this.ar.a($$1.size())));
                  return true;
               }
            }
         }
      }

      @Override
      public boolean c() {
         return cro.this.hb() != null && this.b > 0;
      }

      @Override
      public void e() {
         super.e();
         cro.this.a(null);
      }

      @Override
      protected void k() {
         cpd $$0 = cro.this.hb();
         if ($$0 != null && $$0.bO()) {
            $$0.a(dbt.o);
         }
      }

      @Override
      protected int n() {
         return 40;
      }

      @Override
      protected int h() {
         return 60;
      }

      @Override
      protected int i() {
         return 140;
      }

      @Override
      protected ayy l() {
         return ayz.jm;
      }

      @Override
      protected csf.a m() {
         return csf.a.d;
      }
   }
}
