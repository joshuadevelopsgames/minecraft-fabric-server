import com.google.common.collect.ImmutableList;
import com.google.common.collect.Streams;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import java.util.List;

public class guu {
   private final List<ame> a;

   private guu(List<ame> $$0) {
      this.a = $$0;
   }

   public List<ame> a() {
      return this.a;
   }

   public static guu a(JsonObject $$0) {
      JsonArray $$1 = bbq.a($$0, "textures", null);
      if ($$1 == null) {
         return new guu(List.of());
      } else {
         List<ame> $$2 = Streams.stream($$1).map($$0x -> bbq.a($$0x, "texture")).map(ame::a).collect(ImmutableList.toImmutableList());
         return new guu($$2);
      }
   }
}
