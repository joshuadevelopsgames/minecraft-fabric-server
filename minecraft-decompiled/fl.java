import com.google.gson.JsonObject;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType;
import com.mojang.brigadier.exceptions.Dynamic3CommandExceptionType;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.Arrays;
import java.util.Collection;
import java.util.concurrent.CompletableFuture;

public class fl<T> implements ArgumentType<jl.c<T>> {
   private static final Collection<String> c = Arrays.asList("foo", "foo:bar", "012");
   private static final DynamicCommandExceptionType d = new DynamicCommandExceptionType($$0 -> xo.b("entity.not_summonable", $$0));
   public static final Dynamic2CommandExceptionType a = new Dynamic2CommandExceptionType(($$0, $$1) -> xo.b("argument.resource.not_found", $$0, $$1));
   public static final Dynamic3CommandExceptionType b = new Dynamic3CommandExceptionType(
      ($$0, $$1, $$2) -> xo.b("argument.resource.invalid_type", $$0, $$1, $$2)
   );
   final amd<? extends jy<T>> e;
   private final jn<T> f;

   public fl(eg $$0, amd<? extends jy<T>> $$1) {
      this.e = $$1;
      this.f = $$0.e($$1);
   }

   public static <T> fl<T> a(eg $$0, amd<? extends jy<T>> $$1) {
      return new fl<>($$0, $$1);
   }

   public static <T> jl.c<T> a(CommandContext<ek> $$0, String $$1, amd<jy<T>> $$2) throws CommandSyntaxException {
      jl.c<T> $$3 = (jl.c<T>)$$0.getArgument($$1, jl.c.class);
      amd<?> $$4 = $$3.h();
      if ($$4.c($$2)) {
         return $$3;
      } else {
         throw b.create($$4.a(), $$4.b(), $$2.a());
      }
   }

   public static jl.c<cbn> a(CommandContext<ek> $$0, String $$1) throws CommandSyntaxException {
      return a($$0, $$1, mn.c);
   }

   public static jl.c<ems<?, ?>> b(CommandContext<ek> $$0, String $$1) throws CommandSyntaxException {
      return a($$0, $$1, mn.aP);
   }

   public static jl.c<euy> c(CommandContext<ek> $$0, String $$1) throws CommandSyntaxException {
      return a($$0, $$1, mn.bj);
   }

   public static jl.c<bzv<?>> d(CommandContext<ek> $$0, String $$1) throws CommandSyntaxException {
      return a($$0, $$1, mn.D);
   }

   public static jl.c<bzv<?>> e(CommandContext<ek> $$0, String $$1) throws CommandSyntaxException {
      jl.c<bzv<?>> $$2 = a($$0, $$1, mn.D);
      if (!$$2.a().c()) {
         throw d.create($$2.h().a().toString());
      } else {
         return $$2;
      }
   }

   public static jl.c<byo> f(CommandContext<ek> $$0, String $$1) throws CommandSyntaxException {
      return a($$0, $$1, mn.Z);
   }

   public static jl.c<dji> g(CommandContext<ek> $$0, String $$1) throws CommandSyntaxException {
      return a($$0, $$1, mn.aW);
   }

   public jl.c<T> a(StringReader $$0) throws CommandSyntaxException {
      ame $$1 = ame.a($$0);
      amd<T> $$2 = amd.a(this.e, $$1);
      return this.f.a($$2).orElseThrow(() -> a.createWithContext($$0, $$1, this.e.a()));
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      return eq.a($$0, $$1, this.e, eq.a.b);
   }

   public Collection<String> getExamples() {
      return c;
   }

   public static class a<T> implements ik<fl<T>, fl.a<T>.a> {
      public void a(fl.a<T>.a $$0, wg $$1) {
         $$1.b($$0.b);
      }

      public fl.a<T>.a a(wg $$0) {
         return new fl.a.a($$0.r());
      }

      public void a(fl.a<T>.a $$0, JsonObject $$1) {
         $$1.addProperty("registry", $$0.b.a().toString());
      }

      public fl.a<T>.a a(fl<T> $$0) {
         return new fl.a.a($$0.e);
      }

      public final class a implements ik.a<fl<T>> {
         final amd<? extends jy<T>> b;

         a(final amd<? extends jy<T>> $$1) {
            this.b = $$1;
         }

         public fl<T> a(eg $$0) {
            return new fl<>($$0, this.b);
         }

         @Override
         public ik<fl<T>, ?> a() {
            return a.this;
         }
      }
   }
}
