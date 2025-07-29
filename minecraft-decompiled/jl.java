import com.mojang.datafixers.util.Either;
import java.util.Collection;
import java.util.Optional;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public interface jl<T> {
   T a();

   boolean b();

   boolean a(ame var1);

   boolean a(amd<T> var1);

   boolean a(Predicate<amd<T>> var1);

   boolean a(bae<T> var1);

   @Deprecated
   boolean a(jl<T> var1);

   Stream<bae<T>> c();

   Either<amd<T>, T> d();

   Optional<amd<T>> e();

   jl.b f();

   boolean a(jo<T> var1);

   default String g() {
      return this.e().map($$0 -> $$0.a().toString()).orElse("[unregistered]");
   }

   static <T> jl<T> a(T $$0) {
      return new jl.a<>($$0);
   }

   public record a<T>(T a) implements jl<T> {
      @Override
      public boolean b() {
         return true;
      }

      @Override
      public boolean a(ame $$0) {
         return false;
      }

      @Override
      public boolean a(amd<T> $$0) {
         return false;
      }

      @Override
      public boolean a(bae<T> $$0) {
         return false;
      }

      @Override
      public boolean a(jl<T> $$0) {
         return this.a.equals($$0.a());
      }

      @Override
      public boolean a(Predicate<amd<T>> $$0) {
         return false;
      }

      @Override
      public Either<amd<T>, T> d() {
         return Either.right(this.a);
      }

      @Override
      public Optional<amd<T>> e() {
         return Optional.empty();
      }

      @Override
      public jl.b f() {
         return jl.b.b;
      }

      @Override
      public String toString() {
         return "Direct{" + this.a + "}";
      }

      @Override
      public boolean a(jo<T> $$0) {
         return true;
      }

      @Override
      public Stream<bae<T>> c() {
         return Stream.of();
      }
   }

   public static enum b {
      a,
      b;
   }

   public static class c<T> implements jl<T> {
      private final jo<T> a;
      @Nullable
      private Set<bae<T>> b;
      private final jl.c.a c;
      @Nullable
      private amd<T> d;
      @Nullable
      private T e;

      protected c(jl.c.a $$0, jo<T> $$1, @Nullable amd<T> $$2, @Nullable T $$3) {
         this.a = $$1;
         this.c = $$0;
         this.d = $$2;
         this.e = $$3;
      }

      public static <T> jl.c<T> a(jo<T> $$0, amd<T> $$1) {
         return new jl.c<>(jl.c.a.a, $$0, $$1, null);
      }

      @Deprecated
      public static <T> jl.c<T> a(jo<T> $$0, @Nullable T $$1) {
         return new jl.c<>(jl.c.a.b, $$0, null, $$1);
      }

      public amd<T> h() {
         if (this.d == null) {
            throw new IllegalStateException("Trying to access unbound value '" + this.e + "' from registry " + this.a);
         } else {
            return this.d;
         }
      }

      @Override
      public T a() {
         if (this.e == null) {
            throw new IllegalStateException("Trying to access unbound value '" + this.d + "' from registry " + this.a);
         } else {
            return this.e;
         }
      }

      @Override
      public boolean a(ame $$0) {
         return this.h().a().equals($$0);
      }

      @Override
      public boolean a(amd<T> $$0) {
         return this.h() == $$0;
      }

      private Set<bae<T>> i() {
         if (this.b == null) {
            throw new IllegalStateException("Tags not bound");
         } else {
            return this.b;
         }
      }

      @Override
      public boolean a(bae<T> $$0) {
         return this.i().contains($$0);
      }

      @Override
      public boolean a(jl<T> $$0) {
         return $$0.a(this.h());
      }

      @Override
      public boolean a(Predicate<amd<T>> $$0) {
         return $$0.test(this.h());
      }

      @Override
      public boolean a(jo<T> $$0) {
         return this.a.a($$0);
      }

      @Override
      public Either<amd<T>, T> d() {
         return Either.left(this.h());
      }

      @Override
      public Optional<amd<T>> e() {
         return Optional.of(this.h());
      }

      @Override
      public jl.b f() {
         return jl.b.a;
      }

      @Override
      public boolean b() {
         return this.d != null && this.e != null;
      }

      void b(amd<T> $$0) {
         if (this.d != null && $$0 != this.d) {
            throw new IllegalStateException("Can't change holder key: existing=" + this.d + ", new=" + $$0);
         } else {
            this.d = $$0;
         }
      }

      protected void b(T $$0) {
         if (this.c == jl.c.a.b && this.e != $$0) {
            throw new IllegalStateException("Can't change holder " + this.d + " value: existing=" + this.e + ", new=" + $$0);
         } else {
            this.e = $$0;
         }
      }

      void a(Collection<bae<T>> $$0) {
         this.b = Set.copyOf($$0);
      }

      @Override
      public Stream<bae<T>> c() {
         return this.i().stream();
      }

      @Override
      public String toString() {
         return "Reference{" + this.d + "=" + this.e + "}";
      }

      protected static enum a {
         a,
         b;
      }
   }
}
