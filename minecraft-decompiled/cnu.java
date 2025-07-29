import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.Dynamic;
import io.netty.buffer.ByteBuf;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public class cnu extends cmd implements cmf {
   public static final int ck = 200;
   private static final int cv = 10;
   protected static final ImmutableList<? extends ckw<? extends ckv<? super cnu>>> cl = ImmutableList.of(ckw.c, ckw.o, ckw.f, ckw.q, ckw.r);
   protected static final ImmutableList<? extends cjo<?>> cm = ImmutableList.of(
      cjo.s, cjo.g, cjo.h, cjo.k, cjo.l, cjo.o, cjo.n, cjo.F, cjo.u, cjo.p, cjo.q, cjo.L, new cjo[]{cjo.z, cjo.O, cjo.C, cjo.P, cjo.Q, cjo.S, cjo.V, cjo.aa}
   );
   private static final alh<Integer> cw = all.a(cnu.class, alj.b);
   private static final alh<Boolean> cx = all.a(cnu.class, alj.k);
   private static final alh<Boolean> cy = all.a(cnu.class, alj.k);
   public static final double co = 20.0;
   public static final int cp = 1200;
   private static final int cz = 6000;
   public static final String cq = "Variant";
   private static final int cA = 1800;
   private static final int cB = 2400;
   private static final boolean cC = false;
   public final ban cr = new ban(10, bcb::m);
   public final ban cs = new ban(10, bcb::m);
   public final ban ct = new ban(10, bcb::m);
   public final ban cu = new ban(10, bcb::m);
   private static final int cD = 100;

   public cnu(bzv<? extends cnu> $$0, dmu $$1) {
      super($$0, $$1);
      this.a(fbc.j, 0.0F);
      this.ce = new cnu.d(this);
      this.cd = new cnu.c(this, 20);
   }

   @Override
   public float a(jb $$0, dmx $$1) {
      return 0.0F;
   }

   @Override
   protected void a(all.a $$0) {
      super.a($$0);
      $$0.a(cw, 0);
      $$0.a(cx, false);
      $$0.a(cy, false);
   }

   @Override
   protected void a(fdc $$0) {
      super.a($$0);
      $$0.a("Variant", cnu.e.i, this.gH());
      $$0.a("FromBucket", this.m());
   }

   @Override
   protected void a(fda $$0) {
      super.a($$0);
      this.a($$0.<cnu.e>a("Variant", cnu.e.i).orElse(cnu.e.f));
      this.x($$0.a("FromBucket", false));
   }

   @Override
   public void X() {
      if (!this.gI()) {
         super.X();
      }
   }

   @Override
   public cbe a(dnl $$0, bxh $$1, bzu $$2, @Nullable cbe $$3) {
      boolean $$4 = false;
      if ($$2 == bzu.l) {
         return $$3;
      } else {
         bck $$5 = $$0.H_();
         if ($$3 instanceof cnu.b) {
            if (((cnu.b)$$3).a() >= 2) {
               $$4 = true;
            }
         } else {
            $$3 = new cnu.b(cnu.e.a($$5), cnu.e.a($$5));
         }

         this.a(((cnu.b)$$3).a($$5));
         if ($$4) {
            this.c_(-24000);
         }

         return super.a($$0, $$1, $$2, $$3);
      }
   }

   @Override
   public void az() {
      int $$0 = this.cw();
      super.az();
      if (!this.gw() && this.ai() instanceof aub $$1) {
         this.a($$1, $$0);
      }

      if (this.ai().B_()) {
         this.gK();
      }
   }

   private void gK() {
      cnu.a $$0;
      if (this.gI()) {
         $$0 = cnu.a.a;
      } else if (this.bm()) {
         $$0 = cnu.a.b;
      } else if (this.aK()) {
         $$0 = cnu.a.c;
      } else {
         $$0 = cnu.a.d;
      }

      this.cr.a($$0 == cnu.a.a);
      this.cs.a($$0 == cnu.a.b);
      this.ct.a($$0 == cnu.a.c);
      boolean $$4 = this.bp.d() || this.dR() != this.ab || this.dP() != this.aa;
      this.cu.a($$4);
   }

   protected void a(aub $$0, int $$1) {
      if (this.bO() && !this.bo()) {
         this.j($$1 - 1);
         if (this.cw() == -20) {
            this.j(0);
            this.a($$0, this.ea().t(), 2.0F);
         }
      } else {
         this.j(this.cv());
      }
   }

   public void t() {
      int $$0 = this.cw() + 1800;
      this.j(Math.min($$0, this.cv()));
   }

   @Override
   public int cv() {
      return 6000;
   }

   public cnu.e gH() {
      return cnu.e.a(this.ay.a(cw));
   }

   private void a(cnu.e $$0) {
      this.ay.a(cw, $$0.a());
   }

   @Nullable
   @Override
   public <T> T a(kp<? extends T> $$0) {
      return $$0 == kq.aO ? c((kp<T>)$$0, this.gH()) : super.a($$0);
   }

   @Override
   protected void a(kl $$0) {
      this.a($$0, kq.aO);
      super.a($$0);
   }

   @Override
   protected <T> boolean b(kp<T> $$0, T $$1) {
      if ($$0 == kq.aO) {
         this.a(c(kq.aO, $$1));
         return true;
      } else {
         return super.b($$0, $$1);
      }
   }

   private static boolean a(bck $$0) {
      return $$0.a(1200) == 0;
   }

   @Override
   public boolean a(dmx $$0) {
      return $$0.f(this);
   }

   @Override
   public boolean cN() {
      return false;
   }

   public void y(boolean $$0) {
      this.ay.a(cx, $$0);
   }

   public boolean gI() {
      return this.ay.a(cx);
   }

   @Override
   public boolean m() {
      return this.ay.a(cy);
   }

   @Override
   public void x(boolean $$0) {
      this.ay.a(cy, $$0);
   }

   @Nullable
   @Override
   public bzc a(aub $$0, bzc $$1) {
      cnu $$2 = bzv.i.a($$0, bzu.e);
      if ($$2 != null) {
         cnu.e $$3;
         if (a(this.ar)) {
            $$3 = cnu.e.b(this.ar);
         } else {
            $$3 = this.ar.h() ? this.gH() : ((cnu)$$1).gH();
         }

         $$2.a($$3);
         $$2.gp();
      }

      return $$2;
   }

   @Override
   public boolean i(dcv $$0) {
      return $$0.a(azx.aX);
   }

   @Override
   public boolean v() {
      return true;
   }

   @Override
   protected void a(aub $$0) {
      btt $$1 = bts.a();
      $$1.a("axolotlBrain");
      this.eh().a($$0, this);
      $$1.c();
      $$1.a("axolotlActivityUpdate");
      cnv.a(this);
      $$1.c();
      if (!this.gw()) {
         Optional<Integer> $$2 = this.eh().c(cjo.O);
         this.y($$2.isPresent() && $$2.get() > 0);
      }
   }

   public static cbr.a gJ() {
      return cmd.gM().a(cbs.t, 14.0).a(cbs.w, 1.0).a(cbs.c, 2.0).a(cbs.C, 1.0);
   }

   @Override
   protected cjw b(dmu $$0) {
      return new cjt(this, $$0);
   }

   @Override
   public void gA() {
      this.a(ayz.aK, 1.0F, 1.0F);
   }

   @Override
   public boolean a(aub $$0, byb $$1, float $$2) {
      float $$3 = this.eL();
      if (!this.gw()
         && this.ai().A.a(3) == 0
         && (this.ai().A.a(3) < $$2 || $$3 / this.fa() < 0.5F)
         && $$2 < $$3
         && this.bm()
         && ($$1.d() != null || $$1.c() != null)
         && !this.gI()) {
         this.bO.a(cjo.O, 200);
      }

      return super.a($$0, $$1, $$2);
   }

   @Override
   public int gg() {
      return 1;
   }

   @Override
   public int gh() {
      return 1;
   }

   @Override
   public bxj b(cut $$0, bxi $$1) {
      return cmf.a($$0, $$1, this).orElse(super.b($$0, $$1));
   }

   @Override
   public void a_(dcv $$0) {
      cmf.a(this, $$0);
      $$0.a(kq.aO, this);
      dfd.a(kq.Z, $$0, $$0x -> {
         $$0x.a("Age", this.Z_());
         cbm<?> $$1 = this.eh();
         if ($$1.a(cjo.V)) {
            $$0x.a("HuntingCooldown", $$1.e(cjo.V));
         }
      });
   }

   @Override
   public void a(ui $$0) {
      cmf.a(this, $$0);
      this.c_($$0.b("Age", 0));
      $$0.f("HuntingCooldown").ifPresentOrElse($$1 -> this.eh().a(cjo.V, true, $$0.b("HuntingCooldown", 0L)), () -> this.eh().a(cjo.V, Optional.empty()));
   }

   @Override
   public dcv a() {
      return new dcv(dcz.rQ);
   }

   @Override
   public ayy n() {
      return ayz.dk;
   }

   @Override
   public boolean eE() {
      return !this.gI() && super.eE();
   }

   public static void a(aub $$0, cnu $$1, cam $$2) {
      if ($$2.eM()) {
         byb $$3 = $$2.eN();
         if ($$3 != null) {
            bzm $$4 = $$3.d();
            if ($$4 != null && $$4.ap() == bzv.bU) {
               cut $$5 = (cut)$$4;
               List<cut> $$6 = $$0.a(cut.class, $$1.cV().g(20.0));
               if ($$6.contains($$5)) {
                  $$1.g($$5);
               }
            }
         }
      }
   }

   public void g(cut $$0) {
      byq $$1 = $$0.e(bys.j);
      if ($$1 == null || $$1.a(2399)) {
         int $$2 = $$1 != null ? $$1.d() : 0;
         int $$3 = Math.min(2400, 100 + $$2);
         $$0.b(new byq(bys.j, $$3, 0), this);
      }

      $$0.g(bys.d);
   }

   @Override
   public boolean af() {
      return super.af() || this.m();
   }

   @Override
   protected ayy e(byb $$0) {
      return ayz.aM;
   }

   @Nullable
   @Override
   protected ayy f_() {
      return ayz.aL;
   }

   @Nullable
   @Override
   protected ayy p() {
      return this.bm() ? ayz.aO : ayz.aN;
   }

   @Override
   protected ayy aZ() {
      return ayz.aP;
   }

   @Override
   protected ayy aY() {
      return ayz.aQ;
   }

   @Override
   protected cbm.b<cnu> ei() {
      return cbm.a(cm, cl);
   }

   @Override
   protected cbm<?> a(Dynamic<?> $$0) {
      return cnv.a(this.ei().a($$0));
   }

   @Override
   public cbm<cnu> eh() {
      return (cbm<cnu>)super.eh();
   }

   @Override
   protected void ah() {
      super.ah();
      ahj.a(this);
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

   @Override
   protected void a(cut $$0, bxi $$1, dcv $$2) {
      if ($$2.a(dcz.rP)) {
         $$0.a($$1, dcy.a($$2, $$0, new dcv(dcz.rG)));
      } else {
         super.a($$0, $$1, $$2);
      }
   }

   @Override
   public boolean h(double $$0) {
      return !this.m() && !this.i_();
   }

   @Nullable
   @Override
   public cam e() {
      return this.U();
   }

   public static boolean a(bzv<? extends cam> $$0, dnl $$1, bzu $$2, jb $$3, bck $$4) {
      return $$1.a_($$3.e()).a(azo.cd);
   }

   public static enum a {
      a,
      b,
      c,
      d;
   }

   public static class b extends bzc.a {
      public final cnu.e[] a;

      public b(cnu.e... $$0) {
         super(false);
         this.a = $$0;
      }

      public cnu.e a(bck $$0) {
         return this.a[$$0.a(this.a.length)];
      }
   }

   class c extends cgm {
      public c(final cnu $$0, final int $$1) {
         super($$0, $$1);
      }

      @Override
      public void a() {
         if (!cnu.this.gI()) {
            super.a();
         }
      }
   }

   static class d extends cgn {
      private final cnu l;

      public d(cnu $$0) {
         super($$0, 85, 10, 0.1F, 0.5F, false);
         this.l = $$0;
      }

      @Override
      public void a() {
         if (!this.l.gI()) {
            super.a();
         }
      }
   }

   public static enum e implements bda {
      a(0, "lucy", true),
      b(1, "wild", true),
      c(2, "gold", true),
      d(3, "cyan", true),
      e(4, "blue", false);

      public static final cnu.e f = a;
      private static final IntFunction<cnu.e> j = baq.a(cnu.e::a, values(), baq.a.a);
      public static final zm<ByteBuf, cnu.e> g = zk.a(j, cnu.e::a);
      public static final Codec<cnu.e> h = bda.a(cnu.e::values);
      @Deprecated
      public static final Codec<cnu.e> i = Codec.INT.xmap(j::apply, cnu.e::a);
      private final int k;
      private final String l;
      private final boolean m;

      private e(final int $$0, final String $$1, final boolean $$2) {
         this.k = $$0;
         this.l = $$1;
         this.m = $$2;
      }

      public int a() {
         return this.k;
      }

      public String b() {
         return this.l;
      }

      @Override
      public String c() {
         return this.l;
      }

      public static cnu.e a(int $$0) {
         return j.apply($$0);
      }

      public static cnu.e a(bck $$0) {
         return a($$0, true);
      }

      public static cnu.e b(bck $$0) {
         return a($$0, false);
      }

      private static cnu.e a(bck $$0, boolean $$1) {
         cnu.e[] $$2 = Arrays.stream(values()).filter($$1x -> $$1x.m == $$1).toArray(cnu.e[]::new);
         return ag.a($$2, $$0);
      }
   }
}
