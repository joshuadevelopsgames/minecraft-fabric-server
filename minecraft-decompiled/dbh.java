import java.util.List;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class dbh extends ddq {
   public static final int a = 20;
   public static final int b = 15;

   public dbh(dcr.a $$0) {
      super($$0);
   }

   @Override
   public boolean a(dcv $$0, dmu $$1, cam $$2, int $$3) {
      if (!($$2 instanceof cut $$4)) {
         return false;
      } else {
         dcv $$5 = $$4.d($$0);
         if ($$5.f()) {
            return false;
         } else {
            int $$6 = this.a($$0, $$2) - $$3;
            float $$7 = a($$6);
            if ($$7 < 0.1) {
               return false;
            } else {
               List<dcv> $$8 = a($$0, $$5, $$4);
               if ($$1 instanceof aub $$9 && !$$8.isEmpty()) {
                  this.a($$9, $$4, $$4.fH(), $$0, $$8, $$7 * 3.0F, 1.0F, $$7 == 1.0F, null);
               }

               $$1.a(null, $$4.dC(), $$4.dE(), $$4.dI(), ayz.aG, aza.h, 1.0F, 1.0F / ($$1.H_().i() * 0.4F + 1.2F) + $$7 * 0.5F);
               $$4.b(azj.c.b(this));
               return true;
            }
         }
      }
   }

   @Override
   protected void a(cam $$0, cvo $$1, int $$2, float $$3, float $$4, float $$5, @Nullable cam $$6) {
      $$1.a($$0, $$0.dR(), $$0.dP() + $$5, 0.0F, $$3, $$4);
   }

   public static float a(int $$0) {
      float $$1 = $$0 / 20.0F;
      $$1 = ($$1 * $$1 + $$1 * 2.0F) / 3.0F;
      if ($$1 > 1.0F) {
         $$1 = 1.0F;
      }

      return $$1;
   }

   @Override
   public int a(dcv $$0, cam $$1) {
      return 72000;
   }

   @Override
   public dcx b(dcv $$0) {
      return dcx.e;
   }

   @Override
   public bxj a(dmu $$0, cut $$1, bxi $$2) {
      dcv $$3 = $$1.b($$2);
      boolean $$4 = !$$1.d($$3).f();
      if (!$$1.gc() && !$$4) {
         return bxj.d;
      } else {
         $$1.c($$2);
         return bxj.c;
      }
   }

   @Override
   public Predicate<dcv> a() {
      return c;
   }

   @Override
   public int b() {
      return 15;
   }
}
