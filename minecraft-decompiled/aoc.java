import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import net.minecraft.server.MinecraftServer;

public class aoc {
   public static void a(CommandDispatcher<ek> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)el.b("defaultgamemode").requires(el.a(2)))
            .then(el.a("gamemode", ez.a()).executes($$0x -> a((ek)$$0x.getSource(), ez.a($$0x, "gamemode"))))
      );
   }

   private static int a(ek $$0, dmr $$1) {
      int $$2 = 0;
      MinecraftServer $$3 = $$0.l();
      $$3.a($$1);
      dmr $$4 = $$3.bd();
      if ($$4 != null) {
         for (auc $$5 : $$3.ag().t()) {
            if ($$5.a($$4)) {
               $$2++;
            }
         }
      }

      $$0.a(() -> xo.a("commands.defaultgamemode.success", $$1.d()), true);
      return $$2;
   }
}
