import com.google.gson.JsonObject;
import javax.annotation.Nullable;

public class fql extends fqq {
   @Nullable
   public String a;
   public long b;
   public long c;

   public static fql a(JsonObject $$0) {
      fql $$1 = new fql();

      try {
         $$1.a = fsq.b("profileUuid", $$0, null);
         $$1.b = fsq.a("joinTime", $$0, Long.MIN_VALUE);
         $$1.c = fsq.a("leaveTime", $$0, Long.MIN_VALUE);
      } catch (Exception var3) {
      }

      return $$1;
   }
}
