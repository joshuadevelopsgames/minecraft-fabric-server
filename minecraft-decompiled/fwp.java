import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Streams;
import com.google.gson.JsonObject;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.stream.Stream;

public class fwp {
   private final Optional<ame> a;
   private final Set<fws> b;
   private final Optional<String> c;

   public fwp(Optional<ame> $$0, Optional<String> $$1, fws... $$2) {
      this.a = $$0;
      this.c = $$1;
      this.b = ImmutableSet.copyOf($$2);
   }

   public ame a(dpz $$0) {
      return fwo.a($$0, this.c.orElse(""));
   }

   public ame a(dpz $$0, fwr $$1, BiConsumer<ame, fwn> $$2) {
      return this.a(fwo.a($$0, this.c.orElse("")), $$1, $$2);
   }

   public ame a(dpz $$0, String $$1, fwr $$2, BiConsumer<ame, fwn> $$3) {
      return this.a(fwo.a($$0, $$1 + this.c.orElse("")), $$2, $$3);
   }

   public ame b(dpz $$0, String $$1, fwr $$2, BiConsumer<ame, fwn> $$3) {
      return this.a(fwo.a($$0, $$1), $$2, $$3);
   }

   public ame a(dcr $$0, fwr $$1, BiConsumer<ame, fwn> $$2) {
      return this.a(fwo.a($$0, this.c.orElse("")), $$1, $$2);
   }

   public ame a(ame $$0, fwr $$1, BiConsumer<ame, fwn> $$2) {
      Map<fws, ame> $$3 = this.a($$1);
      $$2.accept($$0, () -> {
         JsonObject $$1x = new JsonObject();
         this.a.ifPresent($$1xx -> $$1x.addProperty("parent", $$1xx.toString()));
         if (!$$3.isEmpty()) {
            JsonObject $$2x = new JsonObject();
            $$3.forEach(($$1xx, $$2xx) -> $$2x.addProperty($$1xx.a(), $$2xx.toString()));
            $$1x.add("textures", $$2x);
         }

         return $$1x;
      });
      return $$0;
   }

   private Map<fws, ame> a(fwr $$0) {
      return Streams.concat(new Stream[]{this.b.stream(), $$0.a()}).collect(ImmutableMap.toImmutableMap(Function.identity(), $$0::a));
   }
}
