import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Multimap;
import com.google.common.collect.ImmutableMultimap.Builder;
import java.util.Collection;
import java.util.Map;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public class dhu {
   public static final dhu a = new dhu(ImmutableMultimap.of(), Map.of());
   private final Multimap<dhx<?>, dhr<?>> b;
   private final Map<amd<dhm<?>>, dhr<?>> c;

   private dhu(Multimap<dhx<?>, dhr<?>> $$0, Map<amd<dhm<?>>, dhr<?>> $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public static dhu a(Iterable<dhr<?>> $$0) {
      Builder<dhx<?>, dhr<?>> $$1 = ImmutableMultimap.builder();
      com.google.common.collect.ImmutableMap.Builder<amd<dhm<?>>, dhr<?>> $$2 = ImmutableMap.builder();

      for (dhr<?> $$3 : $$0) {
         $$1.put($$3.b().b(), $$3);
         $$2.put($$3.a(), $$3);
      }

      return new dhu($$1.build(), $$2.build());
   }

   public <I extends dhs, T extends dhm<I>> Collection<dhr<T>> a(dhx<T> $$0) {
      return this.b.get($$0);
   }

   public Collection<dhr<?>> a() {
      return this.c.values();
   }

   @Nullable
   public dhr<?> a(amd<dhm<?>> $$0) {
      return this.c.get($$0);
   }

   public <I extends dhs, T extends dhm<I>> Stream<dhr<T>> a(dhx<T> $$0, I $$1, dmu $$2) {
      return $$1.b() ? Stream.empty() : this.a($$0).stream().filter($$2x -> $$2x.b().a($$1, $$2));
   }
}
