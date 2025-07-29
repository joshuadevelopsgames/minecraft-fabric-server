import com.google.common.collect.ImmutableList;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import java.util.Collection;

public class aow {
   public static void a(CommandDispatcher<ek> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)el.b("kill").requires(el.a(2)))
               .executes($$0x -> a((ek)$$0x.getSource(), ImmutableList.of(((ek)$$0x.getSource()).g()))))
            .then(el.a("targets", ey.b()).executes($$0x -> a((ek)$$0x.getSource(), ey.b($$0x, "targets"))))
      );
   }

   private static int a(ek $$0, Collection<? extends bzm> $$1) {
      for (bzm $$2 : $$1) {
         $$2.c($$0.e());
      }

      if ($$1.size() == 1) {
         $$0.a(() -> xo.a("commands.kill.success.single", $$1.iterator().next().Q_()), true);
      } else {
         $$0.a(() -> xo.a("commands.kill.success.multiple", $$1.size()), true);
      }

      return $$1.size();
   }
}
