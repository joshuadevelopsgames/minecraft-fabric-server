import java.util.function.Supplier;
import javax.annotation.Nullable;

public abstract class cxf extends cxe implements cac, cxl {
   private static final int r = 27;
   private ju<dcv> s = ju.a(27, dcv.l);
   @Nullable
   private amd<fdo> t;
   private long u;

   public cxf(bzv<? extends cxf> $$0, dmu $$1, Supplier<dcr> $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   protected float m() {
      return 0.15F;
   }

   @Override
   protected int n() {
      return 1;
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
   public void a(aub $$0, byb $$1) {
      this.a($$0, this.p());
      this.a($$1, $$0, this);
   }

   @Override
   public void a(bzm.e $$0) {
      if (!this.ai().C && $$0.a()) {
         bxf.a(this.ai(), this, this);
      }

      super.a($$0);
   }

   @Override
   public bxj a(cut $$0, bxi $$1) {
      bxj $$2 = super.a($$0, $$1);
      if ($$2 != bxj.e) {
         return $$2;
      } else if (this.s($$0) && !$$0.gh()) {
         return bxj.e;
      } else {
         bxj $$3 = this.b_($$0);
         if ($$3.a() && $$0.ai() instanceof aub $$4) {
            this.a(ejb.k, $$0);
            ctj.a($$4, $$0, true);
         }

         return $$3;
      }
   }

   @Override
   public void b(cut $$0) {
      $$0.a(this);
      if ($$0.ai() instanceof aub $$1) {
         this.a(ejb.k, $$0);
         ctj.a($$1, $$0, true);
      }
   }

   @Override
   public void a() {
      this.ak_();
   }

   @Override
   public int b() {
      return 27;
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

   @Nullable
   @Override
   public cym createMenu(int $$0, cus $$1, cut $$2) {
      if (this.t != null && $$2.am()) {
         return null;
      } else {
         this.g($$1.j);
         return cyv.a($$0, $$1, this);
      }
   }

   public void g(@Nullable cut $$0) {
      this.c_($$0);
   }

   @Nullable
   @Override
   public amd<fdo> q() {
      return this.t;
   }

   @Override
   public void a(@Nullable amd<fdo> $$0) {
      this.t = $$0;
   }

   @Override
   public long s() {
      return this.u;
   }

   @Override
   public void a(long $$0) {
      this.u = $$0;
   }

   @Override
   public ju<dcv> t() {
      return this.s;
   }

   @Override
   public void H() {
      this.s = ju.a(this.b(), dcv.l);
   }

   @Override
   public void c(cut $$0) {
      this.ai().a(ejb.j, this.dv(), ejb.a.a($$0));
   }
}
