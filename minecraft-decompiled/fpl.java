import com.google.common.collect.Sets;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.Set;

public class fpl extends fqq {
   public Set<String> a = Sets.newHashSet();

   public static fpl a(String $$0) {
      fpl $$1 = new fpl();

      try {
         JsonObject $$2 = bbw.a($$0).getAsJsonObject();
         JsonElement $$3 = $$2.get("ops");
         if ($$3.isJsonArray()) {
            for (JsonElement $$4 : $$3.getAsJsonArray()) {
               $$1.a.add($$4.getAsString());
            }
         }
      } catch (Exception var6) {
      }

      return $$1;
   }
}
