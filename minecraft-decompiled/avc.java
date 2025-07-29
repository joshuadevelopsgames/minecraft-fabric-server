import com.mojang.authlib.GameProfile;
import com.mojang.logging.LogUtils;
import io.netty.channel.ChannelFutureListener;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;
import org.slf4j.Logger;

public abstract class avc implements aat {
   private static final Logger f = LogUtils.getLogger();
   public static final int b = 15000;
   private static final int g = 15000;
   private static final xo h = xo.c("disconnect.timeout");
   static final xo c = xo.c("multiplayer.disconnect.unexpected_query_response");
   protected final MinecraftServer d;
   protected final wd e;
   private final boolean i;
   private long j;
   private boolean k;
   private long l;
   private long m;
   private boolean n = false;
   private int o;
   private volatile boolean p = false;

   public avc(MinecraftServer $$0, wd $$1, aur $$2) {
      this.d = $$0;
      this.e = $$1;
      this.j = ag.c();
      this.o = $$2.b();
      this.i = $$2.d();
   }

   private void l() {
      if (!this.n) {
         this.m = ag.c();
         this.n = true;
      }
   }

   @Override
   public void a(wf $$0) {
      if (this.h()) {
         f.info("Stopping singleplayer server as player logged out");
         this.d.a(false);
      }
   }

   @Override
   public void a(zw $$0, Exception $$1) throws aa {
      aat.super.a($$0, $$1);
      this.d.a($$1, $$0.a());
   }

   @Override
   public void a(aax $$0) {
      if (this.k && $$0.b() == this.l) {
         int $$1 = (int)(ag.c() - this.j);
         this.o = (this.o * 3 + $$1) / 4;
         this.k = false;
      } else if (!this.h()) {
         this.a(h);
      }
   }

   @Override
   public void a(aay $$0) {
   }

   @Override
   public void a(aaw $$0) {
   }

   @Override
   public void a(aav $$0) {
      zz.a($$0, this, this.d);
      this.d.a($$0.b(), $$0.e());
   }

   @Override
   public void a(aaz $$0) {
      zz.a($$0, this, this.d);
      if ($$0.e() == aaz.a.b && this.d.Z()) {
         f.info("Disconnecting {} due to resource pack {} rejection", this.i().getName(), $$0.b());
         this.a(xo.c("multiplayer.requiredTexturePrompt.disconnect"));
      }
   }

   @Override
   public void a(aco $$0) {
      this.a(c);
   }

   protected void e() {
      bts.a().a("keepAlive");
      long $$0 = ag.c();
      if (!this.h() && $$0 - this.j >= 15000L) {
         if (this.k) {
            this.a(h);
         } else if (this.a($$0)) {
            this.k = true;
            this.j = $$0;
            this.l = $$0;
            this.b(new aaj(this.l));
         }
      }

      bts.a().c();
   }

   private boolean a(long $$0) {
      if (this.n) {
         if ($$0 - this.m >= 15000L) {
            this.a(h);
         }

         return false;
      } else {
         return true;
      }
   }

   public void f() {
      this.p = true;
   }

   public void g() {
      this.p = false;
      this.e.a();
   }

   public void b(zw<?> $$0) {
      this.a($$0, null);
   }

   public void a(zw<?> $$0, @Nullable ChannelFutureListener $$1) {
      if ($$0.d()) {
         this.l();
      }

      boolean $$2 = !this.p || !this.d.bx();

      try {
         this.e.a($$0, $$1, $$2);
      } catch (Throwable var7) {
         p $$4 = p.a(var7, "Sending packet");
         q $$5 = $$4.a("Packet being sent");
         $$5.a("Packet class", () -> $$0.getClass().getCanonicalName());
         throw new aa($$4);
      }
   }

   public void a(xo $$0) {
      this.b(new wf($$0));
   }

   public void b(wf $$0) {
      this.e.a(new aai($$0.a()), wt.a(() -> this.e.a($$0)));
      this.e.m();
      this.d.h(this.e::n);
   }

   protected boolean h() {
      return this.d.a(this.i());
   }

   protected abstract GameProfile i();

   @bdl
   public GameProfile j() {
      return this.i();
   }

   public int k() {
      return this.o;
   }

   protected aur a(atl $$0) {
      return new aur(this.i(), this.o, $$0, this.i);
   }
}
