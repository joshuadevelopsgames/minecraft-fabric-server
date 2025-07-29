public class cxq extends cxg {
   static final alh<String> b = all.a(cxq.class, alj.e);
   static final alh<xo> c = all.a(cxq.class, alj.f);
   private final dlt d = new cxq.a();
   private static final int h = 4;
   private int i;

   public cxq(bzv<? extends cxq> $$0, dmu $$1) {
      super($$0, $$1);
   }

   @Override
   protected dcr p() {
      return dcz.oM;
   }

   @Override
   public dcv dM() {
      return new dcv(dcz.wp);
   }

   @Override
   protected void a(all.a $$0) {
      super.a($$0);
      $$0.a(b, "");
      $$0.a(c, xn.a);
   }

   @Override
   protected void a(fda $$0) {
      super.a($$0);
      this.d.a($$0);
      this.au().a(b, this.e().m());
      this.au().a(c, this.e().l());
   }

   @Override
   protected void a(fdc $$0) {
      super.a($$0);
      this.d.a($$0);
   }

   @Override
   public eeb u() {
      return dqb.gm.m();
   }

   public dlt e() {
      return this.d;
   }

   @Override
   public void a(int $$0, int $$1, int $$2, boolean $$3) {
      if ($$3 && this.as - this.i >= 4) {
         this.e().a(this.ai());
         this.i = this.as;
      }
   }

   @Override
   public bxj a(cut $$0, bxi $$1) {
      return this.d.a($$0);
   }

   @Override
   public void a(alh<?> $$0) {
      super.a($$0);
      if (c.equals($$0)) {
         try {
            this.d.c(this.au().a(c));
         } catch (Throwable var3) {
         }
      } else if (b.equals($$0)) {
         this.d.a(this.au().a(b));
      }
   }

   public class a extends dlt {
      @Override
      public aub e() {
         return (aub)cxq.this.ai();
      }

      @Override
      public void f() {
         cxq.this.au().a(cxq.b, this.m());
         cxq.this.au().a(cxq.c, this.l());
      }

      @Override
      public fis g() {
         return cxq.this.dv();
      }

      public cxq h() {
         return cxq.this;
      }

      @Override
      public ek i() {
         return new ek(this, cxq.this.dv(), cxq.this.bX(), this.e(), 2, this.n().getString(), cxq.this.Q_(), this.e().q(), cxq.this);
      }

      @Override
      public boolean j() {
         return !cxq.this.dU();
      }
   }
}
