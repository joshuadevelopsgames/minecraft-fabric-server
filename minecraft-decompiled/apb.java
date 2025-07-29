import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.tree.LiteralCommandNode;
import java.util.Collection;

public class apb {
   public static void a(CommandDispatcher<ek> $$0) {
      LiteralCommandNode<ek> $$1 = $$0.register(
         (LiteralArgumentBuilder)el.b("msg").then(el.a("targets", ey.d()).then(el.a("message", fd.a()).executes($$0x -> {
            Collection<auc> $$1x = ey.f($$0x, "targets");
            if (!$$1x.isEmpty()) {
               fd.a($$0x, "message", $$2 -> a((ek)$$0x.getSource(), $$1x, $$2));
            }

            return $$1x.size();
         })))
      );
      $$0.register((LiteralArgumentBuilder)el.b("tell").redirect($$1));
      $$0.register((LiteralArgumentBuilder)el.b("w").redirect($$1));
   }

   private static void a(ek $$0, Collection<auc> $$1, ye $$2) {
      xk.a $$3 = xk.a(xk.g, $$0);
      yd $$4 = yd.a($$2);
      boolean $$5 = false;

      for (auc $$6 : $$1) {
         xk.a $$7 = xk.a(xk.h, $$0).c($$6.Q_());
         $$0.a($$4, false, $$7);
         boolean $$8 = $$0.a($$6);
         $$6.a($$4, $$8, $$3);
         $$5 |= $$8 && $$2.j();
      }

      if ($$5) {
         $$0.a(ayb.e);
      }
   }
}
