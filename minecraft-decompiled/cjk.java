import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import it.unimi.dsi.fastutil.objects.Object2IntMap.Entry;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.function.DoublePredicate;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class cjk {
   public static final Codec<cjk> a = cjk.b.a.listOf().xmap(cjk::new, $$0 -> $$0.e().toList());
   public static final int b = 2;
   private final Map<UUID, cjk.a> c = new HashMap<>();

   public cjk() {
   }

   private cjk(List<cjk.b> $$0) {
      $$0.forEach($$0x -> this.a($$0x.b).a.put($$0x.c, $$0x.d));
   }

   @bdl
   public Map<UUID, Object2IntMap<cjl>> a() {
      Map<UUID, Object2IntMap<cjl>> $$0 = Maps.newHashMap();
      this.c.keySet().forEach($$1 -> {
         cjk.a $$2 = this.c.get($$1);
         $$0.put($$1, $$2.a);
      });
      return $$0;
   }

   public void b() {
      Iterator<cjk.a> $$0 = this.c.values().iterator();

      while ($$0.hasNext()) {
         cjk.a $$1 = $$0.next();
         $$1.a();
         if ($$1.b()) {
            $$0.remove();
         }
      }
   }

   private Stream<cjk.b> e() {
      return this.c.entrySet().stream().flatMap($$0 -> $$0.getValue().a($$0.getKey()));
   }

   private Collection<cjk.b> a(bck $$0, int $$1) {
      List<cjk.b> $$2 = this.e().toList();
      if ($$2.isEmpty()) {
         return Collections.emptyList();
      } else {
         int[] $$3 = new int[$$2.size()];
         int $$4 = 0;

         for (int $$5 = 0; $$5 < $$2.size(); $$5++) {
            cjk.b $$6 = $$2.get($$5);
            $$4 += Math.abs($$6.a());
            $$3[$$5] = $$4 - 1;
         }

         Set<cjk.b> $$7 = Sets.newIdentityHashSet();

         for (int $$8 = 0; $$8 < $$1; $$8++) {
            int $$9 = $$0.a($$4);
            int $$10 = Arrays.binarySearch($$3, $$9);
            $$7.add($$2.get($$10 < 0 ? -$$10 - 1 : $$10));
         }

         return $$7;
      }
   }

   private cjk.a a(UUID $$0) {
      return this.c.computeIfAbsent($$0, $$0x -> new cjk.a());
   }

   public void a(cjk $$0, bck $$1, int $$2) {
      Collection<cjk.b> $$3 = $$0.a($$1, $$2);
      $$3.forEach($$0x -> {
         int $$1x = $$0x.d - $$0x.c.m;
         if ($$1x >= 2) {
            this.a($$0x.b).a.mergeInt($$0x.c, $$1x, cjk::a);
         }
      });
   }

   public int a(UUID $$0, Predicate<cjl> $$1) {
      cjk.a $$2 = this.c.get($$0);
      return $$2 != null ? $$2.a($$1) : 0;
   }

   public long a(cjl $$0, DoublePredicate $$1) {
      return this.c.values().stream().filter($$2 -> $$1.test($$2.a.getOrDefault($$0, 0) * $$0.j)).count();
   }

   public void a(UUID $$0, cjl $$1, int $$2) {
      cjk.a $$3 = this.a($$0);
      $$3.a.mergeInt($$1, $$2, ($$1x, $$2x) -> this.a($$1, $$1x, $$2x));
      $$3.a($$1);
      if ($$3.b()) {
         this.c.remove($$0);
      }
   }

   public void b(UUID $$0, cjl $$1, int $$2) {
      this.a($$0, $$1, -$$2);
   }

   public void a(UUID $$0, cjl $$1) {
      cjk.a $$2 = this.c.get($$0);
      if ($$2 != null) {
         $$2.b($$1);
         if ($$2.b()) {
            this.c.remove($$0);
         }
      }
   }

   public void a(cjl $$0) {
      Iterator<cjk.a> $$1 = this.c.values().iterator();

      while ($$1.hasNext()) {
         cjk.a $$2 = $$1.next();
         $$2.b($$0);
         if ($$2.b()) {
            $$1.remove();
         }
      }
   }

   public void c() {
      this.c.clear();
   }

   public void a(cjk $$0) {
      $$0.c.forEach(($$0x, $$1) -> this.a($$0x).a.putAll($$1.a));
   }

   private static int a(int $$0, int $$1) {
      return Math.max($$0, $$1);
   }

   private int a(cjl $$0, int $$1, int $$2) {
      int $$3 = $$1 + $$2;
      return $$3 > $$0.k ? Math.max($$0.k, $$1) : $$3;
   }

   public cjk d() {
      cjk $$0 = new cjk();
      $$0.a(this);
      return $$0;
   }

   static class a {
      final Object2IntMap<cjl> a = new Object2IntOpenHashMap();

      public int a(Predicate<cjl> $$0) {
         return this.a
            .object2IntEntrySet()
            .stream()
            .filter($$1 -> $$0.test((cjl)$$1.getKey()))
            .mapToInt($$0x -> $$0x.getIntValue() * ((cjl)$$0x.getKey()).j)
            .sum();
      }

      public Stream<cjk.b> a(UUID $$0) {
         return this.a.object2IntEntrySet().stream().map($$1 -> new cjk.b($$0, (cjl)$$1.getKey(), $$1.getIntValue()));
      }

      public void a() {
         ObjectIterator<Entry<cjl>> $$0 = this.a.object2IntEntrySet().iterator();

         while ($$0.hasNext()) {
            Entry<cjl> $$1 = (Entry<cjl>)$$0.next();
            int $$2 = $$1.getIntValue() - ((cjl)$$1.getKey()).l;
            if ($$2 < 2) {
               $$0.remove();
            } else {
               $$1.setValue($$2);
            }
         }
      }

      public boolean b() {
         return this.a.isEmpty();
      }

      public void a(cjl $$0) {
         int $$1 = this.a.getInt($$0);
         if ($$1 > $$0.k) {
            this.a.put($$0, $$0.k);
         }

         if ($$1 < 2) {
            this.b($$0);
         }
      }

      public void b(cjl $$0) {
         this.a.removeInt($$0);
      }
   }

   record b(UUID b, cjl c, int d) {
      public static final Codec<cjk.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(kf.a.fieldOf("Target").forGetter(cjk.b::b), cjl.n.fieldOf("Type").forGetter(cjk.b::c), bbi.p.fieldOf("Value").forGetter(cjk.b::d))
            .apply($$0, cjk.b::new)
      );

      public int a() {
         return this.d * this.c.j;
      }
   }
}
