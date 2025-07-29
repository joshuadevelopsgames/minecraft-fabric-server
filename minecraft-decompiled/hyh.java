import com.google.common.util.concurrent.RateLimiter;
import java.time.Duration;
import java.util.concurrent.atomic.AtomicReference;

public class hyh {
   private final float a;
   private final AtomicReference<hyh.a> b = new AtomicReference<>();

   public hyh(Duration $$0) {
      this.a = 1000.0F / (float)$$0.toMillis();
   }

   public void a(ftv $$0, xo $$1) {
      hyh.a $$2 = this.b.updateAndGet($$1x -> $$1x != null && $$1.equals($$1x.a) ? $$1x : new hyh.a($$1, RateLimiter.create(this.a)));
      if ($$2.b.tryAcquire(1)) {
         $$0.d($$1);
      }
   }

   static class a {
      final xo a;
      final RateLimiter b;

      a(xo $$0, RateLimiter $$1) {
         this.a = $$0;
         this.b = $$1;
      }
   }
}
