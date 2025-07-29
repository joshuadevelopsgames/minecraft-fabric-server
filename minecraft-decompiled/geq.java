import javax.annotation.Nullable;

public class geq extends get implements bcj {
   @Nullable
   private xo a;
   @Nullable
   private xo b;
   private int c;
   private boolean d;
   private final boolean e;

   public geq(boolean $$0) {
      super(ftv.a);
      this.e = $$0;
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
   public void a(xo $$0) {
      this.b($$0);
   }

   @Override
   public void b(xo $$0) {
      this.a = $$0;
      this.c(xo.c("menu.working"));
   }

   @Override
   public void c(xo $$0) {
      this.b = $$0;
      this.a(0);
   }

   @Override
   public void a(int $$0) {
      this.c = $$0;
   }

   @Override
   public void a() {
      this.d = true;
   }

   @Override
   public void a(fxb $$0, int $$1, int $$2, float $$3) {
      if (this.d) {
         if (this.e) {
            this.n.a(null);
         }
      } else {
         super.a($$0, $$1, $$2, $$3);
         if (this.a != null) {
            $$0.a(this.q, this.a, this.o / 2, 70, -1);
         }

         if (this.b != null && this.c != 0) {
            $$0.a(this.q, xo.i().b(this.b).f(" " + this.c + "%"), this.o / 2, 90, -1);
         }
      }
   }
}
