import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import javax.annotation.Nullable;

public class btc implements bss<StringReader, ame> {
   public static final bss<StringReader, ame> a = new btc();

   private btc() {
   }

   @Nullable
   public ame b(bsr<StringReader> $$0) {
      $$0.f().skipWhitespace();

      try {
         return ame.b($$0.f());
      } catch (CommandSyntaxException var3) {
         return null;
      }
   }
}
