import com.mojang.authlib.GameProfile;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Collection;
import javax.annotation.Nullable;

public class anq {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(xo.c("commands.ban.failed"));

   public static void a(CommandDispatcher<ek> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)el.b("ban").requires(el.a(3)))
            .then(
               ((RequiredArgumentBuilder)el.a("targets", fa.a()).executes($$0x -> a((ek)$$0x.getSource(), fa.a($$0x, "targets"), null)))
                  .then(el.a("reason", fd.a()).executes($$0x -> a((ek)$$0x.getSource(), fa.a($$0x, "targets"), fd.a($$0x, "reason"))))
            )
      );
   }

   private static int a(ek $$0, Collection<GameProfile> $$1, @Nullable xo $$2) throws CommandSyntaxException {
      ayh $$3 = $$0.l().ag().f();
      int $$4 = 0;

      for (GameProfile $$5 : $$1) {
         if (!$$3.a($$5)) {
            ayi $$6 = new ayi($$5, null, $$0.c(), null, $$2 == null ? null : $$2.getString());
            $$3.a($$6);
            $$4++;
            $$0.a(() -> xo.a("commands.ban.success", xo.b($$5.getName()), $$6.d()), true);
            auc $$7 = $$0.l().ag().a($$5.getId());
            if ($$7 != null) {
               $$7.g.a(xo.c("multiplayer.disconnect.banned"));
            }
         }
      }

      if ($$4 == 0) {
         throw a.create();
      } else {
         return $$4;
      }
   }
}
