public class hvt implements hva {
   public static final float a = 0.01F;
   public static final float b = 0.001F;
   public static final float c = 1.0E-4F;
   private static final int d = 0;
   private final gwi e;
   private final hwx f;
   private int g = 0;

   public hvt(gwi $$0, hwx $$1) {
      this.e = $$0;
      this.f = $$1;
   }

   @Override
   public void a() {
      this.g--;
      if (this.g <= 0 && this.e.bq()) {
         float $$0 = this.e.ai().A.i();
         if ($$0 < 1.0E-4F) {
            this.g = 0;
            this.f.a((hvr)(new hvu.a(this.e, ayz.C)));
         } else if ($$0 < 0.001F) {
            this.g = 0;
            this.f.a((hvr)(new hvu.a(this.e, ayz.B)));
         } else if ($$0 < 0.01F) {
            this.g = 0;
            this.f.a((hvr)(new hvu.a(this.e, ayz.A)));
         }
      }
   }
}
