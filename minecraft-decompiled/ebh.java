public class ebh extends eci implements ecg {
   private static final int d = 1;
   private ju<dcv> e = ju.a(27, dcv.l);
   private final ebn f = new ebn() {
      @Override
      protected void a(dmu $$0, jb $$1, eeb $$2) {
         ebh.a($$0, $$1, $$2, ayz.eU);
      }

      @Override
      protected void b(dmu $$0, jb $$1, eeb $$2) {
         ebh.a($$0, $$1, $$2, ayz.eS);
      }

      @Override
      protected void a(dmu $$0, jb $$1, eeb $$2, int $$3, int $$4) {
         ebh.this.a($$0, $$1, $$2, $$3, $$4);
      }

      @Override
      protected boolean a(cut $$0) {
         if (!($$0.cn instanceof cyv)) {
            return false;
         } else {
            bxc $$1 = ((cyv)$$0.cn).l();
            return $$1 == ebh.this || $$1 instanceof bxb && ((bxb)$$1).a(ebh.this);
         }
      }
   };
   private final ebi g = new ebi();

   protected ebh(ebb<?> $$0, jb $$1, eeb $$2) {
      super($$0, $$1, $$2);
   }

   public ebh(jb $$0, eeb $$1) {
      this(ebb.b, $$0, $$1);
   }

   @Override
   public int b() {
      return 27;
   }

   @Override
   protected xo j() {
      return xo.c("container.chest");
   }

   @Override
   protected void a(fda $$0) {
      super.a($$0);
      this.e = ju.a(this.b(), dcv.l);
      if (!this.c_($$0)) {
         bxd.a($$0, this.e);
      }
   }

   @Override
   protected void a(fdc $$0) {
      super.a($$0);
      if (!this.d_($$0)) {
         bxd.a($$0, this.e);
      }
   }

   public static void a(dmu $$0, jb $$1, eeb $$2, ebh $$3) {
      $$3.g.a();
   }

   static void a(dmu $$0, jb $$1, eeb $$2, ayy $$3) {
      eet $$4 = $$2.c(drd.d);
      if ($$4 != eet.b) {
         double $$5 = $$1.u() + 0.5;
         double $$6 = $$1.v() + 0.5;
         double $$7 = $$1.w() + 0.5;
         if ($$4 == eet.c) {
            jh $$8 = drd.i($$2);
            $$5 += $$8.j() * 0.5;
            $$7 += $$8.l() * 0.5;
         }

         $$0.a(null, $$5, $$6, $$7, $$3, aza.e, 0.5F, $$0.A.i() * 0.1F + 0.9F);
      }
   }

   @Override
   public boolean a_(int $$0, int $$1) {
      if ($$0 == 1) {
         this.g.a($$1 > 0);
         return true;
      } else {
         return super.a_($$0, $$1);
      }
   }

   @Override
   public void e_(cut $$0) {
      if (!this.p && !$$0.am()) {
         this.f.a($$0, this.i(), this.aA_(), this.m());
      }
   }

   @Override
   public void c(cut $$0) {
      if (!this.p && !$$0.am()) {
         this.f.b($$0, this.i(), this.aA_(), this.m());
      }
   }

   @Override
   protected ju<dcv> f() {
      return this.e;
   }

   @Override
   protected void a(ju<dcv> $$0) {
      this.e = $$0;
   }

   @Override
   public float a(float $$0) {
      return this.g.a($$0);
   }

   public static int a(dly $$0, jb $$1) {
      eeb $$2 = $$0.a_($$1);
      if ($$2.x()) {
         eaz $$3 = $$0.c_($$1);
         if ($$3 instanceof ebh) {
            return ((ebh)$$3).f.a();
         }
      }

      return 0;
   }

   public static void a(ebh $$0, ebh $$1) {
      ju<dcv> $$2 = $$0.f();
      $$0.a($$1.f());
      $$1.a($$2);
   }

   @Override
   protected cym a(int $$0, cus $$1) {
      return cyv.a($$0, $$1, this);
   }

   public void k() {
      if (!this.p) {
         this.f.c(this.i(), this.aA_(), this.m());
      }
   }

   protected void a(dmu $$0, jb $$1, eeb $$2, int $$3, int $$4) {
      dpz $$5 = $$2.b();
      $$0.a($$1, $$5, 1, $$4);
   }
}
