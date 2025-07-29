import java.util.Iterator;
import java.util.List;

public class edw extends eaz {
   private static final int b = 2;
   private static final double c = 0.01;
   public static final double a = 0.51;
   private static final eeb d = dqb.a.m();
   private static final float e = 0.0F;
   private static final boolean f = false;
   private static final boolean g = false;
   private eeb h = d;
   private jh i;
   private boolean j = false;
   private boolean k = false;
   private static final ThreadLocal<jh> l = ThreadLocal.withInitial(() -> null);
   private float m = 0.0F;
   private float q = 0.0F;
   private long r;
   private int s;

   public edw(jb $$0, eeb $$1) {
      super(ebb.l, $$0, $$1);
   }

   public edw(jb $$0, eeb $$1, eeb $$2, jh $$3, boolean $$4, boolean $$5) {
      this($$0, $$1);
      this.h = $$2;
      this.i = $$3;
      this.j = $$4;
      this.k = $$5;
   }

   @Override
   public ui a(jn.a $$0) {
      return this.d($$0);
   }

   public boolean a() {
      return this.j;
   }

   public jh c() {
      return this.i;
   }

   public boolean d() {
      return this.k;
   }

   public float a(float $$0) {
      if ($$0 > 1.0F) {
         $$0 = 1.0F;
      }

      return bcb.h($$0, this.q, this.m);
   }

   public float b(float $$0) {
      return this.i.j() * this.e(this.a($$0));
   }

   public float c(float $$0) {
      return this.i.k() * this.e(this.a($$0));
   }

   public float d(float $$0) {
      return this.i.l() * this.e(this.a($$0));
   }

   private float e(float $$0) {
      return this.j ? $$0 - 1.0F : 1.0F - $$0;
   }

   private eeb w() {
      return !this.a() && this.d() && this.h.b() instanceof edt
         ? dqb.bJ.m().b(edu.d, this.m > 0.25F).b(edu.c, this.h.a(dqb.by) ? efd.b : efd.a).b(edu.a, this.h.c(edt.a))
         : this.h;
   }

   private static void a(dmu $$0, jb $$1, float $$2, edw $$3) {
      jh $$4 = $$3.f();
      double $$5 = $$2 - $$3.m;
      fjm $$6 = $$3.w().g($$0, $$1);
      if (!$$6.c()) {
         fin $$7 = a($$1, $$6.a(), $$3);
         List<bzm> $$8 = $$0.a_(null, edv.a($$7, $$4, $$5).b($$7));
         if (!$$8.isEmpty()) {
            List<fin> $$9 = $$6.e();
            boolean $$10 = $$3.h.a(dqb.ix);
            Iterator var12 = $$8.iterator();

            while (true) {
               bzm $$11;
               while (true) {
                  if (!var12.hasNext()) {
                     return;
                  }

                  $$11 = (bzm)var12.next();
                  if ($$11.k_() != faq.d) {
                     if (!$$10) {
                        break;
                     }

                     if (!($$11 instanceof auc)) {
                        fis $$12 = $$11.dA();
                        double $$13 = $$12.d;
                        double $$14 = $$12.e;
                        double $$15 = $$12.f;
                        switch ($$4.o()) {
                           case a:
                              $$13 = $$4.j();
                              break;
                           case b:
                              $$14 = $$4.k();
                              break;
                           case c:
                              $$15 = $$4.l();
                        }

                        $$11.n($$13, $$14, $$15);
                        break;
                     }
                  }
               }

               double $$16 = 0.0;

               for (fin $$17 : $$9) {
                  fin $$18 = edv.a(a($$1, $$17, $$3), $$4, $$5);
                  fin $$19 = $$11.cV();
                  if ($$18.c($$19)) {
                     $$16 = Math.max($$16, a($$18, $$4, $$19));
                     if ($$16 >= $$5) {
                        break;
                     }
                  }
               }

               if (!($$16 <= 0.0)) {
                  $$16 = Math.min($$16, $$5) + 0.01;
                  a($$4, $$11, $$16, $$4);
                  if (!$$3.j && $$3.k) {
                     a($$1, $$11, $$4, $$5);
                  }
               }
            }
         }
      }
   }

   private static void a(jh $$0, bzm $$1, double $$2, jh $$3) {
      l.set($$0);
      fis $$4 = $$1.dv();
      $$1.a(caq.c, new fis($$2 * $$3.j(), $$2 * $$3.k(), $$2 * $$3.l()));
      $$1.a($$4, $$1.dv());
      $$1.aM();
      l.set(null);
   }

   private static void b(dmu $$0, jb $$1, float $$2, edw $$3) {
      if ($$3.x()) {
         jh $$4 = $$3.f();
         if ($$4.o().d()) {
            double $$5 = $$3.h.g($$0, $$1).c(jh.a.b);
            fin $$6 = a($$1, new fin(0.0, $$5, 0.0, 1.0, 1.5000010000000001, 1.0), $$3);
            double $$7 = $$2 - $$3.m;

            for (bzm $$9 : $$0.a((bzm)null, $$6, $$2x -> a($$6, $$2x, $$1))) {
               a($$4, $$9, $$7, $$4);
            }
         }
      }
   }

   private static boolean a(fin $$0, bzm $$1, jb $$2) {
      return $$1.k_() == faq.a && $$1.aK() && ($$1.d($$2) || $$1.dC() >= $$0.a && $$1.dC() <= $$0.d && $$1.dI() >= $$0.c && $$1.dI() <= $$0.f);
   }

   private boolean x() {
      return this.h.a(dqb.pP);
   }

   public jh f() {
      return this.j ? this.i : this.i.g();
   }

   private static double a(fin $$0, jh $$1, fin $$2) {
      switch ($$1) {
         case f:
            return $$0.d - $$2.a;
         case e:
            return $$2.d - $$0.a;
         case b:
         default:
            return $$0.e - $$2.b;
         case a:
            return $$2.e - $$0.b;
         case d:
            return $$0.f - $$2.c;
         case c:
            return $$2.f - $$0.c;
      }
   }

   private static fin a(jb $$0, fin $$1, edw $$2) {
      double $$3 = $$2.e($$2.m);
      return $$1.d($$0.u() + $$3 * $$2.i.j(), $$0.v() + $$3 * $$2.i.k(), $$0.w() + $$3 * $$2.i.l());
   }

   private static void a(jb $$0, bzm $$1, jh $$2, double $$3) {
      fin $$4 = $$1.cV();
      fin $$5 = fjj.b().a().a($$0);
      if ($$4.c($$5)) {
         jh $$6 = $$2.g();
         double $$7 = a($$5, $$6, $$4) + 0.01;
         double $$8 = a($$5, $$6, $$4.a($$5)) + 0.01;
         if (Math.abs($$7 - $$8) < 0.01) {
            $$7 = Math.min($$7, $$3) + 0.01;
            a($$2, $$1, $$7, $$6);
         }
      }
   }

   public eeb j() {
      return this.h;
   }

   public void k() {
      if (this.n != null && (this.q < 1.0F || this.n.C)) {
         this.m = 1.0F;
         this.q = this.m;
         this.n.o(this.o);
         this.av_();
         if (this.n.a_(this.o).a(dqb.ca)) {
            eeb $$0;
            if (this.k) {
               $$0 = dqb.a.m();
            } else {
               $$0 = dpz.b(this.h, this.n, this.o);
            }

            this.n.a(this.o, $$0, 3);
            this.n.b(this.o, $$0.b(), fbp.a(this.n, this.u(), null));
         }
      }
   }

   @Override
   public void a(jb $$0, eeb $$1) {
      this.k();
   }

   public jh u() {
      return this.j ? this.i : this.i.g();
   }

   public static void a(dmu $$0, jb $$1, eeb $$2, edw $$3) {
      $$3.r = $$0.ae();
      $$3.q = $$3.m;
      if ($$3.q >= 1.0F) {
         if ($$0.C && $$3.s < 5) {
            $$3.s++;
         } else {
            $$0.o($$1);
            $$3.av_();
            if ($$0.a_($$1).a(dqb.ca)) {
               eeb $$4 = dpz.b($$3.h, $$0, $$1);
               if ($$4.l()) {
                  $$0.a($$1, $$3.h, 340);
                  dpz.a($$3.h, $$4, $$0, $$1, 3);
               } else {
                  if ($$4.b(eer.I) && $$4.c(eer.I)) {
                     $$4 = $$4.b(eer.I, false);
                  }

                  $$0.a($$1, $$4, 67);
                  $$0.b($$1, $$4.b(), fbp.a($$0, $$3.u(), null));
               }
            }
         }
      } else {
         float $$5 = $$3.m + 0.5F;
         a($$0, $$1, $$5, $$3);
         b($$0, $$1, $$5, $$3);
         $$3.m = $$5;
         if ($$3.m >= 1.0F) {
            $$3.m = 1.0F;
         }
      }
   }

   @Override
   protected void a(fda $$0) {
      super.a($$0);
      this.h = $$0.<eeb>a("blockState", eeb.a).orElse(d);
      this.i = $$0.<jh>a("facing", jh.k).orElse(jh.a);
      this.m = $$0.a("progress", 0.0F);
      this.q = this.m;
      this.j = $$0.a("extending", false);
      this.k = $$0.a("source", false);
   }

   @Override
   protected void a(fdc $$0) {
      super.a($$0);
      $$0.a("blockState", eeb.a, this.h);
      $$0.a("facing", jh.k, this.i);
      $$0.a("progress", this.q);
      $$0.a("extending", this.j);
      $$0.a("source", this.k);
   }

   public fjm a(dly $$0, jb $$1) {
      fjm $$2;
      if (!this.j && this.k && this.h.b() instanceof edt) {
         $$2 = this.h.b(edt.c, true).g($$0, $$1);
      } else {
         $$2 = fjj.a();
      }

      jh $$4 = l.get();
      if (this.m < 1.0 && $$4 == this.f()) {
         return $$2;
      } else {
         eeb $$5;
         if (this.d()) {
            $$5 = dqb.bJ.m().b(edu.a, this.i).b(edu.d, this.j != 1.0F - this.m < 0.25F);
         } else {
            $$5 = this.h;
         }

         float $$7 = this.e(this.m);
         double $$8 = this.i.j() * $$7;
         double $$9 = this.i.k() * $$7;
         double $$10 = this.i.l() * $$7;
         return fjj.a($$2, $$5.g($$0, $$1).a($$8, $$9, $$10));
      }
   }

   public long v() {
      return this.r;
   }

   @Override
   public void a(dmu $$0) {
      super.a($$0);
      if ($$0.a(mn.i).a(this.h.b().p().h()).isEmpty()) {
         this.h = dqb.a.m();
      }
   }
}
