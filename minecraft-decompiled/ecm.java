import java.util.List;
import java.util.stream.IntStream;
import javax.annotation.Nullable;

public class ecm extends eci implements bxu {
   public static final int d = 9;
   public static final int e = 3;
   public static final int f = 27;
   public static final int g = 1;
   public static final int h = 10;
   public static final float i = 0.5F;
   public static final float j = 270.0F;
   private static final int[] k = IntStream.range(0, 27).toArray();
   private ju<dcv> q = ju.a(27, dcv.l);
   private int r;
   private ecm.a s = ecm.a.a;
   private float t;
   private float u;
   @Nullable
   private final dbt v;

   public ecm(@Nullable dbt $$0, jb $$1, eeb $$2) {
      super(ebb.y, $$1, $$2);
      this.v = $$0;
   }

   public ecm(jb $$0, eeb $$1) {
      super(ebb.y, $$0, $$1);
      this.v = $$1.b() instanceof dxj $$2 ? $$2.b() : null;
   }

   public static void a(dmu $$0, jb $$1, eeb $$2, ecm $$3) {
      $$3.b($$0, $$1, $$2);
   }

   private void b(dmu $$0, jb $$1, eeb $$2) {
      this.u = this.t;
      switch (this.s) {
         case a:
            this.t = 0.0F;
            break;
         case b:
            this.t += 0.1F;
            if (this.u == 0.0F) {
               d($$0, $$1, $$2);
            }

            if (this.t >= 1.0F) {
               this.s = ecm.a.c;
               this.t = 1.0F;
               d($$0, $$1, $$2);
            }

            this.c($$0, $$1, $$2);
            break;
         case c:
            this.t = 1.0F;
            break;
         case d:
            this.t -= 0.1F;
            if (this.u == 1.0F) {
               d($$0, $$1, $$2);
            }

            if (this.t <= 0.0F) {
               this.s = ecm.a.a;
               this.t = 0.0F;
               d($$0, $$1, $$2);
            }
      }
   }

   public ecm.a k() {
      return this.s;
   }

   public fin a(eeb $$0) {
      fis $$1 = new fis(0.5, 0.0, 0.5);
      return csb.a(1.0F, $$0.c(dxj.c), 0.5F * this.a(1.0F), $$1);
   }

   private void c(dmu $$0, jb $$1, eeb $$2) {
      if ($$2.b() instanceof dxj) {
         jh $$3 = $$2.c(dxj.c);
         fin $$4 = csb.a(1.0F, $$3, this.u, this.t, $$1.c());
         List<bzm> $$5 = $$0.a_(null, $$4);
         if (!$$5.isEmpty()) {
            for (bzm $$6 : $$5) {
               if ($$6.k_() != faq.d) {
                  $$6.a(caq.d, new fis(($$4.b() + 0.01) * $$3.j(), ($$4.c() + 0.01) * $$3.k(), ($$4.d() + 0.01) * $$3.l()));
               }
            }
         }
      }
   }

   @Override
   public int b() {
      return this.q.size();
   }

   @Override
   public boolean a_(int $$0, int $$1) {
      if ($$0 == 1) {
         this.r = $$1;
         if ($$1 == 0) {
            this.s = ecm.a.d;
         }

         if ($$1 == 1) {
            this.s = ecm.a.b;
         }

         return true;
      } else {
         return super.a_($$0, $$1);
      }
   }

   private static void d(dmu $$0, jb $$1, eeb $$2) {
      $$2.a($$0, $$1, 3);
      $$0.a($$1, $$2.b());
   }

   @Override
   public void a(jb $$0, eeb $$1) {
   }

   @Override
   public void e_(cut $$0) {
      if (!this.p && !$$0.am()) {
         if (this.r < 0) {
            this.r = 0;
         }

         this.r++;
         this.n.a(this.o, this.m().b(), 1, this.r);
         if (this.r == 1) {
            this.n.a($$0, ejb.k, this.o);
            this.n.a(null, this.o, ayz.yc, aza.e, 0.5F, this.n.A.i() * 0.1F + 0.9F);
         }
      }
   }

   @Override
   public void c(cut $$0) {
      if (!this.p && !$$0.am()) {
         this.r--;
         this.n.a(this.o, this.m().b(), 1, this.r);
         if (this.r <= 0) {
            this.n.a($$0, ejb.j, this.o);
            this.n.a(null, this.o, ayz.yb, aza.e, 0.5F, this.n.A.i() * 0.1F + 0.9F);
         }
      }
   }

   @Override
   protected xo j() {
      return xo.c("container.shulkerBox");
   }

   @Override
   protected void a(fda $$0) {
      super.a($$0);
      this.d($$0);
   }

   @Override
   protected void a(fdc $$0) {
      super.a($$0);
      if (!this.d_($$0)) {
         bxd.a($$0, this.q, false);
      }
   }

   public void d(fda $$0) {
      this.q = ju.a(this.b(), dcv.l);
      if (!this.c_($$0)) {
         bxd.a($$0, this.q);
      }
   }

   @Override
   protected ju<dcv> f() {
      return this.q;
   }

   @Override
   protected void a(ju<dcv> $$0) {
      this.q = $$0;
   }

   @Override
   public int[] a(jh $$0) {
      return k;
   }

   @Override
   public boolean a(int $$0, dcv $$1, @Nullable jh $$2) {
      return !(dpz.a($$1.h()) instanceof dxj);
   }

   @Override
   public boolean b(int $$0, dcv $$1, jh $$2) {
      return true;
   }

   public float a(float $$0) {
      return bcb.h($$0, this.u, this.t);
   }

   @Nullable
   public dbt u() {
      return this.v;
   }

   @Override
   protected cym a(int $$0, cus $$1) {
      return new dah($$0, $$1, this);
   }

   public boolean v() {
      return this.s == ecm.a.a;
   }

   public static enum a {
      a,
      b,
      c,
      d;
   }
}
