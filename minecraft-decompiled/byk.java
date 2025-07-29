import javax.annotation.Nullable;

class byk extends byn {
   private final boolean c;

   public byk(byp $$0, int $$1, boolean $$2) {
      super($$0, $$1);
      this.c = $$2;
   }

   @Override
   public boolean a(aub $$0, cam $$1, int $$2) {
      if (this.c == $$1.eK()) {
         $$1.d(Math.max(4 << $$2, 0));
      } else {
         $$1.a($$0, $$1.ea().q(), 6 << $$2);
      }

      return true;
   }

   @Override
   public void a(aub $$0, @Nullable bzm $$1, @Nullable bzm $$2, cam $$3, int $$4, double $$5) {
      if (this.c == $$3.eK()) {
         int $$6 = (int)($$5 * (4 << $$4) + 0.5);
         $$3.d($$6);
      } else {
         int $$7 = (int)($$5 * (6 << $$4) + 0.5);
         if ($$1 == null) {
            $$3.a($$0, $$3.ea().q(), $$7);
         } else {
            $$3.a($$0, $$3.ea().c($$1, $$2), $$7);
         }
      }
   }
}
