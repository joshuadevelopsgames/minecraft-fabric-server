import org.joml.Quaternionf;
import org.joml.Vector3f;

public class hak implements hac<ebm> {
   public static final gxm a = new gxm(hrr.c, "entity/conduit");
   public static final hua b = a.a("base");
   public static final hua c = a.a("cage");
   public static final hua d = a.a("wind");
   public static final hua e = a.a("wind_vertical");
   public static final hua f = a.a("open_eye");
   public static final hua g = a.a("closed_eye");
   private final gqn h;
   private final gqn i;
   private final gqn j;
   private final gqn k;
   private final hab l;

   public hak(had.a $$0) {
      this.l = $$0.a();
      this.h = $$0.a(gqm.ak);
      this.i = $$0.a(gqm.am);
      this.j = $$0.a(gqm.al);
      this.k = $$0.a(gqm.aj);
   }

   public static gqt c() {
      gqv $$0 = new gqv();
      gqx $$1 = $$0.a();
      $$1.a("eye", gqs.c().a(0, 0).a(-4.0F, -4.0F, 0.0F, 8.0F, 8.0F, 0.0F, new gqr(0.01F)), gqp.a);
      return gqt.a($$0, 16, 16);
   }

   public static gqt d() {
      gqv $$0 = new gqv();
      gqx $$1 = $$0.a();
      $$1.a("wind", gqs.c().a(0, 0).a(-8.0F, -8.0F, -8.0F, 16.0F, 16.0F, 16.0F), gqp.a);
      return gqt.a($$0, 64, 32);
   }

   public static gqt e() {
      gqv $$0 = new gqv();
      gqx $$1 = $$0.a();
      $$1.a("shell", gqs.c().a(0, 0).a(-3.0F, -3.0F, -3.0F, 6.0F, 6.0F, 6.0F), gqp.a);
      return gqt.a($$0, 32, 16);
   }

   public static gqt f() {
      gqv $$0 = new gqv();
      gqx $$1 = $$0.a();
      $$1.a("shell", gqs.c().a(0, 0).a(-4.0F, -4.0F, -4.0F, 8.0F, 8.0F, 8.0F), gqp.a);
      return gqt.a($$0, 32, 16);
   }

   public void a(ebm $$0, float $$1, fod $$2, gxn $$3, int $$4, int $$5, fis $$6) {
      float $$7 = $$0.a + $$1;
      if (!$$0.c()) {
         float $$8 = $$0.a(0.0F);
         fog $$9 = b.a($$3, gxz::d);
         $$2.a();
         $$2.a(0.5F, 0.5F, 0.5F);
         $$2.a(new Quaternionf().rotationY($$8 * (float) (Math.PI / 180.0)));
         this.j.a($$2, $$9, $$4, $$5);
         $$2.b();
      } else {
         float $$10 = $$0.a($$1) * (180.0F / (float)Math.PI);
         float $$11 = bcb.a($$7 * 0.1F) / 2.0F + 0.5F;
         $$11 = $$11 * $$11 + $$11;
         $$2.a();
         $$2.a(0.5F, 0.3F + $$11 * 0.2F, 0.5F);
         Vector3f $$12 = new Vector3f(0.5F, 1.0F, 0.5F).normalize();
         $$2.a(new Quaternionf().rotationAxis($$10 * (float) (Math.PI / 180.0), $$12));
         this.k.a($$2, c.a($$3, gxz::g), $$4, $$5);
         $$2.b();
         int $$13 = $$0.a / 66 % 3;
         $$2.a();
         $$2.a(0.5F, 0.5F, 0.5F);
         if ($$13 == 1) {
            $$2.a(new Quaternionf().rotationX((float) (Math.PI / 2)));
         } else if ($$13 == 2) {
            $$2.a(new Quaternionf().rotationZ((float) (Math.PI / 2)));
         }

         fog $$14 = ($$13 == 1 ? e : d).a($$3, gxz::g);
         this.i.a($$2, $$14, $$4, $$5);
         $$2.b();
         $$2.a();
         $$2.a(0.5F, 0.5F, 0.5F);
         $$2.b(0.875F, 0.875F, 0.875F);
         $$2.a(new Quaternionf().rotationXYZ((float) Math.PI, 0.0F, (float) Math.PI));
         this.i.a($$2, $$14, $$4, $$5);
         $$2.b();
         ftm $$15 = this.l.b;
         $$2.a();
         $$2.a(0.5F, 0.3F + $$11 * 0.2F, 0.5F);
         $$2.b(0.5F, 0.5F, 0.5F);
         float $$16 = -$$15.g();
         $$2.a(new Quaternionf().rotationYXZ($$16 * (float) (Math.PI / 180.0), $$15.f() * (float) (Math.PI / 180.0), (float) Math.PI));
         float $$17 = 1.3333334F;
         $$2.b(1.3333334F, 1.3333334F, 1.3333334F);
         this.h.a($$2, ($$0.d() ? f : g).a($$3, gxz::g), $$4, $$5);
         $$2.b();
      }
   }
}
