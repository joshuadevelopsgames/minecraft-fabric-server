import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class fth extends ftc {
   private static final Logger b = LogUtils.getLogger();
   private static final xo c = xo.c("mco.backup.restoring");
   private final fph d;
   private final long e;
   private final fsc f;

   public fth(fph $$0, long $$1, fsc $$2) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
   }

   @Override
   public void run() {
      foq $$0 = foq.a();
      int $$1 = 0;

      while ($$1 < 25) {
         try {
            if (this.d()) {
               return;
            }

            $$0.b(this.e, this.d.a);
            a(1L);
            if (this.d()) {
               return;
            }

            a(this.f);
            return;
         } catch (fqy var4) {
            if (this.d()) {
               return;
            }

            a(var4.c);
            $$1++;
         } catch (fqx var5) {
            if (this.d()) {
               return;
            }

            b.error("Couldn't restore backup", var5);
            a(new frm(var5, this.f));
            return;
         } catch (Exception var6) {
            if (this.d()) {
               return;
            }

            b.error("Couldn't restore backup", var6);
            this.a(var6);
            return;
         }
      }
   }

   @Override
   public xo a() {
      return c;
   }
}
