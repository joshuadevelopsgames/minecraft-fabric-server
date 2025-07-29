import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import com.mojang.brigadier.tree.LiteralCommandNode;
import java.util.Collection;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.ToIntFunction;

public class aoj {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(xo.c("commands.experience.set.points.invalid"));

   public static void a(CommandDispatcher<ek> $$0) {
      LiteralCommandNode<ek> $$1 = $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)el.b("experience").requires(el.a(2)))
                  .then(
                     el.b("add")
                        .then(
                           el.a("target", ey.d())
                              .then(
                                 ((RequiredArgumentBuilder)((RequiredArgumentBuilder)el.a("amount", IntegerArgumentType.integer())
                                          .executes(
                                             $$0x -> a((ek)$$0x.getSource(), ey.f($$0x, "target"), IntegerArgumentType.getInteger($$0x, "amount"), aoj.a.a)
                                          ))
                                       .then(
                                          el.b("points")
                                             .executes(
                                                $$0x -> a((ek)$$0x.getSource(), ey.f($$0x, "target"), IntegerArgumentType.getInteger($$0x, "amount"), aoj.a.a)
                                             )
                                       ))
                                    .then(
                                       el.b("levels")
                                          .executes(
                                             $$0x -> a((ek)$$0x.getSource(), ey.f($$0x, "target"), IntegerArgumentType.getInteger($$0x, "amount"), aoj.a.b)
                                          )
                                    )
                              )
                        )
                  ))
               .then(
                  el.b("set")
                     .then(
                        el.a("target", ey.d())
                           .then(
                              ((RequiredArgumentBuilder)((RequiredArgumentBuilder)el.a("amount", IntegerArgumentType.integer(0))
                                       .executes($$0x -> b((ek)$$0x.getSource(), ey.f($$0x, "target"), IntegerArgumentType.getInteger($$0x, "amount"), aoj.a.a)))
                                    .then(
                                       el.b("points")
                                          .executes(
                                             $$0x -> b((ek)$$0x.getSource(), ey.f($$0x, "target"), IntegerArgumentType.getInteger($$0x, "amount"), aoj.a.a)
                                          )
                                    ))
                                 .then(
                                    el.b("levels")
                                       .executes($$0x -> b((ek)$$0x.getSource(), ey.f($$0x, "target"), IntegerArgumentType.getInteger($$0x, "amount"), aoj.a.b))
                                 )
                           )
                     )
               ))
            .then(
               el.b("query")
                  .then(
                     ((RequiredArgumentBuilder)el.a("target", ey.c())
                           .then(el.b("points").executes($$0x -> a((ek)$$0x.getSource(), ey.e($$0x, "target"), aoj.a.a))))
                        .then(el.b("levels").executes($$0x -> a((ek)$$0x.getSource(), ey.e($$0x, "target"), aoj.a.b)))
                  )
            )
      );
      $$0.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)el.b("xp").requires(el.a(2))).redirect($$1));
   }

   private static int a(ek $$0, auc $$1, aoj.a $$2) {
      int $$3 = $$2.f.applyAsInt($$1);
      $$0.a(() -> xo.a("commands.experience.query." + $$2.e, $$1.Q_(), $$3), false);
      return $$3;
   }

   private static int a(ek $$0, Collection<? extends auc> $$1, int $$2, aoj.a $$3) {
      for (auc $$4 : $$1) {
         $$3.c.accept($$4, $$2);
      }

      if ($$1.size() == 1) {
         $$0.a(() -> xo.a("commands.experience.add." + $$3.e + ".success.single", $$2, $$1.iterator().next().Q_()), true);
      } else {
         $$0.a(() -> xo.a("commands.experience.add." + $$3.e + ".success.multiple", $$2, $$1.size()), true);
      }

      return $$1.size();
   }

   private static int b(ek $$0, Collection<? extends auc> $$1, int $$2, aoj.a $$3) throws CommandSyntaxException {
      int $$4 = 0;

      for (auc $$5 : $$1) {
         if ($$3.d.test($$5, $$2)) {
            $$4++;
         }
      }

      if ($$4 == 0) {
         throw a.create();
      } else {
         if ($$1.size() == 1) {
            $$0.a(() -> xo.a("commands.experience.set." + $$3.e + ".success.single", $$2, $$1.iterator().next().Q_()), true);
         } else {
            $$0.a(() -> xo.a("commands.experience.set." + $$3.e + ".success.multiple", $$2, $$1.size()), true);
         }

         return $$1.size();
      }
   }

   static enum a {
      a("points", cut::d, ($$0, $$1) -> {
         if ($$1 >= $$0.gC()) {
            return false;
         } else {
            $$0.a($$1);
            return true;
         }
      }, $$0 -> bcb.d($$0.cD * $$0.gC())),
      b("levels", auc::c, ($$0, $$1) -> {
         $$0.b($$1);
         return true;
      }, $$0 -> $$0.cB);

      public final BiConsumer<auc, Integer> c;
      public final BiPredicate<auc, Integer> d;
      public final String e;
      final ToIntFunction<auc> f;

      private a(final String $$0, final BiConsumer<auc, Integer> $$1, final BiPredicate<auc, Integer> $$2, final ToIntFunction<auc> $$3) {
         this.c = $$1;
         this.e = $$0;
         this.d = $$2;
         this.f = $$3;
      }
   }
}
