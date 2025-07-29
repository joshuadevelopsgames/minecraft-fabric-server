import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;

public class aqo {
   public static void a(CommandDispatcher<ek> $$0, eg $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)el.b("tellraw").requires(el.a(2)))
            .then(el.a("targets", ey.d()).then(el.a("message", eu.a($$1)).executes($$0x -> {
               int $$1x = 0;

               for (auc $$2 : ey.f($$0x, "targets")) {
                  $$2.b(eu.a($$0x, "message", $$2), false);
                  $$1x++;
               }

               return $$1x;
            })))
      );
   }
}
