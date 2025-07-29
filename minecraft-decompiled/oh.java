import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.mojang.serialization.JsonOps;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.function.Supplier;

public class oh implements mt {
   private final mv d;
   private final Map<String, Supplier<JsonElement>> e = new HashMap<>();

   public oh(mv $$0) {
      this.d = $$0;
   }

   public <T> oh a(awo<T> $$0, T $$1) {
      this.e.put($$0.a(), () -> ((JsonElement)$$0.b().encodeStart(JsonOps.INSTANCE, $$1).getOrThrow(IllegalArgumentException::new)).getAsJsonObject());
      return this;
   }

   @Override
   public CompletableFuture<?> a(mr $$0) {
      JsonObject $$1 = new JsonObject();
      this.e.forEach(($$1x, $$2) -> $$1.add($$1x, $$2.get()));
      return mt.a($$0, $$1, this.d.a().resolve("pack.mcmeta"));
   }

   @Override
   public final String a() {
      return "Pack Metadata";
   }

   public static oh a(mv $$0, xo $$1) {
      return new oh($$0).a(awp.b, new awp($$1, u.a.a(awd.b), Optional.empty()));
   }

   public static oh a(mv $$0, xo $$1, cyd $$2) {
      return a($$0, $$1).a(avx.a, new avx($$2));
   }
}
