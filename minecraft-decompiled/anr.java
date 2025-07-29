import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.BoolArgumentType;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import com.mojang.brigadier.suggestion.SuggestionProvider;
import java.util.Collection;
import java.util.Collections;

public class anr {
   private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> xo.b("commands.bossbar.create.failed", $$0));
   private static final DynamicCommandExceptionType c = new DynamicCommandExceptionType($$0 -> xo.b("commands.bossbar.unknown", $$0));
   private static final SimpleCommandExceptionType d = new SimpleCommandExceptionType(xo.c("commands.bossbar.set.players.unchanged"));
   private static final SimpleCommandExceptionType e = new SimpleCommandExceptionType(xo.c("commands.bossbar.set.name.unchanged"));
   private static final SimpleCommandExceptionType f = new SimpleCommandExceptionType(xo.c("commands.bossbar.set.color.unchanged"));
   private static final SimpleCommandExceptionType g = new SimpleCommandExceptionType(xo.c("commands.bossbar.set.style.unchanged"));
   private static final SimpleCommandExceptionType h = new SimpleCommandExceptionType(xo.c("commands.bossbar.set.value.unchanged"));
   private static final SimpleCommandExceptionType i = new SimpleCommandExceptionType(xo.c("commands.bossbar.set.max.unchanged"));
   private static final SimpleCommandExceptionType j = new SimpleCommandExceptionType(xo.c("commands.bossbar.set.visibility.unchanged.hidden"));
   private static final SimpleCommandExceptionType k = new SimpleCommandExceptionType(xo.c("commands.bossbar.set.visibility.unchanged.visible"));
   public static final SuggestionProvider<ek> a = ($$0, $$1) -> eq.a(((ek)$$0.getSource()).l().aM().a(), $$1);

   public static void a(CommandDispatcher<ek> $$0, eg $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)el.b(
                              "bossbar"
                           )
                           .requires(el.a(2)))
                        .then(
                           el.b("add")
                              .then(
                                 el.a("id", fn.a())
                                    .then(el.a("name", eu.a($$1)).executes($$0x -> a((ek)$$0x.getSource(), fn.a($$0x, "id"), eu.b($$0x, "name"))))
                              )
                        ))
                     .then(el.b("remove").then(el.a("id", fn.a()).suggests(a).executes($$0x -> e((ek)$$0x.getSource(), a($$0x))))))
                  .then(el.b("list").executes($$0x -> a((ek)$$0x.getSource()))))
               .then(
                  el.b("set")
                     .then(
                        ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)el.a(
                                                "id", fn.a()
                                             )
                                             .suggests(a)
                                             .then(
                                                el.b("name")
                                                   .then(el.a("name", eu.a($$1)).executes($$0x -> a((ek)$$0x.getSource(), a($$0x), eu.b($$0x, "name"))))
                                             ))
                                          .then(
                                             ((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)el.b(
                                                                     "color"
                                                                  )
                                                                  .then(el.b("pink").executes($$0x -> a((ek)$$0x.getSource(), a($$0x), bwz.a.a))))
                                                               .then(el.b("blue").executes($$0x -> a((ek)$$0x.getSource(), a($$0x), bwz.a.b))))
                                                            .then(el.b("red").executes($$0x -> a((ek)$$0x.getSource(), a($$0x), bwz.a.c))))
                                                         .then(el.b("green").executes($$0x -> a((ek)$$0x.getSource(), a($$0x), bwz.a.d))))
                                                      .then(el.b("yellow").executes($$0x -> a((ek)$$0x.getSource(), a($$0x), bwz.a.e))))
                                                   .then(el.b("purple").executes($$0x -> a((ek)$$0x.getSource(), a($$0x), bwz.a.f))))
                                                .then(el.b("white").executes($$0x -> a((ek)$$0x.getSource(), a($$0x), bwz.a.g)))
                                          ))
                                       .then(
                                          ((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)el.b("style")
                                                         .then(el.b("progress").executes($$0x -> a((ek)$$0x.getSource(), a($$0x), bwz.b.a))))
                                                      .then(el.b("notched_6").executes($$0x -> a((ek)$$0x.getSource(), a($$0x), bwz.b.b))))
                                                   .then(el.b("notched_10").executes($$0x -> a((ek)$$0x.getSource(), a($$0x), bwz.b.c))))
                                                .then(el.b("notched_12").executes($$0x -> a((ek)$$0x.getSource(), a($$0x), bwz.b.d))))
                                             .then(el.b("notched_20").executes($$0x -> a((ek)$$0x.getSource(), a($$0x), bwz.b.e)))
                                       ))
                                    .then(
                                       el.b("value")
                                          .then(
                                             el.a("value", IntegerArgumentType.integer(0))
                                                .executes($$0x -> a((ek)$$0x.getSource(), a($$0x), IntegerArgumentType.getInteger($$0x, "value")))
                                          )
                                    ))
                                 .then(
                                    el.b("max")
                                       .then(
                                          el.a("max", IntegerArgumentType.integer(1))
                                             .executes($$0x -> b((ek)$$0x.getSource(), a($$0x), IntegerArgumentType.getInteger($$0x, "max")))
                                       )
                                 ))
                              .then(
                                 el.b("visible")
                                    .then(
                                       el.a("visible", BoolArgumentType.bool())
                                          .executes($$0x -> a((ek)$$0x.getSource(), a($$0x), BoolArgumentType.getBool($$0x, "visible")))
                                    )
                              ))
                           .then(
                              ((LiteralArgumentBuilder)el.b("players").executes($$0x -> a((ek)$$0x.getSource(), a($$0x), Collections.emptyList())))
                                 .then(el.a("targets", ey.d()).executes($$0x -> a((ek)$$0x.getSource(), a($$0x), ey.d($$0x, "targets"))))
                           )
                     )
               ))
            .then(
               el.b("get")
                  .then(
                     ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)el.a("id", fn.a())
                                 .suggests(a)
                                 .then(el.b("value").executes($$0x -> a((ek)$$0x.getSource(), a($$0x)))))
                              .then(el.b("max").executes($$0x -> b((ek)$$0x.getSource(), a($$0x)))))
                           .then(el.b("visible").executes($$0x -> c((ek)$$0x.getSource(), a($$0x)))))
                        .then(el.b("players").executes($$0x -> d((ek)$$0x.getSource(), a($$0x))))
                  )
            )
      );
   }

   private static int a(ek $$0, ang $$1) {
      $$0.a(() -> xo.a("commands.bossbar.get.value", $$1.e(), $$1.c()), true);
      return $$1.c();
   }

   private static int b(ek $$0, ang $$1) {
      $$0.a(() -> xo.a("commands.bossbar.get.max", $$1.e(), $$1.d()), true);
      return $$1.d();
   }

   private static int c(ek $$0, ang $$1) {
      if ($$1.g()) {
         $$0.a(() -> xo.a("commands.bossbar.get.visible.visible", $$1.e()), true);
         return 1;
      } else {
         $$0.a(() -> xo.a("commands.bossbar.get.visible.hidden", $$1.e()), true);
         return 0;
      }
   }

   private static int d(ek $$0, ang $$1) {
      if ($$1.h().isEmpty()) {
         $$0.a(() -> xo.a("commands.bossbar.get.players.none", $$1.e()), true);
      } else {
         $$0.a(() -> xo.a("commands.bossbar.get.players.some", $$1.e(), $$1.h().size(), xr.b($$1.h(), cut::Q_)), true);
      }

      return $$1.h().size();
   }

   private static int a(ek $$0, ang $$1, boolean $$2) throws CommandSyntaxException {
      if ($$1.g() == $$2) {
         if ($$2) {
            throw k.create();
         } else {
            throw j.create();
         }
      } else {
         $$1.d($$2);
         if ($$2) {
            $$0.a(() -> xo.a("commands.bossbar.set.visible.success.visible", $$1.e()), true);
         } else {
            $$0.a(() -> xo.a("commands.bossbar.set.visible.success.hidden", $$1.e()), true);
         }

         return 0;
      }
   }

   private static int a(ek $$0, ang $$1, int $$2) throws CommandSyntaxException {
      if ($$1.c() == $$2) {
         throw h.create();
      } else {
         $$1.a($$2);
         $$0.a(() -> xo.a("commands.bossbar.set.value.success", $$1.e(), $$2), true);
         return $$2;
      }
   }

   private static int b(ek $$0, ang $$1, int $$2) throws CommandSyntaxException {
      if ($$1.d() == $$2) {
         throw i.create();
      } else {
         $$1.b($$2);
         $$0.a(() -> xo.a("commands.bossbar.set.max.success", $$1.e(), $$2), true);
         return $$2;
      }
   }

   private static int a(ek $$0, ang $$1, bwz.a $$2) throws CommandSyntaxException {
      if ($$1.l().equals($$2)) {
         throw f.create();
      } else {
         $$1.a($$2);
         $$0.a(() -> xo.a("commands.bossbar.set.color.success", $$1.e()), true);
         return 0;
      }
   }

   private static int a(ek $$0, ang $$1, bwz.b $$2) throws CommandSyntaxException {
      if ($$1.m().equals($$2)) {
         throw g.create();
      } else {
         $$1.a($$2);
         $$0.a(() -> xo.a("commands.bossbar.set.style.success", $$1.e()), true);
         return 0;
      }
   }

   private static int a(ek $$0, ang $$1, xo $$2) throws CommandSyntaxException {
      xo $$3 = xr.a($$0, $$2, null, 0);
      if ($$1.j().equals($$3)) {
         throw e.create();
      } else {
         $$1.a($$3);
         $$0.a(() -> xo.a("commands.bossbar.set.name.success", $$1.e()), true);
         return 0;
      }
   }

   private static int a(ek $$0, ang $$1, Collection<auc> $$2) throws CommandSyntaxException {
      boolean $$3 = $$1.a($$2);
      if (!$$3) {
         throw d.create();
      } else {
         if ($$1.h().isEmpty()) {
            $$0.a(() -> xo.a("commands.bossbar.set.players.success.none", $$1.e()), true);
         } else {
            $$0.a(() -> xo.a("commands.bossbar.set.players.success.some", $$1.e(), $$2.size(), xr.b($$2, cut::Q_)), true);
         }

         return $$1.h().size();
      }
   }

   private static int a(ek $$0) {
      Collection<ang> $$1 = $$0.l().aM().b();
      if ($$1.isEmpty()) {
         $$0.a(() -> xo.c("commands.bossbar.list.bars.none"), false);
      } else {
         $$0.a(() -> xo.a("commands.bossbar.list.bars.some", $$1.size(), xr.b($$1, ang::e)), false);
      }

      return $$1.size();
   }

   private static int a(ek $$0, ame $$1, xo $$2) throws CommandSyntaxException {
      anh $$3 = $$0.l().aM();
      if ($$3.a($$1) != null) {
         throw b.create($$1.toString());
      } else {
         ang $$4 = $$3.a($$1, xr.a($$0, $$2, null, 0));
         $$0.a(() -> xo.a("commands.bossbar.create.success", $$4.e()), true);
         return $$3.b().size();
      }
   }

   private static int e(ek $$0, ang $$1) {
      anh $$2 = $$0.l().aM();
      $$1.b();
      $$2.a($$1);
      $$0.a(() -> xo.a("commands.bossbar.remove.success", $$1.e()), true);
      return $$2.b().size();
   }

   public static ang a(CommandContext<ek> $$0) throws CommandSyntaxException {
      ame $$1 = fn.a($$0, "id");
      ang $$2 = ((ek)$$0.getSource()).l().aM().a($$1);
      if ($$2 == null) {
         throw c.create($$1.toString());
      } else {
         return $$2;
      }
   }
}
