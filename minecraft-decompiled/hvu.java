public class hvu {
   public static class a extends huz {
      private final gwi n;

      protected a(gwi $$0, ayy $$1) {
         super($$1, aza.i, hvr.t());
         this.n = $$0;
         this.i = false;
         this.j = 0;
         this.d = 1.0F;
         this.l = true;
      }

      @Override
      public void q() {
         if (this.n.dU() || !this.n.bq()) {
            this.n();
         }
      }
   }

   public static class b extends huz {
      public static final int n = 40;
      private final gwi o;
      private int p;

      public b(gwi $$0) {
         super(ayz.z, aza.i, hvr.t());
         this.o = $$0;
         this.i = true;
         this.j = 0;
         this.d = 1.0F;
         this.l = true;
      }

      @Override
      public void q() {
         if (!this.o.dU() && this.p >= 0) {
            if (this.o.bq()) {
               this.p++;
            } else {
               this.p -= 2;
            }

            this.p = Math.min(this.p, 40);
            this.d = Math.max(0.0F, Math.min(this.p / 40.0F, 1.0F));
         } else {
            this.n();
         }
      }
   }
}
