import com.google.common.collect.Lists;
import com.google.common.util.concurrent.ThreadFactoryBuilder;
import com.mojang.datafixers.DataFixer;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.objects.Reference2FloatMap;
import it.unimi.dsi.fastutil.objects.Reference2FloatMaps;
import it.unimi.dsi.fastutil.objects.Reference2FloatOpenHashMap;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.ListIterator;
import java.util.Optional;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;
import java.util.concurrent.ThreadFactory;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class bwx implements AutoCloseable {
   static final Logger a = LogUtils.getLogger();
   private static final ThreadFactory b = new ThreadFactoryBuilder().setDaemon(true).build();
   private static final String c = "new_";
   static final xo d = xo.c("optimizeWorld.stage.upgrading.poi");
   static final xo e = xo.c("optimizeWorld.stage.finished.poi");
   static final xo f = xo.c("optimizeWorld.stage.upgrading.entities");
   static final xo g = xo.c("optimizeWorld.stage.finished.entities");
   static final xo h = xo.c("optimizeWorld.stage.upgrading.chunks");
   static final xo i = xo.c("optimizeWorld.stage.finished.chunks");
   final jy<ehz> j;
   final Set<amd<dmu>> k;
   final boolean l;
   final boolean m;
   final fcs.c n;
   private final Thread o;
   final DataFixer p;
   volatile boolean q = true;
   private volatile boolean r;
   volatile float s;
   volatile int t;
   volatile int u;
   volatile int v;
   volatile int w;
   final Reference2FloatMap<amd<dmu>> x = Reference2FloatMaps.synchronize(new Reference2FloatOpenHashMap());
   volatile xo y = xo.c("optimizeWorld.stage.counting");
   static final Pattern z = Pattern.compile("^r\\.(-?[0-9]+)\\.(-?[0-9]+)\\.mca$");
   final fcm A;

   public bwx(fcs.c $$0, DataFixer $$1, fdd $$2, jz $$3, boolean $$4, boolean $$5) {
      this.j = $$3.f(mn.bv);
      this.k = this.j.j().stream().map(mn::a).collect(Collectors.toUnmodifiableSet());
      this.l = $$4;
      this.p = $$1;
      this.n = $$0;
      fbx.a $$6 = new fbx.a(null, $$2.y().c());
      this.A = new fcm($$6, this.n.a(dmu.i).resolve("data"), $$1, $$3);
      this.m = $$5;
      this.o = b.newThread(this::i);
      this.o.setUncaughtExceptionHandler(($$0x, $$1x) -> {
         a.error("Error upgrading world", $$1x);
         this.y = xo.c("optimizeWorld.stage.failed");
         this.r = true;
      });
      this.o.start();
   }

   public void a() {
      this.q = false;

      try {
         this.o.join();
      } catch (InterruptedException var2) {
      }
   }

   private void i() {
      long $$0 = ag.c();
      a.info("Upgrading entities");
      new bwx.d().a();
      a.info("Upgrading POIs");
      new bwx.f().a();
      a.info("Upgrading blocks");
      new bwx.b().a();
      this.A.b();
      $$0 = ag.c() - $$0;
      a.info("World optimizaton finished after {} seconds", $$0 / 1000L);
      this.r = true;
   }

   public boolean b() {
      return this.r;
   }

   public Set<amd<dmu>> c() {
      return this.k;
   }

   public float a(amd<dmu> $$0) {
      return this.x.getFloat($$0);
   }

   public float d() {
      return this.s;
   }

   public int e() {
      return this.t;
   }

   public int f() {
      return this.v;
   }

   public int g() {
      return this.w;
   }

   public xo h() {
      return this.y;
   }

   @Override
   public void close() {
      this.A.close();
   }

   static Path a(Path $$0) {
      return $$0.resolveSibling("new_" + $$0.getFileName().toString());
   }

   abstract class a<T extends AutoCloseable> {
      private final xo d;
      private final xo e;
      private final String f;
      private final String g;
      @Nullable
      protected CompletableFuture<Void> a;
      protected final bdr b;

      a(final bdr $$0, final String $$1, final String $$2, final xo $$3, final xo $$4) {
         this.b = $$0;
         this.f = $$1;
         this.g = $$2;
         this.d = $$3;
         this.e = $$4;
      }

      public void a() {
         bwx.this.u = 0;
         bwx.this.t = 0;
         bwx.this.v = 0;
         bwx.this.w = 0;
         List<bwx.c<T>> $$0 = this.b();
         if (bwx.this.t != 0) {
            float $$1 = bwx.this.u;
            bwx.this.y = this.d;

            while (bwx.this.q) {
               boolean $$2 = false;
               float $$3 = 0.0F;

               for (bwx.c<T> $$4 : $$0) {
                  amd<dmu> $$5 = $$4.a;
                  ListIterator<bwx.e> $$6 = $$4.c;
                  T $$7 = $$4.b;
                  if ($$6.hasNext()) {
                     bwx.e $$8 = $$6.next();
                     boolean $$9 = true;

                     for (dlz $$10 : $$8.b) {
                        $$9 = $$9 && this.a($$5, $$7, $$10);
                        $$2 = true;
                     }

                     if (bwx.this.m) {
                        if ($$9) {
                           this.a($$8.a);
                        } else {
                           bwx.a.error("Failed to convert region file {}", $$8.a.a());
                        }
                     }
                  }

                  float $$11 = $$6.nextIndex() / $$1;
                  bwx.this.x.put($$5, $$11);
                  $$3 += $$11;
               }

               bwx.this.s = $$3;
               if (!$$2) {
                  break;
               }
            }

            bwx.this.y = this.e;

            for (bwx.c<T> $$12 : $$0) {
               try {
                  $$12.b.close();
               } catch (Exception var14) {
                  bwx.a.error("Error upgrading chunk", var14);
               }
            }
         }
      }

      private List<bwx.c<T>> b() {
         List<bwx.c<T>> $$0 = Lists.newArrayList();

         for (amd<dmu> $$1 : bwx.this.k) {
            ehr $$2 = new ehr(bwx.this.n.f(), $$1, this.f);
            Path $$3 = bwx.this.n.a($$1).resolve(this.g);
            T $$4 = this.a($$2, $$3);
            ListIterator<bwx.e> $$5 = this.b($$2, $$3);
            $$0.add(new bwx.c<>($$1, $$4, $$5));
         }

         return $$0;
      }

      protected abstract T a(ehr var1, Path var2);

      private ListIterator<bwx.e> b(ehr $$0, Path $$1) {
         List<bwx.e> $$2 = c($$0, $$1);
         bwx.this.u = bwx.this.u + $$2.size();
         bwx.this.t = bwx.this.t + $$2.stream().mapToInt($$0x -> $$0x.b.size()).sum();
         return $$2.listIterator();
      }

      private static List<bwx.e> c(ehr $$0, Path $$1) {
         File[] $$2 = $$1.toFile().listFiles(($$0x, $$1x) -> $$1x.endsWith(".mca"));
         if ($$2 == null) {
            return List.of();
         } else {
            List<bwx.e> $$3 = Lists.newArrayList();

            for (File $$4 : $$2) {
               Matcher $$5 = bwx.z.matcher($$4.getName());
               if ($$5.matches()) {
                  int $$6 = Integer.parseInt($$5.group(1)) << 5;
                  int $$7 = Integer.parseInt($$5.group(2)) << 5;
                  List<dlz> $$8 = Lists.newArrayList();

                  try (eho $$9 = new eho($$0, $$4.toPath(), $$1, true)) {
                     for (int $$10 = 0; $$10 < 32; $$10++) {
                        for (int $$11 = 0; $$11 < 32; $$11++) {
                           dlz $$12 = new dlz($$10 + $$6, $$11 + $$7);
                           if ($$9.b($$12)) {
                              $$8.add($$12);
                           }
                        }
                     }

                     if (!$$8.isEmpty()) {
                        $$3.add(new bwx.e($$9, $$8));
                     }
                  } catch (Throwable var18) {
                     bwx.a.error("Failed to read chunks from region file {}", $$4.toPath(), var18);
                  }
               }
            }

            return $$3;
         }
      }

      private boolean a(amd<dmu> $$0, T $$1, dlz $$2) {
         boolean $$3 = false;

         try {
            $$3 = this.a($$1, $$2, $$0);
         } catch (CompletionException | aa var7) {
            Throwable $$5 = var7.getCause();
            if (!($$5 instanceof IOException)) {
               throw var7;
            }

            bwx.a.error("Error upgrading chunk {}", $$2, $$5);
         }

         if ($$3) {
            bwx.this.v++;
         } else {
            bwx.this.w++;
         }

         return $$3;
      }

      protected abstract boolean a(T var1, dlz var2, amd<dmu> var3);

      private void a(eho $$0) {
         if (bwx.this.m) {
            if (this.a != null) {
               this.a.join();
            }

            Path $$1 = $$0.a();
            Path $$2 = $$1.getParent();
            Path $$3 = bwx.a($$2).resolve($$1.getFileName().toString());

            try {
               if ($$3.toFile().exists()) {
                  Files.delete($$1);
                  Files.move($$3, $$1);
               } else {
                  bwx.a.error("Failed to replace an old region file. New file {} does not exist.", $$3);
               }
            } catch (IOException var6) {
               bwx.a.error("Failed to replace an old region file", var6);
            }
         }
      }
   }

   class b extends bwx.a<ehi> {
      b() {
         super(bdr.d, "chunk", "region", bwx.h, bwx.i);
      }

      protected boolean a(ehi $$0, dlz $$1, amd<dmu> $$2) {
         ui $$3 = $$0.d($$1).join().orElse(null);
         if ($$3 != null) {
            int $$4 = ehi.a($$3);
            efz $$5 = bwx.this.j.g(mn.b($$2)).b();
            ui $$6 = $$0.a($$2, () -> bwx.this.A, $$3, $$5.c());
            dlz $$7 = new dlz($$6.b("xPos", 0), $$6.b("zPos", 0));
            if (!$$7.equals($$1)) {
               bwx.a.warn("Chunk {} has invalid position {}", $$1, $$7);
            }

            boolean $$8 = $$4 < ac.b().a().b();
            if (bwx.this.l) {
               $$8 = $$8 || $$6.b("Heightmaps");
               $$6.r("Heightmaps");
               $$8 = $$8 || $$6.b("isLightOn");
               $$6.r("isLightOn");
               uo $$9 = $$6.p("sections");

               for (int $$10 = 0; $$10 < $$9.size(); $$10++) {
                  Optional<ui> $$11 = $$9.a($$10);
                  if (!$$11.isEmpty()) {
                     ui $$12 = $$11.get();
                     $$8 = $$8 || $$12.b("BlockLight");
                     $$12.r("BlockLight");
                     $$8 = $$8 || $$12.b("SkyLight");
                     $$12.r("SkyLight");
                  }
               }
            }

            if ($$8 || bwx.this.m) {
               if (this.a != null) {
                  this.a.join();
               }

               this.a = $$0.a($$1, () -> $$6);
               return true;
            }
         }

         return false;
      }

      protected ehi b(ehr $$0, Path $$1) {
         return (ehi)(bwx.this.m ? new ehl($$0.a("source"), $$1, $$0.a("target"), bwx.a($$1), bwx.this.p, true) : new ehi($$0, $$1, bwx.this.p, true));
      }
   }

   record c<T>(amd<dmu> a, T b, ListIterator<bwx.e> c) {
   }

   class d extends bwx.g {
      d() {
         super(bdr.t, "entities", bwx.f, bwx.g);
      }

      @Override
      protected ui a(ehu $$0, ui $$1) {
         return $$0.a($$1, -1);
      }
   }

   record e(eho a, List<dlz> b) {
   }

   class f extends bwx.g {
      f() {
         super(bdr.r, "poi", bwx.d, bwx.e);
      }

      @Override
      protected ui a(ehu $$0, ui $$1) {
         return $$0.a($$1, 1945);
      }
   }

   abstract class g extends bwx.a<ehu> {
      g(final bdr $$0, final String $$1, final xo $$2, final xo $$3) {
         super($$0, $$1, $$1, $$2, $$3);
      }

      protected ehu b(ehr $$0, Path $$1) {
         return (ehu)(bwx.this.m
            ? new ehm($$0.a("source"), $$1, $$0.a("target"), bwx.a($$1), bwx.this.p, true, this.b)
            : new ehu($$0, $$1, bwx.this.p, true, this.b));
      }

      protected boolean a(ehu $$0, dlz $$1, amd<dmu> $$2) {
         ui $$3 = $$0.a($$1).join().orElse(null);
         if ($$3 != null) {
            int $$4 = ehi.a($$3);
            ui $$5 = this.a($$0, $$3);
            boolean $$6 = $$4 < ac.b().a().b();
            if ($$6 || bwx.this.m) {
               if (this.a != null) {
                  this.a.join();
               }

               this.a = $$0.a($$1, $$5);
               return true;
            }
         }

         return false;
      }

      protected abstract ui a(ehu var1, ui var2);
   }
}
