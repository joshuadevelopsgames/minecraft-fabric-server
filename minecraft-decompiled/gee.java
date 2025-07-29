import javax.annotation.Nullable;

public class gee extends get {
   @Nullable
   private fxz a;

   public gee(xo $$0) {
      super($$0);
   }

   @Override
   protected void aV_() {
      this.a = this.c(new fxz(this.o, this.m, this.q, 12));
      this.c();
   }

   @Override
   protected void c() {
      if (this.a != null) {
         this.a.b(this.o);
         this.a.c(this.o / 2 - this.a.z() / 2, this.p / 2 - 9 / 2);
      }
   }

   @Override
   public boolean aG_() {
      return false;
   }

   @Override
   protected boolean aR_() {
      return false;
   }

   @Override
   public void b(fxb $$0, int $$1, int $$2, float $$3) {
      this.a($$0, $$3);
      this.b($$0);
      this.a($$0);
   }
}
