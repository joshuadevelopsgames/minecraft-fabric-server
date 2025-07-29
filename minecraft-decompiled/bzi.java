public class bzi {
   public static final bzi a = new bzi(0.75F, 0.5F, 0.25F);
   public static final bzi b = new bzi(0.95F, 0.69F, 0.32F);
   private final float c;
   private final float d;
   private final float e;

   private bzi(float $$0, float $$1, float $$2) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
   }

   public bzi.a a(float $$0) {
      if ($$0 < this.e) {
         return bzi.a.d;
      } else if ($$0 < this.d) {
         return bzi.a.c;
      } else {
         return $$0 < this.c ? bzi.a.b : bzi.a.a;
      }
   }

   public bzi.a a(dcv $$0) {
      return !$$0.m() ? bzi.a.a : this.a($$0.o(), $$0.p());
   }

   public bzi.a a(int $$0, int $$1) {
      return this.a((float)($$1 - $$0) / $$1);
   }

   public static enum a {
      a,
      b,
      c,
      d;
   }
}
