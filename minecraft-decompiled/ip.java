import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.suggestion.SuggestionProvider;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

public class ip {
   private static final Map<ame, SuggestionProvider<eq>> d = new HashMap<>();
   private static final ame e = ame.b("ask_server");
   public static final SuggestionProvider<eq> a = a(e, ($$0, $$1) -> ((eq)$$0.getSource()).a($$0));
   public static final SuggestionProvider<eq> b = a(ame.b("available_sounds"), ($$0, $$1) -> eq.a(((eq)$$0.getSource()).s(), $$1));
   public static final SuggestionProvider<eq> c = a(
      ame.b("summonable_entities"), ($$0, $$1) -> eq.a(mm.f.s().filter($$1x -> $$1x.a(((eq)$$0.getSource()).v()) && $$1x.c()), $$1, bzv::a, bzv::h)
   );

   public static <S extends eq> SuggestionProvider<S> a(ame $$0, SuggestionProvider<eq> $$1) {
      SuggestionProvider<eq> $$2 = d.putIfAbsent($$0, $$1);
      if ($$2 != null) {
         throw new IllegalArgumentException("A command suggestion provider is already registered with the name '" + $$0 + "'");
      } else {
         return new ip.a($$0, $$1);
      }
   }

   public static <S extends eq> SuggestionProvider<S> a(SuggestionProvider<eq> $$0) {
      return (SuggestionProvider<S>)$$0;
   }

   public static <S extends eq> SuggestionProvider<S> a(ame $$0) {
      return a(d.getOrDefault($$0, a));
   }

   public static ame b(SuggestionProvider<?> $$0) {
      return $$0 instanceof ip.a $$1 ? $$1.a : e;
   }

   record a(ame a, SuggestionProvider<eq> b) implements SuggestionProvider<eq> {

      public CompletableFuture<Suggestions> getSuggestions(CommandContext<eq> $$0, SuggestionsBuilder $$1) throws CommandSyntaxException {
         return this.b.getSuggestions($$0, $$1);
      }
   }
}
