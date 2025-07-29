import com.google.common.annotations.VisibleForTesting;
import javax.annotation.Nullable;

public abstract class cth extends crv {
   protected static final alh<Boolean> a = all.a(cth.class, alj.k);
   public static final int b = 300;
   private static final boolean d = false;
   private static final boolean e = true;
   private static final int f = 0;
   protected int c = 0;

   public cth(bzv<? extends cth> $$0, dmu $$1) {
      super($$0, $$1);
      this.a_(true);
      this.n();
      this.a(fbc.n, 16.0F);
      this.a(fbc.o, -1.0F);
   }

   private void n() {
      if (clh.a(this)) {
         this.S().d(true);
      }
   }

   protected abstract boolean l();

   public void x(boolean $$0) {
      this.au().a(a, $$0);
   }

   protected boolean m() {
      return this.au().a(a);
   }

   @Override
   protected void a(all.a $$0) {
      super.a($$0);
      $$0.a(a, false);
   }

   @Override
   protected void a(fdc $$0) {
      super.a($$0);
      $$0.a("IsImmuneToZombification", this.m());
      $$0.a("TimeInOverworld", this.c);
   }

   @Override
   protected void a(fda $$0) {
      super.a($$0);
      this.a_($$0.a("CanPickUpLoot", true));
      this.x($$0.a("IsImmuneToZombification", false));
      this.c = $$0.a("TimeInOverworld", 0);
   }

   @Override
   protected void a(aub $$0) {
      super.a($$0);
      if (this.t()) {
         this.c++;
      } else {
         this.c = 0;
      }

      if (this.c > 300) {
         this.gK();
         this.g($$0);
      }
   }

   @VisibleForTesting
   public void b(int $$0) {
      this.c = $$0;
   }

   public boolean t() {
      return !this.ai().G_().b() && !this.m() && !this.gw();
   }

   protected void g(aub $$0) {
      this.a(bzv.bT, bzg.a(this, true, true), $$0x -> $$0x.a(new byq(bys.i, 200, 0)));
   }

   public boolean gH() {
      return !this.g_();
   }

   public abstract ctk gI();

   @Nullable
   @Override
   public cam e() {
      return this.U();
   }

   protected boolean gJ() {
      return this.fh().c(kq.A);
   }

   @Override
   public void X() {
      if (ctj.c(this)) {
         super.X();
      }
   }

   @Override
   protected void ah() {
      super.ah();
      ahj.a(this);
   }

   protected abstract void gK();
}
