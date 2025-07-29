import com.mojang.authlib.GameProfile;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Collection;

public class apc {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(xo.c("commands.op.failed"));

   public static void a(CommandDispatcher<ek> $$0) {
      $$0.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)el.b("op").requires(el.a(3))).then(el.a("targets", fa.a()).suggests(($$0x, $$1) -> {
         ayb $$2 = ((ek)$$0x.getSource()).l().ag();
         return eq.b($$2.t().stream().filter($$1x -> !$$2.f($$1x.gr())).map($$0xx -> $$0xx.gr().getName()), $$1);
      }).executes($$0x -> a((ek)$$0x.getSource(), fa.a($$0x, "targets")))));
   }

   private static int a(ek $$0, Collection<GameProfile> $$1) throws CommandSyntaxException {
      ayb $$2 = $$0.l().ag();
      int $$3 = 0;

      for (GameProfile $$4 : $$1) {
         if (!$$2.f($$4)) {
            $$2.a($$4);
            $$3++;
            $$0.a(() -> xo.a("commands.op.success", $$4.getName()), true);
         }
      }

      if ($$3 == 0) {
         throw a.create();
      } else {
         return $$3;
      }
   }
}
