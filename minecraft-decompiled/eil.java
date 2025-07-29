import it.unimi.dsi.fastutil.longs.Long2ObjectFunction;
import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.longs.LongAVLTreeSet;
import it.unimi.dsi.fastutil.longs.LongIterator;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;
import it.unimi.dsi.fastutil.longs.LongSortedSet;
import java.util.Objects;
import java.util.Spliterators;
import java.util.PrimitiveIterator.OfLong;
import java.util.stream.LongStream;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;
import javax.annotation.Nullable;

public class eil<T extends eig> {
   public static final int a = 2;
   public static final int b = 4;
   private final Class<T> c;
   private final Long2ObjectFunction<eiv> d;
   private final Long2ObjectMap<eik<T>> e = new Long2ObjectOpenHashMap();
   private final LongSortedSet f = new LongAVLTreeSet();

   public eil(Class<T> $$0, Long2ObjectFunction<eiv> $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   public void a(fin $$0, bak<eik<T>> $$1) {
      int $$2 = ke.a($$0.a - 2.0);
      int $$3 = ke.a($$0.b - 4.0);
      int $$4 = ke.a($$0.c - 2.0);
      int $$5 = ke.a($$0.d + 2.0);
      int $$6 = ke.a($$0.e + 0.0);
      int $$7 = ke.a($$0.f + 2.0);

      for (int $$8 = $$2; $$8 <= $$5; $$8++) {
         long $$9 = ke.b($$8, 0, 0);
         long $$10 = ke.b($$8, -1, -1);
         LongIterator $$11 = this.f.subSet($$9, $$10 + 1L).iterator();

         while ($$11.hasNext()) {
            long $$12 = $$11.nextLong();
            int $$13 = ke.c($$12);
            int $$14 = ke.d($$12);
            if ($$13 >= $$3 && $$13 <= $$6 && $$14 >= $$4 && $$14 <= $$7) {
               eik<T> $$15 = (eik<T>)this.e.get($$12);
               if ($$15 != null && !$$15.a() && $$15.c().b() && $$1.accept($$15).a()) {
                  return;
               }
            }
         }
      }
   }

   public LongStream a(long $$0) {
      int $$1 = dlz.a($$0);
      int $$2 = dlz.b($$0);
      LongSortedSet $$3 = this.a($$1, $$2);
      if ($$3.isEmpty()) {
         return LongStream.empty();
      } else {
         OfLong $$4 = $$3.iterator();
         return StreamSupport.longStream(Spliterators.spliteratorUnknownSize($$4, 1301), false);
      }
   }

   private LongSortedSet a(int $$0, int $$1) {
      long $$2 = ke.b($$0, 0, $$1);
      long $$3 = ke.b($$0, -1, $$1);
      return this.f.subSet($$2, $$3 + 1L);
   }

   public Stream<eik<T>> b(long $$0) {
      return this.a($$0).<eik<T>>mapToObj(this.e::get).filter(Objects::nonNull);
   }

   private static long f(long $$0) {
      return dlz.c(ke.b($$0), ke.d($$0));
   }

   public eik<T> c(long $$0) {
      return (eik<T>)this.e.computeIfAbsent($$0, this::g);
   }

   @Nullable
   public eik<T> d(long $$0) {
      return (eik<T>)this.e.get($$0);
   }

   private eik<T> g(long $$0) {
      long $$1 = f($$0);
      eiv $$2 = (eiv)this.d.get($$1);
      this.f.add($$0);
      return new eik<>(this.c, $$2);
   }

   public LongSet a() {
      LongSet $$0 = new LongOpenHashSet();
      this.e.keySet().forEach($$1 -> $$0.add(f($$1)));
      return $$0;
   }

   public void b(fin $$0, bak<T> $$1) {
      this.a($$0, $$2 -> $$2.a($$0, $$1));
   }

   public <U extends T> void a(ein<T, U> $$0, fin $$1, bak<U> $$2) {
      this.a($$1, $$3 -> $$3.a($$0, $$1, $$2));
   }

   public void e(long $$0) {
      this.e.remove($$0);
      this.f.remove($$0);
   }

   @bdl
   public int b() {
      return this.f.size();
   }
}
