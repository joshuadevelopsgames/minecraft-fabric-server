public abstract class cpv extends cpu {
   public cpv(cps $$0) {
      super($$0);
   }

   @Override
   public boolean a() {
      return true;
   }

   @Override
   public float a(byb $$0, float $$1) {
      if (!($$0.c() instanceof cvb) && !($$0.c() instanceof cwh)) {
         return super.a($$0, $$1);
      } else {
         $$0.c().e(1.0F);
         return 0.0F;
      }
   }
}
