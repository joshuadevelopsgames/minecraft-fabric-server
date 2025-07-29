import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public class exr extends euy {
   public static final MapCodec<exr> d = a(exr::new);

   public exr(euy.c $$0) {
      super($$0);
   }

   @Override
   public Optional<euy.b> a(euy.a $$0) {
      return Optional.of(new euy.b($$0.h().l(), (Consumer<evq>)($$1 -> a($$1, $$0))));
   }

   private static void a(evq $$0, euy.a $$1) {
      int $$2 = 0;

      exq.m $$3;
      do {
         $$0.b();
         $$1.f().c($$1.g() + $$2++, $$1.h().h, $$1.h().i);
         exq.a();
         $$3 = new exq.m($$1.f(), $$1.h().a(2), $$1.h().b(2));
         $$0.a($$3);
         $$3.a($$3, $$0, $$1.f());
         List<evc> $$4 = $$3.c;

         while (!$$4.isEmpty()) {
            int $$5 = $$1.f().a($$4.size());
            evc $$6 = $$4.remove($$5);
            $$6.a($$3, $$0, $$1.f());
         }

         $$0.a($$1.b().f(), $$1.b().g(), $$1.f(), 10);
      } while ($$0.c() || $$3.b == null);
   }

   @Override
   public evh<?> e() {
      return evh.n;
   }
}
