import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.Arrays;
import java.util.Collection;
import java.util.concurrent.CompletableFuture;

public class fj implements ArgumentType<mc> {
   private static final Collection<String> c = Arrays.asList("foo", "foo:bar", "particle{foo:bar}");
   public static final DynamicCommandExceptionType a = new DynamicCommandExceptionType($$0 -> xo.b("particle.notFound", $$0));
   public static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> xo.b("particle.invalidOptions", $$0));
   private final jn.a d;
   private static final vj<?> e = vj.a(uw.a);

   public fj(eg $$0) {
      this.d = $$0;
   }

   public static fj a(eg $$0) {
      return new fj($$0);
   }

   public static mc a(CommandContext<ek> $$0, String $$1) {
      return (mc)$$0.getArgument($$1, mc.class);
   }

   public mc a(StringReader $$0) throws CommandSyntaxException {
      return a($$0, this.d);
   }

   public Collection<String> getExamples() {
      return c;
   }

   public static mc a(StringReader $$0, jn.a $$1) throws CommandSyntaxException {
      md<?> $$2 = a($$0, $$1.e(mn.ab));
      return a(e, $$0, (md<mc>)$$2, $$1);
   }

   private static md<?> a(StringReader $$0, jn<md<?>> $$1) throws CommandSyntaxException {
      ame $$2 = ame.a($$0);
      amd<md<?>> $$3 = amd.a(mn.ab, $$2);
      return $$1.a($$3).orElseThrow(() -> a.createWithContext($$0, $$2)).a();
   }

   private static <T extends mc, O> T a(vj<O> $$0, StringReader $$1, md<T> $$2, jn.a $$3) throws CommandSyntaxException {
      amc<O> $$4 = $$3.a($$0.a());
      O $$5;
      if ($$1.canRead() && $$1.peek() == '{') {
         $$5 = $$0.b($$1);
      } else {
         $$5 = $$4.emptyMap();
      }

      return (T)$$2.c().codec().parse($$4, $$5).getOrThrow(b::create);
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      jn.b<md<?>> $$2 = this.d.e(mn.ab);
      return eq.a($$2.d_().map(amd::a), $$1);
   }
}
