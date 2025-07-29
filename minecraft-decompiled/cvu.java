import javax.annotation.Nullable;

public class cvu extends cvb {
   private static final int d = 200;
   private int f = 200;

   public cvu(bzv<? extends cvu> $$0, dmu $$1) {
      super($$0, $$1);
   }

   public cvu(dmu $$0, cam $$1, dcv $$2, @Nullable dcv $$3) {
      super(bzv.bp, $$1, $$0, $$2, $$3);
   }

   public cvu(dmu $$0, double $$1, double $$2, double $$3, dcv $$4, @Nullable dcv $$5) {
      super(bzv.bp, $$1, $$2, $$3, $$0, $$4, $$5);
   }

   @Override
   public void g() {
      super.g();
      if (this.ai().C && !this.e()) {
         this.ai().a(me.T, this.dC(), this.dE(), this.dI(), 0.0, 0.0, 0.0);
      }
   }

   @Override
   protected void a(cam $$0) {
      super.a($$0);
      byq $$1 = new byq(bys.x, this.f, 0);
      $$0.b($$1, this.y());
   }

   @Override
   protected void a(fda $$0) {
      super.a($$0);
      this.f = $$0.a("Duration", 200);
   }

   @Override
   protected void a(fdc $$0) {
      super.a($$0);
      $$0.a("Duration", this.f);
   }

   @Override
   protected dcv n() {
      return new dcv(dcz.wS);
   }
}
