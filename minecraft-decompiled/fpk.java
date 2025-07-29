import com.google.gson.ExclusionStrategy;
import com.google.gson.FieldAttributes;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import javax.annotation.Nullable;

public class fpk {
   ExclusionStrategy a = new ExclusionStrategy() {
      public boolean shouldSkipClass(Class<?> $$0) {
         return false;
      }

      public boolean shouldSkipField(FieldAttributes $$0) {
         return $$0.getAnnotation(fpj.class) != null;
      }
   };
   private final Gson b = new GsonBuilder().addSerializationExclusionStrategy(this.a).addDeserializationExclusionStrategy(this.a).create();

   public String a(fqg $$0) {
      return this.b.toJson($$0);
   }

   public String a(JsonElement $$0) {
      return this.b.toJson($$0);
   }

   @Nullable
   public <T extends fqg> T a(String $$0, Class<T> $$1) {
      return (T)this.b.fromJson($$0, $$1);
   }
}
