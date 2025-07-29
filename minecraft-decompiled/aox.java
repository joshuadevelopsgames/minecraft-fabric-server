import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import java.util.List;
import java.util.function.Function;

public class aox {
   public static void a(CommandDispatcher<ek> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)el.b("list").executes($$0x -> a((ek)$$0x.getSource())))
            .then(el.b("uuids").executes($$0x -> b((ek)$$0x.getSource())))
      );
   }

   private static int a(ek $$0) {
      return a($$0, cut::Q_);
   }

   private static int b(ek $$0) {
      return a($$0, $$0x -> xo.a("commands.list.nameAndId", $$0x.aj(), xo.a($$0x.gr().getId())));
   }

   private static int a(ek $$0, Function<auc, xo> $$1) {
      ayb $$2 = $$0.l().ag();
      List<auc> $$3 = $$2.t();
      xo $$4 = xr.b($$3, $$1);
      $$0.a(() -> xo.a("commands.list.players", $$3.size(), $$2.n(), $$4), false);
      return $$3.size();
   }
}
