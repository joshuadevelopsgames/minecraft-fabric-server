import com.google.common.collect.Lists;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.mojang.logging.LogUtils;
import java.util.List;
import org.slf4j.Logger;

public class fpn extends fqq {
   private static final Logger b = LogUtils.getLogger();
   public List<fpm> a = Lists.newArrayList();

   public static fpn a(String $$0) {
      fpn $$1 = new fpn();

      try {
         JsonObject $$2 = bbw.a($$0).getAsJsonObject();
         if ($$2.get("invites").isJsonArray()) {
            for (JsonElement $$3 : $$2.get("invites").getAsJsonArray()) {
               $$1.a.add(fpm.a($$3.getAsJsonObject()));
            }
         }
      } catch (Exception var5) {
         b.error("Could not parse PendingInvitesList: {}", var5.getMessage());
      }

      return $$1;
   }
}
