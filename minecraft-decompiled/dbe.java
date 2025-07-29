import java.util.List;
import javax.annotation.Nullable;

public class dbe extends dcr {
   private final bzv<? extends cxe> a;

   public dbe(bzv<? extends cxe> $$0, dcr.a $$1) {
      super($$1);
      this.a = $$0;
   }

   @Override
   public bxj a(dmu $$0, cut $$1, bxi $$2) {
      dcv $$3 = $$1.b($$2);
      fiq $$4 = a($$0, $$1, dmb.b.c);
      if ($$4.d() == fiq.a.a) {
         return bxj.e;
      } else {
         fis $$5 = $$1.h(1.0F);
         double $$6 = 5.0;
         List<bzm> $$7 = $$0.a($$1, $$1.cV().b($$5.c(5.0)).g(1.0), bzt.h);
         if (!$$7.isEmpty()) {
            fis $$8 = $$1.bI();

            for (bzm $$9 : $$7) {
               fin $$10 = $$9.cV().g($$9.bV());
               if ($$10.d($$8)) {
                  return bxj.e;
               }
            }
         }

         if ($$4.d() == fiq.a.b) {
            cxe $$11 = this.a($$0, $$4, $$3, $$1);
            if ($$11 == null) {
               return bxj.d;
            } else {
               $$11.v($$1.dP());
               if (!$$0.a($$11, $$11.cV())) {
                  return bxj.d;
               } else {
                  if (!$$0.C) {
                     $$0.b($$11);
                     $$0.a($$1, ejb.t, $$4.g());
                     $$3.a(1, $$1);
                  }

                  $$1.b(azj.c.b(this));
                  return bxj.a;
               }
            }
         } else {
            return bxj.e;
         }
      }
   }

   @Nullable
   private cxe a(dmu $$0, fiq $$1, dcv $$2, cut $$3) {
      cxe $$4 = this.a.a($$0, bzu.m);
      if ($$4 != null) {
         fis $$5 = $$1.g();
         $$4.p($$5.d, $$5.e, $$5.f);
         if ($$0 instanceof aub $$6) {
            bzv.<cxe>a($$6, $$2, $$3).accept($$4);
         }
      }

      return $$4;
   }
}
