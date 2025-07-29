import com.mojang.serialization.Codec;
import java.util.Optional;
import javax.annotation.Nullable;

public class enx extends enh<epp> {
   public enx(Codec<epp> $$0) {
      super($$0);
   }

   @Override
   public boolean a(enj<epp> $$0) {
      dnt $$1 = $$0.b();
      jb $$2 = $$0.e();
      epp $$3 = $$0.f();
      bck $$4 = $$0.d();
      if (!enb.a($$1, $$2)) {
         return false;
      } else {
         Optional<ejq> $$5 = ejq.a($$1, $$2, $$3.b, enb::c, enb::a);
         if (!$$5.isEmpty() && $$5.get() instanceof ejq.b) {
            ejq.b $$6 = (ejq.b)$$5.get();
            if ($$6.g() < 4) {
               return false;
            } else {
               int $$7 = (int)($$6.g() * $$3.e);
               int $$8 = bcb.a($$7, $$3.c.a(), $$3.c.b());
               int $$9 = bcb.b($$4, $$3.c.a(), $$8);
               enx.a $$10 = a($$2.h($$6.e() - 1), false, $$4, $$9, $$3.f, $$3.d);
               enx.a $$11 = a($$2.h($$6.f() + 1), true, $$4, $$9, $$3.g, $$3.d);
               enx.b $$12;
               if ($$10.a($$3) && $$11.a($$3)) {
                  $$12 = new enx.b($$2.v(), $$4, $$3.h);
               } else {
                  $$12 = enx.b.a();
               }

               boolean $$14 = $$10.a($$1, $$12);
               boolean $$15 = $$11.a($$1, $$12);
               if ($$14) {
                  $$10.a($$1, $$4, $$12);
               }

               if ($$15) {
                  $$11.a($$1, $$4, $$12);
               }

               return true;
            }
         } else {
            return false;
         }
      }
   }

   private static enx.a a(jb $$0, boolean $$1, bck $$2, int $$3, bwm $$4, bwm $$5) {
      return new enx.a($$0, $$1, $$3, $$4.a($$2), $$5.a($$2));
   }

   private void a(dnt $$0, jb $$1, ejq.b $$2, enx.b $$3) {
      $$0.a($$3.a($$1.h($$2.e() - 1)), dqb.cK.m(), 2);
      $$0.a($$3.a($$1.h($$2.f() + 1)), dqb.cr.m(), 2);

      for (jb.a $$4 = $$1.h($$2.f() + 2).k(); $$4.v() < $$2.e() - 1; $$4.c(jh.b)) {
         jb $$5 = $$3.a($$4);
         if (enb.a($$0, $$5) || $$0.a_($$5).a(dqb.td)) {
            $$0.a($$5, dqb.hn.m(), 2);
         }
      }
   }

   static final class a {
      private jb a;
      private final boolean b;
      private int c;
      private final double d;
      private final double e;

      a(jb $$0, boolean $$1, int $$2, double $$3, double $$4) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
         this.e = $$4;
      }

      private int a() {
         return this.a(0.0F);
      }

      private int b() {
         return this.b ? this.a.v() : this.a.v() - this.a();
      }

      private int c() {
         return !this.b ? this.a.v() : this.a.v() + this.a();
      }

      boolean a(dnt $$0, enx.b $$1) {
         while (this.c > 1) {
            jb.a $$2 = this.a.k();
            int $$3 = Math.min(10, this.a());

            for (int $$4 = 0; $$4 < $$3; $$4++) {
               if ($$0.a_($$2).a(dqb.K)) {
                  return false;
               }

               if (enb.a($$0, $$1.a($$2), this.c)) {
                  this.a = $$2;
                  return true;
               }

               $$2.c(this.b ? jh.a : jh.b);
            }

            this.c /= 2;
         }

         return false;
      }

      private int a(float $$0) {
         return (int)enb.a($$0, this.c, this.e, this.d);
      }

      void a(dnt $$0, bck $$1, enx.b $$2) {
         for (int $$3 = -this.c; $$3 <= this.c; $$3++) {
            for (int $$4 = -this.c; $$4 <= this.c; $$4++) {
               float $$5 = bcb.c((float)($$3 * $$3 + $$4 * $$4));
               if (!($$5 > this.c)) {
                  int $$6 = this.a($$5);
                  if ($$6 > 0) {
                     if ($$1.i() < 0.2) {
                        $$6 = (int)($$6 * bcb.b($$1, 0.8F, 1.0F));
                     }

                     jb.a $$7 = this.a.b($$3, 0, $$4).k();
                     boolean $$8 = false;
                     int $$9 = this.b ? $$0.a(eka.a.a, $$7.u(), $$7.w()) : Integer.MAX_VALUE;

                     for (int $$10 = 0; $$10 < $$6 && $$7.v() < $$9; $$10++) {
                        jb $$11 = $$2.a($$7);
                        if (enb.b($$0, $$11)) {
                           $$8 = true;
                           dpz $$12 = dqb.td;
                           $$0.a($$11, $$12.m(), 2);
                        } else if ($$8 && $$0.a_($$11).a(azo.bi)) {
                           break;
                        }

                        $$7.c(this.b ? jh.b : jh.a);
                     }
                  }
               }
            }
         }
      }

      boolean a(epp $$0) {
         return this.c >= $$0.i && this.d >= $$0.j;
      }
   }

   static final class b {
      private final int a;
      @Nullable
      private final fis b;

      b(int $$0, bck $$1, bwm $$2) {
         this.a = $$0;
         float $$3 = $$2.a($$1);
         float $$4 = bcb.b($$1, 0.0F, (float) Math.PI);
         this.b = new fis(bcb.b($$4) * $$3, 0.0, bcb.a($$4) * $$3);
      }

      private b() {
         this.a = 0;
         this.b = null;
      }

      static enx.b a() {
         return new enx.b();
      }

      jb a(jb $$0) {
         if (this.b == null) {
            return $$0;
         } else {
            int $$1 = this.a - $$0.v();
            fis $$2 = this.b.c((double)$$1);
            return $$0.b(bcb.a($$2.d), 0, bcb.a($$2.f));
         }
      }
   }
}
