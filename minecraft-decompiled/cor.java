import javax.annotation.Nullable;

public class cor extends cop {
   public cor(bzv<? extends cor> $$0, dmu $$1) {
      super($$0, $$1);
   }

   @Override
   protected ayy p() {
      return ayz.hD;
   }

   @Override
   protected ayy hg() {
      return ayz.hE;
   }

   @Override
   protected ayy f_() {
      return ayz.hG;
   }

   @Nullable
   @Override
   protected ayy gJ() {
      return ayz.hH;
   }

   @Override
   protected ayy e(byb $$0) {
      return ayz.hI;
   }

   @Override
   public boolean a(cmd $$0) {
      if ($$0 == this) {
         return false;
      } else {
         return !($$0 instanceof cor) && !($$0 instanceof cos) ? false : this.hp() && ((coq)$$0).hp();
      }
   }

   @Override
   protected void ho() {
      this.a(ayz.hJ, 0.4F, 1.0F);
   }

   @Nullable
   @Override
   public bzc a(aub $$0, bzc $$1) {
      bzv<? extends coq> $$2 = $$1 instanceof cos ? bzv.aH : bzv.J;
      coq $$3 = $$2.a($$0, bzu.e);
      if ($$3 != null) {
         this.a($$1, $$3);
      }

      return $$3;
   }
}
