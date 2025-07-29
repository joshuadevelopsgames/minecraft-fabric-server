import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import java.util.Objects;
import java.util.Optional;
import java.util.OptionalInt;
import javax.annotation.Nullable;

public class coc extends cmd {
   protected static final ImmutableList<ckw<? extends ckv<? super coc>>> ck = ImmutableList.of(ckw.c, ckw.f, ckw.x, ckw.t, ckw.y);
   protected static final ImmutableList<cjo<?>> cl = ImmutableList.of(
      cjo.o, cjo.g, cjo.h, cjo.n, cjo.F, cjo.u, cjo.s, cjo.T, cjo.U, cjo.p, cjo.P, cjo.Q, new cjo[]{cjo.S, cjo.y, cjo.z, cjo.C, cjo.Y, cjo.Z, cjo.aa, cjo.ab}
   );
   private static final alh<jl<coe>> cr = all.a(coc.class, alj.C);
   private static final alh<OptionalInt> cs = all.a(coc.class, alj.v);
   private static final int ct = 5;
   private static final amd<coe> cu = cof.a;
   public final bzd cm = new bzd();
   public final bzd co = new bzd();
   public final bzd cp = new bzd();
   public final bzd cq = new bzd();

   public coc(bzv<? extends cmd> $$0, dmu $$1) {
      super($$0, $$1);
      this.cd = new coc.a(this);
      this.a(fbc.j, 4.0F);
      this.a(fbc.e, -1.0F);
      this.ce = new cgn(this, 85, 10, 0.02F, 0.1F, true);
   }

   @Override
   protected cbm.b<coc> ei() {
      return cbm.a(cl, ck);
   }

   @Override
   protected cbm<?> a(Dynamic<?> $$0) {
      return cod.a(this.ei().a($$0));
   }

   @Override
   public cbm<coc> eh() {
      return (cbm<coc>)super.eh();
   }

   @Override
   protected void a(all.a $$0) {
      super.a($$0);
      jy<coe> $$1 = this.eb().f(mn.aY);
      $$0.a(cr, cxc.a(this.eb(), cu));
      $$0.a(cs, OptionalInt.empty());
   }

   public void m() {
      this.ay.a(cs, OptionalInt.empty());
   }

   public Optional<bzm> n() {
      return this.ay.a(cs).stream().mapToObj(this.ai()::a).filter(Objects::nonNull).findFirst();
   }

   @Override
   public void G(bzm $$0) {
      this.ay.a(cs, OptionalInt.of($$0.ar()));
   }

   @Override
   public int gj() {
      return 35;
   }

   @Override
   public int gh() {
      return 5;
   }

   public jl<coe> t() {
      return this.ay.a(cr);
   }

   private void b(jl<coe> $$0) {
      this.ay.a(cr, $$0);
   }

   @Nullable
   @Override
   public <T> T a(kp<? extends T> $$0) {
      return $$0 == kq.aK ? c((kp<T>)$$0, this.t()) : super.a($$0);
   }

   @Override
   protected void a(kl $$0) {
      this.a($$0, kq.aK);
      super.a($$0);
   }

   @Override
   protected <T> boolean b(kp<T> $$0, T $$1) {
      if ($$0 == kq.aK) {
         this.b(c(kq.aK, $$1));
         return true;
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   protected void a(fdc $$0) {
      super.a($$0);
      cxc.a($$0, this.t());
   }

   @Override
   protected void a(fda $$0) {
      super.a($$0);
      cxc.a($$0, mn.aY).ifPresent(this::b);
   }

   @Override
   protected void a(aub $$0) {
      btt $$1 = bts.a();
      $$1.a("frogBrain");
      this.eh().a($$0, this);
      $$1.c();
      $$1.a("frogActivityUpdate");
      cod.a(this);
      $$1.c();
      super.a($$0);
   }

   @Override
   public void g() {
      if (this.ai().B_()) {
         this.cq.a(this.bm() && !this.bp.d(), this.as);
      }

      super.g();
   }

   @Override
   public void a(alh<?> $$0) {
      if (aD.equals($$0)) {
         cay $$1 = this.aw();
         if ($$1 == cay.g) {
            this.cm.a(this.as);
         } else {
            this.cm.a();
         }

         if ($$1 == cay.i) {
            this.co.a(this.as);
         } else {
            this.co.a();
         }

         if ($$1 == cay.j) {
            this.cp.a(this.as);
         } else {
            this.cp.a();
         }
      }

      super.a($$0);
   }

   @Override
   protected void A(float $$0) {
      float $$1;
      if (this.cm.b()) {
         $$1 = 0.0F;
      } else {
         $$1 = Math.min($$0 * 25.0F, 1.0F);
      }

      this.bp.a($$1, 0.4F, this.g_() ? 3.0F : 1.0F);
   }

   @Override
   public void gN() {
      this.ai().a(null, this, ayz.kA, aza.g, 2.0F, 1.0F);
   }

   @Nullable
   @Override
   public bzc a(aub $$0, bzc $$1) {
      coc $$2 = bzv.ac.a($$0, bzu.e);
      if ($$2 != null) {
         cod.a($$2, $$0.H_());
      }

      return $$2;
   }

   @Override
   public boolean g_() {
      return false;
   }

   @Override
   public void a(boolean $$0) {
   }

   @Override
   public void a(aub $$0, cmd $$1) {
      this.a($$0, $$1, null);
      this.eh().a(cjo.Z, bdk.a);
   }

   @Override
   public cbe a(dnl $$0, bxh $$1, bzu $$2, @Nullable cbe $$3) {
      cxc.a(cwz.a($$0, this.dx()), mn.aY).ifPresent(this::b);
      cod.a(this, $$0.H_());
      return super.a($$0, $$1, $$2, $$3);
   }

   public static cbr.a gH() {
      return cmd.gM().a(cbs.w, 1.0).a(cbs.t, 10.0).a(cbs.c, 10.0).a(cbs.C, 1.0);
   }

   @Nullable
   @Override
   protected ayy p() {
      return ayz.ky;
   }

   @Nullable
   @Override
   protected ayy e(byb $$0) {
      return ayz.kB;
   }

   @Nullable
   @Override
   protected ayy f_() {
      return ayz.kz;
   }

   @Override
   protected void b(jb $$0, eeb $$1) {
      this.a(ayz.kE, 0.15F, 1.0F);
   }

   @Override
   public boolean cN() {
      return false;
   }

   @Override
   protected void ah() {
      super.ah();
      ahj.a(this);
   }

   @Override
   protected int a(double $$0, float $$1) {
      return super.a($$0, $$1) - 5;
   }

   @Override
   public void k(fis $$0) {
      if (this.bm()) {
         this.a(this.fu(), $$0);
         this.a(caq.a, this.dA());
         this.i(this.dA().c(0.9));
      } else {
         super.k($$0);
      }
   }

   public static boolean i(cam $$0) {
      return $$0 instanceof cse $$1 && $$1.gH() != 1 ? false : $$0.ap().a(azs.n);
   }

   @Override
   protected cjw b(dmu $$0) {
      return new coc.c(this, $$0);
   }

   @Nullable
   @Override
   public cam e() {
      return this.U();
   }

   @Override
   public boolean i(dcv $$0) {
      return $$0.a(azx.aJ);
   }

   public static boolean c(bzv<? extends cmd> $$0, dmv $$1, bzu $$2, jb $$3, bck $$4) {
      return $$1.a_($$3.e()).a(azo.cl) && a($$1, $$3);
   }

   class a extends cgk {
      a(final cao $$0) {
         super($$0);
      }

      @Override
      protected boolean c() {
         return coc.this.n().isEmpty();
      }
   }

   static class b extends fau {
      private final jb.a a = new jb.a();

      public b(boolean $$0) {
         super($$0);
      }

      @Override
      public fax a() {
         return !this.c.bm() ? super.a() : this.c(new jb(bcb.a(this.c.cV().a), bcb.a(this.c.cV().b), bcb.a(this.c.cV().c)));
      }

      @Override
      public fbc a(fbe $$0, int $$1, int $$2, int $$3) {
         this.a.d($$1, $$2 - 1, $$3);
         eeb $$4 = $$0.a(this.a);
         return $$4.a(azo.bW) ? fbc.b : super.a($$0, $$1, $$2, $$3);
      }
   }

   static class c extends cjt {
      c(coc $$0, dmu $$1) {
         super($$0, $$1);
      }

      @Override
      public boolean b(fbc $$0) {
         return $$0 != fbc.k && super.b($$0);
      }

      @Override
      protected fbb a(int $$0) {
         this.o = new coc.b(true);
         return new fbb(this.o, $$0);
      }
   }
}
