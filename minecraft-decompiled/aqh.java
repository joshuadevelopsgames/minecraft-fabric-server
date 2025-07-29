import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;

public class aqh {
   public static void a(CommandDispatcher<ek> $$0) {
      $$0.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)el.b("stop").requires(el.a(4))).executes($$0x -> {
         ((ek)$$0x.getSource()).a(() -> xo.c("commands.stop.stopping"), true);
         ((ek)$$0x.getSource()).l().a(false);
         return 1;
      }));
   }
}
