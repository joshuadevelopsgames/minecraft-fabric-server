import java.util.Map;
import javax.annotation.Nullable;

public interface ei {
   ei a = new ei() {
      @Nullable
      @Override
      public ye a(String $$0) {
         return null;
      }
   };

   @Nullable
   ye a(String var1);

   public record a(Map<String, ye> b) implements ei {
      @Nullable
      @Override
      public ye a(String $$0) {
         return this.b.get($$0);
      }

      public Map<String, ye> a() {
         return this.b;
      }
   }
}
