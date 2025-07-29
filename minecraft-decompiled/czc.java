public class czc extends cym implements cza {
   protected static final int m = 9;
   private static final int n = 9;
   private static final int o = 36;
   private static final int p = 36;
   private static final int q = 45;
   private final daf r = new daf();
   private final cyy s;
   private final cut t;
   private final cze u;

   public czc(int $$0, cus $$1) {
      super(czv.h, $$0);
      this.t = $$1.j;
      this.s = new daj(10);
      this.u = new dar(this, 3, 3);
      this.a($$1);
   }

   public czc(int $$0, cus $$1, cze $$2, cyy $$3) {
      super(czv.h, $$0);
      this.t = $$1.j;
      this.s = $$3;
      this.u = $$2;
      a($$2, 9);
      $$2.e_($$1.j);
      this.a($$1);
      this.a(this);
   }

   private void a(cus $$0) {
      for (int $$1 = 0; $$1 < 3; $$1++) {
         for (int $$2 = 0; $$2 < 3; $$2++) {
            int $$3 = $$2 + $$1 * 3;
            this.a(new czd(this.u, $$3, 26 + $$2 * 18, 17 + $$1 * 18, this));
         }
      }

      this.c($$0, 8, 84);
      this.a(new czz(this.r, 0, 134, 35));
      this.a(this.s);
      this.n();
   }

   public void a(int $$0, boolean $$1) {
      czd $$2 = (czd)this.b($$0);
      this.s.a($$2.d, $$1 ? 0 : 1);
      this.d();
   }

   public boolean e(int $$0) {
      return $$0 > -1 && $$0 < 9 ? this.s.a($$0) == 1 : false;
   }

   public boolean l() {
      return this.s.a(9) == 1;
   }

   @Override
   public dcv b(cut $$0, int $$1) {
      dcv $$2 = dcv.l;
      dak $$3 = this.k.get($$1);
      if ($$3 != null && $$3.h()) {
         dcv $$4 = $$3.g();
         $$2 = $$4.v();
         if ($$1 < 9) {
            if (!this.a($$4, 9, 45, true)) {
               return dcv.l;
            }
         } else if (!this.a($$4, 0, 9, false)) {
            return dcv.l;
         }

         if ($$4.f()) {
            $$3.f(dcv.l);
         } else {
            $$3.d();
         }

         if ($$4.M() == $$2.M()) {
            return dcv.l;
         }

         $$3.a($$0, $$4);
      }

      return $$2;
   }

   @Override
   public boolean b(cut $$0) {
      return this.u.a($$0);
   }

   private void n() {
      if (this.t instanceof auc $$0) {
         aub $$1 = $$0.y();
         dha $$2 = this.u.aB_();
         dcv $$3 = drt.a($$1, $$2).map($$2x -> ((dhb)$$2x.b()).a($$2, $$1.K_())).orElse(dcv.l);
         this.r.a(0, $$3);
      }
   }

   public bxc m() {
      return this.u;
   }

   @Override
   public void a(cym $$0, int $$1, dcv $$2) {
      this.n();
   }

   @Override
   public void a(cym $$0, int $$1, int $$2) {
   }
}
