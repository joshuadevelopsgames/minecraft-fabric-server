import com.google.common.collect.Lists;
import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public class eww extends euy {
   public static final MapCodec<eww> d = a(eww::new);

   public eww(euy.c $$0) {
      super($$0);
   }

   @Override
   public Optional<euy.b> a(euy.a $$0) {
      dwu $$1 = dwu.a($$0.f());
      jb $$2 = this.a($$0, $$1);
      return $$2.v() < 60 ? Optional.empty() : Optional.of(new euy.b($$2, (Consumer<evq>)($$3 -> this.a($$3, $$2, $$1, $$0))));
   }

   private void a(evq $$0, jb $$1, dwu $$2, euy.a $$3) {
      List<evc> $$4 = Lists.newArrayList();
      ewv.a($$3.e(), $$1, $$2, $$4, $$3.f());
      $$4.forEach($$0::a);
   }

   @Override
   public evh<?> e() {
      return evh.c;
   }
}
