import java.nio.file.Path;
import java.util.List;
import java.util.UUID;

public interface huv {
   void scheduleReload(huv.a var1);

   public interface a {
      void a();

      void a(boolean var1);

      List<huv.b> b();
   }

   public record b(UUID a, Path b) {
   }
}
