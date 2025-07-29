import com.google.common.collect.Lists;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.BoolArgumentType;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.brigadier.builder.ArgumentBuilder;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntMaps;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class apx {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(xo.c("commands.scoreboard.objectives.add.duplicate"));
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(xo.c("commands.scoreboard.objectives.display.alreadyEmpty"));
   private static final SimpleCommandExceptionType c = new SimpleCommandExceptionType(xo.c("commands.scoreboard.objectives.display.alreadySet"));
   private static final SimpleCommandExceptionType d = new SimpleCommandExceptionType(xo.c("commands.scoreboard.players.enable.failed"));
   private static final SimpleCommandExceptionType e = new SimpleCommandExceptionType(xo.c("commands.scoreboard.players.enable.invalid"));
   private static final Dynamic2CommandExceptionType f = new Dynamic2CommandExceptionType(($$0, $$1) -> xo.b("commands.scoreboard.players.get.null", $$0, $$1));

   public static void a(CommandDispatcher<ek> $$0, eg $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)el.b("scoreboard").requires(el.a(2)))
               .then(
                  ((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)el.b("objectives")
                                 .then(el.b("list").executes($$0x -> b((ek)$$0x.getSource()))))
                              .then(
                                 el.b("add")
                                    .then(
                                       el.a("objective", StringArgumentType.word())
                                          .then(
                                             ((RequiredArgumentBuilder)el.a("criteria", fh.a())
                                                   .executes(
                                                      $$0x -> a(
                                                         (ek)$$0x.getSource(),
                                                         StringArgumentType.getString($$0x, "objective"),
                                                         fh.a($$0x, "criteria"),
                                                         xo.b(StringArgumentType.getString($$0x, "objective"))
                                                      )
                                                   ))
                                                .then(
                                                   el.a("displayName", eu.a($$1))
                                                      .executes(
                                                         $$0x -> a(
                                                            (ek)$$0x.getSource(),
                                                            StringArgumentType.getString($$0x, "objective"),
                                                            fh.a($$0x, "criteria"),
                                                            eu.b($$0x, "displayName")
                                                         )
                                                      )
                                                )
                                          )
                                    )
                              ))
                           .then(
                              el.b("modify")
                                 .then(
                                    ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)el.a("objective", fg.a())
                                                .then(
                                                   el.b("displayname")
                                                      .then(
                                                         el.a("displayName", eu.a($$1))
                                                            .executes($$0x -> a((ek)$$0x.getSource(), fg.a($$0x, "objective"), eu.b($$0x, "displayName")))
                                                      )
                                                ))
                                             .then(a()))
                                          .then(
                                             el.b("displayautoupdate")
                                                .then(
                                                   el.a("value", BoolArgumentType.bool())
                                                      .executes(
                                                         $$0x -> a((ek)$$0x.getSource(), fg.a($$0x, "objective"), BoolArgumentType.getBool($$0x, "value"))
                                                      )
                                                )
                                          ))
                                       .then(a($$1, el.b("numberformat"), ($$0x, $$1x) -> a((ek)$$0x.getSource(), fg.a($$0x, "objective"), $$1x)))
                                 )
                           ))
                        .then(el.b("remove").then(el.a("objective", fg.a()).executes($$0x -> a((ek)$$0x.getSource(), fg.a($$0x, "objective"))))))
                     .then(
                        el.b("setdisplay")
                           .then(
                              ((RequiredArgumentBuilder)el.a("slot", ft.a()).executes($$0x -> a((ek)$$0x.getSource(), ft.a($$0x, "slot"))))
                                 .then(el.a("objective", fg.a()).executes($$0x -> a((ek)$$0x.getSource(), ft.a($$0x, "slot"), fg.a($$0x, "objective"))))
                           )
                     )
               ))
            .then(
               ((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)el.b(
                                             "players"
                                          )
                                          .then(
                                             ((LiteralArgumentBuilder)el.b("list").executes($$0x -> a((ek)$$0x.getSource())))
                                                .then(el.a("target", fs.a()).suggests(fs.a).executes($$0x -> a((ek)$$0x.getSource(), fs.a($$0x, "target"))))
                                          ))
                                       .then(
                                          el.b("set")
                                             .then(
                                                el.a("targets", fs.b())
                                                   .suggests(fs.a)
                                                   .then(
                                                      el.a("objective", fg.a())
                                                         .then(
                                                            el.a("score", IntegerArgumentType.integer())
                                                               .executes(
                                                                  $$0x -> a(
                                                                     (ek)$$0x.getSource(),
                                                                     fs.c($$0x, "targets"),
                                                                     fg.b($$0x, "objective"),
                                                                     IntegerArgumentType.getInteger($$0x, "score")
                                                                  )
                                                               )
                                                         )
                                                   )
                                             )
                                       ))
                                    .then(
                                       el.b("get")
                                          .then(
                                             el.a("target", fs.a())
                                                .suggests(fs.a)
                                                .then(
                                                   el.a("objective", fg.a())
                                                      .executes($$0x -> a((ek)$$0x.getSource(), fs.a($$0x, "target"), fg.a($$0x, "objective")))
                                                )
                                          )
                                    ))
                                 .then(
                                    el.b("add")
                                       .then(
                                          el.a("targets", fs.b())
                                             .suggests(fs.a)
                                             .then(
                                                el.a("objective", fg.a())
                                                   .then(
                                                      el.a("score", IntegerArgumentType.integer(0))
                                                         .executes(
                                                            $$0x -> b(
                                                               (ek)$$0x.getSource(),
                                                               fs.c($$0x, "targets"),
                                                               fg.b($$0x, "objective"),
                                                               IntegerArgumentType.getInteger($$0x, "score")
                                                            )
                                                         )
                                                   )
                                             )
                                       )
                                 ))
                              .then(
                                 el.b("remove")
                                    .then(
                                       el.a("targets", fs.b())
                                          .suggests(fs.a)
                                          .then(
                                             el.a("objective", fg.a())
                                                .then(
                                                   el.a("score", IntegerArgumentType.integer(0))
                                                      .executes(
                                                         $$0x -> c(
                                                            (ek)$$0x.getSource(),
                                                            fs.c($$0x, "targets"),
                                                            fg.b($$0x, "objective"),
                                                            IntegerArgumentType.getInteger($$0x, "score")
                                                         )
                                                      )
                                                )
                                          )
                                    )
                              ))
                           .then(
                              el.b("reset")
                                 .then(
                                    ((RequiredArgumentBuilder)el.a("targets", fs.b())
                                          .suggests(fs.a)
                                          .executes($$0x -> a((ek)$$0x.getSource(), fs.c($$0x, "targets"))))
                                       .then(
                                          el.a("objective", fg.a()).executes($$0x -> b((ek)$$0x.getSource(), fs.c($$0x, "targets"), fg.a($$0x, "objective")))
                                       )
                                 )
                           ))
                        .then(
                           el.b("enable")
                              .then(
                                 el.a("targets", fs.b())
                                    .suggests(fs.a)
                                    .then(
                                       el.a("objective", fg.a())
                                          .suggests(($$0x, $$1x) -> a((ek)$$0x.getSource(), fs.c($$0x, "targets"), $$1x))
                                          .executes($$0x -> a((ek)$$0x.getSource(), fs.c($$0x, "targets"), fg.a($$0x, "objective")))
                                    )
                              )
                        ))
                     .then(
                        ((LiteralArgumentBuilder)el.b("display")
                              .then(
                                 el.b("name")
                                    .then(
                                       el.a("targets", fs.b())
                                          .suggests(fs.a)
                                          .then(
                                             ((RequiredArgumentBuilder)el.a("objective", fg.a())
                                                   .then(
                                                      el.a("name", eu.a($$1))
                                                         .executes(
                                                            $$0x -> a((ek)$$0x.getSource(), fs.c($$0x, "targets"), fg.a($$0x, "objective"), eu.b($$0x, "name"))
                                                         )
                                                   ))
                                                .executes($$0x -> a((ek)$$0x.getSource(), fs.c($$0x, "targets"), fg.a($$0x, "objective"), null))
                                          )
                                    )
                              ))
                           .then(
                              el.b("numberformat")
                                 .then(
                                    el.a("targets", fs.b())
                                       .suggests(fs.a)
                                       .then(
                                          a(
                                             $$1,
                                             el.a("objective", fg.a()),
                                             ($$0x, $$1x) -> a((ek)$$0x.getSource(), fs.c($$0x, "targets"), fg.a($$0x, "objective"), $$1x)
                                          )
                                       )
                                 )
                           )
                     ))
                  .then(
                     el.b("operation")
                        .then(
                           el.a("targets", fs.b())
                              .suggests(fs.a)
                              .then(
                                 el.a("targetObjective", fg.a())
                                    .then(
                                       el.a("operation", fi.a())
                                          .then(
                                             el.a("source", fs.b())
                                                .suggests(fs.a)
                                                .then(
                                                   el.a("sourceObjective", fg.a())
                                                      .executes(
                                                         $$0x -> a(
                                                            (ek)$$0x.getSource(),
                                                            fs.c($$0x, "targets"),
                                                            fg.b($$0x, "targetObjective"),
                                                            fi.a($$0x, "operation"),
                                                            fs.c($$0x, "source"),
                                                            fg.a($$0x, "sourceObjective")
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

   private static ArgumentBuilder<ek, ?> a(eg $$0, ArgumentBuilder<ek, ?> $$1, apx.a $$2) {
      return $$1.then(el.b("blank").executes($$1x -> $$2.run($$1x, zc.a))).then(el.b("fixed").then(el.a("contents", eu.a($$0)).executes($$1x -> {
         xo $$2x = eu.b($$1x, "contents");
         return $$2.run($$1x, new zd($$2x));
      }))).then(el.b("styled").then(el.a("style", fy.a($$0)).executes($$1x -> {
         yl $$2x = fy.a($$1x, "style");
         return $$2.run($$1x, new zh($$2x));
      }))).executes($$1x -> $$2.run($$1x, null));
   }

   private static LiteralArgumentBuilder<ek> a() {
      LiteralArgumentBuilder<ek> $$0 = el.b("rendertype");

      for (fka.a $$1 : fka.a.values()) {
         $$0.then(el.b($$1.a()).executes($$1x -> a((ek)$$1x.getSource(), fg.a($$1x, "objective"), $$1)));
      }

      return $$0;
   }

   private static CompletableFuture<Suggestions> a(ek $$0, Collection<fjw> $$1, SuggestionsBuilder $$2) {
      List<String> $$3 = Lists.newArrayList();
      fjx $$4 = $$0.l().aJ();

      for (fjp $$5 : $$4.b()) {
         if ($$5.d() == fka.d) {
            boolean $$6 = false;

            for (fjw $$7 : $$1) {
               fjt $$8 = $$4.d($$7, $$5);
               if ($$8 == null || $$8.b()) {
                  $$6 = true;
                  break;
               }
            }

            if ($$6) {
               $$3.add($$5.c());
            }
         }
      }

      return eq.b($$3, $$2);
   }

   private static int a(ek $$0, fjw $$1, fjp $$2) throws CommandSyntaxException {
      fjx $$3 = $$0.l().aJ();
      fjt $$4 = $$3.d($$1, $$2);
      if ($$4 == null) {
         throw f.create($$2.c(), $$1.ht());
      } else {
         $$0.a(() -> xo.a("commands.scoreboard.players.get.success", $$1.ht(), $$4.a(), $$2.h()), false);
         return $$4.a();
      }
   }

   private static xo a(Collection<fjw> $$0) {
      return $$0.iterator().next().ht();
   }

   private static int a(ek $$0, Collection<fjw> $$1, fjp $$2, fi.a $$3, Collection<fjw> $$4, fjp $$5) throws CommandSyntaxException {
      fjx $$6 = $$0.l().aJ();
      int $$7 = 0;

      for (fjw $$8 : $$1) {
         fjv $$9 = $$6.c($$8, $$2);

         for (fjw $$10 : $$4) {
            fjv $$11 = $$6.c($$10, $$5);
            $$3.apply($$9, $$11);
         }

         $$7 += $$9.a();
      }

      if ($$1.size() == 1) {
         int $$12 = $$7;
         $$0.a(() -> xo.a("commands.scoreboard.players.operation.success.single", $$2.h(), a($$1), $$12), true);
      } else {
         $$0.a(() -> xo.a("commands.scoreboard.players.operation.success.multiple", $$2.h(), $$1.size()), true);
      }

      return $$7;
   }

   private static int a(ek $$0, Collection<fjw> $$1, fjp $$2) throws CommandSyntaxException {
      if ($$2.d() != fka.d) {
         throw e.create();
      } else {
         fjx $$3 = $$0.l().aJ();
         int $$4 = 0;

         for (fjw $$5 : $$1) {
            fjv $$6 = $$3.c($$5, $$2);
            if ($$6.d()) {
               $$6.e();
               $$4++;
            }
         }

         if ($$4 == 0) {
            throw d.create();
         } else {
            if ($$1.size() == 1) {
               $$0.a(() -> xo.a("commands.scoreboard.players.enable.success.single", $$2.h(), a($$1)), true);
            } else {
               $$0.a(() -> xo.a("commands.scoreboard.players.enable.success.multiple", $$2.h(), $$1.size()), true);
            }

            return $$4;
         }
      }
   }

   private static int a(ek $$0, Collection<fjw> $$1) {
      fjx $$2 = $$0.l().aJ();

      for (fjw $$3 : $$1) {
         $$2.b($$3);
      }

      if ($$1.size() == 1) {
         $$0.a(() -> xo.a("commands.scoreboard.players.reset.all.single", a($$1)), true);
      } else {
         $$0.a(() -> xo.a("commands.scoreboard.players.reset.all.multiple", $$1.size()), true);
      }

      return $$1.size();
   }

   private static int b(ek $$0, Collection<fjw> $$1, fjp $$2) {
      fjx $$3 = $$0.l().aJ();

      for (fjw $$4 : $$1) {
         $$3.e($$4, $$2);
      }

      if ($$1.size() == 1) {
         $$0.a(() -> xo.a("commands.scoreboard.players.reset.specific.single", $$2.h(), a($$1)), true);
      } else {
         $$0.a(() -> xo.a("commands.scoreboard.players.reset.specific.multiple", $$2.h(), $$1.size()), true);
      }

      return $$1.size();
   }

   private static int a(ek $$0, Collection<fjw> $$1, fjp $$2, int $$3) {
      fjx $$4 = $$0.l().aJ();

      for (fjw $$5 : $$1) {
         $$4.c($$5, $$2).a($$3);
      }

      if ($$1.size() == 1) {
         $$0.a(() -> xo.a("commands.scoreboard.players.set.success.single", $$2.h(), a($$1), $$3), true);
      } else {
         $$0.a(() -> xo.a("commands.scoreboard.players.set.success.multiple", $$2.h(), $$1.size(), $$3), true);
      }

      return $$3 * $$1.size();
   }

   private static int a(ek $$0, Collection<fjw> $$1, fjp $$2, @Nullable xo $$3) {
      fjx $$4 = $$0.l().aJ();

      for (fjw $$5 : $$1) {
         $$4.c($$5, $$2).a($$3);
      }

      if ($$3 == null) {
         if ($$1.size() == 1) {
            $$0.a(() -> xo.a("commands.scoreboard.players.display.name.clear.success.single", a($$1), $$2.h()), true);
         } else {
            $$0.a(() -> xo.a("commands.scoreboard.players.display.name.clear.success.multiple", $$1.size(), $$2.h()), true);
         }
      } else if ($$1.size() == 1) {
         $$0.a(() -> xo.a("commands.scoreboard.players.display.name.set.success.single", $$3, a($$1), $$2.h()), true);
      } else {
         $$0.a(() -> xo.a("commands.scoreboard.players.display.name.set.success.multiple", $$3, $$1.size(), $$2.h()), true);
      }

      return $$1.size();
   }

   private static int a(ek $$0, Collection<fjw> $$1, fjp $$2, @Nullable ze $$3) {
      fjx $$4 = $$0.l().aJ();

      for (fjw $$5 : $$1) {
         $$4.c($$5, $$2).a($$3);
      }

      if ($$3 == null) {
         if ($$1.size() == 1) {
            $$0.a(() -> xo.a("commands.scoreboard.players.display.numberFormat.clear.success.single", a($$1), $$2.h()), true);
         } else {
            $$0.a(() -> xo.a("commands.scoreboard.players.display.numberFormat.clear.success.multiple", $$1.size(), $$2.h()), true);
         }
      } else if ($$1.size() == 1) {
         $$0.a(() -> xo.a("commands.scoreboard.players.display.numberFormat.set.success.single", a($$1), $$2.h()), true);
      } else {
         $$0.a(() -> xo.a("commands.scoreboard.players.display.numberFormat.set.success.multiple", $$1.size(), $$2.h()), true);
      }

      return $$1.size();
   }

   private static int b(ek $$0, Collection<fjw> $$1, fjp $$2, int $$3) {
      fjx $$4 = $$0.l().aJ();
      int $$5 = 0;

      for (fjw $$6 : $$1) {
         fjv $$7 = $$4.c($$6, $$2);
         $$7.a($$7.a() + $$3);
         $$5 += $$7.a();
      }

      if ($$1.size() == 1) {
         int $$8 = $$5;
         $$0.a(() -> xo.a("commands.scoreboard.players.add.success.single", $$3, $$2.h(), a($$1), $$8), true);
      } else {
         $$0.a(() -> xo.a("commands.scoreboard.players.add.success.multiple", $$3, $$2.h(), $$1.size()), true);
      }

      return $$5;
   }

   private static int c(ek $$0, Collection<fjw> $$1, fjp $$2, int $$3) {
      fjx $$4 = $$0.l().aJ();
      int $$5 = 0;

      for (fjw $$6 : $$1) {
         fjv $$7 = $$4.c($$6, $$2);
         $$7.a($$7.a() - $$3);
         $$5 += $$7.a();
      }

      if ($$1.size() == 1) {
         int $$8 = $$5;
         $$0.a(() -> xo.a("commands.scoreboard.players.remove.success.single", $$3, $$2.h(), a($$1), $$8), true);
      } else {
         $$0.a(() -> xo.a("commands.scoreboard.players.remove.success.multiple", $$3, $$2.h(), $$1.size()), true);
      }

      return $$5;
   }

   private static int a(ek $$0) {
      Collection<fjw> $$1 = $$0.l().aJ().d();
      if ($$1.isEmpty()) {
         $$0.a(() -> xo.c("commands.scoreboard.players.list.empty"), false);
      } else {
         $$0.a(() -> xo.a("commands.scoreboard.players.list.success", $$1.size(), xr.b($$1, fjw::ht)), false);
      }

      return $$1.size();
   }

   private static int a(ek $$0, fjw $$1) {
      Object2IntMap<fjp> $$2 = $$0.l().aJ().c($$1);
      if ($$2.isEmpty()) {
         $$0.a(() -> xo.a("commands.scoreboard.players.list.entity.empty", $$1.ht()), false);
      } else {
         $$0.a(() -> xo.a("commands.scoreboard.players.list.entity.success", $$1.ht(), $$2.size()), false);
         Object2IntMaps.fastForEach(
            $$2, $$1x -> $$0.a(() -> xo.a("commands.scoreboard.players.list.entity.entry", ((fjp)$$1x.getKey()).h(), $$1x.getIntValue()), false)
         );
      }

      return $$2.size();
   }

   private static int a(ek $$0, fjo $$1) throws CommandSyntaxException {
      fjx $$2 = $$0.l().aJ();
      if ($$2.a($$1) == null) {
         throw b.create();
      } else {
         $$2.a($$1, null);
         $$0.a(() -> xo.a("commands.scoreboard.objectives.display.cleared", $$1.c()), true);
         return 0;
      }
   }

   private static int a(ek $$0, fjo $$1, fjp $$2) throws CommandSyntaxException {
      fjx $$3 = $$0.l().aJ();
      if ($$3.a($$1) == $$2) {
         throw c.create();
      } else {
         $$3.a($$1, $$2);
         $$0.a(() -> xo.a("commands.scoreboard.objectives.display.set", $$1.c(), $$2.e()), true);
         return 0;
      }
   }

   private static int a(ek $$0, fjp $$1, xo $$2) {
      if (!$$1.e().equals($$2)) {
         $$1.a($$2);
         $$0.a(() -> xo.a("commands.scoreboard.objectives.modify.displayname", $$1.c(), $$1.h()), true);
      }

      return 0;
   }

   private static int a(ek $$0, fjp $$1, boolean $$2) {
      if ($$1.f() != $$2) {
         $$1.a($$2);
         if ($$2) {
            $$0.a(() -> xo.a("commands.scoreboard.objectives.modify.displayAutoUpdate.enable", $$1.c(), $$1.h()), true);
         } else {
            $$0.a(() -> xo.a("commands.scoreboard.objectives.modify.displayAutoUpdate.disable", $$1.c(), $$1.h()), true);
         }
      }

      return 0;
   }

   private static int a(ek $$0, fjp $$1, @Nullable ze $$2) {
      $$1.b($$2);
      if ($$2 != null) {
         $$0.a(() -> xo.a("commands.scoreboard.objectives.modify.objectiveFormat.set", $$1.c()), true);
      } else {
         $$0.a(() -> xo.a("commands.scoreboard.objectives.modify.objectiveFormat.clear", $$1.c()), true);
      }

      return 0;
   }

   private static int a(ek $$0, fjp $$1, fka.a $$2) {
      if ($$1.i() != $$2) {
         $$1.a($$2);
         $$0.a(() -> xo.a("commands.scoreboard.objectives.modify.rendertype", $$1.h()), true);
      }

      return 0;
   }

   private static int a(ek $$0, fjp $$1) {
      fjx $$2 = $$0.l().aJ();
      $$2.j($$1);
      $$0.a(() -> xo.a("commands.scoreboard.objectives.remove.success", $$1.h()), true);
      return $$2.b().size();
   }

   private static int a(ek $$0, String $$1, fka $$2, xo $$3) throws CommandSyntaxException {
      fjx $$4 = $$0.l().aJ();
      if ($$4.a($$1) != null) {
         throw a.create();
      } else {
         $$4.a($$1, $$2, $$3, $$2.f(), false, null);
         fjp $$5 = $$4.a($$1);
         $$0.a(() -> xo.a("commands.scoreboard.objectives.add.success", $$5.h()), true);
         return $$4.b().size();
      }
   }

   private static int b(ek $$0) {
      Collection<fjp> $$1 = $$0.l().aJ().b();
      if ($$1.isEmpty()) {
         $$0.a(() -> xo.c("commands.scoreboard.objectives.list.empty"), false);
      } else {
         $$0.a(() -> xo.a("commands.scoreboard.objectives.list.success", $$1.size(), xr.b($$1, fjp::h)), false);
      }

      return $$1.size();
   }

   @FunctionalInterface
   public interface a {
      int run(CommandContext<ek> var1, @Nullable ze var2) throws CommandSyntaxException;
   }
}
