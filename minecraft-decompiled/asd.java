import com.google.common.collect.Maps;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.Map;
import java.util.Optional;
import java.util.function.Supplier;

public interface asd {
   Codec<asd> a = mm.aF.q().dispatch(asd::a, $$0 -> $$0);

   MapCodec<? extends asd> a();

   Optional<xm> a(Map<String, asd.a> var1);

   public interface a {
      String a();

      vi b();

      static Map<String, String> a(Map<String, asd.a> $$0) {
         return Maps.transformValues($$0, asd.a::a);
      }

      static asd.a a(final String $$0) {
         return new asd.a() {
            @Override
            public String a() {
               return $$0;
            }

            @Override
            public vi b() {
               return vg.a($$0);
            }
         };
      }

      static asd.a a(final Supplier<String> $$0) {
         return new asd.a() {
            @Override
            public String a() {
               return $$0.get();
            }

            @Override
            public vi b() {
               return vg.a($$0.get());
            }
         };
      }
   }
}
