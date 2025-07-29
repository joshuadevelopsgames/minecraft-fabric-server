import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.mojang.logging.LogUtils;
import java.io.IOException;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public enum fpw {
   a("AustraliaEast", "realms.configuration.region.australia_east"),
   b("AustraliaSoutheast", "realms.configuration.region.australia_southeast"),
   c("BrazilSouth", "realms.configuration.region.brazil_south"),
   d("CentralIndia", "realms.configuration.region.central_india"),
   e("CentralUs", "realms.configuration.region.central_us"),
   f("EastAsia", "realms.configuration.region.east_asia"),
   g("EastUs", "realms.configuration.region.east_us"),
   h("EastUs2", "realms.configuration.region.east_us_2"),
   i("FranceCentral", "realms.configuration.region.france_central"),
   j("JapanEast", "realms.configuration.region.japan_east"),
   k("JapanWest", "realms.configuration.region.japan_west"),
   l("KoreaCentral", "realms.configuration.region.korea_central"),
   m("NorthCentralUs", "realms.configuration.region.north_central_us"),
   n("NorthEurope", "realms.configuration.region.north_europe"),
   o("SouthCentralUs", "realms.configuration.region.south_central_us"),
   p("SoutheastAsia", "realms.configuration.region.southeast_asia"),
   q("SwedenCentral", "realms.configuration.region.sweden_central"),
   r("UAENorth", "realms.configuration.region.uae_north"),
   s("UKSouth", "realms.configuration.region.uk_south"),
   t("WestCentralUs", "realms.configuration.region.west_central_us"),
   u("WestEurope", "realms.configuration.region.west_europe"),
   v("WestUs", "realms.configuration.region.west_us"),
   w("WestUs2", "realms.configuration.region.west_us_2"),
   x("invalid", "");

   public final String y;
   public final String z;

   private fpw(final String $$0, final String $$1) {
      this.y = $$0;
      this.z = $$1;
   }

   @Nullable
   public static fpw a(String $$0) {
      for (fpw $$1 : values()) {
         if ($$1.y.equals($$0)) {
            return $$1;
         }
      }

      return null;
   }

   public static class a extends TypeAdapter<fpw> {
      private static final Logger a = LogUtils.getLogger();

      public void a(JsonWriter $$0, fpw $$1) throws IOException {
         $$0.value($$1.y);
      }

      public fpw a(JsonReader $$0) throws IOException {
         String $$1 = $$0.nextString();
         fpw $$2 = fpw.a($$1);
         if ($$2 == null) {
            a.warn("Unsupported RealmsRegion {}", $$1);
            return fpw.x;
         } else {
            return $$2;
         }
      }
   }
}
