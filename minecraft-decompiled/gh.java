import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.Arrays;
import java.util.Collection;
import java.util.concurrent.CompletableFuture;

public class gh implements ArgumentType<gf> {
   private static final Collection<String> a = Arrays.asList("stone", "minecraft:stone", "stone[foo=bar]", "foo{bar=baz}");
   private final jn<dpz> b;

   public gh(eg $$0) {
      this.b = $$0.e(mn.i);
   }

   public static gh a(eg $$0) {
      return new gh($$0);
   }

   public gf a(StringReader $$0) throws CommandSyntaxException {
      gi.a $$1 = gi.a(this.b, $$0, true);
      return new gf($$1.a(), $$1.b().keySet(), $$1.c());
   }

   public static gf a(CommandContext<ek> $$0, String $$1) {
      return (gf)$$0.getArgument($$1, gf.class);
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      return gi.a(this.b, $$1, false, true);
   }

   public Collection<String> getExamples() {
      return a;
   }
}
