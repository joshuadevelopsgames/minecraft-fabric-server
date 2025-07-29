import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import java.util.Collection;
import java.util.Collections;

public class aoo {
   public static final int a = 2;

   public static void a(CommandDispatcher<ek> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)el.b("gamemode").requires(el.a(2)))
            .then(
               ((RequiredArgumentBuilder)el.a("gamemode", ez.a())
                     .executes($$0x -> a($$0x, Collections.singleton(((ek)$$0x.getSource()).h()), ez.a($$0x, "gamemode"))))
                  .then(el.a("target", ey.d()).executes($$0x -> a($$0x, ey.f($$0x, "target"), ez.a($$0x, "gamemode"))))
            )
      );
   }

   private static void a(ek $$0, auc $$1, dmr $$2) {
      xo $$3 = xo.c("gameMode." + $$2.b());
      if ($$0.f() == $$1) {
         $$0.a(() -> xo.a("commands.gamemode.success.self", $$3), true);
      } else {
         if ($$0.e().P().c(dmq.q)) {
            $$1.a(xo.a("gameMode.changed", $$3));
         }

         $$0.a(() -> xo.a("commands.gamemode.success.other", $$1.Q_(), $$3), true);
      }
   }

   private static int a(CommandContext<ek> $$0, Collection<auc> $$1, dmr $$2) {
      int $$3 = 0;

      for (auc $$4 : $$1) {
         if (b((ek)$$0.getSource(), $$4, $$2)) {
            $$3++;
         }
      }

      return $$3;
   }

   public static void a(auc $$0, dmr $$1) {
      b($$0.A(), $$0, $$1);
   }

   private static boolean b(ek $$0, auc $$1, dmr $$2) {
      if ($$1.a($$2)) {
         a($$0, $$1, $$2);
         return true;
      } else {
         return false;
      }
   }
}
