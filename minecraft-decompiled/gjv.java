import com.mojang.authlib.GameProfile;
import com.mojang.authlib.minecraft.report.AbuseReportLimits;
import java.util.List;
import java.util.UUID;
import java.util.function.Consumer;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class gjv extends get {
   static final ame a = ame.b("icon/checkmark");
   private static final xo b = xo.c("gui.chatSelection.title");
   private static final xo c = xo.c("gui.chatSelection.context");
   @Nullable
   private final get d;
   private final gst e;
   private fxo f;
   private fyi u;
   @Nullable
   private gjv.a v;
   final gsm.a w;
   private final Consumer<gsm.a> x;
   private gju y;

   public gjv(@Nullable get $$0, gst $$1, gsm.a $$2, Consumer<gsm.a> $$3) {
      super(b);
      this.d = $$0;
      this.e = $$1;
      this.w = $$2.d();
      this.x = $$3;
   }

   @Override
   protected void aV_() {
      this.y = new gju(this.e, this::a);
      this.u = fyi.a(this.q, c, this.o - 16);
      this.v = this.c(new gjv.a(this.n, (this.u.a() + 1) * 9));
      this.c(fxo.a(xn.k, $$0 -> this.aP_()).a(this.o / 2 - 155, this.p - 32, 150, 20).a());
      this.f = this.c(fxo.a(xn.d, $$0 -> {
         this.x.accept(this.w);
         this.aP_();
      }).a(this.o / 2 - 155 + 160, this.p - 32, 150, 20).a());
      this.n();
      this.l();
      this.v.a(this.v.i());
   }

   private boolean a(gsi $$0) {
      return $$0.a(this.w.f());
   }

   private void l() {
      int $$0 = this.v.c();
      this.y.a($$0, this.v);
   }

   void m() {
      this.l();
   }

   void n() {
      this.f.j = !this.w.a().isEmpty();
   }

   @Override
   public void a(fxb $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.q, this.m, this.o / 2, 10, -1);
      AbuseReportLimits $$4 = this.e.a().b();
      int $$5 = this.w.a().size();
      int $$6 = $$4.maxReportedMessageCount();
      xo $$7 = xo.a("gui.chatSelection.selected", $$5, $$6);
      $$0.a(this.q, $$7, this.o / 2, 26, -1);
      this.u.a($$0, this.o / 2, this.v.K());
   }

   @Override
   public void aP_() {
      this.n.a(this.d);
   }

   @Override
   public xo i() {
      return xn.a(super.i(), c);
   }

   public class a extends fyl<gjv.a.b> implements gju.a {
      @Nullable
      private gjv.a.c m;

      public a(final fue $$1, final int $$2) {
         super($$1, gjv.this.o, gjv.this.p - $$2 - 80, 40, 16);
      }

      @Override
      public void a(double $$0) {
         double $$1 = this.g();
         super.a($$0);
         if (this.i() > 1.0E-5F && $$0 <= 1.0E-5F && !bcb.b($$0, $$1)) {
            gjv.this.m();
         }
      }

      @Override
      public void a(int $$0, gsi.a $$1) {
         boolean $$2 = $$1.a(gjv.this.w.f());
         gsg $$3 = $$1.h();
         fty $$4 = $$3.a($$1.g());
         gjv.a.b $$5 = new gjv.a.d($$0, $$1.b(), $$1.c(), $$4, $$2, true);
         this.c($$5);
         this.a($$1, $$2);
      }

      private void a(gsi.a $$0, boolean $$1) {
         gjv.a.b $$2 = new gjv.a.e($$0.f(), $$0.d(), $$1);
         this.c($$2);
         gjv.a.c $$3 = new gjv.a.c($$0.e(), $$2);
         if (this.m != null && this.m.a($$3)) {
            this.d(this.m.b());
         }

         this.m = $$3;
      }

      @Override
      public void a(xo $$0) {
         this.c(new gjv.a.f());
         this.c(new gjv.a.a($$0));
         this.c(new gjv.a.f());
         this.m = null;
      }

      @Override
      public int a() {
         return Math.min(350, this.g - 50);
      }

      public int c() {
         return bcb.e(this.h, this.d);
      }

      @Override
      protected void a(fxb $$0, int $$1, int $$2, float $$3, int $$4, int $$5, int $$6, int $$7, int $$8) {
         gjv.a.b $$9 = this.b($$4);
         if (this.b($$9)) {
            boolean $$10 = this.p() == $$9;
            int $$11 = this.aM_() && $$10 ? -1 : -8355712;
            this.a($$0, $$6, $$7, $$8, $$11, -16777216);
         }

         $$9.a($$0, $$4, $$6, $$5, $$7, $$8, $$1, $$2, this.x() == $$9, $$3);
      }

      private boolean b(gjv.a.b $$0) {
         if ($$0.c()) {
            boolean $$1 = this.p() == $$0;
            boolean $$2 = this.p() == null;
            boolean $$3 = this.x() == $$0;
            return $$1 || $$2 && $$3 && $$0.d();
         } else {
            return false;
         }
      }

      @Nullable
      protected gjv.a.b b(gcb $$0) {
         return this.a($$0, gjv.a.b::c);
      }

      public void a(@Nullable gjv.a.b $$0) {
         super.a($$0);
         gjv.a.b $$1 = this.b(gcb.a);
         if ($$1 == null) {
            gjv.this.m();
         }
      }

      @Override
      public boolean a(int $$0, int $$1, int $$2) {
         gjv.a.b $$3 = this.p();
         return $$3 != null && $$3.a($$0, $$1, $$2) ? true : super.a($$0, $$1, $$2);
      }

      public int K() {
         return this.H() + 9;
      }

      public class a extends gjv.a.b {
         private final xo b;

         public a(final xo $$1) {
            this.b = $$1;
         }

         @Override
         public void a(fxb $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            int $$10 = $$2 + $$5 / 2;
            int $$11 = $$3 + $$4 - 8;
            int $$12 = gjv.this.q.a(this.b);
            int $$13 = ($$3 + $$11 - $$12) / 2;
            int $$14 = $$10 - 9 / 2;
            $$0.b(gjv.this.q, this.b, $$13, $$14, -6250336);
         }

         @Override
         public xo a() {
            return this.b;
         }
      }

      public abstract static class b extends fyl.a<gjv.a.b> {
         @Override
         public xo a() {
            return xn.a;
         }

         public boolean b() {
            return false;
         }

         public boolean c() {
            return false;
         }

         public boolean d() {
            return this.c();
         }

         @Override
         public boolean a(double $$0, double $$1, int $$2) {
            return this.c();
         }
      }

      record c(UUID a, gjv.a.b b) {
         public boolean a(gjv.a.c $$0) {
            return $$0.a.equals(this.a);
         }
      }

      public class d extends gjv.a.b {
         private static final int b = 9;
         private static final int c = 8;
         private static final int d = 11;
         private static final int e = 4;
         private final int f;
         private final xt g;
         private final xo h;
         @Nullable
         private final List<bbm> i;
         @Nullable
         private final fty.a j;
         @Nullable
         private final List<bbm> k;
         private final boolean l;
         private final boolean m;

         public d(final int $$1, final xo $$2, final xo $$3, @Nullable final fty $$4, final boolean $$5, final boolean $$6) {
            this.f = $$1;
            this.j = y.a($$4, fty::f);
            this.k = $$4 != null && $$4.g() != null ? gjv.this.q.c($$4.g(), a.this.a()) : null;
            this.l = $$5;
            this.m = $$6;
            xt $$7 = gjv.this.q.a($$2, this.e() - gjv.this.q.a(xn.v));
            if ($$2 != $$7) {
               this.g = xt.a($$7, xn.v);
               this.i = gjv.this.q.c($$2, a.this.a());
            } else {
               this.g = $$2;
               this.i = null;
            }

            this.h = $$3;
         }

         @Override
         public void a(fxb $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            if (this.b() && this.l) {
               this.a($$0, $$2, $$3, $$5);
            }

            int $$10 = $$3 + this.g();
            int $$11 = $$2 + 1 + ($$5 - 9) / 2;
            $$0.b(gjv.this.q, ud.a().a(this.g), $$10, $$11, this.l ? -1 : -1593835521);
            if (this.i != null && $$8) {
               $$0.a(this.i, $$6, $$7);
            }

            int $$12 = gjv.this.q.a(this.g);
            this.a($$0, $$10 + $$12 + 4, $$2, $$5, $$6, $$7);
         }

         private void a(fxb $$0, int $$1, int $$2, int $$3, int $$4, int $$5) {
            if (this.j != null) {
               int $$6 = $$2 + ($$3 - this.j.d) / 2;
               this.j.a($$0, $$1, $$6);
               if (this.k != null && $$4 >= $$1 && $$4 <= $$1 + this.j.c && $$5 >= $$6 && $$5 <= $$6 + this.j.d) {
                  $$0.a(this.k, $$4, $$5);
               }
            }
         }

         private void a(fxb $$0, int $$1, int $$2, int $$3) {
            int $$5 = $$1 + ($$3 - 8) / 2;
            $$0.a(gxx.ar, gjv.a, $$2, $$5, 9, 8);
         }

         private int e() {
            int $$0 = this.j != null ? this.j.c + 4 : 0;
            return a.this.a() - this.g() - 4 - $$0;
         }

         private int g() {
            return this.m ? 11 : 0;
         }

         @Override
         public xo a() {
            return (xo)(this.b() ? xo.a("narrator.select", this.h) : this.h);
         }

         @Override
         public boolean a(double $$0, double $$1, int $$2) {
            a.this.a(null);
            return this.h();
         }

         @Override
         public boolean a(int $$0, int $$1, int $$2) {
            return gby.a($$0) ? this.h() : false;
         }

         @Override
         public boolean b() {
            return gjv.this.w.b(this.f);
         }

         @Override
         public boolean c() {
            return true;
         }

         @Override
         public boolean d() {
            return this.l;
         }

         private boolean h() {
            if (this.l) {
               gjv.this.w.a(this.f);
               gjv.this.n();
               return true;
            } else {
               return false;
            }
         }
      }

      public class e extends gjv.a.b {
         private static final int b = 12;
         private static final int c = 4;
         private final xo d;
         private final Supplier<hst> e;
         private final boolean f;

         public e(final GameProfile $$1, final xo $$2, final boolean $$3) {
            this.d = $$2;
            this.f = $$3;
            this.e = a.this.c.ao().a($$1);
         }

         @Override
         public void a(fxb $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            int $$10 = $$3 - 12 + 4;
            int $$11 = $$2 + ($$5 - 12) / 2;
            fyo.a($$0, this.e.get(), $$10, $$11, 12);
            int $$12 = $$2 + 1 + ($$5 - 9) / 2;
            $$0.b(gjv.this.q, this.d, $$10 + 12 + 4, $$12, this.f ? -1 : -1593835521);
         }
      }

      public static class f extends gjv.a.b {
         @Override
         public void a(fxb $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         }
      }
   }
}
