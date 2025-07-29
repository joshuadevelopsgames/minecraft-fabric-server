import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.FloatArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;

public class anv {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(xo.c("commands.damage.invulnerable"));

   public static void a(CommandDispatcher<ek> $$0, eg $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)el.b("damage").requires(el.a(2)))
            .then(
               el.a("target", ey.a())
                  .then(
                     ((RequiredArgumentBuilder)el.a("amount", FloatArgumentType.floatArg(0.0F))
                           .executes(
                              $$0x -> a(
                                 (ek)$$0x.getSource(), ey.a($$0x, "target"), FloatArgumentType.getFloat($$0x, "amount"), ((ek)$$0x.getSource()).e().al().p()
                              )
                           ))
                        .then(
                           ((RequiredArgumentBuilder)((RequiredArgumentBuilder)el.a("damageType", fl.a($$1, mn.aR))
                                    .executes(
                                       $$0x -> a(
                                          (ek)$$0x.getSource(),
                                          ey.a($$0x, "target"),
                                          FloatArgumentType.getFloat($$0x, "amount"),
                                          new byb(fl.a($$0x, "damageType", mn.aR))
                                       )
                                    ))
                                 .then(
                                    el.b("at")
                                       .then(
                                          el.a("location", gr.a())
                                             .executes(
                                                $$0x -> a(
                                                   (ek)$$0x.getSource(),
                                                   ey.a($$0x, "target"),
                                                   FloatArgumentType.getFloat($$0x, "amount"),
                                                   new byb(fl.a($$0x, "damageType", mn.aR), gr.a($$0x, "location"))
                                                )
                                             )
                                       )
                                 ))
                              .then(
                                 el.b("by")
                                    .then(
                                       ((RequiredArgumentBuilder)el.a("entity", ey.a())
                                             .executes(
                                                $$0x -> a(
                                                   (ek)$$0x.getSource(),
                                                   ey.a($$0x, "target"),
                                                   FloatArgumentType.getFloat($$0x, "amount"),
                                                   new byb(fl.a($$0x, "damageType", mn.aR), ey.a($$0x, "entity"))
                                                )
                                             ))
                                          .then(
                                             el.b("from")
                                                .then(
                                                   el.a("cause", ey.a())
                                                      .executes(
                                                         $$0x -> a(
                                                            (ek)$$0x.getSource(),
                                                            ey.a($$0x, "target"),
                                                            FloatArgumentType.getFloat($$0x, "amount"),
                                                            new byb(fl.a($$0x, "damageType", mn.aR), ey.a($$0x, "entity"), ey.a($$0x, "cause"))
                                                         )
                                                      )
                                                )
                                          )
                                    )
                              )
                        )
                  )
            )
      );
   }

   private static int a(ek $$0, bzm $$1, float $$2, byb $$3) throws CommandSyntaxException {
      if ($$1.a($$0.e(), $$3, $$2)) {
         $$0.a(() -> xo.a("commands.damage.success", $$2, $$1.Q_()), true);
         return 1;
      } else {
         throw a.create();
      }
   }
}
