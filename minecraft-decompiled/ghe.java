import java.util.Objects;

public class ghe extends ggi implements ghg<czs> {
   private final czs x;
   private final cza y = new cza() {
      @Override
      public void a(cym $$0, int $$1, dcv $$2) {
         ghe.this.K();
      }

      @Override
      public void a(cym $$0, int $$1, int $$2) {
         if ($$1 == 0) {
            ghe.this.L();
         }
      }
   };

   public ghe(czs $$0, cus $$1, xo $$2) {
      this.x = $$0;
   }

   public czs H() {
      return this.x;
   }

   @Override
   protected void aV_() {
      super.aV_();
      this.x.a(this.y);
   }

   @Override
   public void aP_() {
      this.n.t.p();
      super.aP_();
   }

   @Override
   public void aI_() {
      super.aI_();
      this.x.b(this.y);
   }

   @Override
   protected void l() {
      if (this.n.t.gF()) {
         this.c(fxo.a(xn.d, $$0 -> this.aP_()).a(this.o / 2 - 100, 196, 98, 20).a());
         this.c(fxo.a(xo.c("lectern.take_book"), $$0 -> this.g(3)).a(this.o / 2 + 2, 196, 98, 20).a());
      } else {
         super.l();
      }
   }

   @Override
   protected void E() {
      this.g(1);
   }

   @Override
   protected void F() {
      this.g(2);
   }

   @Override
   protected boolean b(int $$0) {
      if ($$0 != this.x.m()) {
         this.g(100 + $$0);
         return true;
      } else {
         return false;
      }
   }

   private void g(int $$0) {
      this.n.r.a(this.x.l, $$0);
   }

   @Override
   public boolean aQ_() {
      return false;
   }

   @Override
   void K() {
      dcv $$0 = this.x.l();
      this.a(Objects.requireNonNullElse(ggi.a.a($$0), ggi.d));
   }

   void L() {
      this.a(this.x.m());
   }

   @Override
   protected void G() {
      this.n.t.p();
   }
}
