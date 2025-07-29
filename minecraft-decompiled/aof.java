import com.google.common.collect.ImmutableList;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.BoolArgumentType;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Collection;
import javax.annotation.Nullable;

public class aof {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(xo.c("commands.effect.give.failed"));
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(xo.c("commands.effect.clear.everything.failed"));
   private static final SimpleCommandExceptionType c = new SimpleCommandExceptionType(xo.c("commands.effect.clear.specific.failed"));

   public static void a(CommandDispatcher<ek> $$0, eg $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)el.b("effect").requires(el.a(2)))
               .then(
                  ((LiteralArgumentBuilder)el.b("clear").executes($$0x -> a((ek)$$0x.getSource(), ImmutableList.of(((ek)$$0x.getSource()).g()))))
                     .then(
                        ((RequiredArgumentBuilder)el.a("targets", ey.b()).executes($$0x -> a((ek)$$0x.getSource(), ey.b($$0x, "targets"))))
                           .then(el.a("effect", fl.a($$1, mn.Z)).executes($$0x -> a((ek)$$0x.getSource(), ey.b($$0x, "targets"), fl.f($$0x, "effect"))))
                     )
               ))
            .then(
               el.b("give")
                  .then(
                     el.a("targets", ey.b())
                        .then(
                           ((RequiredArgumentBuilder)((RequiredArgumentBuilder)el.a("effect", fl.a($$1, mn.Z))
                                    .executes($$0x -> a((ek)$$0x.getSource(), ey.b($$0x, "targets"), fl.f($$0x, "effect"), null, 0, true)))
                                 .then(
                                    ((RequiredArgumentBuilder)el.a("seconds", IntegerArgumentType.integer(1, 1000000))
                                          .executes(
                                             $$0x -> a(
                                                (ek)$$0x.getSource(),
                                                ey.b($$0x, "targets"),
                                                fl.f($$0x, "effect"),
                                                IntegerArgumentType.getInteger($$0x, "seconds"),
                                                0,
                                                true
                                             )
                                          ))
                                       .then(
                                          ((RequiredArgumentBuilder)el.a("amplifier", IntegerArgumentType.integer(0, 255))
                                                .executes(
                                                   $$0x -> a(
                                                      (ek)$$0x.getSource(),
                                                      ey.b($$0x, "targets"),
                                                      fl.f($$0x, "effect"),
                                                      IntegerArgumentType.getInteger($$0x, "seconds"),
                                                      IntegerArgumentType.getInteger($$0x, "amplifier"),
                                                      true
                                                   )
                                                ))
                                             .then(
                                                el.a("hideParticles", BoolArgumentType.bool())
                                                   .executes(
                                                      $$0x -> a(
                                                         (ek)$$0x.getSource(),
                                                         ey.b($$0x, "targets"),
                                                         fl.f($$0x, "effect"),
                                                         IntegerArgumentType.getInteger($$0x, "seconds"),
                                                         IntegerArgumentType.getInteger($$0x, "amplifier"),
                                                         !BoolArgumentType.getBool($$0x, "hideParticles")
                                                      )
                                                   )
                                             )
                                       )
                                 ))
                              .then(
                                 ((LiteralArgumentBuilder)el.b("infinite")
                                       .executes($$0x -> a((ek)$$0x.getSource(), ey.b($$0x, "targets"), fl.f($$0x, "effect"), -1, 0, true)))
                                    .then(
                                       ((RequiredArgumentBuilder)el.a("amplifier", IntegerArgumentType.integer(0, 255))
                                             .executes(
                                                $$0x -> a(
                                                   (ek)$$0x.getSource(),
                                                   ey.b($$0x, "targets"),
                                                   fl.f($$0x, "effect"),
                                                   -1,
                                                   IntegerArgumentType.getInteger($$0x, "amplifier"),
                                                   true
                                                )
                                             ))
                                          .then(
                                             el.a("hideParticles", BoolArgumentType.bool())
                                                .executes(
                                                   $$0x -> a(
                                                      (ek)$$0x.getSource(),
                                                      ey.b($$0x, "targets"),
                                                      fl.f($$0x, "effect"),
                                                      -1,
                                                      IntegerArgumentType.getInteger($$0x, "amplifier"),
                                                      !BoolArgumentType.getBool($$0x, "hideParticles")
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

   private static int a(ek $$0, Collection<? extends bzm> $$1, jl<byo> $$2, @Nullable Integer $$3, int $$4, boolean $$5) throws CommandSyntaxException {
      byo $$6 = $$2.a();
      int $$7 = 0;
      int $$8;
      if ($$3 != null) {
         if ($$6.a()) {
            $$8 = $$3;
         } else if ($$3 == -1) {
            $$8 = -1;
         } else {
            $$8 = $$3 * 20;
         }
      } else if ($$6.a()) {
         $$8 = 1;
      } else {
         $$8 = 600;
      }

      for (bzm $$13 : $$1) {
         if ($$13 instanceof cam) {
            byq $$14 = new byq($$2, $$8, $$4, false, $$5);
            if (((cam)$$13).b($$14, $$0.f())) {
               $$7++;
            }
         }
      }

      if ($$7 == 0) {
         throw a.create();
      } else {
         if ($$1.size() == 1) {
            $$0.a(() -> xo.a("commands.effect.give.success.single", $$6.g(), $$1.iterator().next().Q_(), $$8 / 20), true);
         } else {
            $$0.a(() -> xo.a("commands.effect.give.success.multiple", $$6.g(), $$1.size(), $$8 / 20), true);
         }

         return $$7;
      }
   }

   private static int a(ek $$0, Collection<? extends bzm> $$1) throws CommandSyntaxException {
      int $$2 = 0;

      for (bzm $$3 : $$1) {
         if ($$3 instanceof cam && ((cam)$$3).eH()) {
            $$2++;
         }
      }

      if ($$2 == 0) {
         throw b.create();
      } else {
         if ($$1.size() == 1) {
            $$0.a(() -> xo.a("commands.effect.clear.everything.success.single", $$1.iterator().next().Q_()), true);
         } else {
            $$0.a(() -> xo.a("commands.effect.clear.everything.success.multiple", $$1.size()), true);
         }

         return $$2;
      }
   }

   private static int a(ek $$0, Collection<? extends bzm> $$1, jl<byo> $$2) throws CommandSyntaxException {
      byo $$3 = $$2.a();
      int $$4 = 0;

      for (bzm $$5 : $$1) {
         if ($$5 instanceof cam && ((cam)$$5).g($$2)) {
            $$4++;
         }
      }

      if ($$4 == 0) {
         throw c.create();
      } else {
         if ($$1.size() == 1) {
            $$0.a(() -> xo.a("commands.effect.clear.specific.success.single", $$3.g(), $$1.iterator().next().Q_()), true);
         } else {
            $$0.a(() -> xo.a("commands.effect.clear.specific.success.multiple", $$3.g(), $$1.size()), true);
         }

         return $$4;
      }
   }
}
