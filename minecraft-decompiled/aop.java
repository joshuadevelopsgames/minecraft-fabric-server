import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;

public class aop {
   public static void a(CommandDispatcher<ek> $$0, eg $$1) {
      final LiteralArgumentBuilder<ek> $$2 = (LiteralArgumentBuilder<ek>)el.b("gamerule").requires(el.a(2));
      new dmq($$1.a())
         .a(
            new dmq.c() {
               @Override
               public <T extends dmq.g<T>> void a(dmq.e<T> $$0, dmq.f<T> $$1x) {
                  LiteralArgumentBuilder<ek> $$2x = el.b($$0.a());
                  $$2.then(
                     ((LiteralArgumentBuilder)$$2x.executes($$1xx -> aop.a((ek)$$1xx.getSource(), $$0)))
                        .then($$1x.a("value").executes($$1xx -> aop.a($$1xx, $$0)))
                  );
               }
            }
         );
      $$0.register($$2);
   }

   static <T extends dmq.g<T>> int a(CommandContext<ek> $$0, dmq.e<T> $$1) {
      ek $$2 = (ek)$$0.getSource();
      T $$3 = $$2.l().aL().b($$1);
      $$3.b($$0, "value");
      $$2.a(() -> xo.a("commands.gamerule.set", $$1.a(), $$3.toString()), true);
      return $$3.c();
   }

   static <T extends dmq.g<T>> int a(ek $$0, dmq.e<T> $$1) {
      T $$2 = $$0.l().aL().b($$1);
      $$0.a(() -> xo.a("commands.gamerule.query", $$1.a(), $$2.toString()), false);
      return $$2.c();
   }
}
