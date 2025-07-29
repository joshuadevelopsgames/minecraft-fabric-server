import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.objects.Object2ObjectFunction;
import it.unimi.dsi.fastutil.objects.Object2ObjectMap;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Queue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.function.Function;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class huf {
   private static final Logger a = LogUtils.getLogger();
   private final Object2ObjectMap<ame, huf.a> b = new Object2ObjectOpenHashMap();
   private final huf.a c;
   private final Object2ObjectFunction<ame, huf.a> d;
   private final huk.a e;
   private final Queue<huf.a> f = new ArrayDeque<>();

   public huf(Map<ame, huo> $$0, huo $$1) {
      this.c = new huf.a(hub.a, $$1, true);
      this.b.put(hub.a, this.c);
      this.d = $$1x -> {
         ame $$2 = (ame)$$1x;
         huo $$3 = $$0.get($$2);
         if ($$3 == null) {
            a.warn("Missing block model: {}", $$2);
            return this.c;
         } else {
            return this.b($$2, $$3);
         }
      };
      this.e = this::a;
   }

   private static boolean a(huo $$0) {
      return $$0.f() == null;
   }

   private huf.a a(ame $$0) {
      return (huf.a)this.b.computeIfAbsent($$0, this.d);
   }

   private huf.a b(ame $$0, huo $$1) {
      boolean $$2 = a($$1);
      huf.a $$3 = new huf.a($$0, $$1, $$2);
      if (!$$2) {
         this.f.add($$3);
      }

      return $$3;
   }

   public void a(huk $$0) {
      $$0.a(this.e);
   }

   public void a(ame $$0, huo $$1) {
      if (!a($$1)) {
         a.warn("Trying to add non-root special model {}, ignoring", $$0);
      } else {
         huf.a $$2 = (huf.a)this.b.put($$0, this.b($$0, $$1));
         if ($$2 != null) {
            a.warn("Duplicate special model {}", $$0);
         }
      }
   }

   public hul a() {
      return this.c;
   }

   public Map<ame, hul> b() {
      List<huf.a> $$0 = new ArrayList<>();
      this.a($$0);
      b($$0);
      Builder<ame, hul> $$1 = ImmutableMap.builder();
      this.b.forEach(($$1x, $$2) -> {
         if ($$2.l) {
            $$1.put($$1x, $$2);
         } else {
            a.warn("Model {} ignored due to cyclic dependency", $$1x);
         }
      });
      return $$1.build();
   }

   private void a(List<huf.a> $$0) {
      huf.a $$1;
      while (($$1 = this.f.poll()) != null) {
         ame $$2 = Objects.requireNonNull($$1.n.f());
         huf.a $$3 = this.a($$2);
         $$1.m = $$3;
         if ($$3.l) {
            $$1.l = true;
         } else {
            $$0.add($$1);
         }
      }
   }

   private static void b(List<huf.a> $$0) {
      boolean $$1 = true;

      while ($$1) {
         $$1 = false;
         Iterator<huf.a> $$2 = $$0.iterator();

         while ($$2.hasNext()) {
            huf.a $$3 = $$2.next();
            if (Objects.requireNonNull($$3.m).l) {
               $$3.l = true;
               $$2.remove();
               $$1 = true;
            }
         }
      }
   }

   static class a implements hul {
      private static final huf.b<Boolean> c = a(0);
      private static final huf.b<huo.a> d = a(1);
      private static final huf.b<hun> e = a(2);
      private static final huf.b<gzg> f = a(3);
      private static final huf.b<gzk> g = a(4);
      private static final huf.b<hrs> h = a(5);
      private static final huf.b<huj> i = a(6);
      private static final int j = 7;
      private final ame k;
      boolean l;
      @Nullable
      huf.a m;
      final huo n;
      private final AtomicReferenceArray<Object> o = new AtomicReferenceArray<>(7);
      private final Map<hui, huj> p = new ConcurrentHashMap<>();

      private static <T> huf.b<T> a(int $$0) {
         Objects.checkIndex($$0, 7);
         return new huf.b<>($$0);
      }

      a(ame $$0, huo $$1, boolean $$2) {
         this.k = $$0;
         this.n = $$1;
         this.l = $$2;
      }

      @Override
      public huo a() {
         return this.n;
      }

      @Nullable
      @Override
      public hul b() {
         return this.m;
      }

      @Override
      public String debugName() {
         return this.k.toString();
      }

      @Nullable
      private <T> T a(huf.b<T> $$0) {
         return (T)this.o.get($$0.a);
      }

      private <T> T a(huf.b<T> $$0, T $$1) {
         T $$2 = (T)this.o.compareAndExchange($$0.a, null, $$1);
         return $$2 == null ? $$1 : $$2;
      }

      private <T> T a(huf.b<T> $$0, Function<hul, T> $$1) {
         T $$2 = this.a($$0);
         return $$2 != null ? $$2 : this.a($$0, $$1.apply(this));
      }

      @Override
      public boolean c() {
         return this.a(c, hul::b);
      }

      @Override
      public huo.a d() {
         return this.a(d, hul::c);
      }

      @Override
      public gzg e() {
         return this.a(f, hul::e);
      }

      @Override
      public hun f() {
         return this.a(e, hul::d);
      }

      @Override
      public gzk g() {
         return this.a(g, hul::a);
      }

      @Override
      public hrs a(gzk $$0, huc $$1) {
         hrs $$2 = this.a(h);
         return $$2 != null ? $$2 : this.a(h, hul.a($$0, $$1, this));
      }

      private huj b(gzk $$0, huc $$1, hui $$2) {
         huj $$3 = this.a(i);
         return $$3 != null ? $$3 : this.a(i, this.f().bake($$0, $$1, $$2, this));
      }

      @Override
      public huj a(gzk $$0, huc $$1, hui $$2) {
         return $$2 == htu.a ? this.b($$0, $$1, $$2) : this.p.computeIfAbsent($$2, $$2x -> {
            hun $$3 = this.f();
            return $$3.bake($$0, $$1, $$2x, this);
         });
      }
   }

   record b<T>(int a) {
   }
}
