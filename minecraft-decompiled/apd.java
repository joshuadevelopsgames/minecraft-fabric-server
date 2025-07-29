import com.mojang.authlib.GameProfile;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Collection;

public class apd {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(xo.c("commands.pardon.failed"));

   public static void a(CommandDispatcher<ek> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)el.b("pardon").requires(el.a(3)))
            .then(
               el.a("targets", fa.a())
                  .suggests(($$0x, $$1) -> eq.a(((ek)$$0x.getSource()).l().ag().f().a(), $$1))
                  .executes($$0x -> a((ek)$$0x.getSource(), fa.a($$0x, "targets")))
            )
      );
   }

   private static int a(ek $$0, Collection<GameProfile> $$1) throws CommandSyntaxException {
      ayh $$2 = $$0.l().ag().f();
      int $$3 = 0;

      for (GameProfile $$4 : $$1) {
         if ($$2.a($$4)) {
            $$2.c($$4);
            $$3++;
            $$0.a(() -> xo.a("commands.pardon.success", xo.b($$4.getName())), true);
         }
      }

      if ($$3 == 0) {
         throw a.create();
      } else {
         return $$3;
      }
   }
}
