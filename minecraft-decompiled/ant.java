import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import java.util.Collection;
import java.util.Collections;
import java.util.function.Predicate;

public class ant {
   private static final DynamicCommandExceptionType a = new DynamicCommandExceptionType($$0 -> xo.b("clear.failed.single", $$0));
   private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> xo.b("clear.failed.multiple", $$0));

   public static void a(CommandDispatcher<ek> $$0, eg $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)el.b("clear").requires(el.a(2)))
               .executes($$0x -> a((ek)$$0x.getSource(), Collections.singleton(((ek)$$0x.getSource()).h()), $$0xx -> true)))
            .then(
               ((RequiredArgumentBuilder)el.a("targets", ey.d()).executes($$0x -> a((ek)$$0x.getSource(), ey.f($$0x, "targets"), $$0xx -> true)))
                  .then(
                     ((RequiredArgumentBuilder)el.a("item", ha.a($$1)).executes($$0x -> a((ek)$$0x.getSource(), ey.f($$0x, "targets"), ha.a($$0x, "item"))))
                        .then(
                           el.a("maxCount", IntegerArgumentType.integer(0))
                              .executes(
                                 $$0x -> a((ek)$$0x.getSource(), ey.f($$0x, "targets"), ha.a($$0x, "item"), IntegerArgumentType.getInteger($$0x, "maxCount"))
                              )
                        )
                  )
            )
      );
   }

   private static int a(ek $$0, Collection<auc> $$1, Predicate<dcv> $$2) throws CommandSyntaxException {
      return a($$0, $$1, $$2, -1);
   }

   private static int a(ek $$0, Collection<auc> $$1, Predicate<dcv> $$2, int $$3) throws CommandSyntaxException {
      int $$4 = 0;

      for (auc $$5 : $$1) {
         $$4 += $$5.gs().a($$2, $$3, $$5.cm.r());
         $$5.cn.d();
         $$5.cm.a($$5.gs());
      }

      if ($$4 == 0) {
         if ($$1.size() == 1) {
            throw a.create($$1.iterator().next().aj());
         } else {
            throw b.create($$1.size());
         }
      } else {
         int $$6 = $$4;
         if ($$3 == 0) {
            if ($$1.size() == 1) {
               $$0.a(() -> xo.a("commands.clear.test.single", $$6, $$1.iterator().next().Q_()), true);
            } else {
               $$0.a(() -> xo.a("commands.clear.test.multiple", $$6, $$1.size()), true);
            }
         } else if ($$1.size() == 1) {
            $$0.a(() -> xo.a("commands.clear.success.single", $$6, $$1.iterator().next().Q_()), true);
         } else {
            $$0.a(() -> xo.a("commands.clear.success.multiple", $$6, $$1.size()), true);
         }

         return $$4;
      }
   }
}
