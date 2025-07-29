import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import java.util.Collection;
import java.util.Collections;

public class aqc {
   public static void a(CommandDispatcher<ek> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)el.b("spawnpoint").requires(el.a(2)))
               .executes($$0x -> a((ek)$$0x.getSource(), Collections.singleton(((ek)$$0x.getSource()).h()), jb.a((jv)((ek)$$0x.getSource()).d()), 0.0F)))
            .then(
               ((RequiredArgumentBuilder)el.a("targets", ey.d())
                     .executes($$0x -> a((ek)$$0x.getSource(), ey.f($$0x, "targets"), jb.a((jv)((ek)$$0x.getSource()).d()), 0.0F)))
                  .then(
                     ((RequiredArgumentBuilder)el.a("pos", gk.a()).executes($$0x -> a((ek)$$0x.getSource(), ey.f($$0x, "targets"), gk.c($$0x, "pos"), 0.0F)))
                        .then(el.a("angle", er.a()).executes($$0x -> a((ek)$$0x.getSource(), ey.f($$0x, "targets"), gk.c($$0x, "pos"), er.a($$0x, "angle"))))
                  )
            )
      );
   }

   private static int a(ek $$0, Collection<auc> $$1, jb $$2, float $$3) {
      amd<dmu> $$4 = $$0.e().aj();

      for (auc $$5 : $$1) {
         $$5.a(new auc.a($$4, $$2, $$3, true), false);
      }

      String $$6 = $$4.a().toString();
      if ($$1.size() == 1) {
         $$0.a(() -> xo.a("commands.spawnpoint.success.single", $$2.u(), $$2.v(), $$2.w(), $$3, $$6, $$1.iterator().next().Q_()), true);
      } else {
         $$0.a(() -> xo.a("commands.spawnpoint.success.multiple", $$2.u(), $$2.v(), $$2.w(), $$3, $$6, $$1.size()), true);
      }

      return $$1.size();
   }
}
