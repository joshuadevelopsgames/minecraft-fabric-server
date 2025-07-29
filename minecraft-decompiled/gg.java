import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.concurrent.CompletableFuture;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class gg implements ArgumentType<gg.b> {
   private static final Collection<String> a = Arrays.asList("stone", "minecraft:stone", "stone[foo=bar]", "#stone", "#stone[foo=bar]{baz=nbt}");
   private final jn<dpz> b;

   public gg(eg $$0) {
      this.b = $$0.e(mn.i);
   }

   public static gg a(eg $$0) {
      return new gg($$0);
   }

   public gg.b a(StringReader $$0) throws CommandSyntaxException {
      return a(this.b, $$0);
   }

   public static gg.b a(jn<dpz> $$0, StringReader $$1) throws CommandSyntaxException {
      return (gg.b)gi.b($$0, $$1, true).map($$0x -> new gg.a($$0x.a(), $$0x.b().keySet(), $$0x.c()), $$0x -> new gg.c($$0x.a(), $$0x.b(), $$0x.c()));
   }

   public static Predicate<eef> a(CommandContext<ek> $$0, String $$1) throws CommandSyntaxException {
      return (Predicate<eef>)$$0.getArgument($$1, gg.b.class);
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      return gi.a(this.b, $$1, true, true);
   }

   public Collection<String> getExamples() {
      return a;
   }

   static class a implements gg.b {
      private final eeb a;
      private final Set<efe<?>> b;
      @Nullable
      private final ui c;

      public a(eeb $$0, Set<efe<?>> $$1, @Nullable ui $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      public boolean a(eef $$0) {
         eeb $$1 = $$0.a();
         if (!$$1.a(this.a.b())) {
            return false;
         } else {
            for (efe<?> $$2 : this.b) {
               if ($$1.c($$2) != this.a.c($$2)) {
                  return false;
               }
            }

            if (this.c == null) {
               return true;
            } else {
               eaz $$3 = $$0.b();
               return $$3 != null && ux.a(this.c, $$3.b($$0.c().K_()), true);
            }
         }
      }

      @Override
      public boolean a() {
         return this.c != null;
      }
   }

   public interface b extends Predicate<eef> {
      boolean a();
   }

   static class c implements gg.b {
      private final jp<dpz> a;
      @Nullable
      private final ui b;
      private final Map<String, String> c;

      c(jp<dpz> $$0, Map<String, String> $$1, @Nullable ui $$2) {
         this.a = $$0;
         this.c = $$1;
         this.b = $$2;
      }

      public boolean a(eef $$0) {
         eeb $$1 = $$0.a();
         if (!$$1.a(this.a)) {
            return false;
         } else {
            for (Entry<String, String> $$2 : this.c.entrySet()) {
               efe<?> $$3 = $$1.b().l().a($$2.getKey());
               if ($$3 == null) {
                  return false;
               }

               Comparable<?> $$4 = (Comparable<?>)$$3.b($$2.getValue()).orElse(null);
               if ($$4 == null) {
                  return false;
               }

               if ($$1.c($$3) != $$4) {
                  return false;
               }
            }

            if (this.b == null) {
               return true;
            } else {
               eaz $$5 = $$0.b();
               return $$5 != null && ux.a(this.b, $$5.b($$0.c().K_()), true);
            }
         }
      }

      @Override
      public boolean a() {
         return this.b != null;
      }
   }
}
