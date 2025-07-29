import com.google.common.collect.ImmutableList;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import java.util.Collection;

public class aqv {
   public static void a(CommandDispatcher<ek> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)el.b("warden_spawn_tracker").requires(el.a(2)))
               .then(el.b("clear").executes($$0x -> a((ek)$$0x.getSource(), ImmutableList.of(((ek)$$0x.getSource()).h())))))
            .then(
               el.b("set")
                  .then(
                     el.a("warning_level", IntegerArgumentType.integer(0, 4))
                        .executes(
                           $$0x -> a((ek)$$0x.getSource(), ImmutableList.of(((ek)$$0x.getSource()).h()), IntegerArgumentType.getInteger($$0x, "warning_level"))
                        )
                  )
            )
      );
   }

   private static int a(ek $$0, Collection<? extends cut> $$1, int $$2) {
      for (cut $$3 : $$1) {
         $$3.Z().ifPresent($$1x -> $$1x.a($$2));
      }

      if ($$1.size() == 1) {
         $$0.a(() -> xo.a("commands.warden_spawn_tracker.set.success.single", $$1.iterator().next().Q_()), true);
      } else {
         $$0.a(() -> xo.a("commands.warden_spawn_tracker.set.success.multiple", $$1.size()), true);
      }

      return $$1.size();
   }

   private static int a(ek $$0, Collection<? extends cut> $$1) {
      for (cut $$2 : $$1) {
         $$2.Z().ifPresent(cty::b);
      }

      if ($$1.size() == 1) {
         $$0.a(() -> xo.a("commands.warden_spawn_tracker.clear.success.single", $$1.iterator().next().Q_()), true);
      } else {
         $$0.a(() -> xo.a("commands.warden_spawn_tracker.clear.success.multiple", $$1.size()), true);
      }

      return $$1.size();
   }
}
