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

public class gk implements ArgumentType<gm> {
   private static final Collection<String> d = Arrays.asList("0 0 0", "~ ~ ~", "^ ^ ^", "^1 ^ ^-5", "~0.5 ~1 ~-5");
   public static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(xo.c("argument.pos.unloaded"));
   public static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(xo.c("argument.pos.outofworld"));
   public static final SimpleCommandExceptionType c = new SimpleCommandExceptionType(xo.c("argument.pos.outofbounds"));

   public static gk a() {
      return new gk();
   }

   public static jb a(CommandContext<ek> $$0, String $$1) throws CommandSyntaxException {
      aub $$2 = ((ek)$$0.getSource()).e();
      return a($$0, $$2, $$1);
   }

   public static jb a(CommandContext<ek> $$0, aub $$1, String $$2) throws CommandSyntaxException {
      jb $$3 = b($$0, $$2);
      if (!$$1.D($$3)) {
         throw a.create();
      } else if (!$$1.k($$3)) {
         throw b.create();
      } else {
         return $$3;
      }
   }

   public static jb b(CommandContext<ek> $$0, String $$1) {
      return ((gm)$$0.getArgument($$1, gm.class)).c((ek)$$0.getSource());
   }

   public static jb c(CommandContext<ek> $$0, String $$1) throws CommandSyntaxException {
      jb $$2 = b($$0, $$1);
      if (!dmu.l($$2)) {
         throw c.create();
      } else {
         return $$2;
      }
   }

   public gm a(StringReader $$0) throws CommandSyntaxException {
      return (gm)($$0.canRead() && $$0.peek() == '^' ? gn.a($$0) : gt.a($$0));
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
            $$3 = ((eq)$$0.getSource()).A();
         }

         return eq.a($$2, $$3, $$1, el.a(this::a));
      }
   }

   public Collection<String> getExamples() {
      return d;
   }
}
