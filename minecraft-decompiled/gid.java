import com.mojang.logging.LogUtils;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class gid extends get {
   public static final int a = 308;
   public static final int b = 100;
   public static final int c = 74;
   public static final int d = 64;
   private static final Logger f = LogUtils.getLogger();
   private final gsb u = new gsb();
   private final get v;
   protected gig e;
   private gsa w;
   private fxo x;
   private fxo y;
   private fxo z;
   private grz A;
   private hwh.b B;
   @Nullable
   private hwh.a C;
   private boolean D;

   public gid(get $$0) {
      super(xo.c("multiplayer.title"));
      this.v = $$0;
   }

   @Override
   protected void aV_() {
      if (this.D) {
         this.e.a(this.o, this.p - 64 - 32, 0, 32);
      } else {
         this.D = true;
         this.w = new gsa(this.n);
         this.w.a();
         this.B = new hwh.b();

         try {
            this.C = new hwh.a(this.B);
            this.C.start();
         } catch (Exception var8) {
            f.warn("Unable to start LAN server detection: {}", var8.getMessage());
         }

         this.e = new gig(this, this.n, this.o, this.p - 64 - 32, 32, 36);
         this.e.a(this.w);
      }

      this.c(this.e);
      this.y = this.c(fxo.a(xo.c("selectServer.select"), $$0 -> this.l()).a(100).a());
      fxo $$1 = this.c(fxo.a(xo.c("selectServer.direct"), $$0 -> {
         this.A = new grz(htb.a("selectServer.defaultName"), "", grz.c.c);
         this.n.a(new gdz(this, this::h, this.A));
      }).a(100).a());
      fxo $$2 = this.c(fxo.a(xo.c("selectServer.add"), $$0 -> {
         this.A = new grz(htb.a("selectServer.defaultName"), "", grz.c.c);
         this.n.a(new geb(this, this::g, this.A));
      }).a(100).a());
      this.x = this.c(fxo.a(xo.c("selectServer.edit"), $$0 -> {
         gig.a $$1x = this.e.p();
         if ($$1x instanceof gig.d) {
            grz $$2x = ((gig.d)$$1x).c();
            this.A = new grz($$2x.a, $$2x.b, grz.c.c);
            this.A.b($$2x);
            this.n.a(new geb(this, this::f, this.A));
         }
      }).a(74).a());
      this.z = this.c(fxo.a(xo.c("selectServer.delete"), $$0 -> {
         gig.a $$1x = this.e.p();
         if ($$1x instanceof gig.d) {
            String $$2x = ((gig.d)$$1x).c().a;
            if ($$2x != null) {
               xo $$3x = xo.c("selectServer.deleteQuestion");
               xo $$4x = xo.a("selectServer.deleteWarning", $$2x);
               xo $$5x = xo.c("selectServer.deleteButton");
               xo $$6x = xn.e;
               this.n.a(new gdr(this::c, $$3x, $$4x, $$5x, $$6x));
            }
         }
      }).a(74).a());
      fxo $$3 = this.c(fxo.a(xo.c("selectServer.refresh"), $$0 -> this.F()).a(74).a());
      fxo $$4 = this.c(fxo.a(xn.k, $$0 -> this.aP_()).a(74).a());
      gbo $$5 = gbo.d();
      gbh $$6 = $$5.a(new gbh(308, 20, gbh.b.a));
      $$6.a(this.y);
      $$6.a($$1);
      $$6.a($$2);
      $$5.a(gbp.b(4));
      gbh $$7 = $$5.a(new gbh(308, 20, gbh.b.a));
      $$7.a(this.x);
      $$7.a(this.z);
      $$7.a($$3);
      $$7.a($$4);
      $$5.a();
      gbi.a($$5, 0, this.p - 64, this.o, 64);
      this.m();
   }

   @Override
   public void aP_() {
      this.n.a(this.v);
   }

   @Override
   public void e() {
      super.e();
      List<hwg> $$0 = this.B.a();
      if ($$0 != null) {
         this.e.a($$0);
      }

      this.u.a();
   }

   @Override
   public void aI_() {
      if (this.C != null) {
         this.C.interrupt();
         this.C = null;
      }

      this.u.b();
      this.e.c();
   }

   private void F() {
      this.n.a(new gid(this.v));
   }

   private void c(boolean $$0) {
      gig.a $$1 = this.e.p();
      if ($$0 && $$1 instanceof gig.d) {
         this.w.a(((gig.d)$$1).c());
         this.w.b();
         this.e.a(null);
         this.e.a(this.w);
      }

      this.n.a(this);
   }

   private void f(boolean $$0) {
      gig.a $$1 = this.e.p();
      if ($$0 && $$1 instanceof gig.d) {
         grz $$2 = ((gig.d)$$1).c();
         $$2.a = this.A.a;
         $$2.b = this.A.b;
         $$2.b(this.A);
         this.w.b();
         this.e.a(this.w);
      }

      this.n.a(this);
   }

   private void g(boolean $$0) {
      if ($$0) {
         grz $$1 = this.w.b(this.A.b);
         if ($$1 != null) {
            $$1.a(this.A);
            this.w.b();
         } else {
            this.w.a(this.A, false);
            this.w.b();
         }

         this.e.a(null);
         this.e.a(this.w);
      }

      this.n.a(this);
   }

   private void h(boolean $$0) {
      if ($$0) {
         grz $$1 = this.w.a(this.A.b);
         if ($$1 == null) {
            this.w.a(this.A, true);
            this.w.b();
            this.a(this.A);
         } else {
            this.a($$1);
         }
      } else {
         this.n.a(this);
      }
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      if (super.a($$0, $$1, $$2)) {
         return true;
      } else if ($$0 == 294) {
         this.F();
         return true;
      } else if (this.e.p() != null) {
         if (gby.a($$0)) {
            this.l();
            return true;
         } else {
            return this.e.a($$0, $$1, $$2);
         }
      } else {
         return false;
      }
   }

   @Override
   public void a(fxb $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.q, this.m, this.o / 2, 20, -1);
   }

   public void l() {
      gig.a $$0 = this.e.p();
      if ($$0 instanceof gig.d) {
         this.a(((gig.d)$$0).c());
      } else if ($$0 instanceof gig.c) {
         hwg $$1 = ((gig.c)$$0).b();
         this.a(new grz($$1.a(), $$1.b(), grz.c.a));
      }
   }

   private void a(grz $$0) {
      gds.a(this, this.n, gtc.a($$0.b), $$0, false, null);
   }

   public void a(gig.a $$0) {
      this.e.a($$0);
      this.m();
   }

   protected void m() {
      this.y.j = false;
      this.x.j = false;
      this.z.j = false;
      gig.a $$0 = this.e.p();
      if ($$0 != null && !($$0 instanceof gig.b)) {
         this.y.j = true;
         if ($$0 instanceof gig.d) {
            this.x.j = true;
            this.z.j = true;
         }
      }
   }

   public gsb n() {
      return this.u;
   }

   public gsa E() {
      return this.w;
   }
}
