public abstract class cxy extends bzm {
   protected static final alh<Integer> e = all.a(cxy.class, alj.b);
   protected static final alh<Integer> f = all.a(cxy.class, alj.b);
   protected static final alh<Float> g = all.a(cxy.class, alj.d);

   public cxy(bzv<?> $$0, dmu $$1) {
      super($$0, $$1);
   }

   @Override
   public boolean b(byb $$0) {
      return true;
   }

   @Override
   public boolean a(aub $$0, byb $$1, float $$2) {
      if (this.dU()) {
         return true;
      } else if (this.d($$1)) {
         return false;
      } else {
         this.l(-this.J());
         this.d(10);
         this.bG();
         this.a(this.G() + $$2 * 10.0F);
         this.a(ejb.o, $$1.d());
         boolean $$4 = $$1.d() instanceof cut $$3 && $$3.gt().d;
         if (($$4 || !(this.G() > 40.0F)) && !this.e($$1)) {
            if ($$4) {
               this.at();
            }
         } else {
            this.a($$0, $$1);
         }

         return true;
      }
   }

   boolean e(byb $$0) {
      return false;
   }

   @Override
   public boolean a(dmn $$0) {
      return $$0.c() instanceof cao && !$$0.a().P().c(dmq.d);
   }

   public void a(aub $$0, dcr $$1) {
      this.c($$0);
      if ($$0.P().c(dmq.j)) {
         dcv $$2 = new dcv($$1);
         $$2.b(kq.g, this.al());
         this.a($$0, $$2);
      }
   }

   @Override
   protected void a(all.a $$0) {
      $$0.a(e, 0);
      $$0.a(f, 1);
      $$0.a(g, 0.0F);
   }

   public void d(int $$0) {
      this.ay.a(e, $$0);
   }

   public void l(int $$0) {
      this.ay.a(f, $$0);
   }

   public void a(float $$0) {
      this.ay.a(g, $$0);
   }

   public float G() {
      return this.ay.a(g);
   }

   public int I() {
      return this.ay.a(e);
   }

   public int J() {
      return this.ay.a(f);
   }

   protected void a(aub $$0, byb $$1) {
      this.a($$0, this.p());
   }

   @Override
   public int ca() {
      return 10;
   }

   protected abstract dcr p();
}
