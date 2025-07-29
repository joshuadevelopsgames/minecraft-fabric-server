import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.Arrays;
import java.util.Collection;

public interface fk<T extends cx<?>> extends ArgumentType<T> {
   static fk.b a() {
      return new fk.b();
   }

   static fk.a b() {
      return new fk.a();
   }

   public static class a implements fk<cx.c> {
      private static final Collection<String> a = Arrays.asList("0..5.2", "0", "-5.4", "-100.76..", "..100");

      public static cx.c a(CommandContext<ek> $$0, String $$1) {
         return (cx.c)$$0.getArgument($$1, cx.c.class);
      }

      public cx.c a(StringReader $$0) throws CommandSyntaxException {
         return cx.c.a($$0);
      }

      public Collection<String> getExamples() {
         return a;
      }
   }

   public static class b implements fk<cx.d> {
      private static final Collection<String> a = Arrays.asList("0..5", "0", "-5", "-100..", "..100");

      public static cx.d a(CommandContext<ek> $$0, String $$1) {
         return (cx.d)$$0.getArgument($$1, cx.d.class);
      }

      public cx.d a(StringReader $$0) throws CommandSyntaxException {
         return cx.d.a($$0);
      }

      public Collection<String> getExamples() {
         return a;
      }
   }
}
