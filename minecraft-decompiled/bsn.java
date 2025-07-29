import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Map.Entry;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class bsn<S> {
   private final Map<bsj<?>, bsn.a<S, ?>> a = new IdentityHashMap<>();

   public <T> bsq<S, T> a(bsj<T> $$0, bss<S, T> $$1) {
      bsn.a<S, T> $$2 = (bsn.a<S, T>)this.a.computeIfAbsent($$0, bsn.a::new);
      if ($$2.b != null) {
         throw new IllegalArgumentException("Trying to override rule: " + $$0);
      } else {
         $$2.b = $$1;
         return $$2;
      }
   }

   public <T> bsq<S, T> a(bsj<T> $$0, bsv<S> $$1, bss.a<S, T> $$2) {
      return this.a($$0, bss.a($$1, $$2));
   }

   public <T> bsq<S, T> a(bsj<T> $$0, bsv<S> $$1, bss.b<S, T> $$2) {
      return this.a($$0, bss.a($$1, $$2));
   }

   public void a() {
      List<? extends bsj<?>> $$0 = this.a.entrySet().stream().filter($$0x -> $$0x.getValue() == null).map(Entry::getKey).toList();
      if (!$$0.isEmpty()) {
         throw new IllegalStateException("Unbound names: " + $$0);
      }
   }

   public <T> bsq<S, T> a(bsj<T> $$0) {
      return (bsq<S, T>)Objects.requireNonNull(this.a.get($$0), () -> "No rule called " + $$0);
   }

   public <T> bsq<S, T> b(bsj<T> $$0) {
      return this.d($$0);
   }

   private <T> bsn.a<S, T> d(bsj<T> $$0) {
      return (bsn.a<S, T>)this.a.computeIfAbsent($$0, bsn.a::new);
   }

   public <T> bsv<S> c(bsj<T> $$0) {
      return new bsn.b<>(this.d($$0), $$0);
   }

   public <T> bsv<S> a(bsj<T> $$0, bsj<T> $$1) {
      return new bsn.b<>(this.d($$0), $$1);
   }

   static class a<S, T> implements bsq<S, T>, Supplier<String> {
      private final bsj<T> a;
      @Nullable
      bss<S, T> b;

      private a(bsj<T> $$0) {
         this.a = $$0;
      }

      @Override
      public bsj<T> a() {
         return this.a;
      }

      @Override
      public bss<S, T> b() {
         return Objects.requireNonNull(this.b, this);
      }

      public String c() {
         return "Unbound rule " + this.a;
      }
   }

   record b<S, T>(bsn.a<S, T> a, bsj<T> b) implements bsv<S> {
      @Override
      public boolean a(bsr<S> $$0, bst $$1, bsl $$2) {
         T $$3 = $$0.a(this.a);
         if ($$3 == null) {
            return false;
         } else {
            $$1.a(this.b, $$3);
            return true;
         }
      }
   }
}
