import java.util.Arrays;
import org.joml.Quaternionf;
import org.joml.Vector3f;

public class ftm implements fkr.b {
   private static final float b = 4.0F;
   private static final Vector3f c = new Vector3f(0.0F, 0.0F, -1.0F);
   private static final Vector3f d = new Vector3f(0.0F, 1.0F, 0.0F);
   private static final Vector3f e = new Vector3f(-1.0F, 0.0F, 0.0F);
   private boolean f;
   private dly g;
   private bzm h;
   private fis i = fis.c;
   private final jb.a j = new jb.a();
   private final Vector3f k = new Vector3f(c);
   private final Vector3f l = new Vector3f(d);
   private final Vector3f m = new Vector3f(e);
   private float n;
   private float o;
   private final Quaternionf p = new Quaternionf();
   private boolean q;
   private float r;
   private float s;
   private float t;
   public static final float a = 0.083333336F;

   public void a(dly $$0, bzm $$1, boolean $$2, boolean $$3, float $$4) {
      this.f = true;
      this.g = $$0;
      this.h = $$1;
      this.q = $$2;
      this.t = $$4;
      if ($$1.cc() && $$1.dm() instanceof cxn $$5 && $$5.f() instanceof cxv $$6 && $$6.o()) {
         fis $$7 = $$5.n($$1).d($$5.dv()).d($$1.m($$5)).e(new fis(0.0, bcb.h($$4, this.s, this.r), 0.0));
         this.a($$1.j($$4), $$1.i($$4));
         this.a($$6.e($$4).e($$7));
      } else {
         this.a($$1.j($$4), $$1.i($$4));
         this.a(bcb.d((double)$$4, $$1.X, $$1.dC()), bcb.d((double)$$4, $$1.Y, $$1.dE()) + bcb.h($$4, this.s, this.r), bcb.d((double)$$4, $$1.Z, $$1.dI()));
      }

      if ($$2) {
         if ($$3) {
            this.a(this.o + 180.0F, -this.n);
         }

         float $$8 = 4.0F;
         float $$9 = 1.0F;
         if ($$1 instanceof cam $$10) {
            $$9 = $$10.eq();
            $$8 = (float)$$10.i(cbs.i);
         }

         float $$11 = $$9;
         float $$12 = $$8;
         if ($$1.cc() && $$1.dm() instanceof cam $$13) {
            $$11 = $$13.eq();
            $$12 = (float)$$13.i(cbs.i);
         }

         this.a(-this.a(Math.max($$9 * $$8, $$11 * $$12)), 0.0F, 0.0F);
      } else if ($$1 instanceof cam && ((cam)$$1).fY()) {
         jh $$14 = ((cam)$$1).ga();
         this.a($$14 != null ? $$14.p() - 180.0F : 0.0F, 0.0F);
         this.a(0.0F, 0.3F, 0.0F);
      }
   }

   public void c() {
      if (this.h != null) {
         this.s = this.r;
         this.r = this.r + (this.h.cW() - this.r) * 0.5F;
      }
   }

   private float a(float $$0) {
      float $$1 = 0.1F;

      for (int $$2 = 0; $$2 < 8; $$2++) {
         float $$3 = ($$2 & 1) * 2 - 1;
         float $$4 = ($$2 >> 1 & 1) * 2 - 1;
         float $$5 = ($$2 >> 2 & 1) * 2 - 1;
         fis $$6 = this.i.b($$3 * 0.1F, $$4 * 0.1F, $$5 * 0.1F);
         fis $$7 = $$6.e(new fis(this.k).c((double)(-$$0)));
         fiq $$8 = this.g.a(new dmb($$6, $$7, dmb.a.c, dmb.b.a, this.h));
         if ($$8.d() != fiq.a.a) {
            float $$9 = (float)$$8.g().g(this.i);
            if ($$9 < bcb.l($$0)) {
               $$0 = bcb.c($$9);
            }
         }
      }

      return $$0;
   }

   protected void a(float $$0, float $$1, float $$2) {
      Vector3f $$3 = new Vector3f($$2, $$1, -$$0).rotate(this.p);
      this.a(new fis(this.i.d + $$3.x, this.i.e + $$3.y, this.i.f + $$3.z));
   }

   protected void a(float $$0, float $$1) {
      this.n = $$1;
      this.o = $$0;
      this.p.rotationYXZ((float) Math.PI - $$0 * (float) (Math.PI / 180.0), -$$1 * (float) (Math.PI / 180.0), 0.0F);
      c.rotate(this.p, this.k);
      d.rotate(this.p, this.l);
      e.rotate(this.p, this.m);
   }

   protected void a(double $$0, double $$1, double $$2) {
      this.a(new fis($$0, $$1, $$2));
   }

   protected void a(fis $$0) {
      this.i = $$0;
      this.j.b($$0.d, $$0.e, $$0.f);
   }

   public fis d() {
      return this.i;
   }

   public jb e() {
      return this.j;
   }

   public float f() {
      return this.n;
   }

   public float g() {
      return this.o;
   }

   public Quaternionf h() {
      return this.p;
   }

   public bzm i() {
      return this.h;
   }

   public boolean j() {
      return this.f;
   }

   public boolean k() {
      return this.q;
   }

   public ftm.a l() {
      fue $$0 = fue.R();
      double $$1 = (double)$$0.aP().k() / $$0.aP().l();
      double $$2 = Math.tan($$0.n.al().c().intValue() * (float) (Math.PI / 180.0) / 2.0) * 0.05F;
      double $$3 = $$2 * $$1;
      fis $$4 = new fis(this.k).c(0.05F);
      fis $$5 = new fis(this.m).c($$3);
      fis $$6 = new fis(this.l).c($$2);
      return new ftm.a($$4, $$5, $$6);
   }

   public fan m() {
      if (!this.f) {
         return fan.f;
      } else {
         fal $$0 = this.g.b_(this.j);
         if ($$0.a(azu.a) && this.i.e < this.j.v() + $$0.a(this.g, this.j)) {
            return fan.b;
         } else {
            ftm.a $$1 = this.l();

            for (fis $$3 : Arrays.asList($$1.a, $$1.a(), $$1.b(), $$1.c(), $$1.d())) {
               fis $$4 = this.i.e($$3);
               jb $$5 = jb.a((jv)$$4);
               fal $$6 = this.g.b_($$5);
               if ($$6.a(azu.b)) {
                  if ($$4.e <= $$6.a(this.g, $$5) + $$5.v()) {
                     return fan.a;
                  }
               } else {
                  eeb $$7 = this.g.a_($$5);
                  if ($$7.a(dqb.ry)) {
                     return fan.c;
                  }
               }
            }

            return fan.f;
         }
      }
   }

   public final Vector3f n() {
      return this.k;
   }

   public final Vector3f o() {
      return this.l;
   }

   public final Vector3f p() {
      return this.m;
   }

   public void q() {
      this.g = null;
      this.h = null;
      this.f = false;
   }

   public float r() {
      return this.t;
   }

   @Override
   public float a() {
      return bcb.h(this.g());
   }

   @Override
   public fis b() {
      return this.d();
   }

   public static class a {
      final fis a;
      private final fis b;
      private final fis c;

      a(fis $$0, fis $$1, fis $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      public fis a() {
         return this.a.e(this.c).e(this.b);
      }

      public fis b() {
         return this.a.e(this.c).d(this.b);
      }

      public fis c() {
         return this.a.d(this.c).e(this.b);
      }

      public fis d() {
         return this.a.d(this.c).d(this.b);
      }

      public fis a(float $$0, float $$1) {
         return this.a.e(this.c.c((double)$$1)).d(this.b.c((double)$$0));
      }
   }
}
