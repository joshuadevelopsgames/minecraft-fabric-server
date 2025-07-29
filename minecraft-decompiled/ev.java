import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.Arrays;
import java.util.Collection;

public class ev implements ArgumentType<ui> {
   private static final Collection<String> a = Arrays.asList("{}", "{foo=bar}");

   private ev() {
   }

   public static ev a() {
      return new ev();
   }

   public static <S> ui a(CommandContext<S> $$0, String $$1) {
      return (ui)$$0.getArgument($$1, ui.class);
   }

   public ui a(StringReader $$0) throws CommandSyntaxException {
      return vj.c($$0);
   }

   public Collection<String> getExamples() {
      return a;
   }
}
