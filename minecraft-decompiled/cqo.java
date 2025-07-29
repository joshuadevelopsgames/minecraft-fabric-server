import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cqo extends cam {
   public static final int a = 5;
   private static final boolean ca = true;
   public static final kd b = new kd(0.0F, 0.0F, 0.0F);
   public static final kd c = new kd(0.0F, 0.0F, 0.0F);
   public static final kd d = new kd(-10.0F, 0.0F, -10.0F);
   public static final kd e = new kd(-15.0F, 0.0F, 10.0F);
   public static final kd f = new kd(-1.0F, 0.0F, -1.0F);
   public static final kd g = new kd(1.0F, 0.0F, 1.0F);
   private static final bzp cb = bzp.c(0.0F, 0.0F);
   private static final bzp cc = bzv.g.n().a(0.5F).b(0.9875F);
   private static final double cd = 0.1;
   private static final double ce = 0.9;
   private static final double cf = 0.4;
   private static final double cg = 1.6;
   public static final int h = 8;
   public static final int i = 16;
   public static final int j = 1;
   public static final int k = 4;
   public static final int bQ = 8;
   public static final int bR = 16;
   public static final alh<Byte> bS = all.a(cqo.class, alj.a);
   public static final alh<kd> bT = all.a(cqo.class, alj.n);
   public static final alh<kd> bU = all.a(cqo.class, alj.n);
   public static final alh<kd> bV = all.a(cqo.class, alj.n);
   public static final alh<kd> bW = all.a(cqo.class, alj.n);
   public static final alh<kd> bX = all.a(cqo.class, alj.n);
   public static final alh<kd> bY = all.a(cqo.class, alj.n);
   private static final Predicate<bzm> ch = $$0 -> $$0 instanceof cxg $$1 && $$1.x();
   private static final boolean ci = false;
   private static final int cj = 0;
   private static final boolean ck = false;
   private static final boolean cl = false;
   private static final boolean cm = false;
   private static final boolean cn = false;
   private boolean co = false;
   public long bZ;
   private int cp = 0;

   public cqo(bzv<? extends cqo> $$0, dmu $$1) {
      super($$0, $$1);
   }

   public cqo(dmu $$0, double $$1, double $$2, double $$3) {
      this(bzv.g, $$0);
      this.a_($$1, $$2, $$3);
   }

   public static cbr.a l() {
      return ej().a(cbs.C, 0.0);
   }

   @Override
   public void j_() {
      double $$0 = this.dC();
      double $$1 = this.dE();
      double $$2 = this.dI();
      super.j_();
      this.a_($$0, $$1, $$2);
   }

   private boolean C() {
      return !this.t() && !this.bf();
   }

   @Override
   public boolean dl() {
      return super.dl() && this.C();
   }

   @Override
   protected void a(all.a $$0) {
      super.a($$0);
      $$0.a(bS, (byte)0);
      $$0.a(bT, b);
      $$0.a(bU, c);
      $$0.a(bV, d);
      $$0.a(bW, e);
      $$0.a(bX, f);
      $$0.a(bY, g);
   }

   @Override
   public boolean e(bzw $$0) {
      return $$0 != bzw.g && $$0 != bzw.h && !this.g($$0);
   }

   @Override
   protected void a(fdc $$0) {
      super.a($$0);
      $$0.a("Invisible", this.cs());
      $$0.a("Small", this.m());
      $$0.a("ShowArms", this.n());
      $$0.a("DisabledSlots", this.cp);
      $$0.a("NoBasePlate", !this.p());
      if (this.t()) {
         $$0.a("Marker", this.t());
      }

      $$0.a("Pose", cqo.a.b, this.B());
   }

   @Override
   protected void a(fda $$0) {
      super.a($$0);
      this.l($$0.a("Invisible", false));
      this.u($$0.a("Small", false));
      this.a($$0.a("ShowArms", false));
      this.cp = $$0.a("DisabledSlots", 0);
      this.b($$0.a("NoBasePlate", false));
      this.v($$0.a("Marker", false));
      this.aq = !this.C();
      $$0.<cqo.a>a("Pose", cqo.a.b).ifPresent(this::a);
   }

   @Override
   public boolean bL() {
      return false;
   }

   @Override
   protected void E(bzm $$0) {
   }

   @Override
   protected void o() {
      for (bzm $$1 : this.ai().a(this, this.cV(), ch)) {
         if (this.g($$1) <= 0.2) {
            $$1.h(this);
         }
      }
   }

   @Override
   public bxj a(cut $$0, fis $$1, bxi $$2) {
      dcv $$3 = $$0.b($$2);
      if (this.t() || $$3.a(dcz.wo)) {
         return bxj.e;
      } else if ($$0.am()) {
         return bxj.a;
      } else if ($$0.ai().C) {
         return bxj.b;
      } else {
         bzw $$4 = this.f($$3);
         if ($$3.f()) {
            bzw $$5 = this.a($$1);
            bzw $$6 = this.g($$5) ? $$4 : $$5;
            if (this.d($$6) && this.a($$0, $$6, $$3, $$2)) {
               return bxj.b;
            }
         } else {
            if (this.g($$4)) {
               return bxj.d;
            }

            if ($$4.a() == bzw.a.a && !this.n()) {
               return bxj.d;
            }

            if (this.a($$0, $$4, $$3, $$2)) {
               return bxj.b;
            }
         }

         return bxj.e;
      }
   }

   private bzw a(fis $$0) {
      bzw $$1 = bzw.a;
      boolean $$2 = this.m();
      double $$3 = $$0.e / (this.eq() * this.ep());
      bzw $$4 = bzw.c;
      if ($$3 >= 0.1 && $$3 < 0.1 + ($$2 ? 0.8 : 0.45) && this.d($$4)) {
         $$1 = bzw.c;
      } else if ($$3 >= 0.9 + ($$2 ? 0.3 : 0.0) && $$3 < 0.9 + ($$2 ? 1.0 : 0.7) && this.d(bzw.e)) {
         $$1 = bzw.e;
      } else if ($$3 >= 0.4 && $$3 < 0.4 + ($$2 ? 1.0 : 0.8) && this.d(bzw.d)) {
         $$1 = bzw.d;
      } else if ($$3 >= 1.6 && this.d(bzw.f)) {
         $$1 = bzw.f;
      } else if (!this.d(bzw.a) && this.d(bzw.b)) {
         $$1 = bzw.b;
      }

      return $$1;
   }

   private boolean g(bzw $$0) {
      return (this.cp & 1 << $$0.b(0)) != 0 || $$0.a() == bzw.a.a && !this.n();
   }

   private boolean a(cut $$0, bzw $$1, dcv $$2, bxi $$3) {
      dcv $$4 = this.a($$1);
      if (!$$4.f() && (this.cp & 1 << $$1.b(8)) != 0) {
         return false;
      } else if ($$4.f() && (this.cp & 1 << $$1.b(16)) != 0) {
         return false;
      } else if ($$0.gc() && $$4.f() && !$$2.f()) {
         this.a($$1, $$2.c(1));
         return true;
      } else if ($$2.f() || $$2.M() <= 1) {
         this.a($$1, $$2);
         $$0.a($$3, $$4);
         return true;
      } else if (!$$4.f()) {
         return false;
      } else {
         this.a($$1, $$2.a(1));
         return true;
      }
   }

   @Override
   public boolean a(aub $$0, byb $$1, float $$2) {
      if (this.dU()) {
         return false;
      } else if (!$$0.P().c(dmq.d) && $$1.d() instanceof cao) {
         return false;
      } else if ($$1.a(azp.d)) {
         this.c($$0);
         return false;
      } else if (this.a($$0, $$1) || this.co || this.t()) {
         return false;
      } else if ($$1.a(azp.l)) {
         this.d($$0, $$1);
         this.c($$0);
         return false;
      } else if ($$1.a(azp.u)) {
         if (this.cb()) {
            this.d($$0, $$1, 0.15F);
         } else {
            this.e(5.0F);
         }

         return false;
      } else if ($$1.a(azp.v) && this.eL() > 0.5F) {
         this.d($$0, $$1, 4.0F);
         return false;
      } else {
         boolean $$3 = $$1.a(azp.B);
         boolean $$4 = $$1.a(azp.A);
         if (!$$3 && !$$4) {
            return false;
         } else if ($$1.d() instanceof cut $$5 && !$$5.gt().e) {
            return false;
         } else if ($$1.h()) {
            this.E();
            this.D();
            this.c($$0);
            return true;
         } else {
            long $$6 = $$0.ae();
            if ($$6 - this.bZ > 5L && !$$4) {
               $$0.a(this, (byte)32);
               this.a(ejb.o, $$1.d());
               this.bZ = $$6;
            } else {
               this.c($$0, $$1);
               this.D();
               this.c($$0);
            }

            return true;
         }
      }
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 32) {
         if (this.ai().C) {
            this.ai().a(this.dC(), this.dE(), this.dI(), ayz.aC, this.do(), 0.3F, 1.0F, false);
            this.bZ = this.ai().ae();
         }
      } else {
         super.b($$0);
      }
   }

   @Override
   public boolean a(double $$0) {
      double $$1 = this.cV().a() * 4.0;
      if (Double.isNaN($$1) || $$1 == 0.0) {
         $$1 = 4.0;
      }

      $$1 *= 64.0;
      return $$0 < $$1 * $$1;
   }

   private void D() {
      if (this.ai() instanceof aub) {
         ((aub)this.ai())
            .a(new lw(me.b, dqb.n.m()), this.dC(), this.e(0.6666666666666666), this.dI(), 10, this.ds() / 4.0F, this.dt() / 4.0F, this.ds() / 4.0F, 0.05);
      }
   }

   private void d(aub $$0, byb $$1, float $$2) {
      float $$3 = this.eL();
      $$3 -= $$2;
      if ($$3 <= 0.5F) {
         this.d($$0, $$1);
         this.c($$0);
      } else {
         this.x($$3);
         this.a(ejb.o, $$1.d());
      }
   }

   private void c(aub $$0, byb $$1) {
      dcv $$2 = new dcv(dcz.wi);
      $$2.b(kq.g, this.al());
      dpz.a(this.ai(), this.dx(), $$2);
      this.d($$0, $$1);
   }

   private void d(aub $$0, byb $$1) {
      this.E();
      this.b($$0, $$1);

      for (bzw $$2 : bzw.j) {
         dcv $$3 = this.bP.a($$2, dcv.l);
         if (!$$3.f()) {
            dpz.a(this.ai(), this.dx().d(), $$3);
         }
      }
   }

   private void E() {
      this.ai().a(null, this.dC(), this.dE(), this.dI(), ayz.aA, this.do(), 1.0F, 1.0F);
   }

   @Override
   protected void C(float $$0) {
      this.bs = this.aa;
      this.br = this.dP();
   }

   @Override
   public void k(fis $$0) {
      if (this.C()) {
         super.k($$0);
      }
   }

   @Override
   public void s(float $$0) {
      this.bs = this.aa = $$0;
      this.bu = this.bt = $$0;
   }

   @Override
   public void r(float $$0) {
      this.bs = this.aa = $$0;
      this.bu = this.bt = $$0;
   }

   @Override
   protected void K() {
      this.l(this.co);
   }

   @Override
   public void l(boolean $$0) {
      this.co = $$0;
      super.l($$0);
   }

   @Override
   public boolean g_() {
      return this.m();
   }

   @Override
   public void c(aub $$0) {
      this.a(bzm.e.a);
      this.c(ejb.p);
   }

   @Override
   public boolean a(dmn $$0) {
      return $$0.h() ? this.cs() : true;
   }

   @Override
   public faq k_() {
      return this.t() ? faq.d : super.k_();
   }

   @Override
   public boolean n_() {
      return this.t();
   }

   private void u(boolean $$0) {
      this.ay.a(bS, this.a(this.ay.a(bS), 1, $$0));
   }

   public boolean m() {
      return (this.ay.a(bS) & 1) != 0;
   }

   public void a(boolean $$0) {
      this.ay.a(bS, this.a(this.ay.a(bS), 4, $$0));
   }

   public boolean n() {
      return (this.ay.a(bS) & 4) != 0;
   }

   public void b(boolean $$0) {
      this.ay.a(bS, this.a(this.ay.a(bS), 8, $$0));
   }

   public boolean p() {
      return (this.ay.a(bS) & 8) == 0;
   }

   private void v(boolean $$0) {
      this.ay.a(bS, this.a(this.ay.a(bS), 16, $$0));
   }

   public boolean t() {
      return (this.ay.a(bS) & 16) != 0;
   }

   private byte a(byte $$0, int $$1, boolean $$2) {
      if ($$2) {
         $$0 = (byte)($$0 | $$1);
      } else {
         $$0 = (byte)($$0 & ~$$1);
      }

      return $$0;
   }

   public void a(kd $$0) {
      this.ay.a(bT, $$0);
   }

   public void b(kd $$0) {
      this.ay.a(bU, $$0);
   }

   public void c(kd $$0) {
      this.ay.a(bV, $$0);
   }

   public void d(kd $$0) {
      this.ay.a(bW, $$0);
   }

   public void e(kd $$0) {
      this.ay.a(bX, $$0);
   }

   public void f(kd $$0) {
      this.ay.a(bY, $$0);
   }

   public kd u() {
      return this.ay.a(bT);
   }

   public kd v() {
      return this.ay.a(bU);
   }

   public kd x() {
      return this.ay.a(bV);
   }

   public kd y() {
      return this.ay.a(bW);
   }

   public kd z() {
      return this.ay.a(bX);
   }

   public kd A() {
      return this.ay.a(bY);
   }

   @Override
   public boolean bK() {
      return super.bK() && !this.t();
   }

   @Override
   public boolean w(bzm $$0) {
      return $$0 instanceof cut $$1 && !this.ai().a($$1, this.dx());
   }

   @Override
   public cad fF() {
      return cad.b;
   }

   @Override
   public cam.a eT() {
      return new cam.a(ayz.aB, ayz.aB);
   }

   @Nullable
   @Override
   protected ayy e(byb $$0) {
      return ayz.aC;
   }

   @Nullable
   @Override
   protected ayy f_() {
      return ayz.aA;
   }

   @Override
   public void a(aub $$0, cal $$1) {
   }

   @Override
   public boolean fS() {
      return false;
   }

   @Override
   public void a(alh<?> $$0) {
      if (bS.equals($$0)) {
         this.j_();
         this.V = !this.t();
      }

      super.a($$0);
   }

   @Override
   public boolean fT() {
      return false;
   }

   @Override
   public bzp e(cay $$0) {
      return this.w(this.t());
   }

   private bzp w(boolean $$0) {
      if ($$0) {
         return cb;
      } else {
         return this.g_() ? cc : this.ap().n();
      }
   }

   @Override
   public fis o(float $$0) {
      if (this.t()) {
         fin $$1 = this.w(false).a(this.dv());
         jb $$2 = this.dx();
         int $$3 = Integer.MIN_VALUE;

         for (jb $$4 : jb.c(jb.a($$1.a, $$1.b, $$1.c), jb.a($$1.d, $$1.e, $$1.f))) {
            int $$5 = Math.max(this.ai().a(dnd.b, $$4), this.ai().a(dnd.a, $$4));
            if ($$5 == 15) {
               return fis.b($$4);
            }

            if ($$5 > $$3) {
               $$3 = $$5;
               $$2 = $$4.j();
            }
         }

         return fis.b($$2);
      } else {
         return super.o($$0);
      }
   }

   @Override
   public dcv dM() {
      return new dcv(dcz.wi);
   }

   @Override
   public boolean eF() {
      return !this.cs() && !this.t();
   }

   public void a(cqo.a $$0) {
      this.a($$0.a());
      this.b($$0.b());
      this.c($$0.c());
      this.d($$0.d());
      this.e($$0.e());
      this.f($$0.f());
   }

   public cqo.a B() {
      return new cqo.a(this.u(), this.v(), this.x(), this.y(), this.z(), this.A());
   }

   public record a(kd c, kd d, kd e, kd f, kd g, kd h) {
      public static final cqo.a a = new cqo.a(cqo.b, cqo.c, cqo.d, cqo.e, cqo.f, cqo.g);
      public static final Codec<cqo.a> b = RecordCodecBuilder.create(
         $$0 -> $$0.group(
               kd.a.optionalFieldOf("Head", cqo.b).forGetter(cqo.a::a),
               kd.a.optionalFieldOf("Body", cqo.c).forGetter(cqo.a::b),
               kd.a.optionalFieldOf("LeftArm", cqo.d).forGetter(cqo.a::c),
               kd.a.optionalFieldOf("RightArm", cqo.e).forGetter(cqo.a::d),
               kd.a.optionalFieldOf("LeftLeg", cqo.f).forGetter(cqo.a::e),
               kd.a.optionalFieldOf("RightLeg", cqo.g).forGetter(cqo.a::f)
            )
            .apply($$0, cqo.a::new)
      );

      public kd a() {
         return this.c;
      }

      public kd b() {
         return this.d;
      }

      public kd c() {
         return this.e;
      }

      public kd d() {
         return this.f;
      }

      public kd e() {
         return this.g;
      }

      public kd f() {
         return this.h;
      }
   }
}
