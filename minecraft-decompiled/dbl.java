import java.util.Optional;
import javax.annotation.Nullable;

public class dbl extends dcr {
   private static final xo a = xo.c("item.minecraft.lodestone_compass");

   public dbl(dcr.a $$0) {
      super($$0);
   }

   @Override
   public boolean d_(dcv $$0) {
      return $$0.c(kq.ah) || super.d_($$0);
   }

   @Override
   public void a(dcv $$0, aub $$1, bzm $$2, @Nullable bzw $$3) {
      dfp $$4 = $$0.a(kq.ah);
      if ($$4 != null) {
         dfp $$5 = $$4.a($$1);
         if ($$5 != $$4) {
            $$0.b(kq.ah, $$5);
         }
      }
   }

   @Override
   public bxj a(dgq $$0) {
      jb $$1 = $$0.a();
      dmu $$2 = $$0.q();
      if (!$$2.a_($$1).a(dqb.pZ)) {
         return super.a($$0);
      } else {
         $$2.a(null, $$1, ayz.px, aza.h, 1.0F, 1.0F);
         cut $$3 = $$0.o();
         dcv $$4 = $$0.n();
         boolean $$5 = !$$3.gc() && $$4.M() == 1;
         dfp $$6 = new dfp(Optional.of(jk.a($$2.aj(), $$1)), true);
         if ($$5) {
            $$4.b(kq.ah, $$6);
         } else {
            dcv $$7 = $$4.a(dcz.sb, 1);
            $$4.a(1, $$3);
            $$7.b(kq.ah, $$6);
            if (!$$3.gs().g($$7)) {
               $$3.a($$7, false);
            }
         }

         return bxj.a;
      }
   }

   @Override
   public xo a(dcv $$0) {
      return $$0.c(kq.ah) ? a : super.a($$0);
   }
}
