import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.Collection;

public class aoq {
   public static final int a = 100;

   public static void a(CommandDispatcher<ek> $$0, eg $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)el.b("give").requires(el.a(2)))
            .then(
               el.a("targets", ey.d())
                  .then(
                     ((RequiredArgumentBuilder)el.a("item", gx.a($$1)).executes($$0x -> a((ek)$$0x.getSource(), gx.a($$0x, "item"), ey.f($$0x, "targets"), 1)))
                        .then(
                           el.a("count", IntegerArgumentType.integer(1))
                              .executes(
                                 $$0x -> a((ek)$$0x.getSource(), gx.a($$0x, "item"), ey.f($$0x, "targets"), IntegerArgumentType.getInteger($$0x, "count"))
                              )
                        )
                  )
            )
      );
   }

   private static int a(ek $$0, gy $$1, Collection<auc> $$2, int $$3) throws CommandSyntaxException {
      dcv $$4 = $$1.a(1, false);
      int $$5 = $$4.k();
      int $$6 = $$5 * 100;
      if ($$3 > $$6) {
         $$0.b(xo.a("commands.give.failed.toomanyitems", $$6, $$4.K()));
         return 0;
      } else {
         for (auc $$7 : $$2) {
            int $$8 = $$3;

            while ($$8 > 0) {
               int $$9 = Math.min($$5, $$8);
               $$8 -= $$9;
               dcv $$10 = $$1.a($$9, false);
               boolean $$11 = $$7.gs().g($$10);
               if ($$11 && $$10.f()) {
                  cqz $$13 = $$7.a($$4, false);
                  if ($$13 != null) {
                     $$13.t();
                  }

                  $$7.y().a(null, $$7.dC(), $$7.dE(), $$7.dI(), ayz.oF, aza.h, 0.2F, (($$7.ec().i() - $$7.ec().i()) * 0.7F + 1.0F) * 2.0F);
                  $$7.cn.d();
               } else {
                  cqz $$12 = $$7.a($$10, false);
                  if ($$12 != null) {
                     $$12.l();
                     $$12.b($$7.cK());
                  }
               }
            }
         }

         if ($$2.size() == 1) {
            $$0.a(() -> xo.a("commands.give.success.single", $$3, $$4.K(), $$2.iterator().next().Q_()), true);
         } else {
            $$0.a(() -> xo.a("commands.give.success.single", $$3, $$4.K(), $$2.size()), true);
         }

         return $$2.size();
      }
   }
}
