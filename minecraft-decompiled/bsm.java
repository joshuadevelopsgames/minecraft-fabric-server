import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;

public interface bsm<T extends Exception> {
   T create(String var1, int var2);

   static bsm<CommandSyntaxException> a(SimpleCommandExceptionType $$0) {
      return ($$1, $$2) -> $$0.createWithContext(btg.a($$1, $$2));
   }

   static bsm<CommandSyntaxException> a(DynamicCommandExceptionType $$0, String $$1) {
      return ($$2, $$3) -> $$0.createWithContext(btg.a($$2, $$3), $$1);
   }
}
