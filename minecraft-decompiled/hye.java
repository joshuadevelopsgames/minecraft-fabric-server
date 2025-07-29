import com.mojang.logging.LogUtils;
import java.net.InetSocketAddress;
import java.util.Objects;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class hye {
   static final Logger a = LogUtils.getLogger();
   final get b;
   volatile boolean c;
   @Nullable
   wd d;

   public hye(get $$0) {
      this.b = $$0;
   }

   public void a(final fpx $$0, gtc $$1) {
      final fue $$2 = fue.R();
      $$2.aV();
      $$2.aZ().d(xo.c("mco.connect.success"));
      final String $$3 = $$1.a();
      final int $$4 = $$1.b();
      (new Thread("Realms-connect-task") {
         @Override
         public void run() {
            InetSocketAddress $$0x = null;

            try {
               $$0x = new InetSocketAddress($$3, $$4);
               if (hye.this.c) {
                  return;
               }

               hye.this.d = wd.a($$0x, $$2.n.aG(), $$2.aR().n());
               if (hye.this.c) {
                  return;
               }

               grj $$1x = new grj(hye.this.d, $$2, $$0.c($$3), hye.this.b, false, null, $$0xx -> {}, null);
               if ($$0.j()) {
                  $$1x.a($$0.r);
               }

               if (hye.this.c) {
                  return;
               }

               hye.this.d.a($$3, $$4, $$1x);
               if (hye.this.c) {
                  return;
               }

               hye.this.d.a(new akj($$2.Y().c(), $$2.Y().b()));
               $$2.a(gsq.a($$0));
               $$2.bd().a(gwq.c.c, String.valueOf($$0.b), Objects.requireNonNullElse($$0.d, "unknown"));
               $$2.ag().a(hye.this.d, huw.c.b);
            } catch (Exception var5) {
               $$2.ag().i();
               if (hye.this.c) {
                  return;
               }

               hye.a.error("Couldn't connect to world", var5);
               String $$3x = var5.toString();
               if ($$0x != null) {
                  String $$4x = $$0x + ":" + $$4;
                  $$3x = $$3x.replaceAll($$4x, "");
               }

               gea $$5 = new gea(hye.this.b, xo.c("mco.connect.failed"), xo.a("disconnect.genericReason", $$3x), xn.k);
               $$2.execute(() -> $$2.a($$5));
            }
         }
      }).start();
   }

   public void a() {
      this.c = true;
      if (this.d != null && this.d.i()) {
         this.d.a(xo.c("disconnect.genericReason"));
         this.d.n();
      }
   }

   public void b() {
      if (this.d != null) {
         if (this.d.i()) {
            this.d.b();
         } else {
            this.d.n();
         }
      }
   }
}
