import com.google.gson.JsonObject;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import com.mojang.datafixers.util.Either;
import java.util.Arrays;
import java.util.Collection;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.function.Predicate;

public class fq<T> implements ArgumentType<fq.c<T>> {
   private static final Collection<String> a = Arrays.asList("foo", "foo:bar", "012", "#skeletons", "#minecraft:skeletons");
   final amd<? extends jy<T>> b;

   public fq(amd<? extends jy<T>> $$0) {
      this.b = $$0;
   }

   public static <T> fq<T> a(amd<? extends jy<T>> $$0) {
      return new fq<>($$0);
   }

   public static <T> fq.c<T> a(CommandContext<ek> $$0, String $$1, amd<jy<T>> $$2, DynamicCommandExceptionType $$3) throws CommandSyntaxException {
      fq.c<?> $$4 = (fq.c<?>)$$0.getArgument($$1, fq.c.class);
      Optional<fq.c<T>> $$5 = $$4.a($$2);
      return $$5.orElseThrow(() -> $$3.create($$4));
   }

   public fq.c<T> a(StringReader $$0) throws CommandSyntaxException {
      if ($$0.canRead() && $$0.peek() == '#') {
         int $$1 = $$0.getCursor();

         try {
            $$0.skip();
            ame $$2 = ame.a($$0);
            return new fq.d<>(bae.a(this.b, $$2));
         } catch (CommandSyntaxException var4) {
            $$0.setCursor($$1);
            throw var4;
         }
      } else {
         ame $$4 = ame.a($$0);
         return new fq.b<>(amd.a(this.b, $$4));
      }
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      return eq.a($$0, $$1, this.b, eq.a.c);
   }

   public Collection<String> getExamples() {
      return a;
   }

   public static class a<T> implements ik<fq<T>, fq.a<T>.a> {
      public void a(fq.a<T>.a $$0, wg $$1) {
         $$1.b($$0.b);
      }

      public fq.a<T>.a a(wg $$0) {
         return new fq.a.a($$0.r());
      }

      public void a(fq.a<T>.a $$0, JsonObject $$1) {
         $$1.addProperty("registry", $$0.b.a().toString());
      }

      public fq.a<T>.a a(fq<T> $$0) {
         return new fq.a.a($$0.b);
      }

      public final class a implements ik.a<fq<T>> {
         final amd<? extends jy<T>> b;

         a(final amd<? extends jy<T>> $$1) {
            this.b = $$1;
         }

         public fq<T> a(eg $$0) {
            return new fq<>(this.b);
         }

         @Override
         public ik<fq<T>, ?> a() {
            return a.this;
         }
      }
   }

   record b<T>(amd<T> a) implements fq.c<T> {
      @Override
      public Either<amd<T>, bae<T>> a() {
         return Either.left(this.a);
      }

      @Override
      public <E> Optional<fq.c<E>> a(amd<? extends jy<E>> $$0) {
         return this.a.d($$0).map(fq.b::new);
      }

      public boolean a(jl<T> $$0) {
         return $$0.a(this.a);
      }

      @Override
      public String b() {
         return this.a.a().toString();
      }

      public amd<T> c() {
         return this.a;
      }
   }

   public interface c<T> extends Predicate<jl<T>> {
      Either<amd<T>, bae<T>> a();

      <E> Optional<fq.c<E>> a(amd<? extends jy<E>> var1);

      String b();
   }

   record d<T>(bae<T> a) implements fq.c<T> {
      @Override
      public Either<amd<T>, bae<T>> a() {
         return Either.right(this.a);
      }

      @Override
      public <E> Optional<fq.c<E>> a(amd<? extends jy<E>> $$0) {
         return this.a.e($$0).map(fq.d::new);
      }

      public boolean a(jl<T> $$0) {
         return $$0.a(this.a);
      }

      @Override
      public String b() {
         return "#" + this.a.b();
      }

      public bae<T> c() {
         return this.a;
      }
   }
}
