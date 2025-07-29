import javax.annotation.Nullable;

public class fau extends fbh {
   private final boolean a;
   private float m;
   private float n;

   public fau(boolean $$0) {
      this.a = $$0;
   }

   @Override
   public void a(dnh $$0, cao $$1) {
      super.a($$0, $$1);
      $$1.a(fbc.j, 0.0F);
      this.m = $$1.a(fbc.c);
      $$1.a(fbc.c, 6.0F);
      this.n = $$1.a(fbc.k);
      $$1.a(fbc.k, 4.0F);
   }

   @Override
   public void b() {
      this.c.a(fbc.c, this.m);
      this.c.a(fbc.k, this.n);
      super.b();
   }

   @Override
   public fax a() {
      return !this.c.bm() ? super.a() : this.c(new jb(bcb.a(this.c.cV().a), bcb.a(this.c.cV().b + 0.5), bcb.a(this.c.cV().c)));
   }

   @Override
   public fbg a(double $$0, double $$1, double $$2) {
      return this.b($$0, $$1 + 0.5, $$2);
   }

   @Override
   public int a(fax[] $$0, fax $$1) {
      int $$2 = super.a($$0, $$1);
      fbc $$3 = this.b($$1.a, $$1.b + 1, $$1.c);
      fbc $$4 = this.b($$1.a, $$1.b, $$1.c);
      int $$5;
      if (this.c.a($$3) >= 0.0F && $$4 != fbc.w) {
         $$5 = bcb.d(Math.max(1.0F, this.c.dT()));
      } else {
         $$5 = 0;
      }

      double $$7 = this.d(new jb($$1.a, $$1.b, $$1.c));
      fax $$8 = this.a($$1.a, $$1.b + 1, $$1.c, Math.max(0, $$5 - 1), $$7, jh.b, $$4);
      fax $$9 = this.a($$1.a, $$1.b - 1, $$1.c, $$5, $$7, jh.a, $$4);
      if (this.b($$8, $$1)) {
         $$0[$$2++] = $$8;
      }

      if (this.b($$9, $$1) && $$4 != fbc.e) {
         $$0[$$2++] = $$9;
      }

      for (int $$10 = 0; $$10 < $$2; $$10++) {
         fax $$11 = $$0[$$10];
         if ($$11.l == fbc.j && this.a && $$11.b < this.c.ai().Q() - 10) {
            $$11.k++;
         }
      }

      return $$2;
   }

   private boolean b(@Nullable fax $$0, fax $$1) {
      return this.a($$0, $$1) && $$0.l == fbc.j;
   }

   @Override
   protected boolean c() {
      return true;
   }

   @Override
   public fbc a(fbe $$0, int $$1, int $$2, int $$3) {
      fbc $$4 = $$0.a($$1, $$2, $$3);
      if ($$4 == fbc.j) {
         jb.a $$5 = new jb.a();

         for (jh $$6 : jh.values()) {
            $$5.d($$1, $$2, $$3).c($$6);
            fbc $$7 = $$0.a($$5.u(), $$5.v(), $$5.w());
            if ($$7 == fbc.a) {
               return fbc.k;
            }
         }

         return fbc.j;
      } else {
         return super.a($$0, $$1, $$2, $$3);
      }
   }
}
