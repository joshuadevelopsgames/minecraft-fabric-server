import com.google.common.collect.Sets;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import it.unimi.dsi.fastutil.objects.Reference2ObjectArrayMap;
import it.unimi.dsi.fastutil.objects.Reference2ObjectMap;
import it.unimi.dsi.fastutil.objects.Reference2ObjectMaps;
import java.util.Optional;
import java.util.Set;
import java.util.Map.Entry;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public final class ko {
   public static final ko a = new ko(Reference2ObjectMaps.emptyMap());
   public static final Codec<ko> b = Codec.dispatchedMap(ko.c.a, ko.c::a).xmap($$0 -> {
      if ($$0.isEmpty()) {
         return a;
      } else {
         Reference2ObjectMap<kp<?>, Optional<?>> $$1 = new Reference2ObjectArrayMap($$0.size());

         for (Entry<ko.c, ?> $$2 : $$0.entrySet()) {
            ko.c $$3 = $$2.getKey();
            if ($$3.c()) {
               $$1.put($$3.b(), Optional.empty());
            } else {
               $$1.put($$3.b(), Optional.of($$2.getValue()));
            }
         }

         return new ko($$1);
      }
   }, $$0 -> {
      Reference2ObjectMap<ko.c, Object> $$1 = new Reference2ObjectArrayMap($$0.e.size());
      ObjectIterator var2 = Reference2ObjectMaps.fastIterable($$0.e).iterator();

      while (var2.hasNext()) {
         Entry<kp<?>, Optional<?>> $$2 = (Entry<kp<?>, Optional<?>>)var2.next();
         kp<?> $$3 = $$2.getKey();
         if (!$$3.d()) {
            Optional<?> $$4 = $$2.getValue();
            if ($$4.isPresent()) {
               $$1.put(new ko.c($$3, false), $$4.get());
            } else {
               $$1.put(new ko.c($$3, true), bdk.a);
            }
         }
      }

      return $$1;
   });
   public static final zm<wx, ko> c = a(new ko.b() {
      @Override
      public <T> zm<wx, T> apply(kp<T> $$0) {
         return $$0.e().a();
      }
   });
   public static final zm<wx, ko> d = a(new ko.b() {
      @Override
      public <T> zm<wx, T> apply(kp<T> $$0) {
         zm<wx, T> $$1 = $$0.e().a();
         return $$1.a(zk.e(Integer.MAX_VALUE));
      }
   });
   private static final String f = "!";
   final Reference2ObjectMap<kp<?>, Optional<?>> e;

   private static zm<wx, ko> a(final ko.b $$0) {
      return new zm<wx, ko>() {
         public ko a(wx $$0x) {
            int $$1 = $$0.l();
            int $$2 = $$0.l();
            if ($$1 == 0 && $$2 == 0) {
               return ko.a;
            } else {
               int $$3 = $$1 + $$2;
               Reference2ObjectMap<kp<?>, Optional<?>> $$4 = new Reference2ObjectArrayMap(Math.min($$3, 65536));

               for (int $$5 = 0; $$5 < $$1; $$5++) {
                  kp<?> $$6 = kp.b.decode($$0);
                  Object $$7 = $$0.apply($$6).decode($$0);
                  $$4.put($$6, Optional.of($$7));
               }

               for (int $$8 = 0; $$8 < $$2; $$8++) {
                  kp<?> $$9 = kp.b.decode($$0);
                  $$4.put($$9, Optional.empty());
               }

               return new ko($$4);
            }
         }

         public void a(wx $$0x, ko $$1) {
            if ($$1.d()) {
               $$0.c(0);
               $$0.c(0);
            } else {
               int $$2 = 0;
               int $$3 = 0;
               ObjectIterator var5 = Reference2ObjectMaps.fastIterable($$1.e).iterator();

               while (var5.hasNext()) {
                  it.unimi.dsi.fastutil.objects.Reference2ObjectMap.Entry<kp<?>, Optional<?>> $$4 = (it.unimi.dsi.fastutil.objects.Reference2ObjectMap.Entry<kp<?>, Optional<?>>)var5.next();
                  if (((Optional)$$4.getValue()).isPresent()) {
                     $$2++;
                  } else {
                     $$3++;
                  }
               }

               $$0.c($$2);
               $$0.c($$3);
               var5 = Reference2ObjectMaps.fastIterable($$1.e).iterator();

               while (var5.hasNext()) {
                  it.unimi.dsi.fastutil.objects.Reference2ObjectMap.Entry<kp<?>, Optional<?>> $$5 = (it.unimi.dsi.fastutil.objects.Reference2ObjectMap.Entry<kp<?>, Optional<?>>)var5.next();
                  Optional<?> $$6 = (Optional<?>)$$5.getValue();
                  if ($$6.isPresent()) {
                     kp<?> $$7 = (kp<?>)$$5.getKey();
                     kp.b.encode($$0, $$7);
                     this.a($$0, $$7, $$6.get());
                  }
               }

               var5 = Reference2ObjectMaps.fastIterable($$1.e).iterator();

               while (var5.hasNext()) {
                  it.unimi.dsi.fastutil.objects.Reference2ObjectMap.Entry<kp<?>, Optional<?>> $$8 = (it.unimi.dsi.fastutil.objects.Reference2ObjectMap.Entry<kp<?>, Optional<?>>)var5.next();
                  if (((Optional)$$8.getValue()).isEmpty()) {
                     kp<?> $$9 = (kp<?>)$$8.getKey();
                     kp.b.encode($$0, $$9);
                  }
               }
            }
         }

         private <T> void a(wx $$0x, kp<T> $$1, Object $$2) {
            $$0.apply($$1).encode($$0, (T)$$2);
         }
      };
   }

   ko(Reference2ObjectMap<kp<?>, Optional<?>> $$0) {
      this.e = $$0;
   }

   public static ko.a a() {
      return new ko.a();
   }

   @Nullable
   public <T> Optional<? extends T> a(kp<? extends T> $$0) {
      return (Optional<? extends T>)this.e.get($$0);
   }

   public Set<Entry<kp<?>, Optional<?>>> b() {
      return this.e.entrySet();
   }

   public int c() {
      return this.e.size();
   }

   public ko a(Predicate<kp<?>> $$0) {
      if (this.d()) {
         return a;
      } else {
         Reference2ObjectMap<kp<?>, Optional<?>> $$1 = new Reference2ObjectArrayMap(this.e);
         $$1.keySet().removeIf($$0);
         return $$1.isEmpty() ? a : new ko($$1);
      }
   }

   public boolean d() {
      return this.e.isEmpty();
   }

   public ko.d e() {
      if (this.d()) {
         return ko.d.a;
      } else {
         kn.a $$0 = kn.a();
         Set<kp<?>> $$1 = Sets.newIdentityHashSet();
         this.e.forEach(($$2, $$3) -> {
            if ($$3.isPresent()) {
               $$0.b($$2, $$3.get());
            } else {
               $$1.add($$2);
            }
         });
         return new ko.d($$0.a(), $$1);
      }
   }

   @Override
   public boolean equals(Object $$0) {
      return this == $$0 ? true : $$0 instanceof ko $$1 && this.e.equals($$1.e);
   }

   @Override
   public int hashCode() {
      return this.e.hashCode();
   }

   @Override
   public String toString() {
      return a(this.e);
   }

   static String a(Reference2ObjectMap<kp<?>, Optional<?>> $$0) {
      StringBuilder $$1 = new StringBuilder();
      $$1.append('{');
      boolean $$2 = true;
      ObjectIterator var3 = Reference2ObjectMaps.fastIterable($$0).iterator();

      while (var3.hasNext()) {
         Entry<kp<?>, Optional<?>> $$3 = (Entry<kp<?>, Optional<?>>)var3.next();
         if ($$2) {
            $$2 = false;
         } else {
            $$1.append(", ");
         }

         Optional<?> $$4 = $$3.getValue();
         if ($$4.isPresent()) {
            $$1.append($$3.getKey());
            $$1.append("=>");
            $$1.append($$4.get());
         } else {
            $$1.append("!");
            $$1.append($$3.getKey());
         }
      }

      $$1.append('}');
      return $$1.toString();
   }

   public static class a {
      private final Reference2ObjectMap<kp<?>, Optional<?>> a = new Reference2ObjectArrayMap();

      a() {
      }

      public <T> ko.a a(kp<T> $$0, T $$1) {
         this.a.put($$0, Optional.of($$1));
         return this;
      }

      public <T> ko.a a(kp<T> $$0) {
         this.a.put($$0, Optional.empty());
         return this;
      }

      public <T> ko.a a(ks<T> $$0) {
         return this.a($$0.a(), $$0.b());
      }

      public ko a() {
         return this.a.isEmpty() ? ko.a : new ko(this.a);
      }
   }

   @FunctionalInterface
   interface b {
      <T> zm<? super wx, T> apply(kp<T> var1);
   }

   record c(kp<?> b, boolean c) {
      public static final Codec<ko.c> a = Codec.STRING.flatXmap($$0 -> {
         boolean $$1 = $$0.startsWith("!");
         if ($$1) {
            $$0 = $$0.substring("!".length());
         }

         ame $$2 = ame.c($$0);
         kp<?> $$3 = mm.am.a($$2);
         if ($$3 == null) {
            return DataResult.error(() -> "No component with type: '" + $$2 + "'");
         } else {
            return $$3.d() ? DataResult.error(() -> "'" + $$2 + "' is not a persistent component") : DataResult.success(new ko.c($$3, $$1));
         }
      }, $$0 -> {
         kp<?> $$1 = $$0.b();
         ame $$2 = mm.am.b($$1);
         return $$2 == null ? DataResult.error(() -> "Unregistered component: " + $$1) : DataResult.success($$0.c() ? "!" + $$2 : $$2.toString());
      });

      public Codec<?> a() {
         return this.c ? Codec.EMPTY.codec() : this.b.c();
      }
   }

   public record d(kn b, Set<kp<?>> c) {
      public static final ko.d a = new ko.d(kn.a, Set.of());

      public kn a() {
         return this.b;
      }

      public Set<kp<?>> b() {
         return this.c;
      }
   }
}
