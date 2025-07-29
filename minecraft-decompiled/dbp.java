import java.util.Collection;
import javax.annotation.Nullable;

public class dbp extends dcr {
   public dbp(dcr.a $$0) {
      super($$0);
   }

   @Override
   public boolean a(dcv $$0, eeb $$1, dmu $$2, jb $$3, cam $$4) {
      if (!$$2.C && $$4 instanceof cut $$5) {
         this.a($$5, $$1, $$2, $$3, false, $$0);
      }

      return false;
   }

   @Override
   public bxj a(dgq $$0) {
      cut $$1 = $$0.o();
      dmu $$2 = $$0.q();
      if (!$$2.C && $$1 != null) {
         jb $$3 = $$0.a();
         if (!this.a($$1, $$2.a_($$3), $$2, $$3, true, $$0.n())) {
            return bxj.d;
         }
      }

      return bxj.a;
   }

   private boolean a(cut $$0, eeb $$1, dmv $$2, jb $$3, boolean $$4, dcv $$5) {
      if (!$$0.gQ()) {
         return false;
      } else {
         jl<dpz> $$6 = $$1.c();
         eec<dpz, eeb> $$7 = $$6.a().l();
         Collection<efe<?>> $$8 = $$7.d();
         if ($$8.isEmpty()) {
            a($$0, xo.a(this.n + ".empty", $$6.g()));
            return false;
         } else {
            dfh $$9 = $$5.a(kq.X);
            if ($$9 == null) {
               return false;
            } else {
               efe<?> $$10 = $$9.a().get($$6);
               if ($$4) {
                  if ($$10 == null) {
                     $$10 = $$8.iterator().next();
                  }

                  eeb $$11 = a($$1, $$10, $$0.gh());
                  $$2.a($$3, $$11, 18);
                  a($$0, xo.a(this.n + ".update", $$10.f(), a($$11, $$10)));
               } else {
                  $$10 = a($$8, $$10, $$0.gh());
                  $$5.b(kq.X, $$9.a($$6, $$10));
                  a($$0, xo.a(this.n + ".select", $$10.f(), a($$1, $$10)));
               }

               return true;
            }
         }
      }
   }

   private static <T extends Comparable<T>> eeb a(eeb $$0, efe<T> $$1, boolean $$2) {
      return $$0.b($$1, a($$1.a(), $$0.c($$1), $$2));
   }

   private static <T> T a(Iterable<T> $$0, @Nullable T $$1, boolean $$2) {
      return $$2 ? ag.b($$0, $$1) : ag.a($$0, $$1);
   }

   private static void a(cut $$0, xo $$1) {
      ((auc)$$0).b($$1, true);
   }

   private static <T extends Comparable<T>> String a(eeb $$0, efe<T> $$1) {
      return $$1.b($$0.c($$1));
   }
}
