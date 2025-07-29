import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Collection;
import java.util.Collections;

public class apn {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(xo.c("commands.recipe.give.failed"));
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(xo.c("commands.recipe.take.failed"));

   public static void a(CommandDispatcher<ek> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)el.b("recipe").requires(el.a(2)))
               .then(
                  el.b("give")
                     .then(
                        ((RequiredArgumentBuilder)el.a("targets", ey.d())
                              .then(
                                 el.a("recipe", fm.a(mn.bA))
                                    .executes($$0x -> a((ek)$$0x.getSource(), ey.f($$0x, "targets"), Collections.singleton(fm.d($$0x, "recipe"))))
                              ))
                           .then(el.b("*").executes($$0x -> a((ek)$$0x.getSource(), ey.f($$0x, "targets"), ((ek)$$0x.getSource()).l().aI().d())))
                     )
               ))
            .then(
               el.b("take")
                  .then(
                     ((RequiredArgumentBuilder)el.a("targets", ey.d())
                           .then(
                              el.a("recipe", fm.a(mn.bA))
                                 .executes($$0x -> b((ek)$$0x.getSource(), ey.f($$0x, "targets"), Collections.singleton(fm.d($$0x, "recipe"))))
                           ))
                        .then(el.b("*").executes($$0x -> b((ek)$$0x.getSource(), ey.f($$0x, "targets"), ((ek)$$0x.getSource()).l().aI().d())))
                  )
            )
      );
   }

   private static int a(ek $$0, Collection<auc> $$1, Collection<dhr<?>> $$2) throws CommandSyntaxException {
      int $$3 = 0;

      for (auc $$4 : $$1) {
         $$3 += $$4.a($$2);
      }

      if ($$3 == 0) {
         throw a.create();
      } else {
         if ($$1.size() == 1) {
            $$0.a(() -> xo.a("commands.recipe.give.success.single", $$2.size(), $$1.iterator().next().Q_()), true);
         } else {
            $$0.a(() -> xo.a("commands.recipe.give.success.multiple", $$2.size(), $$1.size()), true);
         }

         return $$3;
      }
   }

   private static int b(ek $$0, Collection<auc> $$1, Collection<dhr<?>> $$2) throws CommandSyntaxException {
      int $$3 = 0;

      for (auc $$4 : $$1) {
         $$3 += $$4.b($$2);
      }

      if ($$3 == 0) {
         throw b.create();
      } else {
         if ($$1.size() == 1) {
            $$0.a(() -> xo.a("commands.recipe.take.success.single", $$2.size(), $$1.iterator().next().Q_()), true);
         } else {
            $$0.a(() -> xo.a("commands.recipe.take.success.multiple", $$2.size(), $$1.size()), true);
         }

         return $$3;
      }
   }
}
