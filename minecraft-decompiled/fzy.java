import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class fzy implements gac {
   private static final ame e = ame.b("toast/advancement");
   public static final int a = 5000;
   private final aj f;
   private gac.a g = gac.a.b;

   public fzy(aj $$0) {
      this.f = $$0;
   }

   @Override
   public gac.a a() {
      return this.g;
   }

   @Override
   public void a(gad $$0, long $$1) {
      av $$2 = this.f.b().c().orElse(null);
      if ($$2 == null) {
         this.g = gac.a.b;
      } else {
         this.g = $$1 >= 5000.0 * $$0.h() ? gac.a.b : gac.a.a;
      }
   }

   @Nullable
   @Override
   public ayy b() {
      return this.c() ? ayz.Ca : null;
   }

   private boolean c() {
      Optional<av> $$0 = this.f.b().c();
      return $$0.isPresent() && $$0.get().e().equals(ap.b);
   }

   @Override
   public void a(fxb $$0, fwz $$1, long $$2) {
      av $$3 = this.f.b().c().orElse(null);
      $$0.a(gxx.ar, e, 0, 0, this.e(), this.f());
      if ($$3 != null) {
         List<bbm> $$4 = $$1.c($$3.a(), 125);
         int $$5 = $$3.e() == ap.b ? -30465 : -256;
         if ($$4.size() == 1) {
            $$0.a($$1, $$3.e().b(), 30, 7, $$5, false);
            $$0.a($$1, $$4.get(0), 30, 18, -1, false);
         } else {
            int $$6 = 1500;
            float $$7 = 300.0F;
            if ($$2 < 1500L) {
               int $$8 = bcb.d(bcb.a((float)(1500L - $$2) / 300.0F, 0.0F, 1.0F) * 255.0F);
               $$0.a($$1, $$3.e().b(), 30, 11, baj.c($$8, $$5), false);
            } else {
               int $$9 = bcb.d(bcb.a((float)($$2 - 1500L) / 300.0F, 0.0F, 1.0F) * 252.0F);
               int $$10 = this.f() / 2 - $$4.size() * 9 / 2;

               for (bbm $$11 : $$4) {
                  $$0.a($$1, $$11, 30, $$10, baj.c($$9, -1), false);
                  $$10 += 9;
               }
            }
         }

         $$0.b($$3.c(), 8, 8);
      }
   }
}
