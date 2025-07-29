import com.google.gson.JsonObject;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import org.apache.commons.io.FilenameUtils;

public class fr<T> implements ArgumentType<Collection<jl.c<T>>> {
   private static final Collection<String> b = List.of("minecraft:*", "*:asset", "*");
   public static final Dynamic2CommandExceptionType a = new Dynamic2CommandExceptionType(($$0, $$1) -> xo.b("argument.resource_selector.not_found", $$0, $$1));
   final amd<? extends jy<T>> c;
   private final jn<T> d;

   fr(eg $$0, amd<? extends jy<T>> $$1) {
      this.c = $$1;
      this.d = $$0.e($$1);
   }

   public Collection<jl.c<T>> a(StringReader $$0) throws CommandSyntaxException {
      String $$1 = a(b($$0));
      List<jl.c<T>> $$2 = this.d.c().filter($$1x -> a($$1, $$1x.h().a())).toList();
      if ($$2.isEmpty()) {
         throw a.createWithContext($$0, $$1, this.c.a());
      } else {
         return $$2;
      }
   }

   public static <T> Collection<jl.c<T>> a(StringReader $$0, jn<T> $$1) {
      String $$2 = a(b($$0));
      return $$1.c().filter($$1x -> a($$2, $$1x.h().a())).toList();
   }

   private static String b(StringReader $$0) {
      int $$1 = $$0.getCursor();

      while ($$0.canRead() && a($$0.peek())) {
         $$0.skip();
      }

      return $$0.getString().substring($$1, $$0.getCursor());
   }

   private static boolean a(char $$0) {
      return ame.a($$0) || $$0 == '*' || $$0 == '?';
   }

   private static String a(String $$0) {
      return !$$0.contains(":") ? "minecraft:" + $$0 : $$0;
   }

   private static boolean a(String $$0, ame $$1) {
      return FilenameUtils.wildcardMatch($$1.toString(), $$0);
   }

   public static <T> fr<T> a(eg $$0, amd<? extends jy<T>> $$1) {
      return new fr<>($$0, $$1);
   }

   public static <T> Collection<jl.c<T>> a(CommandContext<ek> $$0, String $$1) {
      return (Collection<jl.c<T>>)$$0.getArgument($$1, Collection.class);
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      return eq.a($$0, $$1, this.c, eq.a.b);
   }

   public Collection<String> getExamples() {
      return b;
   }

   public static class a<T> implements ik<fr<T>, fr.a<T>.a> {
      public void a(fr.a<T>.a $$0, wg $$1) {
         $$1.b($$0.b);
      }

      public fr.a<T>.a a(wg $$0) {
         return new fr.a.a($$0.r());
      }

      public void a(fr.a<T>.a $$0, JsonObject $$1) {
         $$1.addProperty("registry", $$0.b.a().toString());
      }

      public fr.a<T>.a a(fr<T> $$0) {
         return new fr.a.a($$0.c);
      }

      public final class a implements ik.a<fr<T>> {
         final amd<? extends jy<T>> b;

         a(final amd<? extends jy<T>> $$1) {
            this.b = $$1;
         }

         public fr<T> a(eg $$0) {
            return new fr<>($$0, this.b);
         }

         @Override
         public ik<fr<T>, ?> a() {
            return a.this;
         }
      }
   }
}
