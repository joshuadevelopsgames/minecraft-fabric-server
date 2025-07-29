import com.google.common.collect.Lists;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;
import java.util.List;
import org.apache.commons.lang3.Validate;

public class hvq implements JsonDeserializer<hvp> {
   private static final bwm a = bwk.a(1.0F);

   public hvp a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
      JsonObject $$3 = bbq.m($$0, "entry");
      boolean $$4 = bbq.a($$3, "replace", false);
      String $$5 = bbq.a($$3, "subtitle", null);
      List<hvo> $$6 = this.a($$3);
      return new hvp($$6, $$4, $$5);
   }

   private List<hvo> a(JsonObject $$0) {
      List<hvo> $$1 = Lists.newArrayList();
      if ($$0.has("sounds")) {
         JsonArray $$2 = bbq.v($$0, "sounds");

         for (int $$3 = 0; $$3 < $$2.size(); $$3++) {
            JsonElement $$4 = $$2.get($$3);
            if (bbq.a($$4)) {
               ame $$5 = ame.a(bbq.a($$4, "sound"));
               $$1.add(new hvo($$5, a, a, 1, hvo.a.a, false, false, 16));
            } else {
               $$1.add(this.b(bbq.m($$4, "sound")));
            }
         }
      }

      return $$1;
   }

   private hvo b(JsonObject $$0) {
      ame $$1 = ame.a(bbq.i($$0, "name"));
      hvo.a $$2 = this.a($$0, hvo.a.a);
      float $$3 = bbq.a($$0, "volume", 1.0F);
      Validate.isTrue($$3 > 0.0F, "Invalid volume", new Object[0]);
      float $$4 = bbq.a($$0, "pitch", 1.0F);
      Validate.isTrue($$4 > 0.0F, "Invalid pitch", new Object[0]);
      int $$5 = bbq.a($$0, "weight", 1);
      Validate.isTrue($$5 > 0, "Invalid weight", new Object[0]);
      boolean $$6 = bbq.a($$0, "preload", false);
      boolean $$7 = bbq.a($$0, "stream", false);
      int $$8 = bbq.a($$0, "attenuation_distance", 16);
      return new hvo($$1, bwk.a($$3), bwk.a($$4), $$5, $$2, $$7, $$6, $$8);
   }

   private hvo.a a(JsonObject $$0, hvo.a $$1) {
      hvo.a $$2 = $$1;
      if ($$0.has("type")) {
         $$2 = hvo.a.a(bbq.i($$0, "type"));
         Validate.notNull($$2, "Invalid type", new Object[0]);
      }

      return $$2;
   }
}
