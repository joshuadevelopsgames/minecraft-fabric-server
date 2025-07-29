public class hvh extends huz {
   private final bzm n;

   public hvh(ayy $$0, aza $$1, float $$2, float $$3, bzm $$4, long $$5) {
      super($$0, $$1, bck.a($$5));
      this.d = $$2;
      this.e = $$3;
      this.n = $$4;
      this.f = (float)this.n.dC();
      this.g = (float)this.n.dE();
      this.h = (float)this.n.dI();
   }

   @Override
   public boolean s() {
      return !this.n.be();
   }

   @Override
   public void q() {
      if (this.n.dU()) {
         this.n();
      } else {
         this.f = (float)this.n.dC();
         this.g = (float)this.n.dE();
         this.h = (float)this.n.dI();
      }
   }
}
