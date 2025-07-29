public class cas extends bzm {
   private static final int b = 60;
   private static final int c = 120;
   private static final String d = "spawn_item_after_ticks";
   private static final String e = "item";
   private static final alh<dcv> f = all.a(cas.class, alj.h);
   public static final int a = 36;
   private long g;

   public cas(bzv<? extends cas> $$0, dmu $$1) {
      super($$0, $$1);
      this.aq = true;
   }

   public static cas a(dmu $$0, dcv $$1) {
      cas $$2 = new cas(bzv.aL, $$0);
      $$2.g = $$0.A.a(60, 120);
      $$2.a($$1);
      return $$2;
   }

   @Override
   public void g() {
      super.g();
      if (this.ai() instanceof aub $$0) {
         this.a($$0);
      } else {
         this.i();
      }
   }

   private void a(aub $$0) {
      if (this.as == this.g - 36L) {
         $$0.a(null, this.dx(), ayz.mW, aza.g);
      }

      if (this.as >= this.g) {
         this.l();
         this.c($$0);
      }
   }

   private void i() {
      if (this.ai().ae() % 5L == 0L) {
         this.e();
      }
   }

   private void l() {
      if (this.ai() instanceof aub $$0) {
         dcv $$2 = this.f();
         if (!$$2.f()) {
            bzm $$4;
            if ($$2.h() instanceof ddp $$3) {
               $$4 = this.a($$0, $$3, $$2);
            } else {
               $$4 = new cqz($$0, this.dC(), this.dE(), this.dI(), $$2);
               $$0.b($$4);
            }

            $$0.c(3021, this.dx(), 1);
            $$0.a($$4, ejb.t, this.dv());
            this.a(dcv.l);
         }
      }
   }

   private bzm a(aub $$0, ddp $$1, dcv $$2) {
      ddp.a $$3 = $$1.a();
      $$3.e().ifPresent($$1x -> $$0.c($$1x, this.dx(), 0));
      jh $$4 = jh.a;
      cvo $$5 = cvo.a($$1.a($$0, this.dv(), $$2, $$4), $$0, $$2, $$4.j(), $$4.k(), $$4.l(), $$3.d(), $$3.c());
      $$5.c(this);
      return $$5;
   }

   @Override
   protected void a(all.a $$0) {
      $$0.a(f, dcv.l);
   }

   @Override
   protected void a(fda $$0) {
      this.a($$0.<dcv>a("item", dcv.b).orElse(dcv.l));
      this.g = $$0.a("spawn_item_after_ticks", 0L);
   }

   @Override
   protected void a(fdc $$0) {
      if (!this.f().f()) {
         $$0.a("item", dcv.b, this.f());
      }

      $$0.a("spawn_item_after_ticks", this.g);
   }

   @Override
   protected boolean s(bzm $$0) {
      return false;
   }

   @Override
   protected boolean bT() {
      return false;
   }

   @Override
   protected void q(bzm $$0) {
      throw new IllegalStateException("Should never addPassenger without checking couldAcceptPassenger()");
   }

   @Override
   public faq k_() {
      return faq.d;
   }

   @Override
   public boolean n_() {
      return true;
   }

   public void e() {
      fis $$0 = this.dv();
      int $$1 = this.ar.a(1, 3);

      for (int $$2 = 0; $$2 < $$1; $$2++) {
         double $$3 = 0.4;
         fis $$4 = new fis(
            this.dC() + 0.4 * (this.ar.k() - this.ar.k()), this.dE() + 0.4 * (this.ar.k() - this.ar.k()), this.dI() + 0.4 * (this.ar.k() - this.ar.k())
         );
         fis $$5 = $$0.a($$4);
         this.ai().a(me.bf, $$0.a(), $$0.b(), $$0.c(), $$5.a(), $$5.b(), $$5.c());
      }
   }

   public dcv f() {
      return this.au().a(f);
   }

   private void a(dcv $$0) {
      this.au().a(f, $$0);
   }

   @Override
   public final boolean a(aub $$0, byb $$1, float $$2) {
      return false;
   }
}
