import com.mojang.logging.LogUtils;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.concurrent.CompletionException;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fox {
   private static final Logger a = LogUtils.getLogger();

   public static void a(fue $$0, get $$1, get $$2, int $$3, fpx $$4, @Nullable fte $$5) {
      gkl.a($$0, $$1, ($$6, $$7, $$8, $$9) -> {
         Path $$10;
         try {
            $$10 = a($$7, $$8, $$9);
         } catch (IOException var14) {
            a.warn("Failed to create temporary world folder.");
            $$0.a(new frm(xo.c("mco.create.world.failed"), $$2));
            return true;
         }

         fqe $$13 = fqe.a($$8.J(), $$8.J().e(), ac.b().c());
         fqb $$14 = new fqb($$3, $$13, List.of(fqa.a($$8.J().c())));
         fpe $$15 = new fpe($$10, $$14, $$0.Y(), $$4.b, fpf.f());
         $$0.c(new gdm($$15::b, xo.c("mco.create.world.reset.title"), xo.i(), xn.e, false));
         if ($$5 != null) {
            $$5.run();
         }

         $$15.a().handleAsync(($$5xx, $$6x) -> {
            if ($$6x != null) {
               if ($$6x instanceof CompletionException $$7x) {
                  $$6x = $$7x.getCause();
               }

               if ($$6x instanceof foy) {
                  $$0.c($$2);
               } else {
                  if ($$6x instanceof fpa $$8x) {
                     a.warn("Failed to create realms world {}", $$8x.a());
                  } else {
                     a.warn("Failed to create realms world {}", $$6x.getMessage());
                  }

                  $$0.c(new frm(xo.c("mco.create.world.failed"), $$2));
               }
            } else {
               if ($$1 instanceof fsc $$9x) {
                  $$9x.a($$4.b);
               }

               if ($$5 != null) {
                  fol.a($$4, $$1, true);
               } else {
                  $$0.c($$1);
               }

               fol.g();
            }

            return null;
         }, $$0);
         return true;
      });
   }

   private static Path a(js<amn> $$0, fcw $$1, @Nullable Path $$2) throws IOException {
      Path $$3 = Files.createTempDirectory("minecraft_realms_world_upload");
      if ($$2 != null) {
         Files.move($$2, $$3.resolve("datapacks"));
      }

      ui $$4 = $$1.a($$0.a(), null);
      ui $$5 = new ui();
      $$5.a("Data", $$4);
      Path $$6 = Files.createFile($$3.resolve("level.dat"));
      uv.a($$5, $$6);
      return $$3;
   }
}
