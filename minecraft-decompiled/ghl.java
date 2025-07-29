import javax.annotation.Nullable;
import org.joml.Vector3f;

public class ghl extends ggc {
   public static final float c = 62.500004F;
   public static final float d = 0.9765628F;
   private static final Vector3f e = new Vector3f(0.9765628F, 0.9765628F, 0.9765628F);
   @Nullable
   private gof f;

   public ghl(ecn $$0, boolean $$1, boolean $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   protected void aV_() {
      super.aV_();
      boolean $$0 = this.a.m().b() instanceof dyf;
      this.f = har.a(this.n.aT(), this.b, $$0);
   }

   @Override
   protected float m() {
      return 90.0F;
   }

   @Override
   protected void d(fxb $$0) {
      if (this.f != null) {
         int $$1 = this.o / 2;
         int $$2 = $$1 - 48;
         int $$3 = 66;
         int $$4 = $$1 + 48;
         int $$5 = 168;
         $$0.a(this.f, 62.500004F, this.b, $$2, 66, $$4, 168);
      }
   }

   @Override
   protected Vector3f l() {
      return e;
   }
}
