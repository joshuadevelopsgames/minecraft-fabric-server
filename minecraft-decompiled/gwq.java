import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.JsonOps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.Instant;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class gwq {
   private static final gwq a = new gwq("") {
      @Override
      public void a(fue $$0) {
      }

      @Override
      public void a(gwq.c $$0, String $$1, String $$2) {
      }
   };
   private static final Logger b = LogUtils.getLogger();
   private static final Gson c = new GsonBuilder().create();
   private final Path d;
   @Nullable
   private gwq.b e;

   gwq(String $$0) {
      this.d = fue.R().q.toPath().resolve($$0);
   }

   public static gwq a(@Nullable String $$0) {
      return $$0 == null ? a : new gwq($$0);
   }

   public void a(gwq.c $$0, String $$1, String $$2) {
      this.e = new gwq.b($$0, $$1, $$2);
   }

   public void a(fue $$0) {
      if ($$0.r != null && this.e != null) {
         ag.i().execute(() -> {
            try {
               Files.deleteIfExists(this.d);
            } catch (IOException var3) {
               b.error("Failed to delete quickplay log file {}", this.d, var3);
            }

            gwq.a $$2 = new gwq.a(this.e, Instant.now(), $$0.r.i());
            Codec.list(gwq.a.a).encodeStart(JsonOps.INSTANCE, List.of($$2)).resultOrPartial(ag.a("Quick Play: ", b::error)).ifPresent($$0xx -> {
               try {
                  Files.createDirectories(this.d.getParent());
                  Files.writeString(this.d, c.toJson($$0xx));
               } catch (IOException var3x) {
                  b.error("Failed to write to quickplay log file {}", this.d, var3x);
               }
            });
         });
      } else {
         b.error("Failed to log session for quickplay. Missing world data or gamemode");
      }
   }

   record a(gwq.b b, Instant c, dmr d) {
      public static final Codec<gwq.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(gwq.b.a.forGetter(gwq.a::a), bbi.t.fieldOf("lastPlayedTime").forGetter(gwq.a::b), dmr.f.fieldOf("gamemode").forGetter(gwq.a::c))
            .apply($$0, gwq.a::new)
      );

      public gwq.b a() {
         return this.b;
      }

      public Instant b() {
         return this.c;
      }

      public dmr c() {
         return this.d;
      }
   }

   record b(gwq.c b, String c, String d) {
      public static final MapCodec<gwq.b> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
               gwq.c.d.fieldOf("type").forGetter(gwq.b::a), bbi.v.fieldOf("id").forGetter(gwq.b::b), Codec.STRING.fieldOf("name").forGetter(gwq.b::c)
            )
            .apply($$0, gwq.b::new)
      );

      public gwq.c a() {
         return this.b;
      }

      public String b() {
         return this.c;
      }

      public String c() {
         return this.d;
      }
   }

   public static enum c implements bda {
      a("singleplayer"),
      b("multiplayer"),
      c("realms");

      static final Codec<gwq.c> d = bda.a(gwq.c::values);
      private final String e;

      private c(final String $$0) {
         this.e = $$0;
      }

      @Override
      public String c() {
         return this.e;
      }
   }
}
