public class hvk extends huz {
   private static final float n = 0.0F;
   private static final float o = 1.0F;
   private final cut p;
   private final cmt q;

   public hvk(cut $$0, cmt $$1) {
      super(ayz.mA, $$1.do(), hvr.t());
      this.p = $$0;
      this.q = $$1;
      this.k = hvr.a.a;
      this.i = true;
      this.j = 0;
      this.d = 0.0F;
   }

   @Override
   public boolean r() {
      return true;
   }

   @Override
   public void q() {
      if (!this.q.dU() && this.p.cc() && this.p.dm() == this.q) {
         float $$0 = (float)this.q.dA().g();
         if ($$0 >= 0.01F) {
            this.d = 5.0F * bcb.b(0.0F, 1.0F, $$0);
         } else {
            this.d = 0.0F;
         }
      } else {
         this.n();
      }
   }
}
