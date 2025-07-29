import java.util.Set;
import org.joml.Vector3f;

public class haq implements hac<ecm> {
   private final haq.a a;

   public haq(had.a $$0) {
      this($$0.f());
   }

   public haq(gqj $$0) {
      this.a = new haq.a($$0.a(gqm.db));
   }

   public void a(ecm $$0, float $$1, fod $$2, gxn $$3, int $$4, int $$5, fis $$6) {
      jh $$7 = $$0.m().a(dxj.c, jh.b);
      dbt $$8 = $$0.u();
      hua $$9;
      if ($$8 == null) {
         $$9 = gyi.s;
      } else {
         $$9 = gyi.d($$8);
      }

      float $$11 = $$0.a($$1);
      this.a($$2, $$3, $$4, $$5, $$7, $$11, $$9);
   }

   public void a(fod $$0, gxn $$1, int $$2, int $$3, jh $$4, float $$5, hua $$6) {
      $$0.a();
      this.a($$0, $$4, $$5);
      fog $$7 = $$6.a($$1, this.a::a);
      this.a.a($$0, $$7, $$2, $$3);
      $$0.b();
   }

   private void a(fod $$0, jh $$1, float $$2) {
      $$0.a(0.5F, 0.5F, 0.5F);
      float $$3 = 0.9995F;
      $$0.b(0.9995F, 0.9995F, 0.9995F);
      $$0.a($$1.b());
      $$0.b(1.0F, -1.0F, -1.0F);
      $$0.a(0.0F, -1.0F, 0.0F);
      this.a.a($$2);
   }

   public void a(jh $$0, float $$1, Set<Vector3f> $$2) {
      fod $$3 = new fod();
      this.a($$3, $$0, $$1);
      this.a.e().a($$3, $$2);
   }

   static class a extends gof {
      private final gqn a;

      public a(gqn $$0) {
         super($$0, gxz::g);
         this.a = $$0.b("lid");
      }

      public void a(float $$0) {
         this.a.a(0.0F, 24.0F - $$0 * 0.5F * 16.0F, 0.0F);
         this.a.f = 270.0F * $$0 * (float) (Math.PI / 180.0);
      }
   }
}
