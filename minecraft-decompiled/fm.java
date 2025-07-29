import com.google.gson.JsonObject;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.Arrays;
import java.util.Collection;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;

public class fm<T> implements ArgumentType<amd<T>> {
   private static final Collection<String> a = Arrays.asList("foo", "foo:bar", "012");
   private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> xo.b("commands.place.feature.invalid", $$0));
   private static final DynamicCommandExceptionType c = new DynamicCommandExceptionType($$0 -> xo.b("commands.place.structure.invalid", $$0));
   private static final DynamicCommandExceptionType d = new DynamicCommandExceptionType($$0 -> xo.b("commands.place.jigsaw.invalid", $$0));
   private static final DynamicCommandExceptionType e = new DynamicCommandExceptionType($$0 -> xo.b("recipe.notFound", $$0));
   private static final DynamicCommandExceptionType f = new DynamicCommandExceptionType($$0 -> xo.b("advancement.advancementNotFound", $$0));
   final amd<? extends jy<T>> g;

   public fm(amd<? extends jy<T>> $$0) {
      this.g = $$0;
   }

   public static <T> fm<T> a(amd<? extends jy<T>> $$0) {
      return new fm<>($$0);
   }

   public static <T> amd<T> a(CommandContext<ek> $$0, String $$1, amd<jy<T>> $$2, DynamicCommandExceptionType $$3) throws CommandSyntaxException {
      amd<?> $$4 = (amd<?>)$$0.getArgument($$1, amd.class);
      Optional<amd<T>> $$5 = $$4.d($$2);
      return $$5.orElseThrow(() -> $$3.create($$4.a()));
   }

   private static <T> jy<T> a(CommandContext<ek> $$0, amd<? extends jy<T>> $$1) {
      return ((ek)$$0.getSource()).l().ba().f($$1);
   }

   private static <T> jl.c<T> b(CommandContext<ek> $$0, String $$1, amd<jy<T>> $$2, DynamicCommandExceptionType $$3) throws CommandSyntaxException {
      amd<T> $$4 = a($$0, $$1, $$2, $$3);
      return a($$0, $$2).a($$4).orElseThrow(() -> $$3.create($$4.a()));
   }

   public static jl.c<ems<?, ?>> a(CommandContext<ek> $$0, String $$1) throws CommandSyntaxException {
      return b($$0, $$1, mn.aP, b);
   }

   public static jl.c<euy> b(CommandContext<ek> $$0, String $$1) throws CommandSyntaxException {
      return b($$0, $$1, mn.bj, c);
   }

   public static jl.c<ewi> c(CommandContext<ek> $$0, String $$1) throws CommandSyntaxException {
      return b($$0, $$1, mn.bk, d);
   }

   public static dhr<?> d(CommandContext<ek> $$0, String $$1) throws CommandSyntaxException {
      dht $$2 = ((ek)$$0.getSource()).l().aI();
      amd<dhm<?>> $$3 = a($$0, $$1, mn.bA, e);
      return $$2.b($$3).orElseThrow(() -> e.create($$3.a()));
   }

   public static aj e(CommandContext<ek> $$0, String $$1) throws CommandSyntaxException {
      amd<ai> $$2 = a($$0, $$1, mn.bz, f);
      aj $$3 = ((ek)$$0.getSource()).l().aD().a($$2.a());
      if ($$3 == null) {
         throw f.create($$2.a());
      } else {
         return $$3;
      }
   }

   public amd<T> a(StringReader $$0) throws CommandSyntaxException {
      ame $$1 = ame.a($$0);
      return amd.a(this.g, $$1);
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      return eq.a($$0, $$1, this.g, eq.a.b);
   }

   public Collection<String> getExamples() {
      return a;
   }

   public static class a<T> implements ik<fm<T>, fm.a<T>.a> {
      public void a(fm.a<T>.a $$0, wg $$1) {
         $$1.b($$0.b);
      }

      public fm.a<T>.a a(wg $$0) {
         return new fm.a.a($$0.r());
      }

      public void a(fm.a<T>.a $$0, JsonObject $$1) {
         $$1.addProperty("registry", $$0.b.a().toString());
      }

      public fm.a<T>.a a(fm<T> $$0) {
         return new fm.a.a($$0.g);
      }

      public final class a implements ik.a<fm<T>> {
         final amd<? extends jy<T>> b;

         a(final amd<? extends jy<T>> $$1) {
            this.b = $$1;
         }

         public fm<T> a(eg $$0) {
            return new fm<>(this.b);
         }

         @Override
         public ik<fm<T>, ?> a() {
            return a.this;
         }
      }
   }
}
