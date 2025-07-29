import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public record dev(Map<String, String> d) implements dga {
   public static final dev a = new dev(Map.of());
   public static final Codec<dev> b = Codec.unboundedMap(Codec.STRING, Codec.STRING).xmap(dev::new, dev::b);
   private static final zm<ByteBuf, Map<String, String>> e = zk.a(Object2ObjectOpenHashMap::new, zk.p, zk.p);
   public static final zm<ByteBuf, dev> c = e.a(dev::new, dev::b);

   public <T extends Comparable<T>> dev a(efe<T> $$0, T $$1) {
      return new dev(ag.a(this.d, $$0.f(), $$0.b($$1)));
   }

   public <T extends Comparable<T>> dev a(efe<T> $$0, eeb $$1) {
      return this.a($$0, $$1.c($$0));
   }

   @Nullable
   public <T extends Comparable<T>> T a(efe<T> $$0) {
      String $$1 = this.d.get($$0.f());
      return $$1 == null ? null : $$0.b($$1).orElse(null);
   }

   public eeb a(eeb $$0) {
      eec<dpz, eeb> $$1 = $$0.b().l();

      for (Entry<String, String> $$2 : this.d.entrySet()) {
         efe<?> $$3 = $$1.a($$2.getKey());
         if ($$3 != null) {
            $$0 = a($$0, $$3, $$2.getValue());
         }
      }

      return $$0;
   }

   private static <T extends Comparable<T>> eeb a(eeb $$0, efe<T> $$1, String $$2) {
      return $$1.b($$2).map($$2x -> $$0.b($$1, $$2x)).orElse($$0);
   }

   public boolean a() {
      return this.d.isEmpty();
   }

   @Override
   public void a(dcr.b $$0, Consumer<xo> $$1, dek $$2, kl $$3) {
      Integer $$4 = this.a(dpt.c);
      if ($$4 != null) {
         $$1.accept(xo.a("container.beehive.honey", $$4, 5).a(o.h));
      }
   }

   public Map<String, String> b() {
      return this.d;
   }
}
