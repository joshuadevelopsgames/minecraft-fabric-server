import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.serialization.DynamicOps;
import java.util.Arrays;
import java.util.Collection;
import javax.annotation.Nullable;

public class eu extends btb<xo> {
   private static final Collection<String> b = Arrays.asList("\"hello world\"", "'hello world'", "\"\"", "{text:\"hello world\"}", "[\"\"]");
   public static final DynamicCommandExceptionType a = new DynamicCommandExceptionType($$0 -> xo.b("argument.component.invalid", $$0));
   private static final DynamicOps<vi> c = uw.a;
   private static final bsw<vi> d = vc.a(c);

   private eu(jn.a $$0) {
      super(d.a($$0.a(c), d, xq.a, a));
   }

   public static xo a(CommandContext<ek> $$0, String $$1) {
      return (xo)$$0.getArgument($$1, xo.class);
   }

   public static xo a(CommandContext<ek> $$0, String $$1, @Nullable bzm $$2) throws CommandSyntaxException {
      return xr.a((ek)$$0.getSource(), a($$0, $$1), $$2, 0);
   }

   public static xo b(CommandContext<ek> $$0, String $$1) throws CommandSyntaxException {
      return a($$0, $$1, ((ek)$$0.getSource()).f());
   }

   public static eu a(eg $$0) {
      return new eu($$0);
   }

   public Collection<String> getExamples() {
      return b;
   }
}
