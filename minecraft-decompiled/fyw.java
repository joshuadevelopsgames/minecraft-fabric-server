import javax.annotation.Nullable;

public class fyw extends fxm {
   @Nullable
   protected fzd a;
   protected boolean b;

   public fyw(int $$0, int $$1, int $$2, int $$3, boolean $$4) {
      super($$0, $$1, $$2, $$3, xn.a);
      this.b = $$4;
   }

   public void a(fzd $$0) {
      this.a = $$0;
   }

   public void b(boolean $$0) {
      this.b = $$0;
   }

   public boolean a() {
      return this.b;
   }

   @Override
   public void a(gbt $$0) {
      this.c($$0);
   }

   @Override
   public void b(fxb $$0, int $$1, int $$2, float $$3) {
      if (this.a != null) {
         $$0.a(gxx.ar, this.a.a(this.b, this.C()), this.E(), this.F(), this.g, this.h);
      }
   }
}
