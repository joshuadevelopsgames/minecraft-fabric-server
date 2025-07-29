import com.mojang.authlib.GameProfile;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public class anz {
   public static void a(CommandDispatcher<ek> $$0, eg $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)el.b("debugconfig").requires(el.a(3)))
                  .then(el.b("config").then(el.a("target", ey.c()).executes($$0x -> a((ek)$$0x.getSource(), ey.e($$0x, "target"))))))
               .then(
                  el.b("unconfig")
                     .then(
                        el.a("target", gd.a())
                           .suggests(($$0x, $$1x) -> eq.b(a(((ek)$$0x.getSource()).l()), $$1x))
                           .executes($$0x -> a((ek)$$0x.getSource(), gd.a($$0x, "target")))
                     )
               ))
            .then(
               el.b("dialog")
                  .then(
                     el.a("target", gd.a())
                        .suggests(($$0x, $$1x) -> eq.b(a(((ek)$$0x.getSource()).l()), $$1x))
                        .then(el.a("dialog", fo.d($$1)).executes($$0x -> a((ek)$$0x.getSource(), gd.a($$0x, "target"), fo.d($$0x, "dialog"))))
                  )
            )
      );
   }

   private static Iterable<String> a(MinecraftServer $$0) {
      Set<String> $$1 = new HashSet<>();

      for (wd $$2 : $$0.ah().e()) {
         if ($$2.k() instanceof avd $$3) {
            $$1.add($$3.j().getId().toString());
         }
      }

      return $$1;
   }

   private static int a(ek $$0, auc $$1) {
      GameProfile $$2 = $$1.gr();
      $$1.g.n();
      $$0.a(() -> xo.b("Switched player " + $$2.getName() + "(" + $$2.getId() + ") to config mode"), false);
      return 1;
   }

   @Nullable
   private static avd a(MinecraftServer $$0, UUID $$1) {
      for (wd $$2 : $$0.ah().e()) {
         if ($$2.k() instanceof avd $$3 && $$3.j().getId().equals($$1)) {
            return $$3;
         }
      }

      return null;
   }

   private static int a(ek $$0, UUID $$1) {
      avd $$2 = a($$0.l(), $$1);
      if ($$2 != null) {
         $$2.m();
         return 1;
      } else {
         $$0.b(xo.b("Can't find player to unconfig"));
         return 0;
      }
   }

   private static int a(ek $$0, UUID $$1, jl<art> $$2) {
      avd $$3 = a($$0.l(), $$1);
      if ($$3 != null) {
         $$3.b(new aao($$2));
         return 1;
      } else {
         $$0.b(xo.b("Can't find player to talk to"));
         return 0;
      }
   }
}
