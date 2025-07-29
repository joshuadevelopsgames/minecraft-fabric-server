import com.mojang.datafixers.DataFixer;
import com.mojang.logging.LogUtils;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Optional;
import org.slf4j.Logger;

public class fcv {
   private static final Logger b = LogUtils.getLogger();
   private final File c;
   protected final DataFixer a;
   private static final DateTimeFormatter d = fcn.a();

   public fcv(fcs.c $$0, DataFixer $$1) {
      this.a = $$1;
      this.c = $$0.a(fcq.c).toFile();
      this.c.mkdirs();
   }

   public void a(cut $$0) {
      try (bci.j $$1 = new bci.j($$0.ef(), b)) {
         fcz $$2 = fcz.a($$1, $$0.eb());
         $$0.d($$2);
         Path $$3 = this.c.toPath();
         Path $$4 = Files.createTempFile($$3, $$0.cL() + "-", ".dat");
         ui $$5 = $$2.b();
         uv.a($$5, $$4);
         Path $$6 = $$3.resolve($$0.cL() + ".dat");
         Path $$7 = $$3.resolve($$0.cL() + ".dat_old");
         ag.a($$6, $$4, $$7);
      } catch (Exception var11) {
         b.warn("Failed to save player data for {}", $$0.aj().getString());
      }
   }

   private void a(cut $$0, String $$1) {
      Path $$2 = this.c.toPath();
      Path $$3 = $$2.resolve($$0.cL() + $$1);
      Path $$4 = $$2.resolve($$0.cL() + "_corrupted_" + LocalDateTime.now().format(d) + $$1);
      if (Files.isRegularFile($$3)) {
         try {
            Files.copy($$3, $$4, StandardCopyOption.REPLACE_EXISTING, StandardCopyOption.COPY_ATTRIBUTES);
         } catch (Exception var7) {
            b.warn("Failed to copy the player.dat file for {}", $$0.aj().getString(), var7);
         }
      }
   }

   private Optional<ui> b(cut $$0, String $$1) {
      File $$2 = new File(this.c, $$0.cL() + $$1);
      if ($$2.exists() && $$2.isFile()) {
         try {
            return Optional.of(uv.a($$2.toPath(), ur.a()));
         } catch (Exception var5) {
            b.warn("Failed to load player data for {}", $$0.aj().getString());
         }
      }

      return Optional.empty();
   }

   public Optional<fda> a(cut $$0, bci $$1) {
      Optional<ui> $$2 = this.b($$0, ".dat");
      if ($$2.isEmpty()) {
         this.a($$0, ".dat");
      }

      return $$2.or(() -> this.b($$0, ".dat_old")).map($$2x -> {
         int $$3 = ux.b($$2x, -1);
         $$2x = bdr.c.a(this.a, $$2x, $$3);
         fda $$4 = fcy.a($$1, $$0.eb(), $$2x);
         $$0.e($$4);
         return $$4;
      });
   }
}
