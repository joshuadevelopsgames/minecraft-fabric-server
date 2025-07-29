import com.mojang.datafixers.DataFixUtils;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;

public class pa {
   public static CompletableFuture<kb.g> a(CompletableFuture<jn.a> $$0, kb $$1) {
      return $$0.thenApply($$1x -> {
         jz.b $$2 = jz.a(mm.aJ);
         jd.a $$3 = new jd.a();
         alz.a.forEach($$1xx -> $$1xx.a($$3::a));
         kb.g $$4 = $$1.a($$2, $$1x, $$3);
         jn.a $$5 = $$4.a();
         Optional<? extends jn.b<dnx>> $$6 = $$5.a(mn.aK);
         Optional<? extends jn.b<euc>> $$7 = $$5.a(mn.bg);
         if ($$6.isPresent() || $$7.isPresent()) {
            pc.a((jm<euc>)DataFixUtils.orElseGet($$7, () -> $$1x.e(mn.bg)), (jn<dnx>)DataFixUtils.orElseGet($$6, () -> $$1x.e(mn.aK)));
         }

         return $$4;
      });
   }
}
