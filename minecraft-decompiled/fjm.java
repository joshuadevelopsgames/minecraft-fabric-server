import com.google.common.collect.Lists;
import com.google.common.math.DoubleMath;
import it.unimi.dsi.fastutil.doubles.DoubleList;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public abstract class fjm {
   protected final fjb a;
   @Nullable
   private fjm[] b;

   protected fjm(fjb $$0) {
      this.a = $$0;
   }

   public double b(jh.a $$0) {
      int $$1 = this.a.a($$0);
      return $$1 >= this.a.c($$0) ? Double.POSITIVE_INFINITY : this.a($$0, $$1);
   }

   public double c(jh.a $$0) {
      int $$1 = this.a.b($$0);
      return $$1 <= 0 ? Double.NEGATIVE_INFINITY : this.a($$0, $$1);
   }

   public fin a() {
      if (this.c()) {
         throw (UnsupportedOperationException)ag.b(new UnsupportedOperationException("No bounds for empty shape."));
      } else {
         return new fin(this.b(jh.a.a), this.b(jh.a.b), this.b(jh.a.c), this.c(jh.a.a), this.c(jh.a.b), this.c(jh.a.c));
      }
   }

   public fjm b() {
      return this.c() ? fjj.a() : fjj.a(this.b(jh.a.a), this.b(jh.a.b), this.b(jh.a.c), this.c(jh.a.a), this.c(jh.a.b), this.c(jh.a.c));
   }

   protected double a(jh.a $$0, int $$1) {
      return this.a($$0).getDouble($$1);
   }

   public abstract DoubleList a(jh.a var1);

   public boolean c() {
      return this.a.a();
   }

   public fjm a(fis $$0) {
      return this.a($$0.d, $$0.e, $$0.f);
   }

   public fjm a(kg $$0) {
      return this.a($$0.u(), $$0.v(), $$0.w());
   }

   public fjm a(double $$0, double $$1, double $$2) {
      return (fjm)(this.c() ? fjj.a() : new fiu(this.a, new fji(this.a(jh.a.a), $$0), new fji(this.a(jh.a.b), $$1), new fji(this.a(jh.a.c), $$2)));
   }

   public fjm d() {
      fjm[] $$0 = new fjm[]{fjj.a()};
      this.b(($$1, $$2, $$3, $$4, $$5, $$6) -> $$0[0] = fjj.b($$0[0], fjj.a($$1, $$2, $$3, $$4, $$5, $$6), fiw.o));
      return $$0[0];
   }

   public void a(fjj.a $$0) {
      this.a
         .a(
            ($$1, $$2, $$3, $$4, $$5, $$6) -> $$0.consume(
               this.a(jh.a.a, $$1), this.a(jh.a.b, $$2), this.a(jh.a.c, $$3), this.a(jh.a.a, $$4), this.a(jh.a.b, $$5), this.a(jh.a.c, $$6)
            ),
            true
         );
   }

   public void b(fjj.a $$0) {
      DoubleList $$1 = this.a(jh.a.a);
      DoubleList $$2 = this.a(jh.a.b);
      DoubleList $$3 = this.a(jh.a.c);
      this.a
         .b(
            ($$4, $$5, $$6, $$7, $$8, $$9) -> $$0.consume(
               $$1.getDouble($$4), $$2.getDouble($$5), $$3.getDouble($$6), $$1.getDouble($$7), $$2.getDouble($$8), $$3.getDouble($$9)
            ),
            true
         );
   }

   public List<fin> e() {
      List<fin> $$0 = Lists.newArrayList();
      this.b(($$1, $$2, $$3, $$4, $$5, $$6) -> $$0.add(new fin($$1, $$2, $$3, $$4, $$5, $$6)));
      return $$0;
   }

   public double a(jh.a $$0, double $$1, double $$2) {
      jh.a $$3 = iy.b.a($$0);
      jh.a $$4 = iy.c.a($$0);
      int $$5 = this.a($$3, $$1);
      int $$6 = this.a($$4, $$2);
      int $$7 = this.a.a($$0, $$5, $$6);
      return $$7 >= this.a.c($$0) ? Double.POSITIVE_INFINITY : this.a($$0, $$7);
   }

   public double b(jh.a $$0, double $$1, double $$2) {
      jh.a $$3 = iy.b.a($$0);
      jh.a $$4 = iy.c.a($$0);
      int $$5 = this.a($$3, $$1);
      int $$6 = this.a($$4, $$2);
      int $$7 = this.a.b($$0, $$5, $$6);
      return $$7 <= 0 ? Double.NEGATIVE_INFINITY : this.a($$0, $$7);
   }

   protected int a(jh.a $$0, double $$1) {
      return bcb.a(0, this.a.c($$0) + 1, $$2 -> $$1 < this.a($$0, $$2)) - 1;
   }

   @Nullable
   public fio a(fis $$0, fis $$1, jb $$2) {
      if (this.c()) {
         return null;
      } else {
         fis $$3 = $$1.d($$0);
         if ($$3.h() < 1.0E-7) {
            return null;
         } else {
            fis $$4 = $$0.e($$3.c(0.001));
            return this.a.e(this.a(jh.a.a, $$4.d - $$2.u()), this.a(jh.a.b, $$4.e - $$2.v()), this.a(jh.a.c, $$4.f - $$2.w()))
               ? new fio($$4, jh.a($$3.d, $$3.e, $$3.f).g(), $$2, true)
               : fin.a(this.e(), $$0, $$1, $$2);
         }
      }
   }

   public Optional<fis> b(fis $$0) {
      if (this.c()) {
         return Optional.empty();
      } else {
         fis[] $$1 = new fis[1];
         this.b(($$2, $$3, $$4, $$5, $$6, $$7) -> {
            double $$8 = bcb.a($$0.a(), $$2, $$5);
            double $$9 = bcb.a($$0.b(), $$3, $$6);
            double $$10 = bcb.a($$0.c(), $$4, $$7);
            if ($$1[0] == null || $$0.c($$8, $$9, $$10) < $$0.g($$1[0])) {
               $$1[0] = new fis($$8, $$9, $$10);
            }
         });
         return Optional.of($$1[0]);
      }
   }

   public fjm a(jh $$0) {
      if (!this.c() && this != fjj.b()) {
         if (this.b != null) {
            fjm $$1 = this.b[$$0.ordinal()];
            if ($$1 != null) {
               return $$1;
            }
         } else {
            this.b = new fjm[6];
         }

         fjm $$2 = this.b($$0);
         this.b[$$0.ordinal()] = $$2;
         return $$2;
      } else {
         return this;
      }
   }

   private fjm b(jh $$0) {
      jh.a $$1 = $$0.o();
      if (this.d($$1)) {
         return this;
      } else {
         jh.b $$2 = $$0.f();
         int $$3 = this.a($$1, $$2 == jh.b.a ? 0.9999999 : 1.0E-7);
         fjk $$4 = new fjk(this, $$1, $$3);
         if ($$4.c()) {
            return fjj.a();
         } else {
            return (fjm)($$4.f() ? fjj.b() : $$4);
         }
      }
   }

   protected boolean f() {
      for (jh.a $$0 : jh.a.d) {
         if (!this.d($$0)) {
            return false;
         }
      }

      return true;
   }

   private boolean d(jh.a $$0) {
      DoubleList $$1 = this.a($$0);
      return $$1.size() == 2 && DoubleMath.fuzzyEquals($$1.getDouble(0), 0.0, 1.0E-7) && DoubleMath.fuzzyEquals($$1.getDouble(1), 1.0, 1.0E-7);
   }

   public double a(jh.a $$0, fin $$1, double $$2) {
      return this.a(iy.a($$0, jh.a.a), $$1, $$2);
   }

   protected double a(iy $$0, fin $$1, double $$2) {
      if (this.c()) {
         return $$2;
      } else if (Math.abs($$2) < 1.0E-7) {
         return 0.0;
      } else {
         iy $$3 = $$0.a();
         jh.a $$4 = $$3.a(jh.a.a);
         jh.a $$5 = $$3.a(jh.a.b);
         jh.a $$6 = $$3.a(jh.a.c);
         double $$7 = $$1.b($$4);
         double $$8 = $$1.a($$4);
         int $$9 = this.a($$4, $$8 + 1.0E-7);
         int $$10 = this.a($$4, $$7 - 1.0E-7);
         int $$11 = Math.max(0, this.a($$5, $$1.a($$5) + 1.0E-7));
         int $$12 = Math.min(this.a.c($$5), this.a($$5, $$1.b($$5) - 1.0E-7) + 1);
         int $$13 = Math.max(0, this.a($$6, $$1.a($$6) + 1.0E-7));
         int $$14 = Math.min(this.a.c($$6), this.a($$6, $$1.b($$6) - 1.0E-7) + 1);
         int $$15 = this.a.c($$4);
         if ($$2 > 0.0) {
            for (int $$16 = $$10 + 1; $$16 < $$15; $$16++) {
               for (int $$17 = $$11; $$17 < $$12; $$17++) {
                  for (int $$18 = $$13; $$18 < $$14; $$18++) {
                     if (this.a.a($$3, $$16, $$17, $$18)) {
                        double $$19 = this.a($$4, $$16) - $$7;
                        if ($$19 >= -1.0E-7) {
                           $$2 = Math.min($$2, $$19);
                        }

                        return $$2;
                     }
                  }
               }
            }
         } else if ($$2 < 0.0) {
            for (int $$20 = $$9 - 1; $$20 >= 0; $$20--) {
               for (int $$21 = $$11; $$21 < $$12; $$21++) {
                  for (int $$22 = $$13; $$22 < $$14; $$22++) {
                     if (this.a.a($$3, $$20, $$21, $$22)) {
                        double $$23 = this.a($$4, $$20 + 1) - $$8;
                        if ($$23 <= 1.0E-7) {
                           $$2 = Math.max($$2, $$23);
                        }

                        return $$2;
                     }
                  }
               }
            }
         }

         return $$2;
      }
   }

   @Override
   public boolean equals(Object $$0) {
      return super.equals($$0);
   }

   @Override
   public String toString() {
      return this.c() ? "EMPTY" : "VoxelShape[" + this.a() + "]";
   }
}
