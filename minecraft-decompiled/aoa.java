import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;

public class aoa {
   public static void a(CommandDispatcher<ek> $$0) {
      LiteralArgumentBuilder<ek> $$1 = (LiteralArgumentBuilder<ek>)el.b("debugmobspawning").requires(el.a(2));

      for (cap $$2 : cap.values()) {
         $$1.then(el.b($$2.a()).then(el.a("at", gk.a()).executes($$1x -> a((ek)$$1x.getSource(), $$2, gk.a($$1x, "at")))));
      }

      $$0.register($$1);
   }

   private static int a(ek $$0, cap $$1, jb $$2) {
      dnf.a($$1, $$0.e(), $$2);
      return 1;
   }
}
