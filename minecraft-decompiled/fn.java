import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.Arrays;
import java.util.Collection;

public class fn implements ArgumentType<ame> {
   private static final Collection<String> a = Arrays.asList("foo", "foo:bar", "012");

   public static fn a() {
      return new fn();
   }

   public static ame a(CommandContext<ek> $$0, String $$1) {
      return (ame)$$0.getArgument($$1, ame.class);
   }

   public ame a(StringReader $$0) throws CommandSyntaxException {
      return ame.a($$0);
   }

   public Collection<String> getExamples() {
      return a;
   }
}
