import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;

public class apq {
   private static final DynamicCommandExceptionType a = new DynamicCommandExceptionType($$0 -> xo.b("commands.ride.not_riding", $$0));
   private static final Dynamic2CommandExceptionType b = new Dynamic2CommandExceptionType(($$0, $$1) -> xo.b("commands.ride.already_riding", $$0, $$1));
   private static final Dynamic2CommandExceptionType c = new Dynamic2CommandExceptionType(($$0, $$1) -> xo.b("commands.ride.mount.failure.generic", $$0, $$1));
   private static final SimpleCommandExceptionType d = new SimpleCommandExceptionType(xo.c("commands.ride.mount.failure.cant_ride_players"));
   private static final SimpleCommandExceptionType e = new SimpleCommandExceptionType(xo.c("commands.ride.mount.failure.loop"));
   private static final SimpleCommandExceptionType f = new SimpleCommandExceptionType(xo.c("commands.ride.mount.failure.wrong_dimension"));

   public static void a(CommandDispatcher<ek> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)el.b("ride").requires(el.a(2)))
            .then(
               ((RequiredArgumentBuilder)el.a("target", ey.a())
                     .then(el.b("mount").then(el.a("vehicle", ey.a()).executes($$0x -> a((ek)$$0x.getSource(), ey.a($$0x, "target"), ey.a($$0x, "vehicle"))))))
                  .then(el.b("dismount").executes($$0x -> a((ek)$$0x.getSource(), ey.a($$0x, "target"))))
            )
      );
   }

   private static int a(ek $$0, bzm $$1, bzm $$2) throws CommandSyntaxException {
      bzm $$3 = $$1.dm();
      if ($$3 != null) {
         throw b.create($$1.Q_(), $$3.Q_());
      } else if ($$2.ap() == bzv.bU) {
         throw d.create();
      } else if ($$1.dc().anyMatch($$1x -> $$1x == $$2)) {
         throw e.create();
      } else if ($$1.ai() != $$2.ai()) {
         throw f.create();
      } else if (!$$1.a($$2, true)) {
         throw c.create($$1.Q_(), $$2.Q_());
      } else {
         $$0.a(() -> xo.a("commands.ride.mount.success", $$1.Q_(), $$2.Q_()), true);
         return 1;
      }
   }

   private static int a(ek $$0, bzm $$1) throws CommandSyntaxException {
      bzm $$2 = $$1.dm();
      if ($$2 == null) {
         throw a.create($$1.Q_());
      } else {
         $$1.bS();
         $$0.a(() -> xo.a("commands.ride.dismount.success", $$1.Q_(), $$2.Q_()), true);
         return 1;
      }
   }
}
