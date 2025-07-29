import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import java.util.List;
import javax.annotation.Nullable;

public class cti extends cth implements cri, cud {
   private static final alh<Boolean> ck = all.a(cti.class, alj.k);
   private static final alh<Boolean> cl = all.a(cti.class, alj.k);
   private static final alh<Boolean> cm = all.a(cti.class, alj.k);
   private static final ame cn = ame.b("baby");
   private static final cbq co = new cbq(cn, 0.2F, cbq.a.b);
   private static final int cp = 16;
   private static final float cq = 0.35F;
   private static final int cr = 5;
   private static final float cs = 0.1F;
   private static final int ct = 3;
   private static final float cu = 0.2F;
   private static final bzp cv = bzv.aT.n().a(0.5F).b(0.97F);
   private static final double cw = 0.5;
   private static final boolean cx = false;
   private static final boolean cy = false;
   private final bxr cz = new bxr(8);
   private boolean cA = false;
   protected static final ImmutableList<ckw<? extends ckv<? super cti>>> d = ImmutableList.of(ckw.c, ckw.d, ckw.b, ckw.f, ckw.l);
   protected static final ImmutableList<cjo<?>> e = ImmutableList.of(
      cjo.o,
      cjo.w,
      cjo.g,
      cjo.h,
      cjo.k,
      cjo.l,
      cjo.ap,
      cjo.ao,
      cjo.M,
      cjo.aQ,
      cjo.y,
      cjo.z,
      new cjo[]{
         cjo.n,
         cjo.F,
         cjo.p,
         cjo.q,
         cjo.r,
         cjo.u,
         cjo.ac,
         cjo.ad,
         cjo.A,
         cjo.ae,
         cjo.af,
         cjo.ah,
         cjo.ag,
         cjo.aj,
         cjo.ak,
         cjo.ai,
         cjo.am,
         cjo.N,
         cjo.as,
         cjo.t,
         cjo.at,
         cjo.au,
         cjo.al,
         cjo.an,
         cjo.av,
         cjo.aw,
         cjo.ax
      }
   );

   public cti(bzv<? extends cth> $$0, dmu $$1) {
      super($$0, $$1);
      this.cc = 5;
   }

   @Override
   protected void a(fdc $$0) {
      super.a($$0);
      $$0.a("IsBaby", this.g_());
      $$0.a("CannotHunt", this.cA);
      this.b_($$0);
   }

   @Override
   protected void a(fda $$0) {
      super.a($$0);
      this.a($$0.a("IsBaby", false));
      this.z($$0.a("CannotHunt", false));
      this.a_($$0);
   }

   @bdl
   @Override
   public bxr n() {
      return this.cz;
   }

   @Override
   protected void a(aub $$0, byb $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      if ($$1.d() instanceof crh $$4 && $$4.gI()) {
         dcv $$5 = new dcv(dcz.vT);
         $$4.gJ();
         this.a($$0, $$5);
      }

      this.cz.f().forEach($$1x -> this.a($$0, $$1x));
   }

   protected dcv i(dcv $$0) {
      return this.cz.b($$0);
   }

   protected boolean j(dcv $$0) {
      return this.cz.c($$0);
   }

   @Override
   protected void a(all.a $$0) {
      super.a($$0);
      $$0.a(ck, false);
      $$0.a(cl, false);
      $$0.a(cm, false);
   }

   @Override
   public void a(alh<?> $$0) {
      super.a($$0);
      if (ck.equals($$0)) {
         this.j_();
      }
   }

   public static cbr.a gN() {
      return crv.gM().a(cbs.t, 16.0).a(cbs.w, 0.35F).a(cbs.c, 5.0);
   }

   public static boolean b(bzv<cti> $$0, dmv $$1, bzu $$2, jb $$3, bck $$4) {
      return !$$1.a_($$3.e()).a(dqb.lq);
   }

   @Nullable
   @Override
   public cbe a(dnl $$0, bxh $$1, bzu $$2, @Nullable cbe $$3) {
      bck $$4 = $$0.H_();
      if ($$2 != bzu.d) {
         if ($$4.i() < 0.2F) {
            this.a(true);
         } else if (this.gH()) {
            this.a(bzw.a, this.gP());
         }
      }

      ctj.a(this, $$0.H_());
      this.a($$4, $$1);
      this.a($$0, $$4, $$1);
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected boolean ag() {
      return false;
   }

   @Override
   public boolean h(double $$0) {
      return !this.gq();
   }

   @Override
   protected void a(bck $$0, bxh $$1) {
      if (this.gH()) {
         this.a(bzw.f, new dcv(dcz.qT), $$0);
         this.a(bzw.e, new dcv(dcz.qU), $$0);
         this.a(bzw.d, new dcv(dcz.qV), $$0);
         this.a(bzw.c, new dcv(dcz.qW), $$0);
      }
   }

   private void a(bzw $$0, dcv $$1, bck $$2) {
      if ($$2.i() < 0.1F) {
         this.a($$0, $$1);
      }
   }

   @Override
   protected cbm.b<cti> ei() {
      return cbm.a(e, d);
   }

   @Override
   protected cbm<?> a(Dynamic<?> $$0) {
      return ctj.a(this, this.ei().a($$0));
   }

   @Override
   public cbm<cti> eh() {
      return (cbm<cti>)super.eh();
   }

   @Override
   public bxj b(cut $$0, bxi $$1) {
      bxj $$2 = super.b($$0, $$1);
      if ($$2.a()) {
         return $$2;
      } else if (this.ai() instanceof aub $$3) {
         return ctj.a($$3, this, $$0, $$1);
      } else {
         boolean $$4 = ctj.b(this, $$0.b($$1)) && this.gI() != ctk.d;
         return (bxj)($$4 ? bxj.a : bxj.e);
      }
   }

   @Override
   public bzp e(cay $$0) {
      return this.g_() ? cv : super.e($$0);
   }

   @Override
   public void a(boolean $$0) {
      this.au().a(ck, $$0);
      if (!this.ai().C) {
         cbo $$1 = this.h(cbs.w);
         $$1.c(co.a());
         if ($$0) {
            $$1.b(co);
         }
      }
   }

   @Override
   public boolean g_() {
      return this.au().a(ck);
   }

   private void z(boolean $$0) {
      this.cA = $$0;
   }

   @Override
   protected boolean l() {
      return !this.cA;
   }

   @Override
   protected void a(aub $$0) {
      btt $$1 = bts.a();
      $$1.a("piglinBrain");
      this.eh().a($$0, this);
      $$1.c();
      ctj.a(this);
      super.a($$0);
   }

   @Override
   protected int e(aub $$0) {
      return this.cc;
   }

   @Override
   protected void g(aub $$0) {
      ctj.a($$0, this);
      this.cz.f().forEach($$1 -> this.a($$0, $$1));
      super.g($$0);
   }

   private dcv gP() {
      return this.ar.i() < 0.5 ? new dcv(dcz.xA) : new dcv(dcz.qb);
   }

   @Nullable
   @Override
   public bae<dcr> ad() {
      return this.g_() ? null : azx.bZ;
   }

   private boolean gQ() {
      return this.ay.a(cl);
   }

   @Override
   public void b(boolean $$0) {
      this.ay.a(cl, $$0);
   }

   @Override
   public void a() {
      this.bz = 0;
   }

   @Override
   public ctk gI() {
      if (this.gO()) {
         return ctk.e;
      } else if (ctj.a(this.fi())) {
         return ctk.d;
      } else if (this.gy() && this.gJ()) {
         return ctk.a;
      } else if (this.gQ()) {
         return ctk.c;
      } else {
         return this.b(dcz.xA) && dbo.g(this.ed()) ? ctk.b : ctk.f;
      }
   }

   public boolean gO() {
      return this.ay.a(cm);
   }

   public void y(boolean $$0) {
      this.ay.a(cm, $$0);
   }

   @Override
   public boolean a(aub $$0, byb $$1, float $$2) {
      boolean $$3 = super.a($$0, $$1, $$2);
      if ($$3 && $$1.d() instanceof cam $$4) {
         ctj.a($$0, this, $$4);
      }

      return $$3;
   }

   @Override
   public void a(cam $$0, float $$1) {
      this.b(this, 1.6F);
   }

   @Override
   public boolean a(ddq $$0) {
      return $$0 == dcz.xA;
   }

   protected void k(dcv $$0) {
      this.b(bzw.a, $$0);
   }

   protected void l(dcv $$0) {
      if ($$0.a(ctj.c)) {
         this.a(bzw.b, $$0);
         this.g(bzw.b);
      } else {
         this.b(bzw.b, $$0);
      }
   }

   @Override
   public boolean c(aub $$0, dcv $$1) {
      return $$0.P().c(dmq.d) && this.fU() && ctj.a(this, $$1);
   }

   protected boolean m(dcv $$0) {
      bzw $$1 = this.f($$0);
      dcv $$2 = this.a($$1);
      return this.a($$0, $$2, $$1);
   }

   @Override
   protected boolean a(dcv $$0, dcv $$1, bzw $$2) {
      if (djk.a($$1, djj.E)) {
         return false;
      } else {
         bae<dcr> $$3 = this.ad();
         boolean $$4 = ctj.a($$0) || $$3 != null && $$0.a($$3);
         boolean $$5 = ctj.a($$1) || $$3 != null && $$1.a($$3);
         if ($$4 && !$$5) {
            return true;
         } else {
            return !$$4 && $$5 ? false : super.a($$0, $$1, $$2);
         }
      }
   }

   @Override
   protected void a(aub $$0, cqz $$1) {
      this.a($$1);
      ctj.a($$0, this, $$1);
   }

   @Override
   public boolean a(bzm $$0, boolean $$1) {
      if (this.g_() && $$0.ap() == bzv.al) {
         $$0 = this.b($$0, 3);
      }

      return super.a($$0, $$1);
   }

   private bzm b(bzm $$0, int $$1) {
      List<bzm> $$2 = $$0.da();
      return $$1 != 1 && !$$2.isEmpty() ? this.b($$2.getFirst(), $$1 - 1) : $$0;
   }

   @Nullable
   @Override
   protected ayy p() {
      return this.ai().C ? null : ctj.b(this).orElse(null);
   }

   @Override
   protected ayy e(byb $$0) {
      return ayz.uZ;
   }

   @Override
   protected ayy f_() {
      return ayz.uX;
   }

   @Override
   protected void b(jb $$0, eeb $$1) {
      this.a(ayz.vb, 0.15F, 1.0F);
   }

   @Override
   protected void gK() {
      this.b(ayz.vc);
   }
}
