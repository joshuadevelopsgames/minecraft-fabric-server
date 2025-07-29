import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.Lists;
import com.mojang.brigadier.Command;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.RedirectModifier;
import com.mojang.brigadier.arguments.DoubleArgumentType;
import com.mojang.brigadier.builder.ArgumentBuilder;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.context.ContextChain;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import com.mojang.brigadier.tree.CommandNode;
import com.mojang.brigadier.tree.LiteralCommandNode;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.ints.IntList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.IntPredicate;
import java.util.function.Predicate;
import java.util.stream.Stream;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class aoi {
   private static final Logger b = LogUtils.getLogger();
   private static final int c = 32768;
   private static final Dynamic2CommandExceptionType d = new Dynamic2CommandExceptionType(($$0, $$1) -> xo.b("commands.execute.blocks.toobig", $$0, $$1));
   private static final SimpleCommandExceptionType e = new SimpleCommandExceptionType(xo.c("commands.execute.conditional.fail"));
   private static final DynamicCommandExceptionType f = new DynamicCommandExceptionType($$0 -> xo.b("commands.execute.conditional.fail_count", $$0));
   @VisibleForTesting
   public static final Dynamic2CommandExceptionType a = new Dynamic2CommandExceptionType(
      ($$0, $$1) -> xo.b("commands.execute.function.instantiationFailure", $$0, $$1)
   );

   public static void a(CommandDispatcher<ek> $$0, eg $$1) {
      LiteralCommandNode<ek> $$2 = $$0.register((LiteralArgumentBuilder)el.b("execute").requires(el.a(2)));
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)el.b(
                                                         "execute"
                                                      )
                                                      .requires(el.a(2)))
                                                   .then(el.b("run").redirect($$0.getRoot())))
                                                .then(a($$2, el.b("if"), true, $$1)))
                                             .then(a($$2, el.b("unless"), false, $$1)))
                                          .then(el.b("as").then(el.a("targets", ey.b()).fork($$2, $$0x -> {
                                             List<ek> $$1x = Lists.newArrayList();

                                             for (bzm $$2x : ey.c($$0x, "targets")) {
                                                $$1x.add(((ek)$$0x.getSource()).a($$2x));
                                             }

                                             return $$1x;
                                          }))))
                                       .then(el.b("at").then(el.a("targets", ey.b()).fork($$2, $$0x -> {
                                          List<ek> $$1x = Lists.newArrayList();

                                          for (bzm $$2x : ey.c($$0x, "targets")) {
                                             $$1x.add(((ek)$$0x.getSource()).a((aub)$$2x.ai()).a($$2x.dv()).a($$2x.bX()));
                                          }

                                          return $$1x;
                                       }))))
                                    .then(((LiteralArgumentBuilder)el.b("store").then(a($$2, el.b("result"), true))).then(a($$2, el.b("success"), false))))
                                 .then(
                                    ((LiteralArgumentBuilder)((LiteralArgumentBuilder)el.b("positioned")
                                             .then(el.a("pos", gr.a()).redirect($$2, $$0x -> ((ek)$$0x.getSource()).a(gr.a($$0x, "pos")).a(ex.a.a))))
                                          .then(el.b("as").then(el.a("targets", ey.b()).fork($$2, $$0x -> {
                                             List<ek> $$1x = Lists.newArrayList();

                                             for (bzm $$2x : ey.c($$0x, "targets")) {
                                                $$1x.add(((ek)$$0x.getSource()).a($$2x.dv()));
                                             }

                                             return $$1x;
                                          }))))
                                       .then(el.b("over").then(el.a("heightmap", fb.a()).redirect($$2, $$0x -> {
                                          fis $$1x = ((ek)$$0x.getSource()).d();
                                          aub $$2x = ((ek)$$0x.getSource()).e();
                                          double $$3 = $$1x.a();
                                          double $$4 = $$1x.c();
                                          if (!$$2x.b(ke.b($$3), ke.b($$4))) {
                                             throw gk.a.create();
                                          } else {
                                             int $$5 = $$2x.a(fb.a($$0x, "heightmap"), bcb.a($$3), bcb.a($$4));
                                             return ((ek)$$0x.getSource()).a(new fis($$3, $$5, $$4));
                                          }
                                       })))
                                 ))
                              .then(
                                 ((LiteralArgumentBuilder)el.b("rotated")
                                       .then(el.a("rot", go.a()).redirect($$2, $$0x -> ((ek)$$0x.getSource()).a(go.a($$0x, "rot").b((ek)$$0x.getSource())))))
                                    .then(el.b("as").then(el.a("targets", ey.b()).fork($$2, $$0x -> {
                                       List<ek> $$1x = Lists.newArrayList();

                                       for (bzm $$2x : ey.c($$0x, "targets")) {
                                          $$1x.add(((ek)$$0x.getSource()).a($$2x.bX()));
                                       }

                                       return $$1x;
                                    })))
                              ))
                           .then(
                              ((LiteralArgumentBuilder)el.b("facing")
                                    .then(el.b("entity").then(el.a("targets", ey.b()).then(el.a("anchor", ex.a()).fork($$2, $$0x -> {
                                       List<ek> $$1x = Lists.newArrayList();
                                       ex.a $$2x = ex.a($$0x, "anchor");

                                       for (bzm $$3 : ey.c($$0x, "targets")) {
                                          $$1x.add(((ek)$$0x.getSource()).a($$3, $$2x));
                                       }

                                       return $$1x;
                                    })))))
                                 .then(el.a("pos", gr.a()).redirect($$2, $$0x -> ((ek)$$0x.getSource()).b(gr.a($$0x, "pos"))))
                           ))
                        .then(
                           el.b("align")
                              .then(el.a("axes", gp.a()).redirect($$2, $$0x -> ((ek)$$0x.getSource()).a(((ek)$$0x.getSource()).d().a(gp.a($$0x, "axes")))))
                        ))
                     .then(el.b("anchored").then(el.a("anchor", ex.a()).redirect($$2, $$0x -> ((ek)$$0x.getSource()).a(ex.a($$0x, "anchor"))))))
                  .then(el.b("in").then(el.a("dimension", ew.a()).redirect($$2, $$0x -> ((ek)$$0x.getSource()).a(ew.a($$0x, "dimension"))))))
               .then(
                  el.b("summon")
                     .then(el.a("entity", fl.a($$1, mn.D)).suggests(ip.a(ip.c)).redirect($$2, $$0x -> a((ek)$$0x.getSource(), fl.e($$0x, "entity"))))
               ))
            .then(a($$2, el.b("on")))
      );
   }

   private static ArgumentBuilder<ek, ?> a(LiteralCommandNode<ek> $$0, LiteralArgumentBuilder<ek> $$1, boolean $$2) {
      $$1.then(
         el.b("score")
            .then(
               el.a("targets", fs.b())
                  .suggests(fs.a)
                  .then(el.a("objective", fg.a()).redirect($$0, $$1x -> a((ek)$$1x.getSource(), fs.c($$1x, "targets"), fg.a($$1x, "objective"), $$2)))
            )
      );
      $$1.then(
         el.b("bossbar")
            .then(
               ((RequiredArgumentBuilder)el.a("id", fn.a())
                     .suggests(anr.a)
                     .then(el.b("value").redirect($$0, $$1x -> a((ek)$$1x.getSource(), anr.a($$1x), true, $$2))))
                  .then(el.b("max").redirect($$0, $$1x -> a((ek)$$1x.getSource(), anr.a($$1x), false, $$2)))
            )
      );

      for (arc.c $$3 : arc.b) {
         $$3.a(
            $$1,
            $$3x -> $$3x.then(
               ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)el.a(
                                    "path", fe.a()
                                 )
                                 .then(
                                    el.b("int")
                                       .then(
                                          el.a("scale", DoubleArgumentType.doubleArg())
                                             .redirect(
                                                $$0,
                                                $$2xx -> a(
                                                   (ek)$$2xx.getSource(),
                                                   $$3.a($$2xx),
                                                   fe.a($$2xx, "path"),
                                                   $$1xxx -> un.a((int)($$1xxx * DoubleArgumentType.getDouble($$2xx, "scale"))),
                                                   $$2
                                                )
                                             )
                                       )
                                 ))
                              .then(
                                 el.b("float")
                                    .then(
                                       el.a("scale", DoubleArgumentType.doubleArg())
                                          .redirect(
                                             $$0,
                                             $$2xx -> a(
                                                (ek)$$2xx.getSource(),
                                                $$3.a($$2xx),
                                                fe.a($$2xx, "path"),
                                                $$1xxx -> ul.a((float)($$1xxx * DoubleArgumentType.getDouble($$2xx, "scale"))),
                                                $$2
                                             )
                                          )
                                    )
                              ))
                           .then(
                              el.b("short")
                                 .then(
                                    el.a("scale", DoubleArgumentType.doubleArg())
                                       .redirect(
                                          $$0,
                                          $$2xx -> a(
                                             (ek)$$2xx.getSource(),
                                             $$3.a($$2xx),
                                             fe.a($$2xx, "path"),
                                             $$1xxx -> vb.a((short)($$1xxx * DoubleArgumentType.getDouble($$2xx, "scale"))),
                                             $$2
                                          )
                                       )
                                 )
                           ))
                        .then(
                           el.b("long")
                              .then(
                                 el.a("scale", DoubleArgumentType.doubleArg())
                                    .redirect(
                                       $$0,
                                       $$2xx -> a(
                                          (ek)$$2xx.getSource(),
                                          $$3.a($$2xx),
                                          fe.a($$2xx, "path"),
                                          $$1xxx -> uq.a((long)($$1xxx * DoubleArgumentType.getDouble($$2xx, "scale"))),
                                          $$2
                                       )
                                    )
                              )
                        ))
                     .then(
                        el.b("double")
                           .then(
                              el.a("scale", DoubleArgumentType.doubleArg())
                                 .redirect(
                                    $$0,
                                    $$2xx -> a(
                                       (ek)$$2xx.getSource(),
                                       $$3.a($$2xx),
                                       fe.a($$2xx, "path"),
                                       $$1xxx -> uj.a($$1xxx * DoubleArgumentType.getDouble($$2xx, "scale")),
                                       $$2
                                    )
                                 )
                           )
                     ))
                  .then(
                     el.b("byte")
                        .then(
                           el.a("scale", DoubleArgumentType.doubleArg())
                              .redirect(
                                 $$0,
                                 $$2xx -> a(
                                    (ek)$$2xx.getSource(),
                                    $$3.a($$2xx),
                                    fe.a($$2xx, "path"),
                                    $$1xxx -> ug.a((byte)($$1xxx * DoubleArgumentType.getDouble($$2xx, "scale"))),
                                    $$2
                                 )
                              )
                        )
                  )
            )
         );
      }

      return $$1;
   }

   private static ek a(ek $$0, Collection<fjw> $$1, fjp $$2, boolean $$3) {
      fjx $$4 = $$0.l().aJ();
      return $$0.a(($$4x, $$5) -> {
         for (fjw $$6 : $$1) {
            fjv $$7 = $$4.c($$6, $$2);
            int $$8 = $$3 ? $$5 : ($$4x ? 1 : 0);
            $$7.a($$8);
         }
      }, eh::chain);
   }

   private static ek a(ek $$0, ang $$1, boolean $$2, boolean $$3) {
      return $$0.a(($$3x, $$4) -> {
         int $$5 = $$3 ? $$4 : ($$3x ? 1 : 0);
         if ($$2) {
            $$1.a($$5);
         } else {
            $$1.b($$5);
         }
      }, eh::chain);
   }

   private static ek a(ek $$0, arb $$1, fe.g $$2, IntFunction<vi> $$3, boolean $$4) {
      return $$0.a(($$4x, $$5) -> {
         try {
            ui $$6 = $$1.a();
            int $$7 = $$4 ? $$5 : ($$4x ? 1 : 0);
            $$2.a($$6, $$3.apply($$7));
            $$1.a($$6);
         } catch (CommandSyntaxException var8) {
         }
      }, eh::chain);
   }

   private static boolean a(aub $$0, jb $$1) {
      dlz $$2 = new dlz($$1);
      egi $$3 = $$0.n().a($$2.h, $$2.i);
      return $$3 == null ? false : $$3.G() == atp.d && $$0.c($$2.a());
   }

   private static ArgumentBuilder<ek, ?> a(CommandNode<ek> $$0, LiteralArgumentBuilder<ek> $$1, boolean $$2, eg $$3) {
      ((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)$$1.then(
                                    el.b("block")
                                       .then(
                                          el.a("pos", gk.a())
                                             .then(
                                                a(
                                                   $$0,
                                                   el.a("block", gg.a($$3)),
                                                   $$2,
                                                   $$0x -> gg.a($$0x, "block").test(new eef(((ek)$$0x.getSource()).e(), gk.a($$0x, "pos"), true))
                                                )
                                             )
                                       )
                                 ))
                                 .then(
                                    el.b("biome")
                                       .then(
                                          el.a("pos", gk.a())
                                             .then(
                                                a(
                                                   $$0,
                                                   el.a("biome", fp.a($$3, mn.aK)),
                                                   $$2,
                                                   $$0x -> fp.a($$0x, "biome", mn.aK).test(((ek)$$0x.getSource()).e().v(gk.a($$0x, "pos")))
                                                )
                                             )
                                       )
                                 ))
                              .then(el.b("loaded").then(a($$0, el.a("pos", gk.a()), $$2, $$0x -> a(((ek)$$0x.getSource()).e(), gk.b($$0x, "pos"))))))
                           .then(el.b("dimension").then(a($$0, el.a("dimension", ew.a()), $$2, $$0x -> ew.a($$0x, "dimension") == ((ek)$$0x.getSource()).e()))))
                        .then(
                           el.b("score")
                              .then(
                                 el.a("target", fs.a())
                                    .suggests(fs.a)
                                    .then(
                                       ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)el.a(
                                                            "targetObjective", fg.a()
                                                         )
                                                         .then(
                                                            el.b("=")
                                                               .then(
                                                                  el.a("source", fs.a())
                                                                     .suggests(fs.a)
                                                                     .then(
                                                                        a(
                                                                           $$0,
                                                                           el.a("sourceObjective", fg.a()),
                                                                           $$2,
                                                                           $$0x -> a($$0x, ($$0xx, $$1x) -> $$0xx == $$1x)
                                                                        )
                                                                     )
                                                               )
                                                         ))
                                                      .then(
                                                         el.b("<")
                                                            .then(
                                                               el.a("source", fs.a())
                                                                  .suggests(fs.a)
                                                                  .then(
                                                                     a(
                                                                        $$0,
                                                                        el.a("sourceObjective", fg.a()),
                                                                        $$2,
                                                                        $$0x -> a($$0x, ($$0xx, $$1x) -> $$0xx < $$1x)
                                                                     )
                                                                  )
                                                            )
                                                      ))
                                                   .then(
                                                      el.b("<=")
                                                         .then(
                                                            el.a("source", fs.a())
                                                               .suggests(fs.a)
                                                               .then(
                                                                  a($$0, el.a("sourceObjective", fg.a()), $$2, $$0x -> a($$0x, ($$0xx, $$1x) -> $$0xx <= $$1x))
                                                               )
                                                         )
                                                   ))
                                                .then(
                                                   el.b(">")
                                                      .then(
                                                         el.a("source", fs.a())
                                                            .suggests(fs.a)
                                                            .then(a($$0, el.a("sourceObjective", fg.a()), $$2, $$0x -> a($$0x, ($$0xx, $$1x) -> $$0xx > $$1x)))
                                                      )
                                                ))
                                             .then(
                                                el.b(">=")
                                                   .then(
                                                      el.a("source", fs.a())
                                                         .suggests(fs.a)
                                                         .then(a($$0, el.a("sourceObjective", fg.a()), $$2, $$0x -> a($$0x, ($$0xx, $$1x) -> $$0xx >= $$1x)))
                                                   )
                                             ))
                                          .then(el.b("matches").then(a($$0, el.a("range", fk.a()), $$2, $$0x -> a($$0x, fk.b.a($$0x, "range")))))
                                    )
                              )
                        ))
                     .then(
                        el.b("blocks")
                           .then(
                              el.a("start", gk.a())
                                 .then(
                                    el.a("end", gk.a())
                                       .then(
                                          ((RequiredArgumentBuilder)el.a("destination", gk.a()).then(a($$0, el.b("all"), $$2, false)))
                                             .then(a($$0, el.b("masked"), $$2, true))
                                       )
                                 )
                           )
                     ))
                  .then(
                     el.b("entity")
                        .then(
                           ((RequiredArgumentBuilder)el.a("entities", ey.b()).fork($$0, $$1x -> a($$1x, $$2, !ey.c($$1x, "entities").isEmpty())))
                              .executes(a($$2, (aoi.a)($$0x -> ey.c($$0x, "entities").size())))
                        )
                  ))
               .then(el.b("predicate").then(a($$0, el.a("predicate", fo.c($$3)), $$2, $$0x -> a((ek)$$0x.getSource(), fo.c($$0x, "predicate"))))))
            .then(el.b("function").then(el.a("name", gw.a()).suggests(aon.b).fork($$0, new aoi.c($$2)))))
         .then(
            ((LiteralArgumentBuilder)el.b("items")
                  .then(
                     el.b("entity")
                        .then(
                           el.a("entities", ey.b())
                              .then(
                                 el.a("slots", fw.a())
                                    .then(
                                       ((RequiredArgumentBuilder)el.a("item_predicate", ha.a($$3))
                                             .fork($$0, $$1x -> a($$1x, $$2, a(ey.b($$1x, "entities"), fw.a($$1x, "slots"), ha.a($$1x, "item_predicate")) > 0)))
                                          .executes(a($$2, (aoi.a)($$0x -> a(ey.b($$0x, "entities"), fw.a($$0x, "slots"), ha.a($$0x, "item_predicate")))))
                                    )
                              )
                        )
                  ))
               .then(
                  el.b("block")
                     .then(
                        el.a("pos", gk.a())
                           .then(
                              el.a("slots", fw.a())
                                 .then(
                                    ((RequiredArgumentBuilder)el.a("item_predicate", ha.a($$3))
                                          .fork(
                                             $$0,
                                             $$1x -> a(
                                                $$1x, $$2, a((ek)$$1x.getSource(), gk.a($$1x, "pos"), fw.a($$1x, "slots"), ha.a($$1x, "item_predicate")) > 0
                                             )
                                          ))
                                       .executes(
                                          a($$2, (aoi.a)($$0x -> a((ek)$$0x.getSource(), gk.a($$0x, "pos"), fw.a($$0x, "slots"), ha.a($$0x, "item_predicate"))))
                                       )
                                 )
                           )
                     )
               )
         );

      for (arc.c $$4 : arc.c) {
         $$1.then(
            $$4.a(
               el.b("data"),
               $$3x -> $$3x.then(
                  ((RequiredArgumentBuilder)el.a("path", fe.a()).fork($$0, $$2xx -> a($$2xx, $$2, a($$4.a($$2xx), fe.a($$2xx, "path")) > 0)))
                     .executes(a($$2, (aoi.a)($$1xx -> a($$4.a($$1xx), fe.a($$1xx, "path")))))
               )
            )
         );
      }

      return $$1;
   }

   private static int a(Iterable<? extends bzm> $$0, dal $$1, Predicate<dcv> $$2) {
      int $$3 = 0;

      for (bzm $$4 : $$0) {
         IntList $$5 = $$1.a();

         for (int $$6 = 0; $$6 < $$5.size(); $$6++) {
            int $$7 = $$5.getInt($$6);
            cbd $$8 = $$4.a_($$7);
            dcv $$9 = $$8.a();
            if ($$2.test($$9)) {
               $$3 += $$9.M();
            }
         }
      }

      return $$3;
   }

   private static int a(ek $$0, jb $$1, dal $$2, Predicate<dcv> $$3) throws CommandSyntaxException {
      int $$4 = 0;
      bxc $$5 = aot.a($$0, $$1, aot.b);
      int $$6 = $$5.b();
      IntList $$7 = $$2.a();

      for (int $$8 = 0; $$8 < $$7.size(); $$8++) {
         int $$9 = $$7.getInt($$8);
         if ($$9 >= 0 && $$9 < $$6) {
            dcv $$10 = $$5.a($$9);
            if ($$3.test($$10)) {
               $$4 += $$10.M();
            }
         }
      }

      return $$4;
   }

   private static Command<ek> a(boolean $$0, aoi.a $$1) {
      return $$0 ? $$1x -> {
         int $$2 = $$1.test($$1x);
         if ($$2 > 0) {
            ((ek)$$1x.getSource()).a(() -> xo.a("commands.execute.conditional.pass_count", $$2), false);
            return $$2;
         } else {
            throw e.create();
         }
      } : $$1x -> {
         int $$2 = $$1.test($$1x);
         if ($$2 == 0) {
            ((ek)$$1x.getSource()).a(() -> xo.c("commands.execute.conditional.pass"), false);
            return 1;
         } else {
            throw f.create($$2);
         }
      };
   }

   private static int a(arb $$0, fe.g $$1) throws CommandSyntaxException {
      return $$1.b($$0.a());
   }

   private static boolean a(CommandContext<ek> $$0, aoi.d $$1) throws CommandSyntaxException {
      fjw $$2 = fs.a($$0, "target");
      fjp $$3 = fg.a($$0, "targetObjective");
      fjw $$4 = fs.a($$0, "source");
      fjp $$5 = fg.a($$0, "sourceObjective");
      fjx $$6 = ((ek)$$0.getSource()).l().aJ();
      fjt $$7 = $$6.d($$2, $$3);
      fjt $$8 = $$6.d($$4, $$5);
      return $$7 != null && $$8 != null ? $$1.test($$7.a(), $$8.a()) : false;
   }

   private static boolean a(CommandContext<ek> $$0, cx.d $$1) throws CommandSyntaxException {
      fjw $$2 = fs.a($$0, "target");
      fjp $$3 = fg.a($$0, "targetObjective");
      fjx $$4 = ((ek)$$0.getSource()).l().aJ();
      fjt $$5 = $$4.d($$2, $$3);
      return $$5 == null ? false : $$1.d($$5.a());
   }

   private static boolean a(ek $$0, jl<fgs> $$1) {
      aub $$2 = $$0.e();
      fdm $$3 = new fdm.a($$2).a(fgd.f, $$0.d()).b(fgd.a, $$0.f()).a(fgc.d);
      fdj $$4 = new fdj.a($$3).a(Optional.empty());
      $$4.b(fdj.a($$1.a()));
      return $$1.a().test($$4);
   }

   private static Collection<ek> a(CommandContext<ek> $$0, boolean $$1, boolean $$2) {
      return (Collection<ek>)($$2 == $$1 ? Collections.singleton((ek)$$0.getSource()) : Collections.emptyList());
   }

   private static ArgumentBuilder<ek, ?> a(CommandNode<ek> $$0, ArgumentBuilder<ek, ?> $$1, boolean $$2, aoi.b $$3) {
      return $$1.fork($$0, $$2x -> a($$2x, $$2, $$3.test($$2x))).executes($$2x -> {
         if ($$2 == $$3.test($$2x)) {
            ((ek)$$2x.getSource()).a(() -> xo.c("commands.execute.conditional.pass"), false);
            return 1;
         } else {
            throw e.create();
         }
      });
   }

   private static ArgumentBuilder<ek, ?> a(CommandNode<ek> $$0, ArgumentBuilder<ek, ?> $$1, boolean $$2, boolean $$3) {
      return $$1.fork($$0, $$2x -> a($$2x, $$2, c($$2x, $$3).isPresent())).executes($$2 ? $$1x -> a($$1x, $$3) : $$1x -> b($$1x, $$3));
   }

   private static int a(CommandContext<ek> $$0, boolean $$1) throws CommandSyntaxException {
      OptionalInt $$2 = c($$0, $$1);
      if ($$2.isPresent()) {
         ((ek)$$0.getSource()).a(() -> xo.a("commands.execute.conditional.pass_count", $$2.getAsInt()), false);
         return $$2.getAsInt();
      } else {
         throw e.create();
      }
   }

   private static int b(CommandContext<ek> $$0, boolean $$1) throws CommandSyntaxException {
      OptionalInt $$2 = c($$0, $$1);
      if ($$2.isPresent()) {
         throw f.create($$2.getAsInt());
      } else {
         ((ek)$$0.getSource()).a(() -> xo.c("commands.execute.conditional.pass"), false);
         return 1;
      }
   }

   private static OptionalInt c(CommandContext<ek> $$0, boolean $$1) throws CommandSyntaxException {
      return a(((ek)$$0.getSource()).e(), gk.a($$0, "start"), gk.a($$0, "end"), gk.a($$0, "destination"), $$1);
   }

   private static OptionalInt a(aub $$0, jb $$1, jb $$2, jb $$3, boolean $$4) throws CommandSyntaxException {
      euq $$5 = euq.a($$1, $$2);
      euq $$6 = euq.a($$3, $$3.a($$5.c()));
      jb $$7 = new jb($$6.h() - $$5.h(), $$6.i() - $$5.i(), $$6.j() - $$5.j());
      int $$8 = $$5.d() * $$5.e() * $$5.f();
      if ($$8 > 32768) {
         throw d.create(32768, $$8);
      } else {
         int $$9 = 0;
         jz $$10 = $$0.K_();

         try (bci.j $$11 = new bci.j(b)) {
            for (int $$12 = $$5.j(); $$12 <= $$5.m(); $$12++) {
               for (int $$13 = $$5.i(); $$13 <= $$5.l(); $$13++) {
                  for (int $$14 = $$5.h(); $$14 <= $$5.k(); $$14++) {
                     jb $$15 = new jb($$14, $$13, $$12);
                     jb $$16 = $$15.a((kg)$$7);
                     eeb $$17 = $$0.a_($$15);
                     if (!$$4 || !$$17.a(dqb.a)) {
                        if ($$17 != $$0.a_($$16)) {
                           return OptionalInt.empty();
                        }

                        eaz $$18 = $$0.c_($$15);
                        eaz $$19 = $$0.c_($$16);
                        if ($$18 != null) {
                           if ($$19 == null) {
                              return OptionalInt.empty();
                           }

                           if ($$19.q() != $$18.q()) {
                              return OptionalInt.empty();
                           }

                           if (!$$18.s().equals($$19.s())) {
                              return OptionalInt.empty();
                           }

                           fcz $$20 = fcz.a($$11.a($$18.t()), $$10);
                           $$18.f($$20);
                           ui $$21 = $$20.b();
                           fcz $$22 = fcz.a($$11.a($$19.t()), $$10);
                           $$19.f($$22);
                           ui $$23 = $$22.b();
                           if (!$$21.equals($$23)) {
                              return OptionalInt.empty();
                           }
                        }

                        $$9++;
                     }
                  }
               }
            }
         }

         return OptionalInt.of($$9);
      }
   }

   private static RedirectModifier<ek> a(Function<bzm, Optional<bzm>> $$0) {
      return $$1 -> {
         ek $$2 = (ek)$$1.getSource();
         bzm $$3 = $$2.f();
         return (Collection)($$3 == null ? List.of() : $$0.apply($$3).filter($$0xx -> !$$0xx.dU()).map($$1x -> List.of($$2.a($$1x))).orElse(List.of()));
      };
   }

   private static RedirectModifier<ek> b(Function<bzm, Stream<bzm>> $$0) {
      return $$1 -> {
         ek $$2 = (ek)$$1.getSource();
         bzm $$3 = $$2.f();
         return $$3 == null ? List.of() : $$0.apply($$3).filter($$0xx -> !$$0xx.dU()).map($$2::a).toList();
      };
   }

   private static LiteralArgumentBuilder<ek> a(CommandNode<ek> $$0, LiteralArgumentBuilder<ek> $$1) {
      return (LiteralArgumentBuilder<ek>)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)$$1.then(
                              el.b("owner")
                                 .fork(
                                    $$0,
                                    a((Function<bzm, Optional<bzm>>)($$0x -> $$0x instanceof cat $$1x ? Optional.ofNullable($$1x.U_()) : Optional.empty()))
                                 )
                           ))
                           .then(
                              el.b("leasher")
                                 .fork(
                                    $$0,
                                    a((Function<bzm, Optional<bzm>>)($$0x -> $$0x instanceof cak $$1x ? Optional.ofNullable($$1x.aj_()) : Optional.empty()))
                                 )
                           ))
                        .then(
                           el.b("target")
                              .fork($$0, a((Function<bzm, Optional<bzm>>)($$0x -> $$0x instanceof cbj $$1x ? Optional.ofNullable($$1x.e()) : Optional.empty())))
                        ))
                     .then(
                        el.b("attacker")
                           .fork($$0, a((Function<bzm, Optional<bzm>>)($$0x -> $$0x instanceof bzf $$1x ? Optional.ofNullable($$1x.ak()) : Optional.empty())))
                     ))
                  .then(el.b("vehicle").fork($$0, a((Function<bzm, Optional<bzm>>)($$0x -> Optional.ofNullable($$0x.dm()))))))
               .then(el.b("controller").fork($$0, a((Function<bzm, Optional<bzm>>)($$0x -> Optional.ofNullable($$0x.cY()))))))
            .then(
               el.b("origin")
                  .fork($$0, a((Function<bzm, Optional<bzm>>)($$0x -> $$0x instanceof cbk $$1x ? Optional.ofNullable($$1x.ah_()) : Optional.empty())))
            ))
         .then(el.b("passengers").fork($$0, b((Function<bzm, Stream<bzm>>)($$0x -> $$0x.da().stream()))));
   }

   private static ek a(ek $$0, jl.c<bzv<?>> $$1) throws CommandSyntaxException {
      bzm $$2 = aqj.a($$0, $$1, $$0.d(), new ui(), true);
      return $$0.a($$2);
   }

   public static <T extends em<T>> void a(
      T $$0,
      List<T> $$1,
      Function<T, T> $$2,
      IntPredicate $$3,
      ContextChain<T> $$4,
      @Nullable ui $$5,
      hp<T> $$6,
      aos<CommandContext<T>, Collection<ib<T>>> $$7,
      hj $$8
   ) {
      List<T> $$9 = new ArrayList<>($$1.size());

      Collection<ib<T>> $$10;
      try {
         $$10 = $$7.apply($$4.getTopContext().copyFor($$0));
      } catch (CommandSyntaxException var18) {
         $$0.a(var18, $$8.a(), $$6.a());
         return;
      }

      int $$13 = $$10.size();
      if ($$13 != 0) {
         List<id<T>> $$14 = new ArrayList<>($$13);

         try {
            for (ib<T> $$15 : $$10) {
               try {
                  $$14.add($$15.a($$5, $$0.w()));
               } catch (en var17) {
                  throw a.create($$15.a(), var17.a());
               }
            }
         } catch (CommandSyntaxException var19) {
            $$0.a(var19, $$8.a(), $$6.a());
         }

         for (T $$18 : $$1) {
            T $$19 = (T)$$2.apply($$18.a_());
            eh $$20 = ($$3x, $$4x) -> {
               if ($$3.test($$4x)) {
                  $$9.add($$18);
               }
            };
            $$6.a(new hz<>($$2x -> {
               for (id<T> $$3x : $$14) {
                  $$2x.a(new hv<>($$3x, $$2x.b().d(), true).bind($$19));
               }

               $$2x.a(hy.a());
            }, $$20));
         }

         ContextChain<T> $$21 = $$4.nextStage();
         String $$22 = $$4.getTopContext().getInput();
         $$6.a(new hu.a<>($$22, $$21, $$8, $$0, $$9));
      }
   }

   @FunctionalInterface
   interface a {
      int test(CommandContext<ek> var1) throws CommandSyntaxException;
   }

   @FunctionalInterface
   interface b {
      boolean test(CommandContext<ek> var1) throws CommandSyntaxException;
   }

   static class c implements hm.a<ek> {
      private final IntPredicate a;

      c(boolean $$0) {
         this.a = $$0 ? $$0x -> $$0x != 0 : $$0x -> $$0x == 0;
      }

      public void a(ek $$0, List<ek> $$1, ContextChain<ek> $$2, hj $$3, hp<ek> $$4) {
         aoi.a($$0, $$1, aon::a, this.a, $$2, null, $$4, $$0x -> gw.a($$0x, "name"), $$3);
      }
   }

   @FunctionalInterface
   interface d {
      boolean test(int var1, int var2);
   }
}
