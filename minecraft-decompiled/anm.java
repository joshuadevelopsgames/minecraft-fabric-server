import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class anm {
   private static final DynamicCommandExceptionType a = new DynamicCommandExceptionType($$0 -> (xo)$$0);
   private static final Dynamic2CommandExceptionType b = new Dynamic2CommandExceptionType(
      ($$0, $$1) -> xo.b("commands.advancement.criterionNotFound", $$0, $$1)
   );

   public static void a(CommandDispatcher<ek> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)el.b("advancement").requires(el.a(2)))
               .then(
                  el.b("grant")
                     .then(
                        ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)el.a("targets", ey.d())
                                       .then(
                                          el.b("only")
                                             .then(
                                                ((RequiredArgumentBuilder)el.a("advancement", fm.a(mn.bz))
                                                      .executes(
                                                         $$0x -> a(
                                                            (ek)$$0x.getSource(), ey.f($$0x, "targets"), anm.a.a, a($$0x, fm.e($$0x, "advancement"), anm.b.a)
                                                         )
                                                      ))
                                                   .then(
                                                      el.a("criterion", StringArgumentType.greedyString())
                                                         .suggests(($$0x, $$1) -> eq.b(fm.e($$0x, "advancement").b().e().keySet(), $$1))
                                                         .executes(
                                                            $$0x -> a(
                                                               (ek)$$0x.getSource(),
                                                               ey.f($$0x, "targets"),
                                                               anm.a.a,
                                                               fm.e($$0x, "advancement"),
                                                               StringArgumentType.getString($$0x, "criterion")
                                                            )
                                                         )
                                                   )
                                             )
                                       ))
                                    .then(
                                       el.b("from")
                                          .then(
                                             el.a("advancement", fm.a(mn.bz))
                                                .executes(
                                                   $$0x -> a((ek)$$0x.getSource(), ey.f($$0x, "targets"), anm.a.a, a($$0x, fm.e($$0x, "advancement"), anm.b.c))
                                                )
                                          )
                                    ))
                                 .then(
                                    el.b("until")
                                       .then(
                                          el.a("advancement", fm.a(mn.bz))
                                             .executes(
                                                $$0x -> a((ek)$$0x.getSource(), ey.f($$0x, "targets"), anm.a.a, a($$0x, fm.e($$0x, "advancement"), anm.b.d))
                                             )
                                       )
                                 ))
                              .then(
                                 el.b("through")
                                    .then(
                                       el.a("advancement", fm.a(mn.bz))
                                          .executes(
                                             $$0x -> a((ek)$$0x.getSource(), ey.f($$0x, "targets"), anm.a.a, a($$0x, fm.e($$0x, "advancement"), anm.b.b))
                                          )
                                    )
                              ))
                           .then(
                              el.b("everything")
                                 .executes($$0x -> a((ek)$$0x.getSource(), ey.f($$0x, "targets"), anm.a.a, ((ek)$$0x.getSource()).l().aD().b(), false))
                           )
                     )
               ))
            .then(
               el.b("revoke")
                  .then(
                     ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)el.a("targets", ey.d())
                                    .then(
                                       el.b("only")
                                          .then(
                                             ((RequiredArgumentBuilder)el.a("advancement", fm.a(mn.bz))
                                                   .executes(
                                                      $$0x -> a(
                                                         (ek)$$0x.getSource(), ey.f($$0x, "targets"), anm.a.b, a($$0x, fm.e($$0x, "advancement"), anm.b.a)
                                                      )
                                                   ))
                                                .then(
                                                   el.a("criterion", StringArgumentType.greedyString())
                                                      .suggests(($$0x, $$1) -> eq.b(fm.e($$0x, "advancement").b().e().keySet(), $$1))
                                                      .executes(
                                                         $$0x -> a(
                                                            (ek)$$0x.getSource(),
                                                            ey.f($$0x, "targets"),
                                                            anm.a.b,
                                                            fm.e($$0x, "advancement"),
                                                            StringArgumentType.getString($$0x, "criterion")
                                                         )
                                                      )
                                                )
                                          )
                                    ))
                                 .then(
                                    el.b("from")
                                       .then(
                                          el.a("advancement", fm.a(mn.bz))
                                             .executes(
                                                $$0x -> a((ek)$$0x.getSource(), ey.f($$0x, "targets"), anm.a.b, a($$0x, fm.e($$0x, "advancement"), anm.b.c))
                                             )
                                       )
                                 ))
                              .then(
                                 el.b("until")
                                    .then(
                                       el.a("advancement", fm.a(mn.bz))
                                          .executes(
                                             $$0x -> a((ek)$$0x.getSource(), ey.f($$0x, "targets"), anm.a.b, a($$0x, fm.e($$0x, "advancement"), anm.b.d))
                                          )
                                    )
                              ))
                           .then(
                              el.b("through")
                                 .then(
                                    el.a("advancement", fm.a(mn.bz))
                                       .executes($$0x -> a((ek)$$0x.getSource(), ey.f($$0x, "targets"), anm.a.b, a($$0x, fm.e($$0x, "advancement"), anm.b.b)))
                                 )
                           ))
                        .then(el.b("everything").executes($$0x -> a((ek)$$0x.getSource(), ey.f($$0x, "targets"), anm.a.b, ((ek)$$0x.getSource()).l().aD().b())))
                  )
            )
      );
   }

   private static int a(ek $$0, Collection<auc> $$1, anm.a $$2, Collection<aj> $$3) throws CommandSyntaxException {
      return a($$0, $$1, $$2, $$3, true);
   }

   private static int a(ek $$0, Collection<auc> $$1, anm.a $$2, Collection<aj> $$3, boolean $$4) throws CommandSyntaxException {
      int $$5 = 0;

      for (auc $$6 : $$1) {
         $$5 += $$2.a($$6, $$3, $$4);
      }

      if ($$5 == 0) {
         if ($$3.size() == 1) {
            if ($$1.size() == 1) {
               throw a.create(xo.a($$2.a() + ".one.to.one.failure", ai.a($$3.iterator().next()), $$1.iterator().next().Q_()));
            } else {
               throw a.create(xo.a($$2.a() + ".one.to.many.failure", ai.a($$3.iterator().next()), $$1.size()));
            }
         } else if ($$1.size() == 1) {
            throw a.create(xo.a($$2.a() + ".many.to.one.failure", $$3.size(), $$1.iterator().next().Q_()));
         } else {
            throw a.create(xo.a($$2.a() + ".many.to.many.failure", $$3.size(), $$1.size()));
         }
      } else {
         if ($$3.size() == 1) {
            if ($$1.size() == 1) {
               $$0.a(() -> xo.a($$2.a() + ".one.to.one.success", ai.a($$3.iterator().next()), $$1.iterator().next().Q_()), true);
            } else {
               $$0.a(() -> xo.a($$2.a() + ".one.to.many.success", ai.a($$3.iterator().next()), $$1.size()), true);
            }
         } else if ($$1.size() == 1) {
            $$0.a(() -> xo.a($$2.a() + ".many.to.one.success", $$3.size(), $$1.iterator().next().Q_()), true);
         } else {
            $$0.a(() -> xo.a($$2.a() + ".many.to.many.success", $$3.size(), $$1.size()), true);
         }

         return $$5;
      }
   }

   private static int a(ek $$0, Collection<auc> $$1, anm.a $$2, aj $$3, String $$4) throws CommandSyntaxException {
      int $$5 = 0;
      ai $$6 = $$3.b();
      if (!$$6.e().containsKey($$4)) {
         throw b.create(ai.a($$3), $$4);
      } else {
         for (auc $$7 : $$1) {
            if ($$2.a($$7, $$3, $$4)) {
               $$5++;
            }
         }

         if ($$5 == 0) {
            if ($$1.size() == 1) {
               throw a.create(xo.a($$2.a() + ".criterion.to.one.failure", $$4, ai.a($$3), $$1.iterator().next().Q_()));
            } else {
               throw a.create(xo.a($$2.a() + ".criterion.to.many.failure", $$4, ai.a($$3), $$1.size()));
            }
         } else {
            if ($$1.size() == 1) {
               $$0.a(() -> xo.a($$2.a() + ".criterion.to.one.success", $$4, ai.a($$3), $$1.iterator().next().Q_()), true);
            } else {
               $$0.a(() -> xo.a($$2.a() + ".criterion.to.many.success", $$4, ai.a($$3), $$1.size()), true);
            }

            return $$5;
         }
      }
   }

   private static List<aj> a(CommandContext<ek> $$0, aj $$1, anm.b $$2) {
      ao $$3 = ((ek)$$0.getSource()).l().aD().a();
      ak $$4 = $$3.a($$1);
      if ($$4 == null) {
         return List.of($$1);
      } else {
         List<aj> $$5 = new ArrayList<>();
         if ($$2.f) {
            for (ak $$6 = $$4.c(); $$6 != null; $$6 = $$6.c()) {
               $$5.add($$6.b());
            }
         }

         $$5.add($$1);
         if ($$2.g) {
            a($$4, $$5);
         }

         return $$5;
      }
   }

   private static void a(ak $$0, List<aj> $$1) {
      for (ak $$2 : $$0.e()) {
         $$1.add($$2.b());
         a($$2, $$1);
      }
   }

   static enum a {
      a("grant") {
         @Override
         protected boolean a(auc $$0, aj $$1) {
            al $$2 = $$0.S().b($$1);
            if ($$2.a()) {
               return false;
            } else {
               for (String $$3 : $$2.e()) {
                  $$0.S().a($$1, $$3);
               }

               return true;
            }
         }

         @Override
         protected boolean a(auc $$0, aj $$1, String $$2) {
            return $$0.S().a($$1, $$2);
         }
      },
      b("revoke") {
         @Override
         protected boolean a(auc $$0, aj $$1) {
            al $$2 = $$0.S().b($$1);
            if (!$$2.b()) {
               return false;
            } else {
               for (String $$3 : $$2.f()) {
                  $$0.S().b($$1, $$3);
               }

               return true;
            }
         }

         @Override
         protected boolean a(auc $$0, aj $$1, String $$2) {
            return $$0.S().b($$1, $$2);
         }
      };

      private final String c;

      a(final String $$0) {
         this.c = "commands.advancement." + $$0;
      }

      public int a(auc $$0, Iterable<aj> $$1, boolean $$2) {
         int $$3 = 0;
         if (!$$2) {
            $$0.S().a($$0, true);
         }

         for (aj $$4 : $$1) {
            if (this.a($$0, $$4)) {
               $$3++;
            }
         }

         if (!$$2) {
            $$0.S().a($$0, false);
         }

         return $$3;
      }

      protected abstract boolean a(auc var1, aj var2);

      protected abstract boolean a(auc var1, aj var2, String var3);

      protected String a() {
         return this.c;
      }
   }

   static enum b {
      a(false, false),
      b(true, true),
      c(false, true),
      d(true, false),
      e(true, true);

      final boolean f;
      final boolean g;

      private b(final boolean $$0, final boolean $$1) {
         this.f = $$0;
         this.g = $$1;
      }
   }
}
