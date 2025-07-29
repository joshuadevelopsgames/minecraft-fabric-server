import org.joml.Matrix4f;

public class gxk {
   private static final float c = -0.01F;
   private static final float d = -0.001F;
   public static final int a = 128;
   public static final int b = 128;
   private final hsr e;
   private final hsq f;

   public gxk(hsq $$0, hsr $$1) {
      this.f = $$0;
      this.e = $$1;
   }

   public void a(hra $$0, fod $$1, gxn $$2, boolean $$3, int $$4) {
      Matrix4f $$5 = $$1.c().a();
      fog $$6 = $$2.getBuffer(gxz.u($$0.a));
      $$6.a($$5, 0.0F, 128.0F, -0.01F).a(-1).a(0.0F, 1.0F).c($$4);
      $$6.a($$5, 128.0F, 128.0F, -0.01F).a(-1).a(1.0F, 1.0F).c($$4);
      $$6.a($$5, 128.0F, 0.0F, -0.01F).a(-1).a(1.0F, 0.0F).c($$4);
      $$6.a($$5, 0.0F, 0.0F, -0.01F).a(-1).a(0.0F, 0.0F).c($$4);
      int $$7 = 0;

      for (hra.a $$8 : $$0.b) {
         if (!$$3 || $$8.e) {
            $$1.a();
            $$1.a($$8.b / 2.0F + 64.0F, $$8.c / 2.0F + 64.0F, -0.02F);
            $$1.a(a.f.rotationDegrees($$8.d * 360 / 16.0F));
            $$1.b(4.0F, 4.0F, 3.0F);
            $$1.a(-0.125F, 0.125F, 0.0F);
            Matrix4f $$9 = $$1.c().a();
            hrs $$10 = $$8.a;
            if ($$10 != null) {
               fog $$11 = $$2.getBuffer(gxz.u($$10.j()));
               $$11.a($$9, -1.0F, 1.0F, $$7 * -0.001F).a(-1).a($$10.c(), $$10.h()).c($$4);
               $$11.a($$9, 1.0F, 1.0F, $$7 * -0.001F).a(-1).a($$10.d(), $$10.h()).c($$4);
               $$11.a($$9, 1.0F, -1.0F, $$7 * -0.001F).a(-1).a($$10.d(), $$10.i()).c($$4);
               $$11.a($$9, -1.0F, -1.0F, $$7 * -0.001F).a(-1).a($$10.c(), $$10.i()).c($$4);
               $$1.b();
            }

            if ($$8.f != null) {
               fwz $$12 = fue.R().h;
               float $$13 = $$12.a($$8.f);
               float $$14 = bcb.a(25.0F / $$13, 0.0F, 6.0F / 9.0F);
               $$1.a();
               $$1.a($$8.b / 2.0F + 64.0F - $$13 * $$14 / 2.0F, $$8.c / 2.0F + 64.0F + 4.0F, -0.025F);
               $$1.b($$14, $$14, -1.0F);
               $$1.a(0.0F, 0.0F, 0.1F);
               $$12.a($$8.f, 0.0F, 0.0F, -1, false, $$1.c().a(), $$2, fwz.a.a, Integer.MIN_VALUE, $$4);
               $$1.b();
            }

            $$7++;
         }
      }
   }

   public void a(fce $$0, fcg $$1, hra $$2) {
      $$2.a = this.e.b($$0, $$1);
      $$2.b.clear();

      for (fca $$3 : $$1.g()) {
         $$2.b.add(this.a($$3));
      }
   }

   private hra.a a(fca $$0) {
      hra.a $$1 = new hra.a();
      $$1.a = this.f.a($$0);
      $$1.b = $$0.d();
      $$1.c = $$0.e();
      $$1.d = $$0.f();
      $$1.f = $$0.g().orElse(null);
      $$1.e = $$0.b();
      return $$1;
   }
}
