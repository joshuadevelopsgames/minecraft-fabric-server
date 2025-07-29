import com.mojang.authlib.GameProfile;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Collection;

public class aqy {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(xo.c("commands.whitelist.alreadyOn"));
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(xo.c("commands.whitelist.alreadyOff"));
   private static final SimpleCommandExceptionType c = new SimpleCommandExceptionType(xo.c("commands.whitelist.add.failed"));
   private static final SimpleCommandExceptionType d = new SimpleCommandExceptionType(xo.c("commands.whitelist.remove.failed"));

   public static void a(CommandDispatcher<ek> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)el.b(
                                 "whitelist"
                              )
                              .requires(el.a(3)))
                           .then(el.b("on").executes($$0x -> b((ek)$$0x.getSource()))))
                        .then(el.b("off").executes($$0x -> c((ek)$$0x.getSource()))))
                     .then(el.b("list").executes($$0x -> d((ek)$$0x.getSource()))))
                  .then(el.b("add").then(el.a("targets", fa.a()).suggests(($$0x, $$1) -> {
                     ayb $$2 = ((ek)$$0x.getSource()).l().ag();
                     return eq.b($$2.t().stream().filter($$1x -> !$$2.i().a($$1x.gr())).map($$0xx -> $$0xx.gr().getName()), $$1);
                  }).executes($$0x -> a((ek)$$0x.getSource(), fa.a($$0x, "targets"))))))
               .then(
                  el.b("remove")
                     .then(
                        el.a("targets", fa.a())
                           .suggests(($$0x, $$1) -> eq.a(((ek)$$0x.getSource()).l().ag().j(), $$1))
                           .executes($$0x -> b((ek)$$0x.getSource(), fa.a($$0x, "targets")))
                     )
               ))
            .then(el.b("reload").executes($$0x -> a((ek)$$0x.getSource())))
      );
   }

   private static int a(ek $$0) {
      $$0.l().ag().a();
      $$0.a(() -> xo.c("commands.whitelist.reloaded"), true);
      $$0.l().a($$0);
      return 1;
   }

   private static int a(ek $$0, Collection<GameProfile> $$1) throws CommandSyntaxException {
      ayj $$2 = $$0.l().ag().i();
      int $$3 = 0;

      for (GameProfile $$4 : $$1) {
         if (!$$2.a($$4)) {
            ayk $$5 = new ayk($$4);
            $$2.a($$5);
            $$0.a(() -> xo.a("commands.whitelist.add.success", xo.b($$4.getName())), true);
            $$3++;
         }
      }

      if ($$3 == 0) {
         throw c.create();
      } else {
         return $$3;
      }
   }

   private static int b(ek $$0, Collection<GameProfile> $$1) throws CommandSyntaxException {
      ayj $$2 = $$0.l().ag().i();
      int $$3 = 0;

      for (GameProfile $$4 : $$1) {
         if ($$2.a($$4)) {
            ayk $$5 = new ayk($$4);
            $$2.b($$5);
            $$0.a(() -> xo.a("commands.whitelist.remove.success", xo.b($$4.getName())), true);
            $$3++;
         }
      }

      if ($$3 == 0) {
         throw d.create();
      } else {
         $$0.l().a($$0);
         return $$3;
      }
   }

   private static int b(ek $$0) throws CommandSyntaxException {
      ayb $$1 = $$0.l().ag();
      if ($$1.o()) {
         throw a.create();
      } else {
         $$1.a(true);
         $$0.a(() -> xo.c("commands.whitelist.enabled"), true);
         $$0.l().a($$0);
         return 1;
      }
   }

   private static int c(ek $$0) throws CommandSyntaxException {
      ayb $$1 = $$0.l().ag();
      if (!$$1.o()) {
         throw b.create();
      } else {
         $$1.a(false);
         $$0.a(() -> xo.c("commands.whitelist.disabled"), true);
         return 1;
      }
   }

   private static int d(ek $$0) {
      String[] $$1 = $$0.l().ag().j();
      if ($$1.length == 0) {
         $$0.a(() -> xo.c("commands.whitelist.none"), false);
      } else {
         $$0.a(() -> xo.a("commands.whitelist.list", $$1.length, String.join(", ", $$1)), false);
      }

      return $$1.length;
   }
}
