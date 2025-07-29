import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.mojang.logging.LogUtils;
import java.io.IOException;
import org.slf4j.Logger;

public enum fqj {
   a(0, "realms.configuration.region_preference.automatic_player"),
   b(1, "realms.configuration.region_preference.automatic_owner"),
   c(2, "");

   public static final fqj d = a;
   public final int e;
   public final String f;

   private fqj(final int $$0, final String $$1) {
      this.e = $$0;
      this.f = $$1;
   }

   public static class a extends TypeAdapter<fqj> {
      private static final Logger a = LogUtils.getLogger();

      public void a(JsonWriter $$0, fqj $$1) throws IOException {
         $$0.value($$1.e);
      }

      public fqj a(JsonReader $$0) throws IOException {
         int $$1 = $$0.nextInt();

         for (fqj $$2 : fqj.values()) {
            if ($$2.e == $$1) {
               return $$2;
            }
         }

         a.warn("Unsupported RegionSelectionPreference {}", $$1);
         return fqj.d;
      }
   }
}
