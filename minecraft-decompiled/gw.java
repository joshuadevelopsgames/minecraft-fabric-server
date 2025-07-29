import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.datafixers.util.Either;
import com.mojang.datafixers.util.Pair;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class gw implements ArgumentType<gw.a> {
   private static final Collection<String> a = Arrays.asList("foo", "foo:bar", "#foo");
   private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> xo.b("arguments.function.tag.unknown", $$0));
   private static final DynamicCommandExceptionType c = new DynamicCommandExceptionType($$0 -> xo.b("arguments.function.unknown", $$0));

   public static gw a() {
      return new gw();
   }

   public gw.a a(StringReader $$0) throws CommandSyntaxException {
      if ($$0.canRead() && $$0.peek() == '#') {
         $$0.skip();
         final ame $$1 = ame.a($$0);
         return new gw.a() {
            @Override
            public Collection<ib<ek>> a(CommandContext<ek> $$0) throws CommandSyntaxException {
               return gw.b($$0, $$1);
            }

            @Override
            public Pair<ame, Either<ib<ek>, Collection<ib<ek>>>> b(CommandContext<ek> $$0) throws CommandSyntaxException {
               return Pair.of($$1, Either.right(gw.b($$0, $$1)));
            }

            @Override
            public Pair<ame, Collection<ib<ek>>> c(CommandContext<ek> $$0) throws CommandSyntaxException {
               return Pair.of($$1, gw.b($$0, $$1));
            }
         };
      } else {
         final ame $$2 = ame.a($$0);
         return new gw.a() {
            @Override
            public Collection<ib<ek>> a(CommandContext<ek> $$0) throws CommandSyntaxException {
               return Collections.singleton(gw.a($$0, $$2));
            }

            @Override
            public Pair<ame, Either<ib<ek>, Collection<ib<ek>>>> b(CommandContext<ek> $$0) throws CommandSyntaxException {
               return Pair.of($$2, Either.left(gw.a($$0, $$2)));
            }

            @Override
            public Pair<ame, Collection<ib<ek>>> c(CommandContext<ek> $$0) throws CommandSyntaxException {
               return Pair.of($$2, Collections.singleton(gw.a($$0, $$2)));
            }
         };
      }
   }

   static ib<ek> a(CommandContext<ek> $$0, ame $$1) throws CommandSyntaxException {
      return ((ek)$$0.getSource()).l().aE().a($$1).orElseThrow(() -> c.create($$1.toString()));
   }

   static Collection<ib<ek>> b(CommandContext<ek> $$0, ame $$1) throws CommandSyntaxException {
      Collection<ib<ek>> $$2 = ((ek)$$0.getSource()).l().aE().b($$1);
      if ($$2 == null) {
         throw b.create($$1.toString());
      } else {
         return $$2;
      }
   }

   public static Collection<ib<ek>> a(CommandContext<ek> $$0, String $$1) throws CommandSyntaxException {
      return ((gw.a)$$0.getArgument($$1, gw.a.class)).a($$0);
   }

   public static Pair<ame, Either<ib<ek>, Collection<ib<ek>>>> b(CommandContext<ek> $$0, String $$1) throws CommandSyntaxException {
      return ((gw.a)$$0.getArgument($$1, gw.a.class)).b($$0);
   }

   public static Pair<ame, Collection<ib<ek>>> c(CommandContext<ek> $$0, String $$1) throws CommandSyntaxException {
      return ((gw.a)$$0.getArgument($$1, gw.a.class)).c($$0);
   }

   public Collection<String> getExamples() {
      return a;
   }

   public interface a {
      Collection<ib<ek>> a(CommandContext<ek> var1) throws CommandSyntaxException;

      Pair<ame, Either<ib<ek>, Collection<ib<ek>>>> b(CommandContext<ek> var1) throws CommandSyntaxException;

      Pair<ame, Collection<ib<ek>>> c(CommandContext<ek> var1) throws CommandSyntaxException;
   }
}
