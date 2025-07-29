import java.net.URI;
import java.nio.file.Path;
import java.util.Optional;

public record wf(xo a, Optional<Path> b, Optional<URI> c) {
   public wf(xo $$0) {
      this($$0, Optional.empty(), Optional.empty());
   }
}
