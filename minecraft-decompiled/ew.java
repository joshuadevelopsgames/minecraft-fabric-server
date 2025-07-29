import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.Collection;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ew implements ArgumentType<ame> {
   private static final Collection<String> a = Stream.of(dmu.i, dmu.j).map($$0 -> $$0.a().toString()).collect(Collectors.toList());
   private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> xo.b("argument.dimension.invalid", $$0));

   public ame a(StringReader $$0) throws CommandSyntaxException {
      return ame.a($$0);
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      return $$0.getSource() instanceof eq ? eq.a(((eq)$$0.getSource()).t().stream().map(amd::a), $$1) : Suggestions.empty();
   }

   public Collection<String> getExamples() {
      return a;
   }

   public static ew a() {
      return new ew();
   }

   public static aub a(CommandContext<ek> $$0, String $$1) throws CommandSyntaxException {
      ame $$2 = (ame)$$0.getArgument($$1, ame.class);
      amd<dmu> $$3 = amd.a(mn.bu, $$2);
      aub $$4 = ((ek)$$0.getSource()).l().a($$3);
      if ($$4 == null) {
         throw b.create($$2);
      } else {
         return $$4;
      }
   }
}
