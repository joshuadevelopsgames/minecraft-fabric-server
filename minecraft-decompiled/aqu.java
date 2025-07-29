import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import java.util.function.Consumer;

public class aqu {
   private static final xo a = xo.c("commands.version.header");
   private static final xo b = xo.c("commands.version.stable.yes");
   private static final xo c = xo.c("commands.version.stable.no");

   public static void a(CommandDispatcher<ek> $$0, boolean $$1) {
      $$0.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)el.b("version").requires(el.a($$1 ? 2 : 0))).executes($$0x -> {
         ek $$1x = (ek)$$0x.getSource();
         $$1x.a(a);
         a($$1x::a);
         return 1;
      }));
   }

   public static void a(Consumer<xo> $$0) {
      ah $$1 = ac.b();
      $$0.accept(xo.a("commands.version.id", $$1.b()));
      $$0.accept(xo.a("commands.version.name", $$1.c()));
      $$0.accept(xo.a("commands.version.data", $$1.a().b()));
      $$0.accept(xo.a("commands.version.series", $$1.a().c()));
      $$0.accept(xo.a("commands.version.protocol", $$1.d(), "0x" + Integer.toHexString($$1.d())));
      $$0.accept(xo.a("commands.version.build_time", xo.a($$1.e())));
      $$0.accept(xo.a("commands.version.pack.resource", $$1.a(awd.a)));
      $$0.accept(xo.a("commands.version.pack.data", $$1.a(awd.b)));
      $$0.accept($$1.f() ? b : c);
   }
}
