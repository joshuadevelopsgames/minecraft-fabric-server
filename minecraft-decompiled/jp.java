import com.mojang.datafixers.util.Either;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.Spliterator;
import java.util.function.Function;
import java.util.stream.Stream;
import javax.annotation.Nullable;
import org.jetbrains.annotations.VisibleForTesting;

public interface jp<T> extends Iterable<jl<T>> {
   Stream<jl<T>> a();

   int b();

   boolean c();

   Either<bae<T>, List<jl<T>>> d();

   Optional<jl<T>> a(bck var1);

   jl<T> a(int var1);

   boolean a(jl<T> var1);

   boolean a(jo<T> var1);

   Optional<bae<T>> e();

   @Deprecated
   @VisibleForTesting
   static <T> jp.c<T> a(jo<T> $$0, bae<T> $$1) {
      return new jp.c<T>($$0, $$1) {
         @Override
         protected List<jl<T>> g() {
            throw new UnsupportedOperationException("Tag " + this.h() + " can't be dereferenced during construction");
         }
      };
   }

   static <T> jp<T> f() {
      return (jp<T>)jp.a.a;
   }

   @SafeVarargs
   static <T> jp.a<T> a(jl<T>... $$0) {
      return new jp.a<>(List.of($$0));
   }

   static <T> jp.a<T> a(List<? extends jl<T>> $$0) {
      return new jp.a<>(List.copyOf($$0));
   }

   @SafeVarargs
   static <E, T> jp.a<T> a(Function<E, jl<T>> $$0, E... $$1) {
      return a(Stream.of($$1).map($$0).toList());
   }

   static <E, T> jp.a<T> a(Function<E, jl<T>> $$0, Collection<E> $$1) {
      return a($$1.stream().map($$0).toList());
   }

   public static final class a<T> extends jp.b<T> {
      static final jp.a<?> a = new jp.a(List.of());
      private final List<jl<T>> b;
      @Nullable
      private Set<jl<T>> c;

      a(List<jl<T>> $$0) {
         this.b = $$0;
      }

      @Override
      protected List<jl<T>> g() {
         return this.b;
      }

      @Override
      public boolean c() {
         return true;
      }

      @Override
      public Either<bae<T>, List<jl<T>>> d() {
         return Either.right(this.b);
      }

      @Override
      public Optional<bae<T>> e() {
         return Optional.empty();
      }

      @Override
      public boolean a(jl<T> $$0) {
         if (this.c == null) {
            this.c = Set.copyOf(this.b);
         }

         return this.c.contains($$0);
      }

      @Override
      public String toString() {
         return "DirectSet[" + this.b + "]";
      }

      @Override
      public boolean equals(Object $$0) {
         return this == $$0 ? true : $$0 instanceof jp.a<?> $$1 && this.b.equals($$1.b);
      }

      @Override
      public int hashCode() {
         return this.b.hashCode();
      }
   }

   public abstract static class b<T> implements jp<T> {
      protected abstract List<jl<T>> g();

      @Override
      public int b() {
         return this.g().size();
      }

      @Override
      public Spliterator<jl<T>> spliterator() {
         return this.g().spliterator();
      }

      @Override
      public Iterator<jl<T>> iterator() {
         return this.g().iterator();
      }

      @Override
      public Stream<jl<T>> a() {
         return this.g().stream();
      }

      @Override
      public Optional<jl<T>> a(bck $$0) {
         return ag.b(this.g(), $$0);
      }

      @Override
      public jl<T> a(int $$0) {
         return this.g().get($$0);
      }

      @Override
      public boolean a(jo<T> $$0) {
         return true;
      }
   }

   public static class c<T> extends jp.b<T> {
      private final jo<T> a;
      private final bae<T> b;
      @Nullable
      private List<jl<T>> c;

      c(jo<T> $$0, bae<T> $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      void b(List<jl<T>> $$0) {
         this.c = List.copyOf($$0);
      }

      public bae<T> h() {
         return this.b;
      }

      @Override
      protected List<jl<T>> g() {
         if (this.c == null) {
            throw new IllegalStateException("Trying to access unbound tag '" + this.b + "' from registry " + this.a);
         } else {
            return this.c;
         }
      }

      @Override
      public boolean c() {
         return this.c != null;
      }

      @Override
      public Either<bae<T>, List<jl<T>>> d() {
         return Either.left(this.b);
      }

      @Override
      public Optional<bae<T>> e() {
         return Optional.of(this.b);
      }

      @Override
      public boolean a(jl<T> $$0) {
         return $$0.a(this.b);
      }

      @Override
      public String toString() {
         return "NamedSet(" + this.b + ")[" + this.c + "]";
      }

      @Override
      public boolean a(jo<T> $$0) {
         return this.a.a($$0);
      }
   }
}
