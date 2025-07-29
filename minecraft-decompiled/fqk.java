import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fqk extends fqq implements fqg {
   public static final fqk a = new fqk(fqj.b, null);
   private static final Logger d = LogUtils.getLogger();
   @SerializedName("regionSelectionPreference")
   @JsonAdapter(fqj.a.class)
   public fqj b;
   @SerializedName("preferredRegion")
   @JsonAdapter(fpw.a.class)
   @Nullable
   public fpw c;

   public fqk(fqj $$0, @Nullable fpw $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   private fqk() {
   }

   public static fqk a(fpk $$0, String $$1) {
      try {
         fqk $$2 = $$0.a($$1, fqk.class);
         if ($$2 == null) {
            d.error("Could not parse RegionSelectionPreference: {}", $$1);
            return new fqk();
         } else {
            return $$2;
         }
      } catch (Exception var3) {
         d.error("Could not parse RegionSelectionPreference: {}", var3.getMessage());
         return new fqk();
      }
   }

   public fqk a() {
      return new fqk(this.b, this.c);
   }
}
