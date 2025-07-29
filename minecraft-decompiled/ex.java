import com.google.common.collect.Maps;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.function.BiFunction;
import javax.annotation.Nullable;

public class ex implements ArgumentType<ex.a> {
   private static final Collection<String> a = Arrays.asList("eyes", "feet");
   private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> xo.b("argument.anchor.invalid", $$0));

   public static ex.a a(CommandContext<ek> $$0, String $$1) {
      return (ex.a)$$0.getArgument($$1, ex.a.class);
   }

   public static ex a() {
      return new ex();
   }

   public ex.a a(StringReader $$0) throws CommandSyntaxException {
      int $$1 = $$0.getCursor();
      String $$2 = $$0.readUnquotedString();
      ex.a $$3 = ex.a.a($$2);
      if ($$3 == null) {
         $$0.setCursor($$1);
         throw b.createWithContext($$0, $$2);
      } else {
         return $$3;
      }
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      return eq.b(ex.a.c.keySet(), $$1);
   }

   public Collection<String> getExamples() {
      return a;
   }

   public static enum a {
      a("feet", ($$0, $$1) -> $$0),
      b("eyes", ($$0, $$1) -> new fis($$0.d, $$0.e + $$1.cW(), $$0.f));

      static final Map<String, ex.a> c = ag.a(Maps.newHashMap(), $$0 -> {
         for (ex.a $$1 : values()) {
            $$0.put($$1.d, $$1);
         }
      });
      private final String d;
      private final BiFunction<fis, bzm, fis> e;

      private a(final String $$0, final BiFunction<fis, bzm, fis> $$1) {
         this.d = $$0;
         this.e = $$1;
      }

      @Nullable
      public static ex.a a(String $$0) {
         return c.get($$0);
      }

      public fis a(bzm $$0) {
         return this.e.apply($$0.dv(), $$0);
      }

      public fis a(ek $$0) {
         bzm $$1 = $$0.f();
         return $$1 == null ? $$0.d() : this.e.apply($$0.d(), $$1);
      }
   }
}
