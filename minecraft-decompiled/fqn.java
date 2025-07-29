import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.mojang.logging.LogUtils;
import java.io.IOException;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public enum fqn {
   a(1, "icon/ping_5"),
   b(2, "icon/ping_4"),
   c(3, "icon/ping_3"),
   d(4, "icon/ping_2"),
   e(5, "icon/ping_unknown");

   final int f;
   private final ame g;

   private fqn(final int $$0, final String $$1) {
      this.f = $$0;
      this.g = ame.b($$1);
   }

   @Nullable
   public static fqn a(int $$0) {
      for (fqn $$1 : values()) {
         if ($$1.a() == $$0) {
            return $$1;
         }
      }

      return null;
   }

   public int a() {
      return this.f;
   }

   public ame b() {
      return this.g;
   }

   public static class a extends TypeAdapter<fqn> {
      private static final Logger a = LogUtils.getLogger();

      public void a(JsonWriter $$0, fqn $$1) throws IOException {
         $$0.value($$1.f);
      }

      public fqn a(JsonReader $$0) throws IOException {
         int $$1 = $$0.nextInt();
         fqn $$2 = fqn.a($$1);
         if ($$2 == null) {
            a.warn("Unsupported ServiceQuality {}", $$1);
            return fqn.e;
         } else {
            return $$2;
         }
      }
   }
}
