import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import javax.annotation.Nullable;

public class coh extends clz {
   private static final int ck = 0;
   @VisibleForTesting
   public static int a = Math.abs(-24000);
   public static final float b = 0.4F;
   public static final float c = 0.3F;
   private int cl = 0;
   protected static final ImmutableList<ckw<? extends ckv<? super coh>>> e = ImmutableList.of(ckw.c, ckw.d, ckw.f, ckw.t);
   protected static final ImmutableList<cjo<?>> f = ImmutableList.of(cjo.o, cjo.h, cjo.n, cjo.F, cjo.u, cjo.L, cjo.Q, cjo.S, cjo.P, cjo.s, cjo.aa);

   public coh(bzv<? extends clz> $$0, dmu $$1) {
      super($$0, $$1);
      this.ce = new cgn(this, 85, 10, 0.02F, 0.1F, true);
      this.cd = new cgm(this, 10);
   }

   @Override
   protected cjw b(dmu $$0) {
      return new cjy(this, $$0);
   }

   @Override
   protected cbm.b<coh> ei() {
      return cbm.a(f, e);
   }

   @Override
   protected cbm<?> a(Dynamic<?> $$0) {
      return coi.a(this.ei().a($$0));
   }

   @Override
   public cbm<coh> eh() {
      return (cbm<coh>)super.eh();
   }

   @Override
   protected ayy gH() {
      return ayz.AX;
   }

   @Override
   protected void a(aub $$0) {
      btt $$1 = bts.a();
      $$1.a("tadpoleBrain");
      this.eh().a($$0, this);
      $$1.c();
      $$1.a("tadpoleActivityUpdate");
      coi.a(this);
      $$1.c();
      super.a($$0);
   }

   public static cbr.a gI() {
      return cmd.gM().a(cbs.w, 1.0).a(cbs.t, 6.0);
   }

   @Override
   public void e_() {
      super.e_();
      if (!this.ai().C) {
         this.c(this.cl + 1);
      }
   }

   @Override
   protected void a(fdc $$0) {
      super.a($$0);
      $$0.a("Age", this.cl);
   }

   @Override
   protected void a(fda $$0) {
      super.a($$0);
      this.c($$0.a("Age", 0));
   }

   @Nullable
   @Override
   protected ayy p() {
      return null;
   }

   @Nullable
   @Override
   protected ayy e(byb $$0) {
      return ayz.AZ;
   }

   @Nullable
   @Override
   protected ayy f_() {
      return ayz.AW;
   }

   @Override
   public bxj b(cut $$0, bxi $$1) {
      dcv $$2 = $$0.b($$1);
      if (this.j($$2)) {
         this.a($$0, $$2);
         return bxj.a;
      } else {
         return cmf.a($$0, $$1, this).orElse(super.b($$0, $$1));
      }
   }

   @Override
   protected void ah() {
      super.ah();
      ahj.a(this);
   }

   @Override
   public boolean m() {
      return true;
   }

   @Override
   public void x(boolean $$0) {
   }

   @Override
   public void a_(dcv $$0) {
      cmf.a(this, $$0);
      dfd.a(kq.Z, $$0, $$0x -> $$0x.a("Age", this.gJ()));
   }

   @Override
   public void a(ui $$0) {
      cmf.a(this, $$0);
      $$0.e("Age").ifPresent(this::c);
   }

   @Override
   public dcv a() {
      return new dcv(dcz.rR);
   }

   @Override
   public ayy n() {
      return ayz.do;
   }

   private boolean j(dcv $$0) {
      return $$0.a(azx.aJ);
   }

   private void a(cut $$0, dcv $$1) {
      this.b($$0, $$1);
      this.b(bzc.d_(this.gL()));
      this.ai().a(me.Q, this.d(1.0), this.dF() + 0.5, this.g(1.0), 0.0, 0.0, 0.0);
   }

   private void b(cut $$0, dcv $$1) {
      $$1.a(1, $$0);
   }

   private int gJ() {
      return this.cl;
   }

   private void b(int $$0) {
      this.c(this.cl + $$0 * 20);
   }

   private void c(int $$0) {
      this.cl = $$0;
      if (this.cl >= a) {
         this.gK();
      }
   }

   private void gK() {
      if (this.ai() instanceof aub $$0) {
         this.a(bzv.ac, bzg.a(this, false, false), $$1 -> {
            $$1.a($$0, this.ai().d_($$1.dx()), bzu.i, null);
            $$1.gp();
            $$1.a(this.a(this.aw()));
            this.a(ayz.AY, 0.15F, 1.0F);
         });
      }
   }

   private int gL() {
      return Math.max(0, a - this.cl);
   }

   @Override
   public boolean et() {
      return false;
   }
}
