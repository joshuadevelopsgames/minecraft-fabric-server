import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Map;
import java.util.Optional;
import java.util.function.BiConsumer;
import java.util.function.Function;
import javax.annotation.Nullable;

public class hsj extends awt {
   private static final awp e = new awp(xo.c("resourcePack.vanilla.description"), ac.b().a(awd.a), Optional.empty());
   private static final avt f = avt.a(awp.b, e);
   public static final String d = "high_contrast";
   private static final Map<String, xo> g = Map.of(
      "programmer_art", xo.c("resourcePack.programmer_art.name"), "high_contrast", xo.c("resourcePack.high_contrast.name")
   );
   private static final awa h = new awa("vanilla", xo.c("resourcePack.vanilla.name"), axa.c, Optional.of(c));
   private static final awc i = new awc(true, aww.b.b, false);
   private static final awc j = new awc(false, aww.b.a, false);
   private static final ame k = ame.b("resourcepacks");
   @Nullable
   private final Path l;

   public hsj(Path $$0, fii $$1) {
      super(awd.a, b($$0), k, $$1);
      this.l = this.a($$0);
   }

   private static awa a(String $$0, xo $$1) {
      return new awa($$0, $$1, axa.c, Optional.of(awv.a($$0)));
   }

   @Nullable
   private Path a(Path $$0) {
      if (ac.aZ && $$0.getFileSystem() == FileSystems.getDefault()) {
         Path $$1 = $$0.getParent().resolve("resourcepacks");
         if (Files.isDirectory($$1)) {
            return $$1;
         }
      }

      return null;
   }

   private static awf b(Path $$0) {
      awg $$1 = new awg().a(f).a("minecraft", "realms");
      return $$1.b().a().a(awd.a, $$0).a(h);
   }

   @Override
   protected xo a(String $$0) {
      xo $$1 = g.get($$0);
      return (xo)($$1 != null ? $$1 : xo.b($$0));
   }

   @Nullable
   @Override
   protected aww a(awb $$0) {
      return aww.a(h, b($$0), awd.a, i);
   }

   @Nullable
   @Override
   protected aww a(String $$0, aww.c $$1, xo $$2) {
      return aww.a(a($$0, $$2), $$1, awd.a, j);
   }

   @Override
   protected void a(BiConsumer<String, Function<String, aww>> $$0) {
      super.a($$0);
      if (this.l != null) {
         this.a(this.l, $$0);
      }
   }
}
