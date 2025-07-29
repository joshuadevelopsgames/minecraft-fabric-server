import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.mojang.serialization.JsonOps;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.Collection;
import java.util.Optional;

public interface axq {
   axq a = new axq() {
      @Override
      public <T> Optional<T> a(awo<T> $$0) {
         return Optional.empty();
      }
   };
   axg<axq> b = () -> a;

   static axq a(InputStream $$0) throws IOException {
      axq var3;
      try (BufferedReader $$1 = new BufferedReader(new InputStreamReader($$0, StandardCharsets.UTF_8))) {
         final JsonObject $$2 = bbq.a($$1);
         var3 = new axq() {
            @Override
            public <T> Optional<T> a(awo<T> $$0) {
               String $$1x = $$0.a();
               if ($$2.has($$1x)) {
                  T $$2x = (T)$$0.b().parse(JsonOps.INSTANCE, $$2.get($$1x)).getOrThrow(JsonParseException::new);
                  return Optional.of($$2x);
               } else {
                  return Optional.empty();
               }
            }
         };
      }

      return var3;
   }

   <T> Optional<T> a(awo<T> var1);

   default axq a(Collection<awo<?>> $$0) {
      axq.a $$1 = new axq.a();

      for (awo<?> $$2 : $$0) {
         this.a($$1, $$2);
      }

      return $$1.a();
   }

   private <T> void a(axq.a $$0, awo<T> $$1) {
      this.a($$1).ifPresent($$2 -> $$0.a($$1, (T)$$2));
   }

   public static class a {
      private final Builder<awo<?>, Object> a = ImmutableMap.builder();

      public <T> axq.a a(awo<T> $$0, T $$1) {
         this.a.put($$0, $$1);
         return this;
      }

      public axq a() {
         final ImmutableMap<awo<?>, Object> $$0 = this.a.build();
         return $$0.isEmpty() ? axq.a : new axq() {
            @Override
            public <T> Optional<T> a(awo<T> $$0x) {
               return Optional.ofNullable((T)$$0.get($$0));
            }
         };
      }
   }
}
