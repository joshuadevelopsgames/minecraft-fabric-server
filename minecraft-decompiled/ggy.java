import org.joml.Vector3f;

public class ggy extends ggc {
   public static final float c = 4.5F;
   private static final Vector3f d = new Vector3f(1.0F, 1.0F, 1.0F);
   private static final int e = 16;
   private static final int f = 16;
   private final ame u = ame.b("textures/gui/hanging_signs/" + this.b.b() + ".png");

   public ggy(ecn $$0, boolean $$1, boolean $$2) {
      super($$0, $$1, $$2, xo.c("hanging_sign.edit"));
   }

   @Override
   protected float m() {
      return 125.0F;
   }

   @Override
   protected void d(fxb $$0) {
      $$0.e().translate(0.0F, -13.0F);
      $$0.e().scale(4.5F, 4.5F);
      $$0.a(gxx.ar, this.u, -8, -8, 0.0F, 0.0F, 16, 16, 16, 16);
   }

   @Override
   protected Vector3f l() {
      return d;
   }
}
