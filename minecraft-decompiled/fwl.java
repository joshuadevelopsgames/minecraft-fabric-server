import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

public class fwl implements fwn {
   private final ame a;

   public fwl(ame $$0) {
      this.a = $$0;
   }

   public JsonElement a() {
      JsonObject $$0 = new JsonObject();
      $$0.addProperty("parent", this.a.toString());
      return $$0;
   }
}
