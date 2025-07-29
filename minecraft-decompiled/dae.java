import javax.annotation.Nullable;

public interface dae {
   dae a = new dae() {
      @Override
      public void a(wj $$0) {
      }

      @Override
      public void a(dcv $$0) {
      }

      @Override
      public boolean b(dcv $$0) {
         return true;
      }
   };

   void a(dcv var1);

   void a(wj var1);

   boolean b(dcv var1);

   public static class a implements dae {
      private final wi.a b;
      @Nullable
      private dcv c = null;
      @Nullable
      private wj d = null;

      public a(wi.a $$0) {
         this.b = $$0;
      }

      @Override
      public void a(dcv $$0) {
         this.c = $$0.v();
         this.d = null;
      }

      @Override
      public void a(wj $$0) {
         this.c = null;
         this.d = $$0;
      }

      @Override
      public boolean b(dcv $$0) {
         if (this.c != null) {
            return dcv.a(this.c, $$0);
         } else if (this.d != null && this.d.a($$0, this.b)) {
            this.c = $$0.v();
            return true;
         } else {
            return false;
         }
      }

      public void a(dae.a $$0) {
         this.c = $$0.c;
         this.d = $$0.d;
      }
   }
}
