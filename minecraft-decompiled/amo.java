import com.google.gson.JsonElement;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.JsonOps;
import com.mojang.serialization.Lifecycle;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.stream.Stream;
import org.slf4j.Logger;

public class amo {
   private static final Logger a = LogUtils.getLogger();
   private static final jx b = new jx(Optional.empty(), Lifecycle.experimental());

   public static CompletableFuture<amo.b> a(js<amn> $$0, List<jy.a<?>> $$1, axo $$2, Executor $$3) {
      List<jn.b<?>> $$4 = baf.a($$0.b(amn.d), $$1);
      jn.a $$5 = jn.a.a($$4.stream());
      amc<JsonElement> $$6 = $$5.a(JsonOps.INSTANCE);
      List<CompletableFuture<kh<?>>> $$7 = fdl.a().map($$3x -> a($$3x, $$6, $$2, $$3)).toList();
      CompletableFuture<List<kh<?>>> $$8 = ag.d($$7);
      return $$8.thenApplyAsync($$2x -> a($$0, $$5, $$2x), $$3);
   }

   private static <T> CompletableFuture<kh<?>> a(fdl<T> $$0, amc<JsonElement> $$1, axo $$2, Executor $$3) {
      return CompletableFuture.supplyAsync(() -> {
         kh<T> $$3x = new jt<>($$0.b(), Lifecycle.experimental());
         Map<ame, T> $$4 = new HashMap<>();
         axs.a($$2, $$0.b(), $$1, $$0.c(), $$4);
         $$4.forEach(($$2xx, $$3xx) -> $$3x.a(amd.a($$0.b(), $$2xx), (T)$$3xx, b));
         baf.a($$2, $$3x);
         return $$3x;
      }, $$3);
   }

   private static amo.b a(js<amn> $$0, jn.a $$1, List<kh<?>> $$2) {
      js<amn> $$3 = a($$0, $$2);
      jn.a $$4 = a($$1, $$3.a(amn.d));
      a($$4);
      return new amo.b($$3, $$4);
   }

   private static jn.a a(jn.a $$0, jn.a $$1) {
      return jn.a.a(Stream.concat($$0.c(), $$1.c()));
   }

   private static void a(jn.a $$0) {
      bci.a $$1 = new bci.a();
      fdp $$2 = new fdp($$1, fgc.q, $$0);
      fdl.a().forEach($$2x -> a($$2, $$2x, $$0));
      $$1.a(($$0x, $$1x) -> a.warn("Found loot table element validation problem in {}: {}", $$0x, $$1x.a()));
   }

   private static js<amn> a(js<amn> $$0, List<kh<?>> $$1) {
      return $$0.a(amn.d, new jz.c($$1).e());
   }

   private static <T> void a(fdp $$0, fdl<T> $$1, jn.a $$2) {
      jn<T> $$3 = $$2.e($$1.b());
      $$3.c().forEach($$2x -> $$1.a($$0, $$2x.h(), (T)$$2x.a()));
   }

   public static class a {
      private final jn.a a;

      public a(jn.a $$0) {
         this.a = $$0;
      }

      public jn.a a() {
         return this.a;
      }

      public fdo a(amd<fdo> $$0) {
         return this.a.a(mn.bw).flatMap($$1 -> $$1.a($$0)).map(jl::a).orElse(fdo.f);
      }
   }

   public record b(js<amn> a, jn.a b) {
   }
}
