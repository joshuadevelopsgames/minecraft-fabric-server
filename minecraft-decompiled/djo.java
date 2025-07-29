import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import it.unimi.dsi.fastutil.objects.Object2IntMap.Entry;
import java.util.Collections;
import java.util.Optional;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class djo implements dga {
   public static final djo a = new djo(new Object2IntOpenHashMap());
   private static final Codec<Integer> d = Codec.intRange(1, 255);
   public static final Codec<djo> b = Codec.unboundedMap(dji.c, d).xmap($$0 -> new djo(new Object2IntOpenHashMap($$0)), $$0 -> $$0.e);
   public static final zm<wx, djo> c = zm.a(zk.a(Object2IntOpenHashMap::new, dji.d, zk.h), $$0 -> $$0.e, djo::new);
   final Object2IntOpenHashMap<jl<dji>> e;

   djo(Object2IntOpenHashMap<jl<dji>> $$0) {
      this.e = $$0;
      ObjectIterator var2 = $$0.object2IntEntrySet().iterator();

      while (var2.hasNext()) {
         Entry<jl<dji>> $$1 = (Entry<jl<dji>>)var2.next();
         int $$2 = $$1.getIntValue();
         if ($$2 < 0 || $$2 > 255) {
            throw new IllegalArgumentException("Enchantment " + $$1.getKey() + " has invalid level " + $$2);
         }
      }
   }

   public int a(jl<dji> $$0) {
      return this.e.getInt($$0);
   }

   @Override
   public void a(dcr.b $$0, Consumer<xo> $$1, dek $$2, kl $$3) {
      jn.a $$4 = $$0.a();
      jp<dji> $$5 = a($$4, mn.aW, azr.a);

      for (jl<dji> $$6 : $$5) {
         int $$7 = this.e.getInt($$6);
         if ($$7 > 0) {
            $$1.accept(dji.a($$6, $$7));
         }
      }

      ObjectIterator var10 = this.e.object2IntEntrySet().iterator();

      while (var10.hasNext()) {
         Entry<jl<dji>> $$8 = (Entry<jl<dji>>)var10.next();
         jl<dji> $$9 = (jl<dji>)$$8.getKey();
         if (!$$5.a($$9)) {
            $$1.accept(dji.a((jl<dji>)$$8.getKey(), $$8.getIntValue()));
         }
      }
   }

   private static <T> jp<T> a(@Nullable jn.a $$0, amd<jy<T>> $$1, bae<T> $$2) {
      if ($$0 != null) {
         Optional<jp.c<T>> $$3 = $$0.e($$1).a($$2);
         if ($$3.isPresent()) {
            return $$3.get();
         }
      }

      return jp.a();
   }

   public Set<jl<dji>> a() {
      return Collections.unmodifiableSet(this.e.keySet());
   }

   public Set<Entry<jl<dji>>> b() {
      return Collections.unmodifiableSet(this.e.object2IntEntrySet());
   }

   public int c() {
      return this.e.size();
   }

   public boolean d() {
      return this.e.isEmpty();
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         return $$0 instanceof djo $$1 ? this.e.equals($$1.e) : false;
      }
   }

   @Override
   public int hashCode() {
      return this.e.hashCode();
   }

   @Override
   public String toString() {
      return "ItemEnchantments{enchantments=" + this.e + "}";
   }

   public static class a {
      private final Object2IntOpenHashMap<jl<dji>> a = new Object2IntOpenHashMap();

      public a(djo $$0) {
         this.a.putAll($$0.e);
      }

      public void a(jl<dji> $$0, int $$1) {
         if ($$1 <= 0) {
            this.a.removeInt($$0);
         } else {
            this.a.put($$0, Math.min($$1, 255));
         }
      }

      public void b(jl<dji> $$0, int $$1) {
         if ($$1 > 0) {
            this.a.merge($$0, Math.min($$1, 255), Integer::max);
         }
      }

      public void a(Predicate<jl<dji>> $$0) {
         this.a.keySet().removeIf($$0);
      }

      public int a(jl<dji> $$0) {
         return this.a.getOrDefault($$0, 0);
      }

      public Set<jl<dji>> a() {
         return this.a.keySet();
      }

      public djo b() {
         return new djo(this.a);
      }
   }
}
