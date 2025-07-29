import com.mojang.authlib.GameProfile;
import com.mojang.authlib.exceptions.AuthenticationException;
import com.mojang.authlib.exceptions.AuthenticationUnavailableException;
import com.mojang.authlib.exceptions.ForcedUsernameChangeException;
import com.mojang.authlib.exceptions.InsufficientPrivilegesException;
import com.mojang.authlib.exceptions.InvalidCredentialsException;
import com.mojang.authlib.exceptions.UserBannedException;
import com.mojang.authlib.minecraft.MinecraftSessionService;
import com.mojang.logging.LogUtils;
import java.math.BigInteger;
import java.security.PublicKey;
import java.time.Duration;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;
import javax.annotation.Nullable;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import net.minecraft.client.ClientBrandRetriever;
import org.slf4j.Logger;

public class grj implements ajz {
   private static final Logger a = LogUtils.getLogger();
   private final fue b;
   @Nullable
   private final grz c;
   @Nullable
   private final get d;
   private final Consumer<xo> e;
   private final wd f;
   private final boolean g;
   @Nullable
   private final Duration h;
   @Nullable
   private String i;
   private final Map<ame, byte[]> j;
   private final boolean k;
   private final AtomicReference<grj.a> l = new AtomicReference<>(grj.a.a);

   public grj(wd $$0, fue $$1, @Nullable grz $$2, @Nullable get $$3, boolean $$4, @Nullable Duration $$5, Consumer<xo> $$6, @Nullable gsd $$7) {
      this.f = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
      this.e = $$6;
      this.g = $$4;
      this.h = $$5;
      this.j = $$7 != null ? new HashMap<>($$7.a()) : new HashMap<>();
      this.k = $$7 != null;
   }

   private void a(grj.a $$0) {
      grj.a $$1 = this.l.updateAndGet($$1x -> {
         if (!$$0.f.contains($$1x)) {
            throw new IllegalStateException("Tried to switch to " + $$0 + " from " + $$1x + ", but expected one of " + $$0.f);
         } else {
            return $$0;
         }
      });
      this.e.accept($$1.e);
   }

   @Override
   public void a(akb $$0) {
      this.a(grj.a.b);

      Cipher $$4;
      Cipher $$5;
      String $$3;
      akk $$7;
      try {
         SecretKey $$1 = bax.a();
         PublicKey $$2 = $$0.e();
         $$3 = new BigInteger(bax.a($$0.b(), $$2, $$1)).toString(16);
         $$4 = bax.a(2, $$1);
         $$5 = bax.a(1, $$1);
         byte[] $$6 = $$0.f();
         $$7 = new akk($$1, $$2, $$6);
      } catch (Exception var9) {
         throw new IllegalStateException("Protocol error", var9);
      }

      if ($$0.g()) {
         ag.i().execute(() -> {
            xo $$4x = this.b($$3);
            if ($$4x != null) {
               if (this.c == null || !this.c.d()) {
                  this.f.a($$4x);
                  return;
               }

               a.warn($$4x.getString());
            }

            this.a($$7, $$4, $$5);
         });
      } else {
         this.a($$7, $$4, $$5);
      }
   }

   private void a(akk $$0, Cipher $$1, Cipher $$2) {
      this.a(grj.a.c);
      this.f.a($$0, wt.a(() -> this.f.a($$1, $$2)));
   }

   @Nullable
   private xo b(String $$0) {
      try {
         this.a().joinServer(this.b.Y().b(), this.b.Y().d(), $$0);
         return null;
      } catch (AuthenticationUnavailableException var3) {
         return xo.a("disconnect.loginFailedInfo", xo.c("disconnect.loginFailedInfo.serversUnavailable"));
      } catch (InvalidCredentialsException var4) {
         return xo.a("disconnect.loginFailedInfo", xo.c("disconnect.loginFailedInfo.invalidSession"));
      } catch (InsufficientPrivilegesException var5) {
         return xo.a("disconnect.loginFailedInfo", xo.c("disconnect.loginFailedInfo.insufficientPrivileges"));
      } catch (ForcedUsernameChangeException | UserBannedException var6) {
         return xo.a("disconnect.loginFailedInfo", xo.c("disconnect.loginFailedInfo.userBanned"));
      } catch (AuthenticationException var7) {
         return xo.a("disconnect.loginFailedInfo", var7.getMessage());
      }
   }

   private MinecraftSessionService a() {
      return this.b.an();
   }

   @Override
   public void a(ake $$0) {
      this.a(grj.a.d);
      GameProfile $$1 = $$0.b();
      this.f
         .a(
            acf.d,
            new gri(this.b, this.f, new grp($$1, this.b.u().a(this.g, this.h, this.i), grn.a().a(), cyf.h, null, this.c, this.d, this.j, null, Map.of(), amw.a))
         );
      this.f.a(akl.a);
      this.f.a(acf.b);
      this.f.a(new aaw(new abc(ClientBrandRetriever.getClientModName())));
      this.f.a(new aau(this.b.n.aD()));
   }

   @Override
   public void a(wf $$0) {
      xo $$1 = this.k ? xn.r : xn.s;
      if (this.c != null && this.c.e()) {
         this.b.a(new gea(this.d, $$1, $$0.a(), xn.k));
      } else {
         this.b.a(new gea(this.d, $$1, $$0));
      }
   }

   @Override
   public boolean c() {
      return this.f.i();
   }

   @Override
   public void a(akd $$0) {
      this.f.a($$0.b());
   }

   @Override
   public void a(akc $$0) {
      if (!this.f.e()) {
         this.f.a($$0.b(), false);
      }
   }

   @Override
   public void a(aka $$0) {
      this.e.accept(xo.c("connect.negotiating"));
      this.f.a(new aki($$0.b(), null));
   }

   public void a(@Nullable String $$0) {
      this.i = $$0;
   }

   @Override
   public void a(acl $$0) {
      this.f.a(new aco($$0.b(), this.j.get($$0.b())));
   }

   @Override
   public void a(p $$0, q $$1) {
      $$1.a("Server type", () -> this.c != null ? this.c.f().toString() : "<unknown>");
      $$1.a("Login phase", () -> this.l.get().toString());
      $$1.a("Is Local", () -> String.valueOf(this.f.e()));
   }

   static enum a {
      a(xo.c("connect.connecting"), Set.of()),
      b(xo.c("connect.authorizing"), Set.of(a)),
      c(xo.c("connect.encrypting"), Set.of(b)),
      d(xo.c("connect.joining"), Set.of(c, a));

      final xo e;
      final Set<grj.a> f;

      private a(final xo $$0, final Set<grj.a> $$1) {
         this.e = $$0;
         this.f = $$1;
      }
   }
}
