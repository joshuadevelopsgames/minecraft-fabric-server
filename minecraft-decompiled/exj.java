import com.mojang.serialization.MapCodec;
import java.util.Objects;
import java.util.Optional;

public class exj extends euy {
   public static final MapCodec<exj> d = a(exj::new);

   public exj(euy.c $$0) {
      super($$0);
   }

   @Override
   public Optional<euy.b> a(euy.a $$0) {
      int $$1 = $$0.h().a(9);
      int $$2 = $$0.h().b(9);

      for (jl<dnx> $$4 : $$0.c().a($$1, $$0.b().f(), $$2, 29, $$0.d().b())) {
         if (!$$4.a(azn.X)) {
            return Optional.empty();
         }
      }

      return a($$0, eka.a.c, $$1x -> a($$1x, $$0));
   }

   private static evc a(dlz $$0, ekz $$1) {
      int $$2 = $$0.d() - 29;
      int $$3 = $$0.e() - 29;
      jh $$4 = jh.c.a.a($$1);
      return new exi.h($$1, $$2, $$3, $$4);
   }

   private static void a(evq $$0, euy.a $$1) {
      $$0.a(a($$1.h(), $$1.f()));
   }

   public static evn a(dlz $$0, long $$1, evn $$2) {
      if ($$2.a()) {
         return $$2;
      } else {
         ekz $$3 = new ekz(new ekb(ekp.a()));
         $$3.c($$1, $$0.h, $$0.i);
         evc $$4 = $$2.c().get(0);
         euq $$5 = $$4.f();
         int $$6 = $$5.h();
         int $$7 = $$5.j();
         jh $$8 = jh.c.a.a($$3);
         jh $$9 = Objects.requireNonNullElse($$4.i(), $$8);
         evc $$10 = new exi.h($$3, $$6, $$7, $$9);
         evq $$11 = new evq();
         $$11.a($$10);
         return $$11.a();
      }
   }

   @Override
   public evh<?> e() {
      return evh.j;
   }
}
