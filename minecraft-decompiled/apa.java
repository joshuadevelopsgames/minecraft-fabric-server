import com.google.common.collect.Lists;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.ArgumentBuilder;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

public class apa {
   private static final DynamicCommandExceptionType a = new DynamicCommandExceptionType($$0 -> xo.b("commands.drop.no_held_items", $$0));
   private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> xo.b("commands.drop.no_loot_table.entity", $$0));
   private static final DynamicCommandExceptionType c = new DynamicCommandExceptionType($$0 -> xo.b("commands.drop.no_loot_table.block", $$0));

   public static void a(CommandDispatcher<ek> $$0, eg $$1) {
      $$0.register(
         a(
            (LiteralArgumentBuilder & ArgumentBuilder)el.b("loot").requires(el.a(2)),
            ($$1x, $$2) -> $$1x.then(
                  el.b("fish")
                     .then(
                        el.a("loot_table", fo.a($$1))
                           .then(
                              ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)el.a("pos", gk.a())
                                          .executes($$1xx -> a($$1xx, fo.a($$1xx, "loot_table"), gk.a($$1xx, "pos"), dcv.l, $$2)))
                                       .then(
                                          el.a("tool", gx.a($$1))
                                             .executes($$1xx -> a($$1xx, fo.a($$1xx, "loot_table"), gk.a($$1xx, "pos"), gx.a($$1xx, "tool").a(1, false), $$2))
                                       ))
                                    .then(
                                       el.b("mainhand")
                                          .executes($$1xx -> a($$1xx, fo.a($$1xx, "loot_table"), gk.a($$1xx, "pos"), a((ek)$$1xx.getSource(), bzw.a), $$2))
                                    ))
                                 .then(
                                    el.b("offhand")
                                       .executes($$1xx -> a($$1xx, fo.a($$1xx, "loot_table"), gk.a($$1xx, "pos"), a((ek)$$1xx.getSource(), bzw.b), $$2))
                                 )
                           )
                     )
               )
               .then(el.b("loot").then(el.a("loot_table", fo.a($$1)).executes($$1xx -> a($$1xx, fo.a($$1xx, "loot_table"), $$2))))
               .then(el.b("kill").then(el.a("target", ey.a()).executes($$1xx -> a($$1xx, ey.a($$1xx, "target"), $$2))))
               .then(
                  el.b("mine")
                     .then(
                        ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)el.a("pos", gk.a())
                                    .executes($$1xx -> a($$1xx, gk.a($$1xx, "pos"), dcv.l, $$2)))
                                 .then(el.a("tool", gx.a($$1)).executes($$1xx -> a($$1xx, gk.a($$1xx, "pos"), gx.a($$1xx, "tool").a(1, false), $$2))))
                              .then(el.b("mainhand").executes($$1xx -> a($$1xx, gk.a($$1xx, "pos"), a((ek)$$1xx.getSource(), bzw.a), $$2))))
                           .then(el.b("offhand").executes($$1xx -> a($$1xx, gk.a($$1xx, "pos"), a((ek)$$1xx.getSource(), bzw.b), $$2)))
                     )
               )
         )
      );
   }

   private static <T extends ArgumentBuilder<ek, T>> T a(T $$0, apa.c $$1) {
      return (T)$$0.then(
            ((LiteralArgumentBuilder)el.b("replace")
                  .then(
                     el.b("entity")
                        .then(
                           el.a("entities", ey.b())
                              .then(
                                 $$1.construct(el.a("slot", fv.a()), ($$0x, $$1x, $$2) -> a(ey.b($$0x, "entities"), fv.a($$0x, "slot"), $$1x.size(), $$1x, $$2))
                                    .then(
                                       $$1.construct(
                                          el.a("count", IntegerArgumentType.integer(0)),
                                          ($$0x, $$1x, $$2) -> a(
                                             ey.b($$0x, "entities"), fv.a($$0x, "slot"), IntegerArgumentType.getInteger($$0x, "count"), $$1x, $$2
                                          )
                                       )
                                    )
                              )
                        )
                  ))
               .then(
                  el.b("block")
                     .then(
                        el.a("targetPos", gk.a())
                           .then(
                              $$1.construct(
                                    el.a("slot", fv.a()),
                                    ($$0x, $$1x, $$2) -> a((ek)$$0x.getSource(), gk.a($$0x, "targetPos"), fv.a($$0x, "slot"), $$1x.size(), $$1x, $$2)
                                 )
                                 .then(
                                    $$1.construct(
                                       el.a("count", IntegerArgumentType.integer(0)),
                                       ($$0x, $$1x, $$2) -> a(
                                          (ek)$$0x.getSource(),
                                          gk.a($$0x, "targetPos"),
                                          IntegerArgumentType.getInteger($$0x, "slot"),
                                          IntegerArgumentType.getInteger($$0x, "count"),
                                          $$1x,
                                          $$2
                                       )
                                    )
                                 )
                           )
                     )
               )
         )
         .then(el.b("insert").then($$1.construct(el.a("targetPos", gk.a()), ($$0x, $$1x, $$2) -> a((ek)$$0x.getSource(), gk.a($$0x, "targetPos"), $$1x, $$2))))
         .then(el.b("give").then($$1.construct(el.a("players", ey.d()), ($$0x, $$1x, $$2) -> a(ey.f($$0x, "players"), $$1x, $$2))))
         .then(el.b("spawn").then($$1.construct(el.a("targetPos", gr.a()), ($$0x, $$1x, $$2) -> a((ek)$$0x.getSource(), gr.a($$0x, "targetPos"), $$1x, $$2))));
   }

   private static bxc a(ek $$0, jb $$1) throws CommandSyntaxException {
      eaz $$2 = $$0.e().c_($$1);
      if (!($$2 instanceof bxc)) {
         throw aot.a.create($$1.u(), $$1.v(), $$1.w());
      } else {
         return (bxc)$$2;
      }
   }

   private static int a(ek $$0, jb $$1, List<dcv> $$2, apa.a $$3) throws CommandSyntaxException {
      bxc $$4 = a($$0, $$1);
      List<dcv> $$5 = Lists.newArrayListWithCapacity($$2.size());

      for (dcv $$6 : $$2) {
         if (a($$4, $$6.v())) {
            $$4.e();
            $$5.add($$6);
         }
      }

      $$3.accept($$5);
      return $$5.size();
   }

   private static boolean a(bxc $$0, dcv $$1) {
      boolean $$2 = false;

      for (int $$3 = 0; $$3 < $$0.b() && !$$1.f(); $$3++) {
         dcv $$4 = $$0.a($$3);
         if ($$0.b($$3, $$1)) {
            if ($$4.f()) {
               $$0.a($$3, $$1);
               $$2 = true;
               break;
            }

            if (a($$4, $$1)) {
               int $$5 = $$1.k() - $$4.M();
               int $$6 = Math.min($$1.M(), $$5);
               $$1.h($$6);
               $$4.g($$6);
               $$2 = true;
            }
         }
      }

      return $$2;
   }

   private static int a(ek $$0, jb $$1, int $$2, int $$3, List<dcv> $$4, apa.a $$5) throws CommandSyntaxException {
      bxc $$6 = a($$0, $$1);
      int $$7 = $$6.b();
      if ($$2 >= 0 && $$2 < $$7) {
         List<dcv> $$8 = Lists.newArrayListWithCapacity($$4.size());

         for (int $$9 = 0; $$9 < $$3; $$9++) {
            int $$10 = $$2 + $$9;
            dcv $$11 = $$9 < $$4.size() ? $$4.get($$9) : dcv.l;
            if ($$6.b($$10, $$11)) {
               $$6.a($$10, $$11);
               $$8.add($$11);
            }
         }

         $$5.accept($$8);
         return $$8.size();
      } else {
         throw aot.c.create($$2);
      }
   }

   private static boolean a(dcv $$0, dcv $$1) {
      return $$0.M() <= $$0.k() && dcv.c($$0, $$1);
   }

   private static int a(Collection<auc> $$0, List<dcv> $$1, apa.a $$2) throws CommandSyntaxException {
      List<dcv> $$3 = Lists.newArrayListWithCapacity($$1.size());

      for (dcv $$4 : $$1) {
         for (auc $$5 : $$0) {
            if ($$5.gs().g($$4.v())) {
               $$3.add($$4);
            }
         }
      }

      $$2.accept($$3);
      return $$3.size();
   }

   private static void a(bzm $$0, List<dcv> $$1, int $$2, int $$3, List<dcv> $$4) {
      for (int $$5 = 0; $$5 < $$3; $$5++) {
         dcv $$6 = $$5 < $$1.size() ? $$1.get($$5) : dcv.l;
         cbd $$7 = $$0.a_($$2 + $$5);
         if ($$7 != cbd.a && $$7.a($$6.v())) {
            $$4.add($$6);
         }
      }
   }

   private static int a(Collection<? extends bzm> $$0, int $$1, int $$2, List<dcv> $$3, apa.a $$4) throws CommandSyntaxException {
      List<dcv> $$5 = Lists.newArrayListWithCapacity($$3.size());

      for (bzm $$6 : $$0) {
         if ($$6 instanceof auc $$7) {
            a($$6, $$3, $$1, $$2, $$5);
            $$7.cn.d();
         } else {
            a($$6, $$3, $$1, $$2, $$5);
         }
      }

      $$4.accept($$5);
      return $$5.size();
   }

   private static int a(ek $$0, fis $$1, List<dcv> $$2, apa.a $$3) throws CommandSyntaxException {
      aub $$4 = $$0.e();
      $$2.forEach($$2x -> {
         cqz $$3x = new cqz($$4, $$1.d, $$1.e, $$1.f, $$2x.v());
         $$3x.i();
         $$4.b($$3x);
      });
      $$3.accept($$2);
      return $$2.size();
   }

   private static void a(ek $$0, List<dcv> $$1) {
      if ($$1.size() == 1) {
         dcv $$2 = $$1.get(0);
         $$0.a(() -> xo.a("commands.drop.success.single", $$2.M(), $$2.K()), false);
      } else {
         $$0.a(() -> xo.a("commands.drop.success.multiple", $$1.size()), false);
      }
   }

   private static void a(ek $$0, List<dcv> $$1, amd<fdo> $$2) {
      if ($$1.size() == 1) {
         dcv $$3 = $$1.get(0);
         $$0.a(() -> xo.a("commands.drop.success.single_with_table", $$3.M(), $$3.K(), xo.a($$2.a())), false);
      } else {
         $$0.a(() -> xo.a("commands.drop.success.multiple_with_table", $$1.size(), xo.a($$2.a())), false);
      }
   }

   private static dcv a(ek $$0, bzw $$1) throws CommandSyntaxException {
      bzm $$2 = $$0.g();
      if ($$2 instanceof cam) {
         return ((cam)$$2).a($$1);
      } else {
         throw a.create($$2.Q_());
      }
   }

   private static int a(CommandContext<ek> $$0, jb $$1, dcv $$2, apa.b $$3) throws CommandSyntaxException {
      ek $$4 = (ek)$$0.getSource();
      aub $$5 = $$4.e();
      eeb $$6 = $$5.a_($$1);
      eaz $$7 = $$5.c_($$1);
      Optional<amd<fdo>> $$8 = $$6.b().u();
      if ($$8.isEmpty()) {
         throw c.create($$6.b().f());
      } else {
         fdm.a $$9 = new fdm.a($$5).a(fgd.f, fis.b($$1)).a(fgd.g, $$6).b(fgd.h, $$7).b(fgd.a, $$4.f()).a(fgd.i, $$2);
         List<dcv> $$10 = $$6.a($$9);
         return $$3.accept($$0, $$10, $$2x -> a($$4, $$2x, $$8.get()));
      }
   }

   private static int a(CommandContext<ek> $$0, bzm $$1, apa.b $$2) throws CommandSyntaxException {
      Optional<amd<fdo>> $$3 = $$1.ee();
      if ($$3.isEmpty()) {
         throw b.create($$1.Q_());
      } else {
         ek $$4 = (ek)$$0.getSource();
         fdm.a $$5 = new fdm.a($$4.e());
         bzm $$6 = $$4.f();
         if ($$6 instanceof cut $$7) {
            $$5.a(fgd.b, $$7);
         }

         $$5.a(fgd.c, $$1.ea().q());
         $$5.b(fgd.e, $$6);
         $$5.b(fgd.d, $$6);
         $$5.a(fgd.a, $$1);
         $$5.a(fgd.f, $$4.d());
         fdm $$8 = $$5.a(fgc.g);
         fdo $$9 = $$4.l().bc().a($$3.get());
         List<dcv> $$10 = $$9.a($$8);
         return $$2.accept($$0, $$10, $$2x -> a($$4, $$2x, $$3.get()));
      }
   }

   private static int a(CommandContext<ek> $$0, jl<fdo> $$1, apa.b $$2) throws CommandSyntaxException {
      ek $$3 = (ek)$$0.getSource();
      fdm $$4 = new fdm.a($$3.e()).b(fgd.a, $$3.f()).a(fgd.f, $$3.d()).a(fgc.c);
      return a($$0, $$1, $$4, $$2);
   }

   private static int a(CommandContext<ek> $$0, jl<fdo> $$1, jb $$2, dcv $$3, apa.b $$4) throws CommandSyntaxException {
      ek $$5 = (ek)$$0.getSource();
      fdm $$6 = new fdm.a($$5.e()).a(fgd.f, fis.b($$2)).a(fgd.i, $$3).b(fgd.a, $$5.f()).a(fgc.f);
      return a($$0, $$1, $$6, $$4);
   }

   private static int a(CommandContext<ek> $$0, jl<fdo> $$1, fdm $$2, apa.b $$3) throws CommandSyntaxException {
      ek $$4 = (ek)$$0.getSource();
      List<dcv> $$5 = $$1.a().a($$2);
      return $$3.accept($$0, $$5, $$1x -> a($$4, $$1x));
   }

   @FunctionalInterface
   interface a {
      void accept(List<dcv> var1) throws CommandSyntaxException;
   }

   @FunctionalInterface
   interface b {
      int accept(CommandContext<ek> var1, List<dcv> var2, apa.a var3) throws CommandSyntaxException;
   }

   @FunctionalInterface
   interface c {
      ArgumentBuilder<ek, ?> construct(ArgumentBuilder<ek, ?> var1, apa.b var2);
   }
}
