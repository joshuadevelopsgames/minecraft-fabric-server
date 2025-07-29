import java.util.UUID;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class eiq<T extends eig> implements eip<T> {
   private final eii<T> a;
   private final eil<T> b;

   public eiq(eii<T> $$0, eil<T> $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   @Nullable
   @Override
   public T a(int $$0) {
      return this.a.a($$0);
   }

   @Nullable
   @Override
   public T a(UUID $$0) {
      return this.a.a($$0);
   }

   @Override
   public Iterable<T> a() {
      return this.a.a();
   }

   @Override
   public <U extends T> void a(ein<T, U> $$0, bak<U> $$1) {
      this.a.a($$0, $$1);
   }

   @Override
   public void a(fin $$0, Consumer<T> $$1) {
      this.b.b($$0, bak.forConsumer($$1));
   }

   @Override
   public <U extends T> void a(ein<T, U> $$0, fin $$1, bak<U> $$2) {
      this.b.a($$0, $$1, $$2);
   }
}
