import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.DoubleArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType;
import com.mojang.brigadier.exceptions.Dynamic3CommandExceptionType;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import java.util.stream.Stream;

public class ann {
   private static final DynamicCommandExceptionType a = new DynamicCommandExceptionType($$0 -> xo.b("commands.attribute.failed.entity", $$0));
   private static final Dynamic2CommandExceptionType b = new Dynamic2CommandExceptionType(
      ($$0, $$1) -> xo.b("commands.attribute.failed.no_attribute", $$0, $$1)
   );
   private static final Dynamic3CommandExceptionType c = new Dynamic3CommandExceptionType(
      ($$0, $$1, $$2) -> xo.b("commands.attribute.failed.no_modifier", $$1, $$0, $$2)
   );
   private static final Dynamic3CommandExceptionType d = new Dynamic3CommandExceptionType(
      ($$0, $$1, $$2) -> xo.b("commands.attribute.failed.modifier_already_present", $$2, $$1, $$0)
   );

   public static void a(CommandDispatcher<ek> $$0, eg $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)el.b("attribute").requires(el.a(2)))
            .then(
               el.a("target", ey.a())
                  .then(
                     ((RequiredArgumentBuilder)((RequiredArgumentBuilder)el.a("attribute", fl.a($$1, mn.c))
                              .then(
                                 ((LiteralArgumentBuilder)el.b("get")
                                       .executes($$0x -> a((ek)$$0x.getSource(), ey.a($$0x, "target"), fl.a($$0x, "attribute"), 1.0)))
                                    .then(
                                       el.a("scale", DoubleArgumentType.doubleArg())
                                          .executes(
                                             $$0x -> a(
                                                (ek)$$0x.getSource(),
                                                ey.a($$0x, "target"),
                                                fl.a($$0x, "attribute"),
                                                DoubleArgumentType.getDouble($$0x, "scale")
                                             )
                                          )
                                    )
                              ))
                           .then(
                              ((LiteralArgumentBuilder)((LiteralArgumentBuilder)el.b("base")
                                       .then(
                                          el.b("set")
                                             .then(
                                                el.a("value", DoubleArgumentType.doubleArg())
                                                   .executes(
                                                      $$0x -> c(
                                                         (ek)$$0x.getSource(),
                                                         ey.a($$0x, "target"),
                                                         fl.a($$0x, "attribute"),
                                                         DoubleArgumentType.getDouble($$0x, "value")
                                                      )
                                                   )
                                             )
                                       ))
                                    .then(
                                       ((LiteralArgumentBuilder)el.b("get")
                                             .executes($$0x -> b((ek)$$0x.getSource(), ey.a($$0x, "target"), fl.a($$0x, "attribute"), 1.0)))
                                          .then(
                                             el.a("scale", DoubleArgumentType.doubleArg())
                                                .executes(
                                                   $$0x -> b(
                                                      (ek)$$0x.getSource(),
                                                      ey.a($$0x, "target"),
                                                      fl.a($$0x, "attribute"),
                                                      DoubleArgumentType.getDouble($$0x, "scale")
                                                   )
                                                )
                                          )
                                    ))
                                 .then(el.b("reset").executes($$0x -> a((ek)$$0x.getSource(), ey.a($$0x, "target"), fl.a($$0x, "attribute"))))
                           ))
                        .then(
                           ((LiteralArgumentBuilder)((LiteralArgumentBuilder)el.b("modifier")
                                    .then(
                                       el.b("add")
                                          .then(
                                             el.a("id", fn.a())
                                                .then(
                                                   ((RequiredArgumentBuilder)((RequiredArgumentBuilder)el.a("value", DoubleArgumentType.doubleArg())
                                                            .then(
                                                               el.b("add_value")
                                                                  .executes(
                                                                     $$0x -> a(
                                                                        (ek)$$0x.getSource(),
                                                                        ey.a($$0x, "target"),
                                                                        fl.a($$0x, "attribute"),
                                                                        fn.a($$0x, "id"),
                                                                        DoubleArgumentType.getDouble($$0x, "value"),
                                                                        cbq.a.a
                                                                     )
                                                                  )
                                                            ))
                                                         .then(
                                                            el.b("add_multiplied_base")
                                                               .executes(
                                                                  $$0x -> a(
                                                                     (ek)$$0x.getSource(),
                                                                     ey.a($$0x, "target"),
                                                                     fl.a($$0x, "attribute"),
                                                                     fn.a($$0x, "id"),
                                                                     DoubleArgumentType.getDouble($$0x, "value"),
                                                                     cbq.a.b
                                                                  )
                                                               )
                                                         ))
                                                      .then(
                                                         el.b("add_multiplied_total")
                                                            .executes(
                                                               $$0x -> a(
                                                                  (ek)$$0x.getSource(),
                                                                  ey.a($$0x, "target"),
                                                                  fl.a($$0x, "attribute"),
                                                                  fn.a($$0x, "id"),
                                                                  DoubleArgumentType.getDouble($$0x, "value"),
                                                                  cbq.a.c
                                                               )
                                                            )
                                                      )
                                                )
                                          )
                                    ))
                                 .then(
                                    el.b("remove")
                                       .then(
                                          el.a("id", fn.a())
                                             .suggests(($$0x, $$1x) -> eq.a(c(ey.a($$0x, "target"), fl.a($$0x, "attribute")), $$1x))
                                             .executes($$0x -> a((ek)$$0x.getSource(), ey.a($$0x, "target"), fl.a($$0x, "attribute"), fn.a($$0x, "id")))
                                       )
                                 ))
                              .then(
                                 el.b("value")
                                    .then(
                                       el.b("get")
                                          .then(
                                             ((RequiredArgumentBuilder)el.a("id", fn.a())
                                                   .suggests(($$0x, $$1x) -> eq.a(c(ey.a($$0x, "target"), fl.a($$0x, "attribute")), $$1x))
                                                   .executes(
                                                      $$0x -> a((ek)$$0x.getSource(), ey.a($$0x, "target"), fl.a($$0x, "attribute"), fn.a($$0x, "id"), 1.0)
                                                   ))
                                                .then(
                                                   el.a("scale", DoubleArgumentType.doubleArg())
                                                      .executes(
                                                         $$0x -> a(
                                                            (ek)$$0x.getSource(),
                                                            ey.a($$0x, "target"),
                                                            fl.a($$0x, "attribute"),
                                                            fn.a($$0x, "id"),
                                                            DoubleArgumentType.getDouble($$0x, "scale")
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

   private static cbo a(bzm $$0, jl<cbn> $$1) throws CommandSyntaxException {
      cbo $$2 = a($$0).fg().a($$1);
      if ($$2 == null) {
         throw b.create($$0.aj(), a($$1));
      } else {
         return $$2;
      }
   }

   private static cam a(bzm $$0) throws CommandSyntaxException {
      if (!($$0 instanceof cam)) {
         throw a.create($$0.aj());
      } else {
         return (cam)$$0;
      }
   }

   private static cam b(bzm $$0, jl<cbn> $$1) throws CommandSyntaxException {
      cam $$2 = a($$0);
      if (!$$2.fg().b($$1)) {
         throw b.create($$0.aj(), a($$1));
      } else {
         return $$2;
      }
   }

   private static int a(ek $$0, bzm $$1, jl<cbn> $$2, double $$3) throws CommandSyntaxException {
      cam $$4 = b($$1, $$2);
      double $$5 = $$4.i($$2);
      $$0.a(() -> xo.a("commands.attribute.value.get.success", a($$2), $$1.aj(), $$5), false);
      return (int)($$5 * $$3);
   }

   private static int b(ek $$0, bzm $$1, jl<cbn> $$2, double $$3) throws CommandSyntaxException {
      cam $$4 = b($$1, $$2);
      double $$5 = $$4.j($$2);
      $$0.a(() -> xo.a("commands.attribute.base_value.get.success", a($$2), $$1.aj(), $$5), false);
      return (int)($$5 * $$3);
   }

   private static int a(ek $$0, bzm $$1, jl<cbn> $$2, ame $$3, double $$4) throws CommandSyntaxException {
      cam $$5 = b($$1, $$2);
      cbp $$6 = $$5.fg();
      if (!$$6.a($$2, $$3)) {
         throw c.create($$1.aj(), a($$2), $$3);
      } else {
         double $$7 = $$6.b($$2, $$3);
         $$0.a(() -> xo.a("commands.attribute.modifier.value.get.success", xo.a($$3), a($$2), $$1.aj(), $$7), false);
         return (int)($$7 * $$4);
      }
   }

   private static Stream<ame> c(bzm $$0, jl<cbn> $$1) throws CommandSyntaxException {
      cbo $$2 = a($$0, $$1);
      return $$2.c().stream().map(cbq::a);
   }

   private static int c(ek $$0, bzm $$1, jl<cbn> $$2, double $$3) throws CommandSyntaxException {
      a($$1, $$2).a($$3);
      $$0.a(() -> xo.a("commands.attribute.base_value.set.success", a($$2), $$1.aj(), $$3), false);
      return 1;
   }

   private static int a(ek $$0, bzm $$1, jl<cbn> $$2) throws CommandSyntaxException {
      cam $$3 = a($$1);
      if (!$$3.fg().e($$2)) {
         throw b.create($$1.aj(), a($$2));
      } else {
         double $$4 = $$3.j($$2);
         $$0.a(() -> xo.a("commands.attribute.base_value.reset.success", a($$2), $$1.aj(), $$4), false);
         return 1;
      }
   }

   private static int a(ek $$0, bzm $$1, jl<cbn> $$2, ame $$3, double $$4, cbq.a $$5) throws CommandSyntaxException {
      cbo $$6 = a($$1, $$2);
      cbq $$7 = new cbq($$3, $$4, $$5);
      if ($$6.b($$3)) {
         throw d.create($$1.aj(), a($$2), $$3);
      } else {
         $$6.d($$7);
         $$0.a(() -> xo.a("commands.attribute.modifier.add.success", xo.a($$3), a($$2), $$1.aj()), false);
         return 1;
      }
   }

   private static int a(ek $$0, bzm $$1, jl<cbn> $$2, ame $$3) throws CommandSyntaxException {
      cbo $$4 = a($$1, $$2);
      if ($$4.c($$3)) {
         $$0.a(() -> xo.a("commands.attribute.modifier.remove.success", xo.a($$3), a($$2), $$1.aj()), false);
         return 1;
      } else {
         throw c.create($$1.aj(), a($$2), $$3);
      }
   }

   private static xo a(jl<cbn> $$0) {
      return xo.c($$0.a().c());
   }
}
