import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.concurrent.CompletableFuture;

public class gr implements ArgumentType<gm> {
   private static final Collection<String> c = Arrays.asList("0 0 0", "~ ~ ~", "^ ^ ^", "^1 ^ ^-5", "0.1 -0.5 .9", "~0.5 ~1 ~-5");
   public static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(xo.c("argument.pos3d.incomplete"));
   public static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(xo.c("argument.pos.mixed"));
   private final boolean d;

   public gr(boolean $$0) {
      this.d = $$0;
   }

   public static gr a() {
      return new gr(true);
   }

   public static gr a(boolean $$0) {
      return new gr($$0);
   }

   public static fis a(CommandContext<ek> $$0, String $$1) {
      return ((gm)$$0.getArgument($$1, gm.class)).a((ek)$$0.getSource());
   }

   public static gm b(CommandContext<ek> $$0, String $$1) {
      return (gm)$$0.getArgument($$1, gm.class);
   }

   public gm a(StringReader $$0) throws CommandSyntaxException {
      return (gm)($$0.canRead() && $$0.peek() == '^' ? gn.a($$0) : gt.a($$0, this.d));
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      if (!($$0.getSource() instanceof eq)) {
         return Suggestions.empty();
      } else {
         String $$2 = $$1.getRemaining();
         Collection<eq.b> $$3;
         if (!$$2.isEmpty() && $$2.charAt(0) == '^') {
            $$3 = Collections.singleton(eq.b.a);
         } else {
            $$3 = ((eq)$$0.getSource()).B();
         }

         return eq.a($$2, $$3, $$1, el.a(this::a));
      }
   }

   public Collection<String> getExamples() {
      return c;
   }
}
