import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Stream;

public class gsc {
   private static final gsc.a a = new gsc.a();
   private static final gsc.a b = new gsc.a();
   private static final gsc.a c = new gsc.a();
   private CompletableFuture<hwb<dcv>> d = CompletableFuture.completedFuture(hwb.empty());
   private CompletableFuture<hwb<dcv>> e = CompletableFuture.completedFuture(hwb.empty());
   private CompletableFuture<hwb<gjn>> f = CompletableFuture.completedFuture(hwb.empty());
   private final Map<gsc.a, Runnable> g = new IdentityHashMap<>();

   private void a(gsc.a $$0, Runnable $$1) {
      $$1.run();
      this.g.put($$0, $$1);
   }

   public void a() {
      for (Runnable $$0 : this.g.values()) {
         $$0.run();
      }
   }

   private static Stream<String> a(Stream<dcv> $$0, dcr.b $$1, dek $$2) {
      return $$0.<xo>flatMap($$2x -> $$2x.a($$1, null, $$2).stream()).map($$0x -> o.a($$0x.getString()).trim()).filter($$0x -> !$$0x.isEmpty());
   }

   public void a(ftp $$0, dmu $$1) {
      this.a(
         a,
         () -> {
            List<gjn> $$2 = $$0.d();
            jz $$3 = $$1.K_();
            jy<dcr> $$4 = $$3.f(mn.N);
            dcr.b $$5 = dcr.b.a($$3);
            bdp $$6 = diz.a($$1);
            dek $$7 = dek.a.a;
            CompletableFuture<?> $$8 = this.f;
            this.f = CompletableFuture.supplyAsync(
               () -> new hvw<>(
                  $$3xx -> a($$3xx.c().stream().flatMap($$1xxxx -> $$1xxxx.a($$6).stream()), $$5, $$7),
                  $$2xx -> $$2xx.c().stream().flatMap($$1xxxx -> $$1xxxx.a($$6).stream()).map($$1xxxx -> $$4.b($$1xxxx.h())),
                  $$2
               ),
               ag.h()
            );
            $$8.cancel(true);
         }
      );
   }

   public hwb<gjn> b() {
      return this.f.join();
   }

   public void a(List<dcv> $$0) {
      this.a(c, () -> {
         CompletableFuture<?> $$1 = this.e;
         this.e = CompletableFuture.supplyAsync(() -> new hvx<>($$0xxx -> $$0xxx.j().map(bae::b), $$0), ag.h());
         $$1.cancel(true);
      });
   }

   public hwb<dcv> c() {
      return this.e.join();
   }

   public void a(jn.a $$0, List<dcv> $$1) {
      this.a(
         b,
         () -> {
            dcr.b $$2 = dcr.b.a($$0);
            dek $$3 = dek.a.a.c();
            CompletableFuture<?> $$4 = this.d;
            this.d = CompletableFuture.supplyAsync(
               () -> new hvw<>($$2xx -> a(Stream.of($$2xx), $$2, $$3), $$0xxx -> $$0xxx.i().e().map(amd::a).stream(), $$1), ag.h()
            );
            $$4.cancel(true);
         }
      );
   }

   public hwb<dcv> d() {
      return this.d.join();
   }

   static class a {
   }
}
