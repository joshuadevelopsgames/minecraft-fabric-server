import com.mojang.authlib.yggdrasil.ProfileResult;
import com.mojang.logging.LogUtils;
import java.util.Date;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;
import java.util.function.Function;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fsu {
   private static final Logger a = LogUtils.getLogger();
   private static final xo b = xo.c("mco.util.time.now");
   private static final int c = 60;
   private static final int d = 3600;
   private static final int e = 86400;

   public static xo a(long $$0) {
      if ($$0 < 0L) {
         return b;
      } else {
         long $$1 = $$0 / 1000L;
         if ($$1 < 60L) {
            return xo.a("mco.time.secondsAgo", $$1);
         } else if ($$1 < 3600L) {
            long $$2 = $$1 / 60L;
            return xo.a("mco.time.minutesAgo", $$2);
         } else if ($$1 < 86400L) {
            long $$3 = $$1 / 3600L;
            return xo.a("mco.time.hoursAgo", $$3);
         } else {
            long $$4 = $$1 / 86400L;
            return xo.a("mco.time.daysAgo", $$4);
         }
      }
   }

   public static xo a(Date $$0) {
      return a(System.currentTimeMillis() - $$0.getTime());
   }

   public static void a(fxb $$0, int $$1, int $$2, int $$3, UUID $$4) {
      fue $$5 = fue.R();
      ProfileResult $$6 = $$5.an().fetchProfile($$4, false);
      hst $$7 = $$6 != null ? $$5.ao().b($$6.profile()) : hsk.a($$4);
      fyo.a($$0, $$7, $$1, $$2, $$3);
   }

   public static <T> CompletableFuture<T> a(fsu.b<T> $$0, @Nullable Consumer<fqx> $$1) {
      return CompletableFuture.supplyAsync(() -> {
         foq $$2 = foq.a();

         try {
            return $$0.apply($$2);
         } catch (Throwable var5) {
            if (var5 instanceof fqx $$4) {
               if ($$1 != null) {
                  $$1.accept($$4);
               }
            } else {
               a.error("Unhandled exception", var5);
            }

            throw new RuntimeException(var5);
         }
      }, ag.j());
   }

   public static CompletableFuture<Void> a(fsu.a $$0, @Nullable Consumer<fqx> $$1) {
      return a($$0, $$1);
   }

   public static Consumer<fqx> a(Function<fqx, get> $$0) {
      fue $$1 = fue.R();
      return $$2 -> $$1.execute(() -> $$1.a($$0.apply($$2)));
   }

   public static Consumer<fqx> a(Function<fqx, get> $$0, String $$1) {
      return a($$0).andThen($$1x -> a.error($$1, $$1x));
   }

   @FunctionalInterface
   public interface a extends fsu.b<Void> {
      void accept(foq var1) throws fqx;

      default Void apply(foq $$0) throws fqx {
         this.accept($$0);
         return null;
      }
   }

   @FunctionalInterface
   public interface b<T> {
      T apply(foq var1) throws fqx;
   }
}
