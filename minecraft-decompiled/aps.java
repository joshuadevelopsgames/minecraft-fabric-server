import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import net.minecraft.server.MinecraftServer;

public class aps {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(xo.c("commands.save.failed"));

   public static void a(CommandDispatcher<ek> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)el.b("save-all").requires(el.a(4)))
               .executes($$0x -> a((ek)$$0x.getSource(), false)))
            .then(el.b("flush").executes($$0x -> a((ek)$$0x.getSource(), true)))
      );
   }

   private static int a(ek $$0, boolean $$1) throws CommandSyntaxException {
      $$0.a(() -> xo.c("commands.save.saving"), false);
      MinecraftServer $$2 = $$0.l();
      boolean $$3 = $$2.b(true, $$1, true);
      if (!$$3) {
         throw a.create();
      } else {
         $$0.a(() -> xo.c("commands.save.success"), true);
         return 1;
      }
   }
}
