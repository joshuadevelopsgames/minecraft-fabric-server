import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;

public class aqq {
   public static void a(CommandDispatcher<ek> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)el.b("time").requires(el.a(2)))
                  .then(
                     ((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)el.b("set")
                                    .then(el.b("day").executes($$0x -> a((ek)$$0x.getSource(), 1000))))
                                 .then(el.b("noon").executes($$0x -> a((ek)$$0x.getSource(), 6000))))
                              .then(el.b("night").executes($$0x -> a((ek)$$0x.getSource(), 13000))))
                           .then(el.b("midnight").executes($$0x -> a((ek)$$0x.getSource(), 18000))))
                        .then(el.a("time", gc.a()).executes($$0x -> a((ek)$$0x.getSource(), IntegerArgumentType.getInteger($$0x, "time"))))
                  ))
               .then(el.b("add").then(el.a("time", gc.a()).executes($$0x -> b((ek)$$0x.getSource(), IntegerArgumentType.getInteger($$0x, "time"))))))
            .then(
               ((LiteralArgumentBuilder)((LiteralArgumentBuilder)el.b("query")
                        .then(el.b("daytime").executes($$0x -> c((ek)$$0x.getSource(), a(((ek)$$0x.getSource()).e())))))
                     .then(el.b("gametime").executes($$0x -> c((ek)$$0x.getSource(), (int)(((ek)$$0x.getSource()).e().ae() % 2147483647L)))))
                  .then(el.b("day").executes($$0x -> c((ek)$$0x.getSource(), (int)(((ek)$$0x.getSource()).e().af() / 24000L % 2147483647L))))
            )
      );
   }

   private static int a(aub $$0) {
      return (int)($$0.af() % 24000L);
   }

   private static int c(ek $$0, int $$1) {
      $$0.a(() -> xo.a("commands.time.query", $$1), false);
      return $$1;
   }

   public static int a(ek $$0, int $$1) {
      for (aub $$2 : $$0.l().L()) {
         $$2.b((long)$$1);
      }

      $$0.l().H();
      $$0.a(() -> xo.a("commands.time.set", $$1), true);
      return a($$0.e());
   }

   public static int b(ek $$0, int $$1) {
      for (aub $$2 : $$0.l().L()) {
         $$2.b($$2.af() + $$1);
      }

      $$0.l().H();
      int $$3 = a($$0.e());
      $$0.a(() -> xo.a("commands.time.set", $$3), true);
      return $$3;
   }
}
