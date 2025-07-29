import javax.annotation.Nullable;

public class cqe extends cpv {
   private static final int b = 200;
   private static final int c = 4;
   private static final int d = 10;
   private int e;
   private int f;
   @Nullable
   private bze g;

   public cqe(cps $$0) {
      super($$0);
   }

   @Override
   public void b() {
      this.e++;
      if (this.e % 2 == 0 && this.e < 10) {
         fis $$0 = this.a.J(1.0F).d();
         $$0.b((float) (-Math.PI / 4));
         double $$1 = this.a.c.dC();
         double $$2 = this.a.c.e(0.5);
         double $$3 = this.a.c.dI();

         for (int $$4 = 0; $$4 < 8; $$4++) {
            double $$5 = $$1 + this.a.ec().k() / 2.0;
            double $$6 = $$2 + this.a.ec().k() / 2.0;
            double $$7 = $$3 + this.a.ec().k() / 2.0;

            for (int $$8 = 0; $$8 < 6; $$8++) {
               this.a.ai().a(me.h, $$5, $$6, $$7, -$$0.d * 0.08F * $$8, -$$0.e * 0.6F, -$$0.f * 0.08F * $$8);
            }

            $$0.b((float) (Math.PI / 16));
         }
      }
   }

   @Override
   public void a(aub $$0) {
      this.e++;
      if (this.e >= 200) {
         if (this.f >= 4) {
            this.a.gD().a(cqi.e);
         } else {
            this.a.gD().a(cqi.g);
         }
      } else if (this.e == 10) {
         fis $$1 = new fis(this.a.c.dC() - this.a.dC(), 0.0, this.a.c.dI() - this.a.dI()).d();
         float $$2 = 5.0F;
         double $$3 = this.a.c.dC() + $$1.d * 5.0 / 2.0;
         double $$4 = this.a.c.dI() + $$1.f * 5.0 / 2.0;
         double $$5 = this.a.c.e(0.5);
         double $$6 = $$5;
         jb.a $$7 = new jb.a($$3, $$5, $$4);

         while ($$0.w($$7)) {
            if (--$$6 < 0.0) {
               $$6 = $$5;
               break;
            }

            $$7.b($$3, $$6, $$4);
         }

         $$6 = bcb.a($$6) + 1;
         this.g = new bze($$0, $$3, $$6, $$4);
         this.g.a((cam)this.a);
         this.g.a(5.0F);
         this.g.a(200);
         this.g.a(me.h);
         this.g.b(0.25F);
         this.g.a(new byq(bys.g));
         $$0.b(this.g);
      }
   }

   @Override
   public void c() {
      this.e = 0;
      this.f++;
   }

   @Override
   public void d() {
      if (this.g != null) {
         this.g.at();
         this.g = null;
      }
   }

   @Override
   public cqi<cqe> h() {
      return cqi.f;
   }

   public void i() {
      this.f = 0;
   }
}
