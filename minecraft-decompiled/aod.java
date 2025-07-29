import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import java.util.Collection;

public class aod {
   public static void a(CommandDispatcher<ek> $$0, eg $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)el.b("dialog").requires(el.a(2)))
               .then(
                  el.b("show")
                     .then(
                        el.a("targets", ey.d())
                           .then(el.a("dialog", fo.d($$1)).executes($$0x -> a((ek)$$0x.getSource(), ey.f($$0x, "targets"), fo.d($$0x, "dialog"))))
                     )
               ))
            .then(el.b("clear").then(el.a("targets", ey.d()).executes($$0x -> a((ek)$$0x.getSource(), ey.f($$0x, "targets")))))
      );
   }

   private static int a(ek $$0, Collection<auc> $$1, jl<art> $$2) {
      for (auc $$3 : $$1) {
         $$3.b($$2);
      }

      if ($$1.size() == 1) {
         $$0.a(() -> xo.a("commands.dialog.show.single", $$1.iterator().next().Q_()), true);
      } else {
         $$0.a(() -> xo.a("commands.dialog.show.multiple", $$1.size()), true);
      }

      return $$1.size();
   }

   private static int a(ek $$0, Collection<auc> $$1) {
      for (auc $$2 : $$1) {
         $$2.g.b(aaf.a);
      }

      if ($$1.size() == 1) {
         $$0.a(() -> xo.a("commands.dialog.clear.single", $$1.iterator().next().Q_()), true);
      } else {
         $$0.a(() -> xo.a("commands.dialog.clear.multiple", $$1.size()), true);
      }

      return $$1.size();
   }
}
