import com.google.common.collect.Lists;
import com.google.gson.JsonElement;
import com.mojang.logging.LogUtils;
import java.util.List;
import org.slf4j.Logger;

public class fpi extends fqq {
   private static final Logger b = LogUtils.getLogger();
   public List<fph> a;

   public static fpi a(String $$0) {
      fpi $$1 = new fpi();
      $$1.a = Lists.newArrayList();

      try {
         JsonElement $$2 = bbw.a($$0).getAsJsonObject().get("backups");
         if ($$2.isJsonArray()) {
            for (JsonElement $$3 : $$2.getAsJsonArray()) {
               $$1.a.add(fph.a($$3));
            }
         }
      } catch (Exception var5) {
         b.error("Could not parse BackupList: {}", var5.getMessage());
      }

      return $$1;
   }
}
