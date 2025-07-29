import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import java.util.Collection;
import javax.annotation.Nullable;

public class aqi {
   public static void a(CommandDispatcher<ek> $$0) {
      RequiredArgumentBuilder<ek, hd> $$1 = (RequiredArgumentBuilder<ek, hd>)((RequiredArgumentBuilder)el.a("targets", ey.d())
            .executes($$0x -> a((ek)$$0x.getSource(), ey.f($$0x, "targets"), null, null)))
         .then(
            el.b("*")
               .then(el.a("sound", fn.a()).suggests(ip.a(ip.b)).executes($$0x -> a((ek)$$0x.getSource(), ey.f($$0x, "targets"), null, fn.a($$0x, "sound"))))
         );

      for (aza $$2 : aza.values()) {
         $$1.then(
            ((LiteralArgumentBuilder)el.b($$2.a()).executes($$1x -> a((ek)$$1x.getSource(), ey.f($$1x, "targets"), $$2, null)))
               .then(el.a("sound", fn.a()).suggests(ip.a(ip.b)).executes($$1x -> a((ek)$$1x.getSource(), ey.f($$1x, "targets"), $$2, fn.a($$1x, "sound"))))
         );
      }

      $$0.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)el.b("stopsound").requires(el.a(2))).then($$1));
   }

   private static int a(ek $$0, Collection<auc> $$1, @Nullable aza $$2, @Nullable ame $$3) {
      agt $$4 = new agt($$3, $$2);

      for (auc $$5 : $$1) {
         $$5.g.b($$4);
      }

      if ($$2 != null) {
         if ($$3 != null) {
            $$0.a(() -> xo.a("commands.stopsound.success.source.sound", xo.a($$3), $$2.a()), true);
         } else {
            $$0.a(() -> xo.a("commands.stopsound.success.source.any", $$2.a()), true);
         }
      } else if ($$3 != null) {
         $$0.a(() -> xo.a("commands.stopsound.success.sourceless.sound", xo.a($$3)), true);
      } else {
         $$0.a(() -> xo.c("commands.stopsound.success.sourceless.any"), true);
      }

      return $$1.size();
   }
}
