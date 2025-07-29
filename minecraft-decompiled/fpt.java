import com.google.gson.annotations.SerializedName;
import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public record fpt(
   @Nullable @SerializedName("address") String a,
   @Nullable @SerializedName("resourcePackUrl") String b,
   @Nullable @SerializedName("resourcePackHash") String c,
   @Nullable @SerializedName("sessionRegionData") fpt.a d
) implements fqg {
   private static final Logger e = LogUtils.getLogger();
   private static final fpt f = new fpt(null, null, null, null);

   public static fpt a(fpk $$0, String $$1) {
      try {
         fpt $$2 = $$0.a($$1, fpt.class);
         if ($$2 == null) {
            e.error("Could not parse RealmsServerAddress: {}", $$1);
            return f;
         } else {
            return $$2;
         }
      } catch (Exception var3) {
         e.error("Could not parse RealmsServerAddress: {}", var3.getMessage());
         return f;
      }
   }

   public record a(@Nullable @SerializedName("regionName") fpw a, @Nullable @SerializedName("serviceQuality") fqn b) implements fqg {
   }
}
