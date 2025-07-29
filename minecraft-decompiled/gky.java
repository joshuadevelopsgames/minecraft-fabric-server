import com.mojang.datafixers.util.Pair;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.Lifecycle;
import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class gky {
   private static final Logger a = LogUtils.getLogger();
   private static final UUID b = UUID.fromString("640a6a92-b6cb-48a0-b391-831586500359");
   private final fue c;
   private final fcs d;

   public gky(fue $$0, fcs $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   public void a(String $$0, dmy $$1, eky $$2, Function<jn.a, ekv> $$3, get $$4) {
      this.c.c(new gee(xo.c("selectWorld.data_read")));
      fcs.c $$5 = this.a($$0);
      if ($$5 != null) {
         awz $$6 = axc.a($$5);
         dns $$7 = $$1.g();

         try {
            anc.d $$8 = new anc.d($$6, $$7, false, false);
            and $$9 = this.a($$8, $$3x -> {
               ekv.b $$4x = $$3.apply($$3x.c()).a($$3x.d().f(mn.bv));
               return new anc.b<>(new fcw($$1, $$2, $$4x.d(), $$4x.a()), $$4x.b());
            }, and::new);
            this.c.a($$5, $$6, $$9, true);
         } catch (Exception var11) {
            a.warn("Failed to load datapacks, can't proceed with server load", var11);
            $$5.c();
            this.c.a($$4);
         }
      }
   }

   @Nullable
   private fcs.c a(String $$0) {
      try {
         return this.d.d($$0);
      } catch (IOException var3) {
         a.warn("Failed to read level {} data", $$0, var3);
         gab.a(this.c, $$0);
         this.c.a(null);
         return null;
      } catch (fih var4) {
         a.warn("{}", var4.getMessage());
         this.c.a(gel.a(() -> this.c.a(null)));
         return null;
      }
   }

   public void a(fcs.c $$0, amp $$1, js<amn> $$2, fdd $$3) {
      awz $$4 = axc.a($$0);
      axe $$5 = (axe)new anc.d($$4, $$3.D(), false, false).a().getSecond();
      this.c.a($$0, $$4, new and($$5, $$1, $$2, $$3), true);
   }

   public and a(Dynamic<?> $$0, boolean $$1, awz $$2) throws Exception {
      anc.d $$3 = fcs.a($$0, $$2, $$1);
      return this.a($$3, $$1x -> {
         jy<ehz> $$2x = $$1x.d().f(mn.bv);
         fcp $$3x = fcs.a($$0, $$1x.b(), $$2x, $$1x.c());
         return new anc.b<>($$3x.a(), $$3x.b().b());
      }, and::new);
   }

   public Pair<dmy, gkv> a(fcs.c $$0) throws Exception {
      awz $$1 = axc.a($$0);
      Dynamic<?> $$2 = $$0.h();
      anc.d $$3 = fcs.a($$2, $$1, false);

      record a(dmy a, eky b, jy<ehz> c) {
      }

      return this.a($$3, $$1x -> {
         jy<ehz> $$2x = new jt<>(mn.bv, Lifecycle.stable()).n();
         fcp $$3x = fcs.a($$2, $$1x.b(), $$2x, $$1x.c());
         return new anc.b<>(new a($$3x.a().J(), $$3x.a().y(), $$3x.b().c()), $$1x.d());
      }, ($$0x, $$1x, $$2x, $$3x) -> {
         $$0x.close();
         gkq $$4 = new gkq(gkx.a.a, Set.of(), null);
         return Pair.of($$3x.a, new gkv($$3x.b, new ekv($$3x.c), $$2x, $$1x, $$3x.a.g(), $$4));
      });
   }

   private <D, R> R a(anc.d $$0, anc.f<D> $$1, anc.e<D, R> $$2) throws Exception {
      anc.c $$3 = new anc.c($$0, el.a.c, 2);
      CompletableFuture<R> $$4 = anc.a($$3, $$1, $$2, ag.h(), this.c);
      this.c.b($$4::isDone);
      return $$4.get();
   }

   private void a(fcs.c $$0, boolean $$1, Runnable $$2, Runnable $$3) {
      xo $$4;
      xo $$5;
      if ($$1) {
         $$4 = xo.c("selectWorld.backupQuestion.customized");
         $$5 = xo.c("selectWorld.backupWarning.customized");
      } else {
         $$4 = xo.c("selectWorld.backupQuestion.experimental");
         $$5 = xo.c("selectWorld.backupWarning.experimental");
      }

      this.c.a(new gdn($$3, ($$2x, $$3x) -> {
         if ($$2x) {
            gko.a($$0);
         }

         $$2.run();
      }, $$4, $$5, false));
   }

   public static void a(fue $$0, gkl $$1, Lifecycle $$2, Runnable $$3, boolean $$4) {
      BooleanConsumer $$5 = $$3x -> {
         if ($$3x) {
            $$3.run();
         } else {
            $$0.a($$1);
         }
      };
      if ($$4 || $$2 == Lifecycle.stable()) {
         $$3.run();
      } else if ($$2 == Lifecycle.experimental()) {
         $$0.a(new gdr($$5, xo.c("selectWorld.warning.experimental.title"), xo.c("selectWorld.warning.experimental.question")));
      } else {
         $$0.a(new gdr($$5, xo.c("selectWorld.warning.deprecated.title"), xo.c("selectWorld.warning.deprecated.question")));
      }
   }

   public void a(String $$0, Runnable $$1) {
      this.c.c(new gee(xo.c("selectWorld.data_read")));
      fcs.c $$2 = this.a($$0);
      if ($$2 != null) {
         this.a($$2, $$1);
      }
   }

   private void a(fcs.c $$0, Runnable $$1) {
      this.c.c(new gee(xo.c("selectWorld.data_read")));

      Dynamic<?> $$2;
      fct $$3;
      try {
         $$2 = $$0.h();
         $$3 = $$0.a($$2);
      } catch (ut | va | IOException var10) {
         this.c.a(new ges(this.c, $$2x -> {
            if ($$2x) {
               this.a($$0, $$1);
            } else {
               $$0.c();
               $$1.run();
            }
         }, $$0));
         return;
      } catch (OutOfMemoryError var11) {
         bbz.b();
         String $$6 = "Ran out of memory trying to read level data of world folder \"" + $$0.f() + "\"";
         a.error(LogUtils.FATAL_MARKER, $$6);
         OutOfMemoryError $$7 = new OutOfMemoryError("Ran out of memory reading level data");
         $$7.initCause(var11);
         p $$8 = p.a($$7, $$6);
         q $$9 = $$8.a("World details");
         $$9.a("World folder", $$0.f());
         throw new aa($$8);
      }

      this.a($$0, $$3, $$2, $$1);
   }

   private void a(fcs.c $$0, fct $$1, Dynamic<?> $$2, Runnable $$3) {
      if (!$$1.r()) {
         $$0.c();
         this.c.a(new gdm($$3, xo.c("selectWorld.incompatible.title").b(-65536), xo.a("selectWorld.incompatible.description", $$1.k())));
      } else {
         fct.a $$4 = $$1.o();
         if ($$4.a()) {
            String $$5 = "selectWorld.backupQuestion." + $$4.c();
            String $$6 = "selectWorld.backupWarning." + $$4.c();
            yc $$7 = xo.c($$5);
            if ($$4.b()) {
               $$7.b(-2142128);
            }

            xo $$8 = xo.a($$6, $$1.k(), ac.b().c());
            this.c.a(new gdn(() -> {
               $$0.c();
               $$3.run();
            }, ($$3x, $$4x) -> {
               if ($$3x) {
                  gko.a($$0);
               }

               this.a($$0, $$2, false, $$3);
            }, $$7, $$8, false));
         } else {
            this.a($$0, $$2, false, $$3);
         }
      }
   }

   private void a(fcs.c $$0, Dynamic<?> $$1, boolean $$2, Runnable $$3) {
      this.c.c(new gee(xo.c("selectWorld.resource_load")));
      awz $$4 = axc.a($$0);

      and $$5;
      try {
         $$5 = this.a($$1, $$2, $$4);

         for (ehz $$6 : $$5.c().a().f(mn.bv)) {
            $$6.b().a();
         }
      } catch (Exception var9) {
         a.warn("Failed to load level data or datapacks, can't proceed with server load", var9);
         if (!$$2) {
            this.c.a(new gdw(() -> {
               $$0.c();
               $$3.run();
            }, () -> this.a($$0, $$1, true, $$3)));
         } else {
            $$0.c();
            this.c.a(new gdm($$3, xo.c("datapackFailure.safeMode.failed.title"), xo.c("datapackFailure.safeMode.failed.description"), xn.k, true));
         }

         return;
      }

      this.a($$0, $$5, $$4, $$3);
   }

   private void a(fcs.c $$0, and $$1, awz $$2, Runnable $$3) {
      fdd $$4 = $$1.d();
      boolean $$5 = $$4.y().f();
      boolean $$6 = $$4.B() != Lifecycle.stable();
      if (!$$5 && !$$6) {
         this.b($$0, $$1, $$2, $$3);
      } else {
         this.a($$0, $$5, () -> this.b($$0, $$1, $$2, $$3), () -> {
            $$1.close();
            $$0.c();
            $$3.run();
         });
      }
   }

   private void b(fcs.c $$0, and $$1, awz $$2, Runnable $$3) {
      hus $$4 = this.c.ag();
      this.a($$4, $$0).thenApply($$0x -> true).exceptionallyComposeAsync($$0x -> {
         a.warn("Failed to load pack: ", $$0x);
         return this.a();
      }, this.c).thenAcceptAsync($$5 -> {
         if ($$5) {
            this.a($$0, $$1, $$4, $$2, $$3);
         } else {
            $$4.e();
            $$1.close();
            $$0.c();
            $$3.run();
         }
      }, this.c).exceptionally($$0x -> {
         this.c.a(p.a($$0x, "Load world"));
         return null;
      });
   }

   private void a(fcs.c $$0, and $$1, hus $$2, awz $$3, Runnable $$4) {
      if ($$0.b()) {
         this.c.a(new gdr($$5 -> {
            if ($$5) {
               this.a($$0, $$1, $$3);
            } else {
               $$2.e();
               $$1.close();
               $$0.c();
               $$4.run();
            }
         }, xo.c("selectWorld.warning.lowDiskSpace.title").a(o.m), xo.c("selectWorld.warning.lowDiskSpace.description"), xn.j, xn.k));
      } else {
         this.a($$0, $$1, $$3);
      }
   }

   private void a(fcs.c $$0, and $$1, awz $$2) {
      this.c.a($$0, $$2, $$1, false);
   }

   private CompletableFuture<Void> a(hus $$0, fcs.c $$1) {
      Path $$2 = $$1.a(fcq.k);
      if (Files.exists($$2) && !Files.isDirectory($$2)) {
         $$0.f();
         CompletableFuture<Void> $$3 = $$0.b(b);
         $$0.a(b, $$2);
         return $$3;
      } else {
         return CompletableFuture.completedFuture(null);
      }
   }

   private CompletableFuture<Boolean> a() {
      CompletableFuture<Boolean> $$0 = new CompletableFuture<>();
      this.c.a(new gdr($$0::complete, xo.c("multiplayer.texturePrompt.failure.line1"), xo.c("multiplayer.texturePrompt.failure.line2"), xn.i, xn.e));
      return $$0;
   }
}
