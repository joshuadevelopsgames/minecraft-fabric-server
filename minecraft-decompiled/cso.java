import com.google.common.annotations.VisibleForTesting;
import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.util.List;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cso extends crv {
   private static final ame a = ame.b("baby");
   private static final cbq f = new cbq(a, 0.5, cbq.a.b);
   private static final ame ck = ame.b("reinforcement_caller_charge");
   private static final cbq cl = new cbq(ame.b("reinforcement_callee_charge"), -0.05F, cbq.a.a);
   private static final ame cm = ame.b("leader_zombie_bonus");
   private static final ame cn = ame.b("zombie_random_spawn_bonus");
   private static final alh<Boolean> co = all.a(cso.class, alj.k);
   private static final alh<Integer> cp = all.a(cso.class, alj.b);
   private static final alh<Boolean> cq = all.a(cso.class, alj.k);
   public static final float b = 0.05F;
   public static final int c = 50;
   public static final int d = 40;
   public static final int e = 7;
   private static final int cr = -1;
   private static final bzp cs = bzv.bQ.n().a(0.5F).b(0.93F);
   private static final float ct = 0.1F;
   private static final Predicate<bxg> cu = $$0 -> $$0 == bxg.d;
   private static final boolean cv = false;
   private static final boolean cw = false;
   private static final int cx = 0;
   private final cgs cy = new cgs(this, cu);
   private boolean cz = false;
   private int cA = 0;
   private int cB;

   public cso(bzv<? extends cso> $$0, dmu $$1) {
      super($$0, $$1);
   }

   public cso(dmu $$0) {
      this(bzv.bQ, $$0);
   }

   @Override
   protected void H() {
      this.ch.a(4, new cso.a(this, 1.0, 3));
      this.ch.a(8, new chq(this, cut.class, 8.0F));
      this.ch.a(8, new cid(this));
      this.m();
   }

   protected void m() {
      this.ch.a(2, new cix(this, 1.0, false));
      this.ch.a(6, new chu(this, 1.0, true, 4, this::gO));
      this.ch.a(7, new civ(this, 1.0));
      this.ci.a(1, new cja(this).a(csq.class));
      this.ci.a(2, new cjb<>(this, cut.class, true));
      this.ci.a(3, new cjb<>(this, cua.class, false));
      this.ci.a(3, new cjb<>(this, cmv.class, true));
      this.ci.a(5, new cjb<>(this, cnm.class, 10, true, false, cnm.ck));
   }

   public static cbr.a gK() {
      return crv.gM().a(cbs.n, 35.0).a(cbs.w, 0.23F).a(cbs.c, 3.0).a(cbs.a, 2.0).a(cbs.B);
   }

   @Override
   protected void a(all.a $$0) {
      super.a($$0);
      $$0.a(co, false);
      $$0.a(cp, 0);
      $$0.a(cq, false);
   }

   public boolean gN() {
      return this.au().a(cq);
   }

   public boolean gO() {
      return this.cz;
   }

   public void y(boolean $$0) {
      if (this.cg.c()) {
         if (this.cz != $$0) {
            this.cz = $$0;
            this.cg.d($$0);
            if ($$0) {
               this.ch.a(1, this.cy);
            } else {
               this.ch.a(this.cy);
            }
         }
      } else if (this.cz) {
         this.ch.a(this.cy);
         this.cz = false;
      }
   }

   @Override
   public boolean g_() {
      return this.au().a(co);
   }

   @Override
   protected int e(aub $$0) {
      if (this.g_()) {
         this.cc = (int)(this.cc * 2.5);
      }

      return super.e($$0);
   }

   @Override
   public void a(boolean $$0) {
      this.au().a(co, $$0);
      if (this.ai() != null && !this.ai().C) {
         cbo $$1 = this.h(cbs.w);
         $$1.c(a);
         if ($$0) {
            $$1.b(f);
         }
      }
   }

   @Override
   public void a(alh<?> $$0) {
      if (co.equals($$0)) {
         this.j_();
      }

      super.a($$0);
   }

   protected boolean gI() {
      return true;
   }

   @Override
   public void g() {
      if (!this.ai().C && this.bO() && !this.gw()) {
         if (this.gN()) {
            this.cB--;
            if (this.cB < 0) {
               this.ae_();
            }
         } else if (this.gI()) {
            if (this.a(azu.a)) {
               this.cA++;
               if (this.cA >= 600) {
                  this.r(300);
               }
            } else {
               this.cA = -1;
            }
         }
      }

      super.g();
   }

   @Override
   public void e_() {
      if (this.bO()) {
         boolean $$0 = this.af_() && this.gB();
         if ($$0) {
            dcv $$1 = this.a(bzw.f);
            if (!$$1.f()) {
               if ($$1.m()) {
                  dcr $$2 = $$1.h();
                  $$1.b($$1.o() + this.ar.a(2));
                  if ($$1.o() >= $$1.p()) {
                     this.a($$2, bzw.f);
                     this.a(bzw.f, dcv.l);
                  }
               }

               $$0 = false;
            }

            if ($$0) {
               this.e(8.0F);
            }
         }
      }

      super.e_();
   }

   private void r(int $$0) {
      this.cB = $$0;
      this.au().a(cq, true);
   }

   protected void ae_() {
      this.b(bzv.L);
      if (!this.be()) {
         this.ai().a(null, 1040, this.dx(), 0);
      }
   }

   protected void b(bzv<? extends cso> $$0) {
      this.a($$0, bzg.a(this, true, true), $$0x -> $$0x.J($$0x.ai().d_($$0x.dx()).d()));
   }

   @VisibleForTesting
   public boolean a(aub $$0, cuf $$1) {
      csp $$2 = $$1.a(bzv.bS, bzg.a($$1, true, true), $$2x -> {
         $$2x.a($$0, $$0.d_($$2x.dx()), bzu.i, new cso.b(false, true));
         $$2x.a($$1.gR());
         $$2x.a($$1.hc().d());
         $$2x.a($$1.gJ().a());
         $$2x.s($$1.t());
         if (!this.be()) {
            $$0.a(null, 1026, this.dx(), 0);
         }
      });
      return $$2 != null;
   }

   protected boolean af_() {
      return true;
   }

   @Override
   public boolean a(aub $$0, byb $$1, float $$2) {
      if (!super.a($$0, $$1, $$2)) {
         return false;
      } else {
         cam $$3 = this.e();
         if ($$3 == null && $$1.d() instanceof cam) {
            $$3 = (cam)$$1.d();
         }

         if ($$3 != null && $$0.an() == bxg.d && this.ar.i() < this.i(cbs.B) && $$0.P().c(dmq.f)) {
            int $$4 = bcb.a(this.dC());
            int $$5 = bcb.a(this.dE());
            int $$6 = bcb.a(this.dI());
            bzv<? extends cso> $$7 = this.ap();
            cso $$8 = $$7.a($$0, bzu.j);
            if ($$8 == null) {
               return true;
            }

            for (int $$9 = 0; $$9 < 50; $$9++) {
               int $$10 = $$4 + bcb.a(this.ar, 7, 40) * bcb.a(this.ar, -1, 1);
               int $$11 = $$5 + bcb.a(this.ar, 7, 40) * bcb.a(this.ar, -1, 1);
               int $$12 = $$6 + bcb.a(this.ar, 7, 40) * bcb.a(this.ar, -1, 1);
               jb $$13 = new jb($$10, $$11, $$12);
               if (cbh.a($$7, $$0, $$13) && cbh.a($$7, $$0, bzu.j, $$13, $$0.A)) {
                  $$8.a_($$10, $$11, $$12);
                  if (!$$0.a($$10, $$11, $$12, 7.0) && $$0.f($$8) && $$0.g($$8) && ($$8.t() || !$$0.d($$8.cV()))) {
                     $$8.g($$3);
                     $$8.a($$0, $$0.d_($$8.dx()), bzu.j, null);
                     $$0.a_($$8);
                     cbo $$14 = this.h(cbs.B);
                     cbq $$15 = $$14.a(ck);
                     double $$16 = $$15 != null ? $$15.b() : 0.0;
                     $$14.c(ck);
                     $$14.d(new cbq(ck, $$16 - 0.05, cbq.a.a));
                     $$8.h(cbs.B).d(cl);
                     break;
                  }
               }
            }
         }

         return true;
      }
   }

   @Override
   public boolean c(aub $$0, bzm $$1) {
      boolean $$2 = super.c($$0, $$1);
      if ($$2) {
         float $$3 = this.ai().d_(this.dx()).b();
         if (this.fh().f() && this.cb() && this.ar.i() < $$3 * 0.3F) {
            $$1.e((float)(2 * (int)$$3));
         }
      }

      return $$2;
   }

   @Override
   protected ayy p() {
      return ayz.EQ;
   }

   @Override
   protected ayy e(byb $$0) {
      return ayz.Fa;
   }

   @Override
   protected ayy f_() {
      return ayz.EV;
   }

   protected ayy n() {
      return ayz.Fg;
   }

   @Override
   protected void b(jb $$0, eeb $$1) {
      this.a(this.n(), 0.15F, 1.0F);
   }

   @Override
   public bzv<? extends cso> ap() {
      return (bzv<? extends cso>)super.ap();
   }

   protected boolean t() {
      return false;
   }

   @Override
   protected void a(bck $$0, bxh $$1) {
      super.a($$0, $$1);
      if ($$0.i() < (this.ai().an() == bxg.d ? 0.05F : 0.01F)) {
         int $$2 = $$0.a(3);
         if ($$2 == 0) {
            this.a(bzw.a, new dcv(dcz.qg));
         } else {
            this.a(bzw.a, new dcv(dcz.qh));
         }
      }
   }

   @Override
   protected void a(fdc $$0) {
      super.a($$0);
      $$0.a("IsBaby", this.g_());
      $$0.a("CanBreakDoors", this.gO());
      $$0.a("InWaterTime", this.bm() ? this.cA : -1);
      $$0.a("DrownedConversionTime", this.gN() ? this.cB : -1);
   }

   @Override
   protected void a(fda $$0) {
      super.a($$0);
      this.a($$0.a("IsBaby", false));
      this.y($$0.a("CanBreakDoors", false));
      this.cA = $$0.a("InWaterTime", 0);
      int $$1 = $$0.a("DrownedConversionTime", -1);
      if ($$1 != -1) {
         this.r($$1);
      } else {
         this.au().a(cq, false);
      }
   }

   @Override
   public boolean a(aub $$0, cam $$1) {
      boolean $$2 = super.a($$0, $$1);
      if (($$0.an() == bxg.c || $$0.an() == bxg.d) && $$1 instanceof cuf $$3) {
         if ($$0.an() != bxg.d && this.ar.h()) {
            return $$2;
         }

         if (this.a($$0, $$3)) {
            $$2 = false;
         }
      }

      return $$2;
   }

   @Override
   public bzp e(cay $$0) {
      return this.g_() ? cs : super.e($$0);
   }

   @Override
   public boolean g(dcv $$0) {
      return $$0.a(azx.ar) && this.g_() && this.cc() ? false : super.g($$0);
   }

   @Override
   public boolean c(aub $$0, dcv $$1) {
      return $$1.a(dcz.sF) ? false : super.c($$0, $$1);
   }

   @Nullable
   @Override
   public cbe a(dnl $$0, bxh $$1, bzu $$2, @Nullable cbe $$3) {
      bck $$4 = $$0.H_();
      $$3 = super.a($$0, $$1, $$2, $$3);
      float $$5 = $$1.d();
      if ($$2 != bzu.i) {
         this.a_($$4.i() < 0.55F * $$5);
      }

      if ($$3 == null) {
         $$3 = new cso.b(a($$4), true);
      }

      if ($$3 instanceof cso.b $$6) {
         if ($$6.a) {
            this.a(true);
            if ($$6.b) {
               if ($$4.i() < 0.05) {
                  List<cmj> $$7 = $$0.a(cmj.class, this.cV().c(5.0, 3.0, 5.0), bzt.c);
                  if (!$$7.isEmpty()) {
                     cmj $$8 = $$7.get(0);
                     $$8.x(true);
                     this.o($$8);
                  }
               } else if ($$4.i() < 0.05) {
                  cmj $$9 = bzv.A.a(this.ai(), bzu.g);
                  if ($$9 != null) {
                     $$9.b(this.dC(), this.dE(), this.dI(), this.dP(), 0.0F);
                     $$9.a($$0, $$1, bzu.g, null);
                     $$9.x(true);
                     this.o($$9);
                     $$0.b($$9);
                  }
               }
            }
         }

         this.y($$4.i() < $$5 * 0.1F);
         if ($$2 != bzu.i) {
            this.a($$4, $$1);
            this.a($$0, $$4, $$1);
         }
      }

      if (this.a(bzw.f).f()) {
         LocalDate $$10 = LocalDate.now();
         int $$11 = $$10.get(ChronoField.DAY_OF_MONTH);
         int $$12 = $$10.get(ChronoField.MONTH_OF_YEAR);
         if ($$12 == 10 && $$11 == 31 && $$4.i() < 0.25F) {
            this.a(bzw.f, new dcv($$4.i() < 0.1F ? dqb.ew : dqb.ev));
            this.a(bzw.f, 0.0F);
         }
      }

      this.J($$5);
      return $$3;
   }

   @VisibleForTesting
   public void b(int $$0) {
      this.cA = $$0;
   }

   @VisibleForTesting
   public void c(int $$0) {
      this.cB = $$0;
   }

   public static boolean a(bck $$0) {
      return $$0.i() < 0.05F;
   }

   protected void J(float $$0) {
      this.gP();
      this.h(cbs.q).c(new cbq(bW, this.ar.j() * 0.05F, cbq.a.a));
      double $$1 = this.ar.j() * 1.5 * $$0;
      if ($$1 > 1.0) {
         this.h(cbs.n).c(new cbq(cn, $$1, cbq.a.c));
      }

      if (this.ar.i() < $$0 * 0.05F) {
         this.h(cbs.B).c(new cbq(cm, this.ar.j() * 0.25 + 0.5, cbq.a.a));
         this.h(cbs.t).c(new cbq(cm, this.ar.j() * 3.0 + 1.0, cbq.a.c));
         this.y(true);
      }
   }

   protected void gP() {
      this.h(cbs.B).a(this.ar.j() * 0.1F);
   }

   @Override
   protected void a(aub $$0, byb $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      if ($$1.d() instanceof crh $$4 && $$4.gI()) {
         dcv $$5 = this.gH();
         if (!$$5.f()) {
            $$4.gJ();
            this.a($$0, $$5);
         }
      }
   }

   protected dcv gH() {
      return new dcv(dcz.vQ);
   }

   class a extends cik {
      a(final cau $$0, final double $$1, final int $$2) {
         super(dqb.mL, $$0, $$1, $$2);
      }

      @Override
      public void a(dmv $$0, jb $$1) {
         $$0.a(null, $$1, ayz.EW, aza.f, 0.5F, 0.9F + cso.this.ar.i() * 0.2F);
      }

      @Override
      public void a(dmu $$0, jb $$1) {
         $$0.a(null, $$1, ayz.BL, aza.e, 0.7F, 0.9F + $$0.A.i() * 0.2F);
      }

      @Override
      public double i() {
         return 1.14;
      }
   }

   public static class b implements cbe {
      public final boolean a;
      public final boolean b;

      public b(boolean $$0, boolean $$1) {
         this.a = $$0;
         this.b = $$1;
      }
   }
}
