import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class lt extends lq {
   private static final Logger c = LogUtils.getLogger();

   @Override
   protected dcv a(lk $$0, dcv $$1) {
      this.a(false);
      dcr $$2 = $$1.h();
      if ($$2 instanceof dbd) {
         jh $$3 = $$0.d().c(dsf.b);
         jb $$4 = $$0.c().a($$3);
         jh $$5 = $$0.b().w($$4.e()) ? $$3 : jh.b;

         try {
            this.a(((dbd)$$2).a((dgo)(new dgp($$0.b(), $$4, $$3, $$1, $$5))).a());
         } catch (Exception var8) {
            c.error("Error trying to place shulker box at {}", $$4, var8);
         }
      }

      return $$1;
   }
}
