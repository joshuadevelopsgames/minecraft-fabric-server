import java.util.Collection;
import java.util.List;

public interface gbr extends fza, gbu {
   gbr.a w();

   default boolean D() {
      return true;
   }

   default Collection<? extends gbr> aO_() {
      return List.of(this);
   }

   public static enum a {
      a,
      b,
      c;

      public boolean a() {
         return this == c;
      }
   }
}
