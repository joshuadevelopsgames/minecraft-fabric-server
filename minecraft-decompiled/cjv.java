public class cjv extends cjw {
   private boolean p;

   public cjv(cao $$0, dmu $$1) {
      super($$0, $$1);
   }

   @Override
   protected fbb a(int $$0) {
      this.o = new fbh();
      return new fbb(this.o, $$0);
   }

   @Override
   protected boolean a() {
      return this.a.aK() || this.a.bp() || this.a.cc();
   }

   @Override
   protected fis b() {
      return new fis(this.a.dC(), this.s(), this.a.dI());
   }

   @Override
   public faz a(jb $$0, int $$1) {
      egi $$2 = this.b.T().a(ke.a($$0.u()), ke.a($$0.w()));
      if ($$2 == null) {
         return null;
      } else {
         if ($$2.a_($$0).l()) {
            jb.a $$3 = $$0.k().c(jh.a);

            while ($$3.v() >= this.b.L_() && $$2.a_($$3).l()) {
               $$3.c(jh.a);
            }

            if ($$3.v() >= this.b.L_()) {
               return super.a($$3.d(), $$1);
            }

            $$3.q($$0.v() + 1);

            while ($$3.v() <= this.b.ao() && $$2.a_($$3).l()) {
               $$3.c(jh.b);
            }

            $$0 = $$3;
         }

         if (!$$2.a_($$0).e()) {
            return super.a($$0, $$1);
         } else {
            jb.a $$4 = $$0.k().c(jh.b);

            while ($$4.v() <= this.b.ao() && $$2.a_($$4).e()) {
               $$4.c(jh.b);
            }

            return super.a($$4.j(), $$1);
         }
      }
   }

   @Override
   public faz a(bzm $$0, int $$1) {
      return this.a($$0.dx(), $$1);
   }

   private int s() {
      if (this.a.bm() && this.p()) {
         int $$0 = this.a.dD();
         eeb $$1 = this.b.a_(jb.a(this.a.dC(), (double)$$0, this.a.dI()));
         int $$2 = 0;

         while ($$1.a(dqb.J)) {
            $$1 = this.b.a_(jb.a(this.a.dC(), (double)(++$$0), this.a.dI()));
            if (++$$2 > 16) {
               return this.a.dD();
            }
         }

         return $$0;
      } else {
         return bcb.a(this.a.dE() + 0.5);
      }
   }

   @Override
   protected void e() {
      super.e();
      if (this.p) {
         if (this.b.h(jb.a(this.a.dC(), this.a.dE() + 0.5, this.a.dI()))) {
            return;
         }

         for (int $$0 = 0; $$0 < this.c.e(); $$0++) {
            fax $$1 = this.c.a($$0);
            if (this.b.h(new jb($$1.a, $$1.b, $$1.c))) {
               this.c.b($$0);
               return;
            }
         }
      }
   }

   @Override
   public boolean c() {
      return true;
   }

   protected boolean a(fbc $$0) {
      if ($$0 == fbc.j) {
         return false;
      } else {
         return $$0 == fbc.i ? false : $$0 != fbc.b;
      }
   }

   public void b(boolean $$0) {
      this.p = $$0;
   }

   public void c(boolean $$0) {
      this.o.d($$0);
   }
}
