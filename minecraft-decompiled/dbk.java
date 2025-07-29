import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;
import org.apache.commons.lang3.math.Fraction;

public class dbk extends dcr {
   public static final int a = 4;
   public static final int b = 3;
   public static final int c = 12;
   public static final int d = 11;
   private static final int o = baj.a(1.0F, 1.0F, 0.33F, 0.33F);
   private static final int p = baj.a(1.0F, 0.44F, 0.53F, 1.0F);
   private static final int q = 10;
   private static final int r = 2;
   private static final int s = 200;

   public dbk(dcr.a $$0) {
      super($$0);
   }

   public static float c(dcv $$0) {
      dey $$1 = $$0.a(kq.Q, dey.a);
      return $$1.f().floatValue();
   }

   @Override
   public boolean a(dcv $$0, dak $$1, cyw $$2, cut $$3) {
      dey $$4 = $$0.a(kq.Q);
      if ($$4 == null) {
         return false;
      } else {
         dcv $$5 = $$1.g();
         dey.a $$6 = new dey.a($$4);
         if ($$2 == cyw.a && !$$5.f()) {
            if ($$6.a($$1, $$3) > 0) {
               b($$3);
            } else {
               c($$3);
            }

            $$0.b(kq.Q, $$6.d());
            this.a($$3);
            return true;
         } else if ($$2 == cyw.b && $$5.f()) {
            dcv $$7 = $$6.b();
            if ($$7 != null) {
               dcv $$8 = $$1.d($$7);
               if ($$8.M() > 0) {
                  $$6.a($$8);
               } else {
                  a((bzm)$$3);
               }
            }

            $$0.b(kq.Q, $$6.d());
            this.a($$3);
            return true;
         } else {
            return false;
         }
      }
   }

   @Override
   public boolean a(dcv $$0, dcv $$1, dak $$2, cyw $$3, cut $$4, cbd $$5) {
      if ($$3 == cyw.a && $$1.f()) {
         a($$0, -1);
         return false;
      } else {
         dey $$6 = $$0.a(kq.Q);
         if ($$6 == null) {
            return false;
         } else {
            dey.a $$7 = new dey.a($$6);
            if ($$3 == cyw.a && !$$1.f()) {
               if ($$2.b($$4) && $$7.a($$1) > 0) {
                  b($$4);
               } else {
                  c($$4);
               }

               $$0.b(kq.Q, $$7.d());
               this.a($$4);
               return true;
            } else if ($$3 == cyw.b && $$1.f()) {
               if ($$2.b($$4)) {
                  dcv $$8 = $$7.b();
                  if ($$8 != null) {
                     a((bzm)$$4);
                     $$5.a($$8);
                  }
               }

               $$0.b(kq.Q, $$7.d());
               this.a($$4);
               return true;
            } else {
               a($$0, -1);
               return false;
            }
         }
      }
   }

   @Override
   public bxj a(dmu $$0, cut $$1, bxi $$2) {
      $$1.c($$2);
      return bxj.a;
   }

   private void a(dmu $$0, cut $$1, dcv $$2) {
      if (this.b($$2, $$1)) {
         a($$0, $$1);
         $$1.b(azj.c.b(this));
      }
   }

   @Override
   public boolean d(dcv $$0) {
      dey $$1 = $$0.a(kq.Q, dey.a);
      return $$1.f().compareTo(Fraction.ZERO) > 0;
   }

   @Override
   public int e(dcv $$0) {
      dey $$1 = $$0.a(kq.Q, dey.a);
      return Math.min(1 + bcb.a($$1.f(), 12), 13);
   }

   @Override
   public int f(dcv $$0) {
      dey $$1 = $$0.a(kq.Q, dey.a);
      return $$1.f().compareTo(Fraction.ONE) >= 0 ? o : p;
   }

   public static void a(dcv $$0, int $$1) {
      dey $$2 = $$0.a(kq.Q);
      if ($$2 != null) {
         dey.a $$3 = new dey.a($$2);
         $$3.a($$1);
         $$0.b(kq.Q, $$3.d());
      }
   }

   public static boolean g(dcv $$0) {
      dey $$1 = $$0.a(kq.Q);
      return $$1 != null && $$1.h() != -1;
   }

   public static int h(dcv $$0) {
      dey $$1 = $$0.a(kq.Q, dey.a);
      return $$1.h();
   }

   public static dcv i(dcv $$0) {
      dey $$1 = $$0.a(kq.Q);
      return $$1 != null && $$1.h() != -1 ? $$1.a($$1.h()) : dcv.l;
   }

   public static int j(dcv $$0) {
      dey $$1 = $$0.a(kq.Q, dey.a);
      return $$1.a();
   }

   private boolean b(dcv $$0, cut $$1) {
      dey $$2 = $$0.a(kq.Q);
      if ($$2 != null && !$$2.g()) {
         Optional<dcv> $$3 = a($$0, $$1, $$2);
         if ($$3.isPresent()) {
            $$1.a($$3.get(), true);
            return true;
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   private static Optional<dcv> a(dcv $$0, cut $$1, dey $$2) {
      dey.a $$3 = new dey.a($$2);
      dcv $$4 = $$3.b();
      if ($$4 != null) {
         a((bzm)$$1);
         $$0.b(kq.Q, $$3.d());
         return Optional.of($$4);
      } else {
         return Optional.empty();
      }
   }

   @Override
   public void a(dmu $$0, cam $$1, dcv $$2, int $$3) {
      if ($$1 instanceof cut $$4) {
         int $$5 = this.a($$2, $$1);
         boolean $$6 = $$3 == $$5;
         if ($$6 || $$3 < $$5 - 10 && $$3 % 2 == 0) {
            this.a($$0, $$4, $$2);
         }
      }
   }

   @Override
   public int a(dcv $$0, cam $$1) {
      return 200;
   }

   @Override
   public dcx b(dcv $$0) {
      return dcx.k;
   }

   @Override
   public Optional<dau> k(dcv $$0) {
      dfz $$1 = $$0.a(kq.q, dfz.c);
      return !$$1.a(kq.Q) ? Optional.empty() : Optional.ofNullable($$0.a(kq.Q)).map(dat::new);
   }

   @Override
   public void a(cqz $$0) {
      dey $$1 = $$0.e().a(kq.Q);
      if ($$1 != null) {
         $$0.e().b(kq.Q, dey.a);
         dcy.a($$0, $$1.d());
      }
   }

   public static List<dbk> a() {
      return Stream.of(dcz.sd, dcz.se, dcz.sf, dcz.sg, dcz.sh, dcz.si, dcz.sj, dcz.sk, dcz.sl, dcz.sm, dcz.sn, dcz.st, dcz.sq, dcz.sr, dcz.ss, dcz.sp, dcz.so)
         .map($$0 -> (dbk)$$0)
         .toList();
   }

   public static dcr a(dbt $$0) {
      return switch ($$0) {
         case a -> dcz.se;
         case b -> dcz.sf;
         case c -> dcz.sg;
         case d -> dcz.sh;
         case e -> dcz.si;
         case f -> dcz.sj;
         case g -> dcz.sk;
         case h -> dcz.sl;
         case i -> dcz.sm;
         case j -> dcz.sn;
         case l -> dcz.sp;
         case m -> dcz.sq;
         case n -> dcz.sr;
         case o -> dcz.ss;
         case p -> dcz.st;
         case k -> dcz.so;
      };
   }

   private static void a(bzm $$0) {
      $$0.a(ayz.ds, 0.8F, 0.8F + $$0.ai().H_().i() * 0.4F);
   }

   private static void b(bzm $$0) {
      $$0.a(ayz.dq, 0.8F, 0.8F + $$0.ai().H_().i() * 0.4F);
   }

   private static void c(bzm $$0) {
      $$0.a(ayz.dr, 1.0F, 1.0F);
   }

   private static void a(dmu $$0, bzm $$1) {
      $$0.a(null, $$1.dx(), ayz.dp, aza.h, 0.8F, 0.8F + $$1.ai().H_().i() * 0.4F);
   }

   private void a(cut $$0) {
      cym $$1 = $$0.cn;
      if ($$1 != null) {
         $$1.a($$0.gs());
      }
   }
}
