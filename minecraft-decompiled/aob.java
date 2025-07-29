import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;

public class aob {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(xo.b("Source is not a mob"));
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(xo.b("Path not found"));
   private static final SimpleCommandExceptionType c = new SimpleCommandExceptionType(xo.b("Target not reached"));

   public static void a(CommandDispatcher<ek> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)el.b("debugpath").requires(el.a(2)))
            .then(el.a("to", gk.a()).executes($$0x -> a((ek)$$0x.getSource(), gk.a($$0x, "to"))))
      );
   }

   private static int a(ek $$0, jb $$1) throws CommandSyntaxException {
      if (!($$0.f() instanceof cao $$3)) {
         throw a.create();
      } else {
         cjw $$4 = new cjv($$3, $$0.e());
         faz $$5 = $$4.a($$1, 0);
         ahj.a($$0.e(), $$3, $$5, $$4.q());
         if ($$5 == null) {
            throw b.create();
         } else if (!$$5.j()) {
            throw c.create();
         } else {
            $$0.a(() -> xo.b("Made path"), true);
            return 1;
         }
      }
   }
}
