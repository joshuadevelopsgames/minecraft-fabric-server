import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import java.util.Optional;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Function;

public class aqw {
   public static void a(CommandDispatcher<ek> $$0, eg $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)el.b("waypoint").requires(el.a(2)))
               .then(el.b("list").executes($$0x -> a((ek)$$0x.getSource()))))
            .then(
               el.b("modify")
                  .then(
                     ((RequiredArgumentBuilder)el.a("waypoint", ey.a())
                           .then(
                              ((LiteralArgumentBuilder)((LiteralArgumentBuilder)el.b("color")
                                       .then(el.a("color", et.a()).executes($$0x -> a((ek)$$0x.getSource(), ge.a($$0x, "waypoint"), et.a($$0x, "color")))))
                                    .then(
                                       el.b("hex")
                                          .then(el.a("color", fc.a()).executes($$0x -> a((ek)$$0x.getSource(), ge.a($$0x, "waypoint"), fc.a($$0x, "color"))))
                                    ))
                                 .then(el.b("reset").executes($$0x -> a((ek)$$0x.getSource(), ge.a($$0x, "waypoint"))))
                           ))
                        .then(
                           ((LiteralArgumentBuilder)el.b("style").then(el.b("reset").executes($$0x -> a((ek)$$0x.getSource(), ge.a($$0x, "waypoint"), fkw.b))))
                              .then(
                                 el.b("set")
                                    .then(
                                       el.a("style", fn.a())
                                          .executes($$0x -> a((ek)$$0x.getSource(), ge.a($$0x, "waypoint"), amd.a(fkw.a, fn.a($$0x, "style"))))
                                    )
                              )
                        )
                  )
            )
      );
   }

   private static int a(ek $$0, fkx $$1, amd<fkv> $$2) {
      a($$0, $$1, $$1x -> $$1x.d = $$2);
      $$0.a(() -> xo.c("commands.waypoint.modify.style"), false);
      return 0;
   }

   private static int a(ek $$0, fkx $$1, o $$2) {
      a($$0, $$1, $$1x -> $$1x.e = Optional.of($$2.f()));
      $$0.a(() -> xo.a("commands.waypoint.modify.color", xo.b($$2.g()).a($$2)), false);
      return 0;
   }

   private static int a(ek $$0, fkx $$1, Integer $$2) {
      a($$0, $$1, $$1x -> $$1x.e = Optional.of($$2));
      $$0.a(() -> xo.a("commands.waypoint.modify.color", xo.b(String.format("%06X", baj.c(0, $$2))).b($$2)), false);
      return 0;
   }

   private static int a(ek $$0, fkx $$1) {
      a($$0, $$1, $$0x -> $$0x.e = Optional.empty());
      $$0.a(() -> xo.c("commands.waypoint.modify.color.reset"), false);
      return 0;
   }

   private static int a(ek $$0) {
      aub $$1 = $$0.e();
      Set<fkx> $$2 = $$1.h().b();
      String $$3 = $$1.aj().a().toString();
      if ($$2.isEmpty()) {
         $$0.a(() -> xo.a("commands.waypoint.list.empty", $$3), false);
         return 0;
      } else {
         xo $$4 = xr.b(
            $$2.stream()
               .map(
                  $$1x -> {
                     if ($$1x instanceof cam $$2x) {
                        jb $$3x = $$2x.dx();
                        return $$2x.ht()
                           .f()
                           .a(
                              $$3xx -> $$3xx.a(new xm.i("/execute in " + $$3 + " run tp @s " + $$3x.u() + " " + $$3x.v() + " " + $$3x.w()))
                                 .a(new xu.e(xo.c("chat.coordinates.tooltip")))
                                 .a($$1x.gf().e.orElse(-1))
                           );
                     } else {
                        return xo.b($$1x.toString());
                     }
                  }
               )
               .toList(),
            Function.identity()
         );
         $$0.a(() -> xo.a("commands.waypoint.list.success", $$2.size(), $$3, $$4), false);
         return $$2.size();
      }
   }

   private static void a(ek $$0, fkx $$1, Consumer<fkt.a> $$2) {
      aub $$3 = $$0.e();
      $$3.h().c($$1);
      $$2.accept($$1.gf());
      $$3.h().a($$1);
   }
}
