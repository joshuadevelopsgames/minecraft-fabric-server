import com.google.common.annotations.VisibleForTesting;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Deque;
import java.util.Iterator;

public class fnn implements fno, AutoCloseable {
   private final int b;
   private final Deque<fnn.a<?>> c = new ArrayDeque<>();

   public fnn(int $$0) {
      this.b = $$0;
   }

   public void a() {
      Iterator<? extends fnn.a<?>> $$0 = this.c.iterator();

      while ($$0.hasNext()) {
         fnn.a<?> $$1 = (fnn.a<?>)$$0.next();
         if ($$1.c-- == 0) {
            $$1.close();
            $$0.remove();
         }
      }
   }

   @Override
   public <T> T a(fnq<T> $$0) {
      T $$1 = this.b($$0);
      $$0.b($$1);
      return $$1;
   }

   private <T> T b(fnq<T> $$0) {
      Iterator<? extends fnn.a<?>> $$1 = this.c.iterator();

      while ($$1.hasNext()) {
         fnn.a<?> $$2 = (fnn.a<?>)$$1.next();
         if ($$0.a($$2.a)) {
            $$1.remove();
            return (T)$$2.b;
         }
      }

      return $$0.f();
   }

   @Override
   public <T> void a(fnq<T> $$0, T $$1) {
      this.c.addFirst(new fnn.a<>($$0, $$1, this.b));
   }

   public void b() {
      this.c.forEach(fnn.a::close);
      this.c.clear();
   }

   @Override
   public void close() {
      this.b();
   }

   @VisibleForTesting
   protected Collection<fnn.a<?>> c() {
      return this.c;
   }

   @VisibleForTesting
   protected static final class a<T> implements AutoCloseable {
      final fnq<T> a;
      final T b;
      int c;

      a(fnq<T> $$0, T $$1, int $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      @Override
      public void close() {
         this.a.a(this.b);
      }
   }
}
