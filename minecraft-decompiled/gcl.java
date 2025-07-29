import org.joml.Quaternionf;
import org.joml.Vector3f;

public class gcl extends gcq<gde> {
   private final hec b;

   public gcl(gxn.a $$0, hec $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public Class<gde> a() {
      return gde.class;
   }

   protected void a(gde $$0, fod $$1) {
      fue.R().j.p().a(fnb.a.d);
      Vector3f $$2 = $$0.c();
      $$1.a($$2.x, $$2.y, $$2.z);
      $$1.a($$0.d());
      Quaternionf $$3 = $$0.j();
      if ($$3 != null) {
         this.b.a($$3.conjugate(new Quaternionf()).rotateY((float) Math.PI));
      }

      this.b.a(false);
      this.b.a($$0.b(), 0.0, 0.0, 0.0, $$1, this.a, 15728880);
      this.b.a(true);
   }

   @Override
   protected float a(int $$0, int $$1) {
      return $$0 / 2.0F;
   }

   @Override
   protected String b() {
      return "entity";
   }
}
