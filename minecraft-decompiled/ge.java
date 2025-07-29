import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;

public class ge {
   public static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(xo.c("argument.waypoint.invalid"));

   public static fkx a(CommandContext<ek> $$0, String $$1) throws CommandSyntaxException {
      if (((hd)$$0.getArgument($$1, hd.class)).a((ek)$$0.getSource()) instanceof fkx $$3) {
         return $$3;
      } else {
         throw a.create();
      }
   }
}
