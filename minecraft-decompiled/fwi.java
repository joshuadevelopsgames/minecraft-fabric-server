import com.mojang.datafixers.util.Function3;
import com.mojang.datafixers.util.Function4;
import com.mojang.datafixers.util.Function5;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.stream.Stream;

public abstract class fwi<V> {
   private final Map<fwj, V> a = new HashMap<>();

   protected void a(fwj $$0, V $$1) {
      V $$2 = this.a.put($$0, $$1);
      if ($$2 != null) {
         throw new IllegalStateException("Value " + $$0 + " is already defined");
      }
   }

   Map<fwj, V> a() {
      this.c();
      return Map.copyOf(this.a);
   }

   private void c() {
      List<efe<?>> $$0 = this.b();
      Stream<fwj> $$1 = Stream.of(fwj.a);

      for (efe<?> $$2 : $$0) {
         $$1 = $$1.flatMap($$1x -> $$2.c().map($$1x::a));
      }

      List<fwj> $$3 = $$1.filter($$0x -> !this.a.containsKey($$0x)).toList();
      if (!$$3.isEmpty()) {
         throw new IllegalStateException("Missing definition for properties: " + $$3);
      }
   }

   abstract List<efe<?>> b();

   public static <T1 extends Comparable<T1>> fwi.a<fwc, T1> a(efe<T1> $$0) {
      return new fwi.a<>($$0);
   }

   public static <T1 extends Comparable<T1>, T2 extends Comparable<T2>> fwi.b<fwc, T1, T2> a(efe<T1> $$0, efe<T2> $$1) {
      return new fwi.b<>($$0, $$1);
   }

   public static <T1 extends Comparable<T1>, T2 extends Comparable<T2>, T3 extends Comparable<T3>> fwi.c<fwc, T1, T2, T3> a(
      efe<T1> $$0, efe<T2> $$1, efe<T3> $$2
   ) {
      return new fwi.c<>($$0, $$1, $$2);
   }

   public static <T1 extends Comparable<T1>, T2 extends Comparable<T2>, T3 extends Comparable<T3>, T4 extends Comparable<T4>> fwi.d<fwc, T1, T2, T3, T4> a(
      efe<T1> $$0, efe<T2> $$1, efe<T3> $$2, efe<T4> $$3
   ) {
      return new fwi.d<>($$0, $$1, $$2, $$3);
   }

   public static <T1 extends Comparable<T1>, T2 extends Comparable<T2>, T3 extends Comparable<T3>, T4 extends Comparable<T4>, T5 extends Comparable<T5>> fwi.e<fwc, T1, T2, T3, T4, T5> a(
      efe<T1> $$0, efe<T2> $$1, efe<T3> $$2, efe<T4> $$3, efe<T5> $$4
   ) {
      return new fwi.e<>($$0, $$1, $$2, $$3, $$4);
   }

   public static <T1 extends Comparable<T1>> fwi.a<gzm, T1> b(efe<T1> $$0) {
      return new fwi.a<>($$0);
   }

   public static <T1 extends Comparable<T1>, T2 extends Comparable<T2>> fwi.b<gzm, T1, T2> b(efe<T1> $$0, efe<T2> $$1) {
      return new fwi.b<>($$0, $$1);
   }

   public static <T1 extends Comparable<T1>, T2 extends Comparable<T2>, T3 extends Comparable<T3>> fwi.c<gzm, T1, T2, T3> b(
      efe<T1> $$0, efe<T2> $$1, efe<T3> $$2
   ) {
      return new fwi.c<>($$0, $$1, $$2);
   }

   public static <T1 extends Comparable<T1>, T2 extends Comparable<T2>, T3 extends Comparable<T3>, T4 extends Comparable<T4>> fwi.d<gzm, T1, T2, T3, T4> b(
      efe<T1> $$0, efe<T2> $$1, efe<T3> $$2, efe<T4> $$3
   ) {
      return new fwi.d<>($$0, $$1, $$2, $$3);
   }

   public static <T1 extends Comparable<T1>, T2 extends Comparable<T2>, T3 extends Comparable<T3>, T4 extends Comparable<T4>, T5 extends Comparable<T5>> fwi.e<gzm, T1, T2, T3, T4, T5> b(
      efe<T1> $$0, efe<T2> $$1, efe<T3> $$2, efe<T4> $$3, efe<T5> $$4
   ) {
      return new fwi.e<>($$0, $$1, $$2, $$3, $$4);
   }

   public static class a<V, T1 extends Comparable<T1>> extends fwi<V> {
      private final efe<T1> a;

      a(efe<T1> $$0) {
         this.a = $$0;
      }

      @Override
      public List<efe<?>> b() {
         return List.of(this.a);
      }

      public fwi.a<V, T1> a(T1 $$0, V $$1) {
         fwj $$2 = fwj.a(this.a.c($$0));
         this.a($$2, $$1);
         return this;
      }

      public fwi<V> a(Function<T1, V> $$0) {
         this.a.a().forEach($$1 -> this.a((T1)$$1, $$0.apply((T1)$$1)));
         return this;
      }
   }

   public static class b<V, T1 extends Comparable<T1>, T2 extends Comparable<T2>> extends fwi<V> {
      private final efe<T1> a;
      private final efe<T2> b;

      b(efe<T1> $$0, efe<T2> $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Override
      public List<efe<?>> b() {
         return List.of(this.a, this.b);
      }

      public fwi.b<V, T1, T2> a(T1 $$0, T2 $$1, V $$2) {
         fwj $$3 = fwj.a(this.a.c($$0), this.b.c($$1));
         this.a($$3, $$2);
         return this;
      }

      public fwi<V> a(BiFunction<T1, T2, V> $$0) {
         this.a.a().forEach($$1 -> this.b.a().forEach($$2 -> this.a((T1)$$1, (T2)$$2, $$0.apply((T1)$$1, (T2)$$2))));
         return this;
      }
   }

   public static class c<V, T1 extends Comparable<T1>, T2 extends Comparable<T2>, T3 extends Comparable<T3>> extends fwi<V> {
      private final efe<T1> a;
      private final efe<T2> b;
      private final efe<T3> c;

      c(efe<T1> $$0, efe<T2> $$1, efe<T3> $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      @Override
      public List<efe<?>> b() {
         return List.of(this.a, this.b, this.c);
      }

      public fwi.c<V, T1, T2, T3> a(T1 $$0, T2 $$1, T3 $$2, V $$3) {
         fwj $$4 = fwj.a(this.a.c($$0), this.b.c($$1), this.c.c($$2));
         this.a($$4, $$3);
         return this;
      }

      public fwi<V> a(Function3<T1, T2, T3, V> $$0) {
         this.a.a().forEach($$1 -> this.b.a().forEach($$2 -> this.c.a().forEach($$3 -> this.a((T1)$$1, (T2)$$2, (T3)$$3, (V)$$0.apply($$1, $$2, $$3)))));
         return this;
      }
   }

   public static class d<V, T1 extends Comparable<T1>, T2 extends Comparable<T2>, T3 extends Comparable<T3>, T4 extends Comparable<T4>> extends fwi<V> {
      private final efe<T1> a;
      private final efe<T2> b;
      private final efe<T3> c;
      private final efe<T4> d;

      d(efe<T1> $$0, efe<T2> $$1, efe<T3> $$2, efe<T4> $$3) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
      }

      @Override
      public List<efe<?>> b() {
         return List.of(this.a, this.b, this.c, this.d);
      }

      public fwi.d<V, T1, T2, T3, T4> a(T1 $$0, T2 $$1, T3 $$2, T4 $$3, V $$4) {
         fwj $$5 = fwj.a(this.a.c($$0), this.b.c($$1), this.c.c($$2), this.d.c($$3));
         this.a($$5, $$4);
         return this;
      }

      public fwi<V> a(Function4<T1, T2, T3, T4, V> $$0) {
         this.a
            .a()
            .forEach(
               $$1 -> this.b
                  .a()
                  .forEach(
                     $$2 -> this.c.a().forEach($$3 -> this.d.a().forEach($$4 -> this.a((T1)$$1, (T2)$$2, (T3)$$3, (T4)$$4, (V)$$0.apply($$1, $$2, $$3, $$4))))
                  )
            );
         return this;
      }
   }

   public static class e<V, T1 extends Comparable<T1>, T2 extends Comparable<T2>, T3 extends Comparable<T3>, T4 extends Comparable<T4>, T5 extends Comparable<T5>>
      extends fwi<V> {
      private final efe<T1> a;
      private final efe<T2> b;
      private final efe<T3> c;
      private final efe<T4> d;
      private final efe<T5> e;

      e(efe<T1> $$0, efe<T2> $$1, efe<T3> $$2, efe<T4> $$3, efe<T5> $$4) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
         this.e = $$4;
      }

      @Override
      public List<efe<?>> b() {
         return List.of(this.a, this.b, this.c, this.d, this.e);
      }

      public fwi.e<V, T1, T2, T3, T4, T5> a(T1 $$0, T2 $$1, T3 $$2, T4 $$3, T5 $$4, V $$5) {
         fwj $$6 = fwj.a(this.a.c($$0), this.b.c($$1), this.c.c($$2), this.d.c($$3), this.e.c($$4));
         this.a($$6, $$5);
         return this;
      }

      public fwi<V> a(Function5<T1, T2, T3, T4, T5, V> $$0) {
         this.a
            .a()
            .forEach(
               $$1 -> this.b
                  .a()
                  .forEach(
                     $$2 -> this.c
                        .a()
                        .forEach(
                           $$3 -> this.d
                              .a()
                              .forEach(
                                 $$4 -> this.e.a().forEach($$5 -> this.a((T1)$$1, (T2)$$2, (T3)$$3, (T4)$$4, (T5)$$5, (V)$$0.apply($$1, $$2, $$3, $$4, $$5)))
                              )
                        )
                  )
            );
         return this;
      }
   }
}
