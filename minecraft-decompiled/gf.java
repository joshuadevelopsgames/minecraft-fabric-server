import com.mojang.logging.LogUtils;
import java.util.Set;
import java.util.function.Predicate;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class gf implements Predicate<eef> {
   private static final Logger a = LogUtils.getLogger();
   private final eeb b;
   private final Set<efe<?>> c;
   @Nullable
   private final ui d;

   public gf(eeb $$0, Set<efe<?>> $$1, @Nullable ui $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   public eeb a() {
      return this.b;
   }

   public Set<efe<?>> b() {
      return this.c;
   }

   public boolean a(eef $$0) {
      eeb $$1 = $$0.a();
      if (!$$1.a(this.b.b())) {
         return false;
      } else {
         for (efe<?> $$2 : this.c) {
            if ($$1.c($$2) != this.b.c($$2)) {
               return false;
            }
         }

         if (this.d == null) {
            return true;
         } else {
            eaz $$3 = $$0.b();
            return $$3 != null && ux.a(this.d, $$3.b($$0.c().K_()), true);
         }
      }
   }

   public boolean a(aub $$0, jb $$1) {
      return this.a(new eef($$0, $$1, false));
   }

   public boolean a(aub $$0, jb $$1, int $$2) {
      eeb $$3 = ($$2 & 16) != 0 ? this.b : dpz.b(this.b, $$0, $$1);
      if ($$3.l()) {
         $$3 = this.b;
      }

      $$3 = this.a($$3);
      boolean $$4 = false;
      if ($$0.a($$1, $$3, $$2)) {
         $$4 = true;
      }

      if (this.d != null) {
         eaz $$5 = $$0.c_($$1);
         if ($$5 != null) {
            try (bci.j $$6 = new bci.j(a)) {
               jn.a $$7 = $$0.K_();
               bci $$8 = $$6.a($$5.t());
               fcz $$9 = fcz.a($$8.a(() -> "(before)"), $$7);
               $$5.e($$9);
               ui $$10 = $$9.b();
               $$5.b(fcy.a($$6, $$7, this.d));
               fcz $$11 = fcz.a($$8.a(() -> "(after)"), $$7);
               $$5.e($$11);
               ui $$12 = $$11.b();
               if (!$$12.equals($$10)) {
                  $$4 = true;
                  $$5.e();
                  $$0.n().a($$1);
               }
            }
         }
      }

      return $$4;
   }

   private eeb a(eeb $$0) {
      if ($$0 == this.b) {
         return $$0;
      } else {
         for (efe<?> $$1 : this.c) {
            $$0 = a($$0, this.b, $$1);
         }

         return $$0;
      }
   }

   private static <T extends Comparable<T>> eeb a(eeb $$0, eeb $$1, efe<T> $$2) {
      return $$0.c($$2, $$1.c($$2));
   }
}
