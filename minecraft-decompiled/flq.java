import it.unimi.dsi.fastutil.ints.IntSet;
import javax.annotation.Nullable;

public interface flq extends AutoCloseable {
   float a = 7.0F;

   @Override
   default void close() {
   }

   @Nullable
   default flp a(int $$0) {
      return null;
   }

   IntSet a();

   public record a(flq a, gan.a b) implements AutoCloseable {
      @Override
      public void close() {
         this.a.close();
      }
   }
}
