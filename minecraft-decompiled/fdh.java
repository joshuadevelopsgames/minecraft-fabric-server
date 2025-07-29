import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public interface fdh {
   fdg<dfn> a = new fdg<dfn>() {
      @Override
      public kp<dfn> a() {
         return kq.ap;
      }

      public Stream<dcv> a(dfn $$0) {
         return $$0.b();
      }

      public dfn c() {
         return dfn.a;
      }

      public dfn a(dfn $$0, Stream<dcv> $$1) {
         return dfn.a($$1.toList());
      }
   };
   fdg<dey> b = new fdg<dey>() {
      @Override
      public kp<dey> a() {
         return kq.Q;
      }

      public dey c() {
         return dey.a;
      }

      public Stream<dcv> a(dey $$0) {
         return $$0.b();
      }

      public dey a(dey $$0, Stream<dcv> $$1) {
         dey.a $$2 = new dey.a($$0).a();
         $$1.forEach($$2::a);
         return $$2.d();
      }
   };
   fdg<dez> c = new fdg<dez>() {
      @Override
      public kp<dez> a() {
         return kq.P;
      }

      public dez c() {
         return dez.a;
      }

      public Stream<dcv> a(dez $$0) {
         return $$0.a().stream();
      }

      public dez a(dez $$0, Stream<dcv> $$1) {
         return dez.a($$1.toList());
      }
   };
   Map<kp<?>, fdg<?>> d = Stream.of(a, b, c).collect(Collectors.toMap(fdg::a, $$0 -> (fdg<?>)$$0));
   Codec<fdg<?>> e = mm.am.q().comapFlatMap($$0 -> {
      fdg<?> $$1 = d.get($$0);
      return $$1 != null ? DataResult.success($$1) : DataResult.error(() -> "No items in component");
   }, fdg::a);
}
