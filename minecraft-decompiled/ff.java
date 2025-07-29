import com.mojang.brigadier.context.CommandContext;
import java.util.Arrays;
import java.util.Collection;

public class ff extends btb<vi> {
   private static final Collection<String> a = Arrays.asList("0", "0b", "0l", "0.0", "\"foo\"", "{foo=bar}", "[0]");
   private static final bsw<vi> b = vc.a(uw.a);

   private ff() {
      super(b);
   }

   public static ff a() {
      return new ff();
   }

   public static <S> vi a(CommandContext<S> $$0, String $$1) {
      return (vi)$$0.getArgument($$1, vi.class);
   }

   public Collection<String> getExamples() {
      return a;
   }
}
