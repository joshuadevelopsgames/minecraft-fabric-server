import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public class exf extends euy {
   public static final bvt<doj.c> d = bvt.<doj.c>b()
      .a(new doj.c(bzv.p, 2, 3), 10)
      .a(new doj.c(bzv.bT, 4, 4), 5)
      .a(new doj.c(bzv.bM, 5, 5), 8)
      .a(new doj.c(bzv.bh, 5, 5), 2)
      .a(new doj.c(bzv.aB, 4, 4), 3)
      .a();
   public static final MapCodec<exf> e = a(exf::new);

   public exf(euy.c $$0) {
      super($$0);
   }

   @Override
   public Optional<euy.b> a(euy.a $$0) {
      dlz $$1 = $$0.h();
      jb $$2 = new jb($$1.d(), 64, $$1.e());
      return Optional.of(new euy.b($$2, (Consumer<evq>)($$1x -> a($$1x, $$0))));
   }

   private static void a(evq $$0, euy.a $$1) {
      exe.q $$2 = new exe.q($$1.f(), $$1.h().a(2), $$1.h().b(2));
      $$0.a($$2);
      $$2.a($$2, $$0, $$1.f());
      List<evc> $$3 = $$2.d;

      while (!$$3.isEmpty()) {
         int $$4 = $$1.f().a($$3.size());
         evc $$5 = $$3.remove($$4);
         $$5.a($$2, $$0, $$1.f());
      }

      $$0.a($$1.f(), 48, 70);
   }

   @Override
   public evh<?> e() {
      return evh.d;
   }
}
