import javax.annotation.Nullable;

public record etm(eke.c[] a) implements eke.c {
   @Nullable
   @Override
   public eeb calculate(ejt.b $$0) {
      for (eke.c $$1 : this.a) {
         eeb $$2 = $$1.calculate($$0);
         if ($$2 != null) {
            return $$2;
         }
      }

      return null;
   }
}
