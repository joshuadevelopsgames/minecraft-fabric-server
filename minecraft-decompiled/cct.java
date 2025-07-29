import java.util.Map;
import java.util.Optional;
import java.util.function.Function;

public class cct<E extends cam & cud> extends ccd<E> {
   private static final int c = 3;
   private static final int d = 60;
   private final Function<cam, Optional<cdr>> e;
   private final float f;

   public cct(Function<cam, Optional<cdr>> $$0, float $$1, int $$2) {
      super(Map.of(cjo.o, cjp.c, cjo.n, cjp.c, cjo.aQ, cjp.c), $$2);
      this.e = $$0;
      this.f = $$1;
   }

   @Override
   protected boolean a(aub $$0, E $$1) {
      return this.b($$1);
   }

   @Override
   protected boolean a(aub $$0, E $$1, long $$2) {
      return this.b($$1);
   }

   @Override
   protected void d(aub $$0, E $$1, long $$2) {
      this.e.apply($$1).ifPresent($$1x -> ccf.a($$1, $$1x, this.f, 3));
   }

   @Override
   protected void c(aub $$0, E $$1, long $$2) {
      Optional<cdr> $$3 = this.e.apply($$1);
      if (!$$3.isEmpty()) {
         cdr $$4 = $$3.get();
         double $$5 = $$4.a().f($$1.bI());
         if ($$5 < 3.0) {
            dcv $$6 = $$1.n().a(0, 1);
            if (!$$6.f()) {
               a($$1, $$6, a($$4));
               if ($$1 instanceof cno $$7) {
                  cnp.a((cam)$$7).ifPresent($$2x -> this.a($$4, $$6, $$2x));
               }

               $$1.eh().a(cjo.aQ, 60);
            }
         }
      }
   }

   private void a(cdr $$0, dcv $$1, auc $$2) {
      jb $$3 = $$0.b().e();
      aq.ab.a($$2, $$3, $$1);
   }

   private boolean b(E $$0) {
      if ($$0.n().c()) {
         return false;
      } else {
         Optional<cdr> $$1 = this.e.apply($$0);
         return $$1.isPresent();
      }
   }

   private static fis a(cdr $$0) {
      return $$0.a().b(0.0, 1.0, 0.0);
   }

   public static void a(cam $$0, dcv $$1, fis $$2) {
      fis $$3 = new fis(0.2F, 0.3F, 0.2F);
      ccf.a($$0, $$1, $$2, $$3, 0.2F);
      dmu $$4 = $$0.ai();
      if ($$4.ae() % 7L == 0L && $$4.A.j() < 0.9) {
         float $$5 = ag.<Float>a(cno.d, $$4.H_());
         $$4.a(null, $$0, ayz.g, aza.g, 1.0F, $$5);
      }
   }
}
