import com.mojang.logging.LogUtils;
import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fpe {
   private static final Logger b = LogUtils.getLogger();
   public static final int a = 20;
   private final foq c = foq.a();
   private final Path d;
   private final fqb e;
   private final fuq f;
   private final long g;
   private final fpf h;
   private volatile boolean i;
   @Nullable
   private foo j;

   public fpe(Path $$0, fqb $$1, fuq $$2, long $$3, fpf $$4) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
      this.h = $$4;
   }

   public CompletableFuture<?> a() {
      return CompletableFuture.runAsync(() -> {
         File $$0 = null;

         try {
            fqp $$1 = this.c();
            $$0 = fpd.a(this.d, () -> this.i);
            this.h.d();
            foo $$2 = new foo($$0, this.g, this.e.a, $$1, this.f, ac.b().c(), this.e.b.h, this.h.b());
            this.j = $$2;
            fry $$3 = $$2.a();
            String $$4 = $$3.a();
            if ($$4 != null) {
               throw new fpa($$4);
            }

            fsw.b(this.g);
            this.c.a(this.g, this.e.a, this.e.b, this.e.c);
         } catch (IOException var11) {
            throw new fpa(var11.getMessage());
         } catch (fqx var12) {
            throw new fpa(var12.a.b());
         } catch (CancellationException | InterruptedException var13) {
            throw new foy();
         } finally {
            if ($$0 != null) {
               b.debug("Deleting file {}", $$0.getAbsolutePath());
               $$0.delete();
            }
         }
      }, ag.h());
   }

   public void b() {
      this.i = true;
      if (this.j != null) {
         this.j.b();
         this.j = null;
      }
   }

   private fqp c() throws fqx, InterruptedException {
      for (int $$0 = 0; $$0 < 20; $$0++) {
         try {
            fqp $$1 = this.c.i(this.g);
            if (this.i) {
               throw new foy();
            }

            if ($$1 != null) {
               if (!$$1.c()) {
                  throw new fpc();
               }

               return $$1;
            }
         } catch (fqy var3) {
            Thread.sleep(var3.c * 1000L);
         }
      }

      throw new fpc();
   }
}
