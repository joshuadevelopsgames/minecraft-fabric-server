import javax.annotation.Nullable;

public abstract class eas extends eaz implements bxc, bxm, bxn {
   private bxl d = bxl.a;
   @Nullable
   private xo e;

   protected eas(ebb<?> $$0, jb $$1, eeb $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   protected void a(fda $$0) {
      super.a($$0);
      this.d = bxl.a($$0);
      this.e = a($$0, "CustomName");
   }

   @Override
   protected void a(fdc $$0) {
      super.a($$0);
      this.d.a($$0);
      $$0.b("CustomName", xq.a, this.e);
   }

   @Override
   public xo aj() {
      return this.e != null ? this.e : this.j();
   }

   @Override
   public xo Q_() {
      return this.aj();
   }

   @Nullable
   @Override
   public xo al() {
      return this.e;
   }

   protected abstract xo j();

   public boolean d(cut $$0) {
      return a($$0, this.d, this.Q_());
   }

   public static boolean a(cut $$0, bxl $$1, xo $$2) {
      if (!$$0.am() && !$$1.a($$0.fh())) {
         $$0.a(xo.a("container.isLocked", $$2), true);
         $$0.a(ayz.eT, aza.e, 1.0F, 1.0F);
         return false;
      } else {
         return true;
      }
   }

   protected abstract ju<dcv> f();

   protected abstract void a(ju<dcv> var1);

   @Override
   public boolean c() {
      for (dcv $$0 : this.f()) {
         if (!$$0.f()) {
            return false;
         }
      }

      return true;
   }

   @Override
   public dcv a(int $$0) {
      return this.f().get($$0);
   }

   @Override
   public dcv a(int $$0, int $$1) {
      dcv $$2 = bxd.a(this.f(), $$0, $$1);
      if (!$$2.f()) {
         this.e();
      }

      return $$2;
   }

   @Override
   public dcv b(int $$0) {
      return bxd.a(this.f(), $$0);
   }

   @Override
   public void a(int $$0, dcv $$1) {
      this.f().set($$0, $$1);
      $$1.f(this.f_($$1));
      this.e();
   }

   @Override
   public boolean a(cut $$0) {
      return bxc.a(this, $$0);
   }

   @Override
   public void a() {
      this.f().clear();
   }

   @Nullable
   @Override
   public cym createMenu(int $$0, cus $$1, cut $$2) {
      return this.d($$2) ? this.a($$0, $$1) : null;
   }

   protected abstract cym a(int var1, cus var2);

   @Override
   protected void a(kl $$0) {
      super.a($$0);
      this.e = $$0.a(kq.g);
      this.d = $$0.a(kq.as, bxl.a);
      $$0.a(kq.ap, dfn.a).a(this.f());
   }

   @Override
   protected void a(kn.a $$0) {
      super.a($$0);
      $$0.a(kq.g, this.e);
      if (!this.d.equals(bxl.a)) {
         $$0.a(kq.as, this.d);
      }

      $$0.a(kq.ap, dfn.a(this.f()));
   }

   @Override
   public void b(fdc $$0) {
      $$0.c("CustomName");
      $$0.c("lock");
      $$0.c("Items");
   }
}
