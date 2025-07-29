import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.FloatArgumentType;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import com.mojang.brigadier.suggestion.SuggestionProvider;
import java.util.Optional;

public class api {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(xo.c("commands.place.feature.failed"));
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(xo.c("commands.place.jigsaw.failed"));
   private static final SimpleCommandExceptionType c = new SimpleCommandExceptionType(xo.c("commands.place.structure.failed"));
   private static final DynamicCommandExceptionType d = new DynamicCommandExceptionType($$0 -> xo.b("commands.place.template.invalid", $$0));
   private static final SimpleCommandExceptionType e = new SimpleCommandExceptionType(xo.c("commands.place.template.failed"));
   private static final SuggestionProvider<ek> f = ($$0, $$1) -> {
      ezb $$2 = ((ek)$$0.getSource()).e().s();
      return eq.a($$2.a(), $$1);
   };

   public static void a(CommandDispatcher<ek> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)el.b("place")
                        .requires(el.a(2)))
                     .then(
                        el.b("feature")
                           .then(
                              ((RequiredArgumentBuilder)el.a("feature", fm.a(mn.aP))
                                    .executes($$0x -> a((ek)$$0x.getSource(), fm.a($$0x, "feature"), jb.a((jv)((ek)$$0x.getSource()).d()))))
                                 .then(el.a("pos", gk.a()).executes($$0x -> a((ek)$$0x.getSource(), fm.a($$0x, "feature"), gk.a($$0x, "pos"))))
                           )
                     ))
                  .then(
                     el.b("jigsaw")
                        .then(
                           el.a("pool", fm.a(mn.bk))
                              .then(
                                 el.a("target", fn.a())
                                    .then(
                                       ((RequiredArgumentBuilder)el.a("max_depth", IntegerArgumentType.integer(1, 20))
                                             .executes(
                                                $$0x -> a(
                                                   (ek)$$0x.getSource(),
                                                   fm.c($$0x, "pool"),
                                                   fn.a($$0x, "target"),
                                                   IntegerArgumentType.getInteger($$0x, "max_depth"),
                                                   jb.a((jv)((ek)$$0x.getSource()).d())
                                                )
                                             ))
                                          .then(
                                             el.a("position", gk.a())
                                                .executes(
                                                   $$0x -> a(
                                                      (ek)$$0x.getSource(),
                                                      fm.c($$0x, "pool"),
                                                      fn.a($$0x, "target"),
                                                      IntegerArgumentType.getInteger($$0x, "max_depth"),
                                                      gk.a($$0x, "position")
                                                   )
                                                )
                                          )
                                    )
                              )
                        )
                  ))
               .then(
                  el.b("structure")
                     .then(
                        ((RequiredArgumentBuilder)el.a("structure", fm.a(mn.bj))
                              .executes($$0x -> b((ek)$$0x.getSource(), fm.b($$0x, "structure"), jb.a((jv)((ek)$$0x.getSource()).d()))))
                           .then(el.a("pos", gk.a()).executes($$0x -> b((ek)$$0x.getSource(), fm.b($$0x, "structure"), gk.a($$0x, "pos"))))
                     )
               ))
            .then(
               el.b("template")
                  .then(
                     ((RequiredArgumentBuilder)el.a("template", fn.a())
                           .suggests(f)
                           .executes(
                              $$0x -> a((ek)$$0x.getSource(), fn.a($$0x, "template"), jb.a((jv)((ek)$$0x.getSource()).d()), dwu.a, dvd.a, 1.0F, 0, false)
                           ))
                        .then(
                           ((RequiredArgumentBuilder)el.a("pos", gk.a())
                                 .executes($$0x -> a((ek)$$0x.getSource(), fn.a($$0x, "template"), gk.a($$0x, "pos"), dwu.a, dvd.a, 1.0F, 0, false)))
                              .then(
                                 ((RequiredArgumentBuilder)el.a("rotation", gb.a())
                                       .executes(
                                          $$0x -> a(
                                             (ek)$$0x.getSource(), fn.a($$0x, "template"), gk.a($$0x, "pos"), gb.a($$0x, "rotation"), dvd.a, 1.0F, 0, false
                                          )
                                       ))
                                    .then(
                                       ((RequiredArgumentBuilder)el.a("mirror", ga.a())
                                             .executes(
                                                $$0x -> a(
                                                   (ek)$$0x.getSource(),
                                                   fn.a($$0x, "template"),
                                                   gk.a($$0x, "pos"),
                                                   gb.a($$0x, "rotation"),
                                                   ga.a($$0x, "mirror"),
                                                   1.0F,
                                                   0,
                                                   false
                                                )
                                             ))
                                          .then(
                                             ((RequiredArgumentBuilder)el.a("integrity", FloatArgumentType.floatArg(0.0F, 1.0F))
                                                   .executes(
                                                      $$0x -> a(
                                                         (ek)$$0x.getSource(),
                                                         fn.a($$0x, "template"),
                                                         gk.a($$0x, "pos"),
                                                         gb.a($$0x, "rotation"),
                                                         ga.a($$0x, "mirror"),
                                                         FloatArgumentType.getFloat($$0x, "integrity"),
                                                         0,
                                                         false
                                                      )
                                                   ))
                                                .then(
                                                   ((RequiredArgumentBuilder)el.a("seed", IntegerArgumentType.integer())
                                                         .executes(
                                                            $$0x -> a(
                                                               (ek)$$0x.getSource(),
                                                               fn.a($$0x, "template"),
                                                               gk.a($$0x, "pos"),
                                                               gb.a($$0x, "rotation"),
                                                               ga.a($$0x, "mirror"),
                                                               FloatArgumentType.getFloat($$0x, "integrity"),
                                                               IntegerArgumentType.getInteger($$0x, "seed"),
                                                               false
                                                            )
                                                         ))
                                                      .then(
                                                         el.b("strict")
                                                            .executes(
                                                               $$0x -> a(
                                                                  (ek)$$0x.getSource(),
                                                                  fn.a($$0x, "template"),
                                                                  gk.a($$0x, "pos"),
                                                                  gb.a($$0x, "rotation"),
                                                                  ga.a($$0x, "mirror"),
                                                                  FloatArgumentType.getFloat($$0x, "integrity"),
                                                                  IntegerArgumentType.getInteger($$0x, "seed"),
                                                                  true
                                                               )
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

   public static int a(ek $$0, jl.c<ems<?, ?>> $$1, jb $$2) throws CommandSyntaxException {
      aub $$3 = $$0.e();
      ems<?, ?> $$4 = $$1.a();
      dlz $$5 = new dlz($$2);
      a($$3, new dlz($$5.h - 1, $$5.i - 1), new dlz($$5.h + 1, $$5.i + 1));
      if (!$$4.a($$3, $$3.n().g(), $$3.H_(), $$2)) {
         throw a.create();
      } else {
         String $$6 = $$1.h().a().toString();
         $$0.a(() -> xo.a("commands.place.feature.success", $$6, $$2.u(), $$2.v(), $$2.w()), true);
         return 1;
      }
   }

   public static int a(ek $$0, jl<ewi> $$1, ame $$2, int $$3, jb $$4) throws CommandSyntaxException {
      aub $$5 = $$0.e();
      dlz $$6 = new dlz($$4);
      a($$5, $$6, $$6);
      if (!ewc.a($$5, $$1, $$2, $$3, $$4, false)) {
         throw b.create();
      } else {
         $$0.a(() -> xo.a("commands.place.jigsaw.success", $$4.u(), $$4.v(), $$4.w()), true);
         return 1;
      }
   }

   public static int b(ek $$0, jl.c<euy> $$1, jb $$2) throws CommandSyntaxException {
      aub $$3 = $$0.e();
      euy $$4 = $$1.a();
      efz $$5 = $$3.n().g();
      evg $$6 = $$4.a($$1, $$3.aj(), $$0.u(), $$5, $$5.d(), $$3.n().i(), $$3.s(), $$3.F(), new dlz($$2), 0, $$3, $$0x -> true);
      if (!$$6.b()) {
         throw c.create();
      } else {
         euq $$7 = $$6.a();
         dlz $$8 = new dlz(ke.a($$7.h()), ke.a($$7.j()));
         dlz $$9 = new dlz(ke.a($$7.k()), ke.a($$7.m()));
         a($$3, $$8, $$9);
         dlz.a($$8, $$9).forEach($$3x -> $$6.a($$3, $$3.b(), $$5, $$3.H_(), new euq($$3x.d(), $$3.L_(), $$3x.e(), $$3x.f(), $$3.ao() + 1, $$3x.g()), $$3x));
         String $$10 = $$1.h().a().toString();
         $$0.a(() -> xo.a("commands.place.structure.success", $$10, $$2.u(), $$2.v(), $$2.w()), true);
         return 1;
      }
   }

   public static int a(ek $$0, ame $$1, jb $$2, dwu $$3, dvd $$4, float $$5, int $$6, boolean $$7) throws CommandSyntaxException {
      aub $$8 = $$0.e();
      ezb $$9 = $$8.s();

      Optional<eza> $$10;
      try {
         $$10 = $$9.b($$1);
      } catch (ab var14) {
         throw d.create($$1);
      }

      if ($$10.isEmpty()) {
         throw d.create($$1);
      } else {
         eza $$13 = $$10.get();
         a($$8, new dlz($$2), new dlz($$2.a($$13.a())));
         eyw $$14 = new eyw().a($$4).a($$3).b($$7);
         if ($$5 < 1.0F) {
            $$14.b().a(new eyd($$5)).a(ecs.b($$6));
         }

         boolean $$15 = $$13.a($$8, $$2, $$2, $$14, ecs.b($$6), 2 | ($$7 ? 816 : 0));
         if (!$$15) {
            throw e.create();
         } else {
            $$0.a(() -> xo.a("commands.place.template.success", xo.a($$1), $$2.u(), $$2.v(), $$2.w()), true);
            return 1;
         }
      }
   }

   private static void a(aub $$0, dlz $$1, dlz $$2) throws CommandSyntaxException {
      if (dlz.a($$1, $$2).filter($$1x -> !$$0.p($$1x.l())).findAny().isPresent()) {
         throw gk.a.create();
      }
   }
}
