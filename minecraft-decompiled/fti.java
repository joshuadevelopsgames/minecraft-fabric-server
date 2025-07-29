import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class fti extends ftc {
   private static final Logger b = LogUtils.getLogger();
   private static final xo c = xo.c("mco.minigame.world.starting.screen.title");
   private final long d;
   private final fqs e;
   private final fsc f;

   public fti(long $$0, fqs $$1, fsc $$2) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
   }

   @Override
   public void run() {
      foq $$0 = foq.a();

      for (int $$1 = 0; $$1 < 25; $$1++) {
         try {
            if (this.d()) {
               return;
            }

            if ($$0.c(this.d, this.e.a)) {
               a(this.f);
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

            b.error("Couldn't start mini game!");
            this.a(var5);
         }
      }
   }

   @Override
   public xo a() {
      return c;
   }
}
