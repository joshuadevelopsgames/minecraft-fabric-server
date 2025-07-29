import javax.annotation.Nullable;
import org.apache.commons.lang3.StringUtils;

public class gdp extends get {
   public static final double a = 7.0;
   private static final xo c = xo.c("chat_screen.usage");
   private static final int d = 210;
   private String e = "";
   private int f = -1;
   protected fxx b;
   private String u;
   fxr v;

   public gdp(String $$0) {
      super(xo.c("chat_screen.title"));
      this.u = $$0;
   }

   @Override
   protected void aV_() {
      this.f = this.n.m.e().c().size();
      this.b = new fxx(this.n.i, 4, this.p - 12, this.o - 4, 12, xo.c("chat.editBox")) {
         @Override
         protected yc d() {
            return super.d().b(gdp.this.v.e());
         }
      };
      this.b.f(256);
      this.b.d(false);
      this.b.a(this.u);
      this.b.b(this::b);
      this.b.h(false);
      this.c(this.b);
      this.v = new fxr(this.n, this, this.b, this.q, false, false, 1, 10, true, -805306368);
      this.v.b(false);
      this.v.d();
   }

   @Override
   protected void aF_() {
      this.b(this.b);
   }

   @Override
   public void a(fue $$0, int $$1, int $$2) {
      String $$3 = this.b.a();
      this.b($$0, $$1, $$2);
      this.c($$3);
      this.v.d();
   }

   @Override
   public void aI_() {
      this.n.m.e().d();
   }

   private void b(String $$0) {
      String $$1 = this.b.a();
      this.v.a(!$$1.equals(this.u));
      this.v.d();
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      if (this.v.a($$0, $$1, $$2)) {
         return true;
      } else if (super.a($$0, $$1, $$2)) {
         return true;
      } else if ($$0 == 256) {
         this.n.a(null);
         return true;
      } else if ($$0 == 257 || $$0 == 335) {
         this.b(this.b.a(), true);
         this.n.a(null);
         return true;
      } else if ($$0 == 265) {
         this.a(-1);
         return true;
      } else if ($$0 == 264) {
         this.a(1);
         return true;
      } else if ($$0 == 266) {
         this.n.m.e().a(this.n.m.e().j() - 1);
         return true;
      } else if ($$0 == 267) {
         this.n.m.e().a(-this.n.m.e().j() + 1);
         return true;
      } else {
         return false;
      }
   }

   @Override
   public boolean a(double $$0, double $$1, double $$2, double $$3) {
      $$3 = bcb.a($$3, -1.0, 1.0);
      if (this.v.a($$3)) {
         return true;
      } else {
         if (!t()) {
            $$3 *= 7.0;
         }

         this.n.m.e().a((int)$$3);
         return true;
      }
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2) {
      if (this.v.a((double)((int)$$0), (double)((int)$$1), $$2)) {
         return true;
      } else {
         if ($$2 == 0) {
            fxp $$3 = this.n.m.e();
            if ($$3.a($$0, $$1)) {
               return true;
            }

            yl $$4 = this.b($$0, $$1);
            if ($$4 != null && this.a($$4)) {
               this.u = this.b.a();
               return true;
            }
         }

         return this.b.a($$0, $$1, $$2) ? true : super.a($$0, $$1, $$2);
      }
   }

   @Override
   protected void a_(String $$0, boolean $$1) {
      if ($$1) {
         this.b.a($$0);
      } else {
         this.b.b($$0);
      }
   }

   public void a(int $$0) {
      int $$1 = this.f + $$0;
      int $$2 = this.n.m.e().c().size();
      $$1 = bcb.a($$1, 0, $$2);
      if ($$1 != this.f) {
         if ($$1 == $$2) {
            this.f = $$2;
            this.b.a(this.e);
         } else {
            if (this.f == $$2) {
               this.e = this.b.a();
            }

            this.b.a(this.n.m.e().c().get($$1));
            this.v.a(false);
            this.f = $$1;
         }
      }
   }

   @Override
   public void a(fxb $$0, int $$1, int $$2, float $$3) {
      $$0.a(2, this.p - 14, this.o - 2, this.p - 2, this.n.n.a(Integer.MIN_VALUE));
      this.n.m.e().a($$0, this.n.m.f(), $$1, $$2, true);
      super.a($$0, $$1, $$2, $$3);
      this.v.a($$0, $$1, $$2);
      fty $$4 = this.n.m.e().c($$1, $$2);
      if ($$4 != null && $$4.g() != null) {
         $$0.b(this.q, this.q.c($$4.g(), 210), $$1, $$2);
      } else {
         yl $$5 = this.b($$1, $$2);
         if ($$5 != null && $$5.j() != null) {
            $$0.a(this.q, $$5, $$1, $$2);
         }
      }
   }

   @Override
   public void b(fxb $$0, int $$1, int $$2, float $$3) {
   }

   @Override
   public boolean aQ_() {
      return false;
   }

   private void c(String $$0) {
      this.b.a($$0);
   }

   @Override
   protected void a(gbt $$0) {
      $$0.a(gbs.a, this.o());
      $$0.a(gbs.d, c);
      String $$1 = this.b.a();
      if (!$$1.isEmpty()) {
         $$0.a().a(gbs.a, xo.a("chat_screen.message", $$1));
      }
   }

   @Nullable
   private yl b(double $$0, double $$1) {
      return this.n.m.e().b($$0, $$1);
   }

   public void b(String $$0, boolean $$1) {
      $$0 = this.a($$0);
      if (!$$0.isEmpty()) {
         if ($$1) {
            this.n.m.e().a($$0);
         }

         if ($$0.startsWith("/")) {
            this.n.t.j.c($$0.substring(1));
         } else {
            this.n.t.j.b($$0);
         }
      }
   }

   public String a(String $$0) {
      return bdb.e(StringUtils.normalizeSpace($$0.trim()));
   }
}
