import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import javax.annotation.Nullable;

public class cok extends cmd {
   public static final bzp ck = bzp.b(0.9F, 1.3F).a(0.7F);
   private static final int cr = 2;
   private static final int cs = 1;
   protected static final ImmutableList<ckw<? extends ckv<? super cok>>> cl = ImmutableList.of(ckw.c, ckw.d, ckw.b, ckw.o, ckw.f, ckw.s);
   protected static final ImmutableList<cjo<?>> cm = ImmutableList.of(
      cjo.o, cjo.h, cjo.n, cjo.F, cjo.u, cjo.aw, cjo.s, cjo.T, cjo.U, cjo.P, cjo.L, cjo.Q, new cjo[]{cjo.S, cjo.W, cjo.X, cjo.aa}
   );
   public static final int co = 10;
   public static final double cp = 0.02;
   public static final double cq = 0.1F;
   private static final alh<Boolean> ct = all.a(cok.class, alj.k);
   private static final alh<Boolean> cu = all.a(cok.class, alj.k);
   private static final alh<Boolean> cv = all.a(cok.class, alj.k);
   private static final boolean cw = false;
   private static final boolean cx = true;
   private static final boolean cy = true;
   private boolean cz;
   private int cA;

   public cok(bzv<? extends cok> $$0, dmu $$1) {
      super($$0, $$1);
      this.S().a(true);
      this.a(fbc.f, -1.0F);
      this.a(fbc.g, -1.0F);
   }

   public dcv m() {
      bck $$0 = bck.a((long)this.cK().hashCode());
      bae<dco> $$1 = this.gT() ? azw.b : azw.a;
      return this.ai().K_().f(mn.aZ).a($$1, $$0).map($$0x -> dcp.a(dcz.xN, $$0x)).orElseGet(() -> new dcv(dcz.xN));
   }

   @Override
   protected cbm.b<cok> ei() {
      return cbm.a(cm, cl);
   }

   @Override
   protected cbm<?> a(Dynamic<?> $$0) {
      return col.a(this.ei().a($$0));
   }

   public static cbr.a n() {
      return cmd.gM().a(cbs.t, 10.0).a(cbs.w, 0.2F).a(cbs.c, 2.0);
   }

   @Override
   protected void h() {
      if (this.g_()) {
         this.h(cbs.c).a(1.0);
         this.gL();
      } else {
         this.h(cbs.c).a(2.0);
         this.gK();
      }
   }

   @Override
   protected int a(double $$0, float $$1) {
      return super.a($$0, $$1) - 10;
   }

   @Override
   protected ayy p() {
      return this.gT() ? ayz.lK : ayz.lB;
   }

   @Override
   protected ayy e(byb $$0) {
      return this.gT() ? ayz.lN : ayz.lE;
   }

   @Override
   protected ayy f_() {
      return this.gT() ? ayz.lL : ayz.lC;
   }

   @Override
   protected void b(jb $$0, eeb $$1) {
      this.a(ayz.lS, 0.15F, 1.0F);
   }

   protected ayy t() {
      return this.gT() ? ayz.lP : ayz.lG;
   }

   @Nullable
   public cok b(aub $$0, bzc $$1) {
      cok $$2 = bzv.aj.a($$0, bzu.e);
      if ($$2 != null) {
         col.a($$2, $$0.H_());
         bzc $$3 = (bzc)($$0.H_().h() ? this : $$1);
         boolean $$5 = $$3 instanceof cok $$4 && $$4.gT() || $$0.H_().j() < 0.02;
         $$2.x($$5);
      }

      return $$2;
   }

   @Override
   public cbm<cok> eh() {
      return (cbm<cok>)super.eh();
   }

   @Override
   protected void a(aub $$0) {
      btt $$1 = bts.a();
      $$1.a("goatBrain");
      this.eh().a($$0, this);
      $$1.c();
      $$1.a("goatActivityUpdate");
      col.a(this);
      $$1.c();
      super.a($$0);
   }

   @Override
   public int gh() {
      return 15;
   }

   @Override
   public void r(float $$0) {
      int $$1 = this.gh();
      float $$2 = bcb.c(this.br, $$0);
      float $$3 = bcb.a($$2, (float)(-$$1), (float)$$1);
      super.r(this.br + $$3);
   }

   @Override
   protected void gN() {
      this.ai().a(null, this, this.gT() ? ayz.lM : ayz.lD, aza.g, 1.0F, bcb.b(this.ai().A, 0.8F, 1.2F));
   }

   @Override
   public boolean i(dcv $$0) {
      return $$0.a(azx.ax);
   }

   @Override
   public bxj b(cut $$0, bxi $$1) {
      dcv $$2 = $$0.b($$1);
      if ($$2.a(dcz.rF) && !this.g_()) {
         $$0.a(this.t(), 1.0F, 1.0F);
         dcv $$3 = dcy.a($$2, $$0, dcz.rL.m());
         $$0.a($$1, $$3);
         return bxj.a;
      } else {
         bxj $$4 = super.b($$0, $$1);
         if ($$4.a() && this.i($$2)) {
            this.gN();
         }

         return $$4;
      }
   }

   @Override
   public cbe a(dnl $$0, bxh $$1, bzu $$2, @Nullable cbe $$3) {
      bck $$4 = $$0.H_();
      col.a(this, $$4);
      this.x($$4.j() < 0.02);
      this.h();
      if (!this.g_() && $$4.i() < 0.1F) {
         alh<Boolean> $$5 = $$4.h() ? cu : cv;
         this.ay.a($$5, false);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void ah() {
      super.ah();
      ahj.a(this);
   }

   @Override
   public bzp e(cay $$0) {
      return $$0 == cay.g ? ck.a(this.ep()) : super.e($$0);
   }

   @Override
   protected void a(fdc $$0) {
      super.a($$0);
      $$0.a("IsScreamingGoat", this.gT());
      $$0.a("HasLeftHorn", this.gH());
      $$0.a("HasRightHorn", this.gI());
   }

   @Override
   protected void a(fda $$0) {
      super.a($$0);
      this.x($$0.a("IsScreamingGoat", false));
      this.ay.a(cu, $$0.a("HasLeftHorn", true));
      this.ay.a(cv, $$0.a("HasRightHorn", true));
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 58) {
         this.cz = true;
      } else if ($$0 == 59) {
         this.cz = false;
      } else {
         super.b($$0);
      }
   }

   @Override
   public void e_() {
      if (this.cz) {
         this.cA++;
      } else {
         this.cA -= 2;
      }

      this.cA = bcb.a(this.cA, 0, 20);
      super.e_();
   }

   @Override
   protected void a(all.a $$0) {
      super.a($$0);
      $$0.a(ct, false);
      $$0.a(cu, true);
      $$0.a(cv, true);
   }

   public boolean gH() {
      return this.ay.a(cu);
   }

   public boolean gI() {
      return this.ay.a(cv);
   }

   public boolean gJ() {
      boolean $$0 = this.gH();
      boolean $$1 = this.gI();
      if (!$$0 && !$$1) {
         return false;
      } else {
         alh<Boolean> $$2;
         if (!$$0) {
            $$2 = cv;
         } else if (!$$1) {
            $$2 = cu;
         } else {
            $$2 = this.ar.h() ? cu : cv;
         }

         this.ay.a($$2, false);
         fis $$5 = this.dv();
         dcv $$6 = this.m();
         double $$7 = bcb.b(this.ar, -0.2F, 0.2F);
         double $$8 = bcb.b(this.ar, 0.3F, 0.7F);
         double $$9 = bcb.b(this.ar, -0.2F, 0.2F);
         cqz $$10 = new cqz(this.ai(), $$5.a(), $$5.b(), $$5.c(), $$6, $$7, $$8, $$9);
         this.ai().b($$10);
         return true;
      }
   }

   public void gK() {
      this.ay.a(cu, true);
      this.ay.a(cv, true);
   }

   public void gL() {
      this.ay.a(cu, false);
      this.ay.a(cv, false);
   }

   public boolean gT() {
      return this.ay.a(ct);
   }

   public void x(boolean $$0) {
      this.ay.a(ct, $$0);
   }

   public float gU() {
      return this.cA / 20.0F * 30.0F * (float) (Math.PI / 180.0);
   }

   public static boolean c(bzv<? extends cmd> $$0, dmv $$1, bzu $$2, jb $$3, bck $$4) {
      return $$1.a_($$3.e()).a(azo.ce) && a($$1, $$3);
   }
}
