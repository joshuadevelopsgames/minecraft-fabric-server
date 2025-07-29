import java.util.Set;
import org.joml.Vector3f;

public class gzz implements hac<eav> {
   private final gof a;
   private final gof b;

   public gzz(had.a $$0) {
      this($$0.f());
   }

   public gzz(gqj $$0) {
      this.a = new gof.a($$0.a(gqm.w), gxz::d);
      this.b = new gof.a($$0.a(gqm.v), gxz::d);
   }

   public static gqt c() {
      gqv $$0 = new gqv();
      gqx $$1 = $$0.a();
      $$1.a("main", gqs.c().a(0, 0).a(0.0F, 0.0F, 0.0F, 16.0F, 16.0F, 6.0F), gqp.a);
      $$1.a("left_leg", gqs.c().a(50, 6).a(0.0F, 6.0F, 0.0F, 3.0F, 3.0F, 3.0F), gqp.b((float) (Math.PI / 2), 0.0F, (float) (Math.PI / 2)));
      $$1.a("right_leg", gqs.c().a(50, 18).a(-16.0F, 6.0F, 0.0F, 3.0F, 3.0F, 3.0F), gqp.b((float) (Math.PI / 2), 0.0F, (float) Math.PI));
      return gqt.a($$0, 64, 64);
   }

   public static gqt d() {
      gqv $$0 = new gqv();
      gqx $$1 = $$0.a();
      $$1.a("main", gqs.c().a(0, 22).a(0.0F, 0.0F, 0.0F, 16.0F, 16.0F, 6.0F), gqp.a);
      $$1.a("left_leg", gqs.c().a(50, 0).a(0.0F, 6.0F, -16.0F, 3.0F, 3.0F, 3.0F), gqp.b((float) (Math.PI / 2), 0.0F, 0.0F));
      $$1.a("right_leg", gqs.c().a(50, 12).a(-16.0F, 6.0F, -16.0F, 3.0F, 3.0F, 3.0F), gqp.b((float) (Math.PI / 2), 0.0F, (float) (Math.PI * 3.0 / 2.0)));
      return gqt.a($$0, 64, 64);
   }

   public void a(eav $$0, float $$1, fod $$2, gxn $$3, int $$4, int $$5, fis $$6) {
      dmu $$7 = $$0.i();
      if ($$7 != null) {
         hua $$8 = gyi.a($$0.c());
         eeb $$9 = $$0.m();
         dsh.c<? extends eav> $$10 = dsh.a(ebb.z, dps::i, dps::h, drd.c, $$9, $$7, $$0.aA_(), ($$0x, $$1x) -> false);
         int $$11 = $$10.apply(new hag<>()).get($$4);
         this.a($$2, $$3, $$9.c(dps.b) == eeo.a ? this.a : this.b, $$9.c(dps.f), $$8, $$11, $$5, false);
      }
   }

   public void a(fod $$0, gxn $$1, int $$2, int $$3, hua $$4) {
      this.a($$0, $$1, this.a, jh.d, $$4, $$2, $$3, false);
      this.a($$0, $$1, this.b, jh.d, $$4, $$2, $$3, true);
   }

   private void a(fod $$0, gxn $$1, gof $$2, jh $$3, hua $$4, int $$5, int $$6, boolean $$7) {
      $$0.a();
      a($$0, $$7, $$3);
      fog $$8 = $$4.a($$1, gxz::d);
      $$2.a($$0, $$8, $$5, $$6);
      $$0.b();
   }

   private static void a(fod $$0, boolean $$1, jh $$2) {
      $$0.a(0.0F, 0.5625F, $$1 ? -1.0F : 0.0F);
      $$0.a(a.b.rotationDegrees(90.0F));
      $$0.a(0.5F, 0.5F, 0.5F);
      $$0.a(a.f.rotationDegrees(180.0F + $$2.p()));
      $$0.a(-0.5F, -0.5F, -0.5F);
   }

   public void a(Set<Vector3f> $$0) {
      fod $$1 = new fod();
      a($$1, false, jh.d);
      this.a.e().a($$1, $$0);
      $$1.e();
      a($$1, true, jh.d);
      this.b.e().a($$1, $$0);
   }
}
