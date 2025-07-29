import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class fsy extends ftc {
   private static final Logger b = LogUtils.getLogger();
   private static final xo c = xo.c("mco.configure.world.closing");
   private final fpx d;
   private final fsc e;

   public fsy(fpx $$0, fsc $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   @Override
   public void run() {
      foq $$0 = foq.a();

      for (int $$1 = 0; $$1 < 25; $$1++) {
         if (this.d()) {
            return;
         }

         try {
            boolean $$2 = $$0.g(this.d.b);
            if ($$2) {
               this.e.m();
               this.d.f = fpx.c.a;
               a(this.e);
               break;
            }
         } catch (fqy var4) {
            if (this.d()) {
               return;
            }

            a(var4.c);
         } catch (Exception var5) {
            if (this.d()) {
               return;
            }

            b.error("Failed to close server", var5);
            this.a(var5);
         }
      }
   }

   @Override
   public xo a() {
      return c;
   }
}
