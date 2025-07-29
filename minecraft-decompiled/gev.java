import com.mojang.authlib.minecraft.BanDetails;
import com.mojang.logging.LogUtils;
import java.io.IOException;
import java.util.Objects;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;
import org.slf4j.Logger;

public class gev extends get {
   private static final Logger a = LogUtils.getLogger();
   private static final xo b = xo.c("narrator.screen.title");
   private static final xo c = xo.c("title.credits");
   private static final String d = "Demo_World";
   @Nullable
   private fyu e;
   @Nullable
   private frp f;
   private boolean u;
   private long v;
   private final fyg w;

   public gev() {
      this(false);
   }

   public gev(boolean $$0) {
      this($$0, null);
   }

   public gev(boolean $$0, @Nullable fyg $$1) {
      super(b);
      this.u = $$0;
      this.w = Objects.requireNonNullElseGet($$1, () -> new fyg(false));
   }

   private boolean l() {
      return this.f != null;
   }

   @Override
   public void e() {
      if (this.l()) {
         this.f.e();
      }
   }

   public static void a(hru $$0) {
      $$0.a(fyg.a);
      $$0.a(fyg.c);
      $$0.a(gxq.a);
   }

   @Override
   public boolean aQ_() {
      return false;
   }

   @Override
   public boolean aG_() {
      return false;
   }

   @Override
   protected void aV_() {
      if (this.e == null) {
         this.e = this.n.aM().a();
      }

      int $$0 = this.q.a(c);
      int $$1 = this.o - $$0 - 2;
      int $$2 = 24;
      int $$3 = this.p / 4 + 48;
      if (this.n.L()) {
         $$3 = this.c($$3, 24);
      } else {
         $$3 = this.b($$3, 24);
      }

      $$3 = this.a($$3, 24);
      fyv $$4 = this.c(fxs.a(20, $$0x -> this.n.a(new gim(this, this.n.n, this.n.ai())), true));
      int var10001 = this.o / 2 - 124;
      $$3 += 36;
      $$4.c(var10001, $$3);
      this.c(fxo.a(xo.c("menu.options"), $$0x -> this.n.a(new gip(this, this.n.n))).a(this.o / 2 - 100, $$3, 98, 20).a());
      this.c(fxo.a(xo.c("menu.quit"), $$0x -> this.n.q()).a(this.o / 2 + 2, $$3, 98, 20).a());
      fyv $$5 = this.c(fxs.b(20, $$0x -> this.n.a(new gij(this, this.n.n)), true));
      $$5.c(this.o / 2 + 104, $$3);
      this.c(new fyn($$1, this.p - 10, $$0, 10, c, $$0x -> this.n.a(new gdv(this)), this.q));
      if (this.f == null) {
         this.f = new frp();
      }

      if (this.l()) {
         this.f.b(this.n, this.o, this.p);
      }
   }

   private int a(int $$0, int $$1) {
      if (ac.aZ) {
         this.c(fxo.a(xo.b("Create Test World"), $$0x -> gkl.b(this.n, this)).a(this.o / 2 - 100, $$0 += $$1, 200, 20).a());
      }

      return $$0;
   }

   private int b(int $$0, int $$1) {
      this.c(fxo.a(xo.c("menu.singleplayer"), $$0x -> this.n.a(new gkt(this))).a(this.o / 2 - 100, $$0, 200, 20).a());
      xo $$2 = this.m();
      boolean $$3 = $$2 == null;
      fzb $$4 = $$2 != null ? fzb.a($$2) : null;
      int var6;
      this.c(fxo.a(xo.c("menu.multiplayer"), $$0x -> {
         get $$1x = (get)(this.n.n.u ? new gid(this) : new gie(this));
         this.n.a($$1x);
      }).a(this.o / 2 - 100, var6 = $$0 + $$1, 200, 20).a($$4).a()).j = $$3;
      this.c(fxo.a(xo.c("menu.online"), $$0x -> this.n.a(new fol(this))).a(this.o / 2 - 100, $$0 = var6 + $$1, 200, 20).a($$4).a()).j = $$3;
      return $$0;
   }

   @Nullable
   private xo m() {
      if (this.n.G()) {
         return null;
      } else if (this.n.J()) {
         return xo.c("title.multiplayer.disabled.banned.name");
      } else {
         BanDetails $$0 = this.n.I();
         if ($$0 != null) {
            return $$0.expires() != null ? xo.c("title.multiplayer.disabled.banned.temporary") : xo.c("title.multiplayer.disabled.banned.permanent");
         } else {
            return xo.c("title.multiplayer.disabled");
         }
      }
   }

   private int c(int $$0, int $$1) {
      boolean $$2 = this.n();
      this.c(fxo.a(xo.c("menu.playdemo"), $$1x -> {
         if ($$2) {
            this.n.x().a("Demo_World", () -> this.n.a(this));
         } else {
            this.n.x().a("Demo_World", MinecraftServer.d, eky.b, euo::a, this);
         }
      }).a(this.o / 2 - 100, $$0, 200, 20).a());
      int var5;
      fxo $$3 = this.c(
         fxo.a(
               xo.c("menu.resetdemo"),
               $$0x -> {
                  fcs $$1x = this.n.m();

                  try (fcs.c $$2x = $$1x.e("Demo_World")) {
                     if ($$2x.m()) {
                        this.n
                           .a(
                              new gdr(
                                 this::c,
                                 xo.c("selectWorld.deleteQuestion"),
                                 xo.a("selectWorld.deleteWarning", MinecraftServer.d.a()),
                                 xo.c("selectWorld.deleteButton"),
                                 xn.e
                              )
                           );
                     }
                  } catch (IOException var8) {
                     gab.a(this.n, "Demo_World");
                     a.warn("Failed to access demo world", var8);
                  }
               }
            )
            .a(this.o / 2 - 100, var5 = $$0 + $$1, 200, 20)
            .a()
      );
      $$3.j = $$2;
      return var5;
   }

   private boolean n() {
      try {
         boolean var2;
         try (fcs.c $$0 = this.n.m().e("Demo_World")) {
            var2 = $$0.m();
         }

         return var2;
      } catch (IOException var6) {
         gab.a(this.n, "Demo_World");
         a.warn("Failed to read demo world data", var6);
         return false;
      }
   }

   @Override
   public void a(fxb $$0, int $$1, int $$2, float $$3) {
      if (this.v == 0L && this.u) {
         this.v = ag.c();
      }

      float $$4 = 1.0F;
      if (this.u) {
         float $$5 = (float)(ag.c() - this.v) / 2000.0F;
         if ($$5 > 1.0F) {
            this.u = false;
         } else {
            $$5 = bcb.a($$5, 0.0F, 1.0F);
            $$4 = bcb.b($$5, 0.5F, 1.0F, 0.0F, 1.0F);
         }

         this.a($$4);
      }

      this.a($$0, $$3);
      super.a($$0, $$1, $$2, $$3);
      this.w.a($$0, this.o, this.w.a() ? 1.0F : $$4);
      if (this.e != null && !this.n.n.c().c()) {
         this.e.a($$0, this.o, this.q, $$4);
      }

      String $$6 = "Minecraft " + ac.b().c();
      if (this.n.L()) {
         $$6 = $$6 + " Demo";
      } else {
         $$6 = $$6 + ("release".equalsIgnoreCase(this.n.j()) ? "" : "/" + this.n.j());
      }

      if (fue.e().a()) {
         $$6 = $$6 + htb.a("menu.modded");
      }

      $$0.b(this.q, $$6, 2, this.p - 10, baj.a($$4, -1));
      if (this.l() && $$4 >= 1.0F) {
         this.f.a($$0, $$1, $$2, $$3);
      }
   }

   @Override
   public void b(fxb $$0, int $$1, int $$2, float $$3) {
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2) {
      return super.a($$0, $$1, $$2) ? true : this.l() && this.f.a($$0, $$1, $$2);
   }

   @Override
   public void aI_() {
      if (this.f != null) {
         this.f.aI_();
      }
   }

   @Override
   public void aJ_() {
      super.aJ_();
      if (this.f != null) {
         this.f.aJ_();
      }
   }

   private void c(boolean $$0) {
      if ($$0) {
         try (fcs.c $$1 = this.n.m().e("Demo_World")) {
            $$1.k();
         } catch (IOException var7) {
            gab.b(this.n, "Demo_World");
            a.warn("Failed to delete demo world", var7);
         }
      }

      this.n.a(this);
   }
}
