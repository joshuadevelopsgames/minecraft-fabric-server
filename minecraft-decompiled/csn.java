import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Dynamic;
import java.util.Optional;
import javax.annotation.Nullable;

public class csn extends crv implements cte {
   private static final alh<Boolean> e = all.a(csn.class, alj.k);
   private static final int f = 40;
   private static final int ck = 1;
   private static final float cl = 0.6F;
   private static final int cm = 6;
   private static final float cn = 0.5F;
   private static final int co = 40;
   private static final int cp = 15;
   private static final int cq = 200;
   private static final float cr = 0.3F;
   private static final float cs = 0.4F;
   private static final boolean ct = false;
   private int cu;
   protected static final ImmutableList<? extends ckw<? extends ckv<? super csn>>> a = ImmutableList.of(ckw.c, ckw.d);
   protected static final ImmutableList<? extends cjo<?>> b = ImmutableList.of(cjo.g, cjo.h, cjo.k, cjo.l, cjo.o, cjo.n, cjo.F, cjo.u, cjo.p, cjo.q);

   public csn(bzv<? extends csn> $$0, dmu $$1) {
      super($$0, $$1);
      this.cc = 5;
   }

   @Override
   protected cbm.b<csn> ei() {
      return cbm.a(b, a);
   }

   @Override
   protected cbm<?> a(Dynamic<?> $$0) {
      cbm<csn> $$1 = this.ei().a($$0);
      a($$1);
      b($$1);
      c($$1);
      $$1.a(ImmutableSet.of(cwn.a));
      $$1.b(cwn.b);
      $$1.f();
      return $$1;
   }

   private static void a(cbm<csn> $$0) {
      $$0.a(cwn.a, 0, ImmutableList.of(new cdj(45, 90), new cdn()));
   }

   private static void b(cbm<csn> $$0) {
      $$0.a(
         cwn.b,
         10,
         ImmutableList.of(
            cep.a(($$0x, $$1) -> $$1.g($$0x)),
            ced.a(8.0F, bwu.a(30, 60)),
            new cea(ImmutableList.of(Pair.of(cdv.a(0.4F), 2), Pair.of(cek.a(0.4F, 3), 2), Pair.of(new ccn(30, 60), 1)))
         )
      );
   }

   private static void c(cbm<csn> $$0) {
      $$0.a(cwn.k, 10, ImmutableList.of(cei.a(1.0F), cfq.a(csn::m, cdk.a(40)), cfq.a(csn::g_, cdk.a(15)), ces.a()), cjo.p);
   }

   private Optional<? extends cam> g(aub $$0) {
      return this.eh().c(cjo.h).orElse(cjq.a()).a($$1 -> this.c($$0, $$1));
   }

   private boolean c(aub $$0, cam $$1) {
      bzv<?> $$2 = $$1.ap();
      return $$2 != bzv.bP && $$2 != bzv.F && ckv.c($$0, this, $$1);
   }

   @Override
   protected void a(all.a $$0) {
      super.a($$0);
      $$0.a(e, false);
   }

   @Override
   public void a(alh<?> $$0) {
      super.a($$0);
      if (e.equals($$0)) {
         this.j_();
      }
   }

   @Nullable
   @Override
   public cbe a(dnl $$0, bxh $$1, bzu $$2, @Nullable cbe $$3) {
      if ($$0.H_().i() < 0.2F) {
         this.a(true);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   public static cbr.a l() {
      return crv.gM().a(cbs.t, 40.0).a(cbs.w, 0.3F).a(cbs.q, 0.6F).a(cbs.d, 1.0).a(cbs.c, 6.0);
   }

   public boolean m() {
      return !this.g_();
   }

   @Override
   public boolean c(aub $$0, bzm $$1) {
      if ($$1 instanceof cam $$2) {
         this.cu = 10;
         $$0.a(this, (byte)4);
         this.b(ayz.EM);
         return cte.a($$0, this, $$2);
      } else {
         return false;
      }
   }

   @Override
   public boolean v() {
      return true;
   }

   @Override
   protected void d(cam $$0) {
      if (!this.g_()) {
         cte.a(this, $$0);
      }
   }

   @Override
   public boolean a(aub $$0, byb $$1, float $$2) {
      boolean $$3 = super.a($$0, $$1, $$2);
      if ($$3 && $$1.d() instanceof cam $$4) {
         if (this.c($$4) && !ccf.a(this, $$4, 4.0)) {
            this.i($$4);
         }

         return true;
      } else {
         return $$3;
      }
   }

   private void i(cam $$0) {
      this.bO.b(cjo.F);
      this.bO.a(cjo.p, $$0, 200L);
   }

   @Override
   public cbm<csn> eh() {
      return (cbm<csn>)super.eh();
   }

   protected void n() {
      cwn $$0 = this.bO.g().orElse(null);
      this.bO.a(ImmutableList.of(cwn.k, cwn.b));
      cwn $$1 = this.bO.g().orElse(null);
      if ($$1 == cwn.k && $$0 != cwn.k) {
         this.gH();
      }

      this.w(this.bO.a(cjo.p));
   }

   @Override
   protected void a(aub $$0) {
      btt $$1 = bts.a();
      $$1.a("zoglinBrain");
      this.eh().a($$0, this);
      $$1.c();
      this.n();
   }

   @Override
   public void a(boolean $$0) {
      this.au().a(e, $$0);
      if (!this.ai().C && $$0) {
         this.h(cbs.c).a(0.5);
      }
   }

   @Override
   public boolean g_() {
      return this.au().a(e);
   }

   @Override
   public void e_() {
      if (this.cu > 0) {
         this.cu--;
      }

      super.e_();
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 4) {
         this.cu = 10;
         this.b(ayz.EM);
      } else {
         super.b($$0);
      }
   }

   @Override
   public int t() {
      return this.cu;
   }

   @Override
   protected ayy p() {
      if (this.ai().C) {
         return null;
      } else {
         return this.bO.a(cjo.p) ? ayz.EL : ayz.EK;
      }
   }

   @Override
   protected ayy e(byb $$0) {
      return ayz.EO;
   }

   @Override
   protected ayy f_() {
      return ayz.EN;
   }

   @Override
   protected void b(jb $$0, eeb $$1) {
      this.a(ayz.EP, 0.15F, 1.0F);
   }

   protected void gH() {
      this.b(ayz.EL);
   }

   @Nullable
   @Override
   public cam e() {
      return this.U();
   }

   @Override
   protected void ah() {
      super.ah();
      ahj.a(this);
   }

   @Override
   protected void a(fdc $$0) {
      super.a($$0);
      $$0.a("IsBaby", this.g_());
   }

   @Override
   protected void a(fda $$0) {
      super.a($$0);
      this.a($$0.a("IsBaby", false));
   }
}
