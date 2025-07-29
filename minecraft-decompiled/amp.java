import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import org.slf4j.Logger;

public class amp {
   private static final Logger a = LogUtils.getLogger();
   private static final CompletableFuture<bdk> b = CompletableFuture.completedFuture(bdk.a);
   private final amo.a c;
   private final el d;
   private final dht e;
   private final amr f;
   private final ams g;
   private final List<jy.a<?>> h;

   private amp(js<amn> $$0, jn.a $$1, cyd $$2, el.a $$3, List<jy.a<?>> $$4, int $$5) {
      this.c = new amo.a($$0.a());
      this.h = $$4;
      this.e = new dht($$1);
      this.d = new el($$3, eg.a($$1, $$2));
      this.f = new amr($$1);
      this.g = new ams($$5, this.d.a());
   }

   public ams a() {
      return this.g;
   }

   public amo.a b() {
      return this.c;
   }

   public dht c() {
      return this.e;
   }

   public el d() {
      return this.d;
   }

   public amr e() {
      return this.f;
   }

   public List<axi> f() {
      return List.of(this.e, this.g, this.f);
   }

   public static CompletableFuture<amp> a(axo $$0, js<amn> $$1, List<jy.a<?>> $$2, cyd $$3, el.a $$4, int $$5, Executor $$6, Executor $$7) {
      return amo.a($$1, $$2, $$0, $$6).thenCompose($$7x -> {
         amp $$8 = new amp($$7x.a(), $$7x.b(), $$3, $$4, $$2, $$5);
         return axu.a($$0, $$8.f(), $$6, $$7, b, a.isDebugEnabled()).a().thenApply($$1xx -> $$8);
      });
   }

   public void g() {
      this.h.forEach(jy.a::d);
   }
}
