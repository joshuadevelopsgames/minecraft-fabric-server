import java.util.Map;
import java.util.function.Function;

public interface dxh {
   int d = 1;
   int e = 4;
   efb f = eer.V;

   default Function<eeb, fjm> a(eez<jh> $$0, efb $$1) {
      Map<jh, fjm> $$2 = fjj.c(dpz.a(0.0, 0.0, 0.0, 8.0, this.b(), 8.0));
      return $$3 -> {
         fjm $$4 = fjj.a();
         jh $$5 = $$3.c($$0);
         int $$6 = $$3.c($$1);

         for (int $$7 = 0; $$7 < $$6; $$7++) {
            $$4 = fjj.a($$4, $$2.get($$5));
            $$5 = $$5.i();
         }

         return $$4.b();
      };
   }

   default efb c() {
      return f;
   }

   default double b() {
      return 1.0;
   }

   default boolean a(eeb $$0, dgo $$1, efb $$2) {
      return !$$1.h() && $$1.n().a($$0.b().h()) && $$0.c($$2) < 4;
   }

   default eeb a(dgo $$0, dpz $$1, efb $$2, eez<jh> $$3) {
      eeb $$4 = $$0.q().a_($$0.a());
      return $$4.a($$1) ? $$4.b($$2, Math.min(4, $$4.c($$2) + 1)) : $$1.m().b($$3, $$0.g().g());
   }
}
