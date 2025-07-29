import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;

public class apy {
   public static void a(CommandDispatcher<ek> $$0, boolean $$1) {
      $$0.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)el.b("seed").requires(el.a($$1 ? 2 : 0))).executes($$0x -> {
         long $$1x = ((ek)$$0x.getSource()).e().F();
         xo $$2 = xr.a(String.valueOf($$1x));
         ((ek)$$0x.getSource()).a(() -> xo.a("commands.seed.success", $$2), false);
         return (int)$$1x;
      }));
   }
}
