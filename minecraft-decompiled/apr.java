import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;

public class apr {
   public static void a(CommandDispatcher<ek> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)el.b("rotate").requires(el.a(2)))
            .then(
               ((RequiredArgumentBuilder)el.a("target", ey.a())
                     .then(el.a("rotation", go.a()).executes($$0x -> a((ek)$$0x.getSource(), ey.a($$0x, "target"), go.a($$0x, "rotation")))))
                  .then(
                     ((LiteralArgumentBuilder)el.b("facing")
                           .then(
                              el.b("entity")
                                 .then(
                                    ((RequiredArgumentBuilder)el.a("facingEntity", ey.a())
                                          .executes($$0x -> a((ek)$$0x.getSource(), ey.a($$0x, "target"), new aoz.a(ey.a($$0x, "facingEntity"), ex.a.a))))
                                       .then(
                                          el.a("facingAnchor", ex.a())
                                             .executes(
                                                $$0x -> a(
                                                   (ek)$$0x.getSource(),
                                                   ey.a($$0x, "target"),
                                                   new aoz.a(ey.a($$0x, "facingEntity"), ex.a($$0x, "facingAnchor"))
                                                )
                                             )
                                       )
                                 )
                           ))
                        .then(
                           el.a("facingLocation", gr.a())
                              .executes($$0x -> a((ek)$$0x.getSource(), ey.a($$0x, "target"), new aoz.b(gr.a($$0x, "facingLocation"))))
                        )
                  )
            )
      );
   }

   private static int a(ek $$0, bzm $$1, gm $$2) {
      fir $$3 = $$2.b($$0);
      $$1.a($$3.k, $$3.j);
      $$0.a(() -> xo.a("commands.rotate.success", $$1.Q_()), true);
      return 1;
   }

   private static int a(ek $$0, bzm $$1, aoz $$2) {
      $$2.perform($$0, $$1);
      $$0.a(() -> xo.a("commands.rotate.success", $$1.Q_()), true);
      return 1;
   }
}
