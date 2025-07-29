import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import javax.annotation.Nullable;

public class ctc extends cmd implements crn, cte {
   private static final alh<Boolean> co = all.a(ctc.class, alj.k);
   private static final int cp = 40;
   private static final float cq = 0.3F;
   private static final int cr = 1;
   private static final float cs = 0.6F;
   private static final int ct = 6;
   private static final float cu = 0.5F;
   private static final boolean cv = false;
   private static final int cw = 0;
   private static final boolean cx = false;
   public static final int ck = 300;
   private int cy;
   private int cz = 0;
   private boolean cA = false;
   protected static final ImmutableList<? extends ckw<? extends ckv<? super ctc>>> cl = ImmutableList.of(ckw.c, ckw.d, ckw.o, ckw.n);
   protected static final ImmutableList<? extends cjo<?>> cm = ImmutableList.of(
      cjo.s,
      cjo.g,
      cjo.h,
      cjo.k,
      cjo.l,
      cjo.o,
      cjo.n,
      cjo.F,
      cjo.u,
      cjo.p,
      cjo.q,
      cjo.ar,
      new cjo[]{cjo.A, cjo.at, cjo.au, cjo.aq, cjo.L, cjo.ax, cjo.ay, cjo.aa}
   );

   public ctc(bzv<? extends ctc> $$0, dmu $$1) {
      super($$0, $$1);
      this.cc = 5;
   }

   @VisibleForTesting
   public void s(int $$0) {
      this.cz = $$0;
   }

   @Override
   public boolean v() {
      return true;
   }

   public static cbr.a m() {
      return crv.gM().a(cbs.t, 40.0).a(cbs.w, 0.3F).a(cbs.q, 0.6F).a(cbs.d, 1.0).a(cbs.c, 6.0);
   }

   @Override
   public boolean c(aub $$0, bzm $$1) {
      if ($$1 instanceof cam $$2) {
         this.cy = 10;
         this.ai().a(this, (byte)4);
         this.b(ayz.nn);
         ctd.a(this, $$2);
         return cte.a($$0, this, $$2);
      } else {
         return false;
      }
   }

   @Override
   protected void d(cam $$0) {
      if (this.n()) {
         cte.a(this, $$0);
      }
   }

   @Override
   public boolean a(aub $$0, byb $$1, float $$2) {
      boolean $$3 = super.a($$0, $$1, $$2);
      if ($$3 && $$1.d() instanceof cam $$4) {
         ctd.a($$0, this, $$4);
      }

      return $$3;
   }

   @Override
   protected cbm.b<ctc> ei() {
      return cbm.a(cm, cl);
   }

   @Override
   protected cbm<?> a(Dynamic<?> $$0) {
      return ctd.a(this.ei().a($$0));
   }

   @Override
   public cbm<ctc> eh() {
      return (cbm<ctc>)super.eh();
   }

   @Override
   protected void a(aub $$0) {
      btt $$1 = bts.a();
      $$1.a("hoglinBrain");
      this.eh().a($$0, this);
      $$1.c();
      ctd.a(this);
      if (this.gH()) {
         this.cz++;
         if (this.cz > 300) {
            this.b(ayz.no);
            this.gJ();
         }
      } else {
         this.cz = 0;
      }
   }

   @Override
   public void e_() {
      if (this.cy > 0) {
         this.cy--;
      }

      super.e_();
   }

   @Override
   protected void h() {
      if (this.g_()) {
         this.cc = 3;
         this.h(cbs.c).a(0.5);
      } else {
         this.cc = 5;
         this.h(cbs.c).a(6.0);
      }
   }

   public static boolean c(bzv<ctc> $$0, dmv $$1, bzu $$2, jb $$3, bck $$4) {
      return !$$1.a_($$3.e()).a(dqb.lq);
   }

   @Nullable
   @Override
   public cbe a(dnl $$0, bxh $$1, bzu $$2, @Nullable cbe $$3) {
      if ($$0.H_().i() < 0.2F) {
         this.a(true);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public boolean h(double $$0) {
      return !this.gq();
   }

   @Override
   public float a(jb $$0, dmx $$1) {
      if (ctd.a(this, $$0)) {
         return -1.0F;
      } else {
         return $$1.a_($$0.e()).a(dqb.pd) ? 10.0F : 0.0F;
      }
   }

   @Override
   public bxj b(cut $$0, bxi $$1) {
      bxj $$2 = super.b($$0, $$1);
      if ($$2.a()) {
         this.gp();
      }

      return $$2;
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 4) {
         this.cy = 10;
         this.b(ayz.nn);
      } else {
         super.b($$0);
      }
   }

   @Override
   public int t() {
      return this.cy;
   }

   @Override
   public boolean et() {
      return true;
   }

   @Override
   protected int e(aub $$0) {
      return this.cc;
   }

   private void gJ() {
      this.a(bzv.bP, bzg.a(this, true, false), $$0 -> $$0.a(new byq(bys.i, 200, 0)));
   }

   @Override
   public boolean i(dcv $$0) {
      return $$0.a(azx.aK);
   }

   public boolean n() {
      return !this.g_();
   }

   @Override
   protected void a(all.a $$0) {
      super.a($$0);
      $$0.a(co, false);
   }

   @Override
   protected void a(fdc $$0) {
      super.a($$0);
      $$0.a("IsImmuneToZombification", this.gK());
      $$0.a("TimeInOverworld", this.cz);
      $$0.a("CannotBeHunted", this.cA);
   }

   @Override
   protected void a(fda $$0) {
      super.a($$0);
      this.x($$0.a("IsImmuneToZombification", false));
      this.cz = $$0.a("TimeInOverworld", 0);
      this.y($$0.a("CannotBeHunted", false));
   }

   public void x(boolean $$0) {
      this.au().a(co, $$0);
   }

   private boolean gK() {
      return this.au().a(co);
   }

   public boolean gH() {
      return !this.ai().G_().b() && !this.gK() && !this.gw();
   }

   private void y(boolean $$0) {
      this.cA = $$0;
   }

   public boolean gI() {
      return this.n() && !this.cA;
   }

   @Nullable
   @Override
   public bzc a(aub $$0, bzc $$1) {
      ctc $$2 = bzv.al.a($$0, bzu.e);
      if ($$2 != null) {
         $$2.gp();
      }

      return $$2;
   }

   @Override
   public boolean gO() {
      return !ctd.c(this) && super.gO();
   }

   @Override
   public aza do() {
      return aza.f;
   }

   @Override
   protected ayy p() {
      return this.ai().C ? null : ctd.b(this).orElse(null);
   }

   @Override
   protected ayy e(byb $$0) {
      return ayz.nq;
   }

   @Override
   protected ayy f_() {
      return ayz.np;
   }

   @Override
   protected ayy aY() {
      return ayz.nW;
   }

   @Override
   protected ayy aZ() {
      return ayz.nV;
   }

   @Override
   protected void b(jb $$0, eeb $$1) {
      this.a(ayz.ns, 0.15F, 1.0F);
   }

   @Override
   protected void ah() {
      super.ah();
      ahj.a(this);
   }

   @Nullable
   @Override
   public cam e() {
      return this.U();
   }
}
