import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import javax.annotation.Nullable;

public class ctl extends cth {
   private static final int f = 50;
   private static final float ck = 0.35F;
   private static final int cl = 7;
   private static final double cm = 12.0;
   protected static final ImmutableList<ckw<? extends ckv<? super ctl>>> d = ImmutableList.of(ckw.c, ckw.d, ckw.b, ckw.f, ckw.m);
   protected static final ImmutableList<cjo<?>> e = ImmutableList.of(
      cjo.o, cjo.w, cjo.g, cjo.h, cjo.k, cjo.l, cjo.ap, cjo.ao, cjo.y, cjo.z, cjo.n, cjo.F, new cjo[]{cjo.p, cjo.q, cjo.r, cjo.u, cjo.ac, cjo.N, cjo.b}
   );

   public ctl(bzv<? extends ctl> $$0, dmu $$1) {
      super($$0, $$1);
      this.cc = 20;
   }

   public static cbr.a n() {
      return crv.gM().a(cbs.t, 50.0).a(cbs.w, 0.35F).a(cbs.c, 7.0).a(cbs.n, 12.0);
   }

   @Nullable
   @Override
   public cbe a(dnl $$0, bxh $$1, bzu $$2, @Nullable cbe $$3) {
      ctm.a(this);
      this.a($$0.H_(), $$1);
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(bck $$0, bxh $$1) {
      this.a(bzw.a, new dcv(dcz.qe));
   }

   @Override
   protected cbm.b<ctl> ei() {
      return cbm.a(e, d);
   }

   @Override
   protected cbm<?> a(Dynamic<?> $$0) {
      return ctm.a(this, this.ei().a($$0));
   }

   @Override
   public cbm<ctl> eh() {
      return (cbm<ctl>)super.eh();
   }

   @Override
   public boolean l() {
      return false;
   }

   @Override
   public boolean c(aub $$0, dcv $$1) {
      return $$1.a(dcz.qe) ? super.c($$0, $$1) : false;
   }

   @Override
   protected void a(aub $$0) {
      btt $$1 = bts.a();
      $$1.a("piglinBruteBrain");
      this.eh().a($$0, this);
      $$1.c();
      ctm.b(this);
      ctm.c(this);
      super.a($$0);
   }

   @Override
   public ctk gI() {
      return this.gy() && this.gJ() ? ctk.a : ctk.f;
   }

   @Override
   public boolean a(aub $$0, byb $$1, float $$2) {
      boolean $$3 = super.a($$0, $$1, $$2);
      if ($$3 && $$1.d() instanceof cam $$4) {
         ctm.a($$0, this, $$4);
      }

      return $$3;
   }

   @Override
   protected ayy p() {
      return ayz.vd;
   }

   @Override
   protected ayy e(byb $$0) {
      return ayz.vg;
   }

   @Override
   protected ayy f_() {
      return ayz.vf;
   }

   @Override
   protected void b(jb $$0, eeb $$1) {
      this.a(ayz.vh, 0.15F, 1.0F);
   }

   protected void gN() {
      this.b(ayz.ve);
   }

   @Override
   protected void gK() {
      this.b(ayz.vi);
   }
}
