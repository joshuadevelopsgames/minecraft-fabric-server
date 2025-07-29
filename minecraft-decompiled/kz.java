import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public interface kz {
   Codec<Map<kz.b<?>, kz>> b = Codec.dispatchedMap(mm.ao.q(), kz.b::a);
   zm<wx, kz.a<?>> c = zk.a(mn.q).b(kz.a::a, kz.b::c);
   zm<wx, Map<kz.b<?>, kz>> d = c.a(zk.c(64))
      .a($$0 -> $$0.stream().collect(Collectors.toMap(kz.a::a, kz.a::b)), $$0 -> $$0.entrySet().stream().map(kz.a::a).toList());

   static MapCodec<kz.a<?>> a(String $$0) {
      return mm.ao.q().dispatchMap($$0, kz.a::a, kz.b::b);
   }

   boolean a(kl var1);

   public record a<T extends kz>(kz.b<T> a, T b) {
      private static <T extends kz> kz.a<T> a(Entry<kz.b<?>, T> $$0) {
         return new kz.a<>((kz.b<T>)$$0.getKey(), $$0.getValue());
      }
   }

   public static final class b<T extends kz> {
      private final Codec<T> a;
      private final MapCodec<kz.a<T>> b;
      private final zm<wx, kz.a<T>> c;

      public b(Codec<T> $$0) {
         this.a = $$0;
         this.b = RecordCodecBuilder.mapCodec($$1 -> $$1.group($$0.fieldOf("value").forGetter(kz.a::b)).apply($$1, $$0xx -> new kz.a<>(this, (T)$$0xx)));
         this.c = zk.<kz>d($$0).a($$0x -> new kz.a<>(this, (T)$$0x), kz.a::b);
      }

      public Codec<T> a() {
         return this.a;
      }

      public MapCodec<kz.a<T>> b() {
         return this.b;
      }

      public zm<wx, kz.a<T>> c() {
         return this.c;
      }
   }
}
