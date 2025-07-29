public class gqr {
   public static final gqr a = new gqr(0.0F);
   final float b;
   final float c;
   final float d;

   public gqr(float $$0, float $$1, float $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   public gqr(float $$0) {
      this($$0, $$0, $$0);
   }

   public gqr a(float $$0) {
      return new gqr(this.b + $$0, this.c + $$0, this.d + $$0);
   }

   public gqr a(float $$0, float $$1, float $$2) {
      return new gqr(this.b + $$0, this.c + $$1, this.d + $$2);
   }
}
