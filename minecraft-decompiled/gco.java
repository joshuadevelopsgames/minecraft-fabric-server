import com.mojang.blaze3d.systems.RenderSystem;
import org.joml.Matrix4fStack;

public class gco extends gcq<gdh> {
   public gco(gxn.a $$0) {
      super($$0);
   }

   @Override
   public Class<gdh> a() {
      return gdh.class;
   }

   protected void a(gdh $$0, fod $$1) {
      fue.R().j.p().a(fnb.a.e);
      int $$2 = fue.R().aP().s();
      Matrix4fStack $$3 = RenderSystem.getModelViewStack();
      $$3.pushMatrix();
      float $$4 = $$0.a() * $$2;
      $$3.rotateAround(a.b.rotationDegrees($$0.d()), 0.0F, $$4 * -$$0.k(), 0.0F);
      $$1.a(a.d.rotationDegrees(-$$0.j()));
      $$1.a(0.0F, -1.6010001F, 0.0F);
      gxz $$5 = $$0.b().a($$0.c());
      $$0.b().a($$1, this.a.getBuffer($$5), 15728880, hri.d);
      this.a.b();
      $$3.popMatrix();
   }

   @Override
   protected String b() {
      return "player skin";
   }
}
