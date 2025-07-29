import com.google.gson.JsonObject;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType;
import com.mojang.brigadier.exceptions.Dynamic3CommandExceptionType;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import com.mojang.datafixers.util.Either;
import java.util.Arrays;
import java.util.Collection;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.function.Predicate;

public class fp<T> implements ArgumentType<fp.c<T>> {
   private static final Collection<String> a = Arrays.asList("foo", "foo:bar", "012", "#skeletons", "#minecraft:skeletons");
   private static final Dynamic2CommandExceptionType b = new Dynamic2CommandExceptionType(($$0, $$1) -> xo.b("argument.resource_tag.not_found", $$0, $$1));
   private static final Dynamic3CommandExceptionType c = new Dynamic3CommandExceptionType(
      ($$0, $$1, $$2) -> xo.b("argument.resource_tag.invalid_type", $$0, $$1, $$2)
   );
   private final jn<T> d;
   final amd<? extends jy<T>> e;

   public fp(eg $$0, amd<? extends jy<T>> $$1) {
      this.e = $$1;
      this.d = $$0.e($$1);
   }

   public static <T> fp<T> a(eg $$0, amd<? extends jy<T>> $$1) {
      return new fp<>($$0, $$1);
   }

   public static <T> fp.c<T> a(CommandContext<ek> $$0, String $$1, amd<jy<T>> $$2) throws CommandSyntaxException {
      fp.c<?> $$3 = (fp.c<?>)$$0.getArgument($$1, fp.c.class);
      Optional<fp.c<T>> $$4 = $$3.a($$2);
      return $$4.orElseThrow(() -> (CommandSyntaxException)$$3.a().map($$1xx -> {
         amd<?> $$2x = $$1xx.h();
         return fl.b.create($$2x.a(), $$2x.b(), $$2.a());
      }, $$1xx -> {
         bae<?> $$2x = $$1xx.h();
         return c.create($$2x.b(), $$2x.a(), $$2.a());
      }));
   }

   public fp.c<T> a(StringReader $$0) throws CommandSyntaxException {
      if ($$0.canRead() && $$0.peek() == '#') {
         int $$1 = $$0.getCursor();

         try {
            $$0.skip();
            ame $$2 = ame.a($$0);
            bae<T> $$3 = bae.a(this.e, $$2);
            jp.c<T> $$4 = this.d.a($$3).orElseThrow(() -> b.createWithContext($$0, $$2, this.e.a()));
            return new fp.d<>($$4);
         } catch (CommandSyntaxException var6) {
            $$0.setCursor($$1);
            throw var6;
         }
      } else {
         ame $$6 = ame.a($$0);
         amd<T> $$7 = amd.a(this.e, $$6);
         jl.c<T> $$8 = this.d.a($$7).orElseThrow(() -> fl.a.createWithContext($$0, $$6, this.e.a()));
         return new fp.b<>($$8);
      }
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      return eq.a($$0, $$1, this.e, eq.a.c);
   }

   public Collection<String> getExamples() {
      return a;
   }

   public static class a<T> implements ik<fp<T>, fp.a<T>.a> {
      public void a(fp.a<T>.a $$0, wg $$1) {
         $$1.b($$0.b);
      }

      public fp.a<T>.a a(wg $$0) {
         return new fp.a.a($$0.r());
      }

      public void a(fp.a<T>.a $$0, JsonObject $$1) {
         $$1.addProperty("registry", $$0.b.a().toString());
      }

      public fp.a<T>.a a(fp<T> $$0) {
         return new fp.a.a($$0.e);
      }

      public final class a implements ik.a<fp<T>> {
         final amd<? extends jy<T>> b;

         a(final amd<? extends jy<T>> $$1) {
            this.b = $$1;
         }

         public fp<T> a(eg $$0) {
            return new fp<>($$0, this.b);
         }

         @Override
         public ik<fp<T>, ?> a() {
            return a.this;
         }
      }
   }

   record b<T>(jl.c<T> a) implements fp.c<T> {
      @Override
      public Either<jl.c<T>, jp.c<T>> a() {
         return Either.left(this.a);
      }

      @Override
      public <E> Optional<fp.c<E>> a(amd<? extends jy<E>> $$0) {
         return this.a.h().c($$0) ? Optional.of((fp.c<E>)this) : Optional.empty();
      }

      public boolean a(jl<T> $$0) {
         return $$0.equals(this.a);
      }

      @Override
      public String b() {
         return this.a.h().a().toString();
      }

      public jl.c<T> c() {
         return this.a;
      }
   }

   public interface c<T> extends Predicate<jl<T>> {
      Either<jl.c<T>, jp.c<T>> a();

      <E> Optional<fp.c<E>> a(amd<? extends jy<E>> var1);

      String b();
   }

   record d<T>(jp.c<T> a) implements fp.c<T> {
      @Override
      public Either<jl.c<T>, jp.c<T>> a() {
         return Either.right(this.a);
      }

      @Override
      public <E> Optional<fp.c<E>> a(amd<? extends jy<E>> $$0) {
         return this.a.h().d($$0) ? Optional.of((fp.c<E>)this) : Optional.empty();
      }

      public boolean a(jl<T> $$0) {
         return this.a.a($$0);
      }

      @Override
      public String b() {
         return "#" + this.a.h().b();
      }

      public jp.c<T> c() {
         return this.a;
      }
   }
}
