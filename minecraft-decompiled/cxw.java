import com.mojang.datafixers.util.Pair;
import java.util.List;
import javax.annotation.Nullable;

public class cxw extends cxo {
   private static final double b = 0.01;
   private static final double c = 0.2;
   private static final double d = 0.4;
   private static final double e = 0.4;
   private final cah f;
   private fis g = fis.c;

   public cxw(cxg $$0) {
      super($$0);
      this.f = new cah($$0, this::a);
   }

   @Override
   public cah a() {
      return this.f;
   }

   public void a(cah $$0) {
      this.a(this.g);
   }

   @Override
   public void a(double $$0, double $$1, double $$2) {
      this.g = new fis($$0, $$1, $$2);
      this.a(this.g);
   }

   @Override
   public void b() {
      if (this.c() instanceof aub $$0) {
         this.a.bi();
         jb var11 = this.a.l();
         eeb $$3 = this.c().a_(var11);
         boolean $$4 = dpo.h($$3);
         this.a.a($$4);
         if ($$4) {
            this.a($$0);
            if ($$3.a(dqb.hI)) {
               this.a.a(var11.u(), var11.v(), var11.w(), $$3.c(dwd.d));
            }
         } else {
            this.a.e($$0);
         }

         this.a.aL();
         this.a(0.0F);
         double $$5 = this.a.X - this.g();
         double $$6 = this.a.Z - this.i();
         if ($$5 * $$5 + $$6 * $$6 > 0.001) {
            this.b((float)(bcb.d($$6, $$5) * 180.0 / Math.PI));
            if (this.a.m()) {
               this.b(this.k() + 180.0F);
            }
         }

         double $$7 = bcb.h(this.k() - this.a.aa);
         if ($$7 < -170.0 || $$7 >= 170.0) {
            this.b(this.k() + 180.0F);
            this.a.b(!this.a.m());
         }

         this.a(this.j() % 360.0F);
         this.b(this.k() % 360.0F);
         this.d();
      } else {
         if (this.f.d()) {
            this.f.e();
         } else {
            this.a.ay();
            this.a(this.j() % 360.0F);
            this.b(this.k() % 360.0F);
         }
      }
   }

   @Override
   public void a(aub $$0) {
      jb $$1 = this.a.l();
      eeb $$2 = this.c().a_($$1);
      this.a.j();
      double $$3 = this.a.dC();
      double $$4 = this.a.dE();
      double $$5 = this.a.dI();
      fis $$6 = this.d($$3, $$4, $$5);
      $$4 = $$1.v();
      boolean $$7 = false;
      boolean $$8 = false;
      if ($$2.a(dqb.bw)) {
         $$7 = $$2.c(dwd.d);
         $$8 = !$$7;
      }

      double $$9 = 0.0078125;
      if (this.a.bm()) {
         $$9 *= 0.2;
      }

      fis $$10 = this.e();
      eff $$11 = $$2.c(((dpo)$$2.b()).c());
      switch ($$11) {
         case c:
            this.a($$10.b(-$$9, 0.0, 0.0));
            $$4++;
            break;
         case d:
            this.a($$10.b($$9, 0.0, 0.0));
            $$4++;
            break;
         case e:
            this.a($$10.b(0.0, 0.0, $$9));
            $$4++;
            break;
         case f:
            this.a($$10.b(0.0, 0.0, -$$9));
            $$4++;
      }

      $$10 = this.e();
      Pair<kg, kg> $$12 = cxg.a($$11);
      kg $$13 = (kg)$$12.getFirst();
      kg $$14 = (kg)$$12.getSecond();
      double $$15 = $$14.u() - $$13.u();
      double $$16 = $$14.w() - $$13.w();
      double $$17 = Math.sqrt($$15 * $$15 + $$16 * $$16);
      double $$18 = $$10.d * $$15 + $$10.f * $$16;
      if ($$18 < 0.0) {
         $$15 = -$$15;
         $$16 = -$$16;
      }

      double $$19 = Math.min(2.0, $$10.i());
      $$10 = new fis($$19 * $$15 / $$17, $$10.e, $$19 * $$16 / $$17);
      this.a($$10);
      bzm $$20 = this.a.db();
      fis $$22;
      if (this.a.db() instanceof auc $$21) {
         $$22 = $$21.ag();
      } else {
         $$22 = fis.c;
      }

      if ($$20 instanceof cut && $$22.h() > 0.0) {
         fis $$24 = $$22.d();
         double $$25 = this.e().j();
         if ($$24.h() > 0.0 && $$25 < 0.01) {
            this.a(this.e().b($$22.d * 0.001, 0.0, $$22.f * 0.001));
            $$8 = false;
         }
      }

      if ($$8) {
         double $$26 = this.e().i();
         if ($$26 < 0.03) {
            this.a(fis.c);
         } else {
            this.a(this.e().d(0.5, 0.0, 0.5));
         }
      }

      double $$27 = $$1.u() + 0.5 + $$13.u() * 0.5;
      double $$28 = $$1.w() + 0.5 + $$13.w() * 0.5;
      double $$29 = $$1.u() + 0.5 + $$14.u() * 0.5;
      double $$30 = $$1.w() + 0.5 + $$14.w() * 0.5;
      $$15 = $$29 - $$27;
      $$16 = $$30 - $$28;
      double $$31;
      if ($$15 == 0.0) {
         $$31 = $$5 - $$1.w();
      } else if ($$16 == 0.0) {
         $$31 = $$3 - $$1.u();
      } else {
         double $$33 = $$3 - $$27;
         double $$34 = $$5 - $$28;
         $$31 = ($$33 * $$15 + $$34 * $$16) * 2.0;
      }

      $$3 = $$27 + $$15 * $$31;
      $$5 = $$28 + $$16 * $$31;
      this.c($$3, $$4, $$5);
      double $$36 = this.a.cd() ? 0.75 : 1.0;
      double $$37 = this.a.a($$0);
      $$10 = this.e();
      this.a.a(caq.a, new fis(bcb.a($$36 * $$10.d, -$$37, $$37), 0.0, bcb.a($$36 * $$10.f, -$$37, $$37)));
      if ($$13.v() != 0 && bcb.a(this.a.dC()) - $$1.u() == $$13.u() && bcb.a(this.a.dI()) - $$1.w() == $$13.w()) {
         this.c(this.a.dC(), this.a.dE() + $$13.v(), this.a.dI());
      } else if ($$14.v() != 0 && bcb.a(this.a.dC()) - $$1.u() == $$14.u() && bcb.a(this.a.dI()) - $$1.w() == $$14.w()) {
         this.c(this.a.dC(), this.a.dE() + $$14.v(), this.a.dI());
      }

      this.a(this.a.a(this.e()));
      fis $$38 = this.d(this.a.dC(), this.a.dE(), this.a.dI());
      if ($$38 != null && $$6 != null) {
         double $$39 = ($$6.e - $$38.e) * 0.05;
         fis $$40 = this.e();
         double $$41 = $$40.i();
         if ($$41 > 0.0) {
            this.a($$40.d(($$41 + $$39) / $$41, 1.0, ($$41 + $$39) / $$41));
         }

         this.c(this.a.dC(), $$38.e, this.a.dI());
      }

      int $$42 = bcb.a(this.a.dC());
      int $$43 = bcb.a(this.a.dI());
      if ($$42 != $$1.u() || $$43 != $$1.w()) {
         fis $$44 = this.e();
         double $$45 = $$44.i();
         this.b($$45 * ($$42 - $$1.u()), $$44.e, $$45 * ($$43 - $$1.w()));
      }

      if ($$7) {
         fis $$46 = this.e();
         double $$47 = $$46.i();
         if ($$47 > 0.01) {
            double $$48 = 0.06;
            this.a($$46.b($$46.d / $$47 * 0.06, 0.0, $$46.f / $$47 * 0.06));
         } else {
            fis $$49 = this.e();
            double $$50 = $$49.d;
            double $$51 = $$49.f;
            if ($$11 == eff.b) {
               if (this.a.b($$1.h())) {
                  $$50 = 0.02;
               } else if (this.a.b($$1.i())) {
                  $$50 = -0.02;
               }
            } else {
               if ($$11 != eff.a) {
                  return;
               }

               if (this.a.b($$1.f())) {
                  $$51 = 0.02;
               } else if (this.a.b($$1.g())) {
                  $$51 = -0.02;
               }
            }

            this.b($$50, $$49.e, $$51);
         }
      }
   }

   @Nullable
   public fis a(double $$0, double $$1, double $$2, double $$3) {
      int $$4 = bcb.a($$0);
      int $$5 = bcb.a($$1);
      int $$6 = bcb.a($$2);
      if (this.c().a_(new jb($$4, $$5 - 1, $$6)).a(azo.K)) {
         $$5--;
      }

      eeb $$7 = this.c().a_(new jb($$4, $$5, $$6));
      if (dpo.h($$7)) {
         eff $$8 = $$7.c(((dpo)$$7.b()).c());
         $$1 = $$5;
         if ($$8.b()) {
            $$1 = $$5 + 1;
         }

         Pair<kg, kg> $$9 = cxg.a($$8);
         kg $$10 = (kg)$$9.getFirst();
         kg $$11 = (kg)$$9.getSecond();
         double $$12 = $$11.u() - $$10.u();
         double $$13 = $$11.w() - $$10.w();
         double $$14 = Math.sqrt($$12 * $$12 + $$13 * $$13);
         $$12 /= $$14;
         $$13 /= $$14;
         $$0 += $$12 * $$3;
         $$2 += $$13 * $$3;
         if ($$10.v() != 0 && bcb.a($$0) - $$4 == $$10.u() && bcb.a($$2) - $$6 == $$10.w()) {
            $$1 += $$10.v();
         } else if ($$11.v() != 0 && bcb.a($$0) - $$4 == $$11.u() && bcb.a($$2) - $$6 == $$11.w()) {
            $$1 += $$11.v();
         }

         return this.d($$0, $$1, $$2);
      } else {
         return null;
      }
   }

   @Nullable
   public fis d(double $$0, double $$1, double $$2) {
      int $$3 = bcb.a($$0);
      int $$4 = bcb.a($$1);
      int $$5 = bcb.a($$2);
      if (this.c().a_(new jb($$3, $$4 - 1, $$5)).a(azo.K)) {
         $$4--;
      }

      eeb $$6 = this.c().a_(new jb($$3, $$4, $$5));
      if (dpo.h($$6)) {
         eff $$7 = $$6.c(((dpo)$$6.b()).c());
         Pair<kg, kg> $$8 = cxg.a($$7);
         kg $$9 = (kg)$$8.getFirst();
         kg $$10 = (kg)$$8.getSecond();
         double $$11 = $$3 + 0.5 + $$9.u() * 0.5;
         double $$12 = $$4 + 0.0625 + $$9.v() * 0.5;
         double $$13 = $$5 + 0.5 + $$9.w() * 0.5;
         double $$14 = $$3 + 0.5 + $$10.u() * 0.5;
         double $$15 = $$4 + 0.0625 + $$10.v() * 0.5;
         double $$16 = $$5 + 0.5 + $$10.w() * 0.5;
         double $$17 = $$14 - $$11;
         double $$18 = ($$15 - $$12) * 2.0;
         double $$19 = $$16 - $$13;
         double $$20;
         if ($$17 == 0.0) {
            $$20 = $$2 - $$5;
         } else if ($$19 == 0.0) {
            $$20 = $$0 - $$3;
         } else {
            double $$22 = $$0 - $$11;
            double $$23 = $$2 - $$13;
            $$20 = ($$22 * $$17 + $$23 * $$19) * 2.0;
         }

         $$0 = $$11 + $$17 * $$20;
         $$1 = $$12 + $$18 * $$20;
         $$2 = $$13 + $$19 * $$20;
         if ($$18 < 0.0) {
            $$1++;
         } else if ($$18 > 0.0) {
            $$1 += 0.5;
         }

         return new fis($$0, $$1, $$2);
      } else {
         return null;
      }
   }

   @Override
   public double a(jb $$0, eff $$1, double $$2) {
      return 0.0;
   }

   @Override
   public boolean d() {
      fin $$0 = this.a.cV().c(0.2F, 0.0, 0.2F);
      if (this.a.x() && this.e().j() >= 0.01) {
         List<bzm> $$1 = this.c().a(this.a, $$0, bzt.a(this.a));
         if (!$$1.isEmpty()) {
            for (bzm $$2 : $$1) {
               if (!($$2 instanceof cut) && !($$2 instanceof cmv) && !($$2 instanceof cxg) && !this.a.cd() && !$$2.cc()) {
                  $$2.o(this.a);
               } else {
                  $$2.h(this.a);
               }
            }
         }
      } else {
         for (bzm $$3 : this.c().a_(this.a, $$0)) {
            if (!this.a.z($$3) && $$3.bL() && $$3 instanceof cxg) {
               $$3.h(this.a);
            }
         }
      }

      return false;
   }

   @Override
   public jh l() {
      return this.a.m() ? this.a.cS().g().h() : this.a.cS().h();
   }

   @Override
   public fis c(fis $$0) {
      return !Double.isNaN($$0.d) && !Double.isNaN($$0.e) && !Double.isNaN($$0.f) ? new fis(bcb.a($$0.d, -0.4, 0.4), $$0.e, bcb.a($$0.f, -0.4, 0.4)) : fis.c;
   }

   @Override
   public double b(aub $$0) {
      return this.a.bm() ? 0.2 : 0.4;
   }

   @Override
   public double m() {
      return this.a.cd() ? 0.997 : 0.96;
   }
}
