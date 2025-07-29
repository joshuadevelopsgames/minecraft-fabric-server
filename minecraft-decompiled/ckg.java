import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class ckg extends ckp {
   public static final float a = 10.0F;

   @Override
   protected boolean a(aub $$0, cam $$1, cam $$2) {
      return !$$1.eh().a(cjo.V) && ckv.c($$0, $$1, $$2) && coc.i($$2) && !this.a($$1, $$2) ? $$2.a($$1, 10.0) : false;
   }

   private boolean a(cam $$0, cam $$1) {
      List<UUID> $$2 = $$0.eh().c(cjo.ab).orElseGet(ArrayList::new);
      return $$2.contains($$1.cK());
   }

   @Override
   protected cjo<cam> b() {
      return cjo.C;
   }
}
