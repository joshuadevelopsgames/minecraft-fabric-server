import javax.annotation.Nullable;

@FunctionalInterface
public interface cvp {
   cvp a = ($$0, $$1, $$2) -> {};
   cvp b = ($$0, $$1, $$2) -> {
      float $$3 = 170.0F + $$2.i() * 20.0F;
      $$0.i($$0.dA().c(-0.5));
      $$0.v($$0.dP() + $$3);
      $$0.aa += $$3;
      $$0.aE = true;
   };
   cvp c = ($$0, $$1, $$2) -> {
      if ($$1 != null) {
         fis $$3 = $$1.bW().d();
         $$0.i($$3);
         $$0.aE = true;
      }
   };
   cvp d = ($$0, $$1, $$2) -> {
      if ($$1 != null) {
         fis $$3 = $$1.dA().d();
         $$0.i($$3);
         $$0.aE = true;
      }
   };

   void deflect(cvo var1, @Nullable bzm var2, bck var3);
}
