import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import com.mojang.brigadier.tree.LiteralCommandNode;
import java.util.List;

public class aqm {
   private static final yl a = yl.a.a(new xu.e(xo.c("chat.type.team.hover"))).a(new xm.i("/teammsg "));
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(xo.c("commands.teammsg.failed.noteam"));

   public static void a(CommandDispatcher<ek> $$0) {
      LiteralCommandNode<ek> $$1 = $$0.register((LiteralArgumentBuilder)el.b("teammsg").then(el.a("message", fd.a()).executes($$0x -> {
         ek $$1x = (ek)$$0x.getSource();
         bzm $$2 = $$1x.g();
         fjs $$3 = $$2.cu();
         if ($$3 == null) {
            throw b.create();
         } else {
            List<auc> $$4 = $$1x.l().ag().t().stream().filter($$2x -> $$2x == $$2 || $$2x.cu() == $$3).toList();
            if (!$$4.isEmpty()) {
               fd.a($$0x, "message", $$4x -> a($$1x, $$2, $$3, $$4, $$4x));
            }

            return $$4.size();
         }
      })));
      $$0.register((LiteralArgumentBuilder)el.b("tm").redirect($$1));
   }

   private static void a(ek $$0, bzm $$1, fjs $$2, List<auc> $$3, ye $$4) {
      xo $$5 = $$2.e().c(a);
      xk.a $$6 = xk.a(xk.i, $$0).c($$5);
      xk.a $$7 = xk.a(xk.j, $$0).c($$5);
      yd $$8 = yd.a($$4);
      boolean $$9 = false;

      for (auc $$10 : $$3) {
         xk.a $$11 = $$10 == $$1 ? $$7 : $$6;
         boolean $$12 = $$0.a($$10);
         $$10.a($$8, $$12, $$11);
         $$9 |= $$12 && $$4.j();
      }

      if ($$9) {
         $$0.a(ayb.e);
      }
   }
}
