import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.stream.Stream;

public interface ewk {
   Codec<ewk> b = mm.ah.q().dispatch(ewk::b, Function.identity());

   void a(bck var1, BiConsumer<amd<ewi>, amd<ewi>> var2);

   Stream<amd<ewi>> a();

   static ewj a(String $$0, String $$1) {
      return a(qx.a($$0), qx.a($$1));
   }

   static ewj a(amd<ewi> $$0, amd<ewi> $$1) {
      return new ewj($$0, $$1);
   }

   static ewo a(String $$0, bvt<String> $$1) {
      bvt.a<amd<ewi>> $$2 = bvt.b();
      $$1.d().forEach($$1x -> $$2.a(qx.a((String)$$1x.a()), $$1x.b()));
      return a(qx.a($$0), $$2.a());
   }

   static ewo a(amd<ewi> $$0, bvt<amd<ewi>> $$1) {
      return new ewo($$0, $$1);
   }

   static ewn a(bvt<List<ewk>> $$0) {
      return new ewn($$0);
   }

   MapCodec<? extends ewk> b();
}
