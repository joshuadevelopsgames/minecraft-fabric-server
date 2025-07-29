import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;

public class apv {
   public static void a(CommandDispatcher<ek> $$0) {
      $$0.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)el.b("say").requires(el.a(2))).then(el.a("message", fd.a()).executes($$0x -> {
         fd.a($$0x, "message", $$1 -> {
            ek $$2 = (ek)$$0x.getSource();
            ayb $$3 = $$2.l().ag();
            $$3.a($$1, $$2, xk.a(xk.f, $$2));
         });
         return 1;
      })));
   }
}
