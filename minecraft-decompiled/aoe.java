import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import net.minecraft.server.MinecraftServer;

public class aoe {
   private static final DynamicCommandExceptionType a = new DynamicCommandExceptionType($$0 -> xo.b("commands.difficulty.failure", $$0));

   public static void a(CommandDispatcher<ek> $$0) {
      LiteralArgumentBuilder<ek> $$1 = el.b("difficulty");

      for (bxg $$2 : bxg.values()) {
         $$1.then(el.b($$2.e()).executes($$1x -> a((ek)$$1x.getSource(), $$2)));
      }

      $$0.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)$$1.requires(el.a(2))).executes($$0x -> {
         bxg $$1x = ((ek)$$0x.getSource()).e().an();
         ((ek)$$0x.getSource()).a(() -> xo.a("commands.difficulty.query", $$1x.b()), false);
         return $$1x.a();
      }));
   }

   public static int a(ek $$0, bxg $$1) throws CommandSyntaxException {
      MinecraftServer $$2 = $$0.l();
      if ($$2.aZ().q() == $$1) {
         throw a.create($$1.e());
      } else {
         $$2.a($$1, true);
         $$0.a(() -> xo.a("commands.difficulty.success", $$1.b()), true);
         return 0;
      }
   }
}
