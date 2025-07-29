import com.mojang.logging.LogUtils;
import java.util.Objects;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fok {
   private static final Logger a = LogUtils.getLogger();
   @Nullable
   private static CompletableFuture<fok.a> b;

   public static CompletableFuture<fok.a> a() {
      if (b == null || a(b)) {
         b = b();
      }

      return b;
   }

   private static boolean a(CompletableFuture<fok.a> $$0) {
      fok.a $$1 = $$0.getNow(null);
      return $$1 != null && $$1.b() != null;
   }

   private static CompletableFuture<fok.a> b() {
      fuq $$0 = fue.R().Y();
      return $$0.g() != fuq.a.c ? CompletableFuture.completedFuture(new fok.a(fok.b.d)) : CompletableFuture.supplyAsync(() -> {
         foq $$0x = foq.a();

         try {
            if ($$0x.i() != foq.a.a) {
               return new fok.a(fok.b.b);
            } else {
               return !$$0x.h() ? new fok.a(fok.b.c) : new fok.a(fok.b.a);
            }
         } catch (fqx var2) {
            a.error("Couldn't connect to realms", var2);
            return var2.a.a() == 401 ? new fok.a(fok.b.d) : new fok.a(var2);
         }
      }, ag.i());
   }

   public record a(fok.b a, @Nullable fqx b) {
      public a(fok.b $$0) {
         this($$0, null);
      }

      public a(fqx $$0) {
         this(fok.b.e, $$0);
      }

      @Nullable
      public get a(get $$0) {
         return (get)(switch (this.a) {
            case a -> null;
            case b -> new fri($$0);
            case c -> new frq($$0);
            case d -> new frm(xo.c("mco.error.invalid.session.title"), xo.c("mco.error.invalid.session.message"), $$0);
            case e -> new frm(Objects.requireNonNull(this.b), $$0);
         });
      }
   }

   public static enum b {
      a,
      b,
      c,
      d,
      e;
   }
}
