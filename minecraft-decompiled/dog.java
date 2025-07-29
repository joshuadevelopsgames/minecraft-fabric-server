import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class dog {
   private static final boolean b = false;
   private static final float c = 10000.0F;
   @VisibleForTesting
   protected static final int a = 7;

   public static dog.h a(float $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      return new dog.h(a($$0), a($$1), a($$2), a($$3), a($$4), a($$5));
   }

   public static dog.d a(float $$0, float $$1, float $$2, float $$3, float $$4, float $$5, float $$6) {
      return new dog.d(dog.b.a($$0), dog.b.a($$1), dog.b.a($$2), dog.b.a($$3), dog.b.a($$4), dog.b.a($$5), a($$6));
   }

   public static dog.d a(dog.b $$0, dog.b $$1, dog.b $$2, dog.b $$3, dog.b $$4, dog.b $$5, float $$6) {
      return new dog.d($$0, $$1, $$2, $$3, $$4, $$5, a($$6));
   }

   public static long a(float $$0) {
      return (long)($$0 * 10000.0F);
   }

   public static float a(long $$0) {
      return (float)$$0 / 10000.0F;
   }

   public static dog.f a() {
      ejt $$0 = eju.a();
      return new dog.f($$0, $$0, $$0, $$0, $$0, $$0, List.of());
   }

   public static jb a(List<dog.d> $$0, dog.f $$1) {
      return (new dog.g($$0, $$1)).b.a();
   }

   interface a<T> {
      long distance(dog.e.b<T> var1, long[] var2);
   }

   public record b(long b, long c) {
      public static final Codec<dog.b> a = bbi.a(
         Codec.floatRange(-2.0F, 2.0F),
         "min",
         "max",
         ($$0, $$1) -> $$0.compareTo($$1) > 0
            ? DataResult.error(() -> "Cannon construct interval, min > max (" + $$0 + " > " + $$1 + ")")
            : DataResult.success(new dog.b(dog.a($$0), dog.a($$1))),
         $$0 -> dog.a($$0.a()),
         $$0 -> dog.a($$0.b())
      );

      public static dog.b a(float $$0) {
         return a($$0, $$0);
      }

      public static dog.b a(float $$0, float $$1) {
         if ($$0 > $$1) {
            throw new IllegalArgumentException("min > max: " + $$0 + " " + $$1);
         } else {
            return new dog.b(dog.a($$0), dog.a($$1));
         }
      }

      public static dog.b a(dog.b $$0, dog.b $$1) {
         if ($$0.a() > $$1.b()) {
            throw new IllegalArgumentException("min > max: " + $$0 + " " + $$1);
         } else {
            return new dog.b($$0.a(), $$1.b());
         }
      }

      @Override
      public String toString() {
         return this.b == this.c ? String.format(Locale.ROOT, "%d", this.b) : String.format(Locale.ROOT, "[%d-%d]", this.b, this.c);
      }

      public long a(long $$0) {
         long $$1 = $$0 - this.c;
         long $$2 = this.b - $$0;
         return $$1 > 0L ? $$1 : Math.max($$2, 0L);
      }

      public long a(dog.b $$0) {
         long $$1 = $$0.a() - this.c;
         long $$2 = this.b - $$0.b();
         return $$1 > 0L ? $$1 : Math.max($$2, 0L);
      }

      public dog.b b(@Nullable dog.b $$0) {
         return $$0 == null ? this : new dog.b(Math.min(this.b, $$0.a()), Math.max(this.c, $$0.b()));
      }

      public long a() {
         return this.b;
      }

      public long b() {
         return this.c;
      }
   }

   public static class c<T> {
      private final List<Pair<dog.d, T>> a;
      private final dog.e<T> b;

      public static <T> Codec<dog.c<T>> a(MapCodec<T> $$0) {
         return bbi.b(
               RecordCodecBuilder.create(
                     $$1 -> $$1.group(dog.d.a.fieldOf("parameters").forGetter(Pair::getFirst), $$0.forGetter(Pair::getSecond)).apply($$1, Pair::of)
                  )
                  .listOf()
            )
            .xmap(dog.c::new, dog.c::a);
      }

      public c(List<Pair<dog.d, T>> $$0) {
         this.a = $$0;
         this.b = dog.e.a($$0);
      }

      public List<Pair<dog.d, T>> a() {
         return this.a;
      }

      public T a(dog.h $$0) {
         return this.c($$0);
      }

      @VisibleForTesting
      public T b(dog.h $$0) {
         Iterator<Pair<dog.d, T>> $$1 = this.a().iterator();
         Pair<dog.d, T> $$2 = $$1.next();
         long $$3 = ((dog.d)$$2.getFirst()).a($$0);
         T $$4 = (T)$$2.getSecond();

         while ($$1.hasNext()) {
            Pair<dog.d, T> $$5 = $$1.next();
            long $$6 = ((dog.d)$$5.getFirst()).a($$0);
            if ($$6 < $$3) {
               $$3 = $$6;
               $$4 = (T)$$5.getSecond();
            }
         }

         return $$4;
      }

      public T c(dog.h $$0) {
         return this.a($$0, dog.e.b::a);
      }

      protected T a(dog.h $$0, dog.a<T> $$1) {
         return this.b.a($$0, $$1);
      }
   }

   public record d(dog.b b, dog.b c, dog.b d, dog.b e, dog.b f, dog.b g, long h) {
      public static final Codec<dog.d> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
               dog.b.a.fieldOf("temperature").forGetter($$0x -> $$0x.b),
               dog.b.a.fieldOf("humidity").forGetter($$0x -> $$0x.c),
               dog.b.a.fieldOf("continentalness").forGetter($$0x -> $$0x.d),
               dog.b.a.fieldOf("erosion").forGetter($$0x -> $$0x.e),
               dog.b.a.fieldOf("depth").forGetter($$0x -> $$0x.f),
               dog.b.a.fieldOf("weirdness").forGetter($$0x -> $$0x.g),
               Codec.floatRange(0.0F, 1.0F).fieldOf("offset").xmap(dog::a, dog::a).forGetter($$0x -> $$0x.h)
            )
            .apply($$0, dog.d::new)
      );

      long a(dog.h $$0) {
         return bcb.b(this.b.a($$0.a))
            + bcb.b(this.c.a($$0.b))
            + bcb.b(this.d.a($$0.c))
            + bcb.b(this.e.a($$0.d))
            + bcb.b(this.f.a($$0.e))
            + bcb.b(this.g.a($$0.f))
            + bcb.b(this.h);
      }

      protected List<dog.b> a() {
         return ImmutableList.of(this.b, this.c, this.d, this.e, this.f, this.g, new dog.b(this.h, this.h));
      }
   }

   protected static final class e<T> {
      private static final int a = 6;
      private final dog.e.b<T> b;
      private final ThreadLocal<dog.e.a<T>> c = new ThreadLocal<>();

      private e(dog.e.b<T> $$0) {
         this.b = $$0;
      }

      public static <T> dog.e<T> a(List<Pair<dog.d, T>> $$0) {
         if ($$0.isEmpty()) {
            throw new IllegalArgumentException("Need at least one value to build the search tree.");
         } else {
            int $$1 = ((dog.d)$$0.get(0).getFirst()).a().size();
            if ($$1 != 7) {
               throw new IllegalStateException("Expecting parameter space to be 7, got " + $$1);
            } else {
               List<dog.e.a<T>> $$2 = $$0.stream()
                  .map($$0x -> new dog.e.a<>((dog.d)$$0x.getFirst(), $$0x.getSecond()))
                  .collect(Collectors.toCollection(ArrayList::new));
               return new dog.e<>(a($$1, $$2));
            }
         }
      }

      private static <T> dog.e.b<T> a(int $$0, List<? extends dog.e.b<T>> $$1) {
         if ($$1.isEmpty()) {
            throw new IllegalStateException("Need at least one child to build a node");
         } else if ($$1.size() == 1) {
            return (dog.e.b<T>)$$1.get(0);
         } else if ($$1.size() <= 6) {
            $$1.sort(Comparator.comparingLong($$1x -> {
               long $$2x = 0L;

               for (int $$3x = 0; $$3x < $$0; $$3x++) {
                  dog.b $$4x = $$1x.a[$$3x];
                  $$2x += Math.abs(($$4x.a() + $$4x.b()) / 2L);
               }

               return $$2x;
            }));
            return new dog.e.c<>($$1);
         } else {
            long $$2 = Long.MAX_VALUE;
            int $$3 = -1;
            List<dog.e.c<T>> $$4 = null;

            for (int $$5 = 0; $$5 < $$0; $$5++) {
               a($$1, $$0, $$5, false);
               List<dog.e.c<T>> $$6 = b($$1);
               long $$7 = 0L;

               for (dog.e.c<T> $$8 : $$6) {
                  $$7 += a($$8.a);
               }

               if ($$2 > $$7) {
                  $$2 = $$7;
                  $$3 = $$5;
                  $$4 = $$6;
               }
            }

            a($$4, $$0, $$3, true);
            return new dog.e.c<>($$4.stream().map($$1x -> a($$0, Arrays.asList($$1x.b))).collect(Collectors.toList()));
         }
      }

      private static <T> void a(List<? extends dog.e.b<T>> $$0, int $$1, int $$2, boolean $$3) {
         Comparator<dog.e.b<T>> $$4 = a($$2, $$3);

         for (int $$5 = 1; $$5 < $$1; $$5++) {
            $$4 = $$4.thenComparing(a(($$2 + $$5) % $$1, $$3));
         }

         $$0.sort($$4);
      }

      private static <T> Comparator<dog.e.b<T>> a(int $$0, boolean $$1) {
         return Comparator.comparingLong($$2 -> {
            dog.b $$3 = $$2.a[$$0];
            long $$4 = ($$3.a() + $$3.b()) / 2L;
            return $$1 ? Math.abs($$4) : $$4;
         });
      }

      private static <T> List<dog.e.c<T>> b(List<? extends dog.e.b<T>> $$0) {
         List<dog.e.c<T>> $$1 = Lists.newArrayList();
         List<dog.e.b<T>> $$2 = Lists.newArrayList();
         int $$3 = (int)Math.pow(6.0, Math.floor(Math.log($$0.size() - 0.01) / Math.log(6.0)));

         for (dog.e.b<T> $$4 : $$0) {
            $$2.add($$4);
            if ($$2.size() >= $$3) {
               $$1.add(new dog.e.c<>($$2));
               $$2 = Lists.newArrayList();
            }
         }

         if (!$$2.isEmpty()) {
            $$1.add(new dog.e.c<>($$2));
         }

         return $$1;
      }

      private static long a(dog.b[] $$0) {
         long $$1 = 0L;

         for (dog.b $$2 : $$0) {
            $$1 += Math.abs($$2.b() - $$2.a());
         }

         return $$1;
      }

      static <T> List<dog.b> c(List<? extends dog.e.b<T>> $$0) {
         if ($$0.isEmpty()) {
            throw new IllegalArgumentException("SubTree needs at least one child");
         } else {
            int $$1 = 7;
            List<dog.b> $$2 = Lists.newArrayList();

            for (int $$3 = 0; $$3 < 7; $$3++) {
               $$2.add(null);
            }

            for (dog.e.b<T> $$4 : $$0) {
               for (int $$5 = 0; $$5 < 7; $$5++) {
                  $$2.set($$5, $$4.a[$$5].b($$2.get($$5)));
               }
            }

            return $$2;
         }
      }

      public T a(dog.h $$0, dog.a<T> $$1) {
         long[] $$2 = $$0.a();
         dog.e.a<T> $$3 = this.b.a($$2, this.c.get(), $$1);
         this.c.set($$3);
         return $$3.b;
      }

      static final class a<T> extends dog.e.b<T> {
         final T b;

         a(dog.d $$0, T $$1) {
            super($$0.a());
            this.b = $$1;
         }

         @Override
         protected dog.e.a<T> a(long[] $$0, @Nullable dog.e.a<T> $$1, dog.a<T> $$2) {
            return this;
         }
      }

      abstract static class b<T> {
         protected final dog.b[] a;

         protected b(List<dog.b> $$0) {
            this.a = $$0.toArray(new dog.b[0]);
         }

         protected abstract dog.e.a<T> a(long[] var1, @Nullable dog.e.a<T> var2, dog.a<T> var3);

         protected long a(long[] $$0) {
            long $$1 = 0L;

            for (int $$2 = 0; $$2 < 7; $$2++) {
               $$1 += bcb.b(this.a[$$2].a($$0[$$2]));
            }

            return $$1;
         }

         @Override
         public String toString() {
            return Arrays.toString((Object[])this.a);
         }
      }

      static final class c<T> extends dog.e.b<T> {
         final dog.e.b<T>[] b;

         protected c(List<? extends dog.e.b<T>> $$0) {
            this(dog.e.c($$0), $$0);
         }

         protected c(List<dog.b> $$0, List<? extends dog.e.b<T>> $$1) {
            super($$0);
            this.b = $$1.toArray(new dog.e.b[0]);
         }

         @Override
         protected dog.e.a<T> a(long[] $$0, @Nullable dog.e.a<T> $$1, dog.a<T> $$2) {
            long $$3 = $$1 == null ? Long.MAX_VALUE : $$2.distance($$1, $$0);
            dog.e.a<T> $$4 = $$1;

            for (dog.e.b<T> $$5 : this.b) {
               long $$6 = $$2.distance($$5, $$0);
               if ($$3 > $$6) {
                  dog.e.a<T> $$7 = $$5.a($$0, $$4, $$2);
                  long $$8 = $$5 == $$7 ? $$6 : $$2.distance($$7, $$0);
                  if ($$3 > $$8) {
                     $$3 = $$8;
                     $$4 = $$7;
                  }
               }
            }

            return $$4;
         }
      }
   }

   public record f(ejt a, ejt b, ejt c, ejt d, ejt e, ejt f, List<dog.d> g) {
      public dog.h a(int $$0, int $$1, int $$2) {
         int $$3 = jw.c($$0);
         int $$4 = jw.c($$1);
         int $$5 = jw.c($$2);
         ejt.e $$6 = new ejt.e($$3, $$4, $$5);
         return dog.a((float)this.a.a($$6), (float)this.b.a($$6), (float)this.c.a($$6), (float)this.d.a($$6), (float)this.e.a($$6), (float)this.f.a($$6));
      }

      public jb a() {
         return this.g.isEmpty() ? jb.c : dog.a(this.g, this);
      }

      public ejt b() {
         return this.a;
      }

      public ejt c() {
         return this.b;
      }

      public ejt d() {
         return this.c;
      }

      public ejt e() {
         return this.d;
      }

      public ejt f() {
         return this.e;
      }

      public ejt g() {
         return this.f;
      }

      public List<dog.d> h() {
         return this.g;
      }
   }

   static class g {
      private static final long a = 2048L;
      dog.g.a b;

      g(List<dog.d> $$0, dog.f $$1) {
         this.b = a($$0, $$1, 0, 0);
         this.a($$0, $$1, 2048.0F, 512.0F);
         this.a($$0, $$1, 512.0F, 32.0F);
      }

      private void a(List<dog.d> $$0, dog.f $$1, float $$2, float $$3) {
         float $$4 = 0.0F;
         float $$5 = $$3;
         jb $$6 = this.b.a();

         while ($$5 <= $$2) {
            int $$7 = $$6.u() + (int)(Math.sin($$4) * $$5);
            int $$8 = $$6.w() + (int)(Math.cos($$4) * $$5);
            dog.g.a $$9 = a($$0, $$1, $$7, $$8);
            if ($$9.b() < this.b.b()) {
               this.b = $$9;
            }

            $$4 += $$3 / $$5;
            if ($$4 > Math.PI * 2) {
               $$4 = 0.0F;
               $$5 += $$3;
            }
         }
      }

      private static dog.g.a a(List<dog.d> $$0, dog.f $$1, int $$2, int $$3) {
         dog.h $$4 = $$1.a(jw.a($$2), 0, jw.a($$3));
         dog.h $$5 = new dog.h($$4.b(), $$4.c(), $$4.d(), $$4.e(), 0L, $$4.g());
         long $$6 = Long.MAX_VALUE;

         for (dog.d $$7 : $$0) {
            $$6 = Math.min($$6, $$7.a($$5));
         }

         long $$8 = bcb.b((long)$$2) + bcb.b((long)$$3);
         long $$9 = $$6 * bcb.b(2048L) + $$8;
         return new dog.g.a(new jb($$2, 0, $$3), $$9);
      }

      record a(jb a, long b) {
      }
   }

   public record h(long a, long b, long c, long d, long e, long f) {

      @VisibleForTesting
      protected long[] a() {
         return new long[]{this.a, this.b, this.c, this.d, this.e, this.f, 0L};
      }

      public long b() {
         return this.a;
      }

      public long c() {
         return this.b;
      }

      public long d() {
         return this.c;
      }

      public long e() {
         return this.d;
      }

      public long f() {
         return this.e;
      }

      public long g() {
         return this.f;
      }
   }
}
