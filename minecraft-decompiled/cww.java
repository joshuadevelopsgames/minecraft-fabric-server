import com.mojang.datafixers.DataFixUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public interface cww<Context, Condition extends cww.b<Context>> {
   List<cww.a<Context, Condition>> a();

   static <C, T> Stream<T> a(Stream<T> $$0, Function<T, cww<C, ?>> $$1, C $$2) {
      List<cww.c<C, T>> $$3 = new ArrayList<>();
      $$0.forEach($$2x -> {
         cww<C, ?> $$3x = $$1.apply((T)$$2x);

         for (cww.a<C, ?> $$4x : $$3x.a()) {
            $$3.add(new cww.c<>((T)$$2x, $$4x.b(), (cww.b<C>)DataFixUtils.orElseGet($$4x.a(), cww.b::alwaysTrue)));
         }
      });
      $$3.sort(cww.c.a);
      Iterator<cww.c<C, T>> $$4 = $$3.iterator();
      int $$5 = Integer.MIN_VALUE;

      while ($$4.hasNext()) {
         cww.c<C, T> $$6 = $$4.next();
         if ($$6.c < $$5) {
            $$4.remove();
         } else if ($$6.d.test($$2)) {
            $$5 = $$6.c;
         } else {
            $$4.remove();
         }
      }

      return $$3.stream().map(cww.c::a);
   }

   static <C, T> Optional<T> a(Stream<T> $$0, Function<T, cww<C, ?>> $$1, bck $$2, C $$3) {
      List<T> $$4 = a($$0, $$1, $$3).toList();
      return ag.b($$4, $$2);
   }

   static <Context, Condition extends cww.b<Context>> List<cww.a<Context, Condition>> a(Condition $$0, int $$1) {
      return List.of(new cww.a<>($$0, $$1));
   }

   static <Context, Condition extends cww.b<Context>> List<cww.a<Context, Condition>> a(int $$0) {
      return List.of(new cww.a<>(Optional.empty(), $$0));
   }

   public record a<Context, Condition extends cww.b<Context>>(Optional<Condition> a, int b) {
      public a(Condition $$0, int $$1) {
         this(Optional.of($$0), $$1);
      }

      public a(int $$0) {
         this(Optional.empty(), $$0);
      }

      public static <Context, Condition extends cww.b<Context>> Codec<cww.a<Context, Condition>> a(Codec<Condition> $$0) {
         return RecordCodecBuilder.create(
            $$1 -> $$1.group($$0.optionalFieldOf("condition").forGetter(cww.a::a), Codec.INT.fieldOf("priority").forGetter(cww.a::b)).apply($$1, cww.a::new)
         );
      }
   }

   @FunctionalInterface
   public interface b<C> extends Predicate<C> {
      static <C> cww.b<C> alwaysTrue() {
         return $$0 -> true;
      }
   }

   public record c<C, T>(T b, int c, cww.b<C> d) {
      public static final Comparator<cww.c<?, ?>> a = Comparator.comparingInt(cww.c::b).reversed();

      public T a() {
         return this.b;
      }

      public int b() {
         return this.c;
      }

      public cww.b<C> c() {
         return this.d;
      }
   }
}
