import com.google.common.annotations.VisibleForTesting;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.io.Reader;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;

public record gyz(@Nullable hun b, @Nullable huo.a d, @Nullable Boolean e, @Nullable gzg f, gzk.a g, @Nullable ame h) implements huo {
   @VisibleForTesting
   static final Gson a = new GsonBuilder()
      .registerTypeAdapter(gyz.class, new gyz.a())
      .registerTypeAdapter(gyw.class, new gyw.a())
      .registerTypeAdapter(gyx.class, new gyx.a())
      .registerTypeAdapter(gzf.class, new gzf.a())
      .registerTypeAdapter(gzg.class, new gzg.a())
      .create();

   public static gyz a(Reader $$0) {
      return bbq.a(a, $$0, gyz.class);
   }

   @Nullable
   @Override
   public hun a() {
      return this.b;
   }

   @Nullable
   @Override
   public huo.a b() {
      return this.d;
   }

   @Nullable
   @Override
   public Boolean c() {
      return this.e;
   }

   @Nullable
   @Override
   public gzg d() {
      return this.f;
   }

   @Override
   public gzk.a e() {
      return this.g;
   }

   @Nullable
   @Override
   public ame f() {
      return this.h;
   }

   public static class a implements JsonDeserializer<gyz> {
      public gyz a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         JsonObject $$3 = $$0.getAsJsonObject();
         hun $$4 = this.a($$2, $$3);
         String $$5 = this.c($$3);
         gzk.a $$6 = this.b($$3);
         Boolean $$7 = this.a($$3);
         gzg $$8 = null;
         if ($$3.has("display")) {
            JsonObject $$9 = bbq.u($$3, "display");
            $$8 = (gzg)$$2.deserialize($$9, gzg.class);
         }

         huo.a $$10 = null;
         if ($$3.has("gui_light")) {
            $$10 = huo.a.a(bbq.i($$3, "gui_light"));
         }

         ame $$11 = $$5.isEmpty() ? null : ame.a($$5);
         return new gyz($$4, $$10, $$7, $$8, $$6, $$11);
      }

      private gzk.a b(JsonObject $$0) {
         if ($$0.has("textures")) {
            JsonObject $$1 = bbq.u($$0, "textures");
            return gzk.a($$1, hrr.c);
         } else {
            return gzk.a.a;
         }
      }

      private String c(JsonObject $$0) {
         return bbq.a($$0, "parent", "");
      }

      @Nullable
      protected Boolean a(JsonObject $$0) {
         return $$0.has("ambientocclusion") ? bbq.k($$0, "ambientocclusion") : null;
      }

      @Nullable
      protected hun a(JsonDeserializationContext $$0, JsonObject $$1) {
         if (!$$1.has("elements")) {
            return null;
         } else {
            List<gyw> $$2 = new ArrayList<>();

            for (JsonElement $$3 : bbq.v($$1, "elements")) {
               $$2.add((gyw)$$0.deserialize($$3, gyw.class));
            }

            return new gzi($$2);
         }
      }
   }
}
