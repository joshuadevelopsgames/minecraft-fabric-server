import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;

public class aog {
   public static void a(CommandDispatcher<ek> $$0) {
      $$0.register((LiteralArgumentBuilder)el.b("me").then(el.a("action", fd.a()).executes($$0x -> {
         fd.a($$0x, "action", $$1 -> {
            ek $$2 = (ek)$$0x.getSource();
            ayb $$3 = $$2.l().ag();
            $$3.a($$1, $$2, xk.a(xk.k, $$2));
         });
         return 1;
      })));
   }
}
