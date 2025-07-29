import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.nio.file.Path;
import java.nio.file.Paths;

public class aou {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(xo.c("commands.jfr.start.failed"));
   private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> xo.b("commands.jfr.dump.failed", $$0));

   private aou() {
   }

   public static void a(CommandDispatcher<ek> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)el.b("jfr").requires(el.a(4)))
               .then(el.b("start").executes($$0x -> a((ek)$$0x.getSource()))))
            .then(el.b("stop").executes($$0x -> b((ek)$$0x.getSource())))
      );
   }

   private static int a(ek $$0) throws CommandSyntaxException {
      btz $$1 = btz.a($$0.l());
      if (!bub.f.a($$1)) {
         throw a.create();
      } else {
         $$0.a(() -> xo.c("commands.jfr.started"), false);
         return 1;
      }
   }

   private static int b(ek $$0) throws CommandSyntaxException {
      try {
         Path $$1 = Paths.get(".").relativize(bub.f.b().normalize());
         Path $$2 = $$0.l().r() && !ac.aZ ? $$1 : $$1.toAbsolutePath();
         xo $$3 = xo.b($$1.toString()).a(o.t).a($$1x -> $$1x.a(new xm.c($$2.toString())).a(new xu.e(xo.c("chat.copy.click"))));
         $$0.a(() -> xo.a("commands.jfr.stopped", $$3), false);
         return 1;
      } catch (Throwable var4) {
         throw b.create(var4.getMessage());
      }
   }
}
