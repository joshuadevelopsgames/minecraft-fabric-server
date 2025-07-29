import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public interface atg<T> {
   static <T> atg<T> a(T $$0) {
      return new atg.b<>($$0);
   }

   static <T> atg<T> a(String $$0) {
      return a(() -> $$0);
   }

   static <T> atg<T> a(Supplier<String> $$0) {
      return new atg.a<>($$0);
   }

   boolean a();

   @Nullable
   T b(@Nullable T var1);

   @Nullable
   static <R> R a(atg<? extends R> $$0, @Nullable R $$1) {
      R $$2 = (R)$$0.b(null);
      return $$2 != null ? $$2 : $$1;
   }

   @Nullable
   String b();

   atg<T> a(Consumer<T> var1);

   <R> atg<R> a(Function<T, R> var1);

   <E extends Throwable> T b(Supplier<E> var1) throws E;

   public record a<T>(Supplier<String> a) implements atg<T> {
      @Override
      public boolean a() {
         return false;
      }

      @Nullable
      @Override
      public T b(@Nullable T $$0) {
         return $$0;
      }

      @Override
      public String b() {
         return this.a.get();
      }

      @Override
      public atg<T> a(Consumer<T> $$0) {
         return this;
      }

      @Override
      public <R> atg<R> a(Function<T, R> $$0) {
         return new atg.a(this.a);
      }

      @Override
      public <E extends Throwable> T b(Supplier<E> $$0) throws E {
         throw $$0.get();
      }

      public Supplier<String> c() {
         return this.a;
      }
   }

   public record b<T>(T a) implements atg<T> {
      @Override
      public boolean a() {
         return true;
      }

      @Override
      public T b(@Nullable T $$0) {
         return this.a;
      }

      @Nullable
      @Override
      public String b() {
         return null;
      }

      @Override
      public atg<T> a(Consumer<T> $$0) {
         $$0.accept(this.a);
         return this;
      }

      @Override
      public <R> atg<R> a(Function<T, R> $$0) {
         return new atg.b<>($$0.apply(this.a));
      }

      @Override
      public <E extends Throwable> T b(Supplier<E> $$0) throws E {
         return this.a;
      }

      public T c() {
         return this.a;
      }
   }
}
