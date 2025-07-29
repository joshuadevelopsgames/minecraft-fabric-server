import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class ftd extends ftc {
   private static final Logger b = LogUtils.getLogger();
   private static final xo c = xo.c("mco.configure.world.opening");
   private final fpx d;
   private final get e;
   private final boolean f;
   private final fue g;

   public ftd(fpx $$0, get $$1, boolean $$2, fue $$3) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
   }

   @Override
   public void run() {
      foq $$0 = foq.a();

      for (int $$1 = 0; $$1 < 25; $$1++) {
         if (this.d()) {
            return;
         }

         try {
            boolean $$2 = $$0.f(this.d.b);
            if ($$2) {
               this.g.execute(() -> {
                  if (this.e instanceof fsc $$1x) {
                     $$1x.m();
                  }

                  this.d.f = fpx.c.b;
                  if (this.f) {
                     fol.a(this.d, this.e);
                  } else {
                     this.g.a(this.e);
                  }
               });
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

            b.error("Failed to open server", var5);
            this.a(var5);
         }
      }
   }

   @Override
   public xo a() {
      return c;
   }
}
