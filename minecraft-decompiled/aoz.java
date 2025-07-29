@FunctionalInterface
public interface aoz {
   void perform(ek var1, bzm var2);

   public record a(bzm a, ex.a b) implements aoz {
      @Override
      public void perform(ek $$0, bzm $$1) {
         if ($$1 instanceof auc $$2) {
            $$2.a($$0.m(), this.a, this.b);
         } else {
            $$1.a($$0.m(), this.b.a(this.a));
         }
      }
   }

   public record b(fis a) implements aoz {
      @Override
      public void perform(ek $$0, bzm $$1) {
         $$1.a($$0.m(), this.a);
      }
   }
}
