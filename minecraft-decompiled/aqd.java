import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;

public class aqd {
   public static void a(CommandDispatcher<ek> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)el.b("setworldspawn").requires(el.a(2)))
               .executes($$0x -> a((ek)$$0x.getSource(), jb.a((jv)((ek)$$0x.getSource()).d()), 0.0F)))
            .then(
               ((RequiredArgumentBuilder)el.a("pos", gk.a()).executes($$0x -> a((ek)$$0x.getSource(), gk.c($$0x, "pos"), 0.0F)))
                  .then(el.a("angle", er.a()).executes($$0x -> a((ek)$$0x.getSource(), gk.c($$0x, "pos"), er.a($$0x, "angle"))))
            )
      );
   }

   private static int a(ek $$0, jb $$1, float $$2) {
      aub $$3 = $$0.e();
      if ($$3.aj() != dmu.i) {
         $$0.b(xo.c("commands.setworldspawn.failure.not_overworld"));
         return 0;
      } else {
         $$3.a($$1, $$2);
         $$0.a(() -> xo.a("commands.setworldspawn.success", $$1.u(), $$1.v(), $$1.w(), $$2), true);
         return 1;
      }
   }
}
