import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.JsonOps;
import java.io.IOException;
import java.io.Reader;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import org.slf4j.Logger;

public abstract class axs<T> extends axt<Map<ame, T>> {
   private static final Logger a = LogUtils.getLogger();
   private final DynamicOps<JsonElement> b;
   private final Codec<T> c;
   private final alx d;

   protected axs(jn.a $$0, Codec<T> $$1, amd<? extends jy<T>> $$2) {
      this($$0.a(JsonOps.INSTANCE), $$1, alx.a($$2));
   }

   protected axs(Codec<T> $$0, alx $$1) {
      this(JsonOps.INSTANCE, $$0, $$1);
   }

   private axs(DynamicOps<JsonElement> $$0, Codec<T> $$1, alx $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   protected Map<ame, T> a(axo $$0, btt $$1) {
      Map<ame, T> $$2 = new HashMap<>();
      a($$0, this.d, this.b, this.c, $$2);
      return $$2;
   }

   public static <T> void a(axo $$0, amd<? extends jy<T>> $$1, DynamicOps<JsonElement> $$2, Codec<T> $$3, Map<ame, T> $$4) {
      a($$0, alx.a($$1), $$2, $$3, $$4);
   }

   public static <T> void a(axo $$0, alx $$1, DynamicOps<JsonElement> $$2, Codec<T> $$3, Map<ame, T> $$4) {
      for (Entry<ame, axm> $$5 : $$1.a($$0).entrySet()) {
         ame $$6 = $$5.getKey();
         ame $$7 = $$1.b($$6);

         try (Reader $$8 = $$5.getValue().e()) {
            $$3.parse($$2, bcy.a($$8)).ifSuccess($$2x -> {
               if ($$4.putIfAbsent($$7, (T)$$2x) != null) {
                  throw new IllegalStateException("Duplicate data file ignored with ID " + $$7);
               }
            }).ifError($$2x -> a.error("Couldn't parse data file '{}' from '{}': {}", new Object[]{$$7, $$6, $$2x}));
         } catch (IllegalArgumentException | IOException | JsonParseException var14) {
            a.error("Couldn't parse data file '{}' from '{}'", new Object[]{$$7, $$6, var14});
         }
      }
   }
}
