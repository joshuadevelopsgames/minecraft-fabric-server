import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import javax.annotation.Nullable;

public class fyy implements hww {
   private static final long a = 3000L;
   private final fue b;
   private final List<fyy.b> c = Lists.newArrayList();
   private boolean d;
   private final List<fyy.b> e = new ArrayList<>();

   public fyy(fue $$0) {
      this.b = $$0;
   }

   public void a(fxb $$0) {
      hwx $$1 = this.b.al();
      if (!this.d && this.b.n.aa().c()) {
         $$1.a(this);
         this.d = true;
      } else if (this.d && !this.b.n.aa().c()) {
         $$1.b(this);
         this.d = false;
      }

      if (this.d) {
         flk $$2 = $$1.b();
         fis $$3 = $$2.b();
         fis $$4 = $$2.c();
         fis $$5 = $$2.a();
         this.e.clear();

         for (fyy.b $$6 : this.c) {
            if ($$6.c($$3)) {
               this.e.add($$6);
            }
         }

         if (!this.e.isEmpty()) {
            int $$7 = 0;
            int $$8 = 0;
            double $$9 = this.b.n.E().c();
            Iterator<fyy.b> $$10 = this.e.iterator();

            while ($$10.hasNext()) {
               fyy.b $$11 = $$10.next();
               $$11.a(3000.0 * $$9);
               if (!$$11.b()) {
                  $$10.remove();
               } else {
                  $$8 = Math.max($$8, this.b.h.a($$11.a()));
               }
            }

            $$8 += this.b.h.b("<") + this.b.h.b(" ") + this.b.h.b(">") + this.b.h.b(" ");
            if (!this.e.isEmpty()) {
               $$0.c();
            }

            for (fyy.b $$12 : this.e) {
               int $$13 = 255;
               xo $$14 = $$12.a();
               fyy.a $$15 = $$12.a($$3);
               if ($$15 != null) {
                  fis $$16 = $$15.a.d($$3).d();
                  double $$17 = $$5.b($$16);
                  double $$18 = $$4.b($$16);
                  boolean $$19 = $$18 > 0.5;
                  int $$20 = $$8 / 2;
                  int $$21 = 9;
                  int $$22 = $$21 / 2;
                  float $$23 = 1.0F;
                  int $$24 = this.b.h.a($$14);
                  int $$25 = bcb.d(bcb.b(255.0F, 75.0F, (float)(ag.c() - $$15.b) / (float)(3000.0 * $$9)));
                  $$0.e().pushMatrix();
                  $$0.e().translate($$0.a() - $$20 * 1.0F - 2.0F, $$0.b() - 35 - $$7 * ($$21 + 1) * 1.0F);
                  $$0.e().scale(1.0F, 1.0F);
                  $$0.a(-$$20 - 1, -$$22 - 1, $$20 + 1, $$22 + 1, this.b.n.b(0.8F));
                  int $$26 = baj.a(255, $$25, $$25, $$25);
                  if (!$$19) {
                     if ($$17 > 0.0) {
                        $$0.b(this.b.h, ">", $$20 - this.b.h.b(">"), -$$22, $$26);
                     } else if ($$17 < 0.0) {
                        $$0.b(this.b.h, "<", -$$20, -$$22, $$26);
                     }
                  }

                  $$0.b(this.b.h, $$14, -$$24 / 2, -$$22, $$26);
                  $$0.e().popMatrix();
                  $$7++;
               }
            }
         }
      }
   }

   @Override
   public void a(hvr $$0, hwy $$1, float $$2) {
      if ($$1.a() != null) {
         xo $$3 = $$1.a();
         if (!this.c.isEmpty()) {
            for (fyy.b $$4 : this.c) {
               if ($$4.a().equals($$3)) {
                  $$4.b(new fis($$0.h(), $$0.i(), $$0.j()));
                  return;
               }
            }
         }

         this.c.add(new fyy.b($$3, $$2, new fis($$0.h(), $$0.i(), $$0.j())));
      }
   }

   record a(fis a, long b) {
   }

   static class b {
      private final xo a;
      private final float b;
      private final List<fyy.a> c = new ArrayList<>();

      public b(xo $$0, float $$1, fis $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c.add(new fyy.a($$2, ag.c()));
      }

      public xo a() {
         return this.a;
      }

      @Nullable
      public fyy.a a(fis $$0) {
         if (this.c.isEmpty()) {
            return null;
         } else {
            return this.c.size() == 1 ? this.c.getFirst() : this.c.stream().min(Comparator.comparingDouble($$1 -> $$1.a().f($$0))).orElse(null);
         }
      }

      public void b(fis $$0) {
         this.c.removeIf($$1 -> $$0.equals($$1.a()));
         this.c.add(new fyy.a($$0, ag.c()));
      }

      public boolean c(fis $$0) {
         if (Float.isInfinite(this.b)) {
            return true;
         } else if (this.c.isEmpty()) {
            return false;
         } else {
            fyy.a $$1 = this.a($$0);
            return $$1 == null ? false : $$0.a((jv)$$1.a, (double)this.b);
         }
      }

      public void a(double $$0) {
         long $$1 = ag.c();
         this.c.removeIf($$2 -> $$1 - $$2.b() > $$0);
      }

      public boolean b() {
         return !this.c.isEmpty();
      }
   }
}
