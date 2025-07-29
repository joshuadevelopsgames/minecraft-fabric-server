import com.google.common.collect.AbstractIterator;
import com.google.common.collect.Streams;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.DataResult.Error;
import com.mojang.serialization.DataResult.Success;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public class fcy implements fda {
   private final bci a;
   private final fdb b;
   private final ui c;

   private fcy(bci $$0, fdb $$1, ui $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public static fda a(bci $$0, jn.a $$1, ui $$2) {
      return new fcy($$0, new fdb($$1, uw.a), $$2);
   }

   public static fda.b a(bci $$0, jn.a $$1, List<ui> $$2) {
      return new fcy.a($$0, new fdb($$1, uw.a), $$2);
   }

   @Override
   public <T> Optional<T> a(String $$0, Codec<T> $$1) {
      vi $$2 = this.c.a($$0);
      if ($$2 == null) {
         return Optional.empty();
      } else {
         return switch ($$1.parse(this.b.a(), $$2)) {
            case Success<T> $$3 -> Optional.of($$3.value());
            case Error<T> $$4 -> {
               this.a.a(new fcy.b($$0, $$2, $$4));
               yield $$4.partialValue();
            }
            default -> throw new MatchException(null, null);
         };
      }
   }

   @Override
   public <T> Optional<T> a(MapCodec<T> $$0) {
      DynamicOps<vi> $$1 = this.b.a();

      return switch ($$1.getMap(this.c).flatMap($$2x -> $$0.decode($$1, $$2x))) {
         case Success<T> $$2 -> Optional.of($$2.value());
         case Error<T> $$3 -> {
            this.a.a(new fcy.d($$3));
            yield $$3.partialValue();
         }
         default -> throw new MatchException(null, null);
      };
   }

   @Nullable
   private <T extends vi> T a(String $$0, vk<T> $$1) {
      vi $$2 = this.c.a($$0);
      if ($$2 == null) {
         return null;
      } else {
         vk<?> $$3 = $$2.c();
         if ($$3 != $$1) {
            this.a.a(new fcy.i($$0, $$1, $$3));
            return null;
         } else {
            return (T)$$2;
         }
      }
   }

   @Nullable
   private uy i(String $$0) {
      vi $$1 = this.c.a($$0);
      if ($$1 == null) {
         return null;
      } else if ($$1 instanceof uy $$2) {
         return $$2;
      } else {
         this.a.a(new fcy.h($$0, $$1.c()));
         return null;
      }
   }

   @Override
   public Optional<fda> a(String $$0) {
      ui $$1 = this.a($$0, ui.b);
      return $$1 != null ? Optional.of(this.a($$0, $$1)) : Optional.empty();
   }

   @Override
   public fda b(String $$0) {
      ui $$1 = this.a($$0, ui.b);
      return $$1 != null ? this.a($$0, $$1) : this.b.c();
   }

   @Override
   public Optional<fda.b> c(String $$0) {
      uo $$1 = this.a($$0, uo.a);
      return $$1 != null ? Optional.of(this.a($$0, this.b, $$1)) : Optional.empty();
   }

   @Override
   public fda.b d(String $$0) {
      uo $$1 = this.a($$0, uo.a);
      return $$1 != null ? this.a($$0, this.b, $$1) : this.b.d();
   }

   @Override
   public <T> Optional<fda.a<T>> b(String $$0, Codec<T> $$1) {
      uo $$2 = this.a($$0, uo.a);
      return $$2 != null ? Optional.of(this.a($$0, $$2, $$1)) : Optional.empty();
   }

   @Override
   public <T> fda.a<T> c(String $$0, Codec<T> $$1) {
      uo $$2 = this.a($$0, uo.a);
      return $$2 != null ? this.a($$0, $$2, $$1) : this.b.e();
   }

   @Override
   public boolean a(String $$0, boolean $$1) {
      uy $$2 = this.i($$0);
      return $$2 != null ? $$2.j() != 0 : $$1;
   }

   @Override
   public byte a(String $$0, byte $$1) {
      uy $$2 = this.i($$0);
      return $$2 != null ? $$2.j() : $$1;
   }

   @Override
   public int a(String $$0, short $$1) {
      uy $$2 = this.i($$0);
      return $$2 != null ? $$2.i() : $$1;
   }

   @Override
   public Optional<Integer> e(String $$0) {
      uy $$1 = this.i($$0);
      return $$1 != null ? Optional.of($$1.h()) : Optional.empty();
   }

   @Override
   public int a(String $$0, int $$1) {
      uy $$2 = this.i($$0);
      return $$2 != null ? $$2.h() : $$1;
   }

   @Override
   public long a(String $$0, long $$1) {
      uy $$2 = this.i($$0);
      return $$2 != null ? $$2.g() : $$1;
   }

   @Override
   public Optional<Long> f(String $$0) {
      uy $$1 = this.i($$0);
      return $$1 != null ? Optional.of($$1.g()) : Optional.empty();
   }

   @Override
   public float a(String $$0, float $$1) {
      uy $$2 = this.i($$0);
      return $$2 != null ? $$2.l() : $$1;
   }

   @Override
   public double a(String $$0, double $$1) {
      uy $$2 = this.i($$0);
      return $$2 != null ? $$2.k() : $$1;
   }

   @Override
   public Optional<String> g(String $$0) {
      vg $$1 = this.a($$0, vg.a);
      return $$1 != null ? Optional.of($$1.k()) : Optional.empty();
   }

   @Override
   public String a(String $$0, String $$1) {
      vg $$2 = this.a($$0, vg.a);
      return $$2 != null ? $$2.k() : $$1;
   }

   @Override
   public Optional<int[]> h(String $$0) {
      um $$1 = this.a($$0, um.a);
      return $$1 != null ? Optional.of($$1.g()) : Optional.empty();
   }

   @Override
   public jn.a a() {
      return this.b.b();
   }

   private fda a(String $$0, ui $$1) {
      return (fda)($$1.j() ? this.b.c() : new fcy(this.a.a(new bci.c($$0)), this.b, $$1));
   }

   static fda a(bci $$0, fdb $$1, ui $$2) {
      return (fda)($$2.j() ? $$1.c() : new fcy($$0, $$1, $$2));
   }

   private fda.b a(String $$0, fdb $$1, uo $$2) {
      return (fda.b)($$2.isEmpty() ? $$1.d() : new fcy.e(this.a, $$0, $$1, $$2));
   }

   private <T> fda.a<T> a(String $$0, uo $$1, Codec<T> $$2) {
      return (fda.a<T>)($$1.isEmpty() ? this.b.e() : new fcy.f<>(this.a, $$0, this.b, $$2, $$1));
   }

   static class a implements fda.b {
      private final bci a;
      private final fdb b;
      private final List<ui> c;

      public a(bci $$0, fdb $$1, List<ui> $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      fda a(int $$0, ui $$1) {
         return fcy.a(this.a.a(new bci.e($$0)), this.b, $$1);
      }

      @Override
      public boolean a() {
         return this.c.isEmpty();
      }

      @Override
      public Stream<fda> b() {
         return Streams.mapWithIndex(this.c.stream(), ($$0, $$1) -> this.a((int)$$1, $$0));
      }

      @Override
      public Iterator<fda> iterator() {
         final ListIterator<ui> $$0 = this.c.listIterator();
         return new AbstractIterator<fda>() {
            @Nullable
            protected fda a() {
               if ($$0.hasNext()) {
                  int $$0x = $$0.nextIndex();
                  ui $$1 = $$0.next();
                  return a.this.a($$0x, $$1);
               } else {
                  return (fda)this.endOfData();
               }
            }
         };
      }
   }

   public record b(String a, vi b, Error<?> c) implements bci.g {
      @Override
      public String a() {
         return "Failed to decode value '" + this.b + "' from field '" + this.a + "': " + this.c.message();
      }

      public String b() {
         return this.a;
      }

      public vi c() {
         return this.b;
      }

      public Error<?> d() {
         return this.c;
      }
   }

   public record c(String a, int b, vi c, Error<?> d) implements bci.g {
      @Override
      public String a() {
         return "Failed to decode value '" + this.c + "' from field '" + this.a + "' at index " + this.b + "': " + this.d.message();
      }

      public String b() {
         return this.a;
      }

      public int c() {
         return this.b;
      }

      public vi d() {
         return this.c;
      }

      public Error<?> e() {
         return this.d;
      }
   }

   public record d(Error<?> a) implements bci.g {
      @Override
      public String a() {
         return "Failed to decode from map: " + this.a.message();
      }

      public Error<?> b() {
         return this.a;
      }
   }

   static class e implements fda.b {
      private final bci a;
      private final String b;
      final fdb c;
      private final uo d;

      e(bci $$0, String $$1, fdb $$2, uo $$3) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
      }

      @Override
      public boolean a() {
         return this.d.isEmpty();
      }

      bci a(int $$0) {
         return this.a.a(new bci.d(this.b, $$0));
      }

      void a(int $$0, vi $$1) {
         this.a.a(new fcy.g(this.b, $$0, ui.b, $$1.c()));
      }

      @Override
      public Stream<fda> b() {
         return Streams.mapWithIndex(this.d.stream(), ($$0, $$1) -> {
            if ($$0 instanceof ui $$2) {
               return fcy.a(this.a((int)$$1), this.c, $$2);
            } else {
               this.a((int)$$1, $$0);
               return null;
            }
         }).filter(Objects::nonNull);
      }

      @Override
      public Iterator<fda> iterator() {
         final Iterator<vi> $$0 = this.d.iterator();
         return new AbstractIterator<fda>() {
            private int c;

            @Nullable
            protected fda a() {
               while ($$0.hasNext()) {
                  vi $$0x = $$0.next();
                  int $$1 = this.c++;
                  if ($$0x instanceof ui $$2) {
                     return fcy.a(e.this.a($$1), e.this.c, $$2);
                  }

                  e.this.a($$1, $$0x);
               }

               return (fda)this.endOfData();
            }
         };
      }
   }

   static class f<T> implements fda.a<T> {
      private final bci a;
      private final String b;
      final fdb c;
      final Codec<T> d;
      private final uo e;

      f(bci $$0, String $$1, fdb $$2, Codec<T> $$3, uo $$4) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
         this.e = $$4;
      }

      @Override
      public boolean a() {
         return this.e.isEmpty();
      }

      void a(int $$0, vi $$1, Error<?> $$2) {
         this.a.a(new fcy.c(this.b, $$0, $$1, $$2));
      }

      @Override
      public Stream<T> b() {
         return Streams.mapWithIndex(this.e.stream(), ($$0, $$1) -> {
            return switch (this.d.parse(this.c.a(), $$0)) {
               case Success<T> $$4 -> (Object)$$4.value();
               case Error<T> $$5 -> {
                  this.a((int)$$1, $$0, $$5);
                  yield $$5.partialValue().orElse(null);
               }
               default -> throw new MatchException(null, null);
            };
         }).filter(Objects::nonNull);
      }

      @Override
      public Iterator<T> iterator() {
         final ListIterator<vi> $$0 = this.e.listIterator();
         return new AbstractIterator<T>() {
            @Nullable
            protected T computeNext() {
               while ($$0.hasNext()) {
                  int $$0x = $$0.nextIndex();
                  vi $$1 = $$0.next();
                  switch (f.this.d.parse(f.this.c.a(), $$1)) {
                     case Success<T> $$2:
                        return (T)$$2.value();
                     case Error<T> $$3:
                        f.this.a($$0x, $$1, $$3);
                        if (!$$3.partialValue().isPresent()) {
                           break;
                        }

                        return (T)$$3.partialValue().get();
                     default:
                        throw new MatchException(null, null);
                  }
               }

               return (T)this.endOfData();
            }
         };
      }
   }

   public record g(String a, int b, vk<?> c, vk<?> d) implements bci.g {
      @Override
      public String a() {
         return "Expected list '" + this.a + "' to contain at index " + this.b + " value of type " + this.c.a() + ", but got " + this.d.a();
      }

      public String b() {
         return this.a;
      }

      public int c() {
         return this.b;
      }

      public vk<?> d() {
         return this.c;
      }

      public vk<?> e() {
         return this.d;
      }
   }

   public record h(String a, vk<?> b) implements bci.g {
      @Override
      public String a() {
         return "Expected field '" + this.a + "' to contain number, but got " + this.b.a();
      }

      public String b() {
         return this.a;
      }

      public vk<?> c() {
         return this.b;
      }
   }

   public record i(String a, vk<?> b, vk<?> c) implements bci.g {
      @Override
      public String a() {
         return "Expected field '" + this.a + "' to contain value of type " + this.b.a() + ", but got " + this.c.a();
      }

      public String b() {
         return this.a;
      }

      public vk<?> c() {
         return this.b;
      }

      public vk<?> d() {
         return this.c;
      }
   }
}
