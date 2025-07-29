import javax.annotation.Nullable;

public class cve extends cvb {
   private static final int d = 600;
   private static final int f = -1;
   private static final alh<Integer> g = all.a(cve.class, alj.b);
   private static final byte h = 0;

   public cve(bzv<? extends cve> $$0, dmu $$1) {
      super($$0, $$1);
   }

   public cve(dmu $$0, double $$1, double $$2, double $$3, dcv $$4, @Nullable dcv $$5) {
      super(bzv.h, $$1, $$2, $$3, $$0, $$4, $$5);
      this.C();
   }

   public cve(dmu $$0, cam $$1, dcv $$2, @Nullable dcv $$3) {
      super(bzv.h, $$1, $$0, $$2, $$3);
      this.C();
   }

   private der A() {
      return this.q().a(kq.R, der.a);
   }

   private float B() {
      return this.q().a(kq.S, 1.0F);
   }

   private void a(der $$0) {
      this.q().b(kq.R, $$0);
      this.C();
   }

   @Override
   protected void a(dcv $$0) {
      super.a($$0);
      this.C();
   }

   private void C() {
      der $$0 = this.A();
      this.ay.a(g, $$0.equals(der.a) ? -1 : $$0.b());
   }

   public void a(byq $$0) {
      this.a(this.A().a($$0));
   }

   @Override
   protected void a(all.a $$0) {
      super.a($$0);
      $$0.a(g, -1);
   }

   @Override
   public void g() {
      super.g();
      if (this.ai().C) {
         if (this.e()) {
            if (this.a % 5 == 0) {
               this.b(1);
            }
         } else {
            this.b(2);
         }
      } else if (this.e() && this.a != 0 && !this.A().equals(der.a) && this.a >= 600) {
         this.ai().a(this, (byte)0);
         this.a(new dcv(dcz.pB));
      }
   }

   private void b(int $$0) {
      int $$1 = this.x();
      if ($$1 != -1 && $$0 > 0) {
         for (int $$2 = 0; $$2 < $$0; $$2++) {
            this.ai().a(lx.a(me.u, $$1), this.d(0.5), this.dF(), this.g(0.5), 0.0, 0.0, 0.0);
         }
      }
   }

   public int x() {
      return this.ay.a(g);
   }

   @Override
   protected void a(cam $$0) {
      super.a($$0);
      bzm $$1 = this.y();
      der $$2 = this.A();
      float $$3 = this.B();
      $$2.a($$2x -> $$0.b($$2x, $$1), $$3);
   }

   @Override
   protected dcv n() {
      return new dcv(dcz.pB);
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 0) {
         int $$1 = this.x();
         if ($$1 != -1) {
            float $$2 = ($$1 >> 16 & 0xFF) / 255.0F;
            float $$3 = ($$1 >> 8 & 0xFF) / 255.0F;
            float $$4 = ($$1 >> 0 & 0xFF) / 255.0F;

            for (int $$5 = 0; $$5 < 20; $$5++) {
               this.ai().a(lx.a(me.u, $$2, $$3, $$4), this.d(0.5), this.dF(), this.g(0.5), 0.0, 0.0, 0.0);
            }
         }
      } else {
         super.b($$0);
      }
   }
}
