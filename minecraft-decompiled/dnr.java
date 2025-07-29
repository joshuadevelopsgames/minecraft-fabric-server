import com.mojang.datafixers.util.Pair;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.longs.Long2ObjectMaps;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;
import it.unimi.dsi.fastutil.longs.Long2ObjectMap.Entry;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.Predicate;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dnr extends fbx {
   private static final int c = 4;
   private static final Logger d = LogUtils.getLogger();
   private static final Codec<Pair<dlz, auh>> e = Codec.mapPair(dlz.a.fieldOf("chunk_pos"), auh.a).codec();
   public static final Codec<dnr> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(e.listOf().optionalFieldOf("tickets", List.of()).forGetter(dnr::g)).apply($$0, dnr::a)
   );
   public static final fby<dnr> b = new fby<>("chunks", dnr::new, a, bdr.j);
   private final Long2ObjectOpenHashMap<List<auh>> f;
   private final Long2ObjectOpenHashMap<List<auh>> g;
   private LongSet h = new LongOpenHashSet();
   @Nullable
   private dnr.a i;
   @Nullable
   private dnr.a j;

   private dnr(Long2ObjectOpenHashMap<List<auh>> $$0, Long2ObjectOpenHashMap<List<auh>> $$1) {
      this.f = $$0;
      this.g = $$1;
      this.h();
   }

   public dnr() {
      this(new Long2ObjectOpenHashMap(4), new Long2ObjectOpenHashMap());
   }

   private static dnr a(List<Pair<dlz, auh>> $$0) {
      Long2ObjectOpenHashMap<List<auh>> $$1 = new Long2ObjectOpenHashMap();

      for (Pair<dlz, auh> $$2 : $$0) {
         dlz $$3 = (dlz)$$2.getFirst();
         List<auh> $$4 = (List<auh>)$$1.computeIfAbsent($$3.a(), $$0x -> new ObjectArrayList(4));
         $$4.add((auh)$$2.getSecond());
      }

      return new dnr(new Long2ObjectOpenHashMap(4), $$1);
   }

   private List<Pair<dlz, auh>> g() {
      List<Pair<dlz, auh>> $$0 = new ArrayList<>();
      this.a((BiConsumer<dlz, auh>)(($$1, $$2) -> {
         if ($$2.a().e()) {
            $$0.add(new Pair($$1, $$2));
         }
      }));
      return $$0;
   }

   private void a(BiConsumer<dlz, auh> $$0) {
      a($$0, this.f);
      a($$0, this.g);
   }

   private static void a(BiConsumer<dlz, auh> $$0, Long2ObjectOpenHashMap<List<auh>> $$1) {
      ObjectIterator var2 = Long2ObjectMaps.fastIterable($$1).iterator();

      while (var2.hasNext()) {
         Entry<List<auh>> $$2 = (Entry<List<auh>>)var2.next();
         dlz $$3 = new dlz($$2.getLongKey());

         for (auh $$4 : (List)$$2.getValue()) {
            $$0.accept($$3, $$4);
         }
      }
   }

   public void a() {
      ObjectIterator var1 = Long2ObjectMaps.fastIterable(this.g).iterator();

      while (var1.hasNext()) {
         Entry<List<auh>> $$0 = (Entry<List<auh>>)var1.next();

         for (auh $$1 : (List)$$0.getValue()) {
            this.a($$0.getLongKey(), $$1);
         }
      }

      this.g.clear();
   }

   public void a(@Nullable dnr.a $$0) {
      this.i = $$0;
   }

   public void b(@Nullable dnr.a $$0) {
      this.j = $$0;
   }

   public boolean b() {
      return !this.f.isEmpty();
   }

   public List<auh> a(long $$0) {
      return (List<auh>)this.f.getOrDefault($$0, List.of());
   }

   private List<auh> b(long $$0) {
      return (List<auh>)this.f.computeIfAbsent($$0, $$0x -> new ObjectArrayList(4));
   }

   public void a(aui $$0, dlz $$1, int $$2) {
      auh $$3 = new auh($$0, ate.a(atp.b) - $$2);
      this.a($$1.a(), $$3);
   }

   public void a(auh $$0, dlz $$1) {
      this.a($$1.a(), $$0);
   }

   public boolean a(long $$0, auh $$1) {
      List<auh> $$2 = this.b($$0);

      for (auh $$3 : $$2) {
         if (a($$1, $$3)) {
            $$3.c();
            this.e();
            return false;
         }
      }

      int $$4 = a($$2, true);
      int $$5 = a($$2, false);
      $$2.add($$1);
      if ($$1.a().b() && $$1.b() < $$4 && this.j != null) {
         this.j.update($$0, $$1.b(), true);
      }

      if ($$1.a().a() && $$1.b() < $$5 && this.i != null) {
         this.i.update($$0, $$1.b(), true);
      }

      if ($$1.a().equals(aui.f)) {
         this.h.add($$0);
      }

      this.e();
      return true;
   }

   private static boolean a(auh $$0, auh $$1) {
      return $$1.a() == $$0.a() && $$1.b() == $$0.b();
   }

   public int a(long $$0, boolean $$1) {
      return a(this.a($$0), $$1);
   }

   private static int a(List<auh> $$0, boolean $$1) {
      auh $$2 = b($$0, $$1);
      return $$2 == null ? ate.b + 1 : $$2.b();
   }

   @Nullable
   private static auh b(@Nullable List<auh> $$0, boolean $$1) {
      if ($$0 == null) {
         return null;
      } else {
         auh $$2 = null;

         for (auh $$3 : $$0) {
            if ($$2 == null || $$3.b() < $$2.b()) {
               if ($$1 && $$3.a().b()) {
                  $$2 = $$3;
               } else if (!$$1 && $$3.a().a()) {
                  $$2 = $$3;
               }
            }
         }

         return $$2;
      }
   }

   public void b(aui $$0, dlz $$1, int $$2) {
      auh $$3 = new auh($$0, ate.a(atp.b) - $$2);
      this.b($$1.a(), $$3);
   }

   public void b(auh $$0, dlz $$1) {
      this.b($$1.a(), $$0);
   }

   public boolean b(long $$0, auh $$1) {
      List<auh> $$2 = (List<auh>)this.f.get($$0);
      if ($$2 == null) {
         return false;
      } else {
         boolean $$3 = false;
         Iterator<auh> $$4 = $$2.iterator();

         while ($$4.hasNext()) {
            auh $$5 = $$4.next();
            if (a($$1, $$5)) {
               $$4.remove();
               $$3 = true;
               break;
            }
         }

         if (!$$3) {
            return false;
         } else {
            if ($$2.isEmpty()) {
               this.f.remove($$0);
            }

            if ($$1.a().b() && this.j != null) {
               this.j.update($$0, a($$2, true), false);
            }

            if ($$1.a().a() && this.i != null) {
               this.i.update($$0, a($$2, false), false);
            }

            if ($$1.a().equals(aui.f)) {
               this.h();
            }

            this.e();
            return true;
         }
      }
   }

   private void h() {
      this.h = this.a((Predicate<auh>)($$0 -> $$0.a().equals(aui.f)));
   }

   public String b(long $$0, boolean $$1) {
      List<auh> $$2 = this.a($$0);
      auh $$3 = b($$2, $$1);
      return $$3 == null ? "no_ticket" : $$3.toString();
   }

   public void a(atf $$0) {
      this.a(($$1, $$2) -> {
         atd $$3 = $$0.a($$1);
         boolean $$4 = $$3 != null && !$$3.h() && $$2.a().b();
         if ($$4) {
            return false;
         } else {
            $$2.d();
            return $$2.e();
         }
      }, null);
      this.e();
   }

   public void c() {
      this.a(($$0, $$1) -> $$1.a() != aui.i, this.g);
   }

   public void a(BiPredicate<Long, auh> $$0, @Nullable Long2ObjectOpenHashMap<List<auh>> $$1) {
      ObjectIterator<Entry<List<auh>>> $$2 = this.f.long2ObjectEntrySet().fastIterator();
      boolean $$3 = false;

      while ($$2.hasNext()) {
         Entry<List<auh>> $$4 = (Entry<List<auh>>)$$2.next();
         Iterator<auh> $$5 = ((List)$$4.getValue()).iterator();
         long $$6 = $$4.getLongKey();
         boolean $$7 = false;
         boolean $$8 = false;

         while ($$5.hasNext()) {
            auh $$9 = $$5.next();
            if ($$0.test($$6, $$9)) {
               if ($$1 != null) {
                  List<auh> $$10 = (List<auh>)$$1.computeIfAbsent($$6, $$1x -> new ObjectArrayList(((List)$$4.getValue()).size()));
                  $$10.add($$9);
               }

               $$5.remove();
               if ($$9.a().a()) {
                  $$8 = true;
               }

               if ($$9.a().b()) {
                  $$7 = true;
               }

               if ($$9.a().equals(aui.f)) {
                  $$3 = true;
               }
            }
         }

         if ($$8 || $$7) {
            if ($$8 && this.i != null) {
               this.i.update($$6, a((List<auh>)$$4.getValue(), false), false);
            }

            if ($$7 && this.j != null) {
               this.j.update($$6, a((List<auh>)$$4.getValue(), true), false);
            }

            this.e();
            if (((List)$$4.getValue()).isEmpty()) {
               $$2.remove();
            }
         }
      }

      if ($$3) {
         this.h();
      }
   }

   public void a(int $$0, aui $$1) {
      List<Pair<auh, Long>> $$2 = new ArrayList<>();
      ObjectIterator var4 = this.f.long2ObjectEntrySet().iterator();

      while (var4.hasNext()) {
         Entry<List<auh>> $$3 = (Entry<List<auh>>)var4.next();

         for (auh $$4 : (List)$$3.getValue()) {
            if ($$4.a() == $$1) {
               $$2.add(Pair.of($$4, $$3.getLongKey()));
            }
         }
      }

      for (Pair<auh, Long> $$5 : $$2) {
         Long $$6 = (Long)$$5.getSecond();
         auh $$7 = (auh)$$5.getFirst();
         this.b($$6, $$7);
         aui $$8 = $$7.a();
         this.a($$6.longValue(), new auh($$8, $$0));
      }
   }

   public boolean a(dlz $$0, boolean $$1) {
      auh $$2 = new auh(aui.f, atf.c);
      return $$1 ? this.a($$0.a(), $$2) : this.b($$0.a(), $$2);
   }

   public LongSet d() {
      return this.h;
   }

   private LongSet a(Predicate<auh> $$0) {
      LongOpenHashSet $$1 = new LongOpenHashSet();
      ObjectIterator var3 = Long2ObjectMaps.fastIterable(this.f).iterator();

      while (var3.hasNext()) {
         Entry<List<auh>> $$2 = (Entry<List<auh>>)var3.next();

         for (auh $$3 : (List)$$2.getValue()) {
            if ($$0.test($$3)) {
               $$1.add($$2.getLongKey());
               break;
            }
         }
      }

      return $$1;
   }

   @FunctionalInterface
   public interface a {
      void update(long var1, int var3, boolean var4);
   }
}
