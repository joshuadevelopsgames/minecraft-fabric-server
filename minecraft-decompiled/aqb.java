import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;

public class aqb {
   public static void a(CommandDispatcher<ek> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)el.b("setidletimeout").requires(el.a(3)))
            .then(el.a("minutes", IntegerArgumentType.integer(0)).executes($$0x -> a((ek)$$0x.getSource(), IntegerArgumentType.getInteger($$0x, "minutes"))))
      );
   }

   private static int a(ek $$0, int $$1) {
      $$0.l().c($$1);
      if ($$1 > 0) {
         $$0.a(() -> xo.a("commands.setidletimeout.success", $$1), true);
      } else {
         $$0.a(() -> xo.c("commands.setidletimeout.success.disabled"), true);
      }

      return $$1;
   }
}
