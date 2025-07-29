import javax.annotation.Nullable;

public class fye extends fxm {
   private final fwz a;

   public fye(fwz $$0, xo $$1) {
      super(0, 0, $$0.a($$1), 9 * 3, $$1);
      this.a = $$0;
   }

   @Override
   protected void b(fxb $$0, int $$1, int $$2, float $$3) {
      int $$4 = this.E() + this.z() / 2;
      int $$5 = this.F() + this.y() / 2;
      xo $$6 = this.A();
      $$0.b(this.a, $$6, $$4 - this.a.a($$6) / 2, $$5 - 9, -1);
      String $$7 = gei.a(ag.c());
      $$0.b(this.a, $$7, $$4 - this.a.b($$7) / 2, $$5 + 9, -8355712);
   }

   @Override
   protected void a(gbt $$0) {
   }

   @Override
   public void a(hwx $$0) {
   }

   @Override
   public boolean D() {
      return false;
   }

   @Nullable
   @Override
   public fwy a(gbz $$0) {
      return null;
   }
}
