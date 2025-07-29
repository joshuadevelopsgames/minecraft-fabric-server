import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.mojang.logging.LogUtils;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.time.ZonedDateTime;
import java.util.Date;
import java.util.UUID;
import org.slf4j.Logger;

public class u {
   private static final Logger b = LogUtils.getLogger();
   public static final ah a = b();

   private static ah b() {
      return new ah.a(UUID.randomUUID().toString().replaceAll("-", ""), "1.21.8", new fck(4440, "main"), ac.c(), 64, 81, new Date(), true);
   }

   private static ah a(JsonObject $$0) {
      JsonObject $$1 = bbq.u($$0, "pack_version");
      return new ah.a(
         bbq.i($$0, "id"),
         bbq.i($$0, "name"),
         new fck(bbq.o($$0, "world_version"), bbq.a($$0, "series_id", "main")),
         bbq.o($$0, "protocol_version"),
         bbq.o($$1, "resource"),
         bbq.o($$1, "data"),
         Date.from(ZonedDateTime.parse(bbq.i($$0, "build_time")).toInstant()),
         bbq.k($$0, "stable")
      );
   }

   public static ah a() {
      try {
         ah var2;
         try (InputStream $$0 = u.class.getResourceAsStream("/version.json")) {
            if ($$0 == null) {
               b.warn("Missing version information!");
               return a;
            }

            try (InputStreamReader $$1 = new InputStreamReader($$0)) {
               var2 = a(bbq.a($$1));
            }
         }

         return var2;
      } catch (JsonParseException | IOException var8) {
         throw new IllegalStateException("Game version information is corrupt", var8);
      }
   }
}
