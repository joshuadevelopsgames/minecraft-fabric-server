import com.google.common.collect.Iterables;
import com.mojang.datafixers.DataFixer;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PushbackInputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Map.Entry;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fcm implements AutoCloseable {
   private static final Logger a = LogUtils.getLogger();
   private final fbx.a b;
   private final Map<fby<?>, Optional<fbx>> c = new HashMap<>();
   private final DataFixer d;
   private final jn.a e;
   private final Path f;
   private CompletableFuture<?> g = CompletableFuture.completedFuture(null);

   public fcm(fbx.a $$0, Path $$1, DataFixer $$2, jn.a $$3) {
      this.b = $$0;
      this.d = $$2;
      this.f = $$1;
      this.e = $$3;
   }

   private Path a(String $$0) {
      return this.f.resolve($$0 + ".dat");
   }

   public <T extends fbx> T a(fby<T> $$0) {
      T $$1 = this.b($$0);
      if ($$1 != null) {
         return $$1;
      } else {
         T $$2 = (T)$$0.b().apply(this.b);
         this.a($$0, $$2);
         return $$2;
      }
   }

   @Nullable
   public <T extends fbx> T b(fby<T> $$0) {
      Optional<fbx> $$1 = this.c.get($$0);
      if ($$1 == null) {
         $$1 = Optional.ofNullable(this.c($$0));
         this.c.put($$0, $$1);
      }

      return (T)$$1.orElse(null);
   }

   @Nullable
   private <T extends fbx> T c(fby<T> $$0) {
      try {
         Path $$1 = this.a($$0.a());
         if (Files.exists($$1)) {
            ui $$2 = this.a($$0.a(), $$0.d(), ac.b().a().b());
            amc<vi> $$3 = this.e.a(uw.a);
            return (T)$$0.c()
               .apply(this.b)
               .parse($$3, $$2.a("data"))
               .resultOrPartial($$1x -> a.error("Failed to parse saved data for '{}': {}", $$0, $$1x))
               .orElse(null);
         }
      } catch (Exception var5) {
         a.error("Error loading saved data: {}", $$0, var5);
      }

      return null;
   }

   public <T extends fbx> void a(fby<T> $$0, T $$1) {
      this.c.put($$0, Optional.of($$1));
      $$1.e();
   }

   public ui a(String $$0, bdr $$1, int $$2) throws IOException {
      ui var8;
      try (
         InputStream $$3 = Files.newInputStream(this.a($$0));
         PushbackInputStream $$4 = new PushbackInputStream(new bbj($$3), 2);
      ) {
         ui $$5;
         if (this.a($$4)) {
            $$5 = uv.a($$4, ur.a());
         } else {
            try (DataInputStream $$6 = new DataInputStream($$4)) {
               $$5 = uv.a($$6);
            }
         }

         int $$9 = ux.b($$5, 1343);
         var8 = $$1.a(this.d, $$5, $$9, $$2);
      }

      return var8;
   }

   private boolean a(PushbackInputStream $$0) throws IOException {
      byte[] $$1 = new byte[2];
      boolean $$2 = false;
      int $$3 = $$0.read($$1, 0, 2);
      if ($$3 == 2) {
         int $$4 = ($$1[1] & 255) << 8 | $$1[0] & 255;
         if ($$4 == 35615) {
            $$2 = true;
         }
      }

      if ($$3 != 0) {
         $$0.unread($$1, 0, $$3);
      }

      return $$2;
   }

   public CompletableFuture<?> a() {
      Map<fby<?>, ui> $$0 = this.c();
      if ($$0.isEmpty()) {
         return CompletableFuture.completedFuture(null);
      } else {
         int $$1 = ag.g();
         int $$2 = $$0.size();
         if ($$2 > $$1) {
            this.g = this.g.thenCompose($$3 -> {
               List<CompletableFuture<?>> $$4 = new ArrayList<>($$1);
               int $$5 = bcb.e($$2, $$1);

               for (List<Entry<fby<?>, ui>> $$6 : Iterables.partition($$0.entrySet(), $$5)) {
                  $$4.add(CompletableFuture.runAsync(() -> {
                     for (Entry<fby<?>, ui> $$1xx : $$6) {
                        this.a($$1xx.getKey(), $$1xx.getValue());
                     }
                  }, ag.i()));
               }

               return CompletableFuture.allOf($$4.toArray(CompletableFuture[]::new));
            });
         } else {
            this.g = this.g
               .thenCompose(
                  $$1x -> CompletableFuture.allOf(
                     $$0.entrySet()
                        .stream()
                        .map($$0xx -> CompletableFuture.runAsync(() -> this.a((fby<?>)$$0xx.getKey(), (ui)$$0xx.getValue()), ag.i()))
                        .toArray(CompletableFuture[]::new)
                  )
               );
         }

         return this.g;
      }
   }

   private Map<fby<?>, ui> c() {
      Map<fby<?>, ui> $$0 = new Object2ObjectArrayMap();
      amc<vi> $$1 = this.e.a(uw.a);
      this.c.forEach(($$2, $$3) -> $$3.filter(fbx::f).ifPresent($$3x -> {
         $$0.put($$2, this.a($$2, $$3x, $$1));
         $$3x.a(false);
      }));
      return $$0;
   }

   private <T extends fbx> ui a(fby<T> $$0, fbx $$1, amc<vi> $$2) {
      Codec<T> $$3 = $$0.c().apply(this.b);
      ui $$4 = new ui();
      $$4.a("data", (vi)$$3.encodeStart($$2, $$1).getOrThrow());
      ux.e($$4);
      return $$4;
   }

   private void a(fby<?> $$0, ui $$1) {
      Path $$2 = this.a($$0.a());

      try {
         uv.a($$1, $$2);
      } catch (IOException var5) {
         a.error("Could not save data to {}", $$2.getFileName(), var5);
      }
   }

   public void b() {
      this.a().join();
   }

   @Override
   public void close() {
      this.b();
   }
}
