import com.google.common.collect.Ordering;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class ggt {
   private static final ame a = ame.b("container/inventory/effect_background_large");
   private static final ame b = ame.b("container/inventory/effect_background_small");
   private final gfz<?> c;
   private final fue d;
   @Nullable
   private byq e;

   public ggt(gfz<?> $$0) {
      this.c = $$0;
      this.d = fue.R();
   }

   public boolean a() {
      int $$0 = this.c.A + this.c.d + 2;
      int $$1 = this.c.o - $$0;
      return $$1 >= 32;
   }

   public void a(fxb $$0, int $$1, int $$2) {
      this.e = null;
      int $$3 = this.c.A + this.c.d + 2;
      int $$4 = this.c.o - $$3;
      Collection<byq> $$5 = this.d.t.eI();
      if (!$$5.isEmpty() && $$4 >= 32) {
         boolean $$6 = $$4 >= 120;
         int $$7 = 33;
         if ($$5.size() > 5) {
            $$7 = 132 / ($$5.size() - 1);
         }

         Iterable<byq> $$8 = Ordering.natural().sortedCopy($$5);
         this.a($$0, $$3, $$7, $$8, $$6);
         this.b($$0, $$3, $$7, $$8, $$6);
         if ($$6) {
            this.a($$0, $$3, $$7, $$8);
         } else if ($$1 >= $$3 && $$1 <= $$3 + 33) {
            int $$9 = this.c.B;

            for (byq $$10 : $$8) {
               if ($$2 >= $$9 && $$2 <= $$9 + $$7) {
                  this.e = $$10;
               }

               $$9 += $$7;
            }
         }
      }
   }

   public void b(fxb $$0, int $$1, int $$2) {
      if (this.e != null) {
         List<xo> $$3 = List.of(this.a(this.e), byr.a(this.e, 1.0F, this.d.s.v().f()));
         $$0.a(this.c.B(), $$3, Optional.empty(), $$1, $$2);
      }
   }

   private void a(fxb $$0, int $$1, int $$2, Iterable<byq> $$3, boolean $$4) {
      int $$5 = this.c.B;

      for (byq $$6 : $$3) {
         if ($$4) {
            $$0.a(gxx.ar, a, $$1, $$5, 120, 32);
         } else {
            $$0.a(gxx.ar, b, $$1, $$5, 32, 32);
         }

         $$5 += $$2;
      }
   }

   private void b(fxb $$0, int $$1, int $$2, Iterable<byq> $$3, boolean $$4) {
      int $$5 = this.c.B;

      for (byq $$6 : $$3) {
         jl<byo> $$7 = $$6.c();
         ame $$8 = fxa.a($$7);
         $$0.a(gxx.ar, $$8, $$1 + ($$4 ? 6 : 7), $$5 + 7, 18, 18);
         $$5 += $$2;
      }
   }

   private void a(fxb $$0, int $$1, int $$2, Iterable<byq> $$3) {
      int $$4 = this.c.B;

      for (byq $$5 : $$3) {
         xo $$6 = this.a($$5);
         $$0.b(this.c.B(), $$6, $$1 + 10 + 18, $$4 + 6, -1);
         xo $$7 = byr.a($$5, 1.0F, this.d.s.v().f());
         $$0.b(this.c.B(), $$7, $$1 + 10 + 18, $$4 + 6 + 10, -8421505);
         $$4 += $$2;
      }
   }

   private xo a(byq $$0) {
      yc $$1 = $$0.c().a().g().f();
      if ($$0.e() >= 1 && $$0.e() <= 9) {
         $$1.b(xn.w).b(xo.c("enchantment.level." + ($$0.e() + 1)));
      }

      return $$1;
   }
}
