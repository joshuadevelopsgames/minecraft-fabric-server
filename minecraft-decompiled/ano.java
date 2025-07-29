import com.google.common.net.InetAddresses;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.List;
import javax.annotation.Nullable;

public class ano {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(xo.c("commands.banip.invalid"));
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(xo.c("commands.banip.failed"));

   public static void a(CommandDispatcher<ek> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)el.b("ban-ip").requires(el.a(3)))
            .then(
               ((RequiredArgumentBuilder)el.a("target", StringArgumentType.word())
                     .executes($$0x -> a((ek)$$0x.getSource(), StringArgumentType.getString($$0x, "target"), null)))
                  .then(el.a("reason", fd.a()).executes($$0x -> a((ek)$$0x.getSource(), StringArgumentType.getString($$0x, "target"), fd.a($$0x, "reason"))))
            )
      );
   }

   private static int a(ek $$0, String $$1, @Nullable xo $$2) throws CommandSyntaxException {
      if (InetAddresses.isInetAddress($$1)) {
         return b($$0, $$1, $$2);
      } else {
         auc $$3 = $$0.l().ag().a($$1);
         if ($$3 != null) {
            return b($$0, $$3.B(), $$2);
         } else {
            throw a.create();
         }
      }
   }

   private static int b(ek $$0, String $$1, @Nullable xo $$2) throws CommandSyntaxException {
      axy $$3 = $$0.l().ag().g();
      if ($$3.a($$1)) {
         throw b.create();
      } else {
         List<auc> $$4 = $$0.l().ag().b($$1);
         axz $$5 = new axz($$1, null, $$0.c(), null, $$2 == null ? null : $$2.getString());
         $$3.a($$5);
         $$0.a(() -> xo.a("commands.banip.success", $$1, $$5.d()), true);
         if (!$$4.isEmpty()) {
            $$0.a(() -> xo.a("commands.banip.info", $$4.size(), hd.a($$4)), true);
         }

         for (auc $$6 : $$4) {
            $$6.g.a(xo.c("multiplayer.disconnect.ip_banned"));
         }

         return $$4.size();
      }
   }
}
