import com.mojang.serialization.MapCodec;
import java.util.Optional;

public class ewy extends euy {
   public static final MapCodec<ewy> d = a(ewy::new);

   public ewy(euy.c $$0) {
      super($$0);
   }

   @Override
   public Optional<euy.b> a(euy.a $$0) {
      return a($$0, eka.a.a, $$1 -> this.a($$1, $$0));
   }

   private void a(evq $$0, euy.a $$1) {
      dlz $$2 = $$1.h();
      ekz $$3 = $$1.f();
      jb $$4 = new jb($$2.d(), 90, $$2.e());
      dwu $$5 = dwu.a($$3);
      ewx.a($$1.e(), $$4, $$5, $$0, $$3);
   }

   @Override
   public evh<?> e() {
      return evh.e;
   }
}
