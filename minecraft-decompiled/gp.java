import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Arrays;
import java.util.Collection;
import java.util.EnumSet;

public class gp implements ArgumentType<EnumSet<jh.a>> {
   private static final Collection<String> a = Arrays.asList("xyz", "x");
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(xo.c("arguments.swizzle.invalid"));

   public static gp a() {
      return new gp();
   }

   public static EnumSet<jh.a> a(CommandContext<ek> $$0, String $$1) {
      return (EnumSet<jh.a>)$$0.getArgument($$1, EnumSet.class);
   }

   public EnumSet<jh.a> a(StringReader $$0) throws CommandSyntaxException {
      EnumSet<jh.a> $$1 = EnumSet.noneOf(jh.a.class);

      while ($$0.canRead() && $$0.peek() != ' ') {
         char $$2 = $$0.read();

         jh.a $$6 = switch ($$2) {
            case 'x' -> jh.a.a;
            case 'y' -> jh.a.b;
            case 'z' -> jh.a.c;
            default -> throw b.createWithContext($$0);
         };
         if ($$1.contains($$6)) {
            throw b.createWithContext($$0);
         }

         $$1.add($$6);
      }

      return $$1;
   }

   public Collection<String> getExamples() {
      return a;
   }
}
