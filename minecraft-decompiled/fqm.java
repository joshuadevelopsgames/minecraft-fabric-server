import com.google.common.collect.Lists;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.List;

public class fqm extends fqq {
   public long a;
   public List<fql> b = Lists.newArrayList();

   public static fqm a(String $$0) {
      fqm $$1 = new fqm();

      try {
         JsonElement $$2 = bbw.a($$0);
         JsonObject $$3 = $$2.getAsJsonObject();
         $$1.a = fsq.a("periodInMillis", $$3, -1L);
         JsonElement $$4 = $$3.get("playerActivityDto");
         if ($$4 != null && $$4.isJsonArray()) {
            for (JsonElement $$6 : $$4.getAsJsonArray()) {
               fql $$7 = fql.a($$6.getAsJsonObject());
               $$1.b.add($$7);
            }
         }
      } catch (Exception var9) {
      }

      return $$1;
   }
}
