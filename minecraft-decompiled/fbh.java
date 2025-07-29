import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2BooleanMap;
import it.unimi.dsi.fastutil.objects.Object2BooleanOpenHashMap;
import java.util.EnumSet;
import java.util.Set;
import javax.annotation.Nullable;

public class fbh extends fay {
   public static final double l = 0.5;
   private static final double a = 1.125;
   private final Long2ObjectMap<fbc> m = new Long2ObjectOpenHashMap();
   private final Object2BooleanMap<fin> n = new Object2BooleanOpenHashMap();
   private final fax[] o = new fax[jh.c.a.b()];

   @Override
   public void a(dnh $$0, cao $$1) {
      super.a($$0, $$1);
      $$1.L();
   }

   @Override
   public void b() {
      this.c.N();
      this.m.clear();
      this.n.clear();
      super.b();
   }

   @Override
   public fax a() {
      jb.a $$0 = new jb.a();
      int $$1 = this.c.dD();
      eeb $$2 = this.b.a($$0.b(this.c.dC(), (double)$$1, this.c.dI()));
      if (!this.c.a($$2.y())) {
         if (this.f() && this.c.bm()) {
            while (true) {
               if (!$$2.a(dqb.J) && $$2.y() != fam.c.a(false)) {
                  $$1--;
                  break;
               }

               $$2 = this.b.a($$0.b(this.c.dC(), (double)(++$$1), this.c.dI()));
            }
         } else if (this.c.aK()) {
            $$1 = bcb.a(this.c.dE() + 0.5);
         } else {
            $$0.b(this.c.dC(), this.c.dE() + 1.0, this.c.dI());

            while ($$0.v() > this.b.a().L_()) {
               $$1 = $$0.v();
               $$0.q($$0.v() - 1);
               eeb $$3 = this.b.a($$0);
               if (!$$3.l() && !$$3.a(fba.a)) {
                  break;
               }
            }
         }
      } else {
         while (this.c.a($$2.y())) {
            $$2 = this.b.a($$0.b(this.c.dC(), (double)(++$$1), this.c.dI()));
         }

         $$1--;
      }

      jb $$4 = this.c.dx();
      if (!this.a($$0.d($$4.u(), $$1, $$4.w()))) {
         fin $$5 = this.c.cV();
         if (this.a($$0.b($$5.a, (double)$$1, $$5.c))
            || this.a($$0.b($$5.a, (double)$$1, $$5.f))
            || this.a($$0.b($$5.d, (double)$$1, $$5.c))
            || this.a($$0.b($$5.d, (double)$$1, $$5.f))) {
            return this.c($$0);
         }
      }

      return this.c(new jb($$4.u(), $$1, $$4.w()));
   }

   protected fax c(jb $$0) {
      fax $$1 = this.b($$0);
      $$1.l = this.b($$1.a, $$1.b, $$1.c);
      $$1.k = this.c.a($$1.l);
      return $$1;
   }

   protected boolean a(jb $$0) {
      fbc $$1 = this.b($$0.u(), $$0.v(), $$0.w());
      return $$1 != fbc.b && this.c.a($$1) >= 0.0F;
   }

   @Override
   public fbg a(double $$0, double $$1, double $$2) {
      return this.b($$0, $$1, $$2);
   }

   @Override
   public int a(fax[] $$0, fax $$1) {
      int $$2 = 0;
      int $$3 = 0;
      fbc $$4 = this.b($$1.a, $$1.b + 1, $$1.c);
      fbc $$5 = this.b($$1.a, $$1.b, $$1.c);
      if (this.c.a($$4) >= 0.0F && $$5 != fbc.w) {
         $$3 = bcb.d(Math.max(1.0F, this.c.dT()));
      }

      double $$6 = this.d(new jb($$1.a, $$1.b, $$1.c));

      for (jh $$7 : jh.c.a) {
         fax $$8 = this.a($$1.a + $$7.j(), $$1.b, $$1.c + $$7.l(), $$3, $$6, $$7, $$5);
         this.o[$$7.e()] = $$8;
         if (this.a($$8, $$1)) {
            $$0[$$2++] = $$8;
         }
      }

      for (jh $$9 : jh.c.a) {
         jh $$10 = $$9.h();
         if (this.a($$1, this.o[$$9.e()], this.o[$$10.e()])) {
            fax $$11 = this.a($$1.a + $$9.j() + $$10.j(), $$1.b, $$1.c + $$9.l() + $$10.l(), $$3, $$6, $$9, $$5);
            if (this.a($$11)) {
               $$0[$$2++] = $$11;
            }
         }
      }

      return $$2;
   }

   protected boolean a(@Nullable fax $$0, fax $$1) {
      return $$0 != null && !$$0.i && ($$0.k >= 0.0F || $$1.k < 0.0F);
   }

   protected boolean a(fax $$0, @Nullable fax $$1, @Nullable fax $$2) {
      if ($$2 == null || $$1 == null || $$2.b > $$0.b || $$1.b > $$0.b) {
         return false;
      } else if ($$1.l != fbc.d && $$2.l != fbc.d) {
         boolean $$3 = $$2.l == fbc.h && $$1.l == fbc.h && this.c.ds() < 0.5;
         return ($$2.b < $$0.b || $$2.k >= 0.0F || $$3) && ($$1.b < $$0.b || $$1.k >= 0.0F || $$3);
      } else {
         return false;
      }
   }

   protected boolean a(@Nullable fax $$0) {
      if ($$0 == null || $$0.i) {
         return false;
      } else {
         return $$0.l == fbc.d ? false : $$0.k >= 0.0F;
      }
   }

   private static boolean a(fbc $$0) {
      return $$0 == fbc.h || $$0 == fbc.s || $$0 == fbc.t;
   }

   private boolean b(fax $$0) {
      fin $$1 = this.c.cV();
      fis $$2 = new fis($$0.a - this.c.dC() + $$1.b() / 2.0, $$0.b - this.c.dE() + $$1.c() / 2.0, $$0.c - this.c.dI() + $$1.d() / 2.0);
      int $$3 = bcb.c($$2.g() / $$1.a());
      $$2 = $$2.c((double)(1.0F / $$3));

      for (int $$4 = 1; $$4 <= $$3; $$4++) {
         $$1 = $$1.c($$2);
         if (this.a($$1)) {
            return false;
         }
      }

      return true;
   }

   protected double d(jb $$0) {
      dly $$1 = this.b.a();
      return (this.f() || this.c()) && $$1.b_($$0).a(azu.a) ? $$0.v() + 0.5 : a($$1, $$0);
   }

   public static double a(dly $$0, jb $$1) {
      jb $$2 = $$1.e();
      fjm $$3 = $$0.a_($$2).g($$0, $$2);
      return $$2.v() + ($$3.c() ? 0.0 : $$3.c(jh.a.b));
   }

   protected boolean c() {
      return false;
   }

   @Nullable
   protected fax a(int $$0, int $$1, int $$2, int $$3, double $$4, jh $$5, fbc $$6) {
      fax $$7 = null;
      jb.a $$8 = new jb.a();
      double $$9 = this.d($$8.d($$0, $$1, $$2));
      if ($$9 - $$4 > this.h()) {
         return null;
      } else {
         fbc $$10 = this.b($$0, $$1, $$2);
         float $$11 = this.c.a($$10);
         if ($$11 >= 0.0F) {
            $$7 = this.a($$0, $$1, $$2, $$10, $$11);
         }

         if (a($$6) && $$7 != null && $$7.k >= 0.0F && !this.b($$7)) {
            $$7 = null;
         }

         if ($$10 != fbc.c && (!this.c() || $$10 != fbc.j)) {
            if (($$7 == null || $$7.k < 0.0F) && $$3 > 0 && ($$10 != fbc.h || this.g()) && $$10 != fbc.m && $$10 != fbc.e && $$10 != fbc.f) {
               $$7 = this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$8);
            } else if (!this.c() && $$10 == fbc.j && !this.f()) {
               $$7 = this.a($$0, $$1, $$2, $$7);
            } else if ($$10 == fbc.b) {
               $$7 = this.d($$0, $$1, $$2);
            } else if (a($$10) && $$7 == null) {
               $$7 = this.a($$0, $$1, $$2, $$10);
            }

            return $$7;
         } else {
            return $$7;
         }
      }
   }

   private double h() {
      return Math.max(1.125, (double)this.c.dT());
   }

   private fax a(int $$0, int $$1, int $$2, fbc $$3, float $$4) {
      fax $$5 = this.c($$0, $$1, $$2);
      $$5.l = $$3;
      $$5.k = Math.max($$5.k, $$4);
      return $$5;
   }

   private fax a(int $$0, int $$1, int $$2) {
      fax $$3 = this.c($$0, $$1, $$2);
      $$3.l = fbc.a;
      $$3.k = -1.0F;
      return $$3;
   }

   private fax a(int $$0, int $$1, int $$2, fbc $$3) {
      fax $$4 = this.c($$0, $$1, $$2);
      $$4.i = true;
      $$4.l = $$3;
      $$4.k = $$3.a();
      return $$4;
   }

   @Nullable
   private fax a(int $$0, int $$1, int $$2, int $$3, double $$4, jh $$5, fbc $$6, jb.a $$7) {
      fax $$8 = this.a($$0, $$1 + 1, $$2, $$3 - 1, $$4, $$5, $$6);
      if ($$8 == null) {
         return null;
      } else if (this.c.ds() >= 1.0F) {
         return $$8;
      } else if ($$8.l != fbc.b && $$8.l != fbc.c) {
         return $$8;
      } else {
         double $$9 = $$0 - $$5.j() + 0.5;
         double $$10 = $$2 - $$5.l() + 0.5;
         double $$11 = this.c.ds() / 2.0;
         fin $$12 = new fin(
            $$9 - $$11,
            this.d($$7.b($$9, (double)($$1 + 1), $$10)) + 0.001,
            $$10 - $$11,
            $$9 + $$11,
            this.c.dt() + this.d($$7.b((double)$$8.a, (double)$$8.b, (double)$$8.c)) - 0.002,
            $$10 + $$11
         );
         return this.a($$12) ? null : $$8;
      }
   }

   @Nullable
   private fax a(int $$0, int $$1, int $$2, @Nullable fax $$3) {
      $$1--;

      while ($$1 > this.c.ai().L_()) {
         fbc $$4 = this.b($$0, $$1, $$2);
         if ($$4 != fbc.j) {
            return $$3;
         }

         $$3 = this.a($$0, $$1, $$2, $$4, this.c.a($$4));
         $$1--;
      }

      return $$3;
   }

   private fax d(int $$0, int $$1, int $$2) {
      for (int $$3 = $$1 - 1; $$3 >= this.c.ai().L_(); $$3--) {
         if ($$1 - $$3 > this.c.cI()) {
            return this.a($$0, $$3, $$2);
         }

         fbc $$4 = this.b($$0, $$3, $$2);
         float $$5 = this.c.a($$4);
         if ($$4 != fbc.b) {
            if ($$5 >= 0.0F) {
               return this.a($$0, $$3, $$2, $$4, $$5);
            }

            return this.a($$0, $$3, $$2);
         }
      }

      return this.a($$0, $$1, $$2);
   }

   private boolean a(fin $$0) {
      return this.n.computeIfAbsent($$0, $$1 -> !this.b.a().a(this.c, $$0));
   }

   protected fbc b(int $$0, int $$1, int $$2) {
      return (fbc)this.m.computeIfAbsent(jb.a($$0, $$1, $$2), $$3 -> this.a(this.b, $$0, $$1, $$2, this.c));
   }

   @Override
   public fbc a(fbe $$0, int $$1, int $$2, int $$3, cao $$4) {
      Set<fbc> $$5 = this.b($$0, $$1, $$2, $$3);
      if ($$5.contains(fbc.h)) {
         return fbc.h;
      } else if ($$5.contains(fbc.m)) {
         return fbc.m;
      } else {
         fbc $$6 = fbc.a;

         for (fbc $$7 : $$5) {
            if ($$4.a($$7) < 0.0F) {
               return $$7;
            }

            if ($$4.a($$7) >= $$4.a($$6)) {
               $$6 = $$7;
            }
         }

         return this.e <= 1 && $$6 != fbc.b && $$4.a($$6) == 0.0F && this.a($$0, $$1, $$2, $$3) == fbc.b ? fbc.b : $$6;
      }
   }

   public Set<fbc> b(fbe $$0, int $$1, int $$2, int $$3) {
      EnumSet<fbc> $$4 = EnumSet.noneOf(fbc.class);

      for (int $$5 = 0; $$5 < this.e; $$5++) {
         for (int $$6 = 0; $$6 < this.f; $$6++) {
            for (int $$7 = 0; $$7 < this.g; $$7++) {
               int $$8 = $$5 + $$1;
               int $$9 = $$6 + $$2;
               int $$10 = $$7 + $$3;
               fbc $$11 = this.a($$0, $$8, $$9, $$10);
               jb $$12 = this.c.dx();
               boolean $$13 = this.d();
               if ($$11 == fbc.s && this.e() && $$13) {
                  $$11 = fbc.d;
               }

               if ($$11 == fbc.r && !$$13) {
                  $$11 = fbc.a;
               }

               if ($$11 == fbc.l && this.a($$0, $$12.u(), $$12.v(), $$12.w()) != fbc.l && this.a($$0, $$12.u(), $$12.v() - 1, $$12.w()) != fbc.l) {
                  $$11 = fbc.m;
               }

               $$4.add($$11);
            }
         }
      }

      return $$4;
   }

   @Override
   public fbc a(fbe $$0, int $$1, int $$2, int $$3) {
      return a($$0, new jb.a($$1, $$2, $$3));
   }

   public static fbc b(cao $$0, jb $$1) {
      return a(new fbe($$0.ai(), $$0), $$1.k());
   }

   public static fbc a(fbe $$0, jb.a $$1) {
      int $$2 = $$1.u();
      int $$3 = $$1.v();
      int $$4 = $$1.w();
      fbc $$5 = $$0.a($$2, $$3, $$4);
      if ($$5 == fbc.b && $$3 >= $$0.a().L_() + 1) {
         return switch ($$0.a($$2, $$3 - 1, $$4)) {
            case b, j, i, c -> fbc.b;
            case o -> fbc.o;
            case q -> fbc.q;
            case w -> fbc.w;
            case f -> fbc.g;
            case y -> fbc.y;
            case e -> fbc.z;
            default -> a($$0, $$2, $$3, $$4, fbc.c);
         };
      } else {
         return $$5;
      }
   }

   public static fbc a(fbe $$0, int $$1, int $$2, int $$3, fbc $$4) {
      for (int $$5 = -1; $$5 <= 1; $$5++) {
         for (int $$6 = -1; $$6 <= 1; $$6++) {
            for (int $$7 = -1; $$7 <= 1; $$7++) {
               if ($$5 != 0 || $$7 != 0) {
                  fbc $$8 = $$0.a($$1 + $$5, $$2 + $$6, $$3 + $$7);
                  if ($$8 == fbc.q) {
                     return fbc.p;
                  }

                  if ($$8 == fbc.o || $$8 == fbc.i) {
                     return fbc.n;
                  }

                  if ($$8 == fbc.j) {
                     return fbc.k;
                  }

                  if ($$8 == fbc.y) {
                     return fbc.y;
                  }
               }
            }
         }
      }

      return $$4;
   }

   protected static fbc b(dly $$0, jb $$1) {
      eeb $$2 = $$0.a_($$1);
      dpz $$3 = $$2.b();
      if ($$2.l()) {
         return fbc.b;
      } else if ($$2.a(azo.N) || $$2.a(dqb.fF) || $$2.a(dqb.to)) {
         return fbc.e;
      } else if ($$2.a(dqb.ry)) {
         return fbc.f;
      } else if ($$2.a(dqb.eg) || $$2.a(dqb.oP)) {
         return fbc.q;
      } else if ($$2.a(dqb.pP)) {
         return fbc.w;
      } else if ($$2.a(dqb.gb)) {
         return fbc.x;
      } else if (!$$2.a(dqb.cn) && !$$2.a(dqb.tc)) {
         fal $$4 = $$2.y();
         if ($$4.a(azu.b)) {
            return fbc.i;
         } else if (a($$2)) {
            return fbc.o;
         } else if ($$3 instanceof dsg $$5) {
            if ($$2.c(dsg.e)) {
               return fbc.r;
            } else {
               return $$5.b().c() ? fbc.s : fbc.t;
            }
         } else if ($$3 instanceof dpo) {
            return fbc.l;
         } else if ($$3 instanceof duq) {
            return fbc.v;
         } else if (!$$2.a(azo.R) && !$$2.a(azo.H) && (!($$3 instanceof dtb) || $$2.c(dtb.b))) {
            if (!$$2.a(fba.a)) {
               return fbc.a;
            } else {
               return $$4.a(azu.a) ? fbc.j : fbc.b;
            }
         } else {
            return fbc.h;
         }
      } else {
         return fbc.y;
      }
   }
}
