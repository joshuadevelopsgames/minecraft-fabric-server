import com.google.common.base.Suppliers;
import com.mojang.authlib.minecraft.TelemetrySession;
import com.mojang.authlib.minecraft.UserApiService;
import java.nio.file.Path;
import java.time.Duration;
import java.time.Instant;
import java.util.Optional;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class hxb implements AutoCloseable {
   private static final AtomicInteger a = new AtomicInteger(1);
   private static final Executor b = Executors.newSingleThreadExecutor($$0 -> {
      Thread $$1 = new Thread($$0);
      $$1.setName("Telemetry-Sender-#" + a.getAndIncrement());
      return $$1;
   });
   private final fue c;
   private final UserApiService d;
   private final hxj e;
   private final Path f;
   private final CompletableFuture<Optional<hxh>> g;
   private final Supplier<hxf> h = Suppliers.memoize(this::c);

   public hxb(fue $$0, UserApiService $$1, fuq $$2) {
      this.c = $$0;
      this.d = $$1;
      hxj.a $$3 = hxj.a();
      $$2.f().ifPresent($$1x -> $$3.a(hxi.a, $$1x));
      $$2.e().ifPresent($$1x -> $$3.a(hxi.b, $$1x));
      $$3.a(hxi.c, UUID.randomUUID());
      $$3.a(hxi.d, ac.b().b());
      $$3.a(hxi.e, ag.n().a());
      $$3.a(hxi.f, System.getProperty("os.name"));
      $$3.a(hxi.g, fue.e().a());
      $$3.b(hxi.h, fue.bh());
      this.e = $$3.a();
      this.f = $$0.q.toPath().resolve("logs/telemetry");
      this.g = hxh.a(this.f);
   }

   public hxk a(boolean $$0, @Nullable Duration $$1, @Nullable String $$2) {
      return new hxk(this.c(), $$0, $$1, $$2);
   }

   public hxf a() {
      return this.h.get();
   }

   private hxf c() {
      if (!this.c.F()) {
         return hxf.a;
      } else {
         TelemetrySession $$0 = this.d.newTelemetrySession(b);
         if (!$$0.isEnabled()) {
            return hxf.a;
         } else {
            CompletableFuture<Optional<hxe>> $$1 = this.g
               .thenCompose($$0x -> $$0x.<CompletionStage<Optional<hxe>>>map(hxh::a).orElseGet(() -> CompletableFuture.completedFuture(Optional.empty())));
            return ($$2, $$3) -> {
               if (!$$2.d() || fue.R().D()) {
                  hxj.a $$4 = hxj.a();
                  $$4.a(this.e);
                  $$4.a(hxi.m, Instant.now());
                  $$4.a(hxi.l, $$2.d());
                  $$3.accept($$4);
                  hxc $$5 = new hxc($$2, $$4.a());
                  $$1.thenAccept($$2x -> {
                     if (!$$2x.isEmpty()) {
                        ((hxe)$$2x.get()).log($$5);
                        $$5.a($$0).send();
                     }
                  });
               }
            };
         }
      }
   }

   public Path b() {
      return this.f;
   }

   @Override
   public void close() {
      this.g.thenAccept($$0 -> $$0.ifPresent(hxh::close));
   }
}
