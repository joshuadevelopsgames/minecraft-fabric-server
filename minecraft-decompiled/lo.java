import java.util.List;

public class lo extends lm {
   public static final lo c = new lo();

   @Override
   protected dcv a(lk $$0, dcv $$1) {
      return b($$0, $$1) ? $$1 : super.a($$0, $$1);
   }

   public static boolean b(lk $$0, dcv $$1) {
      jb $$2 = $$0.c().a($$0.d().c(dsf.b));
      List<cam> $$3 = $$0.b().a(cam.class, new fin($$2), $$1x -> $$1x.e($$1));
      if ($$3.isEmpty()) {
         return false;
      } else {
         cam $$4 = $$3.getFirst();
         bzw $$5 = $$4.f($$1);
         dcv $$6 = $$1.a(1);
         $$4.a($$5, $$6);
         if ($$4 instanceof cao $$7) {
            $$7.g($$5);
            $$7.gp();
         }

         return true;
      }
   }
}
