import java.util.function.Predicate;
import javax.annotation.Nullable;

public class eej implements Predicate<eeb> {
   private final dpz a;

   public eej(dpz $$0) {
      this.a = $$0;
   }

   public static eej a(dpz $$0) {
      return new eej($$0);
   }

   public boolean a(@Nullable eeb $$0) {
      return $$0 != null && $$0.a(this.a);
   }
}
