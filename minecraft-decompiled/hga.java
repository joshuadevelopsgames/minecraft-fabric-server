import java.util.function.UnaryOperator;

public class hga extends hcs {
   private final gnh<hjy> a;
   private final ame h;

   public hga(hee.a $$0, gql $$1) {
      super($$0);
      this.h = $$1.a().a((UnaryOperator<String>)($$0x -> "textures/entity/" + $$0x + ".png"));
      this.a = new gow($$0.a($$1));
   }

   @Override
   protected gnh<hjy> a() {
      return this.a;
   }

   @Override
   protected gxz b() {
      return this.a.a(this.h);
   }
}
