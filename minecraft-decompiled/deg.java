import java.util.Map;
import javax.annotation.Nullable;

public class deg extends dbd {
   protected final dpz a;
   private final jh b;

   public deg(dpz $$0, dpz $$1, jh $$2, dcr.a $$3) {
      super($$0, $$3);
      this.a = $$1;
      this.b = $$2;
   }

   protected boolean a(dmx $$0, eeb $$1, jb $$2) {
      return $$1.a($$0, $$2);
   }

   @Nullable
   @Override
   protected eeb c(dgo $$0) {
      eeb $$1 = this.a.a($$0);
      eeb $$2 = null;
      dmx $$3 = $$0.q();
      jb $$4 = $$0.a();

      for (jh $$5 : $$0.f()) {
         if ($$5 != this.b.g()) {
            eeb $$6 = $$5 == this.b ? this.c().a($$0) : $$1;
            if ($$6 != null && this.a($$3, $$6, $$4)) {
               $$2 = $$6;
               break;
            }
         }
      }

      return $$2 != null && $$3.a($$2, $$4, fix.a()) ? $$2 : null;
   }

   @Override
   public void a(Map<dpz, dcr> $$0, dcr $$1) {
      super.a($$0, $$1);
      $$0.put(this.a, $$1);
   }
}
