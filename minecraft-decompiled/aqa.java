import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class aqa {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(xo.c("commands.setblock.failed"));

   public static void a(CommandDispatcher<ek> $$0, eg $$1) {
      Predicate<eef> $$2 = $$0x -> $$0x.c().w($$0x.d());
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)el.b("setblock").requires(el.a(2)))
            .then(
               el.a("pos", gk.a())
                  .then(
                     ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)el.a("block", gh.a($$1))
                                    .executes($$0x -> a((ek)$$0x.getSource(), gk.a($$0x, "pos"), gh.a($$0x, "block"), aqa.a.a, null, false)))
                                 .then(el.b("destroy").executes($$0x -> a((ek)$$0x.getSource(), gk.a($$0x, "pos"), gh.a($$0x, "block"), aqa.a.b, null, false))))
                              .then(el.b("keep").executes($$1x -> a((ek)$$1x.getSource(), gk.a($$1x, "pos"), gh.a($$1x, "block"), aqa.a.a, $$2, false))))
                           .then(el.b("replace").executes($$0x -> a((ek)$$0x.getSource(), gk.a($$0x, "pos"), gh.a($$0x, "block"), aqa.a.a, null, false))))
                        .then(el.b("strict").executes($$0x -> a((ek)$$0x.getSource(), gk.a($$0x, "pos"), gh.a($$0x, "block"), aqa.a.a, null, true)))
                  )
            )
      );
   }

   private static int a(ek $$0, jb $$1, gf $$2, aqa.a $$3, @Nullable Predicate<eef> $$4, boolean $$5) throws CommandSyntaxException {
      aub $$6 = $$0.e();
      if ($$6.ak()) {
         throw a.create();
      } else if ($$4 != null && !$$4.test(new eef($$6, $$1, true))) {
         throw a.create();
      } else {
         boolean $$7;
         if ($$3 == aqa.a.b) {
            $$6.b($$1, true);
            $$7 = !$$2.a().l() || !$$6.a_($$1).l();
         } else {
            $$7 = true;
         }

         eeb $$9 = $$6.a_($$1);
         if ($$7 && !$$2.a($$6, $$1, 2 | ($$5 ? 816 : 256))) {
            throw a.create();
         } else {
            if (!$$5) {
               $$6.a($$1, $$9);
            }

            $$0.a(() -> xo.a("commands.setblock.success", $$1.u(), $$1.v(), $$1.w()), true);
            return 1;
         }
      }
   }

   public static enum a {
      a,
      b;
   }
}
