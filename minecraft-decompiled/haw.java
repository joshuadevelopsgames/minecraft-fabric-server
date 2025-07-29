import org.joml.Matrix4f;

public class haw<T extends ecw> implements hac<T> {
   public static final ame a = ame.b("textures/environment/end_sky.png");
   public static final ame b = ame.b("textures/entity/end_portal.png");

   public haw(had.a $$0) {
   }

   public void a(T $$0, float $$1, fod $$2, gxn $$3, int $$4, int $$5, fis $$6) {
      Matrix4f $$7 = $$2.c().a();
      this.a($$0, $$7, $$3.getBuffer(this.e()));
   }

   private void a(T $$0, Matrix4f $$1, fog $$2) {
      float $$3 = this.d();
      float $$4 = this.c();
      this.a($$0, $$1, $$2, 0.0F, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 1.0F, 1.0F, jh.d);
      this.a($$0, $$1, $$2, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, jh.c);
      this.a($$0, $$1, $$2, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 0.0F, jh.f);
      this.a($$0, $$1, $$2, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 1.0F, 1.0F, 0.0F, jh.e);
      this.a($$0, $$1, $$2, 0.0F, 1.0F, $$3, $$3, 0.0F, 0.0F, 1.0F, 1.0F, jh.a);
      this.a($$0, $$1, $$2, 0.0F, 1.0F, $$4, $$4, 1.0F, 1.0F, 0.0F, 0.0F, jh.b);
   }

   private void a(T $$0, Matrix4f $$1, fog $$2, float $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9, float $$10, jh $$11) {
      if ($$0.a($$11)) {
         $$2.a($$1, $$3, $$5, $$7);
         $$2.a($$1, $$4, $$5, $$8);
         $$2.a($$1, $$4, $$6, $$9);
         $$2.a($$1, $$3, $$6, $$10);
      }
   }

   protected float c() {
      return 0.75F;
   }

   protected float d() {
      return 0.375F;
   }

   protected gxz e() {
      return gxz.t();
   }
}
