import com.mojang.logging.LogUtils;
import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class awu implements axb {
   static final Logger a = LogUtils.getLogger();
   private static final awc b = new awc(false, aww.b.a, false);
   private final Path c;
   private final awd d;
   private final axa e;
   private final fii f;

   public awu(Path $$0, awd $$1, axa $$2, fii $$3) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
   }

   private static String a(Path $$0) {
      return $$0.getFileName().toString();
   }

   @Override
   public void loadPacks(Consumer<aww> $$0) {
      try {
         w.c(this.c);
         a(this.c, this.f, ($$1, $$2) -> {
            awa $$3 = this.b($$1);
            aww $$4 = aww.a($$3, $$2, this.d, b);
            if ($$4 != null) {
               $$0.accept($$4);
            }
         });
      } catch (IOException var3) {
         a.warn("Failed to list packs in {}", this.c, var3);
      }
   }

   private awa b(Path $$0) {
      String $$1 = a($$0);
      return new awa("file/" + $$1, xo.b($$1), this.e, Optional.empty());
   }

   public static void a(Path $$0, fii $$1, BiConsumer<Path, aww.c> $$2) throws IOException {
      awu.a $$3 = new awu.a($$1);

      try (DirectoryStream<Path> $$4 = Files.newDirectoryStream($$0)) {
         for (Path $$5 : $$4) {
            try {
               List<fij> $$6 = new ArrayList<>();
               aww.c $$7 = $$3.a($$5, $$6);
               if (!$$6.isEmpty()) {
                  a.warn("Ignoring potential pack entry: {}", fih.a($$5, $$6));
               } else if ($$7 != null) {
                  $$2.accept($$5, $$7);
               } else {
                  a.info("Found non-pack entry '{}', ignoring", $$5);
               }
            } catch (IOException var10) {
               a.warn("Failed to read properties of '{}', ignoring", $$5, var10);
            }
         }
      }
   }

   static class a extends awy<aww.c> {
      protected a(fii $$0) {
         super($$0);
      }

      @Nullable
      protected aww.c a(Path $$0) {
         FileSystem $$1 = $$0.getFileSystem();
         if ($$1 != FileSystems.getDefault() && !($$1 instanceof awl)) {
            awu.a.info("Can't open pack archive at {}", $$0);
            return null;
         } else {
            return new avy.a($$0);
         }
      }

      protected aww.c b(Path $$0) {
         return new awe.a($$0);
      }
   }
}
