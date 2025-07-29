import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;
import javax.annotation.Nullable;

public record gyx(@Nullable jh b, int c, String d, @Nullable gyx.b e, i f) {
   public static final int a = -1;

   public static float a(gyx.b $$0, i $$1, int $$2) {
      return $$0.a($$1.b($$2)) / 16.0F;
   }

   public static float b(gyx.b $$0, i $$1, int $$2) {
      return $$0.b($$1.b($$2)) / 16.0F;
   }

   @Nullable
   public jh a() {
      return this.b;
   }

   public int b() {
      return this.c;
   }

   public String c() {
      return this.d;
   }

   @Nullable
   public gyx.b d() {
      return this.e;
   }

   public i e() {
      return this.f;
   }

   protected static class a implements JsonDeserializer<gyx> {
      private static final int a = -1;
      private static final int b = 0;

      public gyx a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         JsonObject $$3 = $$0.getAsJsonObject();
         jh $$4 = c($$3);
         int $$5 = a($$3);
         String $$6 = b($$3);
         gyx.b $$7 = e($$3);
         i $$8 = d($$3);
         return new gyx($$4, $$5, $$6, $$7, $$8);
      }

      private static int a(JsonObject $$0) {
         return bbq.a($$0, "tintindex", -1);
      }

      private static String b(JsonObject $$0) {
         return bbq.i($$0, "texture");
      }

      @Nullable
      private static jh c(JsonObject $$0) {
         String $$1 = bbq.a($$0, "cullface", "");
         return jh.a($$1);
      }

      private static i d(JsonObject $$0) {
         int $$1 = bbq.a($$0, "rotation", 0);
         return i.a($$1);
      }

      @Nullable
      private static gyx.b e(JsonObject $$0) {
         if (!$$0.has("uv")) {
            return null;
         } else {
            JsonArray $$1 = bbq.v($$0, "uv");
            if ($$1.size() != 4) {
               throw new JsonParseException("Expected 4 uv values, found: " + $$1.size());
            } else {
               float $$2 = bbq.e($$1.get(0), "minU");
               float $$3 = bbq.e($$1.get(1), "minV");
               float $$4 = bbq.e($$1.get(2), "maxU");
               float $$5 = bbq.e($$1.get(3), "maxV");
               return new gyx.b($$2, $$3, $$4, $$5);
            }
         }
      }
   }

   public record b(float a, float b, float c, float d) {
      public float a(int $$0) {
         return $$0 != 0 && $$0 != 1 ? this.c : this.a;
      }

      public float b(int $$0) {
         return $$0 != 0 && $$0 != 3 ? this.d : this.b;
      }
   }
}
