import com.google.common.hash.HashCode;
import com.google.common.hash.HashFunction;
import com.mojang.datafixers.util.Either;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.io.IOException;
import java.net.Proxy;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.Instant;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class avw implements AutoCloseable {
   private static final Logger a = LogUtils.getLogger();
   private static final int b = 20;
   private final Path c;
   private final bsc<avw.e> d;
   private final bvy e = new bvy(ag.j(), "download-queue");

   public avw(Path $$0) throws IOException {
      this.c = $$0;
      w.c($$0);
      this.d = bsc.a(avw.e.a, $$0.resolve("log.json"));
      avv.a($$0, 20);
   }

   private avw.b b(avw.a $$0, Map<UUID, avw.c> $$1) {
      avw.b $$2 = new avw.b();
      $$1.forEach(
         ($$2x, $$3) -> {
            Path $$4 = this.c.resolve($$2x.toString());
            Path $$5 = null;

            try {
               $$5 = bbs.a($$4, $$3.a, $$0.c, $$0.a, $$3.b, $$0.b, $$0.d, $$0.e);
               $$2.a.put($$2x, $$5);
            } catch (Exception var9) {
               a.error("Failed to download {}", $$3.a, var9);
               $$2.b.add($$2x);
            }

            try {
               this.d
                  .a(
                     new avw.e(
                        $$2x,
                        $$3.a.toString(),
                        Instant.now(),
                        Optional.ofNullable($$3.b).map(HashCode::toString),
                        $$5 != null ? this.a($$5) : Either.left("download_failed")
                     )
                  );
            } catch (Exception var8) {
               a.error("Failed to log download of {}", $$3.a, var8);
            }
         }
      );
      return $$2;
   }

   private Either<String, avw.d> a(Path $$0) {
      try {
         long $$1 = Files.size($$0);
         Path $$2 = this.c.relativize($$0);
         return Either.right(new avw.d($$2.toString(), $$1));
      } catch (IOException var5) {
         a.error("Failed to get file size of {}", $$0, var5);
         return Either.left("no_access");
      }
   }

   public CompletableFuture<avw.b> a(avw.a $$0, Map<UUID, avw.c> $$1) {
      return CompletableFuture.supplyAsync(() -> this.b($$0, $$1), this.e::a_);
   }

   @Override
   public void close() throws IOException {
      this.e.close();
      this.d.close();
   }

   public record a(HashFunction a, int b, Map<String, String> c, Proxy d, bbs.a e) {
   }

   public record b(Map<UUID, Path> a, Set<UUID> b) {

      public b() {
         this(new HashMap<>(), new HashSet<>());
      }
   }

   public record c(URL a, @Nullable HashCode b) {
   }

   record d(String b, long c) {
      public static final Codec<avw.d> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.STRING.fieldOf("name").forGetter(avw.d::a), Codec.LONG.fieldOf("size").forGetter(avw.d::b)).apply($$0, avw.d::new)
      );

      public String a() {
         return this.b;
      }

      public long b() {
         return this.c;
      }
   }

   record e(UUID b, String c, Instant d, Optional<String> e, Either<String, avw.d> f) {
      public static final Codec<avw.e> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
               kf.d.fieldOf("id").forGetter(avw.e::a),
               Codec.STRING.fieldOf("url").forGetter(avw.e::b),
               bbi.t.fieldOf("time").forGetter(avw.e::c),
               Codec.STRING.optionalFieldOf("hash").forGetter(avw.e::d),
               Codec.mapEither(Codec.STRING.fieldOf("error"), avw.d.a.fieldOf("file")).forGetter(avw.e::e)
            )
            .apply($$0, avw.e::new)
      );

      public UUID a() {
         return this.b;
      }

      public String b() {
         return this.c;
      }

      public Instant c() {
         return this.d;
      }

      public Optional<String> d() {
         return this.e;
      }

      public Either<String, avw.d> e() {
         return this.f;
      }
   }
}
