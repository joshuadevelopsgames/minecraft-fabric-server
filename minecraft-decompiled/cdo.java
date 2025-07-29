public abstract class cdo<E extends cam> implements cce<E>, cft<E> {
   private ccd.a a;

   public cdo() {
      this.a = ccd.a.a;
   }

   @Override
   public final ccd.a a() {
      return this.a;
   }

   @Override
   public final boolean e(aub $$0, E $$1, long $$2) {
      if (this.trigger($$0, $$1, $$2)) {
         this.a = ccd.a.b;
         return true;
      } else {
         return false;
      }
   }

   @Override
   public final void f(aub $$0, E $$1, long $$2) {
      this.g($$0, $$1, $$2);
   }

   @Override
   public final void g(aub $$0, E $$1, long $$2) {
      this.a = ccd.a.a;
   }

   @Override
   public String b() {
      return this.getClass().getSimpleName();
   }
}
