public class hfc<T extends cqs> extends hed<T, hlo> {
   public static final int a = 5;
   public static final int h = 30;
   private final hof i;
   private final gxk j;
   private final gys k;

   public hfc(hee.a $$0) {
      super($$0);
      this.i = $$0.b();
      this.j = $$0.c();
      this.k = $$0.d();
   }

   protected int a(T $$0, jb $$1) {
      return $$0.ap() == bzv.ah ? Math.max(5, super.a($$0, $$1)) : super.a($$0, $$1);
   }

   public void a(hlo $$0, fod $$1, gxn $$2, int $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$1.a();
      jh $$4 = $$0.a;
      fis $$5 = this.a($$0);
      $$1.a(-$$5.a(), -$$5.b(), -$$5.c());
      double $$6 = 0.46875;
      $$1.a($$4.j() * 0.46875, $$4.k() * 0.46875, $$4.l() * 0.46875);
      float $$7;
      float $$8;
      if ($$4.o().d()) {
         $$7 = 0.0F;
         $$8 = 180.0F - $$4.p();
      } else {
         $$7 = -90 * $$4.f().a();
         $$8 = 180.0F;
      }

      $$1.a(a.b.rotationDegrees($$7));
      $$1.a(a.d.rotationDegrees($$8));
      if (!$$0.A) {
         eeb $$11 = htv.a($$0.d, $$0.e != null);
         gzc $$12 = this.k.a($$11);
         $$1.a();
         $$1.a(-0.5F, -0.5F, -0.5F);
         gyu.a($$1.c(), $$2.getBuffer(gxz.e(hrr.c)), $$12, 1.0F, 1.0F, 1.0F, $$3, hri.d);
         $$1.b();
      }

      if ($$0.A) {
         $$1.a(0.0F, 0.0F, 0.5F);
      } else {
         $$1.a(0.0F, 0.0F, 0.4375F);
      }

      if ($$0.e != null) {
         int $$13 = $$0.c % 4 * 2;
         $$1.a(a.f.rotationDegrees($$13 * 360.0F / 8.0F));
         $$1.a(a.f.rotationDegrees(180.0F));
         float $$14 = 0.0078125F;
         $$1.b(0.0078125F, 0.0078125F, 0.0078125F);
         $$1.a(-64.0F, -64.0F, 0.0F);
         $$1.a(0.0F, 0.0F, -1.0F);
         int $$15 = this.a($$0.d, 15728850, $$3);
         this.j.a($$0.f, $$1, $$2, true, $$15);
      } else if (!$$0.b.e()) {
         $$1.a(a.f.rotationDegrees($$0.c * 360.0F / 8.0F));
         int $$16 = this.a($$0.d, 15728880, $$3);
         $$1.b(0.5F, 0.5F, 0.5F);
         $$0.b.a($$1, $$2, $$16, hri.d);
      }

      $$1.b();
   }

   private int a(boolean $$0, int $$1, int $$2) {
      return $$0 ? $$1 : $$2;
   }

   public fis a(hlo $$0) {
      return new fis($$0.a.j() * 0.3F, -0.25, $$0.a.l() * 0.3F);
   }

   protected boolean a(T $$0, double $$1) {
      return fue.N() && this.e.c == $$0 && $$0.v().z() != null;
   }

   protected xo a(T $$0) {
      return $$0.v().y();
   }

   public hlo a() {
      return new hlo();
   }

   public void a(T $$0, hlo $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.cS();
      dcv $$3 = $$0.v();
      this.i.a($$1.b, $$3, dct.i, $$0);
      $$1.c = $$0.x();
      $$1.d = $$0.ap() == bzv.ah;
      $$1.e = null;
      if (!$$3.f()) {
         fce $$4 = $$0.a($$3);
         if ($$4 != null) {
            fcg $$5 = $$0.ai().a($$4);
            if ($$5 != null) {
               this.j.a($$4, $$5, $$1.f);
               $$1.e = $$4;
            }
         }
      }
   }
}
