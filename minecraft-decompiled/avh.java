import com.google.common.primitives.Ints;
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.exceptions.AuthenticationUnavailableException;
import com.mojang.authlib.yggdrasil.ProfileResult;
import com.mojang.logging.LogUtils;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.security.PrivateKey;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import javax.annotation.Nullable;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import net.minecraft.server.MinecraftServer;
import org.apache.commons.lang3.Validate;
import org.slf4j.Logger;

public class avh implements akh, xc {
   private static final AtomicInteger b = new AtomicInteger(0);
   static final Logger c = LogUtils.getLogger();
   private static final int d = 600;
   private final byte[] e;
   final MinecraftServer f;
   final wd g;
   private volatile avh.a h = avh.a.a;
   private int i;
   @Nullable
   String j;
   @Nullable
   private GameProfile k;
   private final String l = "";
   private final boolean m;

   public avh(MinecraftServer $$0, wd $$1, boolean $$2) {
      this.f = $$0;
      this.g = $$1;
      this.e = Ints.toByteArray(bck.a().f());
      this.m = $$2;
   }

   @Override
   public void d() {
      if (this.h == avh.a.e) {
         this.c(Objects.requireNonNull(this.k));
      }

      if (this.h == avh.a.f && !this.a(Objects.requireNonNull(this.k))) {
         this.d(this.k);
      }

      if (this.i++ == 600) {
         this.a(xo.c("multiplayer.disconnect.slow_login"));
      }
   }

   @Override
   public boolean c() {
      return this.g.i();
   }

   public void a(xo $$0) {
      try {
         c.info("Disconnecting {}: {}", this.e(), $$0.getString());
         this.g.a(new akd($$0));
         this.g.a($$0);
      } catch (Exception var3) {
         c.error("Error whilst disconnecting player", var3);
      }
   }

   private boolean a(GameProfile $$0) {
      return this.f.ag().a($$0.getId()) != null;
   }

   @Override
   public void a(wf $$0) {
      c.info("{} lost connection: {}", this.e(), $$0.a().getString());
   }

   @Override
   public String e() {
      String $$0 = this.g.a(this.f.bl());
      return this.j != null ? this.j + " (" + $$0 + ")" : $$0;
   }

   @Override
   public void a(akj $$0) {
      Validate.validState(this.h == avh.a.a, "Unexpected hello packet", new Object[0]);
      Validate.validState(bdb.f($$0.b()), "Invalid characters in username", new Object[0]);
      this.j = $$0.b();
      GameProfile $$1 = this.f.T();
      if ($$1 != null && this.j.equalsIgnoreCase($$1.getName())) {
         this.b($$1);
      } else {
         if (this.f.aa() && !this.g.e()) {
            this.h = avh.a.b;
            this.g.a(new akb("", this.f.R().getPublic().getEncoded(), this.e, true));
         } else {
            this.b(kf.b(this.j));
         }
      }
   }

   void b(GameProfile $$0) {
      this.k = $$0;
      this.h = avh.a.e;
   }

   private void c(GameProfile $$0) {
      ayb $$1 = this.f.ag();
      xo $$2 = $$1.a(this.g.d(), $$0);
      if ($$2 != null) {
         this.a($$2);
      } else {
         if (this.f.az() >= 0 && !this.g.e()) {
            this.g.a(new akc(this.f.az()), wt.a(() -> this.g.a(this.f.az(), true)));
         }

         boolean $$3 = $$1.e($$0);
         if ($$3) {
            this.h = avh.a.f;
         } else {
            this.d($$0);
         }
      }
   }

   private void d(GameProfile $$0) {
      this.h = avh.a.g;
      this.g.a(new ake($$0));
   }

   @Override
   public void a(akk $$0) {
      Validate.validState(this.h == avh.a.b, "Unexpected key packet", new Object[0]);

      final String $$5;
      try {
         PrivateKey $$1 = this.f.R().getPrivate();
         if (!$$0.a(this.e, $$1)) {
            throw new IllegalStateException("Protocol error");
         }

         SecretKey $$2 = $$0.a($$1);
         Cipher $$3 = bax.a(2, $$2);
         Cipher $$4 = bax.a(1, $$2);
         $$5 = new BigInteger(bax.a("", this.f.R().getPublic(), $$2)).toString(16);
         this.h = avh.a.c;
         this.g.a($$3, $$4);
      } catch (bay var7) {
         throw new IllegalStateException("Protocol error", var7);
      }

      Thread $$8 = new Thread("User Authenticator #" + b.incrementAndGet()) {
         @Override
         public void run() {
            String $$0x = Objects.requireNonNull(avh.this.j, "Player name not initialized");

            try {
               ProfileResult $$1 = avh.this.f.aq().hasJoinedServer($$0x, $$5, this.a());
               if ($$1 != null) {
                  GameProfile $$2 = $$1.profile();
                  avh.c.info("UUID of player {} is {}", $$2.getName(), $$2.getId());
                  avh.this.b($$2);
               } else if (avh.this.f.U()) {
                  avh.c.warn("Failed to verify username but will let them in anyway!");
                  avh.this.b(kf.b($$0x));
               } else {
                  avh.this.a(xo.c("multiplayer.disconnect.unverified_username"));
                  avh.c.error("Username '{}' tried to join with an invalid session", $$0x);
               }
            } catch (AuthenticationUnavailableException var4) {
               if (avh.this.f.U()) {
                  avh.c.warn("Authentication servers are down but will let them in anyway!");
                  avh.this.b(kf.b($$0x));
               } else {
                  avh.this.a(xo.c("multiplayer.disconnect.authservers_down"));
                  avh.c.error("Couldn't verify username because servers are unavailable");
               }
            }
         }

         @Nullable
         private InetAddress a() {
            SocketAddress $$0x = avh.this.g.d();
            return avh.this.f.ab() && $$0x instanceof InetSocketAddress ? ((InetSocketAddress)$$0x).getAddress() : null;
         }
      };
      $$8.setUncaughtExceptionHandler(new s(c));
      $$8.start();
   }

   @Override
   public void a(aki $$0) {
      this.a(avc.c);
   }

   @Override
   public void a(akl $$0) {
      Validate.validState(this.h == avh.a.g, "Unexpected login acknowledgement packet", new Object[0]);
      this.g.a(acf.d);
      aur $$1 = aur.a(Objects.requireNonNull(this.k), this.m);
      avd $$2 = new avd(this.f, this.g, $$1);
      this.g.a(acf.b, $$2);
      $$2.l();
      this.h = avh.a.h;
   }

   @Override
   public void a(p $$0, q $$1) {
      $$1.a("Login phase", () -> this.h.toString());
   }

   @Override
   public void a(aco $$0) {
      this.a(avc.c);
   }

   static enum a {
      a,
      b,
      c,
      d,
      e,
      f,
      g,
      h;
   }
}
