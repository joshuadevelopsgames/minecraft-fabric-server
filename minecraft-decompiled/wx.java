import io.netty.buffer.ByteBuf;
import java.util.function.Function;

public class wx extends wg {
   private final jz d;

   public wx(ByteBuf $$0, jz $$1) {
      super($$0);
      this.d = $$1;
   }

   public jz H() {
      return this.d;
   }

   public static Function<ByteBuf, wx> a(jz $$0) {
      return $$1 -> new wx($$1, $$0);
   }
}
