import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public abstract class ftg extends ftc {
   private static final Logger b = LogUtils.getLogger();
   private final long c;
   private final xo d;
   private final Runnable e;

   public ftg(long $$0, xo $$1, Runnable $$2) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
   }

   protected abstract void a(foq var1, long var2) throws fqx;

   @Override
   public void run() {
      foq $$0 = foq.a();
      int $$1 = 0;

      while ($$1 < 25) {
         try {
            if (this.d()) {
               return;
            }

            this.a($$0, this.c);
            if (this.d()) {
               return;
            }

            this.e.run();
            return;
         } catch (fqy var4) {
            if (this.d()) {
               return;
            }

            a(var4.c);
            $$1++;
         } catch (Exception var5) {
            if (this.d()) {
               return;
            }

            b.error("Couldn't reset world");
            this.a(var5);
            return;
         }
      }
   }

   @Override
   public xo a() {
      return this.d;
   }
}
