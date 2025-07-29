import com.mojang.jtracy.TracyClient;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

public final class bts {
   private static final ThreadLocal<btx> a = ThreadLocal.withInitial(btx::new);
   private static final ThreadLocal<btt> b = new ThreadLocal<>();
   private static final AtomicInteger c = new AtomicInteger();

   private bts() {
   }

   public static bts.a a(btt $$0) {
      b($$0);
      return bts::b;
   }

   private static void b(btt $$0) {
      if (b.get() != null) {
         throw new IllegalStateException("Profiler is already active");
      } else {
         btt $$1 = c($$0);
         b.set($$1);
         c.incrementAndGet();
         $$1.a();
      }
   }

   private static void b() {
      btt $$0 = b.get();
      if ($$0 == null) {
         throw new IllegalStateException("Profiler was not active");
      } else {
         b.remove();
         c.decrementAndGet();
         $$0.b();
      }
   }

   private static btt c(btt $$0) {
      return btt.a(c(), $$0);
   }

   public static btt a() {
      return c.get() == 0 ? c() : Objects.requireNonNullElseGet(b.get(), bts::c);
   }

   private static btt c() {
      return (btt)(TracyClient.isAvailable() ? a.get() : btp.a);
   }

   public interface a extends AutoCloseable {
      @Override
      void close();
   }
}
