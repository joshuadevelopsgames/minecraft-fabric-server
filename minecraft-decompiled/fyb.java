import javax.annotation.Nullable;

public abstract class fyb extends fxm {
   fyb(int $$0, int $$1, int $$2, int $$3) {
      super($$0, $$1, $$2, $$3, xn.a);
   }

   public static fyb a(int $$0, int $$1, ame $$2, int $$3, int $$4) {
      return new fyb.b(0, 0, $$0, $$1, $$2, $$3, $$4);
   }

   public static fyb a(int $$0, int $$1, ame $$2) {
      return new fyb.a(0, 0, $$0, $$1, $$2);
   }

   @Override
   protected void a(gbt $$0) {
   }

   @Override
   public void a(hwx $$0) {
   }

   @Override
   public boolean D() {
      return false;
   }

   public abstract void a(ame var1);

   @Nullable
   @Override
   public fwy a(gbz $$0) {
      return null;
   }

   static class a extends fyb {
      private ame a;

      public a(int $$0, int $$1, int $$2, int $$3, ame $$4) {
         super($$0, $$1, $$2, $$3);
         this.a = $$4;
      }

      @Override
      public void b(fxb $$0, int $$1, int $$2, float $$3) {
         $$0.a(gxx.ar, this.a, this.E(), this.F(), this.z(), this.y());
      }

      @Override
      public void a(ame $$0) {
         this.a = $$0;
      }
   }

   static class b extends fyb {
      private ame a;
      private final int b;
      private final int c;

      public b(int $$0, int $$1, int $$2, int $$3, ame $$4, int $$5, int $$6) {
         super($$0, $$1, $$2, $$3);
         this.a = $$4;
         this.b = $$5;
         this.c = $$6;
      }

      @Override
      protected void b(fxb $$0, int $$1, int $$2, float $$3) {
         $$0.a(gxx.ar, this.a, this.E(), this.F(), 0.0F, 0.0F, this.z(), this.y(), this.b, this.c);
      }

      @Override
      public void a(ame $$0) {
         this.a = $$0;
      }
   }
}
