import com.google.common.collect.Lists;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.mojang.logging.LogUtils;
import java.util.Collections;
import java.util.List;
import org.slf4j.Logger;

public class fqt extends fqq {
   private static final Logger e = LogUtils.getLogger();
   public List<fqs> a;
   public int b;
   public int c;
   public int d;

   public fqt() {
   }

   public fqt(int $$0) {
      this.a = Collections.emptyList();
      this.b = 0;
      this.c = $$0;
      this.d = -1;
   }

   public boolean a() {
      return this.b * this.c >= this.d && this.b > 0 && this.d > 0 && this.c > 0;
   }

   public static fqt a(String $$0) {
      fqt $$1 = new fqt();
      $$1.a = Lists.newArrayList();

      try {
         JsonObject $$2 = bbw.a($$0).getAsJsonObject();
         if ($$2.get("templates").isJsonArray()) {
            for (JsonElement $$3 : $$2.get("templates").getAsJsonArray()) {
               $$1.a.add(fqs.a($$3.getAsJsonObject()));
            }
         }

         $$1.b = fsq.a("page", $$2, 0);
         $$1.c = fsq.a("size", $$2, 0);
         $$1.d = fsq.a("total", $$2, 0);
      } catch (Exception var5) {
         e.error("Could not parse WorldTemplatePaginatedList: {}", var5.getMessage());
      }

      return $$1;
   }
}
