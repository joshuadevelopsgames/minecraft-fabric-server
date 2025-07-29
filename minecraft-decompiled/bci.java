import com.google.common.collect.HashMultimap;
import com.google.common.collect.Multimap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.stream.Collectors;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public interface bci {
   bci a = new bci() {
      @Override
      public bci a(bci.f $$0) {
         return this;
      }

      @Override
      public void a(bci.g $$0) {
      }
   };

   bci a(bci.f var1);

   void a(bci.g var1);

   public static class a implements bci {
      public static final bci.f b = () -> "";
      @Nullable
      private final bci.a c;
      private final bci.f d;
      private final Set<bci.a.a> e;

      public a() {
         this(b);
      }

      public a(bci.f $$0) {
         this.c = null;
         this.e = new LinkedHashSet<>();
         this.d = $$0;
      }

      private a(bci.a $$0, bci.f $$1) {
         this.e = $$0.e;
         this.c = $$0;
         this.d = $$1;
      }

      @Override
      public bci a(bci.f $$0) {
         return new bci.a(this, $$0);
      }

      @Override
      public void a(bci.g $$0) {
         this.e.add(new bci.a.a(this, $$0));
      }

      public boolean a() {
         return this.e.isEmpty();
      }

      public void a(BiConsumer<String, bci.g> $$0) {
         List<bci.f> $$1 = new ArrayList<>();
         StringBuilder $$2 = new StringBuilder();

         for (bci.a.a $$3 : this.e) {
            for (bci.a $$4 = $$3.a; $$4 != null; $$4 = $$4.c) {
               $$1.add($$4.d);
            }

            for (int $$5 = $$1.size() - 1; $$5 >= 0; $$5--) {
               $$2.append($$1.get($$5).get());
            }

            $$0.accept($$2.toString(), $$3.b());
            $$2.setLength(0);
            $$1.clear();
         }
      }

      public String b() {
         Multimap<String, bci.g> $$0 = HashMultimap.create();
         this.a($$0::put);
         return $$0.asMap()
            .entrySet()
            .stream()
            .map($$0x -> " at " + (String)$$0x.getKey() + ": " + ((Collection)$$0x.getValue()).stream().map(bci.g::a).collect(Collectors.joining("; ")))
            .collect(Collectors.joining("\n"));
      }

      public String c() {
         List<bci.f> $$0 = new ArrayList<>();
         bci.a.b $$1 = new bci.a.b(this.d);

         for (bci.a.a $$2 : this.e) {
            for (bci.a $$3 = $$2.a; $$3 != this; $$3 = $$3.c) {
               $$0.add($$3.d);
            }

            bci.a.b $$4 = $$1;

            for (int $$5 = $$0.size() - 1; $$5 >= 0; $$5--) {
               $$4 = $$4.a($$0.get($$5));
            }

            $$0.clear();
            $$4.b.add($$2.b);
         }

         return String.join("\n", $$1.a());
      }

      record a(bci.a a, bci.g b) {
      }

      record b(bci.f a, List<bci.g> b, Map<bci.f, bci.a.b> c) {

         public b(bci.f $$0) {
            this($$0, new ArrayList<>(), new LinkedHashMap<>());
         }

         public bci.a.b a(bci.f $$0) {
            return this.c.computeIfAbsent($$0, bci.a.b::new);
         }

         public List<String> a() {
            int $$0 = this.b.size();
            int $$1 = this.c.size();
            if ($$0 == 0 && $$1 == 0) {
               return List.of();
            } else if ($$0 == 0 && $$1 == 1) {
               List<String> $$2 = new ArrayList<>();
               this.c.forEach(($$1x, $$2x) -> $$2.addAll($$2x.a()));
               $$2.set(0, this.a.get() + $$2.get(0));
               return $$2;
            } else if ($$0 == 1 && $$1 == 0) {
               return List.of(this.a.get() + ": " + this.b.getFirst().a());
            } else {
               List<String> $$3 = new ArrayList<>();
               this.c.forEach(($$1x, $$2) -> $$3.addAll($$2.a()));
               $$3.replaceAll($$0x -> "  " + $$0x);

               for (bci.g $$4 : this.b) {
                  $$3.add("  " + $$4.a());
               }

               $$3.addFirst(this.a.get() + ":");
               return $$3;
            }
         }

         public bci.f b() {
            return this.a;
         }

         public List<bci.g> c() {
            return this.b;
         }

         public Map<bci.f, bci.a.b> d() {
            return this.c;
         }
      }
   }

   public record b(amd<?> a) implements bci.f {
      @Override
      public String get() {
         return "->{" + this.a.a() + "@" + this.a.b() + "}";
      }
   }

   public record c(String a) implements bci.f {
      @Override
      public String get() {
         return "." + this.a;
      }
   }

   public record d(String a, int b) implements bci.f {
      @Override
      public String get() {
         return "." + this.a + "[" + this.b + "]";
      }
   }

   public record e(int a) implements bci.f {
      @Override
      public String get() {
         return "[" + this.a + "]";
      }
   }

   @FunctionalInterface
   public interface f {
      String get();
   }

   public interface g {
      String a();
   }

   public record h(amd<?> a) implements bci.f {
      @Override
      public String get() {
         return "{" + this.a.a() + "@" + this.a.b() + "}";
      }
   }

   public record i(String a) implements bci.f {
      @Override
      public String get() {
         return this.a;
      }
   }

   public static class j extends bci.a implements AutoCloseable {
      private final Logger c;

      public j(Logger $$0) {
         this.c = $$0;
      }

      public j(bci.f $$0, Logger $$1) {
         super($$0);
         this.c = $$1;
      }

      @Override
      public void close() {
         if (!this.a()) {
            this.c.warn("[{}] Serialization errors:\n{}", this.c.getName(), this.c());
         }
      }
   }
}
