import javax.annotation.Nullable;

public interface bss<S, T> {
   @Nullable
   T a(bsr<S> var1);

   static <S, T> bss<S, T> a(bsv<S> $$0, bss.a<S, T> $$1) {
      return new bss.c<>($$1, $$0);
   }

   static <S, T> bss<S, T> a(bsv<S> $$0, bss.b<S, T> $$1) {
      return new bss.c<>($$1, $$0);
   }

   @FunctionalInterface
   public interface a<S, T> {
      @Nullable
      T run(bsr<S> var1);
   }

   @FunctionalInterface
   public interface b<S, T> extends bss.a<S, T> {
      T run(bst var1);

      @Override
      default T run(bsr<S> $$0) {
         return this.run($$0.a());
      }
   }

   public record c<S, T>(bss.a<S, T> a, bsv<S> b) implements bss<S, T> {
      @Nullable
      @Override
      public T a(bsr<S> $$0) {
         bst $$1 = $$0.a();
         $$1.a();

         Object var3;
         try {
            if (!this.b.a($$0, $$1, bsl.a)) {
               return null;
            }

            var3 = this.a.run($$0);
         } finally {
            $$1.b();
         }

         return (T)var3;
      }
   }
}
