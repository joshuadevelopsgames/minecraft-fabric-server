public class lr extends lm {
   private final ddp c;
   private final ddp.a d;

   public lr(dcr $$0) {
      if ($$0 instanceof ddp $$1) {
         this.c = $$1;
         this.d = $$1.a();
      } else {
         throw new IllegalArgumentException($$0 + " not instance of " + ddp.class.getSimpleName());
      }
   }

   @Override
   public dcv a(lk $$0, dcv $$1) {
      aub $$2 = $$0.b();
      jh $$3 = $$0.d().c(dsf.b);
      jv $$4 = this.d.b().getDispensePosition($$0, $$3);
      cvo.a(this.c.a($$2, $$4, $$1, $$3), $$2, $$1, $$3.j(), $$3.k(), $$3.l(), this.d.d(), this.d.c());
      $$1.h(1);
      return $$1;
   }

   @Override
   protected void a(lk $$0) {
      $$0.b().c(this.d.e().orElse(1002), $$0.c(), 0);
   }
}
