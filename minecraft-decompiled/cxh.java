import javax.annotation.Nullable;

public abstract class cxh extends cxg implements cxl {
   private ju<dcv> b = ju.a(36, dcv.l);
   @Nullable
   private amd<fdo> c;
   private long d;

   protected cxh(bzv<?> $$0, dmu $$1) {
      super($$0, $$1);
   }

   @Override
   public void a(aub $$0, byb $$1) {
      super.a($$0, $$1);
      this.a($$1, $$0, this);
   }

   @Override
   public dcv a(int $$0) {
      return this.g_($$0);
   }

   @Override
   public dcv a(int $$0, int $$1) {
      return this.b($$0, $$1);
   }

   @Override
   public dcv b(int $$0) {
      return this.f_($$0);
   }

   @Override
   public void a(int $$0, dcv $$1) {
      this.c($$0, $$1);
   }

   @Override
   public cbd a_(int $$0) {
      return this.h_($$0);
   }

   @Override
   public void e() {
   }

   @Override
   public boolean a(cut $$0) {
      return this.d_($$0);
   }

   @Override
   public void a(bzm.e $$0) {
      if (!this.ai().C && $$0.a()) {
         bxf.a(this.ai(), this, this);
      }

      super.a($$0);
   }

   @Override
   protected void a(fdc $$0) {
      super.a($$0);
      this.c_($$0);
   }

   @Override
   protected void a(fda $$0) {
      super.a($$0);
      this.b_($$0);
   }

   @Override
   public bxj a(cut $$0, bxi $$1) {
      return this.b_($$0);
   }

   @Override
   protected fis a(fis $$0) {
      float $$1 = 0.98F;
      if (this.c == null) {
         int $$2 = 15 - cym.b(this);
         $$1 += $$2 * 0.001F;
      }

      if (this.bm()) {
         $$1 *= 0.95F;
      }

      return $$0.d($$1, 0.0, $$1);
   }

   @Override
   public void a() {
      this.ak_();
   }

   public void a(amd<fdo> $$0, long $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   @Nullable
   @Override
   public cym createMenu(int $$0, cus $$1, cut $$2) {
      if (this.c != null && $$2.am()) {
         return null;
      } else {
         this.c_($$1.j);
         return this.a($$0, $$1);
      }
   }

   protected abstract cym a(int var1, cus var2);

   @Nullable
   @Override
   public amd<fdo> q() {
      return this.c;
   }

   @Override
   public void a(@Nullable amd<fdo> $$0) {
      this.c = $$0;
   }

   @Override
   public long s() {
      return this.d;
   }

   @Override
   public void a(long $$0) {
      this.d = $$0;
   }

   @Override
   public ju<dcv> t() {
      return this.b;
   }

   @Override
   public void H() {
      this.b = ju.a(this.b(), dcv.l);
   }
}
