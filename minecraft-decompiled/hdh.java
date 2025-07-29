import java.util.function.UnaryOperator;

public class hdh extends hcs {
   private final gof a;
   private final ame h;
   private final gnh<hjy> i;

   public hdh(hee.a $$0, gql $$1) {
      super($$0);
      this.h = $$1.a().a((UnaryOperator<String>)($$0x -> "textures/entity/" + $$0x + ".png"));
      this.a = new gof.a($$0.a(gqm.E), $$0x -> gxz.i());
      this.i = new gmk($$0.a($$1));
   }

   @Override
   protected gnh<hjy> a() {
      return this.i;
   }

   @Override
   protected gxz b() {
      return this.i.a(this.h);
   }

   @Override
   protected void b(hjy $$0, fod $$1, gxn $$2, int $$3) {
      if (!$$0.f) {
         this.a.a($$1, $$2.getBuffer(this.a.a(this.h)), $$3, hri.d);
      }
   }
}
