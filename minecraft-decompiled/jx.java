import com.mojang.serialization.Lifecycle;
import java.util.Optional;

public record jx(Optional<awv> b, Lifecycle c) {
   public static final jx a = new jx(Optional.empty(), Lifecycle.stable());

   public Optional<awv> a() {
      return this.b;
   }

   public Lifecycle b() {
      return this.c;
   }
}
