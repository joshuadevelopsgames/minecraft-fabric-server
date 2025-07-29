import java.util.Comparator;
import java.util.EnumSet;
import java.util.List;
import javax.annotation.Nullable;

public class crx extends cao implements crn {
   public static final float a = 7.448451F;
   public static final int b = bcb.f(24.166098F);
   private static final alh<Integer> c = all.a(crx.class, alj.b);
   fis d = fis.c;
   @Nullable
   jb e;
   crx.a f = crx.a.a;

   public crx(bzv<? extends crx> $$0, dmu $$1) {
      super($$0, $$1);
      this.cc = 5;
      this.ce = new crx.g(this);
      this.cd = new crx.f(this);
   }

   @Override
   public boolean bd() {
      return (this.m() + this.as) % b == 0;
   }

   @Override
   protected cgg O() {
      return new crx.d(this);
   }

   @Override
   protected void H() {
      this.ch.a(1, new crx.c());
      this.ch.a(2, new crx.i());
      this.ch.a(3, new crx.e());
      this.ci.a(1, new crx.b());
   }

   @Override
   protected void a(all.a $$0) {
      super.a($$0);
      $$0.a(c, 0);
   }

   public void b(int $$0) {
      this.ay.a(c, bcb.a($$0, 0, 64));
   }

   private void n() {
      this.j_();
      this.h(cbs.c).a(6 + this.l());
   }

   public int l() {
      return this.ay.a(c);
   }

   @Override
   public void a(alh<?> $$0) {
      if (c.equals($$0)) {
         this.n();
      }

      super.a($$0);
   }

   public int m() {
      return this.ar() * 3;
   }

   @Override
   protected boolean ag() {
      return true;
   }

   @Override
   public void g() {
      super.g();
      if (this.ai().C) {
         float $$0 = bcb.b((this.m() + this.as) * 7.448451F * (float) (Math.PI / 180.0) + (float) Math.PI);
         float $$1 = bcb.b((this.m() + this.as + 1) * 7.448451F * (float) (Math.PI / 180.0) + (float) Math.PI);
         if ($$0 > 0.0F && $$1 <= 0.0F) {
            this.ai().a(this.dC(), this.dE(), this.dI(), ayz.uL, this.do(), 0.95F + this.ar.i() * 0.05F, 0.95F + this.ar.i() * 0.05F, false);
         }

         float $$2 = this.ds() * 1.48F;
         float $$3 = bcb.b(this.dP() * (float) (Math.PI / 180.0)) * $$2;
         float $$4 = bcb.a(this.dP() * (float) (Math.PI / 180.0)) * $$2;
         float $$5 = (0.3F + $$0 * 0.45F) * this.dt() * 2.5F;
         this.ai().a(me.ac, this.dC() + $$3, this.dE() + $$5, this.dI() + $$4, 0.0, 0.0, 0.0);
         this.ai().a(me.ac, this.dC() - $$3, this.dE() + $$5, this.dI() - $$4, 0.0, 0.0, 0.0);
      }
   }

   @Override
   public void e_() {
      if (this.bO() && this.gB()) {
         this.e(8.0F);
      }

      super.e_();
   }

   @Override
   protected void a(double $$0, boolean $$1, eeb $$2, jb $$3) {
   }

   @Override
   public boolean eV() {
      return false;
   }

   @Override
   public void k(fis $$0) {
      this.a($$0, 0.2F);
   }

   @Override
   public cbe a(dnl $$0, bxh $$1, bzu $$2, @Nullable cbe $$3) {
      this.e = this.dx().b(5);
      this.b(0);
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(fda $$0) {
      super.a($$0);
      this.e = $$0.<jb>a("anchor_pos", jb.a).orElse(null);
      this.b($$0.a("size", 0));
   }

   @Override
   protected void a(fdc $$0) {
      super.a($$0);
      $$0.b("anchor_pos", jb.a, this.e);
      $$0.a("size", this.l());
   }

   @Override
   public boolean a(double $$0) {
      return true;
   }

   @Override
   public aza do() {
      return aza.f;
   }

   @Override
   protected ayy p() {
      return ayz.uI;
   }

   @Override
   protected ayy e(byb $$0) {
      return ayz.uM;
   }

   @Override
   protected ayy f_() {
      return ayz.uK;
   }

   @Override
   protected float fk() {
      return 1.0F;
   }

   @Override
   public boolean a(bzv<?> $$0) {
      return true;
   }

   @Override
   public bzp e(cay $$0) {
      int $$1 = this.l();
      bzp $$2 = super.e($$0);
      return $$2.a(1.0F + 0.15F * $$1);
   }

   boolean a(aub $$0, cam $$1, clc $$2) {
      return $$2.a($$0, this, $$1);
   }

   static enum a {
      a,
      b;
   }

   class b extends chi {
      private final clc b = clc.a().a(64.0);
      private int c = b(20);

      @Override
      public boolean b() {
         if (this.c > 0) {
            this.c--;
            return false;
         } else {
            this.c = b(60);
            aub $$0 = a(crx.this.ai());
            List<cut> $$1 = $$0.a(this.b, crx.this, crx.this.cV().c(16.0, 64.0, 16.0));
            if (!$$1.isEmpty()) {
               $$1.sort(Comparator.comparing(bzm::dE).reversed());

               for (cut $$2 : $$1) {
                  if (crx.this.a($$0, $$2, clc.a)) {
                     crx.this.g($$2);
                     return true;
                  }
               }
            }

            return false;
         }
      }

      @Override
      public boolean c() {
         cam $$0 = crx.this.e();
         return $$0 != null ? crx.this.a(a(crx.this.ai()), $$0, clc.a) : false;
      }
   }

   class c extends chi {
      private int b;

      @Override
      public boolean b() {
         cam $$0 = crx.this.e();
         return $$0 != null ? crx.this.a(a(crx.this.ai()), $$0, clc.a) : false;
      }

      @Override
      public void d() {
         this.b = this.a(10);
         crx.this.f = crx.a.a;
         this.h();
      }

      @Override
      public void e() {
         if (crx.this.e != null) {
            crx.this.e = crx.this.ai().a(eka.a.e, crx.this.e).b(10 + crx.this.ar.a(20));
         }
      }

      @Override
      public void a() {
         if (crx.this.f == crx.a.a) {
            this.b--;
            if (this.b <= 0) {
               crx.this.f = crx.a.b;
               this.h();
               this.b = this.a((8 + crx.this.ar.a(4)) * 20);
               crx.this.a(ayz.uN, 10.0F, 0.95F + crx.this.ar.i() * 0.1F);
            }
         }
      }

      private void h() {
         if (crx.this.e != null) {
            crx.this.e = crx.this.e().dx().b(20 + crx.this.ar.a(20));
            if (crx.this.e.v() < crx.this.ai().Q()) {
               crx.this.e = new jb(crx.this.e.u(), crx.this.ai().Q() + 1, crx.this.e.w());
            }
         }
      }
   }

   class d extends cgg {
      public d(final cao $$0) {
         super($$0);
      }

      @Override
      public void a() {
         crx.this.bt = crx.this.br;
         crx.this.br = crx.this.dP();
      }
   }

   class e extends crx.h {
      private float c;
      private float d;
      private float e;
      private float f;

      @Override
      public boolean b() {
         return crx.this.e() == null || crx.this.f == crx.a.a;
      }

      @Override
      public void d() {
         this.d = 5.0F + crx.this.ar.i() * 10.0F;
         this.e = -4.0F + crx.this.ar.i() * 9.0F;
         this.f = crx.this.ar.h() ? 1.0F : -1.0F;
         this.i();
      }

      @Override
      public void a() {
         if (crx.this.ar.a(this.a(350)) == 0) {
            this.e = -4.0F + crx.this.ar.i() * 9.0F;
         }

         if (crx.this.ar.a(this.a(250)) == 0) {
            this.d++;
            if (this.d > 15.0F) {
               this.d = 5.0F;
               this.f = -this.f;
            }
         }

         if (crx.this.ar.a(this.a(450)) == 0) {
            this.c = crx.this.ar.i() * 2.0F * (float) Math.PI;
            this.i();
         }

         if (this.h()) {
            this.i();
         }

         if (crx.this.d.e < crx.this.dE() && !crx.this.ai().w(crx.this.dx().c(1))) {
            this.e = Math.max(1.0F, this.e);
            this.i();
         }

         if (crx.this.d.e > crx.this.dE() && !crx.this.ai().w(crx.this.dx().b(1))) {
            this.e = Math.min(-1.0F, this.e);
            this.i();
         }
      }

      private void i() {
         if (crx.this.e == null) {
            crx.this.e = crx.this.dx();
         }

         this.c = this.c + this.f * 15.0F * (float) (Math.PI / 180.0);
         crx.this.d = fis.a(crx.this.e).b(this.d * bcb.b(this.c), -4.0F + this.e, this.d * bcb.a(this.c));
      }
   }

   static class f extends cgk {
      public f(cao $$0) {
         super($$0);
      }

      @Override
      public void a() {
      }
   }

   class g extends cgl {
      private float m = 0.1F;

      public g(final cao $$0) {
         super($$0);
      }

      @Override
      public void a() {
         if (crx.this.ac) {
            crx.this.v(crx.this.dP() + 180.0F);
            this.m = 0.1F;
         }

         double $$0 = crx.this.d.d - crx.this.dC();
         double $$1 = crx.this.d.e - crx.this.dE();
         double $$2 = crx.this.d.f - crx.this.dI();
         double $$3 = Math.sqrt($$0 * $$0 + $$2 * $$2);
         if (Math.abs($$3) > 1.0E-5F) {
            double $$4 = 1.0 - Math.abs($$1 * 0.7F) / $$3;
            $$0 *= $$4;
            $$2 *= $$4;
            $$3 = Math.sqrt($$0 * $$0 + $$2 * $$2);
            double $$5 = Math.sqrt($$0 * $$0 + $$2 * $$2 + $$1 * $$1);
            float $$6 = crx.this.dP();
            float $$7 = (float)bcb.d($$2, $$0);
            float $$8 = bcb.h(crx.this.dP() + 90.0F);
            float $$9 = bcb.h($$7 * (180.0F / (float)Math.PI));
            crx.this.v(bcb.e($$8, $$9, 4.0F) - 90.0F);
            crx.this.br = crx.this.dP();
            if (bcb.d($$6, crx.this.dP()) < 3.0F) {
               this.m = bcb.d(this.m, 1.8F, 0.005F * (1.8F / this.m));
            } else {
               this.m = bcb.d(this.m, 0.2F, 0.025F);
            }

            float $$10 = (float)(-(bcb.d(-$$1, $$3) * 180.0F / (float)Math.PI));
            crx.this.w($$10);
            float $$11 = crx.this.dP() + 90.0F;
            double $$12 = this.m * bcb.b($$11 * (float) (Math.PI / 180.0)) * Math.abs($$0 / $$5);
            double $$13 = this.m * bcb.a($$11 * (float) (Math.PI / 180.0)) * Math.abs($$2 / $$5);
            double $$14 = this.m * bcb.a($$10 * (float) (Math.PI / 180.0)) * Math.abs($$1 / $$5);
            fis $$15 = crx.this.dA();
            crx.this.i($$15.e(new fis($$12, $$14, $$13).d($$15).c(0.2)));
         }
      }
   }

   abstract class h extends chi {
      public h() {
         this.a(EnumSet.of(chi.a.a));
      }

      protected boolean h() {
         return crx.this.d.c(crx.this.dC(), crx.this.dE(), crx.this.dI()) < 4.0;
      }
   }

   class i extends crx.h {
      private static final int c = 20;
      private boolean d;
      private int e;

      @Override
      public boolean b() {
         return crx.this.e() != null && crx.this.f == crx.a.b;
      }

      @Override
      public boolean c() {
         cam $$0 = crx.this.e();
         if ($$0 == null) {
            return false;
         } else if (!$$0.bO()) {
            return false;
         } else if ($$0 instanceof cut $$1 && ($$0.am() || $$1.gI())) {
            return false;
         } else if (!this.b()) {
            return false;
         } else {
            if (crx.this.as > this.e) {
               this.e = crx.this.as + 20;
               List<cmg> $$2 = crx.this.ai().a(cmg.class, crx.this.cV().g(16.0), bzt.a);

               for (cmg $$3 : $$2) {
                  $$3.gW();
               }

               this.d = !$$2.isEmpty();
            }

            return !this.d;
         }
      }

      @Override
      public void d() {
      }

      @Override
      public void e() {
         crx.this.g(null);
         crx.this.f = crx.a.a;
      }

      @Override
      public void a() {
         cam $$0 = crx.this.e();
         if ($$0 != null) {
            crx.this.d = new fis($$0.dC(), $$0.e(0.5), $$0.dI());
            if (crx.this.cV().g(0.2F).c($$0.cV())) {
               crx.this.c(a(crx.this.ai()), $$0);
               crx.this.f = crx.a.a;
               if (!crx.this.be()) {
                  crx.this.ai().c(1039, crx.this.dx(), 0);
               }
            } else if (crx.this.ac || crx.this.bj > 0) {
               crx.this.f = crx.a.a;
            }
         }
      }
   }
}
