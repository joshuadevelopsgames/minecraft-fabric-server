import java.util.function.Consumer;
import javax.annotation.Nullable;

public interface dnp {
   void a(bzv<?> var1, bck var2);

   static void a(dfd $$0, Consumer<xo> $$1, String $$2) {
      xo $$3 = a($$0, $$2);
      if ($$3 != null) {
         $$1.accept($$3);
      } else {
         $$1.accept(xn.a);
         $$1.accept(xo.c("block.minecraft.spawner.desc1").a(o.h));
         $$1.accept(xn.a().b(xo.c("block.minecraft.spawner.desc2").a(o.j)));
      }
   }

   @Nullable
   static xo a(dfd $$0, String $$1) {
      return $$0.e().m($$1).flatMap($$0x -> $$0x.m("entity")).flatMap($$0x -> $$0x.a("id", bzv.a)).map($$0x -> xo.c($$0x.g()).a(o.h)).orElse(null);
   }
}
