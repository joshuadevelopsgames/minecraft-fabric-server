import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Optional;
import javax.annotation.Nullable;

public class dhq {
   private final dhq.a[] a;
   private WeakReference<dht> b = new WeakReference<>(null);

   public dhq(int $$0) {
      this.a = new dhq.a[$$0];
   }

   public Optional<dhr<dhb>> a(aub $$0, dha $$1) {
      if ($$1.b()) {
         return Optional.empty();
      } else {
         this.a($$0);

         for (int $$2 = 0; $$2 < this.a.length; $$2++) {
            dhq.a $$3 = this.a[$$2];
            if ($$3 != null && $$3.a($$1)) {
               this.a($$2);
               return Optional.ofNullable($$3.d());
            }
         }

         return this.a($$1, $$0);
      }
   }

   private void a(aub $$0) {
      dht $$1 = $$0.u();
      if ($$1 != this.b.get()) {
         this.b = new WeakReference<>($$1);
         Arrays.fill(this.a, null);
      }
   }

   private Optional<dhr<dhb>> a(dha $$0, aub $$1) {
      Optional<dhr<dhb>> $$2 = $$1.u().a(dhx.a, $$0, $$1);
      this.a($$0, $$2.orElse(null));
      return $$2;
   }

   private void a(int $$0) {
      if ($$0 > 0) {
         dhq.a $$1 = this.a[$$0];
         System.arraycopy(this.a, 0, this.a, 1, $$0);
         this.a[0] = $$1;
      }
   }

   private void a(dha $$0, @Nullable dhr<dhb> $$1) {
      ju<dcv> $$2 = ju.a($$0.a(), dcv.l);

      for (int $$3 = 0; $$3 < $$0.a(); $$3++) {
         $$2.set($$3, $$0.a($$3).c(1));
      }

      System.arraycopy(this.a, 0, this.a, 1, this.a.length - 1);
      this.a[0] = new dhq.a($$2, $$0.f(), $$0.g(), $$1);
   }

   record a(ju<dcv> a, int b, int c, @Nullable dhr<dhb> d) {
      public boolean a(dha $$0) {
         if (this.b == $$0.f() && this.c == $$0.g()) {
            for (int $$1 = 0; $$1 < this.a.size(); $$1++) {
               if (!dcv.c(this.a.get($$1), $$0.a($$1))) {
                  return false;
               }
            }

            return true;
         } else {
            return false;
         }
      }
   }
}
