import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;

public record gzg(gzf b, gzf c, gzf d, gzf e, gzf f, gzf g, gzf h, gzf i) {
   public static final gzg a = new gzg(gzf.a, gzf.a, gzf.a, gzf.a, gzf.a, gzf.a, gzf.a, gzf.a);

   public gzf a(dct $$0) {
      return switch ($$0) {
         case b -> this.b;
         case c -> this.c;
         case d -> this.d;
         case e -> this.e;
         case f -> this.f;
         case g -> this.g;
         case h -> this.h;
         case i -> this.i;
         default -> gzf.a;
      };
   }

   public gzf a() {
      return this.b;
   }

   public gzf b() {
      return this.c;
   }

   public gzf c() {
      return this.d;
   }

   public gzf d() {
      return this.e;
   }

   public gzf e() {
      return this.f;
   }

   public gzf f() {
      return this.g;
   }

   public gzf g() {
      return this.h;
   }

   public gzf h() {
      return this.i;
   }

   protected static class a implements JsonDeserializer<gzg> {
      public gzg a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         JsonObject $$3 = $$0.getAsJsonObject();
         gzf $$4 = this.a($$2, $$3, dct.c);
         gzf $$5 = this.a($$2, $$3, dct.b);
         if ($$5 == gzf.a) {
            $$5 = $$4;
         }

         gzf $$6 = this.a($$2, $$3, dct.e);
         gzf $$7 = this.a($$2, $$3, dct.d);
         if ($$7 == gzf.a) {
            $$7 = $$6;
         }

         gzf $$8 = this.a($$2, $$3, dct.f);
         gzf $$9 = this.a($$2, $$3, dct.g);
         gzf $$10 = this.a($$2, $$3, dct.h);
         gzf $$11 = this.a($$2, $$3, dct.i);
         return new gzg($$5, $$4, $$7, $$6, $$8, $$9, $$10, $$11);
      }

      private gzf a(JsonDeserializationContext $$0, JsonObject $$1, dct $$2) {
         String $$3 = $$2.c();
         return $$1.has($$3) ? (gzf)$$0.deserialize($$1.get($$3), gzf.class) : gzf.a;
      }
   }
}
