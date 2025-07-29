import com.google.gson.JsonElement;
import com.google.gson.JsonIOException;
import com.google.gson.JsonParser;
import com.google.gson.JsonSyntaxException;
import com.google.gson.Strictness;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.MalformedJsonException;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;

public class bcy {
   public static JsonElement a(Reader $$0) throws JsonIOException, JsonSyntaxException {
      try {
         JsonReader $$1 = new JsonReader($$0);
         $$1.setStrictness(Strictness.STRICT);
         JsonElement $$2 = JsonParser.parseReader($$1);
         if (!$$2.isJsonNull() && $$1.peek() != JsonToken.END_DOCUMENT) {
            throw new JsonSyntaxException("Did not consume the entire document.");
         } else {
            return $$2;
         }
      } catch (NumberFormatException | MalformedJsonException var3) {
         throw new JsonSyntaxException(var3);
      } catch (IOException var4) {
         throw new JsonIOException(var4);
      }
   }

   public static JsonElement a(String $$0) throws JsonSyntaxException {
      return a(new StringReader($$0));
   }
}
