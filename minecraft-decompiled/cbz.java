import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import net.minecraft.server.MinecraftServer;

public class cbz {
   public static cce<cuf> a() {
      return cfq.a(
         (Function<cfq.b<cuf>, ? extends App<cfq.c<cuf>, cft<cuf>>>)($$0 -> $$0.group($$0.b(cjo.d), $$0.a(cjo.c))
            .apply(
               $$0,
               ($$1, $$2) -> ($$3, $$4, $$5) -> {
                  jk $$6 = $$0.b($$1);
                  if (!$$6.b().a($$4.dv(), 2.0) && !$$4.gS()) {
                     return false;
                  } else {
                     $$1.b();
                     $$2.a($$6);
                     $$3.a($$4, (byte)14);
                     if (!$$4.gR().b().a(cui.b)) {
                        return true;
                     } else {
                        MinecraftServer $$7 = $$3.q();
                        Optional.ofNullable($$7.a($$6.a()))
                           .flatMap($$1xx -> $$1xx.B().c($$6.b()))
                           .flatMap($$0xxx -> mm.x.c().filter($$1xx -> ((cui)$$1xx.a()).b().test($$0xxx)).findFirst())
                           .ifPresent($$2xx -> {
                              $$4.a($$4.gR().b($$2xx));
                              $$4.g($$3);
                           });
                        return true;
                     }
                  }
               }
            ))
      );
   }
}
