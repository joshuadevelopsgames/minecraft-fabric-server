import java.util.function.Function;

public interface flp {
   float getAdvance();

   default float a(boolean $$0) {
      return this.getAdvance() + ($$0 ? this.a() : 0.0F);
   }

   default float a() {
      return 1.0F;
   }

   default float b() {
      return 1.0F;
   }

   gas bake(Function<flr, gas> var1);

   public interface a extends flp {
      @Override
      default gas bake(Function<flr, gas> $$0) {
         return gat.b;
      }
   }
}
