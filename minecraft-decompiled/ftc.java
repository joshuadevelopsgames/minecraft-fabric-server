import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public abstract class ftc implements Runnable {
   protected static final int a = 25;
   private static final Logger b = LogUtils.getLogger();
   private boolean c = false;

   protected static void a(long $$0) {
      try {
         Thread.sleep($$0 * 1000L);
      } catch (InterruptedException var3) {
         Thread.currentThread().interrupt();
         b.error("", var3);
      }
   }

   public static void a(get $$0) {
      fue $$1 = fue.R();
      $$1.execute(() -> $$1.a($$0));
   }

   protected void a(xo $$0) {
      this.b();
      fue $$1 = fue.R();
      $$1.execute(() -> $$1.a(new frm($$0, new fol(new gev()))));
   }

   protected void a(Exception $$0) {
      if ($$0 instanceof fqx $$1) {
         this.a($$1.a.b());
      } else {
         this.a(xo.b($$0.getMessage()));
      }
   }

   protected void a(fqx $$0) {
      this.a($$0.a.b());
   }

   public abstract xo a();

   public boolean d() {
      return this.c;
   }

   public void c() {
   }

   public void e() {
   }

   public void b() {
      this.c = true;
   }
}
