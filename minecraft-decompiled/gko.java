import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import org.apache.commons.io.FileUtils;
import org.slf4j.Logger;

public class gko extends get {
   private static final Logger a = LogUtils.getLogger();
   private static final xo b = xo.c("selectWorld.enterName").a(o.h);
   private static final xo c = xo.c("selectWorld.edit.resetIcon");
   private static final xo d = xo.c("selectWorld.edit.openFolder");
   private static final xo e = xo.c("selectWorld.edit.backup");
   private static final xo f = xo.c("selectWorld.edit.backupFolder");
   private static final xo u = xo.c("selectWorld.edit.optimize");
   private static final xo v = xo.c("optimizeWorld.confirm.title");
   private static final xo w = xo.c("optimizeWorld.confirm.description");
   private static final xo x = xo.c("optimizeWorld.confirm.proceed");
   private static final xo y = xo.c("selectWorld.edit.save");
   private static final int z = 200;
   private static final int A = 4;
   private static final int B = 98;
   private final gbo C = gbo.d().a(5);
   private final BooleanConsumer D;
   private final fcs.c E;
   private final fxx F;

   public static gko a(fue $$0, fcs.c $$1, BooleanConsumer $$2) throws IOException {
      fct $$3 = $$1.a($$1.h());
      return new gko($$0, $$1, $$3.b(), $$2);
   }

   private gko(fue $$0, fcs.c $$1, String $$2, BooleanConsumer $$3) {
      super(xo.c("selectWorld.edit.title"));
      this.D = $$3;
      this.E = $$1;
      fwz $$4 = $$0.h;
      this.C.a(new gbp(200, 20));
      this.C.a(new fyx(b, $$4));
      this.F = this.C.a(new fxx($$4, 200, 20, b));
      this.F.a($$2);
      gbo $$5 = gbo.e().a(4);
      fxo $$6 = $$5.a(fxo.a(y, $$0x -> this.a(this.F.a())).a(98).a());
      $$5.a(fxo.a(xn.e, $$0x -> this.aP_()).a(98).a());
      this.F.b($$1x -> $$6.j = !bdb.h($$1x));
      this.C.a(fxo.a(c, $$1x -> {
         $$1.j().ifPresent($$0xx -> FileUtils.deleteQuietly($$0xx.toFile()));
         $$1x.j = false;
      }).a(200).a()).j = $$1.j().filter($$0x -> Files.isRegularFile($$0x)).isPresent();
      this.C.a(fxo.a(d, $$1x -> ag.n().a($$1.a(fcq.l))).a(200).a());
      this.C.a(fxo.a(e, $$1x -> {
         boolean $$2x = a($$1);
         this.D.accept(!$$2x);
      }).a(200).a());
      this.C.a(fxo.a(f, $$1x -> {
         fcs $$2x = $$0.m();
         Path $$3x = $$2x.d();

         try {
            w.c($$3x);
         } catch (IOException var5x) {
            throw new RuntimeException(var5x);
         }

         ag.n().a($$3x);
      }).a(200).a());
      this.C.a(fxo.a(u, $$2x -> $$0.a(new gdn(() -> $$0.a(this), ($$2xx, $$3x) -> {
         if ($$2xx) {
            a($$1);
         }

         $$0.a(gkr.a($$0, this.D, $$0.av(), $$1, $$3x));
      }, v, w, x, true))).a(200).a());
      this.C.a(new gbp(200, 20));
      this.C.a($$5);
      this.C.a($$1x -> {
         fxm var10000 = this.c($$1x);
      });
   }

   @Override
   protected void aF_() {
      this.b(this.F);
   }

   @Override
   protected void aV_() {
      this.c();
   }

   @Override
   protected void c() {
      this.C.a();
      gbi.a(this.C, this.I());
   }

   @Override
   public void aP_() {
      this.D.accept(false);
   }

   private void a(String $$0) {
      try {
         this.E.a($$0);
      } catch (ut | va | IOException var3) {
         a.error("Failed to access world '{}'", this.E.f(), var3);
         gab.a(this.n, this.E.f());
      }

      this.D.accept(true);
   }

   public static boolean a(fcs.c $$0) {
      long $$1 = 0L;
      IOException $$2 = null;

      try {
         $$1 = $$0.l();
      } catch (IOException var6) {
         $$2 = var6;
      }

      if ($$2 != null) {
         xo $$4 = xo.c("selectWorld.edit.backupFailed");
         xo $$5 = xo.b($$2.getMessage());
         fue.R().aB().a(new gab(gab.a.b, $$4, $$5));
         return false;
      } else {
         xo $$6 = xo.a("selectWorld.edit.backupCreated", $$0.f());
         xo $$7 = xo.a("selectWorld.edit.backupSize", bcb.c($$1 / 1048576.0));
         fue.R().aB().a(new gab(gab.a.b, $$6, $$7));
         return true;
      }
   }

   @Override
   public void a(fxb $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.q, this.m, this.o / 2, 15, -1);
   }
}
