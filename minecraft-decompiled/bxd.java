import java.util.List;
import java.util.function.Predicate;

public class bxd {
   public static final String a = "Items";

   public static dcv a(List<dcv> $$0, int $$1, int $$2) {
      return $$1 >= 0 && $$1 < $$0.size() && !$$0.get($$1).f() && $$2 > 0 ? $$0.get($$1).a($$2) : dcv.l;
   }

   public static dcv a(List<dcv> $$0, int $$1) {
      return $$1 >= 0 && $$1 < $$0.size() ? $$0.set($$1, dcv.l) : dcv.l;
   }

   public static void a(fdc $$0, ju<dcv> $$1) {
      a($$0, $$1, true);
   }

   public static void a(fdc $$0, ju<dcv> $$1, boolean $$2) {
      fdc.a<bxk> $$3 = $$0.a("Items", bxk.a);

      for (int $$4 = 0; $$4 < $$1.size(); $$4++) {
         dcv $$5 = $$1.get($$4);
         if (!$$5.f()) {
            $$3.a(new bxk($$4, $$5));
         }
      }

      if ($$3.a() && !$$2) {
         $$0.c("Items");
      }
   }

   public static void a(fda $$0, ju<dcv> $$1) {
      for (bxk $$2 : $$0.c("Items", bxk.a)) {
         if ($$2.a($$1.size())) {
            $$1.set($$2.a(), $$2.b());
         }
      }
   }

   public static int a(bxc $$0, Predicate<dcv> $$1, int $$2, boolean $$3) {
      int $$4 = 0;

      for (int $$5 = 0; $$5 < $$0.b(); $$5++) {
         dcv $$6 = $$0.a($$5);
         int $$7 = a($$6, $$1, $$2 - $$4, $$3);
         if ($$7 > 0 && !$$3 && $$6.f()) {
            $$0.a($$5, dcv.l);
         }

         $$4 += $$7;
      }

      return $$4;
   }

   public static int a(dcv $$0, Predicate<dcv> $$1, int $$2, boolean $$3) {
      if ($$0.f() || !$$1.test($$0)) {
         return 0;
      } else if ($$3) {
         return $$0.M();
      } else {
         int $$4 = $$2 < 0 ? $$0.M() : Math.min($$2, $$0.M());
         $$0.h($$4);
         return $$4;
      }
   }
}
