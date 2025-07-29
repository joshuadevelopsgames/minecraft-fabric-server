import javax.annotation.Nullable;

public class hxw implements hya {
   private static final int a = 40;
   private static final int b = 40;
   private static final int c = 100;
   private static final int d = 20;
   private static final int e = -1;
   private static final xo f = xo.a("tutorial.move.title", hxz.a("forward"), hxz.a("left"), hxz.a("back"), hxz.a("right"));
   private static final xo g = xo.a("tutorial.move.description", hxz.a("jump"));
   private static final xo h = xo.c("tutorial.look.title");
   private static final xo i = xo.c("tutorial.look.description");
   private final hxz j;
   @Nullable
   private gae k;
   @Nullable
   private gae l;
   private int m;
   private int n;
   private int o;
   private boolean p;
   private boolean q;
   private int r = -1;
   private int s = -1;

   public hxw(hxz $$0) {
      this.j = $$0;
   }

   @Override
   public void a() {
      this.m++;
      if (this.p) {
         this.n++;
         this.p = false;
      }

      if (this.q) {
         this.o++;
         this.q = false;
      }

      if (this.r == -1 && this.n > 40) {
         if (this.k != null) {
            this.k.c();
            this.k = null;
         }

         this.r = this.m;
      }

      if (this.s == -1 && this.o > 40) {
         if (this.l != null) {
            this.l.c();
            this.l = null;
         }

         this.s = this.m;
      }

      if (this.r != -1 && this.s != -1) {
         if (this.j.f()) {
            this.j.a(hyb.b);
         } else {
            this.j.a(hyb.f);
         }
      }

      if (this.k != null) {
         this.k.a(this.n / 40.0F);
      }

      if (this.l != null) {
         this.l.a(this.o / 40.0F);
      }

      if (this.m >= 100) {
         fue $$0 = this.j.e();
         if (this.r == -1 && this.k == null) {
            this.k = new gae($$0.h, gae.a.a, f, g, true);
            $$0.aB().a(this.k);
         } else if (this.r != -1 && this.m - this.r >= 20 && this.s == -1 && this.l == null) {
            this.l = new gae($$0.h, gae.a.b, h, i, true);
            $$0.aB().a(this.l);
         }
      }
   }

   @Override
   public void b() {
      if (this.k != null) {
         this.k.c();
         this.k = null;
      }

      if (this.l != null) {
         this.l.c();
         this.l = null;
      }
   }

   @Override
   public void a(gwg $$0) {
      if ($$0.a.a() || $$0.a.b() || $$0.a.c() || $$0.a.d() || $$0.a.e()) {
         this.p = true;
      }
   }

   @Override
   public void a(double $$0, double $$1) {
      if (Math.abs($$0) > 0.01 || Math.abs($$1) > 0.01) {
         this.q = true;
      }
   }
}
