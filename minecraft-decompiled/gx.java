import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.Arrays;
import java.util.Collection;
import java.util.concurrent.CompletableFuture;

public class gx implements ArgumentType<gy> {
   private static final Collection<String> a = Arrays.asList("stick", "minecraft:stick", "stick{foo=bar}");
   private final gz b;

   public gx(eg $$0) {
      this.b = new gz($$0);
   }

   public static gx a(eg $$0) {
      return new gx($$0);
   }

   public gy a(StringReader $$0) throws CommandSyntaxException {
      gz.a $$1 = this.b.a($$0);
      return new gy($$1.a(), $$1.b());
   }

   public static <S> gy a(CommandContext<S> $$0, String $$1) {
      return (gy)$$0.getArgument($$1, gy.class);
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      return this.b.a($$1);
   }

   public Collection<String> getExamples() {
      return a;
   }
}
