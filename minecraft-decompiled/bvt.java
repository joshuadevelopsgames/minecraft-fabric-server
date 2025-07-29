import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Function;
import javax.annotation.Nullable;

public final class bvt<E> {
   private static final int a = 64;
   private final int b;
   private final List<bvs<E>> c;
   @Nullable
   private final bvt.d<E> d;

   bvt(List<? extends bvs<E>> $$0) {
      this.c = List.copyOf($$0);
      this.b = bvu.a($$0, bvs::b);
      if (this.b == 0) {
         this.d = null;
      } else if (this.b < 64) {
         this.d = new bvt.c<>(this.c, this.b);
      } else {
         this.d = new bvt.b<>(this.c);
      }
   }

   public static <E> bvt<E> a() {
      return new bvt<>(List.of());
   }

   public static <E> bvt<E> a(E $$0) {
      return new bvt<>(List.of(new bvs<>($$0, 1)));
   }

   @SafeVarargs
   public static <E> bvt<E> a(bvs<E>... $$0) {
      return new bvt<>(List.of($$0));
   }

   public static <E> bvt<E> a(List<bvs<E>> $$0) {
      return new bvt<>($$0);
   }

   public static <E> bvt.a<E> b() {
      return new bvt.a<>();
   }

   public boolean c() {
      return this.c.isEmpty();
   }

   public <T> bvt<T> a(Function<E, T> $$0) {
      return new bvt(Lists.transform(this.c, $$1 -> $$1.a($$0)));
   }

   public Optional<E> a(bck $$0) {
      if (this.d == null) {
         return Optional.empty();
      } else {
         int $$1 = $$0.a(this.b);
         return Optional.of(this.d.a($$1));
      }
   }

   public E b(bck $$0) {
      if (this.d == null) {
         throw new IllegalStateException("Weighted list has no elements");
      } else {
         int $$1 = $$0.a(this.b);
         return this.d.a($$1);
      }
   }

   public List<bvs<E>> d() {
      return this.c;
   }

   public static <E> Codec<bvt<E>> a(Codec<E> $$0) {
      return bvs.a($$0).listOf().xmap(bvt::a, bvt::d);
   }

   public static <E> Codec<bvt<E>> a(MapCodec<E> $$0) {
      return bvs.a($$0).listOf().xmap(bvt::a, bvt::d);
   }

   public static <E> Codec<bvt<E>> b(Codec<E> $$0) {
      return bbi.b(bvs.a($$0).listOf()).xmap(bvt::a, bvt::d);
   }

   public static <E> Codec<bvt<E>> b(MapCodec<E> $$0) {
      return bbi.b(bvs.a($$0).listOf()).xmap(bvt::a, bvt::d);
   }

   public boolean b(E $$0) {
      for (bvs<E> $$1 : this.c) {
         if ($$1.a().equals($$0)) {
            return true;
         }
      }

      return false;
   }

   @Override
   public boolean equals(@Nullable Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         return !($$0 instanceof bvt<?> $$1) ? false : this.b == $$1.b && Objects.equals(this.c, $$1.c);
      }
   }

   @Override
   public int hashCode() {
      int $$0 = this.b;
      return 31 * $$0 + this.c.hashCode();
   }

   public static class a<E> {
      private final Builder<bvs<E>> a = ImmutableList.builder();

      public bvt.a<E> a(E $$0) {
         return this.a($$0, 1);
      }

      public bvt.a<E> a(E $$0, int $$1) {
         this.a.add(new bvs<>($$0, $$1));
         return this;
      }

      public bvt<E> a() {
         return new bvt<>(this.a.build());
      }
   }

   static class b<E> implements bvt.d<E> {
      private final bvs<?>[] a;

      b(List<bvs<E>> $$0) {
         this.a = $$0.toArray(bvs[]::new);
      }

      @Override
      public E a(int $$0) {
         for (bvs<?> $$1 : this.a) {
            $$0 -= $$1.b();
            if ($$0 < 0) {
               return (E)$$1.a();
            }
         }

         throw new IllegalStateException($$0 + " exceeded total weight");
      }
   }

   static class c<E> implements bvt.d<E> {
      private final Object[] a;

      c(List<bvs<E>> $$0, int $$1) {
         this.a = new Object[$$1];
         int $$2 = 0;

         for (bvs<E> $$3 : $$0) {
            int $$4 = $$3.b();
            Arrays.fill(this.a, $$2, $$2 + $$4, $$3.a());
            $$2 += $$4;
         }
      }

      @Override
      public E a(int $$0) {
         return (E)this.a[$$0];
      }
   }

   interface d<E> {
      E a(int var1);
   }
}
