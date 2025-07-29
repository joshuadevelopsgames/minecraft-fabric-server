import com.google.common.collect.Maps;
import com.google.common.hash.Hashing;
import com.mojang.logging.LogUtils;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.StandardWatchEventKinds;
import java.nio.file.WatchEvent;
import java.nio.file.WatchKey;
import java.nio.file.WatchService;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import javax.annotation.Nullable;
import org.apache.commons.lang3.mutable.MutableBoolean;
import org.slf4j.Logger;

public class gjc extends get {
   static final Logger a = LogUtils.getLogger();
   private static final xo b = xo.c("pack.available.title");
   private static final xo c = xo.c("pack.selected.title");
   private static final xo d = xo.c("pack.openFolder");
   private static final int e = 200;
   private static final xo f = xo.c("pack.dropInfo").a(o.h);
   private static final xo u = xo.c("pack.folderInfo");
   private static final int v = 20;
   private static final ame w = ame.b("textures/misc/unknown_pack.png");
   private final gbk x = new gbk(this);
   private final gjb y;
   @Nullable
   private gjc.a z;
   private long A;
   private gjd B;
   private gjd C;
   private final Path D;
   private fxo E;
   private final Map<String, ame> F = Maps.newHashMap();

   public gjc(awz $$0, Consumer<awz> $$1, Path $$2, xo $$3) {
      super($$3);
      this.y = new gjb(this::n, this::a, $$0, $$1);
      this.D = $$2;
      this.z = gjc.a.a($$2);
   }

   @Override
   public void aP_() {
      this.y.c();
      this.m();
   }

   private void m() {
      if (this.z != null) {
         try {
            this.z.close();
            this.z = null;
         } catch (Exception var2) {
         }
      }
   }

   @Override
   protected void aV_() {
      gbo $$0 = this.x.a(gbo.d().a(5));
      $$0.c().b();
      $$0.a(new fyx(this.o(), this.q));
      $$0.a(new fyx(f, this.q));
      this.B = this.c(new gjd(this.n, this, 200, this.p - 66, b));
      this.C = this.c(new gjd(this.n, this, 200, this.p - 66, c));
      gbo $$1 = this.x.b(gbo.e().a(8));
      $$1.a(fxo.a(d, $$0x -> ag.n().a(this.D)).a(fzb.a(u)).a());
      this.E = $$1.a(fxo.a(xn.d, $$0x -> this.aP_()).a());
      this.E();
      this.x.a($$1x -> {
         fxm var10000 = this.c($$1x);
      });
      this.c();
   }

   @Override
   protected void c() {
      this.x.a();
      this.B.a(200, this.x);
      this.B.j(this.o / 2 - 15 - 200);
      this.C.a(200, this.x);
      this.C.j(this.o / 2 + 15);
   }

   @Override
   public void e() {
      if (this.z != null) {
         try {
            if (this.z.a()) {
               this.A = 20L;
            }
         } catch (IOException var2) {
            a.warn("Failed to poll for directory {} changes, stopping", this.D);
            this.m();
         }
      }

      if (this.A > 0L && --this.A == 0L) {
         this.E();
      }
   }

   private void n() {
      this.a(this.C, this.y.b());
      this.a(this.B, this.y.a());
      this.E.j = !this.C.aH_().isEmpty();
   }

   private void a(gjd $$0, Stream<gjb.a> $$1) {
      $$0.aH_().clear();
      gjd.a $$2 = $$0.p();
      String $$3 = $$2 == null ? "" : $$2.b();
      $$0.a(null);
      $$1.forEach($$2x -> {
         gjd.a $$3x = new gjd.a(this.n, $$0, $$2x);
         $$0.aH_().add($$3x);
         if ($$2x.c().equals($$3)) {
            $$0.a($$3x);
         }
      });
   }

   public void a(gjd $$0) {
      gjd $$1 = this.C == $$0 ? this.B : this.C;
      this.a(fwy.a($$1.q(), $$1, this));
   }

   public void l() {
      this.C.a(null);
      this.B.a(null);
   }

   private void E() {
      this.y.d();
      this.n();
      this.A = 0L;
      this.F.clear();
   }

   protected static void a(fue $$0, List<Path> $$1, Path $$2) {
      MutableBoolean $$3 = new MutableBoolean();
      $$1.forEach($$2x -> {
         try (Stream<Path> $$3x = Files.walk($$2x)) {
            $$3x.forEach($$3xx -> {
               try {
                  ag.b($$2x.getParent(), $$2, $$3xx);
               } catch (IOException var5) {
                  a.warn("Failed to copy datapack file  from {} to {}", new Object[]{$$3xx, $$2, var5});
                  $$3.setTrue();
               }
            });
         } catch (IOException var8) {
            a.warn("Failed to copy datapack file from {} to {}", $$2x, $$2);
            $$3.setTrue();
         }
      });
      if ($$3.isTrue()) {
         gab.c($$0, $$2.toString());
      }
   }

   @Override
   public void a(List<Path> $$0) {
      String $$1 = a($$0).collect(Collectors.joining(", "));
      this.n.a(new gdr($$1x -> {
         if ($$1x) {
            List<Path> $$2 = new ArrayList<>($$0.size());
            Set<Path> $$3 = new HashSet<>($$0);
            awy<Path> $$4 = new awy<Path>(this.n.bf()) {
               protected Path a(Path $$0) {
                  return $$0;
               }

               protected Path b(Path $$0) {
                  return $$0;
               }
            };
            List<fij> $$5 = new ArrayList<>();

            for (Path $$6 : $$0) {
               try {
                  Path $$7 = $$4.a($$6, $$5);
                  if ($$7 == null) {
                     a.warn("Path {} does not seem like pack", $$6);
                  } else {
                     $$2.add($$7);
                     $$3.remove($$7);
                  }
               } catch (IOException var10) {
                  a.warn("Failed to check {} for packs", $$6, var10);
               }
            }

            if (!$$5.isEmpty()) {
               this.n.a(gel.b(() -> this.n.a(this)));
               return;
            }

            if (!$$2.isEmpty()) {
               a(this.n, $$2, this.D);
               this.E();
            }

            if (!$$3.isEmpty()) {
               String $$9 = a($$3).collect(Collectors.joining(", "));
               this.n.a(new gdm(() -> this.n.a(this), xo.c("pack.dropRejected.title"), xo.a("pack.dropRejected.message", $$9)));
               return;
            }
         }

         this.n.a(this);
      }, xo.c("pack.dropConfirm"), xo.b($$1)));
   }

   private static Stream<String> a(Collection<Path> $$0) {
      return $$0.stream().map(Path::getFileName).map(Path::toString);
   }

   private ame a(hru $$0, aww $$1) {
      try {
         ame var9;
         try (awb $$2 = $$1.f()) {
            axg<InputStream> $$3 = $$2.a("pack.png");
            if ($$3 == null) {
               return w;
            }

            String $$4 = $$1.g();
            ame $$5 = ame.b("pack/" + ag.a($$4, ame::b) + "/" + Hashing.sha1().hashUnencodedChars($$4) + "/icon");

            try (InputStream $$6 = $$3.get()) {
               fnf $$7 = fnf.a($$6);
               $$0.a($$5, new hrf($$5::toString, $$7));
               var9 = $$5;
            }
         }

         return var9;
      } catch (Exception var14) {
         a.warn("Failed to load icon from pack {}", $$1.g(), var14);
         return w;
      }
   }

   private ame a(aww $$0) {
      return this.F.computeIfAbsent($$0.g(), $$1 -> this.a(this.n.ab(), $$0));
   }

   static class a implements AutoCloseable {
      private final WatchService a;
      private final Path b;

      public a(Path $$0) throws IOException {
         this.b = $$0;
         this.a = $$0.getFileSystem().newWatchService();

         try {
            this.b($$0);

            try (DirectoryStream<Path> $$1 = Files.newDirectoryStream($$0)) {
               for (Path $$2 : $$1) {
                  if (Files.isDirectory($$2, LinkOption.NOFOLLOW_LINKS)) {
                     this.b($$2);
                  }
               }
            }
         } catch (Exception var7) {
            this.a.close();
            throw var7;
         }
      }

      @Nullable
      public static gjc.a a(Path $$0) {
         try {
            return new gjc.a($$0);
         } catch (IOException var2) {
            gjc.a.warn("Failed to initialize pack directory {} monitoring", $$0, var2);
            return null;
         }
      }

      private void b(Path $$0) throws IOException {
         $$0.register(this.a, StandardWatchEventKinds.ENTRY_CREATE, StandardWatchEventKinds.ENTRY_DELETE, StandardWatchEventKinds.ENTRY_MODIFY);
      }

      public boolean a() throws IOException {
         boolean $$0 = false;

         WatchKey $$1;
         while (($$1 = this.a.poll()) != null) {
            for (WatchEvent<?> $$3 : $$1.pollEvents()) {
               $$0 = true;
               if ($$1.watchable() == this.b && $$3.kind() == StandardWatchEventKinds.ENTRY_CREATE) {
                  Path $$4 = this.b.resolve((Path)$$3.context());
                  if (Files.isDirectory($$4, LinkOption.NOFOLLOW_LINKS)) {
                     this.b($$4);
                  }
               }
            }

            $$1.reset();
         }

         return $$0;
      }

      @Override
      public void close() throws IOException {
         this.a.close();
      }
   }
}
