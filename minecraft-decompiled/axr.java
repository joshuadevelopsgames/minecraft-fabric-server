import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import java.util.Optional;

@FunctionalInterface
public interface axr {
   axr b = $$0 -> Optional.empty();

   Optional<axm> getResource(ame var1);

   default axm getResourceOrThrow(ame $$0) throws FileNotFoundException {
      return this.getResource($$0).orElseThrow(() -> new FileNotFoundException($$0.toString()));
   }

   default InputStream open(ame $$0) throws IOException {
      return this.getResourceOrThrow($$0).d();
   }

   default BufferedReader openAsReader(ame $$0) throws IOException {
      return this.getResourceOrThrow($$0).e();
   }

   static axr fromMap(Map<ame, axm> $$0) {
      return $$1 -> Optional.ofNullable($$0.get($$1));
   }
}
