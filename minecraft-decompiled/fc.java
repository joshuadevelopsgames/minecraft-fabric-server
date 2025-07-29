import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.text.MessageFormat;
import java.util.Arrays;
import java.util.Collection;
import java.util.concurrent.CompletableFuture;

public class fc implements ArgumentType<Integer> {
   private static final Collection<String> b = Arrays.asList("F00", "FF0000");
   public static final DynamicCommandExceptionType a = new DynamicCommandExceptionType($$0 -> xo.b("argument.hexcolor.invalid", $$0));

   private fc() {
   }

   public static fc a() {
      return new fc();
   }

   public static Integer a(CommandContext<ek> $$0, String $$1) {
      return (Integer)$$0.getArgument($$1, Integer.class);
   }

   public Integer a(StringReader $$0) throws CommandSyntaxException {
      String $$1 = $$0.readUnquotedString();

      return switch ($$1.length()) {
         case 3 -> baj.a(
            Integer.valueOf(MessageFormat.format("{0}{0}", $$1.charAt(0)), 16),
            Integer.valueOf(MessageFormat.format("{0}{0}", $$1.charAt(1)), 16),
            Integer.valueOf(MessageFormat.format("{0}{0}", $$1.charAt(2)), 16)
         );
         case 6 -> baj.a(Integer.valueOf($$1.substring(0, 2), 16), Integer.valueOf($$1.substring(2, 4), 16), Integer.valueOf($$1.substring(4, 6), 16));
         default -> throw a.createWithContext($$0, $$1);
      };
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      return eq.b(b, $$1);
   }

   public Collection<String> getExamples() {
      return b;
   }
}
