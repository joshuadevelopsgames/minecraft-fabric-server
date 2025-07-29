import java.util.Optional;
import javax.annotation.Nullable;

public class cmj extends cmd {
   private static final bzp cs = bzv.A.n().a(0.5F).b(0.2975F);
   private static final alh<jl<cmk>> ct = all.a(cmj.class, alj.y);
   private static final boolean cu = false;
   public float ck;
   public float cl;
   public float cm;
   public float co;
   public float cp = 1.0F;
   private float cv = 1.0F;
   public int cq;
   public boolean cr = false;

   public cmj(bzv<? extends cmj> $$0, dmu $$1) {
      super($$0, $$1);
      this.cq = this.ar.a(6000) + 6000;
      this.a(fbc.j, 0.0F);
   }

   @Override
   protected void H() {
      this.ch.a(0, new chc(this));
      this.ch.a(1, new cib(this, 1.4));
      this.ch.a(2, new cgu(this, 1.0));
      this.ch.a(3, new ciq(this, 1.0, $$0 -> $$0.a(azx.aI), false));
      this.ch.a(4, new chh(this, 1.1));
      this.ch.a(5, new civ(this, 1.0));
      this.ch.a(6, new chq(this, cut.class, 6.0F));
      this.ch.a(7, new cid(this));
   }

   @Override
   public bzp e(cay $$0) {
      return this.g_() ? cs : super.e($$0);
   }

   public static cbr.a m() {
      return cmd.gM().a(cbs.t, 4.0).a(cbs.w, 0.25);
   }

   @Override
   public void e_() {
      super.e_();
      this.co = this.ck;
      this.cm = this.cl;
      this.cl = this.cl + (this.aK() ? -1.0F : 4.0F) * 0.3F;
      this.cl = bcb.a(this.cl, 0.0F, 1.0F);
      if (!this.aK() && this.cp < 1.0F) {
         this.cp = 1.0F;
      }

      this.cp *= 0.9F;
      fis $$0 = this.dA();
      if (!this.aK() && $$0.e < 0.0) {
         this.i($$0.d(1.0, 0.6, 1.0));
      }

      this.ck = this.ck + this.cp * 2.0F;
      if (this.ai() instanceof aub $$1 && this.bO() && !this.g_() && !this.t() && --this.cq <= 0) {
         if (this.a($$1, fdf.aI, this::a)) {
            this.a(ayz.eX, 1.0F, (this.ar.i() - this.ar.i()) * 0.2F + 1.0F);
            this.c(ejb.t);
         }

         this.cq = this.ar.a(6000) + 6000;
      }
   }

   @Override
   protected boolean bd() {
      return this.al > this.cv;
   }

   @Override
   protected void bc() {
      this.cv = this.al + this.cl / 2.0F;
   }

   @Override
   protected ayy p() {
      return ayz.eV;
   }

   @Override
   protected ayy e(byb $$0) {
      return ayz.eY;
   }

   @Override
   protected ayy f_() {
      return ayz.eW;
   }

   @Override
   protected void b(jb $$0, eeb $$1) {
      this.a(ayz.eZ, 0.15F, 1.0F);
   }

   @Nullable
   public cmj b(aub $$0, bzc $$1) {
      cmj $$2 = bzv.A.a($$0, bzu.e);
      if ($$2 != null && $$1 instanceof cmj $$3) {
         $$2.b(this.ar.h() ? this.n() : $$3.n());
      }

      return $$2;
   }

   @Override
   public cbe a(dnl $$0, bxh $$1, bzu $$2, @Nullable cbe $$3) {
      cxc.a(cwz.a($$0, this.dx()), mn.aN).ifPresent(this::b);
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public boolean i(dcv $$0) {
      return $$0.a(azx.aI);
   }

   @Override
   protected int e(aub $$0) {
      return this.t() ? 10 : super.e($$0);
   }

   @Override
   protected void a(all.a $$0) {
      super.a($$0);
      $$0.a(ct, cxc.a(this.eb(), cml.a));
   }

   @Override
   protected void a(fda $$0) {
      super.a($$0);
      this.cr = $$0.a("IsChickenJockey", false);
      $$0.e("EggLayTime").ifPresent($$0x -> this.cq = $$0x);
      cxc.a($$0, mn.aN).ifPresent(this::b);
   }

   @Override
   protected void a(fdc $$0) {
      super.a($$0);
      $$0.a("IsChickenJockey", this.cr);
      $$0.a("EggLayTime", this.cq);
      cxc.a($$0, this.n());
   }

   public void b(jl<cmk> $$0) {
      this.ay.a(ct, $$0);
   }

   public jl<cmk> n() {
      return this.ay.a(ct);
   }

   @Nullable
   @Override
   public <T> T a(kp<? extends T> $$0) {
      return $$0 == kq.aJ ? c((kp<T>)$$0, new dbw<>(this.n())) : super.a($$0);
   }

   @Override
   protected void a(kl $$0) {
      this.a($$0, kq.aJ);
      super.a($$0);
   }

   @Override
   protected <T> boolean b(kp<T> $$0, T $$1) {
      if ($$0 == kq.aJ) {
         Optional<jl<cmk>> $$2 = c(kq.aJ, $$1).a(this.eb());
         if ($$2.isPresent()) {
            this.b($$2.get());
            return true;
         } else {
            return false;
         }
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   public boolean h(double $$0) {
      return this.t();
   }

   @Override
   protected void a(bzm $$0, bzm.b $$1) {
      super.a($$0, $$1);
      if ($$0 instanceof cam) {
         ((cam)$$0).br = this.br;
      }
   }

   public boolean t() {
      return this.cr;
   }

   public void x(boolean $$0) {
      this.cr = $$0;
   }
}
