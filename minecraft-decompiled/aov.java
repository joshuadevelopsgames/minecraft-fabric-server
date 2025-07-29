import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Collection;

public class aov {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(xo.c("commands.kick.owner.failed"));
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(xo.c("commands.kick.singleplayer.failed"));

   public static void a(CommandDispatcher<ek> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)el.b("kick").requires(el.a(3)))
            .then(
               ((RequiredArgumentBuilder)el.a("targets", ey.d())
                     .executes($$0x -> a((ek)$$0x.getSource(), ey.f($$0x, "targets"), xo.c("multiplayer.disconnect.kicked"))))
                  .then(el.a("reason", fd.a()).executes($$0x -> a((ek)$$0x.getSource(), ey.f($$0x, "targets"), fd.a($$0x, "reason"))))
            )
      );
   }

   private static int a(ek $$0, Collection<auc> $$1, xo $$2) throws CommandSyntaxException {
      if (!$$0.l().r()) {
         throw b.create();
      } else {
         int $$3 = 0;

         for (auc $$4 : $$1) {
            if (!$$0.l().a($$4.gr())) {
               $$4.g.a($$2);
               $$0.a(() -> xo.a("commands.kick.success", $$4.Q_(), $$2), true);
               $$3++;
            }
         }

         if ($$3 == 0) {
            throw a.create();
         } else {
            return $$3;
         }
      }
   }
}
