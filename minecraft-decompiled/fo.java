import com.mojang.brigadier.ImmutableStringReader;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DynamicOps;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class fo<T> implements ArgumentType<jl<T>> {
   private static final Collection<String> d = List.of("foo", "foo:bar", "012", "{}", "true");
   public static final DynamicCommandExceptionType a = new DynamicCommandExceptionType($$0 -> xo.b("argument.resource_or_id.failed_to_parse", $$0));
   public static final Dynamic2CommandExceptionType b = new Dynamic2CommandExceptionType(
      ($$0, $$1) -> xo.b("argument.resource_or_id.no_such_element", $$0, $$1)
   );
   public static final DynamicOps<vi> c = uw.a;
   private final jn.a e;
   private final Optional<? extends jn.b<T>> f;
   private final Codec<T> g;
   private final bsx<fo.g<T, vi>> h;
   private final amd<? extends jy<T>> i;

   protected fo(eg $$0, amd<? extends jy<T>> $$1, Codec<T> $$2) {
      this.e = $$0;
      this.f = $$0.a($$1);
      this.i = $$1;
      this.g = $$2;
      this.h = a($$1, c);
   }

   public static <T, O> bsx<fo.g<T, O>> a(amd<? extends jy<T>> $$0, DynamicOps<O> $$1) {
      bsx<O> $$2 = vc.a((DynamicOps<T>)$$1);
      bsn<StringReader> $$3 = new bsn<>();
      bsj<fo.g<T, O>> $$4 = bsj.a("result");
      bsj<ame> $$5 = bsj.a("id");
      bsj<O> $$6 = bsj.a("value");
      $$3.a($$5, btc.a);
      $$3.a($$6, $$2.b().b());
      bsq<StringReader, fo.g<T, O>> $$7 = $$3.a($$4, bsv.b($$3.c($$5), $$3.c($$6)), $$3x -> {
         ame $$4x = $$3x.a($$5);
         if ($$4x != null) {
            return new fo.f<>(amd.a($$0, $$4x));
         } else {
            O $$5x = $$3x.b($$6);
            return new fo.b<>($$5x);
         }
      });
      return new bsx<>($$3, $$7);
   }

   public static fo.e a(eg $$0) {
      return new fo.e($$0);
   }

   public static jl<fdo> a(CommandContext<ek> $$0, String $$1) throws CommandSyntaxException {
      return e($$0, $$1);
   }

   public static fo.c b(eg $$0) {
      return new fo.c($$0);
   }

   public static jl<fex> b(CommandContext<ek> $$0, String $$1) {
      return e($$0, $$1);
   }

   public static fo.d c(eg $$0) {
      return new fo.d($$0);
   }

   public static jl<fgs> c(CommandContext<ek> $$0, String $$1) {
      return e($$0, $$1);
   }

   public static fo.a d(eg $$0) {
      return new fo.a($$0);
   }

   public static jl<art> d(CommandContext<ek> $$0, String $$1) {
      return e($$0, $$1);
   }

   private static <T> jl<T> e(CommandContext<ek> $$0, String $$1) {
      return (jl<T>)$$0.getArgument($$1, jl.class);
   }

   @Nullable
   public jl<T> a(StringReader $$0) throws CommandSyntaxException {
      return this.a($$0, this.h, c);
   }

   @Nullable
   private <O> jl<T> a(StringReader $$0, bsx<fo.g<T, O>> $$1, DynamicOps<O> $$2) throws CommandSyntaxException {
      fo.g<T, O> $$3 = $$1.a($$0);
      return this.f.isEmpty() ? null : $$3.a($$0, this.e, $$2, this.g, (jn.b<T>)this.f.get());
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      return eq.a($$0, $$1, this.i, eq.a.b);
   }

   public Collection<String> getExamples() {
      return d;
   }

   public static class a extends fo<art> {
      protected a(eg $$0) {
         super($$0, mn.aT, art.c);
      }
   }

   public record b<T, O>(O a) implements fo.g<T, O> {
      @Override
      public jl<T> a(ImmutableStringReader $$0, jn.a $$1, DynamicOps<O> $$2, Codec<T> $$3, jn.b<T> $$4) throws CommandSyntaxException {
         return jl.a((T)$$3.parse($$1.a($$2), this.a).getOrThrow($$1x -> fo.a.createWithContext($$0, $$1x)));
      }
   }

   public static class c extends fo<fex> {
      protected c(eg $$0) {
         super($$0, mn.bx, fez.c);
      }
   }

   public static class d extends fo<fgs> {
      protected d(eg $$0) {
         super($$0, mn.by, fgs.e);
      }
   }

   public static class e extends fo<fdo> {
      protected e(eg $$0) {
         super($$0, mn.bw, fdo.d);
      }
   }

   public record f<T, O>(amd<T> a) implements fo.g<T, O> {
      @Override
      public jl<T> a(ImmutableStringReader $$0, jn.a $$1, DynamicOps<O> $$2, Codec<T> $$3, jn.b<T> $$4) throws CommandSyntaxException {
         return $$4.a(this.a).orElseThrow(() -> fo.b.createWithContext($$0, this.a.a(), this.a.b()));
      }
   }

   public sealed interface g<T, O> permits fo.b, fo.f {
      jl<T> a(ImmutableStringReader var1, jn.a var2, DynamicOps<O> var3, Codec<T> var4, jn.b<T> var5) throws CommandSyntaxException;
   }
}
